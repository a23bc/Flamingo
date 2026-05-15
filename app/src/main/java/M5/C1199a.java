package m5;

import java.io.Serializable;

/* JADX INFO: renamed from: m5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1199a implements InterfaceC1206h, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f14411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Class f14412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f14413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f14415s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14417u;

    public C1199a(int i7, int i8, Class cls, Object obj, String str, String str2) {
        this.f14411o = obj;
        this.f14412p = cls;
        this.f14413q = str;
        this.f14414r = str2;
        this.f14416t = i7;
        this.f14417u = i8 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1199a)) {
            return false;
        }
        C1199a c1199a = (C1199a) obj;
        return this.f14415s == c1199a.f14415s && this.f14416t == c1199a.f14416t && this.f14417u == c1199a.f14417u && this.f14411o.equals(c1199a.f14411o) && this.f14412p.equals(c1199a.f14412p) && this.f14413q.equals(c1199a.f14413q) && this.f14414r.equals(c1199a.f14414r);
    }

    @Override // m5.InterfaceC1206h
    public final int getArity() {
        return this.f14416t;
    }

    public final int hashCode() {
        return ((((A0.e.C(this.f14414r, A0.e.C(this.f14413q, (this.f14412p.hashCode() + (this.f14411o.hashCode() * 31)) * 31, 31), 31) + (this.f14415s ? 1231 : 1237)) * 31) + this.f14416t) * 31) + this.f14417u;
    }

    public final String toString() {
        AbstractC1221w.f14440a.getClass();
        return C1222x.a(this);
    }
}
