package k0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: renamed from: k0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1127d implements Iterator, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC1136m[] f13974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13976q = true;

    public AbstractC1127d(C1135l c1135l, AbstractC1136m[] abstractC1136mArr) {
        this.f13974o = abstractC1136mArr;
        abstractC1136mArr[0].b(c1135l.f13996d, Integer.bitCount(c1135l.f13993a) * 2, 0);
        this.f13975p = 0;
        b();
    }

    public final void b() {
        int i7 = this.f13975p;
        AbstractC1136m[] abstractC1136mArr = this.f13974o;
        AbstractC1136m abstractC1136m = abstractC1136mArr[i7];
        if (abstractC1136m.f13999q < abstractC1136m.f13998p) {
            return;
        }
        while (-1 < i7) {
            int iC = c(i7);
            if (iC == -1) {
                AbstractC1136m abstractC1136m2 = abstractC1136mArr[i7];
                int i8 = abstractC1136m2.f13999q;
                Object[] objArr = abstractC1136m2.f13997o;
                if (i8 < objArr.length) {
                    int length = objArr.length;
                    abstractC1136m2.f13999q = i8 + 1;
                    iC = c(i7);
                }
            }
            if (iC != -1) {
                this.f13975p = iC;
                return;
            }
            if (i7 > 0) {
                AbstractC1136m abstractC1136m3 = abstractC1136mArr[i7 - 1];
                int i9 = abstractC1136m3.f13999q;
                int length2 = abstractC1136m3.f13997o.length;
                abstractC1136m3.f13999q = i9 + 1;
            }
            abstractC1136mArr[i7].b(C1135l.f13992e.f13996d, 0, 0);
            i7--;
        }
        this.f13976q = false;
    }

    public final int c(int i7) {
        AbstractC1136m[] abstractC1136mArr = this.f13974o;
        AbstractC1136m abstractC1136m = abstractC1136mArr[i7];
        int i8 = abstractC1136m.f13999q;
        if (i8 < abstractC1136m.f13998p) {
            return i7;
        }
        Object[] objArr = abstractC1136m.f13997o;
        if (i8 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i8];
        AbstractC1209k.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C1135l c1135l = (C1135l) obj;
        if (i7 == 6) {
            AbstractC1136m abstractC1136m2 = abstractC1136mArr[i7 + 1];
            Object[] objArr2 = c1135l.f13996d;
            abstractC1136m2.b(objArr2, objArr2.length, 0);
        } else {
            abstractC1136mArr[i7 + 1].b(c1135l.f13996d, Integer.bitCount(c1135l.f13993a) * 2, 0);
        }
        return c(i7 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13976q;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f13976q) {
            throw new NoSuchElementException();
        }
        Object next = this.f13974o[this.f13975p].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
