package M;

import R0.C0404r0;
import R0.O0;
import X.K0;
import b1.AbstractC0607C;
import f0.InterfaceC0878b0;
import g1.C0980v;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import x0.C1892b;

/* JADX INFO: renamed from: M.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0277w implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4716o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f4717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4721t;

    public /* synthetic */ C0277w(Z z6, w0.p pVar, boolean z7, K0 k02, B2.m mVar) {
        this.f4718q = z6;
        this.f4719r = pVar;
        this.f4717p = z7;
        this.f4720s = k02;
        this.f4721t = mVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f4716o) {
            case 0:
                C1892b c1892b = (C1892b) obj;
                Z z6 = (Z) this.f4718q;
                if (z6.b()) {
                    O0 o02 = z6.f4499c;
                    if (o02 != null) {
                        ((C0404r0) o02).b();
                    }
                } else {
                    w0.p.b((w0.p) this.f4719r);
                }
                if (z6.b() && this.f4717p) {
                    if (z6.a() != N.f4426p) {
                        E0 e0D = z6.d();
                        if (e0D != null) {
                            int iB = e0D.b(c1892b.f19867a, true);
                            ((B2.m) this.f4721t).b(iB);
                            z6.f4516v.b(C0980v.a((C0980v) z6.f4500d.f7389o, null, AbstractC0607C.b(iB, iB), 5));
                            if (z6.f4497a.f4589a.f9970p.length() > 0) {
                                z6.f4506k.setValue(N.f4427q);
                            }
                        }
                    } else {
                        ((K0) this.f4720s).g(c1892b);
                    }
                }
                break;
            default:
                O0.C c7 = (O0.C) obj;
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f4718q;
                AbstractC1209k.f(interfaceC1182c, "$onHeightBack");
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f4719r;
                AbstractC1209k.f(interfaceC0878b0, "$hasReportBgHeight");
                InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) this.f4720s;
                AbstractC1209k.f(interfaceC1182c2, "$onBgHeightBack");
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) this.f4721t;
                AbstractC1209k.f(interfaceC0878b02, "$subLine$delegate");
                AbstractC1209k.f(c7, "it");
                if (this.f4717p) {
                    interfaceC1182c.b(Integer.valueOf((int) (c7.G() & 4294967295L)));
                    if (((d6.f) interfaceC0878b02.getValue()) == null && !((Boolean) interfaceC0878b0.getValue()).booleanValue()) {
                        interfaceC1182c2.b(0);
                        interfaceC0878b0.setValue(Boolean.TRUE);
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0277w(boolean z6, InterfaceC1182c interfaceC1182c, InterfaceC0878b0 interfaceC0878b0, InterfaceC1182c interfaceC1182c2, InterfaceC0878b0 interfaceC0878b02) {
        this.f4717p = z6;
        this.f4718q = interfaceC1182c;
        this.f4719r = interfaceC0878b0;
        this.f4720s = interfaceC1182c2;
        this.f4721t = interfaceC0878b02;
    }
}
