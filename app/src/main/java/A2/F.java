package A2;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import k.C1116d;
import t2.BinderC1478g;
import w2.AbstractC1697a;
import w3.AbstractC1748s;
import w3.B1;
import w3.BinderC1724f0;
import w3.C1747r0;
import w3.C1751t0;
import w3.C1760y;
import w3.InterfaceC1722e0;
import w3.InterfaceC1728h0;
import w3.InterfaceC1741o;
import w3.J0;
import w3.K0;
import w3.RunnableC1736l0;
import w3.v1;
import x3.C1910L;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements w2.g, w3.S, InterfaceC1722e0, InterfaceC1728h0, J0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f75o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f76p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f77q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f78r;

    public /* synthetic */ F(int i7, Object obj, Object obj2, int i8) {
        this.f75o = i8;
        this.f76p = i7;
        this.f77q = obj;
        this.f78r = obj2;
    }

    @Override // w3.InterfaceC1728h0
    public void a(C1.k kVar) {
        C1116d c1116d = (C1116d) this.f77q;
        ((C2.O) c1116d.f13888g).execute(new RunnableC1736l0(this.f76p, 0, c1116d, (C1751t0) this.f78r, kVar));
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        int i7 = this.f76p;
        v3.i(i7);
        v3.C((t2.W) this.f77q, (t2.W) this.f78r, i7);
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f75o) {
            case 1:
                w3.U u7 = (w3.U) this.f77q;
                u7.getClass();
                E4.F fO = E4.I.o();
                int i8 = 0;
                while (true) {
                    List list = (List) this.f78r;
                    if (i8 >= list.size()) {
                        interfaceC1741o.p0(u7.f19061c, i7, this.f76p, new BinderC1478g(fO.f()));
                    } else {
                        fO.a(((t2.G) list.get(i8)).b(true));
                        i8++;
                    }
                    break;
                }
                break;
            default:
                w3.U u8 = (w3.U) this.f77q;
                B1 b12 = u8.f19068k;
                b12.getClass();
                int iS = b12.f18932a.s();
                int i9 = this.f76p;
                t2.G g6 = (t2.G) this.f78r;
                BinderC1724f0 binderC1724f0 = u8.f19061c;
                if (iS < 2) {
                    interfaceC1741o.G(binderC1724f0, i7, i9 + 1, g6.b(true));
                    interfaceC1741o.e1(binderC1724f0, i7, i9);
                } else {
                    interfaceC1741o.T(binderC1724f0, i7, i9, g6.b(true));
                }
                break;
        }
    }

    @Override // w3.J0
    public void f(C1747r0 c1747r0) {
        K0 k02 = (K0) this.f77q;
        k02.getClass();
        C1910L c1910l = (C1910L) this.f78r;
        if (TextUtils.isEmpty(c1910l.f19984o)) {
            AbstractC1697a.w("onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        I4.y yVarJ = k02.f19002g.j(c1747r0, E4.I.t(AbstractC1748s.i(c1910l)));
        D4.i iVar = new D4.i(k02, c1747r0, this.f76p);
        yVarJ.b(new I4.t(yVarJ, 0, iVar), I4.r.f3531o);
    }

    @Override // w3.InterfaceC1722e0
    public void h(w3.U u7) {
        if (u7.H0()) {
            v1 v1Var = (v1) this.f77q;
            Bundle bundle = (Bundle) this.f78r;
            C1760y c1760y = u7.f19059a;
            c1760y.getClass();
            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
            I4.v vVarA = c1760y.f19400d.A(c1760y, v1Var, bundle);
            int i7 = this.f76p;
            u7.getClass();
            vVarA.b(new k0(u7, vVarA, i7, 6), I4.r.f3531o);
        }
    }

    public /* synthetic */ F(Object obj, int i7, Object obj2, int i8) {
        this.f75o = i8;
        this.f77q = obj;
        this.f76p = i7;
        this.f78r = obj2;
    }

    public /* synthetic */ F(K0 k02, C1910L c1910l, int i7) {
        this.f75o = 5;
        this.f77q = k02;
        this.f78r = c1910l;
        this.f76p = i7;
    }
}
