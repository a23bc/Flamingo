package h6;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w.C1670c;
import y0.C1960J;

/* JADX INFO: renamed from: h6.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1011c0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f13007p;

    public /* synthetic */ C1011c0(C1670c c1670c, int i7) {
        this.f13006o = i7;
        this.f13007p = c1670c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1960J c1960j = (C1960J) obj;
        switch (this.f13006o) {
            case 0:
                C1670c c1670c = this.f13007p;
                AbstractC1209k.f(c1670c, "$alphaAnim");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.e(2);
                c1960j.a(((Number) c1670c.e()).floatValue());
                break;
            default:
                C1670c c1670c2 = this.f13007p;
                AbstractC1209k.f(c1670c2, "$alphaAnim");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.e(2);
                c1960j.a(((Number) c1670c2.e()).floatValue());
                break;
        }
        return Y4.o.f8736a;
    }
}
