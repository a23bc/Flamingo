package w;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: w.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1688v implements InterfaceC1675h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f18754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f18755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f18757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f18758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f18759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18760g;
    public final long h;

    public C1688v(C1689w c1689w, o0 o0Var, Object obj, r rVar) {
        s0 s0Var = new s0(c1689w.f18761a);
        this.f18754a = s0Var;
        this.f18755b = o0Var;
        this.f18756c = obj;
        r rVar2 = (r) o0Var.f18722a.b(obj);
        this.f18757d = rVar2;
        this.f18758e = AbstractC1671d.g(rVar);
        if (s0Var.f18742d == null) {
            s0Var.f18742d = rVar2.c();
        }
        r rVar3 = s0Var.f18742d;
        if (rVar3 == null) {
            AbstractC1209k.m("targetVector");
            throw null;
        }
        int iB = rVar3.b();
        for (int i7 = 0; i7 < iB; i7++) {
            r rVar4 = s0Var.f18742d;
            if (rVar4 == null) {
                AbstractC1209k.m("targetVector");
                throw null;
            }
            rVar4.e(i7, s0Var.f18739a.m(rVar2.a(i7), rVar.a(i7)));
        }
        r rVar5 = s0Var.f18742d;
        if (rVar5 == null) {
            AbstractC1209k.m("targetVector");
            throw null;
        }
        this.f18760g = o0Var.f18723b.b(rVar5);
        if (s0Var.f18741c == null) {
            s0Var.f18741c = rVar2.c();
        }
        r rVar6 = s0Var.f18741c;
        if (rVar6 == null) {
            AbstractC1209k.m("velocityVector");
            throw null;
        }
        int iB2 = rVar6.b();
        long jMax = 0;
        for (int i8 = 0; i8 < iB2; i8++) {
            rVar2.getClass();
            jMax = Math.max(jMax, s0Var.f18739a.k(rVar.a(i8)));
        }
        this.h = jMax;
        r rVarG = AbstractC1671d.g(this.f18754a.a(jMax, this.f18757d, rVar));
        this.f18759f = rVarG;
        int iB3 = rVarG.b();
        for (int i9 = 0; i9 < iB3; i9++) {
            r rVar7 = this.f18759f;
            float fA = rVar7.a(i9);
            float f7 = this.f18754a.f18743e;
            rVar7.e(i9, i6.h.p(fA, -f7, f7));
        }
    }

    @Override // w.InterfaceC1675h
    public final boolean a() {
        return false;
    }

    @Override // w.InterfaceC1675h
    public final Object b(long j3) {
        if (AbstractC1676i.a(this, j3)) {
            return this.f18760g;
        }
        InterfaceC1182c interfaceC1182c = this.f18755b.f18723b;
        s0 s0Var = this.f18754a;
        r rVar = s0Var.f18740b;
        r rVar2 = this.f18757d;
        if (rVar == null) {
            s0Var.f18740b = rVar2.c();
        }
        r rVar3 = s0Var.f18740b;
        if (rVar3 == null) {
            AbstractC1209k.m("valueVector");
            throw null;
        }
        int iB = rVar3.b();
        for (int i7 = 0; i7 < iB; i7++) {
            r rVar4 = s0Var.f18740b;
            if (rVar4 == null) {
                AbstractC1209k.m("valueVector");
                throw null;
            }
            rVar4.e(i7, s0Var.f18739a.C(rVar2.a(i7), this.f18758e.a(i7), j3));
        }
        r rVar5 = s0Var.f18740b;
        if (rVar5 != null) {
            return interfaceC1182c.b(rVar5);
        }
        AbstractC1209k.m("valueVector");
        throw null;
    }

    @Override // w.InterfaceC1675h
    public final long c() {
        return this.h;
    }

    @Override // w.InterfaceC1675h
    public final o0 d() {
        return this.f18755b;
    }

    @Override // w.InterfaceC1675h
    public final Object e() {
        return this.f18760g;
    }

    @Override // w.InterfaceC1675h
    public final r f(long j3) {
        if (AbstractC1676i.a(this, j3)) {
            return this.f18759f;
        }
        return this.f18754a.a(j3, this.f18757d, this.f18758e);
    }

    @Override // w.InterfaceC1675h
    public final /* synthetic */ boolean g(long j3) {
        return AbstractC1676i.a(this, j3);
    }
}
