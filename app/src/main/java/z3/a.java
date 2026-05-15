package z3;

import androidx.lifecycle.A;
import androidx.lifecycle.I;
import androidx.lifecycle.Q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import m5.AbstractC1209k;
import o0.InterfaceC1246c;
import o2.AbstractC1260a;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f21138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f21139d;

    public a(I i7) {
        Object value;
        AbstractC1209k.f(i7, "handle");
        this.f21137b = "SaveableStateHolder_BackStackEntryKey";
        F5.t tVar = i7.f9696b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f2441p;
        try {
            z5.s sVar = (z5.s) ((LinkedHashMap) tVar.f2444s).get("SaveableStateHolder_BackStackEntryKey");
            if (sVar == null || (value = ((J) sVar).getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) tVar.f2443r).remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        UUID uuidRandomUUID = (UUID) value;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            String str = this.f21137b;
            AbstractC1209k.f(str, "key");
            if (uuidRandomUUID != null) {
                ArrayList arrayList = AbstractC1260a.f14660a;
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(uuidRandomUUID)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + uuidRandomUUID.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = AbstractC1260a.f14660a;
            Object obj = i7.f9695a.get(str);
            A a4 = obj instanceof A ? (A) obj : null;
            if (a4 != null) {
                a4.a(uuidRandomUUID);
            }
            tVar.r(uuidRandomUUID, str);
            AbstractC1209k.e(uuidRandomUUID, "randomUUID().also { handle.set(IdKey, it) }");
        }
        this.f21138c = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.Q
    public final void d() {
        WeakReference weakReference = this.f21139d;
        if (weakReference == null) {
            AbstractC1209k.m("saveableStateHolderRef");
            throw null;
        }
        InterfaceC1246c interfaceC1246c = (InterfaceC1246c) weakReference.get();
        if (interfaceC1246c != null) {
            interfaceC1246c.b(this.f21138c);
        }
        WeakReference weakReference2 = this.f21139d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            AbstractC1209k.m("saveableStateHolderRef");
            throw null;
        }
    }
}
