package h6;

import f0.Z0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w.C1670c;
import y0.C1960J;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12963o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z0 f12964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1670c f12965q;

    public /* synthetic */ V(Z0 z02, C1670c c1670c) {
        this.f12964p = z02;
        this.f12965q = c1670c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1960J c1960j = (C1960J) obj;
        switch (this.f12963o) {
            case 0:
                C1670c c1670c = this.f12965q;
                AbstractC1209k.f(c1670c, "$alphaAnim");
                Z0 z02 = this.f12964p;
                AbstractC1209k.f(z02, "$ifAnimationOne");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.a(((Number) c1670c.e()).floatValue());
                if (((Boolean) z02.getValue()).booleanValue()) {
                    float f7 = 200;
                    c1960j.u(f7 - (((Number) c1670c.e()).floatValue() * f7));
                }
                break;
            default:
                Z0 z03 = this.f12964p;
                AbstractC1209k.f(z03, "$ifAnimationTwo");
                C1670c c1670c2 = this.f12965q;
                AbstractC1209k.f(c1670c2, "$alphaAnim");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                if (((Boolean) z03.getValue()).booleanValue()) {
                    c1960j.i((-(((Number) c1670c2.e()).floatValue() * 0.1f)) + 1.0f);
                    c1960j.j((-(((Number) c1670c2.e()).floatValue() * 0.1f)) + 1.0f);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ V(C1670c c1670c, Z0 z02) {
        this.f12965q = c1670c;
        this.f12964p = z02;
    }
}
