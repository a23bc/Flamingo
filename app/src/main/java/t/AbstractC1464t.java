package t;

import Z4.C0508b;
import java.util.ConcurrentModificationException;
import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1464t {

    /* JADX INFO: renamed from: a */
    public static final Object f16107a = new Object();

    /* JADX INFO: renamed from: b */
    public static final long[] f16108b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object f16109c = new Object();

    public static final void a(U u7) {
        int i7 = u7.f16040r;
        int[] iArr = u7.f16038p;
        Object[] objArr = u7.f16039q;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f16109c) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        u7.f16037o = false;
        u7.f16040r = i8;
    }

    public static final void b(C1451f c1451f, int i7) {
        AbstractC1209k.f(c1451f, "<this>");
        c1451f.f16065o = new int[i7];
        c1451f.f16066p = new Object[i7];
    }

    public static final int c(C1451f c1451f, Object obj, int i7) {
        AbstractC1209k.f(c1451f, "<this>");
        int i8 = c1451f.f16067q;
        if (i8 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC1525a.a(c1451f.f16067q, i7, c1451f.f16065o);
            if (iA < 0 || AbstractC1209k.a(obj, c1451f.f16066p[iA])) {
                return iA;
            }
            int i9 = iA + 1;
            while (i9 < i8 && c1451f.f16065o[i9] == i7) {
                if (AbstractC1209k.a(obj, c1451f.f16066p[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = iA - 1; i10 >= 0 && c1451f.f16065o[i10] == i7; i10--) {
                if (AbstractC1209k.a(obj, c1451f.f16066p[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final C0508b d(U u7) {
        AbstractC1209k.f(u7, "<this>");
        return new C0508b(2, u7);
    }
}
