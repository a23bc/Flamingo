package H2;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import z2.C2081b;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K2.e f3078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f3080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S f3081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S f3082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public S f3083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3084g;

    public T(K2.e eVar) {
        this.f3078a = eVar;
        int i7 = eVar.f3996b;
        this.f3079b = i7;
        this.f3080c = new w2.m(32);
        S s7 = new S(0L, i7);
        this.f3081d = s7;
        this.f3082e = s7;
        this.f3083f = s7;
    }

    public static S c(S s7, long j3, ByteBuffer byteBuffer, int i7) {
        while (j3 >= s7.f3075p) {
            s7 = (S) s7.f3077r;
        }
        while (i7 > 0) {
            int iMin = Math.min(i7, (int) (s7.f3075p - j3));
            K2.a aVar = (K2.a) s7.f3076q;
            byteBuffer.put(aVar.f3986a, ((int) (j3 - s7.f3074o)) + aVar.f3987b, iMin);
            i7 -= iMin;
            j3 += (long) iMin;
            if (j3 == s7.f3075p) {
                s7 = (S) s7.f3077r;
            }
        }
        return s7;
    }

    public static S d(S s7, long j3, byte[] bArr, int i7) {
        while (j3 >= s7.f3075p) {
            s7 = (S) s7.f3077r;
        }
        int i8 = i7;
        while (i8 > 0) {
            int iMin = Math.min(i8, (int) (s7.f3075p - j3));
            K2.a aVar = (K2.a) s7.f3076q;
            System.arraycopy(aVar.f3986a, ((int) (j3 - s7.f3074o)) + aVar.f3987b, bArr, i7 - i8, iMin);
            i8 -= iMin;
            j3 += (long) iMin;
            if (j3 == s7.f3075p) {
                s7 = (S) s7.f3077r;
            }
        }
        return s7;
    }

    public static S e(S s7, z2.f fVar, E2.g gVar, w2.m mVar) {
        int iA;
        if (fVar.c(1073741824)) {
            long j3 = gVar.f1831b;
            mVar.D(1);
            S sD = d(s7, j3, mVar.f18867a, 1);
            long j7 = j3 + 1;
            byte b7 = mVar.f18867a[0];
            boolean z6 = (b7 & 128) != 0;
            int i7 = b7 & 127;
            C2081b c2081b = fVar.f21114r;
            byte[] bArr = c2081b.f21104a;
            if (bArr == null) {
                c2081b.f21104a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            s7 = d(sD, j7, c2081b.f21104a, i7);
            long j8 = j7 + ((long) i7);
            if (z6) {
                mVar.D(2);
                s7 = d(s7, j8, mVar.f18867a, 2);
                j8 += 2;
                iA = mVar.A();
            } else {
                iA = 1;
            }
            int[] iArr = c2081b.f21107d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = c2081b.f21108e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z6) {
                int i8 = iA * 6;
                mVar.D(i8);
                s7 = d(s7, j8, mVar.f18867a, i8);
                j8 += (long) i8;
                mVar.G(0);
                for (int i9 = 0; i9 < iA; i9++) {
                    iArr[i9] = mVar.A();
                    iArr2[i9] = mVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f1830a - ((int) (j8 - gVar.f1831b));
            }
            N2.G g6 = (N2.G) gVar.f1832c;
            int i10 = w2.t.f18881a;
            byte[] bArr2 = g6.f4976b;
            byte[] bArr3 = c2081b.f21104a;
            c2081b.f21109f = iA;
            c2081b.f21107d = iArr;
            c2081b.f21108e = iArr2;
            c2081b.f21105b = bArr2;
            c2081b.f21104a = bArr3;
            int i11 = g6.f4975a;
            c2081b.f21106c = i11;
            int i12 = g6.f4977c;
            c2081b.f21110g = i12;
            int i13 = g6.f4978d;
            c2081b.h = i13;
            MediaCodec.CryptoInfo cryptoInfo = c2081b.f21111i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i11;
            if (w2.t.f18881a >= 24) {
                V1.a aVar = c2081b.f21112j;
                aVar.getClass();
                ((MediaCodec.CryptoInfo.Pattern) aVar.f7390p).set(i12, i13);
                ((MediaCodec.CryptoInfo) aVar.f7389o).setPattern((MediaCodec.CryptoInfo.Pattern) aVar.f7390p);
            }
            long j9 = gVar.f1831b;
            int i14 = (int) (j8 - j9);
            gVar.f1831b = j9 + ((long) i14);
            gVar.f1830a -= i14;
        }
        if (!fVar.c(268435456)) {
            fVar.h(gVar.f1830a);
            return c(s7, gVar.f1831b, fVar.f21115s, gVar.f1830a);
        }
        mVar.D(4);
        S sD2 = d(s7, gVar.f1831b, mVar.f18867a, 4);
        int iY = mVar.y();
        gVar.f1831b += 4;
        gVar.f1830a -= 4;
        fVar.h(iY);
        S sC = c(sD2, gVar.f1831b, fVar.f21115s, iY);
        gVar.f1831b += (long) iY;
        int i15 = gVar.f1830a - iY;
        gVar.f1830a = i15;
        ByteBuffer byteBuffer = fVar.f21118v;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            fVar.f21118v = ByteBuffer.allocate(i15);
        } else {
            fVar.f21118v.clear();
        }
        return c(sC, gVar.f1831b, fVar.f21118v, gVar.f1830a);
    }

    public final void a(long j3) {
        S s7;
        if (j3 == -1) {
            return;
        }
        while (true) {
            s7 = this.f3081d;
            if (j3 < s7.f3075p) {
                break;
            }
            K2.e eVar = this.f3078a;
            K2.a aVar = (K2.a) s7.f3076q;
            synchronized (eVar) {
                K2.a[] aVarArr = eVar.f4000f;
                int i7 = eVar.f3999e;
                eVar.f3999e = i7 + 1;
                aVarArr[i7] = aVar;
                eVar.f3998d--;
                eVar.notifyAll();
            }
            S s8 = this.f3081d;
            s8.f3076q = null;
            S s9 = (S) s8.f3077r;
            s8.f3077r = null;
            this.f3081d = s9;
        }
        if (this.f3082e.f3074o < s7.f3074o) {
            this.f3082e = s7;
        }
    }

    public final int b(int i7) {
        K2.a aVar;
        S s7 = this.f3083f;
        if (((K2.a) s7.f3076q) == null) {
            K2.e eVar = this.f3078a;
            synchronized (eVar) {
                try {
                    int i8 = eVar.f3998d + 1;
                    eVar.f3998d = i8;
                    int i9 = eVar.f3999e;
                    if (i9 > 0) {
                        K2.a[] aVarArr = eVar.f4000f;
                        int i10 = i9 - 1;
                        eVar.f3999e = i10;
                        aVar = aVarArr[i10];
                        aVar.getClass();
                        eVar.f4000f[eVar.f3999e] = null;
                    } else {
                        K2.a aVar2 = new K2.a(0, new byte[eVar.f3996b]);
                        K2.a[] aVarArr2 = eVar.f4000f;
                        if (i8 > aVarArr2.length) {
                            eVar.f4000f = (K2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            S s8 = new S(this.f3083f.f3075p, this.f3079b);
            s7.f3076q = aVar;
            s7.f3077r = s8;
        }
        return Math.min(i7, (int) (this.f3083f.f3075p - this.f3084g));
    }
}
