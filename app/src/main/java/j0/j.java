package j0;

import java.util.NoSuchElementException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1090a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f13645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13646s;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i7, int i8, int i9) {
        super(i7, i8);
        this.f13644q = i9;
        Object[] objArr2 = new Object[i9];
        this.f13645r = objArr2;
        ?? r52 = i7 == i8 ? 1 : 0;
        this.f13646s = r52;
        objArr2[0] = objArr;
        c(i7 - r52, 1);
    }

    public final Object b() {
        int i7 = this.f13618o & 31;
        Object obj = this.f13645r[this.f13644q - 1];
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i7];
    }

    public final void c(int i7, int i8) {
        int i9 = (this.f13644q - i8) * 5;
        while (i8 < this.f13644q) {
            Object[] objArr = this.f13645r;
            Object obj = objArr[i8 - 1];
            AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i8] = ((Object[]) obj)[k.w(i7, i9)];
            i9 -= 5;
            i8++;
        }
    }

    public final void d(int i7) {
        int i8 = 0;
        while (k.w(this.f13618o, i8) == i7) {
            i8 += 5;
        }
        if (i8 > 0) {
            c(this.f13618o, ((this.f13644q - 1) - (i8 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = b();
        int i7 = this.f13618o + 1;
        this.f13618o = i7;
        if (i7 == this.f13619p) {
            this.f13646s = true;
            return objB;
        }
        d(0);
        return objB;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f13618o--;
        if (this.f13646s) {
            this.f13646s = false;
            return b();
        }
        d(31);
        return b();
    }
}
