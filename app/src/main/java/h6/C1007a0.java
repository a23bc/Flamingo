package h6;

import f0.C0890h0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import t4.AbstractC1515j;
import w3.C1760y;

/* JADX INFO: renamed from: h6.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1007a0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12995q;

    public /* synthetic */ C1007a0(InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, int i7) {
        this.f12993o = i7;
        this.f12994p = interfaceC0878b0;
        this.f12995q = c0890h0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Y4.o oVar = Y4.o.f8736a;
        C0890h0 c0890h0 = this.f12995q;
        InterfaceC0878b0 interfaceC0878b0 = this.f12994p;
        switch (this.f12993o) {
            case 0:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                C1760y c1760y = b6.i.f10423c;
                if (c1760y != null) {
                    c1760y.Q();
                }
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i7 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            case 1:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                C1760y c1760y2 = b6.i.f10423c;
                if (c1760y2 != null) {
                    c1760y2.F();
                }
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i8 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            case 2:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i9 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            case 3:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i10 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            case 4:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i11 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            case 5:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                C1760y c1760y3 = b6.i.f10423c;
                if (c1760y3 != null) {
                    c1760y3.Q();
                }
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i12 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            case 6:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                C1760y c1760y4 = b6.i.f10423c;
                if (c1760y4 != null) {
                    c1760y4.F();
                }
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i13 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            default:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i14 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
        }
        return oVar;
    }
}
