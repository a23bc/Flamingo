package h6;

import f0.Z0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w.C1670c;
import y0.C1960J;

/* JADX INFO: renamed from: h6.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1025j0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f13081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f13082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z0 f13083r;

    public /* synthetic */ C1025j0(C1670c c1670c, Z0 z02, Z0 z03, int i7) {
        this.f13080o = i7;
        this.f13081p = c1670c;
        this.f13082q = z02;
        this.f13083r = z03;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1960J c1960j = (C1960J) obj;
        switch (this.f13080o) {
            case 0:
                C1670c c1670c = this.f13081p;
                AbstractC1209k.f(c1670c, "$alphaAnim");
                Z0 z02 = this.f13082q;
                AbstractC1209k.f(z02, "$ifAnimationOne");
                Z0 z03 = this.f13083r;
                AbstractC1209k.f(z03, "$ifAnimationTwo");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                float fFloatValue = ((Number) c1670c.e()).floatValue() - 0.3f;
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                c1960j.a(fFloatValue / 0.7f);
                if (((Boolean) z02.getValue()).booleanValue()) {
                    float f7 = 800;
                    c1960j.r(f7 - (((Number) c1670c.e()).floatValue() * f7));
                } else if (((Boolean) z03.getValue()).booleanValue()) {
                    c1960j.i((((Number) c1670c.e()).floatValue() * 0.1f) + 0.9f);
                    c1960j.j((((Number) c1670c.e()).floatValue() * 0.1f) + 0.9f);
                }
                break;
            default:
                C1670c c1670c2 = this.f13081p;
                AbstractC1209k.f(c1670c2, "$alphaAnim");
                Z0 z04 = this.f13082q;
                AbstractC1209k.f(z04, "$ifAnimationOne");
                Z0 z05 = this.f13083r;
                AbstractC1209k.f(z05, "$ifAnimationTwo");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                float fFloatValue2 = ((Number) c1670c2.e()).floatValue() - 0.3f;
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                c1960j.a(fFloatValue2 / 0.7f);
                if (((Boolean) z04.getValue()).booleanValue()) {
                    float f8 = 800;
                    c1960j.u(f8 - (((Number) c1670c2.e()).floatValue() * f8));
                } else if (((Boolean) z05.getValue()).booleanValue()) {
                    c1960j.i((((Number) c1670c2.e()).floatValue() * 0.1f) + 0.9f);
                    c1960j.j((((Number) c1670c2.e()).floatValue() * 0.1f) + 0.9f);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
