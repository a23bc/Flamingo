package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0894j0;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import r5.C1420a;
import w5.AbstractC1767D;
import x.C1872q0;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements z.Q {

    /* JADX INFO: renamed from: a */
    public final c0.u f10833a;

    /* JADX INFO: renamed from: b */
    public final C1420a f10834b;

    /* JADX INFO: renamed from: c */
    public final C0886f0 f10835c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1182c f10836d;

    /* JADX INFO: renamed from: g */
    public boolean f10839g;

    /* JADX INFO: renamed from: k */
    public final C0886f0 f10842k;
    public final C0886f0 l;

    /* JADX INFO: renamed from: m */
    public final V4.F f10843m;

    /* JADX INFO: renamed from: n */
    public final C1872q0 f10844n;

    /* JADX INFO: renamed from: e */
    public final float[] f10837e = new float[0];

    /* JADX INFO: renamed from: f */
    public final C0888g0 f10838f = new C0888g0(0);
    public final C0886f0 h = new C0886f0(0.0f);

    /* JADX INFO: renamed from: i */
    public final C0894j0 f10840i = C0879c.t(Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public final E0.K f10841j = new E0.K(22, this);

    public D0(float f7, c0.u uVar, C1420a c1420a) {
        this.f10833a = uVar;
        this.f10834b = c1420a;
        this.f10835c = new C0886f0(f7);
        float f8 = c1420a.f15780b;
        float f9 = c1420a.f15779a;
        float f10 = f8 - f9;
        this.f10842k = new C0886f0(AbstractC1113a.J(0.0f, 0.0f, i6.h.p(f10 == 0.0f ? 0.0f : (f7 - f9) / f10, 0.0f, 1.0f)));
        this.l = new C0886f0(0.0f);
        this.f10843m = new V4.F(2, this);
        this.f10844n = new C1872q0();
    }

    @Override // z.Q
    public final Object a(EnumC1862l0 enumC1862l0, l5.e eVar, AbstractC0871i abstractC0871i) {
        Object objH = AbstractC1767D.h(new C0(this, enumC1862l0, eVar, null), abstractC0871i);
        return objH == EnumC0830a.f11264o ? objH : Y4.o.f8736a;
    }

    public final void b(float f7) {
        float fH = this.f10838f.h();
        C0886f0 c0886f0 = this.h;
        float f8 = 2;
        float fMax = Math.max(fH - (c0886f0.h() / f8), 0.0f);
        float fMin = Math.min(c0886f0.h() / f8, fMax);
        C0886f0 c0886f02 = this.f10842k;
        float fH2 = c0886f02.h() + f7;
        C0886f0 c0886f03 = this.l;
        c0886f02.j(c0886f03.h() + fH2);
        c0886f03.j(0.0f);
        float fD = A0.d(c0886f02.h(), this.f10837e, fMin, fMax);
        C1420a c1420a = this.f10834b;
        float f9 = fMax - fMin;
        float fJ = AbstractC1113a.J(c1420a.f15779a, c1420a.f15780b, i6.h.p(f9 == 0.0f ? 0.0f : (fD - fMin) / f9, 0.0f, 1.0f));
        if (fJ == this.f10835c.h()) {
            return;
        }
        InterfaceC1182c interfaceC1182c = this.f10836d;
        if (interfaceC1182c != null) {
            interfaceC1182c.b(Float.valueOf(fJ));
        } else {
            c(fJ);
        }
    }

    public final void c(float f7) {
        C1420a c1420a = this.f10834b;
        float f8 = c1420a.f15779a;
        float f9 = c1420a.f15780b;
        this.f10835c.j(A0.d(i6.h.p(f7, f8, f9), this.f10837e, f8, f9));
    }
}
