package w;

import X.B0;
import d5.EnumC0830a;
import e5.AbstractC0865c;
import f0.C0879c;
import f0.C0894j0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: w.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1670c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f18628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1680m f18630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0894j0 f18631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0894j0 f18632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f18634g;
    public final C1665N h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S f18635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f18636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f18637k;
    public r l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f18638m;

    public C1670c(Object obj, o0 o0Var, Object obj2) {
        this.f18628a = o0Var;
        this.f18629b = obj2;
        C1680m c1680m = new C1680m(o0Var, obj, null, 60);
        this.f18630c = c1680m;
        this.f18631d = C0879c.t(Boolean.FALSE);
        this.f18632e = C0879c.t(obj);
        this.h = new C1665N();
        this.f18635i = new S(3, obj2);
        r rVar = c1680m.f18711q;
        boolean z6 = rVar instanceof C1681n;
        r rVar2 = z6 ? AbstractC1671d.f18646e : rVar instanceof C1682o ? AbstractC1671d.f18647f : rVar instanceof C1683p ? AbstractC1671d.f18648g : AbstractC1671d.h;
        this.f18636j = rVar2;
        r rVar3 = z6 ? AbstractC1671d.f18642a : rVar instanceof C1682o ? AbstractC1671d.f18643b : rVar instanceof C1683p ? AbstractC1671d.f18644c : AbstractC1671d.f18645d;
        this.f18637k = rVar3;
        this.l = rVar2;
        this.f18638m = rVar3;
    }

    public static final void a(C1670c c1670c) {
        C1680m c1680m = c1670c.f18630c;
        c1680m.f18711q.d();
        c1680m.f18712r = Long.MIN_VALUE;
        c1670c.f18631d.setValue(Boolean.FALSE);
    }

    public static Object c(C1670c c1670c, Object obj, InterfaceC1679l interfaceC1679l, Float f7, InterfaceC1182c interfaceC1182c, c5.d dVar, int i7) {
        if ((i7 & 2) != 0) {
            interfaceC1679l = c1670c.f18635i;
        }
        InterfaceC1679l interfaceC1679l2 = interfaceC1679l;
        Object objB = f7;
        if ((i7 & 4) != 0) {
            objB = c1670c.f18628a.f18723b.b(c1670c.f18630c.f18711q);
        }
        Object obj2 = objB;
        if ((i7 & 8) != 0) {
            interfaceC1182c = null;
        }
        return c1670c.b(obj, interfaceC1679l2, obj2, interfaceC1182c, dVar);
    }

    public final Object b(Object obj, InterfaceC1679l interfaceC1679l, Object obj2, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        Object objE = e();
        o0 o0Var = this.f18628a;
        return C1665N.a(this.h, new C1669b(this, obj2, new a0(interfaceC1679l, o0Var, objE, obj, (r) o0Var.f18722a.b(obj2)), this.f18630c.f18712r, interfaceC1182c, null), dVar);
    }

    public final Object d(Object obj) {
        if (AbstractC1209k.a(this.l, this.f18636j) && AbstractC1209k.a(this.f18638m, this.f18637k)) {
            return obj;
        }
        o0 o0Var = this.f18628a;
        r rVar = (r) o0Var.f18722a.b(obj);
        int iB = rVar.b();
        boolean z6 = false;
        for (int i7 = 0; i7 < iB; i7++) {
            if (rVar.a(i7) < this.l.a(i7) || rVar.a(i7) > this.f18638m.a(i7)) {
                rVar.e(i7, i6.h.p(rVar.a(i7), this.l.a(i7), this.f18638m.a(i7)));
                z6 = true;
            }
        }
        return z6 ? o0Var.f18723b.b(rVar) : obj;
    }

    public final Object e() {
        return this.f18630c.f18710p.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.f18631d.getValue()).booleanValue();
    }

    public final Object g(c5.d dVar, Object obj) {
        Object objA = C1665N.a(this.h, new i2.s(this, obj, null, 1), dVar);
        return objA == EnumC0830a.f11264o ? objA : Y4.o.f8736a;
    }

    public final Object h(AbstractC0865c abstractC0865c) {
        Object objA = C1665N.a(this.h, new B0(this, null, 4), abstractC0865c);
        return objA == EnumC0830a.f11264o ? objA : Y4.o.f8736a;
    }

    public final void i(Object obj, Object obj2) {
        r rVar;
        r rVar2;
        o0 o0Var = this.f18628a;
        if (obj == null || (rVar = (r) o0Var.f18722a.b(obj)) == null) {
            rVar = this.f18636j;
        }
        if (obj2 == null || (rVar2 = (r) o0Var.f18722a.b(obj2)) == null) {
            rVar2 = this.f18637k;
        }
        int iB = rVar.b();
        for (int i7 = 0; i7 < iB; i7++) {
            if (rVar.a(i7) > rVar2.a(i7)) {
                AbstractC1666O.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + rVar + " is greater than upper bound " + rVar2 + " on index " + i7);
            }
        }
        this.l = rVar;
        this.f18638m = rVar2;
        this.f18634g = obj2;
        this.f18633f = obj;
        if (f()) {
            return;
        }
        Object objD = d(e());
        if (AbstractC1209k.a(objD, e())) {
            return;
        }
        this.f18630c.f18710p.setValue(objD);
    }

    public /* synthetic */ C1670c(Object obj, o0 o0Var, Object obj2, int i7) {
        this(obj, o0Var, (i7 & 4) != 0 ? null : obj2);
    }
}
