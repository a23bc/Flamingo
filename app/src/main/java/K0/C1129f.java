package k0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: renamed from: k0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1129f extends AbstractC1127d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1128e f13983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f13984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13986u;

    public C1129f(C1128e c1128e, AbstractC1136m[] abstractC1136mArr) {
        super(c1128e.f13979q, abstractC1136mArr);
        this.f13983r = c1128e;
        this.f13986u = c1128e.f13981s;
    }

    public final void d(int i7, C1135l c1135l, Object obj, int i8) {
        int i9 = i8 * 5;
        AbstractC1136m[] abstractC1136mArr = this.f13974o;
        if (i9 <= 30) {
            int iX = 1 << j0.k.x(i7, i9);
            if (c1135l.h(iX)) {
                abstractC1136mArr[i8].b(c1135l.f13996d, Integer.bitCount(c1135l.f13993a) * 2, c1135l.f(iX));
                this.f13975p = i8;
                return;
            } else {
                int iT = c1135l.t(iX);
                C1135l c1135lS = c1135l.s(iT);
                abstractC1136mArr[i8].b(c1135l.f13996d, Integer.bitCount(c1135l.f13993a) * 2, iT);
                d(i7, c1135lS, obj, i8 + 1);
                return;
            }
        }
        AbstractC1136m abstractC1136m = abstractC1136mArr[i8];
        Object[] objArr = c1135l.f13996d;
        abstractC1136m.b(objArr, objArr.length, 0);
        while (true) {
            AbstractC1136m abstractC1136m2 = abstractC1136mArr[i8];
            if (AbstractC1209k.a(abstractC1136m2.f13997o[abstractC1136m2.f13999q], obj)) {
                this.f13975p = i8;
                return;
            } else {
                abstractC1136mArr[i8].f13999q += 2;
            }
        }
    }

    @Override // k0.AbstractC1127d, java.util.Iterator
    public final Object next() {
        if (this.f13983r.f13981s != this.f13986u) {
            throw new ConcurrentModificationException();
        }
        if (!this.f13976q) {
            throw new NoSuchElementException();
        }
        AbstractC1136m abstractC1136m = this.f13974o[this.f13975p];
        this.f13984s = abstractC1136m.f13997o[abstractC1136m.f13999q];
        this.f13985t = true;
        return super.next();
    }

    @Override // k0.AbstractC1127d, java.util.Iterator
    public final void remove() {
        if (!this.f13985t) {
            throw new IllegalStateException();
        }
        boolean z6 = this.f13976q;
        C1128e c1128e = this.f13983r;
        if (!z6) {
            AbstractC1223y.b(c1128e).remove(this.f13984s);
        } else {
            if (!z6) {
                throw new NoSuchElementException();
            }
            AbstractC1136m abstractC1136m = this.f13974o[this.f13975p];
            Object obj = abstractC1136m.f13997o[abstractC1136m.f13999q];
            AbstractC1223y.b(c1128e).remove(this.f13984s);
            d(obj != null ? obj.hashCode() : 0, c1128e.f13979q, obj, 0);
        }
        this.f13984s = null;
        this.f13985t = false;
        this.f13986u = c1128e.f13981s;
    }
}
