package androidx.lifecycle;

import a5.C0525e;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1209k;
import m5.AbstractC1221w;
import p2.C1293c;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a */
    public static final N2.z f9700a = new N2.z();

    /* JADX INFO: renamed from: b */
    public static final N2.z f9701b = new N2.z();

    /* JADX INFO: renamed from: c */
    public static final N2.z f9702c = new N2.z();

    /* JADX INFO: renamed from: d */
    public static final r2.c f9703d = new r2.c();

    public K() {
        new AtomicReference(null);
    }

    public static final void b(Q q7, V.o oVar, K k7) {
        AbstractC1209k.f(oVar, "registry");
        AbstractC1209k.f(k7, "lifecycle");
        J j3 = (J) q7.c("androidx.lifecycle.savedstate.vm.tag");
        if (j3 == null || j3.f9699q) {
            return;
        }
        j3.n(oVar, k7);
        o(oVar, k7);
    }

    public static final J c(V.o oVar, K k7, String str, Bundle bundle) {
        AbstractC1209k.f(oVar, "registry");
        AbstractC1209k.f(k7, "lifecycle");
        J j3 = new J(str, d(oVar.f(str), bundle));
        j3.n(oVar, k7);
        o(oVar, k7);
        return j3;
    }

    public static I d(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new I();
        }
        ClassLoader classLoader = I.class.getClassLoader();
        AbstractC1209k.c(classLoader);
        bundle.setClassLoader(classLoader);
        C0525e c0525e = new C0525e(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC1209k.c(str);
            c0525e.put(str, bundle.get(str));
        }
        c0525e.c();
        c0525e.f8863A = true;
        if (c0525e.f8872w <= 0) {
            c0525e = C0525e.f8862B;
            AbstractC1209k.d(c0525e, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return new I(c0525e);
    }

    public static final I e(C1293c c1293c) {
        N2.z zVar = f9700a;
        LinkedHashMap linkedHashMap = c1293c.f14994a;
        E3.f fVar = (E3.f) linkedHashMap.get(zVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y6 = (Y) linkedHashMap.get(f9701b);
        if (y6 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f9702c);
        String str = (String) linkedHashMap.get(W.f9728b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        E3.d dVarW = fVar.b().w();
        Bundle bundle2 = null;
        L l = dVarW instanceof L ? (L) dVarW : null;
        if (l == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = k(y6).f9708b;
        I i7 = (I) linkedHashMap2.get(str);
        if (i7 != null) {
            return i7;
        }
        l.b();
        Bundle bundle3 = l.f9706c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = android.support.v4.media.session.b.f((Y4.h[]) Arrays.copyOf(new Y4.h[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                l.f9706c = null;
            }
            bundle2 = bundle4;
        }
        I iD = d(bundle2, bundle);
        linkedHashMap2.put(str, iD);
        return iD;
    }

    public static final void f(E3.f fVar) {
        EnumC0593p enumC0593pI = fVar.h().i();
        if (enumC0593pI != EnumC0593p.f9746p && enumC0593pI != EnumC0593p.f9747q) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.b().w() == null) {
            L l = new L(fVar.b(), (Y) fVar);
            fVar.b().G("androidx.lifecycle.internal.SavedStateHandlesProvider", l);
            fVar.h().a(new C0582e(1, l));
        }
    }

    public static final InterfaceC0597u g(View view) {
        AbstractC1209k.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0597u interfaceC0597u = tag instanceof InterfaceC0597u ? (InterfaceC0597u) tag : null;
            if (interfaceC0597u != null) {
                return interfaceC0597u;
            }
            Object objB = N5.l.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static final Y h(View view) {
        AbstractC1209k.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            Y y6 = tag instanceof Y ? (Y) tag : null;
            if (y6 != null) {
                return y6;
            }
            Object objB = N5.l.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static final M k(Y y6) {
        W wH = N2.z.h(y6, new Y1.s(1), 4);
        return (M) ((U3.h) wH.f9729a).X(AbstractC1221w.a(M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void m(View view, InterfaceC0597u interfaceC0597u) {
        AbstractC1209k.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0597u);
    }

    public static final void n(View view, Y y6) {
        AbstractC1209k.f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, y6);
    }

    public static void o(V.o oVar, K k7) {
        EnumC0593p enumC0593pI = k7.i();
        if (enumC0593pI == EnumC0593p.f9746p || enumC0593pI.compareTo(EnumC0593p.f9748r) >= 0) {
            oVar.H();
        } else {
            k7.a(new C0585h(oVar, k7));
        }
    }

    public abstract void a(InterfaceC0596t interfaceC0596t);

    public abstract EnumC0593p i();

    public z5.u j() {
        z5.J jB = z5.z.b(i());
        a(new G3.a(1, jB));
        return new z5.u(jB);
    }

    public abstract void l(InterfaceC0596t interfaceC0596t);
}
