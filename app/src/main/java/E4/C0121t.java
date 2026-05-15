package E4;

import java.util.Map;

/* JADX INFO: renamed from: E4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0121t extends AbstractC0115m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0122u f1984q;

    public C0121t(C0122u c0122u, int i7) {
        this.f1984q = c0122u;
        Object obj = C0122u.f1985x;
        this.f1982o = c0122u.j()[i7];
        this.f1983p = i7;
    }

    public final void a() {
        int i7 = this.f1983p;
        Object obj = this.f1982o;
        C0122u c0122u = this.f1984q;
        if (i7 != -1 && i7 < c0122u.size()) {
            if (M3.a.L(obj, c0122u.j()[this.f1983p])) {
                return;
            }
        }
        Object obj2 = C0122u.f1985x;
        this.f1983p = c0122u.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1982o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0122u c0122u = this.f1984q;
        Map mapC = c0122u.c();
        if (mapC != null) {
            return mapC.get(this.f1982o);
        }
        a();
        int i7 = this.f1983p;
        if (i7 == -1) {
            return null;
        }
        return c0122u.l()[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0122u c0122u = this.f1984q;
        Map mapC = c0122u.c();
        Object obj2 = this.f1982o;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i7 = this.f1983p;
        if (i7 == -1) {
            c0122u.put(obj2, obj);
            return null;
        }
        Object obj3 = c0122u.l()[i7];
        c0122u.l()[this.f1983p] = obj;
        return obj3;
    }
}
