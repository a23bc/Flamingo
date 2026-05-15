package p0;

import i0.InterfaceC1054b;
import i0.InterfaceC1055c;
import i0.InterfaceC1056d;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import n5.InterfaceC1240d;
import n5.InterfaceC1242f;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Set, InterfaceC1242f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f14949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14950p;

    public m(s sVar, int i7) {
        this.f14950p = i7;
        this.f14949o = sVar;
    }

    private final boolean b(Collection collection) {
        InterfaceC1056d interfaceC1056d;
        int i7;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        Collection<Map.Entry> collection2 = collection;
        int iK0 = Z4.y.k0(Z4.p.j0(collection2));
        if (iK0 < 16) {
            iK0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iK0);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        s sVar = this.f14949o;
        boolean z6 = false;
        do {
            synchronized (q.f14954b) {
                r rVar = sVar.f14957o;
                AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                interfaceC1056d = rVar2.f14955c;
                i7 = rVar2.f14956d;
            }
            AbstractC1209k.c(interfaceC1056d);
            InterfaceC1055c interfaceC1055cK = interfaceC1056d.k();
            Iterator it = sVar.f14958p.iterator();
            while (((x) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((x) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC1209k.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    interfaceC1055cK.remove(entry2.getKey());
                    z6 = true;
                }
            }
            InterfaceC1056d interfaceC1056dA = interfaceC1055cK.a();
            if (AbstractC1209k.a(interfaceC1056dA, interfaceC1056d)) {
                break;
            }
            r rVar3 = sVar.f14957o;
            AbstractC1209k.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = s.b(sVar, (r) l.x(rVar3, sVar, abstractC1289fK), i7, interfaceC1056dA);
            }
            l.o(abstractC1289fK, sVar);
        } while (!zB);
        return z6;
    }

    private final boolean c(Collection collection) {
        InterfaceC1056d interfaceC1056d;
        int i7;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        Set setO0 = Z4.n.O0(collection);
        s sVar = this.f14949o;
        boolean z6 = false;
        do {
            synchronized (q.f14954b) {
                r rVar = sVar.f14957o;
                AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                interfaceC1056d = rVar2.f14955c;
                i7 = rVar2.f14956d;
            }
            AbstractC1209k.c(interfaceC1056d);
            InterfaceC1055c interfaceC1055cK = interfaceC1056d.k();
            Iterator it = sVar.f14958p.iterator();
            while (((x) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((x) it).next();
                if (!setO0.contains(entry.getKey())) {
                    interfaceC1055cK.remove(entry.getKey());
                    z6 = true;
                }
            }
            InterfaceC1056d interfaceC1056dA = interfaceC1055cK.a();
            if (AbstractC1209k.a(interfaceC1056dA, interfaceC1056d)) {
                break;
            }
            r rVar3 = sVar.f14957o;
            AbstractC1209k.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = s.b(sVar, (r) l.x(rVar3, sVar, abstractC1289fK), i7, interfaceC1056dA);
            }
            l.o(abstractC1289fK, sVar);
        } while (!zB);
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f14950p) {
            case 0:
                q.h();
                throw null;
            case 1:
                q.h();
                throw null;
            default:
                q.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f14950p) {
            case 0:
                q.h();
                throw null;
            case 1:
                q.h();
                throw null;
            default:
                q.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f14949o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f14950p) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC1237a) && !(obj instanceof InterfaceC1240d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC1209k.a(this.f14949o.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f14949o.containsKey(obj);
            default:
                return this.f14949o.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f14950p) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f14949o.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f14949o.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f14949o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f14950p) {
            case 0:
                s sVar = this.f14949o;
                return new x(sVar, ((InterfaceC1054b) ((Z4.f) sVar.f().f14955c).entrySet()).iterator(), 0);
            case 1:
                s sVar2 = this.f14949o;
                return new x(sVar2, ((InterfaceC1054b) ((Z4.f) sVar2.f().f14955c).entrySet()).iterator(), 1);
            default:
                s sVar3 = this.f14949o;
                return new x(sVar3, ((InterfaceC1054b) ((Z4.f) sVar3.f().f14955c).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        switch (this.f14950p) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC1237a) || (obj instanceof InterfaceC1240d))) {
                    if (this.f14949o.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                    break;
                }
                break;
            case 1:
                if (this.f14949o.remove(obj) != null) {
                }
                break;
            default:
                s sVar = this.f14949o;
                Iterator it = sVar.f14958p.iterator();
                while (true) {
                    if (((x) it).hasNext()) {
                        next = ((x) it).next();
                        if (AbstractC1209k.a(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    sVar.remove(entry.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        InterfaceC1056d interfaceC1056d;
        int i7;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        switch (this.f14950p) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z6 = false;
                    while (it.hasNext()) {
                        if (this.f14949o.remove(((Map.Entry) it.next()).getKey()) != null || z6) {
                            z6 = true;
                        }
                    }
                    return z6;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z7 = false;
                    while (it2.hasNext()) {
                        if (this.f14949o.remove(it2.next()) != null || z7) {
                            z7 = true;
                        }
                    }
                    return z7;
                }
                break;
            default:
                Set setO0 = Z4.n.O0(collection);
                s sVar = this.f14949o;
                boolean z8 = false;
                do {
                    synchronized (q.f14954b) {
                        r rVar = sVar.f14957o;
                        AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.i(rVar);
                        interfaceC1056d = rVar2.f14955c;
                        i7 = rVar2.f14956d;
                    }
                    AbstractC1209k.c(interfaceC1056d);
                    InterfaceC1055c interfaceC1055cK = interfaceC1056d.k();
                    Iterator it3 = sVar.f14958p.iterator();
                    while (((x) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((x) it3).next();
                        if (setO0.contains(entry.getValue())) {
                            interfaceC1055cK.remove(entry.getKey());
                            z8 = true;
                        }
                    }
                    InterfaceC1056d interfaceC1056dA = interfaceC1055cK.a();
                    if (!AbstractC1209k.a(interfaceC1056dA, interfaceC1056d)) {
                        r rVar3 = sVar.f14957o;
                        AbstractC1209k.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f14941c) {
                            abstractC1289fK = l.k();
                            zB = s.b(sVar, (r) l.x(rVar3, sVar, abstractC1289fK), i7, interfaceC1056dA);
                        }
                        l.o(abstractC1289fK, sVar);
                    }
                    return z8;
                } while (!zB);
                return z8;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        InterfaceC1056d interfaceC1056d;
        int i7;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        switch (this.f14950p) {
            case 0:
                return b(collection);
            case 1:
                return c(collection);
            default:
                Set setO0 = Z4.n.O0(collection);
                s sVar = this.f14949o;
                boolean z6 = false;
                do {
                    synchronized (q.f14954b) {
                        r rVar = sVar.f14957o;
                        AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.i(rVar);
                        interfaceC1056d = rVar2.f14955c;
                        i7 = rVar2.f14956d;
                    }
                    AbstractC1209k.c(interfaceC1056d);
                    InterfaceC1055c interfaceC1055cK = interfaceC1056d.k();
                    Iterator it = sVar.f14958p.iterator();
                    while (((x) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((x) it).next();
                        if (!setO0.contains(entry.getValue())) {
                            interfaceC1055cK.remove(entry.getKey());
                            z6 = true;
                        }
                    }
                    InterfaceC1056d interfaceC1056dA = interfaceC1055cK.a();
                    if (!AbstractC1209k.a(interfaceC1056dA, interfaceC1056d)) {
                        r rVar3 = sVar.f14957o;
                        AbstractC1209k.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f14941c) {
                            abstractC1289fK = l.k();
                            zB = s.b(sVar, (r) l.x(rVar3, sVar, abstractC1289fK), i7, interfaceC1056dA);
                        }
                        l.o(abstractC1289fK, sVar);
                    }
                    return z6;
                } while (!zB);
                return z6;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f14949o.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1208j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1208j.b(this, objArr);
    }
}
