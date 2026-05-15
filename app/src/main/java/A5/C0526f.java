package a5;

import Z4.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: a5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0526f extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0525e f8877p;

    public /* synthetic */ C0526f(C0525e c0525e, int i7) {
        this.f8876o = i7;
        this.f8877p = c0525e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f8876o) {
            case 0:
                AbstractC1209k.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f8876o) {
            case 0:
                AbstractC1209k.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC1209k.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // Z4.h
    public final int b() {
        switch (this.f8876o) {
        }
        return this.f8877p.f8872w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f8876o) {
            case 0:
                this.f8877p.clear();
                break;
            default:
                this.f8877p.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f8876o) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1209k.f(entry, "element");
                return this.f8877p.f(entry);
            default:
                return this.f8877p.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f8876o) {
            case 0:
                AbstractC1209k.f(collection, "elements");
                return this.f8877p.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f8876o) {
        }
        return this.f8877p.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8876o) {
            case 0:
                C0525e c0525e = this.f8877p;
                c0525e.getClass();
                return new C0523c(c0525e, 0);
            default:
                C0525e c0525e2 = this.f8877p;
                c0525e2.getClass();
                return new C0523c(c0525e2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f8876o) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    AbstractC1209k.f(entry, "element");
                    C0525e c0525e = this.f8877p;
                    c0525e.getClass();
                    c0525e.c();
                    int iH = c0525e.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = c0525e.f8865p;
                        AbstractC1209k.c(objArr);
                        if (AbstractC1209k.a(objArr[iH], entry.getValue())) {
                            c0525e.m(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                C0525e c0525e2 = this.f8877p;
                c0525e2.c();
                int iH2 = c0525e2.h(obj);
                if (iH2 >= 0) {
                    c0525e2.m(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f8876o) {
            case 0:
                AbstractC1209k.f(collection, "elements");
                this.f8877p.c();
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                this.f8877p.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f8876o) {
            case 0:
                AbstractC1209k.f(collection, "elements");
                this.f8877p.c();
                break;
            default:
                AbstractC1209k.f(collection, "elements");
                this.f8877p.c();
                break;
        }
        return super.retainAll(collection);
    }
}
