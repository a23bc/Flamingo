package h6;

import f0.C0890h0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t4.AbstractC1515j;
import w3.C1760y;

/* JADX INFO: renamed from: h6.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1009b0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13000q;

    public /* synthetic */ C1009b0(InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, int i7) {
        this.f12998o = i7;
        this.f12999p = interfaceC0878b0;
        this.f13000q = c0890h0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        C0890h0 c0890h0 = this.f13000q;
        InterfaceC0878b0 interfaceC0878b0 = this.f12999p;
        int i7 = this.f12998o;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i7) {
            case 0:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                if (zBooleanValue) {
                    C1760y c1760y = b6.i.f10423c;
                    if (c1760y != null) {
                        I0.c.t(c1760y);
                    }
                } else {
                    C1760y c1760y2 = b6.i.f10423c;
                    if (c1760y2 != null) {
                        I0.c.s(c1760y2);
                    }
                }
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i8 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
            default:
                AbstractC1209k.f(interfaceC0878b0, "$showControl");
                AbstractC1209k.f(c0890h0, "$lastClickTime");
                if (zBooleanValue) {
                    C1760y c1760y3 = b6.i.f10423c;
                    if (c1760y3 != null) {
                        I0.c.t(c1760y3);
                    }
                } else {
                    C1760y c1760y4 = b6.i.f10423c;
                    if (c1760y4 != null) {
                        I0.c.s(c1760y4);
                    }
                }
                interfaceC0878b0.setValue(Boolean.TRUE);
                int i9 = AbstractC1515j.f17082a;
                c0890h0.j(System.currentTimeMillis());
                break;
        }
        return oVar;
    }
}
