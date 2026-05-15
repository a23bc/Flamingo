package t;

import java.util.Arrays;
import m5.AbstractC1209k;
import r5.C1423d;

/* JADX INFO: renamed from: t.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1440B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15965b;

    public C1440B(int i7) {
        this.f15964a = i7 == 0 ? r.f16102a : new long[i7];
    }

    public final void a(long j3) {
        int i7 = this.f15965b + 1;
        long[] jArr = this.f15964a;
        if (jArr.length < i7) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i7, (jArr.length * 3) / 2));
            AbstractC1209k.e(jArrCopyOf, "copyOf(...)");
            this.f15964a = jArrCopyOf;
        }
        long[] jArr2 = this.f15964a;
        int i8 = this.f15965b;
        jArr2[i8] = j3;
        this.f15965b = i8 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1440B) {
            C1440B c1440b = (C1440B) obj;
            int i7 = c1440b.f15965b;
            int i8 = this.f15965b;
            if (i7 == i8) {
                long[] jArr = this.f15964a;
                long[] jArr2 = c1440b.f15964a;
                C1423d c1423dM = i6.h.M(0, i8);
                int i9 = c1423dM.f15781o;
                int i10 = c1423dM.f15782p;
                if (i9 > i10) {
                    return true;
                }
                while (jArr[i9] == jArr2[i9]) {
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
        long[] jArr = this.f15964a;
        int i7 = this.f15965b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            long j3 = jArr[i9];
            i8 += ((int) (j3 ^ (j3 >>> 32))) * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f15964a;
        int i7 = this.f15965b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            long j3 = jArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j3);
            i8++;
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
