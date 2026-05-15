package a5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import k0.AbstractC1136m;
import k0.C1128e;
import k0.C1131h;
import k0.C1137n;
import m5.AbstractC1209k;
import n5.InterfaceC1238b;

/* JADX INFO: renamed from: a5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0527g extends AbstractCollection implements Collection, InterfaceC1238b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f8879p;

    public /* synthetic */ C0527g(int i7, Object obj) {
        this.f8878o = i7;
        this.f8879p = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8878o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f8878o) {
            case 0:
                AbstractC1209k.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f8878o) {
            case 0:
                ((C0525e) this.f8879p).clear();
                break;
            default:
                ((C1128e) this.f8879p).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8878o) {
            case 0:
                return ((C0525e) this.f8879p).containsValue(obj);
            default:
                return ((C1128e) this.f8879p).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f8878o) {
            case 0:
                return ((C0525e) this.f8879p).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8878o) {
            case 0:
                C0525e c0525e = (C0525e) this.f8879p;
                c0525e.getClass();
                return new C0523c(c0525e, 2);
            default:
                AbstractC1136m[] abstractC1136mArr = new AbstractC1136m[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    abstractC1136mArr[i7] = new C1137n(2);
                }
                return new C1131h((C1128e) this.f8879p, abstractC1136mArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f8878o) {
            case 0:
                C0525e c0525e = (C0525e) this.f8879p;
                c0525e.c();
                int i7 = c0525e.i(obj);
                if (i7 < 0) {
                    return false;
                }
                c0525e.m(i7);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f8878o) {
            case 0:
                AbstractC1209k.f(collection, "elements");
                ((C0525e) this.f8879p).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f8878o) {
            case 0:
                AbstractC1209k.f(collection, "elements");
                ((C0525e) this.f8879p).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f8878o) {
            case 0:
                return ((C0525e) this.f8879p).f8872w;
            default:
                C1128e c1128e = (C1128e) this.f8879p;
                c1128e.getClass();
                return c1128e.f13982t;
        }
    }
}
