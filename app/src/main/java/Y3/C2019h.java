package y3;

import C2.I;
import a.AbstractC0509a;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.InterfaceC0588k;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.K;
import androidx.lifecycle.N;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import m5.AbstractC1209k;
import p2.C1293c;

/* JADX INFO: renamed from: y3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2019h implements InterfaceC0597u, Y, InterfaceC0588k, E3.f {

    /* JADX INFO: renamed from: o */
    public final Context f20406o;

    /* JADX INFO: renamed from: p */
    public s f20407p;

    /* JADX INFO: renamed from: q */
    public final Bundle f20408q;

    /* JADX INFO: renamed from: r */
    public EnumC0593p f20409r;

    /* JADX INFO: renamed from: s */
    public final m f20410s;

    /* JADX INFO: renamed from: t */
    public final String f20411t;

    /* JADX INFO: renamed from: u */
    public final Bundle f20412u;

    /* JADX INFO: renamed from: v */
    public final C0599w f20413v = new C0599w(this, true);

    /* JADX INFO: renamed from: w */
    public final V.o f20414w = new V.o(new I(this, new E3.e(0, this)));

    /* JADX INFO: renamed from: x */
    public boolean f20415x;

    /* JADX INFO: renamed from: y */
    public EnumC0593p f20416y;

    /* JADX INFO: renamed from: z */
    public final N f20417z;

    public C2019h(Context context, s sVar, Bundle bundle, EnumC0593p enumC0593p, m mVar, String str, Bundle bundle2) {
        this.f20406o = context;
        this.f20407p = sVar;
        this.f20408q = bundle;
        this.f20409r = enumC0593p;
        this.f20410s = mVar;
        this.f20411t = str;
        this.f20412u = bundle2;
        Y4.m mVarO = AbstractC0509a.O(new C2018g(this, 0));
        AbstractC0509a.O(new C2018g(this, 1));
        this.f20416y = EnumC0593p.f9746p;
        this.f20417z = (N) mVarO.getValue();
    }

    @Override // E3.f
    public final V.o b() {
        return (V.o) this.f20414w.f7343q;
    }

    public final Bundle c() {
        Bundle bundle = this.f20408q;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC0588k
    public final U d() {
        return this.f20417z;
    }

    @Override // androidx.lifecycle.InterfaceC0588k
    public final C1293c e() {
        C1293c c1293c = new C1293c();
        Context context = this.f20406o;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = c1293c.f14994a;
        if (application != null) {
            linkedHashMap.put(T.f9726e, application);
        }
        linkedHashMap.put(K.f9700a, this);
        linkedHashMap.put(K.f9701b, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            linkedHashMap.put(K.f9702c, bundleC);
        }
        return c1293c;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C2019h)) {
            C2019h c2019h = (C2019h) obj;
            if (AbstractC1209k.a(this.f20411t, c2019h.f20411t) && AbstractC1209k.a(this.f20407p, c2019h.f20407p) && AbstractC1209k.a(this.f20413v, c2019h.f20413v) && AbstractC1209k.a((V.o) this.f20414w.f7343q, (V.o) c2019h.f20414w.f7343q)) {
                Bundle bundle = this.f20408q;
                Bundle bundle2 = c2019h.f20408q;
                if (AbstractC1209k.a(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!AbstractC1209k.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(EnumC0593p enumC0593p) {
        AbstractC1209k.f(enumC0593p, "maxState");
        this.f20416y = enumC0593p;
        i();
    }

    @Override // androidx.lifecycle.Y
    public final X g() {
        if (!this.f20415x) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f20413v.f9756g == EnumC0593p.f9745o) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        m mVar = this.f20410s;
        if (mVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f20411t;
        AbstractC1209k.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = mVar.f20437b;
        X x6 = (X) linkedHashMap.get(str);
        if (x6 != null) {
            return x6;
        }
        X x7 = new X();
        linkedHashMap.put(str, x7);
        return x7;
    }

    @Override // androidx.lifecycle.InterfaceC0597u
    public final K h() {
        return this.f20413v;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f20407p.hashCode() + (this.f20411t.hashCode() * 31);
        Bundle bundle = this.f20408q;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i7 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i7 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((V.o) this.f20414w.f7343q).hashCode() + ((this.f20413v.hashCode() + (iHashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f20415x) {
            V.o oVar = this.f20414w;
            ((I) oVar.f7342p).b();
            this.f20415x = true;
            if (this.f20410s != null) {
                K.f(this);
            }
            oVar.D(this.f20412u);
        }
        int iOrdinal = this.f20409r.ordinal();
        int iOrdinal2 = this.f20416y.ordinal();
        C0599w c0599w = this.f20413v;
        if (iOrdinal < iOrdinal2) {
            c0599w.t(this.f20409r);
        } else {
            c0599w.t(this.f20416y);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2019h.class.getSimpleName());
        sb.append("(" + this.f20411t + ')');
        sb.append(" destination=");
        sb.append(this.f20407p);
        String string = sb.toString();
        AbstractC1209k.e(string, "sb.toString()");
        return string;
    }
}
