package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import m5.C1203e;
import p2.C1293c;

/* JADX INFO: loaded from: classes.dex */
public final class N extends V implements U {

    /* JADX INFO: renamed from: a */
    public final Application f9709a;

    /* JADX INFO: renamed from: b */
    public final T f9710b;

    /* JADX INFO: renamed from: c */
    public final Bundle f9711c;

    /* JADX INFO: renamed from: d */
    public final K f9712d;

    /* JADX INFO: renamed from: e */
    public final V.o f9713e;

    public N(Application application, E3.f fVar, Bundle bundle) {
        T t7;
        AbstractC1209k.f(fVar, "owner");
        this.f9713e = fVar.b();
        this.f9712d = fVar.h();
        this.f9711c = bundle;
        this.f9709a = application;
        if (application != null) {
            if (T.f9725d == null) {
                T.f9725d = new T(application);
            }
            t7 = T.f9725d;
            AbstractC1209k.c(t7);
        } else {
            t7 = new T(null);
        }
        this.f9710b = t7;
    }

    @Override // androidx.lifecycle.U
    public final Q a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.U
    public final Q b(Class cls, C1293c c1293c) {
        N2.z zVar = W.f9728b;
        LinkedHashMap linkedHashMap = c1293c.f14994a;
        String str = (String) linkedHashMap.get(zVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(K.f9700a) == null || linkedHashMap.get(K.f9701b) == null) {
            if (this.f9712d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(T.f9726e);
        boolean zIsAssignableFrom = AbstractC0578a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? O.a(cls, O.f9715b) : O.a(cls, O.f9714a);
        return constructorA == null ? this.f9710b.b(cls, c1293c) : (!zIsAssignableFrom || application == null) ? O.b(cls, constructorA, K.e(c1293c)) : O.b(cls, constructorA, application, K.e(c1293c));
    }

    @Override // androidx.lifecycle.U
    public final Q c(C1203e c1203e, C1293c c1293c) {
        return b(AbstractC1113a.G(c1203e), c1293c);
    }

    @Override // androidx.lifecycle.V
    public final void d(Q q7) {
        K k7 = this.f9712d;
        if (k7 != null) {
            V.o oVar = this.f9713e;
            AbstractC1209k.c(oVar);
            K.b(q7, oVar, k7);
        }
    }

    public final Q e(Class cls, String str) {
        K k7 = this.f9712d;
        if (k7 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0578a.class.isAssignableFrom(cls);
        Application application = this.f9709a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? O.a(cls, O.f9715b) : O.a(cls, O.f9714a);
        if (constructorA == null) {
            if (application != null) {
                return this.f9710b.a(cls);
            }
            if (Y1.s.f8656b == null) {
                Y1.s.f8656b = new Y1.s(2);
            }
            AbstractC1209k.c(Y1.s.f8656b);
            return i6.g.s(cls);
        }
        V.o oVar = this.f9713e;
        AbstractC1209k.c(oVar);
        J jC = K.c(oVar, k7, str, this.f9711c);
        I i7 = jC.f9698p;
        Q qB = (!zIsAssignableFrom || application == null) ? O.b(cls, constructorA, i7) : O.b(cls, constructorA, application, i7);
        qB.a("androidx.lifecycle.savedstate.vm.tag", jC);
        return qB;
    }
}
