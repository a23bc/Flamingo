package v;

import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1612i extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ O0.m0[] f18098p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1613j f18099q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f18100r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f18101s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612i(O0.m0[] m0VarArr, C1613j c1613j, int i7, int i8) {
        super(1);
        this.f18098p = m0VarArr;
        this.f18099q = c1613j;
        this.f18100r = i7;
        this.f18101s = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        O0.l0 l0Var = (O0.l0) obj;
        for (O0.m0 m0Var : this.f18098p) {
            if (m0Var != null) {
                long jA = this.f18099q.f18107a.f18133b.a(AbstractC1107a.b(m0Var.f5416o, m0Var.f5417p), AbstractC1107a.b(this.f18100r, this.f18101s), n1.n.f14521o);
                O0.l0.h(l0Var, m0Var, (int) (jA >> 32), (int) (jA & 4294967295L));
            }
        }
        return Y4.o.f8736a;
    }
}
