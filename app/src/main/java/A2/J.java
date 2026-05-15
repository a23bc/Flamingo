package A2;

import t2.C1486o;
import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements w2.g {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f81o = 1;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ t2.s0 f82p;

    public /* synthetic */ J(B2.a aVar, t2.s0 s0Var) {
        this.f82p = s0Var;
    }

    @Override // w2.g
    public final void b(Object obj) {
        switch (this.f81o) {
            case 0:
                ((t2.V) obj).F(this.f82p);
                break;
            default:
                B2.n nVar = (B2.n) obj;
                V.o oVar = nVar.f794o;
                t2.s0 s0Var = this.f82p;
                if (oVar != null) {
                    C1487p c1487p = (C1487p) oVar.f7342p;
                    if (c1487p.f16708t == -1) {
                        C1486o c1486oA = c1487p.a();
                        c1486oA.f16632r = s0Var.f16729a;
                        c1486oA.f16633s = s0Var.f16730b;
                        nVar.f794o = new V.o(new C1487p(c1486oA), 4, (String) oVar.f7343q);
                    }
                }
                int i7 = s0Var.f16729a;
                break;
        }
    }

    public /* synthetic */ J(t2.s0 s0Var) {
        this.f82p = s0Var;
    }
}
