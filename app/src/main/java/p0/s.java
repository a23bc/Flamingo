package p0;

import i0.InterfaceC1055c;
import i0.InterfaceC1056d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import k0.C1126c;
import k0.C1128e;
import m5.AbstractC1209k;
import n5.InterfaceC1241e;

/* JADX INFO: loaded from: classes.dex */
public final class s implements y, Map, InterfaceC1241e {

    /* JADX INFO: renamed from: o */
    public r f14957o;

    /* JADX INFO: renamed from: p */
    public final m f14958p;

    /* JADX INFO: renamed from: q */
    public final m f14959q;

    /* JADX INFO: renamed from: r */
    public final m f14960r;

    public s() {
        C1126c c1126c = C1126c.f13971q;
        AbstractC1289f abstractC1289fK = l.k();
        r rVar = new r(abstractC1289fK.g(), c1126c);
        if (!(abstractC1289fK instanceof C1284a)) {
            rVar.f14890b = new r(1, c1126c);
        }
        this.f14957o = rVar;
        this.f14958p = new m(this, 0);
        this.f14959q = new m(this, 1);
        this.f14960r = new m(this, 2);
    }

    public static final boolean b(s sVar, r rVar, int i7, InterfaceC1056d interfaceC1056d) {
        boolean z6;
        sVar.getClass();
        synchronized (q.f14954b) {
            int i8 = rVar.f14956d;
            if (i8 == i7) {
                rVar.f14955c = interfaceC1056d;
                z6 = true;
                rVar.f14956d = i8 + 1;
            } else {
                z6 = false;
            }
        }
        return z6;
    }

    public static void d(r rVar) {
        C1126c c1126c = C1126c.f13971q;
        synchronized (q.f14954b) {
            rVar.f14955c = c1126c;
            rVar.f14956d++;
        }
    }

    @Override // p0.y
    public final AbstractC1280A c() {
        return this.f14957o;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC1289f abstractC1289fK;
        r rVar = this.f14957o;
        AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        if (C1126c.f13971q != ((r) l.i(rVar)).f14955c) {
            r rVar2 = this.f14957o;
            AbstractC1209k.d(rVar2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                d((r) l.x(rVar2, this, abstractC1289fK));
            }
            l.o(abstractC1289fK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f().f14955c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return f().f14955c.containsValue(obj);
    }

    @Override // p0.y
    public final /* synthetic */ AbstractC1280A e(AbstractC1280A abstractC1280A, AbstractC1280A abstractC1280A2, AbstractC1280A abstractC1280A3) {
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f14958p;
    }

    public final r f() {
        r rVar = this.f14957o;
        AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (r) l.u(rVar, this);
    }

    @Override // p0.y
    public final void g(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f14957o = (r) abstractC1280A;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return f().f14955c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((Z4.f) f().f14955c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f14959q;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC1056d interfaceC1056d;
        int i7;
        Object objPut;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14954b) {
                r rVar = this.f14957o;
                AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                interfaceC1056d = rVar2.f14955c;
                i7 = rVar2.f14956d;
            }
            AbstractC1209k.c(interfaceC1056d);
            C1128e c1128e = (C1128e) interfaceC1056d.k();
            objPut = c1128e.put(obj, obj2);
            InterfaceC1056d interfaceC1056dA = c1128e.a();
            if (AbstractC1209k.a(interfaceC1056dA, interfaceC1056d)) {
                break;
            }
            r rVar3 = this.f14957o;
            AbstractC1209k.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = b(this, (r) l.x(rVar3, this, abstractC1289fK), i7, interfaceC1056dA);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        InterfaceC1056d interfaceC1056d;
        int i7;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14954b) {
                r rVar = this.f14957o;
                AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                interfaceC1056d = rVar2.f14955c;
                i7 = rVar2.f14956d;
            }
            AbstractC1209k.c(interfaceC1056d);
            C1128e c1128e = (C1128e) interfaceC1056d.k();
            c1128e.putAll(map);
            InterfaceC1056d interfaceC1056dA = c1128e.a();
            if (AbstractC1209k.a(interfaceC1056dA, interfaceC1056d)) {
                return;
            }
            r rVar3 = this.f14957o;
            AbstractC1209k.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = b(this, (r) l.x(rVar3, this, abstractC1289fK), i7, interfaceC1056dA);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        InterfaceC1056d interfaceC1056d;
        int i7;
        Object objRemove;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14954b) {
                r rVar = this.f14957o;
                AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                interfaceC1056d = rVar2.f14955c;
                i7 = rVar2.f14956d;
            }
            AbstractC1209k.c(interfaceC1056d);
            InterfaceC1055c interfaceC1055cK = interfaceC1056d.k();
            objRemove = interfaceC1055cK.remove(obj);
            InterfaceC1056d interfaceC1056dA = interfaceC1055cK.a();
            if (AbstractC1209k.a(interfaceC1056dA, interfaceC1056d)) {
                break;
            }
            r rVar3 = this.f14957o;
            AbstractC1209k.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = b(this, (r) l.x(rVar3, this, abstractC1289fK), i7, interfaceC1056dA);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        Z4.f fVar = (Z4.f) f().f14955c;
        fVar.getClass();
        return ((C1126c) fVar).f13973p;
    }

    public final String toString() {
        r rVar = this.f14957o;
        AbstractC1209k.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((r) l.i(rVar)).f14955c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f14960r;
    }
}
