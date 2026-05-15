package H2;

import A2.s0;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: H2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0204v extends i0 {
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t2.g0 f3237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t2.e0 f3238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0202t f3239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0201s f3240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3243s;

    public C0204v(AbstractC0184a abstractC0184a, boolean z6) {
        super(abstractC0184a);
        this.l = z6 && abstractC0184a.i();
        this.f3237m = new t2.g0();
        this.f3238n = new t2.e0();
        t2.h0 h0VarG = abstractC0184a.g();
        if (h0VarG == null) {
            this.f3239o = new C0202t(new C0203u(abstractC0184a.h()), t2.g0.f16443p, C0202t.h);
        } else {
            this.f3239o = new C0202t(h0VarG, null, null);
            this.f3243s = true;
        }
    }

    @Override // H2.i0
    public final void A() {
        if (this.l) {
            return;
        }
        this.f3241q = true;
        x(null, this.f3195k);
    }

    @Override // H2.AbstractC0184a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final C0201s b(A a4, K2.e eVar, long j3) {
        C0201s c0201s = new C0201s(a4, eVar, j3);
        AbstractC1697a.i(c0201s.f3230r == null);
        AbstractC0184a abstractC0184a = this.f3195k;
        c0201s.f3230r = abstractC0184a;
        if (!this.f3242r) {
            this.f3240p = c0201s;
            if (!this.f3241q) {
                this.f3241q = true;
                x(null, abstractC0184a);
            }
            return c0201s;
        }
        Object obj = this.f3239o.f3235g;
        Object obj2 = a4.f2973a;
        if (obj != null && obj2.equals(C0202t.h)) {
            obj2 = this.f3239o.f3235g;
        }
        c0201s.l(a4.a(obj2));
        return c0201s;
    }

    public final boolean C(long j3) {
        C0201s c0201s = this.f3240p;
        int iB = this.f3239o.b(c0201s.f3227o.f2973a);
        if (iB == -1) {
            return false;
        }
        C0202t c0202t = this.f3239o;
        t2.e0 e0Var = this.f3238n;
        c0202t.f(iB, e0Var, false);
        long j7 = e0Var.f16429d;
        if (j7 != -9223372036854775807L && j3 >= j7) {
            j3 = Math.max(0L, j7 - 1);
        }
        c0201s.f3233u = j3;
        return true;
    }

    @Override // H2.AbstractC0184a
    public final boolean a(t2.G g6) {
        return this.f3195k.a(g6);
    }

    @Override // H2.AbstractC0184a
    public final void n(InterfaceC0207y interfaceC0207y) {
        C0201s c0201s = (C0201s) interfaceC0207y;
        if (c0201s.f3231s != null) {
            AbstractC0184a abstractC0184a = c0201s.f3230r;
            abstractC0184a.getClass();
            abstractC0184a.n(c0201s.f3231s);
        }
        if (interfaceC0207y == this.f3240p) {
            this.f3240p = null;
        }
    }

    @Override // H2.AbstractC0192i, H2.AbstractC0184a
    public final void p() {
        this.f3242r = false;
        this.f3241q = false;
        super.p();
    }

    @Override // H2.i0, H2.AbstractC0184a
    public final void s(t2.G g6) {
        if (this.f3243s) {
            C0202t c0202t = this.f3239o;
            this.f3239o = new C0202t(new s0(this.f3239o.f3220e, g6), c0202t.f3234f, c0202t.f3235g);
        } else {
            this.f3239o = new C0202t(new C0203u(g6), t2.g0.f16443p, C0202t.h);
        }
        this.f3195k.s(g6);
    }

    @Override // H2.i0
    public final A y(A a4) {
        Object obj = a4.f2973a;
        Object obj2 = this.f3239o.f3235g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0202t.h;
        }
        return a4.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // H2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(t2.h0 r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.C0204v.z(t2.h0):void");
    }

    @Override // H2.AbstractC0192i, H2.AbstractC0184a
    public final void j() {
    }
}
