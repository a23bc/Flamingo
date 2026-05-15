package Y;

import Q0.AbstractC0347f;
import c0.AbstractC0708B;
import c0.C0710b;
import c0.C0712d;
import c0.x;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import w.n0;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f8374p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ j f8375q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i7) {
        super(0);
        this.f8374p = i7;
        this.f8375q = jVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        j jVar = this.f8375q;
        switch (this.f8374p) {
            case 0:
                return ((Boolean) ((a) AbstractC0347f.i(jVar, c.f8367a)).f8356m.getValue()).booleanValue() ? ((double) AbstractC1959I.o(((C1987t) AbstractC0347f.i(jVar, e.f8369a)).f20264a)) > 0.5d ? m.f8386c : m.f8387d : m.f8388e;
            default:
                if (((l) AbstractC0347f.i(jVar, m.f8384a)) == null) {
                    x xVar = jVar.f8380I;
                    if (xVar != null) {
                        jVar.C0(xVar);
                    }
                } else if (jVar.f8380I == null) {
                    h hVar = new h(0, jVar);
                    i iVar = new i(jVar, 0);
                    n0 n0Var = c0.v.f10603a;
                    boolean z6 = AbstractC0708B.f10517a;
                    B.k kVar = jVar.f8376E;
                    boolean z7 = jVar.f8377F;
                    float f7 = jVar.f8378G;
                    x c0712d = z6 ? new C0712d(kVar, z7, f7, hVar, iVar) : new C0710b(kVar, z7, f7, hVar, iVar);
                    jVar.B0(c0712d);
                    jVar.f8380I = c0712d;
                }
                return Y4.o.f8736a;
        }
    }
}
