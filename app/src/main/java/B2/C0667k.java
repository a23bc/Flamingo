package b2;

import a.AbstractC0509a;
import android.content.Context;
import android.os.Bundle;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import z5.C2107b;
import z5.InterfaceC2110e;

/* JADX INFO: renamed from: b2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667k extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10210p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f10211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0671m f10212r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667k(Context context, C0671m c0671m) {
        super(2);
        this.f10211q = context;
        this.f10212r = c0671m;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Y4.o oVar = Y4.o.f8736a;
        C0671m c0671m = this.f10212r;
        Context context = this.f10211q;
        switch (this.f10210p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    c0912t.Y(1881995740);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    if (objK == w7) {
                        objK = C0879c.t(new n1.i(0L));
                        c0912t.i0(objK);
                    }
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
                    c0912t.p(false);
                    Boolean bool = Boolean.FALSE;
                    c0912t.Y(1881999935);
                    boolean zF = c0912t.f(c0671m) | c0912t.f(context) | c0912t.f(interfaceC0878b0);
                    Object objK2 = c0912t.K();
                    Y4.o oVar2 = null;
                    if (zF || objK2 == w7) {
                        objK2 = new C0665j(c0671m, context, interfaceC0878b0, null);
                        c0912t.i0(objK2);
                    }
                    c0912t.p(false);
                    if (((Boolean) C0879c.u(c0912t, bool, (l5.e) objK2).getValue()).booleanValue()) {
                        c0912t.Y(-1786326291);
                        c0912t.Y(1882039614);
                        Object objK3 = c0912t.K();
                        if (objK3 == w7) {
                            objK3 = new C2107b(new C0676q(c0671m.f10229d, context, c0671m.f10230e, null), c5.j.f10685o, -2, y5.a.f20528o);
                            c0912t.i0(objK3);
                        }
                        c0912t.p(false);
                        l5.e eVar = (l5.e) C0879c.j((InterfaceC2110e) objK3, null, null, c0912t, 48, 2).getValue();
                        c0912t.Y(1882043230);
                        if (eVar != null) {
                            I0.c.c(0, ((n1.i) interfaceC0878b0.getValue()).f14513a, c0671m.f10232g, c0912t, eVar);
                            c0912t = c0912t;
                            oVar2 = oVar;
                        }
                        c0912t.p(false);
                        if (oVar2 == null) {
                            AbstractC0509a.e(0, c0912t);
                        }
                        c0912t.p(false);
                    } else {
                        c0912t.Y(-1786102688);
                        AbstractC0509a.e(0, c0912t);
                        c0912t.p(false);
                    }
                    c0912t.Y(1882053955);
                    boolean zF2 = c0912t.f(c0671m);
                    Object objK4 = c0912t.K();
                    if (zF2 || objK4 == w7) {
                        objK4 = new E0.K(16, c0671m);
                        c0912t.i0(objK4);
                    }
                    c0912t.p(false);
                    C0879c.g((InterfaceC1180a) objK4, c0912t);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    C0913t0 c0913t0A = Z1.h.f8772b.a(context);
                    C0913t0 c0913t0A2 = Z1.h.f8774d.a(c0671m.f10230e);
                    f0.D d4 = AbstractC0680v.f10339a;
                    Bundle bundle = (Bundle) c0671m.f10234j.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    C0879c.b(new C0913t0[]{c0913t0A, c0913t0A2, d4.a(bundle), Z1.h.f8773c.a(c0671m.f10233i.getValue())}, n0.e.b(c0912t2, 1688971311, new C0667k(c0671m, context)), c0912t2, 48);
                }
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667k(C0671m c0671m, Context context) {
        super(2);
        this.f10212r = c0671m;
        this.f10211q = context;
    }
}
