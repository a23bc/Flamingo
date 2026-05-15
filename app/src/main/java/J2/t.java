package J2;

import A2.u0;
import t2.p0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a */
    public final int f3733a;

    /* JADX INFO: renamed from: b */
    public final u0[] f3734b;

    /* JADX INFO: renamed from: c */
    public final q[] f3735c;

    /* JADX INFO: renamed from: d */
    public final p0 f3736d;

    /* JADX INFO: renamed from: e */
    public final r f3737e;

    public t(u0[] u0VarArr, q[] qVarArr, p0 p0Var, r rVar) {
        AbstractC1697a.d(u0VarArr.length == qVarArr.length);
        this.f3734b = u0VarArr;
        this.f3735c = (q[]) qVarArr.clone();
        this.f3736d = p0Var;
        this.f3737e = rVar;
        this.f3733a = u0VarArr.length;
    }

    public final boolean a(t tVar, int i7) {
        return tVar != null && w2.t.a(this.f3734b[i7], tVar.f3734b[i7]) && w2.t.a(this.f3735c[i7], tVar.f3735c[i7]);
    }

    public final boolean b(int i7) {
        return this.f3734b[i7] != null;
    }
}
