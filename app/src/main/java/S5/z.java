package S5;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f6830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f6831g;

    public z() {
        this.f6825a = new byte[8192];
        this.f6829e = true;
        this.f6828d = false;
    }

    public final z a() {
        z zVar = this.f6830f;
        if (zVar == this) {
            zVar = null;
        }
        z zVar2 = this.f6831g;
        AbstractC1209k.c(zVar2);
        zVar2.f6830f = this.f6830f;
        z zVar3 = this.f6830f;
        AbstractC1209k.c(zVar3);
        zVar3.f6831g = this.f6831g;
        this.f6830f = null;
        this.f6831g = null;
        return zVar;
    }

    public final void b(z zVar) {
        AbstractC1209k.f(zVar, "segment");
        zVar.f6831g = this;
        zVar.f6830f = this.f6830f;
        z zVar2 = this.f6830f;
        AbstractC1209k.c(zVar2);
        zVar2.f6831g = zVar;
        this.f6830f = zVar;
    }

    public final z c() {
        this.f6828d = true;
        return new z(this.f6825a, this.f6826b, this.f6827c, true);
    }

    public final void d(z zVar, int i7) {
        AbstractC1209k.f(zVar, "sink");
        if (!zVar.f6829e) {
            throw new IllegalStateException("only owner can write");
        }
        int i8 = zVar.f6827c;
        int i9 = i8 + i7;
        byte[] bArr = zVar.f6825a;
        if (i9 > 8192) {
            if (zVar.f6828d) {
                throw new IllegalArgumentException();
            }
            int i10 = zVar.f6826b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            Z4.l.U(0, i10, i8, bArr, bArr);
            zVar.f6827c -= zVar.f6826b;
            zVar.f6826b = 0;
        }
        int i11 = zVar.f6827c;
        int i12 = this.f6826b;
        Z4.l.U(i11, i12, i12 + i7, this.f6825a, bArr);
        zVar.f6827c += i7;
        this.f6826b += i7;
    }

    public z(byte[] bArr, int i7, int i8, boolean z6) {
        AbstractC1209k.f(bArr, "data");
        this.f6825a = bArr;
        this.f6826b = i7;
        this.f6827c = i8;
        this.f6828d = z6;
        this.f6829e = false;
    }
}
