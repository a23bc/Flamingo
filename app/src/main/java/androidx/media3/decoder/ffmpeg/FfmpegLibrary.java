package androidx.media3.decoder.ffmpeg;

import java.util.Arrays;
import t2.H;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class FfmpegLibrary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f9783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f9784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f9785c;

    static {
        H.a("media3.decoder.ffmpeg");
        e eVar = new e();
        eVar.f9825a = new String[]{"ffmpegJNI"};
        f9783a = eVar;
        f9785c = -1;
    }

    public static String a(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return "eac3";
            case "video/hevc":
                return "hevc";
            case "audio/amr-wb":
                return "amrwb";
            case "audio/vnd.dts":
            case "audio/vnd.dts.hd":
                return "dca";
            case "audio/vorbis":
                return "vorbis";
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/mpeg":
                return "mp3";
            case "audio/mp4a-latm":
                return "aac";
            case "audio/ac3":
                return "ac3";
            case "video/avc":
                return "h264";
            case "audio/3gpp":
                return "amrnb";
            case "audio/alac":
                return "alac";
            case "audio/flac":
                return "flac";
            case "audio/opus":
                return "opus";
            case "audio/true-hd":
                return "truehd";
            case "audio/g711-alaw":
                return "pcm_alaw";
            case "audio/g711-mlaw":
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static int b() {
        if (!d()) {
            return -1;
        }
        if (f9785c == -1) {
            f9785c = ffmpegGetInputBufferPaddingSize();
        }
        return f9785c;
    }

    public static String c() {
        if (!d()) {
            return null;
        }
        if (f9784b == null) {
            f9784b = ffmpegGetVersion();
        }
        return f9784b;
    }

    public static boolean d() {
        e eVar = f9783a;
        synchronized (eVar) {
            if (eVar.f9826b) {
                return eVar.f9827c;
            }
            eVar.f9826b = true;
            try {
                for (String str : eVar.f9825a) {
                    System.loadLibrary(str);
                }
                eVar.f9827c = true;
            } catch (UnsatisfiedLinkError unused) {
                AbstractC1697a.w("Failed to load " + Arrays.toString(eVar.f9825a));
            }
            return eVar.f9827c;
        }
    }

    public static boolean e(String str) {
        String strA;
        if (!d() || (strA = a(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(strA)) {
            return true;
        }
        AbstractC1697a.w("No " + strA + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
