package E0;

import java.util.List;
import m5.AbstractC1209k;
import y0.AbstractC1983p;

/* JADX INFO: loaded from: classes.dex */
public final class M extends J {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f1677A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f1678B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f1680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC1983p f1682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f1683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC1983p f1684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f1685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f1686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f1689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f1690z;

    public M(String str, List list, int i7, AbstractC1983p abstractC1983p, float f7, AbstractC1983p abstractC1983p2, float f8, float f9, int i8, int i9, float f10, float f11, float f12, float f13) {
        this.f1679o = str;
        this.f1680p = list;
        this.f1681q = i7;
        this.f1682r = abstractC1983p;
        this.f1683s = f7;
        this.f1684t = abstractC1983p2;
        this.f1685u = f8;
        this.f1686v = f9;
        this.f1687w = i8;
        this.f1688x = i9;
        this.f1689y = f10;
        this.f1690z = f11;
        this.f1677A = f12;
        this.f1678B = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m7 = (M) obj;
        return this.f1679o.equals(m7.f1679o) && AbstractC1209k.a(this.f1682r, m7.f1682r) && this.f1683s == m7.f1683s && AbstractC1209k.a(this.f1684t, m7.f1684t) && this.f1685u == m7.f1685u && this.f1686v == m7.f1686v && this.f1687w == m7.f1687w && this.f1688x == m7.f1688x && this.f1689y == m7.f1689y && this.f1690z == m7.f1690z && this.f1677A == m7.f1677A && this.f1678B == m7.f1678B && this.f1681q == m7.f1681q && AbstractC1209k.a(this.f1680p, m7.f1680p);
    }

    public final int hashCode() {
        int iHashCode = (this.f1680p.hashCode() + (this.f1679o.hashCode() * 31)) * 31;
        AbstractC1983p abstractC1983p = this.f1682r;
        int iN = n1.c.n(this.f1683s, (iHashCode + (abstractC1983p != null ? abstractC1983p.hashCode() : 0)) * 31, 31);
        AbstractC1983p abstractC1983p2 = this.f1684t;
        return n1.c.n(this.f1678B, n1.c.n(this.f1677A, n1.c.n(this.f1690z, n1.c.n(this.f1689y, (((n1.c.n(this.f1686v, n1.c.n(this.f1685u, (iN + (abstractC1983p2 != null ? abstractC1983p2.hashCode() : 0)) * 31, 31), 31) + this.f1687w) * 31) + this.f1688x) * 31, 31), 31), 31), 31) + this.f1681q;
    }
}
