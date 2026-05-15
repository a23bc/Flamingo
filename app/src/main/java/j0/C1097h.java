package j0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1097h extends AbstractC1090a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1095f f13638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f13640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13641t;

    public C1097h(C1095f c1095f, int i7) {
        super(i7, c1095f.f13635v);
        this.f13638q = c1095f;
        this.f13639r = c1095f.i();
        this.f13641t = -1;
        c();
    }

    @Override // j0.AbstractC1090a, java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i7 = this.f13618o;
        C1095f c1095f = this.f13638q;
        c1095f.add(i7, obj);
        this.f13618o++;
        this.f13619p = c1095f.b();
        this.f13639r = c1095f.i();
        this.f13641t = -1;
        c();
    }

    public final void b() {
        if (this.f13639r != this.f13638q.i()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        C1095f c1095f = this.f13638q;
        Object[] objArr = c1095f.f13633t;
        if (objArr == null) {
            this.f13640s = null;
            return;
        }
        int i7 = (c1095f.f13635v - 1) & (-32);
        int i8 = this.f13618o;
        if (i8 > i7) {
            i8 = i7;
        }
        int i9 = (c1095f.f13631r / 5) + 1;
        j jVar = this.f13640s;
        if (jVar == null) {
            this.f13640s = new j(objArr, i8, i7, i9);
            return;
        }
        jVar.f13618o = i8;
        jVar.f13619p = i7;
        jVar.f13644q = i9;
        if (jVar.f13645r.length < i9) {
            jVar.f13645r = new Object[i9];
        }
        jVar.f13645r[0] = objArr;
        ?? r62 = i8 == i7 ? 1 : 0;
        jVar.f13646s = r62;
        jVar.c(i8 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f13618o;
        this.f13641t = i7;
        j jVar = this.f13640s;
        C1095f c1095f = this.f13638q;
        if (jVar == null) {
            Object[] objArr = c1095f.f13634u;
            this.f13618o = i7 + 1;
            return objArr[i7];
        }
        if (jVar.hasNext()) {
            this.f13618o++;
            return jVar.next();
        }
        Object[] objArr2 = c1095f.f13634u;
        int i8 = this.f13618o;
        this.f13618o = i8 + 1;
        return objArr2[i8 - jVar.f13619p];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f13618o;
        this.f13641t = i7 - 1;
        j jVar = this.f13640s;
        C1095f c1095f = this.f13638q;
        if (jVar == null) {
            Object[] objArr = c1095f.f13634u;
            int i8 = i7 - 1;
            this.f13618o = i8;
            return objArr[i8];
        }
        int i9 = jVar.f13619p;
        if (i7 <= i9) {
            this.f13618o = i7 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = c1095f.f13634u;
        int i10 = i7 - 1;
        this.f13618o = i10;
        return objArr2[i10 - i9];
    }

    @Override // j0.AbstractC1090a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i7 = this.f13641t;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        C1095f c1095f = this.f13638q;
        c1095f.c(i7);
        int i8 = this.f13641t;
        if (i8 < this.f13618o) {
            this.f13618o = i8;
        }
        this.f13619p = c1095f.b();
        this.f13639r = c1095f.i();
        this.f13641t = -1;
        c();
    }

    @Override // j0.AbstractC1090a, java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i7 = this.f13641t;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        C1095f c1095f = this.f13638q;
        c1095f.set(i7, obj);
        this.f13639r = c1095f.i();
        c();
    }
}
