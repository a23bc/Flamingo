package u;

import java.util.NoSuchElementException;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1525a {

    /* JADX INFO: renamed from: a */
    public static final int[] f17126a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f17127b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f17128c = new Object[0];

    public static final int a(int i7, int i8, int[] iArr) {
        AbstractC1209k.f(iArr, "array");
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final int b(long[] jArr, int i7, long j3) {
        AbstractC1209k.f(jArr, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j7 = jArr[i10];
            if (j7 < j3) {
                i9 = i10 + 1;
            } else {
                if (j7 <= j3) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static final void c(String str) {
        AbstractC1209k.f(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        AbstractC1209k.f(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        AbstractC1209k.f(str, "message");
        throw new NoSuchElementException(str);
    }
}
