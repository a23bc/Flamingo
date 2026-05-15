package t3;

import N2.C0293j;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.r f17038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f17039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17043g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17044i;

    public v(int i7) {
        this.f17037a = i7;
        switch (i7) {
            case 1:
                this.f17038b = new w2.r(0L);
                this.f17043g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f17044i = -9223372036854775807L;
                this.f17039c = new w2.m();
                break;
            default:
                this.f17038b = new w2.r(0L);
                this.f17043g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f17044i = -9223372036854775807L;
                this.f17039c = new w2.m();
                break;
        }
    }

    public static int b(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static long c(w2.m mVar) {
        int i7 = mVar.f18868b;
        if (mVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        mVar.e(bArr, 0, 9);
        mVar.G(i7);
        byte b7 = bArr[0];
        if ((b7 & 196) == 68) {
            byte b8 = bArr[2];
            if ((b8 & 4) == 4) {
                byte b9 = bArr[4];
                if ((b9 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j3 = b7;
                    long j7 = b8;
                    return ((j7 & 3) << 13) | ((j3 & 3) << 28) | (((56 & j3) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j7 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b9) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C0293j c0293j) {
        switch (this.f17037a) {
            case 0:
                byte[] bArr = w2.t.f18886f;
                w2.m mVar = this.f17039c;
                mVar.getClass();
                mVar.E(bArr.length, bArr);
                this.f17040d = true;
                c0293j.f5056t = 0;
                break;
            default:
                byte[] bArr2 = w2.t.f18886f;
                w2.m mVar2 = this.f17039c;
                mVar2.getClass();
                mVar2.E(bArr2.length, bArr2);
                this.f17040d = true;
                c0293j.f5056t = 0;
                break;
        }
    }
}
