package D0;

import A0.e;
import Q0.N;
import j5.AbstractC1107a;
import m5.AbstractC1209k;
import n1.k;
import n1.m;
import y0.C1973f;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: s */
    public final C1973f f1441s;

    /* JADX INFO: renamed from: t */
    public final long f1442t;

    /* JADX INFO: renamed from: u */
    public int f1443u = 1;

    /* JADX INFO: renamed from: v */
    public final long f1444v;

    /* JADX INFO: renamed from: w */
    public float f1445w;

    /* JADX INFO: renamed from: x */
    public C1980m f1446x;

    public a(C1973f c1973f, long j3) {
        int i7;
        int i8;
        this.f1441s = c1973f;
        this.f1442t = j3;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i7 = (int) (j3 >> 32)) < 0 || (i8 = (int) (4294967295L & j3)) < 0 || i7 > c1973f.f20238a.getWidth() || i8 > c1973f.f20238a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f1444v = j3;
        this.f1445w = 1.0f;
    }

    @Override // D0.b
    public final void b(float f7) {
        this.f1445w = f7;
    }

    @Override // D0.b
    public final void c(C1980m c1980m) {
        this.f1446x = c1980m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1209k.a(this.f1441s, aVar.f1441s) && k.b(0L, 0L) && m.b(this.f1442t, aVar.f1442t) && this.f1443u == aVar.f1443u;
    }

    @Override // D0.b
    public final long h() {
        return AbstractC1107a.E(this.f1444v);
    }

    public final int hashCode() {
        int iHashCode = (((int) 0) + (this.f1441s.hashCode() * 31)) * 31;
        long j3 = this.f1442t;
        return ((((int) (j3 ^ (j3 >>> 32))) + iHashCode) * 31) + this.f1443u;
    }

    @Override // D0.b
    public final void i(N n7) {
        int iRound = Math.round(Float.intBitsToFloat((int) (n7.f() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (n7.f() & 4294967295L)));
        float f7 = this.f1445w;
        C1980m c1980m = this.f1446x;
        int i7 = this.f1443u;
        e.t(n7, this.f1441s, this.f1442t, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f7, c1980m, i7, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f1441s);
        sb.append(", srcOffset=");
        sb.append((Object) k.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) m.c(this.f1442t));
        sb.append(", filterQuality=");
        int i7 = this.f1443u;
        sb.append((Object) (i7 == 0 ? "None" : i7 == 1 ? "Low" : i7 == 2 ? "Medium" : i7 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
