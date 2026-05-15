package V4;

import f0.InterfaceC0878b0;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r5.C1420a;
import r5.C1422c;
import r5.C1423d;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y4.e f7537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float[] f7539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7540u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1420a f7541v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, Y4.e eVar, InterfaceC0878b0 interfaceC0878b03, float[] fArr, G0.a aVar, InterfaceC0878b0 interfaceC0878b04, C1420a c1420a, InterfaceC0878b0 interfaceC0878b05) {
        super(1);
        this.f7535p = interfaceC0878b0;
        this.f7536q = interfaceC0878b02;
        this.f7537r = eVar;
        this.f7538s = interfaceC0878b03;
        this.f7539t = fArr;
        this.f7540u = interfaceC0878b04;
        this.f7541v = c1420a;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Float fValueOf;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) this.f7535p.getValue()).floatValue();
        InterfaceC0878b0 interfaceC0878b0 = this.f7536q;
        float f7 = 2;
        float fMax = Math.max(fFloatValue2 - (((Number) interfaceC0878b0.getValue()).floatValue() / f7), 0.0f);
        float fMin = Math.min(((Number) interfaceC0878b0.getValue()).floatValue() / f7, fMax);
        Y4.e eVar = this.f7537r;
        InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) eVar.getValue();
        float fFloatValue3 = ((Number) ((InterfaceC0878b0) eVar.getValue()).getValue()).floatValue() + fFloatValue;
        InterfaceC0878b0 interfaceC0878b03 = this.f7538s;
        interfaceC0878b02.setValue(Float.valueOf(i6.h.p(((Number) interfaceC0878b03.getValue()).floatValue() + fFloatValue3, 0.0f, ((Number) r0.getValue()).intValue())));
        interfaceC0878b03.setValue(Float.valueOf(0.0f));
        float fFloatValue4 = ((Number) ((InterfaceC0878b0) eVar.getValue()).getValue()).floatValue();
        float[] fArr = this.f7539t;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f8 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f8);
            } else {
                float fAbs = Math.abs(AbstractC1113a.J(fMin, fMax, f8) - fFloatValue4);
                C1422c it = new C1423d(1, length, 1).iterator();
                while (it.f15786q) {
                    float f9 = fArr[it.b()];
                    float fAbs2 = Math.abs(AbstractC1113a.J(fMin, fMax, f9) - fFloatValue4);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f8 = f9;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f8);
            }
        }
        if (fValueOf != null) {
            fFloatValue4 = AbstractC1113a.J(fMin, fMax, fValueOf.floatValue());
        }
        C1420a c1420a = this.f7541v;
        float f10 = fMax - fMin;
        ((InterfaceC1182c) this.f7540u.getValue()).b(Float.valueOf(AbstractC1113a.J(c1420a.f15779a, c1420a.f15780b, i6.h.p(f10 == 0.0f ? 0.0f : (fFloatValue4 - fMin) / f10, 0.0f, 1.0f))));
        return Y4.o.f8736a;
    }
}
