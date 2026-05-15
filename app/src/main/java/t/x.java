package t;

import java.util.Arrays;
import m5.AbstractC1209k;
import r5.C1423d;
import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a */
    public int[] f16126a;

    /* JADX INFO: renamed from: b */
    public int f16127b;

    public x(int i7) {
        this.f16126a = i7 == 0 ? AbstractC1459n.f16089a : new int[i7];
    }

    public final void a(int i7) {
        int i8 = this.f16127b + 1;
        int[] iArr = this.f16126a;
        if (iArr.length < i8) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i8, (iArr.length * 3) / 2));
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f16126a = iArrCopyOf;
        }
        int[] iArr2 = this.f16126a;
        int i9 = this.f16127b;
        iArr2[i9] = i7;
        this.f16127b = i9 + 1;
    }

    public final int b(int i7) {
        if (i7 >= 0 && i7 < this.f16127b) {
            return this.f16126a[i7];
        }
        AbstractC1525a.d("Index must be between 0 and size");
        throw null;
    }

    public final int c() {
        int i7 = this.f16127b;
        if (i7 != 0) {
            return this.f16126a[i7 - 1];
        }
        AbstractC1525a.e("IntList is empty.");
        throw null;
    }

    public final void d(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f16127b)) {
            AbstractC1525a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f16126a;
        int i9 = iArr[i7];
        if (i7 != i8 - 1) {
            Z4.l.V(i7, i7 + 1, i8, iArr, iArr);
        }
        this.f16127b--;
    }

    public final void e(int i7, int i8) {
        if (i7 < 0 || i7 >= this.f16127b) {
            AbstractC1525a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f16126a;
        int i9 = iArr[i7];
        iArr[i7] = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            int i7 = xVar.f16127b;
            int i8 = this.f16127b;
            if (i7 == i8) {
                int[] iArr = this.f16126a;
                int[] iArr2 = xVar.f16126a;
                C1423d c1423dM = i6.h.M(0, i8);
                int i9 = c1423dM.f15781o;
                int i10 = c1423dM.f15782p;
                if (i9 > i10) {
                    return true;
                }
                while (iArr[i9] == iArr2[i9]) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f16126a;
        int i7 = this.f16127b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9] * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f16126a;
        int i7 = this.f16127b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            int i9 = iArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i9);
            i8++;
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ x() {
        this(16);
    }
}
