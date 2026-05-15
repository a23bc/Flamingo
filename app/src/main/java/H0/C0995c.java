package h0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m5.AbstractC1208j;
import m5.AbstractC1209k;
import n5.InterfaceC1239c;
import t.O;

/* JADX INFO: renamed from: h0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0995c implements List, InterfaceC1239c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f12540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f12541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12542r;

    public /* synthetic */ C0995c(List list, int i7, int i8, int i9) {
        this.f12539o = i9;
        this.f12540p = list;
        this.f12541q = i7;
        this.f12542r = i8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r;
                this.f12542r = i7 + 1;
                this.f12540p.add(i7, obj);
                break;
            default:
                int i8 = this.f12542r;
                this.f12542r = i8 + 1;
                this.f12540p.add(i8, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        switch (this.f12539o) {
            case 0:
                this.f12540p.addAll(i7 + this.f12541q, collection);
                int size = collection.size();
                this.f12542r += size;
                if (size > 0) {
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                this.f12540p.addAll(i7 + this.f12541q, collection);
                this.f12542r = collection.size() + this.f12542r;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r - 1;
                int i8 = this.f12541q;
                if (i8 <= i7) {
                    while (true) {
                        this.f12540p.remove(i7);
                        if (i7 != i8) {
                            i7--;
                        }
                    }
                }
                this.f12542r = i8;
                break;
            default:
                int i9 = this.f12542r - 1;
                int i10 = this.f12541q;
                if (i10 <= i9) {
                    while (true) {
                        this.f12540p.remove(i9);
                        if (i9 != i10) {
                            i9--;
                        }
                    }
                }
                this.f12542r = i10;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r;
                for (int i8 = this.f12541q; i8 < i7; i8++) {
                    if (AbstractC1209k.a(this.f12540p.get(i8), obj)) {
                    }
                    break;
                }
                break;
            default:
                int i9 = this.f12542r;
                for (int i10 = this.f12541q; i10 < i9; i10++) {
                    if (AbstractC1209k.a(this.f12540p.get(i10), obj)) {
                    }
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12539o) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f12539o) {
            case 0:
                f.a(i7, this);
                return this.f12540p.get(i7 + this.f12541q);
            default:
                O.a(i7, this);
                return this.f12540p.get(i7 + this.f12541q);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r;
                int i8 = this.f12541q;
                for (int i9 = i8; i9 < i7; i9++) {
                    if (AbstractC1209k.a(this.f12540p.get(i9), obj)) {
                        return i9 - i8;
                    }
                }
                return -1;
            default:
                int i10 = this.f12542r;
                int i11 = this.f12541q;
                for (int i12 = i11; i12 < i10; i12++) {
                    if (AbstractC1209k.a(this.f12540p.get(i12), obj)) {
                        return i12 - i11;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f12539o) {
            case 0:
                if (this.f12542r == this.f12541q) {
                }
                break;
            default:
                if (this.f12542r == this.f12541q) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12539o) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r - 1;
                int i8 = this.f12541q;
                if (i8 <= i7) {
                    while (!AbstractC1209k.a(this.f12540p.get(i7), obj)) {
                        if (i7 != i8) {
                            i7--;
                        }
                    }
                    return i7 - i8;
                }
                return -1;
            default:
                int i9 = this.f12542r - 1;
                int i10 = this.f12541q;
                if (i10 <= i9) {
                    while (!AbstractC1209k.a(this.f12540p.get(i9), obj)) {
                        if (i9 != i10) {
                            i9--;
                        }
                    }
                    return i9 - i10;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f12539o) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r;
                for (int i8 = this.f12541q; i8 < i7; i8++) {
                    ?? r22 = this.f12540p;
                    if (AbstractC1209k.a(r22.get(i8), obj)) {
                        r22.remove(i8);
                        this.f12542r--;
                    }
                    break;
                }
                break;
            default:
                int i9 = this.f12542r;
                for (int i10 = this.f12541q; i10 < i9; i10++) {
                    ?? r23 = this.f12540p;
                    if (AbstractC1209k.a(r23.get(i10), obj)) {
                        r23.remove(i10);
                        this.f12542r--;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i7 != this.f12542r) {
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                int i8 = this.f12542r;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i8 != this.f12542r) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12539o) {
            case 0:
                int i7 = this.f12542r;
                int i8 = i7 - 1;
                int i9 = this.f12541q;
                if (i9 <= i8) {
                    while (true) {
                        ?? r32 = this.f12540p;
                        if (!collection.contains(r32.get(i8))) {
                            r32.remove(i8);
                            this.f12542r--;
                        }
                        if (i8 != i9) {
                            i8--;
                        }
                    }
                }
                if (i7 != this.f12542r) {
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                int i10 = this.f12542r;
                int i11 = i10 - 1;
                int i12 = this.f12541q;
                if (i12 <= i11) {
                    while (true) {
                        ?? r33 = this.f12540p;
                        if (!collection.contains(r33.get(i11))) {
                            r33.remove(i11);
                            this.f12542r--;
                        }
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                if (i10 != this.f12542r) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        switch (this.f12539o) {
            case 0:
                f.a(i7, this);
                return this.f12540p.set(i7 + this.f12541q, obj);
            default:
                O.a(i7, this);
                return this.f12540p.set(i7 + this.f12541q, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f12539o) {
        }
        return this.f12542r - this.f12541q;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        switch (this.f12539o) {
            case 0:
                f.b(i7, i8, this);
                return new C0995c(this, i7, i8, 0);
            default:
                O.b(i7, i8, this);
                return new C0995c(this, i7, i8, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f12539o) {
        }
        return AbstractC1208j.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i7, Object obj) {
        switch (this.f12539o) {
            case 0:
                this.f12540p.add(i7 + this.f12541q, obj);
                this.f12542r++;
                break;
            default:
                this.f12540p.add(i7 + this.f12541q, obj);
                this.f12542r++;
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        switch (this.f12539o) {
            case 0:
                return new d(i7, 0, this);
            default:
                return new d(i7, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12539o) {
            case 0:
                break;
            default:
                AbstractC1209k.f(objArr, "array");
                break;
        }
        return AbstractC1208j.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12539o) {
            case 0:
                this.f12540p.addAll(this.f12542r, collection);
                int size = collection.size();
                this.f12542r += size;
                if (size > 0) {
                }
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                this.f12540p.addAll(this.f12542r, collection);
                this.f12542r = collection.size() + this.f12542r;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i7) {
        switch (this.f12539o) {
            case 0:
                f.a(i7, this);
                this.f12542r--;
                return this.f12540p.remove(i7 + this.f12541q);
            default:
                O.a(i7, this);
                this.f12542r--;
                return this.f12540p.remove(i7 + this.f12541q);
        }
    }
}
