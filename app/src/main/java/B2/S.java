package b2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f10109o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Set f10110p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Set set, c5.d dVar) {
        super(2, dVar);
        this.f10110p = set;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        S s7 = new S(this.f10110p, dVar);
        s7.f10109o = obj;
        return s7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((R1.b) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Set linkedHashSet;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        R1.b bVar = (R1.b) this.f10109o;
        Set set = (Set) bVar.a(W.f10127g);
        if (set != null) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set2) {
                if (!this.f10110p.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                Map mapUnmodifiableMap = Collections.unmodifiableMap(bVar.f6654a);
                AbstractC1209k.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
                LinkedHashMap linkedHashMapQ0 = Z4.y.q0(mapUnmodifiableMap);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                R1.e eVar = W.f10127g;
                if (arrayList.isEmpty()) {
                    linkedHashSet = Z4.n.O0(set2);
                } else if (arrayList instanceof Set) {
                    linkedHashSet = new LinkedHashSet();
                    for (Object obj3 : set2) {
                        if (!arrayList.contains(obj3)) {
                            linkedHashSet.add(obj3);
                        }
                    }
                } else {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
                    linkedHashSet2.removeAll(arrayList);
                    linkedHashSet = linkedHashSet2;
                }
                Set set3 = linkedHashSet;
                AbstractC1209k.f(eVar, "key");
                if (atomicBoolean.get()) {
                    throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
                }
                if (set3 instanceof Set) {
                    Set setUnmodifiableSet = Collections.unmodifiableSet(Z4.n.O0(set3));
                    AbstractC1209k.e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
                    linkedHashMapQ0.put(eVar, setUnmodifiableSet);
                } else {
                    linkedHashMapQ0.put(eVar, set3);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    R1.e eVarB = C0645O.b(W.f10124d, (String) it.next());
                    if (atomicBoolean.get()) {
                        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
                    }
                    linkedHashMapQ0.remove(eVarB);
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(linkedHashMapQ0);
                AbstractC1209k.e(mapUnmodifiableMap2, "unmodifiableMap(preferencesMap)");
                return new R1.b(Z4.y.q0(mapUnmodifiableMap2), true);
            }
        }
        return bVar;
    }
}
