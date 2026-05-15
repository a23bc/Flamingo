package y3;

import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import m5.AbstractC1209k;
import m5.C1203e;
import p2.C1293c;

/* JADX INFO: renamed from: y3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2016e extends V implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V.o f20401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f20402b;

    @Override // androidx.lifecycle.U
    public final Q a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f20402b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        V.o oVar = this.f20401a;
        AbstractC1209k.c(oVar);
        K k7 = this.f20402b;
        AbstractC1209k.c(k7);
        J jC = K.c(oVar, k7, canonicalName, null);
        C2017f c2017f = new C2017f(jC.f9698p);
        c2017f.a("androidx.lifecycle.savedstate.vm.tag", jC);
        return c2017f;
    }

    @Override // androidx.lifecycle.U
    public final Q b(Class cls, C1293c c1293c) {
        String str = (String) c1293c.f14994a.get(W.f9728b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        V.o oVar = this.f20401a;
        if (oVar == null) {
            return new C2017f(K.e(c1293c));
        }
        AbstractC1209k.c(oVar);
        K k7 = this.f20402b;
        AbstractC1209k.c(k7);
        J jC = K.c(oVar, k7, str, null);
        C2017f c2017f = new C2017f(jC.f9698p);
        c2017f.a("androidx.lifecycle.savedstate.vm.tag", jC);
        return c2017f;
    }

    @Override // androidx.lifecycle.U
    public final /* synthetic */ Q c(C1203e c1203e, C1293c c1293c) {
        return Z1.l.a(this, c1203e, c1293c);
    }

    @Override // androidx.lifecycle.V
    public final void d(Q q7) {
        V.o oVar = this.f20401a;
        if (oVar != null) {
            K k7 = this.f20402b;
            AbstractC1209k.c(k7);
            K.b(q7, oVar, k7);
        }
    }
}
