package A2;

import android.os.Looper;
import java.util.Objects;
import w2.AbstractC1697a;
import w3.C1709a;
import w3.C1760y;
import w3.InterfaceC1722e0;
import w3.InterfaceC1756w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements w2.g, InterfaceC1722e0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f72o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f73p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f74q;

    public /* synthetic */ E(int i7, int i8, Object obj) {
        this.f72o = i8;
        this.f74q = obj;
        this.f73p = i7;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f72o) {
            case 0:
                v3.J(((o0) this.f74q).f389a, this.f73p);
                break;
            default:
                v3.E(this.f73p, (t2.G) this.f74q);
                break;
        }
    }

    @Override // w3.InterfaceC1722e0
    public void h(w3.U u7) {
        if (u7.H0()) {
            E4.b0 b0Var = u7.f19072p;
            E4.b0 b0Var2 = (E4.b0) this.f74q;
            u7.f19071o = E4.I.p(b0Var2);
            E4.b0 b0VarA = C1709a.a(b0Var2, u7.f19073q, u7.f19076t);
            u7.f19072p = b0VarA;
            boolean zEquals = Objects.equals(b0VarA, b0Var);
            C1760y c1760y = u7.f19059a;
            c1760y.getClass();
            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
            E4.b0 b0Var3 = u7.f19072p;
            InterfaceC1756w interfaceC1756w = c1760y.f19400d;
            I4.v vVarM = interfaceC1756w.m(c1760y, b0Var3);
            if (!zEquals) {
                interfaceC1756w.k();
            }
            vVarM.b(new k0(u7, vVarM, this.f73p, 6), I4.r.f3531o);
        }
    }

    public /* synthetic */ E(int i7, E4.b0 b0Var) {
        this.f72o = 2;
        this.f73p = i7;
        this.f74q = b0Var;
    }
}
