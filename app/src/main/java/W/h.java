package W;

import H2.S;
import K0.C0245m;
import K0.H;
import K0.r;
import M.I;
import X.C0492o;
import X.J;
import X.u0;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b1.C0613I;
import f0.C0;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;
import t.C1441C;

/* JADX INFO: loaded from: classes.dex */
public final class h implements C0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f7671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f7672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f7673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f7674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0492o f7675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC1398p f7676t;

    public h(long j3, u0 u0Var, long j7) {
        j jVar = j.f7682c;
        this.f7671o = j3;
        this.f7672p = u0Var;
        this.f7673q = j7;
        this.f7674r = jVar;
        g gVar = new g(this, 2);
        i iVar = new i(gVar, u0Var, j3);
        S s7 = new S();
        s7.f3076q = gVar;
        s7.f3077r = u0Var;
        s7.f3075p = j3;
        s7.f3074o = 0L;
        I i7 = new I(s7, iVar);
        C0245m c0245m = H.f3830a;
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(s7, iVar, null, i7, 4);
        r.f3906a.getClass();
        this.f7676t = suspendPointerInputElement.f(new PointerHoverIconModifierElement());
    }

    @Override // f0.C0
    public final void a() {
        g gVar = new g(this, 0);
        g gVar2 = new g(this, 1);
        long j3 = this.f7671o;
        C0492o c0492o = new C0492o(j3, gVar, gVar2);
        u0 u0Var = this.f7672p;
        if (j3 == 0) {
            C.b.a("The selectable contains an invalid id: " + j3);
        }
        C1441C c1441c = u0Var.f8175c;
        if (c1441c.b(j3)) {
            C.b.a("Another selectable with the id: " + c0492o + ".selectableId has already subscribed.");
        }
        c1441c.h(j3, c0492o);
        u0Var.f8174b.add(c0492o);
        u0Var.f8173a = false;
        this.f7675s = c0492o;
    }

    public final void b(C0613I c0613i) {
        J j3;
        C0613I c0613i2 = this.f7674r.f7684b;
        if (c0613i2 != null && !AbstractC1209k.a(c0613i2.f9929a.f9920a, c0613i.f9929a.f9920a) && (j3 = this.f7672p.f8180i) != null) {
            j3.b(Long.valueOf(this.f7671o));
        }
        this.f7674r = j.a(this.f7674r, null, c0613i, 1);
    }

    @Override // f0.C0
    public final void e() {
        C0492o c0492o = this.f7675s;
        if (c0492o != null) {
            this.f7672p.d(c0492o);
            this.f7675s = null;
        }
    }

    @Override // f0.C0
    public final void f() {
        C0492o c0492o = this.f7675s;
        if (c0492o != null) {
            this.f7672p.d(c0492o);
            this.f7675s = null;
        }
    }
}
