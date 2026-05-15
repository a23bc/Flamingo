package E4;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends K {
    @Override // E4.K
    public final D e() {
        throw new AssertionError("should never be called");
    }

    @Override // E4.K
    /* JADX INFO: renamed from: f */
    public final D values() {
        a0 a0Var = ((a0) this).f1911v;
        M m7 = a0Var.f1875p;
        if (m7 != null) {
            return m7;
        }
        e0 e0VarD = a0Var.d();
        a0Var.f1875p = e0VarD;
        return e0VarD;
    }

    @Override // E4.K, java.util.Map
    public final Collection values() {
        a0 a0Var = ((a0) this).f1911v;
        M m7 = a0Var.f1875p;
        if (m7 != null) {
            return m7;
        }
        e0 e0VarD = a0Var.d();
        a0Var.f1875p = e0VarD;
        return e0VarD;
    }
}
