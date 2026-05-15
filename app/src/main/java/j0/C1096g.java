package j0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1096g extends AbstractC1090a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object[] f13636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f13637r;

    public C1096g(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        super(i7, i8);
        this.f13636q = objArr2;
        int i10 = (i8 - 1) & (-32);
        this.f13637r = new j(objArr, i7 > i10 ? i10 : i7, i10, i9);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f13637r;
        if (jVar.hasNext()) {
            this.f13618o++;
            return jVar.next();
        }
        int i7 = this.f13618o;
        this.f13618o = i7 + 1;
        return this.f13636q[i7 - jVar.f13619p];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f13618o;
        j jVar = this.f13637r;
        int i8 = jVar.f13619p;
        if (i7 <= i8) {
            this.f13618o = i7 - 1;
            return jVar.previous();
        }
        int i9 = i7 - 1;
        this.f13618o = i9;
        return this.f13636q[i9 - i8];
    }
}
