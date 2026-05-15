package F2;

import A2.x0;
import E4.F;
import E4.I;
import E4.b0;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f2177a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f2178b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f2179c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (w2.t.f18881a < 26 && w2.t.f18882b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f2225a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new v(0, new u(1)));
        }
        int i7 = w2.t.f18881a;
        if (i7 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f2225a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new v(0, new u(2)));
            }
        }
        if (i7 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f2225a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    public static String b(C1487p c1487p) {
        Pair pairD;
        if ("audio/eac3-joc".equals(c1487p.f16701m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c1487p.f16701m) || (pairD = d(c1487p)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0249, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x024e, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x025b, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0269, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0277, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0284, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0291, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x029e, code lost:
    
        r36 = 131072;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a8 A[PHI: r36
  0x02a8: PHI (r36v7 int) = (r36v1 int), (r36v2 int), (r36v3 int), (r36v4 int), (r36v5 int), (r36v6 int), (r36v8 int) binds: [B:187:0x02a6, B:183:0x0299, B:179:0x028c, B:175:0x027f, B:171:0x0271, B:167:0x0263, B:163:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x039d A[PHI: r2
  0x039d: PHI (r2v110 int) = (r2v109 int), (r2v112 int), (r2v113 int), (r2v114 int), (r2v115 int) binds: [B:258:0x0375, B:261:0x037b, B:263:0x037f, B:265:0x0383, B:267:0x0387] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03a3 A[Catch: NumberFormatException -> 0x03b1, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x03b1, blocks: (B:255:0x0359, B:257:0x036d, B:268:0x0389, B:279:0x03a3), top: B:572:0x0359 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(t2.C1487p r37) {
        /*
            Method dump skipped, instruction units count: 2444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.A.d(t2.p):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z6, boolean z7) {
        y x0Var;
        try {
            w wVar = new w(str, z6, z7);
            HashMap map = f2178b;
            List list = (List) map.get(wVar);
            if (list != null) {
                return list;
            }
            int i7 = w2.t.f18881a;
            if (i7 >= 21) {
                C1.k kVar = new C1.k();
                kVar.f959o = (z6 || z7) ? 1 : 0;
                x0Var = kVar;
            } else {
                x0Var = new x0(9);
            }
            ArrayList arrayListF = f(wVar, x0Var);
            if (z6 && arrayListF.isEmpty() && 21 <= i7 && i7 <= 23) {
                arrayListF = f(wVar, new x0(9));
                if (!arrayListF.isEmpty()) {
                    AbstractC1697a.w("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) arrayListF.get(0)).f2225a);
                }
            }
            a(str, arrayListF);
            I iP = I.p(arrayListF);
            map.put(wVar, iP);
            return iP;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList f(w wVar, y yVar) throws x {
        String strC;
        String str;
        String str2;
        y yVar2 = yVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = wVar.f2308a;
            int iR = yVar2.r();
            boolean zI = yVar2.I();
            int i7 = 0;
            while (i7 < iR) {
                MediaCodecInfo mediaCodecInfoD = yVar2.d(i7);
                int i8 = w2.t.f18881a;
                if (i8 < 29 || !mediaCodecInfoD.isAlias()) {
                    String name = mediaCodecInfoD.getName();
                    if (h(mediaCodecInfoD, name, zI, str3) && (strC = c(mediaCodecInfoD, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoD.getCapabilitiesForType(strC);
                            boolean zA = yVar2.A("tunneled-playback", strC, capabilitiesForType);
                            boolean zQ = yVar2.q("tunneled-playback", capabilitiesForType);
                            boolean z6 = wVar.f2310c;
                            if ((z6 || !zQ) && (!z6 || zA)) {
                                boolean zA2 = yVar2.A("secure-playback", strC, capabilitiesForType);
                                boolean zQ2 = yVar2.q("secure-playback", capabilitiesForType);
                                boolean z7 = wVar.f2309b;
                                if ((z7 || !zQ2) && (!z7 || zA2)) {
                                    boolean zIsHardwareAccelerated = i8 >= 29 ? mediaCodecInfoD.isHardwareAccelerated() : !i(mediaCodecInfoD, str3);
                                    i(mediaCodecInfoD, str3);
                                    if (i8 >= 29) {
                                        mediaCodecInfoD.isVendor();
                                    } else {
                                        String strV = I0.c.V(mediaCodecInfoD.getName());
                                        if (!strV.startsWith("omx.google.") && !strV.startsWith("c2.android.")) {
                                            strV.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zI && z7 == zA2) && (zI || z7)) {
                                        str2 = name;
                                        boolean z8 = zIsHardwareAccelerated;
                                        if (!zI && zA2) {
                                            str = strC;
                                            try {
                                                arrayList.add(m.h(str2 + ".secure", str3, str, capabilitiesForType, z8, true));
                                                break;
                                            } catch (Exception e7) {
                                                e = e7;
                                                if (w2.t.f18881a <= 23 || arrayList.isEmpty()) {
                                                    AbstractC1697a.m("Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                AbstractC1697a.m("Skipping codec " + str2 + " (failed to query capabilities)");
                                                i7++;
                                                yVar2 = yVar;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        try {
                                            str2 = name;
                                            try {
                                                arrayList.add(m.h(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false));
                                            } catch (Exception e8) {
                                                e = e8;
                                                str = str;
                                                if (w2.t.f18881a <= 23) {
                                                }
                                                AbstractC1697a.m("Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        } catch (Exception e9) {
                                            e = e9;
                                            str2 = name;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str = strC;
                            str2 = name;
                        }
                    }
                }
                i7++;
                yVar2 = yVar;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new x("Failed to query underlying media codecs", e11);
        }
    }

    public static b0 g(u uVar, C1487p c1487p, boolean z6, boolean z7) {
        List listE;
        String str = c1487p.f16701m;
        uVar.getClass();
        List listE2 = e(str, z6, z7);
        String strB = b(c1487p);
        if (strB == null) {
            listE = b0.f1913s;
        } else {
            uVar.getClass();
            listE = e(strB, z6, z7);
        }
        F fO = I.o();
        fO.c(listE2);
        fO.c(listE);
        return fO.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z6, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z6 && str.endsWith(".secure")) {
            return false;
        }
        int i7 = w2.t.f18881a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(w2.t.f18883c))) {
            String str3 = w2.t.f18882b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i7 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(w2.t.f18883c)) {
            String str4 = w2.t.f18882b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i7 == 19 && w2.t.f18882b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (w2.t.f18881a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (M.f(str)) {
            return true;
        }
        String strV = I0.c.V(mediaCodecInfo.getName());
        if (strV.startsWith("arc.")) {
            return false;
        }
        if (strV.startsWith("omx.google.") || strV.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strV.startsWith("omx.sec.") && strV.contains(".sw.")) || strV.equals("omx.qcom.video.decoder.hevcswvdec") || strV.startsWith("c2.android.") || strV.startsWith("c2.google.")) {
            return true;
        }
        return (strV.startsWith("omx.") || strV.startsWith("c2.")) ? false : true;
    }

    public static int j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        if (f2179c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            m mVar = listE.isEmpty() ? null : (m) listE.get(0);
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2228d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i8 = codecProfileLevelArr[iMax].level;
                    if (i8 != 1 && i8 != 2) {
                        switch (i8) {
                            case 8:
                            case 16:
                            case 32:
                                i7 = 101376;
                                break;
                            case 64:
                                i7 = 202752;
                                break;
                            case 128:
                            case 256:
                                i7 = 414720;
                                break;
                            case 512:
                                i7 = 921600;
                                break;
                            case 1024:
                                i7 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i7 = 2097152;
                                break;
                            case 8192:
                                i7 = 2228224;
                                break;
                            case 16384:
                                i7 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i7 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i7 = 35651584;
                                break;
                            default:
                                i7 = -1;
                                break;
                        }
                    } else {
                        i7 = 25344;
                    }
                    iMax2 = Math.max(i7, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, w2.t.f18881a >= 21 ? 345600 : 172800);
            }
            f2179c = iMax;
        }
        return f2179c;
    }
}
