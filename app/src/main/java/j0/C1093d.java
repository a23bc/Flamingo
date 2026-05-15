package j0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1093d extends AbstractC1090a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13622q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13623r;

    public C1093d(Object[] objArr, int i7, int i8) {
        super(i7, i8);
        this.f13623r = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f13622q) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f13618o;
                this.f13618o = i7 + 1;
                return ((Object[]) this.f13623r)[i7];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f13618o++;
                return this.f13623r;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f13622q) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f13618o - 1;
                this.f13618o = i7;
                return ((Object[]) this.f13623r)[i7];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f13618o--;
                return this.f13623r;
        }
    }

    public C1093d(int i7, Object obj) {
        super(i7, 1);
        this.f13623r = obj;
    }
}
