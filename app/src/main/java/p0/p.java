package p0;

import android.os.Parcel;
import android.os.Parcelable;
import f0.AbstractC0908q0;
import j0.AbstractC1092c;
import j0.C1091b;
import j0.C1095f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1239c;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable, y, List, RandomAccess, InterfaceC1239c {
    public static final Parcelable.Creator<p> CREATOR = new o(0);

    /* JADX INFO: renamed from: o */
    public v f14952o;

    public p(AbstractC1092c abstractC1092c) {
        AbstractC1289f abstractC1289fK = l.k();
        v vVar = new v(abstractC1289fK.g(), abstractC1092c);
        if (!(abstractC1289fK instanceof C1284a)) {
            vVar.f14890b = new v(1, abstractC1092c);
        }
        this.f14952o = vVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i7 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            AbstractC1092c abstractC1092cE = abstractC1092c.e(obj);
            if (abstractC1092cE.equals(abstractC1092c)) {
                return false;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i7, abstractC1092cE, true);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return q.g(this, new F.w(i7, collection));
    }

    @Override // p0.y
    public final AbstractC1280A c() {
        return this.f14952o;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC1289f abstractC1289fK;
        v vVar = this.f14952o;
        AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (l.f14941c) {
            abstractC1289fK = l.k();
            v vVar2 = (v) l.x(vVar, this, abstractC1289fK);
            synchronized (q.f14953a) {
                vVar2.f14980c = j0.i.f13642p;
                vVar2.f14981d++;
                vVar2.f14982e++;
            }
        }
        l.o(abstractC1289fK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return q.e(this).f14980c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return q.e(this).f14980c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p0.y
    public final /* synthetic */ AbstractC1280A e(AbstractC1280A abstractC1280A, AbstractC1280A abstractC1280A2, AbstractC1280A abstractC1280A3) {
        return null;
    }

    @Override // p0.y
    public final void g(AbstractC1280A abstractC1280A) {
        abstractC1280A.f14890b = this.f14952o;
        this.f14952o = (v) abstractC1280A;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return q.e(this).f14980c.get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return q.e(this).f14980c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return q.e(this).f14980c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return q.e(this).f14980c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new Q0.r(this, 0);
    }

    public final void o(int i7, int i8) {
        int i9;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i9 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            C1095f c1095fI = abstractC1092c.i();
            c1095fI.subList(i7, i8).clear();
            AbstractC1092c abstractC1092cE = c1095fI.e();
            if (AbstractC1209k.a(abstractC1092cE, abstractC1092c)) {
                return;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i9, abstractC1092cE, true);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        int i8;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        Object obj = get(i7);
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i8 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            AbstractC1092c abstractC1092cO = abstractC1092c.o(i7);
            if (abstractC1092cO.equals(abstractC1092c)) {
                break;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i8, abstractC1092cO, true);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i7 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            AbstractC1092c abstractC1092cN = abstractC1092c.n(new C1091b(0, collection));
            if (AbstractC1209k.a(abstractC1092cN, abstractC1092c)) {
                return false;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i7, abstractC1092cN, true);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return q.g(this, new C1091b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        int i8;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        Object obj2 = get(i7);
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i8 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            AbstractC1092c abstractC1092cP = abstractC1092c.p(i7, obj);
            if (abstractC1092cP.equals(abstractC1092c)) {
                break;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i8, abstractC1092cP, false);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return q.e(this).f14980c.b();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        if (!(i7 >= 0 && i7 <= i8 && i8 <= size())) {
            AbstractC0908q0.a("fromIndex or toIndex are out of bounds");
        }
        return new C1281B(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1208j.a(this);
    }

    public final String toString() {
        v vVar = this.f14952o;
        AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((v) l.i(vVar)).f14980c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1092c abstractC1092c = q.e(this).f14980c;
        int iB = abstractC1092c.b();
        parcel.writeInt(iB);
        for (int i8 = 0; i8 < iB; i8++) {
            parcel.writeValue(abstractC1092c.get(i8));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i7;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i7 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            AbstractC1092c abstractC1092cG = abstractC1092c.g(collection);
            if (AbstractC1209k.a(abstractC1092cG, abstractC1092c)) {
                return false;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i7, abstractC1092cG, true);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new Q0.r(this, i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1208j.b(this, objArr);
    }

    public p() {
        this(j0.i.f13642p);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i8 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            AbstractC1092c abstractC1092cC = abstractC1092c.c(i7, obj);
            if (abstractC1092cC.equals(abstractC1092c)) {
                return;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i8, abstractC1092cC, true);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7;
        AbstractC1092c abstractC1092c;
        AbstractC1289f abstractC1289fK;
        boolean zB;
        do {
            synchronized (q.f14953a) {
                v vVar = this.f14952o;
                AbstractC1209k.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.i(vVar);
                i7 = vVar2.f14981d;
                abstractC1092c = vVar2.f14980c;
            }
            AbstractC1209k.c(abstractC1092c);
            int iIndexOf = abstractC1092c.indexOf(obj);
            AbstractC1092c abstractC1092cO = iIndexOf != -1 ? abstractC1092c.o(iIndexOf) : abstractC1092c;
            if (abstractC1092cO.equals(abstractC1092c)) {
                return false;
            }
            v vVar3 = this.f14952o;
            AbstractC1209k.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f14941c) {
                abstractC1289fK = l.k();
                zB = q.b((v) l.x(vVar3, this, abstractC1289fK), i7, abstractC1092cO, true);
            }
            l.o(abstractC1289fK, this);
        } while (!zB);
        return true;
    }
}
