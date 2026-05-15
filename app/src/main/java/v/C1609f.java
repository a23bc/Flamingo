package v;

import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: v.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1609f extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w.j0 f18079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f18080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f18081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1618o f18082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0.p f18083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n0.d f18084u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609f(w.j0 j0Var, Object obj, InterfaceC1182c interfaceC1182c, C1618o c1618o, p0.p pVar, n0.d dVar) {
        super(2);
        this.f18079p = j0Var;
        this.f18080q = obj;
        this.f18081r = interfaceC1182c;
        this.f18082s = c1618o;
        this.f18083t = pVar;
        this.f18084u = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            InterfaceC1182c interfaceC1182c = this.f18081r;
            C1618o c1618o = this.f18082s;
            if (objK == w7) {
                objK = (C1585C) interfaceC1182c.b(c1618o);
                c0912t.i0(objK);
            }
            C1585C c1585c = (C1585C) objK;
            w.j0 j0Var = this.f18079p;
            Object objC = j0Var.f().c();
            Object obj3 = this.f18080q;
            boolean zG = c0912t.g(AbstractC1209k.a(objC, obj3));
            Object objK2 = c0912t.K();
            if (zG || objK2 == w7) {
                objK2 = AbstractC1209k.a(j0Var.f().c(), obj3) ? C1599Q.f18005b : ((C1585C) interfaceC1182c.b(c1618o)).f17950b;
                c0912t.i0(objK2);
            }
            C1599Q c1599q = (C1599Q) objK2;
            Object objK3 = c0912t.K();
            C0894j0 c0894j0 = j0Var.f18691d;
            if (objK3 == w7) {
                objK3 = new C1615l(AbstractC1209k.a(obj3, c0894j0.getValue()));
                c0912t.i0(objK3);
            }
            C1615l c1615l = (C1615l) objK3;
            C1598P c1598p = c1585c.f17949a;
            C1395m c1395m = C1395m.f15634a;
            boolean zH = c0912t.h(c1585c);
            Object objK4 = c0912t.K();
            if (zH || objK4 == w7) {
                objK4 = new O0.F(2, c1585c);
                c0912t.i0(objK4);
            }
            InterfaceC1398p interfaceC1398pB = androidx.compose.ui.layout.a.b(c1395m, (l5.f) objK4);
            c1615l.f18120a.setValue(Boolean.valueOf(AbstractC1209k.a(obj3, c0894j0.getValue())));
            InterfaceC1398p interfaceC1398pF = interfaceC1398pB.f(c1615l);
            boolean zH2 = c0912t.h(obj3);
            Object objK5 = c0912t.K();
            if (zH2 || objK5 == w7) {
                objK5 = new B0.b(28, obj3);
                c0912t.i0(objK5);
            }
            InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objK5;
            boolean zF = c0912t.f(c1599q);
            Object objK6 = c0912t.K();
            if (zF || objK6 == w7) {
                objK6 = new A5.y(8, c1599q);
                c0912t.i0(objK6);
            }
            AbstractC1113a.a(j0Var, interfaceC1182c2, interfaceC1398pF, c1598p, c1599q, (l5.e) objK6, n0.e.e(-616195562, new C1608e(this.f18083t, obj3, c1618o, this.f18084u), c0912t), c0912t, 12582912);
        }
        return Y4.o.f8736a;
    }
}
