package E0;

import A2.x0;
import m5.AbstractC1209k;
import y0.C1987t;

/* JADX INFO: renamed from: E0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0095f {

    /* JADX INFO: renamed from: k */
    public static int f1733k;
    public static final x0 l = new x0(8);

    /* JADX INFO: renamed from: a */
    public final String f1734a;

    /* JADX INFO: renamed from: b */
    public final float f1735b;

    /* JADX INFO: renamed from: c */
    public final float f1736c;

    /* JADX INFO: renamed from: d */
    public final float f1737d;

    /* JADX INFO: renamed from: e */
    public final float f1738e;

    /* JADX INFO: renamed from: f */
    public final H f1739f;

    /* JADX INFO: renamed from: g */
    public final long f1740g;
    public final int h;

    /* JADX INFO: renamed from: i */
    public final boolean f1741i;

    /* JADX INFO: renamed from: j */
    public final int f1742j;

    public C0095f(String str, float f7, float f8, float f9, float f10, H h, long j3, int i7, boolean z6) {
        int i8;
        synchronized (l) {
            i8 = f1733k;
            f1733k = i8 + 1;
        }
        this.f1734a = str;
        this.f1735b = f7;
        this.f1736c = f8;
        this.f1737d = f9;
        this.f1738e = f10;
        this.f1739f = h;
        this.f1740g = j3;
        this.h = i7;
        this.f1741i = z6;
        this.f1742j = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0095f)) {
            return false;
        }
        C0095f c0095f = (C0095f) obj;
        return AbstractC1209k.a(this.f1734a, c0095f.f1734a) && n1.g.a(this.f1735b, c0095f.f1735b) && n1.g.a(this.f1736c, c0095f.f1736c) && this.f1737d == c0095f.f1737d && this.f1738e == c0095f.f1738e && this.f1739f.equals(c0095f.f1739f) && C1987t.c(this.f1740g, c0095f.f1740g) && this.h == c0095f.h && this.f1741i == c0095f.f1741i;
    }

    public final int hashCode() {
        return ((n1.c.o((this.f1739f.hashCode() + n1.c.n(this.f1738e, n1.c.n(this.f1737d, n1.c.n(this.f1736c, n1.c.n(this.f1735b, this.f1734a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31, this.f1740g) + this.h) * 31) + (this.f1741i ? 1231 : 1237);
    }
}
