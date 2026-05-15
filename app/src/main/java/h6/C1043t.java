package h6;

import f0.Z0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import y0.C1960J;

/* JADX INFO: renamed from: h6.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1043t implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z0 f13211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f13212q;

    public /* synthetic */ C1043t(Z0 z02, Z0 z03, int i7) {
        this.f13210o = i7;
        this.f13211p = z02;
        this.f13212q = z03;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1960J c1960j = (C1960J) obj;
        switch (this.f13210o) {
            case 0:
                Z0 z02 = this.f13211p;
                AbstractC1209k.f(z02, "$animatedScale");
                Z0 z03 = this.f13212q;
                AbstractC1209k.f(z03, "$animatedOpacity");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.i(((Number) z02.getValue()).floatValue());
                c1960j.j(((Number) z02.getValue()).floatValue());
                c1960j.a(((Number) z03.getValue()).floatValue());
                break;
            case 1:
                Z0 z04 = this.f13211p;
                AbstractC1209k.f(z04, "$animatedScale");
                Z0 z05 = this.f13212q;
                AbstractC1209k.f(z05, "$animatedOpacity");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.i(((Number) z04.getValue()).floatValue());
                c1960j.j(((Number) z04.getValue()).floatValue());
                c1960j.a(((Number) z05.getValue()).floatValue());
                break;
            default:
                Z0 z06 = this.f13211p;
                AbstractC1209k.f(z06, "$animatedScale");
                Z0 z07 = this.f13212q;
                AbstractC1209k.f(z07, "$animatedOpacity");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.i(((Number) z06.getValue()).floatValue());
                c1960j.j(((Number) z06.getValue()).floatValue());
                c1960j.a(((Number) z07.getValue()).floatValue());
                break;
        }
        return Y4.o.f8736a;
    }
}
