package E0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends J implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final String f1657o;

    /* JADX INFO: renamed from: p */
    public final float f1658p;

    /* JADX INFO: renamed from: q */
    public final float f1659q;

    /* JADX INFO: renamed from: r */
    public final float f1660r;

    /* JADX INFO: renamed from: s */
    public final float f1661s;

    /* JADX INFO: renamed from: t */
    public final float f1662t;

    /* JADX INFO: renamed from: u */
    public final float f1663u;

    /* JADX INFO: renamed from: v */
    public final float f1664v;

    /* JADX INFO: renamed from: w */
    public final List f1665w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f1666x;

    public H(String str, float f7, float f8, float f9, float f10, float f11, float f12, float f13, List list, ArrayList arrayList) {
        this.f1657o = str;
        this.f1658p = f7;
        this.f1659q = f8;
        this.f1660r = f9;
        this.f1661s = f10;
        this.f1662t = f11;
        this.f1663u = f12;
        this.f1664v = f13;
        this.f1665w = list;
        this.f1666x = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        return AbstractC1209k.a(this.f1657o, h.f1657o) && this.f1658p == h.f1658p && this.f1659q == h.f1659q && this.f1660r == h.f1660r && this.f1661s == h.f1661s && this.f1662t == h.f1662t && this.f1663u == h.f1663u && this.f1664v == h.f1664v && AbstractC1209k.a(this.f1665w, h.f1665w) && AbstractC1209k.a(this.f1666x, h.f1666x);
    }

    public final int hashCode() {
        return this.f1666x.hashCode() + ((this.f1665w.hashCode() + n1.c.n(this.f1664v, n1.c.n(this.f1663u, n1.c.n(this.f1662t, n1.c.n(this.f1661s, n1.c.n(this.f1660r, n1.c.n(this.f1659q, n1.c.n(this.f1658p, this.f1657o.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new G(this);
    }
}
