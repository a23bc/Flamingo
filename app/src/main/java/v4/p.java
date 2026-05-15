package V4;

import f0.C0879c;
import f0.InterfaceC0878b0;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import r5.C1420a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f7547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1420a f7548s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, float f7, C1420a c1420a) {
        super(0);
        this.f7545p = interfaceC0878b0;
        this.f7546q = interfaceC0878b02;
        this.f7547r = f7;
        this.f7548s = c1420a;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        float fFloatValue = ((Number) this.f7545p.getValue()).floatValue();
        InterfaceC0878b0 interfaceC0878b0 = this.f7546q;
        float f7 = 2;
        float fMax = Math.max(fFloatValue - (((Number) interfaceC0878b0.getValue()).floatValue() / f7), 0.0f);
        float fMin = Math.min(((Number) interfaceC0878b0.getValue()).floatValue() / f7, fMax);
        C1420a c1420a = this.f7548s;
        float f8 = c1420a.f15780b;
        float f9 = c1420a.f15779a;
        float f10 = f8 - f9;
        return C0879c.t(Float.valueOf(AbstractC1113a.J(fMin, fMax, i6.h.p(f10 == 0.0f ? 0.0f : (this.f7547r - f9) / f10, 0.0f, 1.0f))));
    }
}
