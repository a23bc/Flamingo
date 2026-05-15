package z4;

import f0.C0879c;
import f0.C0894j0;
import f0.G;
import r1.x;

/* JADX INFO: renamed from: z4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2091j implements InterfaceC2097p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0894j0 f21220o = C0879c.t(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U3.h f21221p = new U3.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U3.h f21222q = new U3.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0894j0 f21223r = C0879c.t(Boolean.TRUE);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final G f21224s = C0879c.o(new x(11, this));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0894j0 f21225t = C0879c.t(Float.valueOf(0.0f));

    public final void a() {
        C0894j0 c0894j0 = this.f21220o;
        c0894j0.setValue(Integer.valueOf(((Number) c0894j0.getValue()).intValue() - 1));
        if (((Number) c0894j0.getValue()).intValue() == 0) {
            U3.h hVar = this.f21222q;
            ((C0894j0) hVar.f7042o).setValue(0);
            ((C0894j0) hVar.f7043p).setValue(0);
            ((C0894j0) hVar.f7044q).setValue(0);
            ((C0894j0) hVar.f7045r).setValue(0);
            this.f21225t.setValue(Float.valueOf(0.0f));
        }
    }

    @Override // z4.InterfaceC2087f
    public final /* synthetic */ int b() {
        return n1.c.a(this);
    }

    @Override // z4.InterfaceC2087f
    public final /* synthetic */ int c() {
        return n1.c.d(this);
    }

    public final void d(boolean z6) {
        this.f21223r.setValue(Boolean.valueOf(z6));
    }

    @Override // z4.InterfaceC2087f
    public final /* synthetic */ int g() {
        return n1.c.b(this);
    }

    @Override // z4.InterfaceC2097p
    public final InterfaceC2087f h() {
        return this.f21222q;
    }

    @Override // z4.InterfaceC2097p
    public final boolean isVisible() {
        return ((Boolean) this.f21223r.getValue()).booleanValue();
    }

    @Override // z4.InterfaceC2097p
    public final InterfaceC2087f j() {
        return this.f21221p;
    }

    @Override // z4.InterfaceC2097p
    public final boolean p() {
        return ((Boolean) this.f21224s.getValue()).booleanValue();
    }

    @Override // z4.InterfaceC2087f
    public final /* synthetic */ int q() {
        return n1.c.c(this);
    }

    @Override // z4.InterfaceC2097p
    public final float t() {
        return ((Number) this.f21225t.getValue()).floatValue();
    }
}
