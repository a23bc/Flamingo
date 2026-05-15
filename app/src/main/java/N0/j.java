package n0;

import android.os.Trace;
import f0.C0;
import f0.D0;
import f0.InterfaceC0895k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import q0.C1353b;
import t.J;
import t.K;
import t.S;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    public Set f14491a;

    /* JADX INFO: renamed from: b */
    public C1353b f14492b;

    /* JADX INFO: renamed from: c */
    public final h0.e f14493c;

    /* JADX INFO: renamed from: d */
    public K f14494d;

    /* JADX INFO: renamed from: e */
    public h0.e f14495e;

    /* JADX INFO: renamed from: f */
    public final h0.e f14496f;

    /* JADX INFO: renamed from: g */
    public final h0.e f14497g;
    public K h;

    /* JADX INFO: renamed from: i */
    public J f14498i;

    /* JADX INFO: renamed from: j */
    public ArrayList f14499j;

    /* JADX INFO: renamed from: k */
    public K f14500k;

    public j() {
        h0.e eVar = new h0.e(new D0[16]);
        this.f14493c = eVar;
        K k7 = S.f16033a;
        this.f14494d = new K();
        this.f14495e = eVar;
        this.f14496f = new h0.e(new Object[16]);
        this.f14497g = new h0.e(new InterfaceC1180a[16]);
    }

    public static final boolean f(D0 d02, h0.e eVar) {
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            C0 c02 = ((D0) objArr[i8]).f11647a;
            if (c02 instanceof g) {
                h0.e eVar2 = ((g) c02).f14488p;
                if (eVar2.k(d02) || f(d02, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f14491a = null;
        this.f14492b = null;
        h0.e eVar = this.f14493c;
        eVar.h();
        this.f14494d.b();
        this.f14495e = eVar;
        this.f14496f.h();
        this.f14497g.h();
        this.h = null;
        this.f14498i = null;
        this.f14499j = null;
    }

    public final void b() {
        Set set = this.f14491a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C0 c02 = (C0) it.next();
                it.remove();
                c02.e();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.f14491a;
        if (set == null) {
            return;
        }
        this.f14500k = null;
        h0.e eVar = this.f14496f;
        if (eVar.f12548q != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                K k7 = this.h;
                int i7 = eVar.f12548q;
                while (true) {
                    i7--;
                    if (-1 >= i7) {
                        break;
                    }
                    Object obj = eVar.f12546o[i7];
                    try {
                        if (obj instanceof D0) {
                            C0 c02 = ((D0) obj).f11647a;
                            set.remove(c02);
                            c02.f();
                        }
                        if (obj instanceof InterfaceC0895k) {
                            if (k7 == null || !k7.c(obj)) {
                                ((InterfaceC0895k) obj).h();
                            } else {
                                ((InterfaceC0895k) obj).g();
                            }
                        }
                    } catch (Throwable th) {
                        C1353b c1353b = this.f14492b;
                        if (c1353b != null) {
                            AbstractC1113a.N(th, new G.i(c1353b, 17, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        h0.e eVar2 = this.f14493c;
        if (eVar2.f12548q != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f14491a;
                if (set2 != null) {
                    Object[] objArr = eVar2.f12546o;
                    int i8 = eVar2.f12548q;
                    for (int i9 = 0; i9 < i8; i9++) {
                        D0 d02 = (D0) objArr[i9];
                        C0 c03 = d02.f11647a;
                        set2.remove(c03);
                        try {
                            c03.a();
                        } catch (Throwable th2) {
                            C1353b c1353b2 = this.f14492b;
                            if (c1353b2 != null) {
                                AbstractC1113a.N(th2, new G.i(c1353b2, 17, d02));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        h0.e eVar = this.f14497g;
        if (eVar.f12548q != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f12546o;
                int i7 = eVar.f12548q;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((InterfaceC1180a) objArr[i8]).a();
                }
                eVar.h();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void e(D0 d02) {
        if (this.f14494d.c(d02)) {
            this.f14494d.l(d02);
            if (!this.f14495e.k(d02)) {
                h0.e eVar = this.f14493c;
                if (!eVar.k(d02)) {
                    f(d02, eVar);
                }
            }
            Set set = this.f14491a;
            if (set == null) {
                return;
            } else {
                set.add(d02.f11647a);
            }
        }
        K k7 = this.f14500k;
        if (k7 == null || !k7.c(d02)) {
            this.f14496f.b(d02);
        }
    }

    public final void g(Set set, C1353b c1353b) {
        a();
        this.f14491a = set;
        this.f14492b = c1353b;
    }
}
