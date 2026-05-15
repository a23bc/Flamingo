package w3;

import android.os.Looper;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.d0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1719d0 implements InterfaceC1722e0, InterfaceC1763z0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ t2.T f19171o;

    public /* synthetic */ C1719d0(t2.T t7) {
        this.f19171o = t7;
    }

    @Override // w3.InterfaceC1763z0
    public void e(InterfaceC1746q0 interfaceC1746q0, int i7) {
        interfaceC1746q0.e(i7, this.f19171o);
    }

    @Override // w3.InterfaceC1722e0
    public void h(U u7) {
        boolean z6;
        if (u7.H0()) {
            t2.T t7 = u7.f19075s;
            t2.T t8 = this.f19171o;
            if (w2.t.a(t7, t8)) {
                return;
            }
            u7.f19075s = t8;
            t2.T t9 = u7.f19076t;
            t2.T tO0 = U.O0(u7.f19074r, t8);
            u7.f19076t = tO0;
            if (tO0.equals(t9)) {
                z6 = false;
            } else {
                E4.b0 b0Var = u7.f19072p;
                E4.b0 b0VarA = C1709a.a(u7.f19071o, u7.f19073q, u7.f19076t);
                u7.f19072p = b0VarA;
                z6 = !b0VarA.equals(b0Var);
                u7.h.f(13, new C1700C(u7, 15));
            }
            if (z6) {
                C1760y c1760y = u7.f19059a;
                c1760y.getClass();
                AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
                c1760y.f19400d.k();
            }
        }
    }
}
