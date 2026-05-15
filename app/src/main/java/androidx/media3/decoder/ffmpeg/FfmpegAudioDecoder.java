package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import t2.C1487p;
import w2.AbstractC1697a;
import w2.m;
import w2.t;
import z2.f;
import z2.g;
import z2.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FfmpegAudioDecoder extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f9776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile int f9781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile int f9782v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FfmpegAudioDecoder(int i7, C1487p c1487p, boolean z6) throws d {
        List list;
        byte[] bArr;
        byte[] bArrArray;
        super(new f[16], new SimpleDecoderOutputBuffer[16]);
        if (!FfmpegLibrary.d()) {
            throw new d("Failed to load decoder native libraries.");
        }
        c1487p.f16701m.getClass();
        String str = c1487p.f16701m;
        String strA = FfmpegLibrary.a(str);
        strA.getClass();
        this.f9775o = strA;
        list = c1487p.f16704p;
        switch (str) {
            case "audio/vorbis":
                byte[] bArr2 = (byte[]) list.get(0);
                byte[] bArr3 = (byte[]) list.get(1);
                byte[] bArr4 = new byte[bArr2.length + bArr3.length + 6];
                bArr4[0] = (byte) (bArr2.length >> 8);
                bArr4[1] = (byte) (bArr2.length & 255);
                System.arraycopy(bArr2, 0, bArr4, 2, bArr2.length);
                bArr4[bArr2.length + 2] = 0;
                bArr4[bArr2.length + 3] = 0;
                bArr4[bArr2.length + 4] = (byte) (bArr3.length >> 8);
                bArr4[bArr2.length + 5] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr4, bArr2.length + 6, bArr3.length);
                bArr = bArr4;
                break;
            case "audio/mp4a-latm":
            case "audio/opus":
                bArrArray = (byte[]) list.get(0);
                bArr = bArrArray;
                break;
            case "audio/alac":
                byte[] bArr5 = (byte[]) list.get(0);
                int length = bArr5.length + 12;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
                byteBufferAllocate.putInt(length);
                byteBufferAllocate.putInt(1634492771);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.put(bArr5, 0, bArr5.length);
                bArrArray = byteBufferAllocate.array();
                bArr = bArrArray;
                break;
            default:
                bArrArray = null;
                bArr = bArrArray;
                break;
        }
        this.f9776p = bArr;
        this.f9777q = z6 ? 4 : 2;
        this.f9778r = z6 ? 131070 : 65535;
        long jFfmpegInitialize = ffmpegInitialize(strA, bArr, z6, c1487p.f16681B, c1487p.f16680A);
        this.f9779s = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new d("Initialization failed.");
        }
        int i8 = this.f21131g;
        f[] fVarArr = this.f21129e;
        AbstractC1697a.i(i8 == fVarArr.length);
        for (f fVar : fVarArr) {
            fVar.h(i7);
        }
    }

    private native int ffmpegDecode(long j3, ByteBuffer byteBuffer, int i7, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i8);

    private native int ffmpegGetChannelCount(long j3);

    private native int ffmpegGetSampleRate(long j3);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z6, int i7, int i8);

    private native void ffmpegRelease(long j3);

    private native long ffmpegReset(long j3, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i7) {
        this.f9778r = i7;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f9774u;
        byteBuffer.getClass();
        AbstractC1697a.d(i7 >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i7);
        simpleDecoderOutputBuffer.f9774u = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // z2.i, z2.c
    public final void a() {
        super.a();
        ffmpegRelease(this.f9779s);
        this.f9779s = 0L;
    }

    @Override // z2.i
    public final f g() {
        return new f(2, FfmpegLibrary.b());
    }

    @Override // z2.i
    public final g h() {
        return new SimpleDecoderOutputBuffer(new b(this));
    }

    @Override // z2.i
    public final z2.d i(Throwable th) {
        return new d("Unexpected decode error", th);
    }

    @Override // z2.i
    public final z2.d j(f fVar, g gVar, boolean z6) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) gVar;
        if (z6) {
            long jFfmpegReset = ffmpegReset(this.f9779s, this.f9776p);
            this.f9779s = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new d("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = fVar.f21115s;
        int i7 = t.f18881a;
        int iLimit = byteBuffer.limit();
        long j3 = fVar.f21117u;
        int i8 = this.f9778r;
        simpleDecoderOutputBuffer.f21121q = j3;
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f9774u;
        if (byteBuffer2 == null || byteBuffer2.capacity() < i8) {
            simpleDecoderOutputBuffer.f9774u = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
        }
        simpleDecoderOutputBuffer.f9774u.position(0);
        simpleDecoderOutputBuffer.f9774u.limit(i8);
        int iFfmpegDecode = ffmpegDecode(this.f9779s, byteBuffer, iLimit, simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.f9774u, this.f9778r);
        if (iFfmpegDecode == -2) {
            return new d("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleDecoderOutputBuffer.f21123s = true;
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.f21123s = true;
            return null;
        }
        if (!this.f9780t) {
            this.f9781u = ffmpegGetChannelCount(this.f9779s);
            this.f9782v = ffmpegGetSampleRate(this.f9779s);
            if (this.f9782v == 0 && "alac".equals(this.f9775o)) {
                this.f9776p.getClass();
                m mVar = new m(this.f9776p);
                mVar.G(this.f9776p.length - 4);
                this.f9782v = mVar.y();
            }
            this.f9780t = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.f9774u;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(iFfmpegDecode);
        return null;
    }

    public final String p() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.f9775o;
    }
}
