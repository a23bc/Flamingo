package E3;

import V.o;
import Z1.l;
import android.os.Bundle;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.K;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import d.AbstractActivityC0759l;
import d.C0755h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0595s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f1855p;

    public /* synthetic */ b(f fVar, int i7) {
        this.f1854o = i7;
        this.f1855p = fVar;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        switch (this.f1854o) {
            case 0:
                if (enumC0592o != EnumC0592o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0597u.h().l(this);
                f fVar = this.f1855p;
                Bundle bundleF = fVar.b().f("androidx.savedstate.Restarter");
                if (bundleF == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleF.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        AbstractC1209k.c(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                                AbstractC1209k.c(objNewInstance);
                                if (!(fVar instanceof Y)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + fVar).toString());
                                }
                                X xG = ((Y) fVar).g();
                                o oVarB = fVar.b();
                                LinkedHashMap linkedHashMap = xG.f9730a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    AbstractC1209k.f(str2, "key");
                                    Q q7 = (Q) linkedHashMap.get(str2);
                                    if (q7 != null) {
                                        K.b(q7, oVarB, fVar.h());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    oVarB.H();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException("Failed to instantiate " + str, e7);
                            }
                        } catch (NoSuchMethodException e8) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException(l.q("Class ", str, " wasn't found"), e9);
                    }
                }
                return;
            default:
                AbstractActivityC0759l abstractActivityC0759l = (AbstractActivityC0759l) this.f1855p;
                if (abstractActivityC0759l.f10787s == null) {
                    C0755h c0755h = (C0755h) abstractActivityC0759l.getLastNonConfigurationInstance();
                    if (c0755h != null) {
                        abstractActivityC0759l.f10787s = c0755h.f10763a;
                    }
                    if (abstractActivityC0759l.f10787s == null) {
                        abstractActivityC0759l.f10787s = new X();
                    }
                }
                abstractActivityC0759l.f17150o.l(this);
                return;
        }
    }
}
