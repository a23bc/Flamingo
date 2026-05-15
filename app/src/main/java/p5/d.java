package p5;

import i5.AbstractC1088a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC1298a f15102o;

    static {
        Integer num = AbstractC1088a.f13515a;
        f15102o = (num == null || num.intValue() >= 34) ? new q5.a() : new b();
    }

    public abstract int a(int i7);

    public abstract int b();

    public abstract int c(int i7);

    public int d(int i7, int i8) {
        int iB;
        int i9;
        int iA;
        if (i8 <= i7) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i7) + ", " + Integer.valueOf(i8) + ").").toString());
        }
        int i10 = i8 - i7;
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            if (((-i10) & i10) == i10) {
                iA = a(31 - Integer.numberOfLeadingZeros(i10));
            } else {
                do {
                    iB = b() >>> 1;
                    i9 = iB % i10;
                } while ((i10 - 1) + (iB - i9) < 0);
                iA = i9;
            }
            return i7 + iA;
        }
        while (true) {
            int iB2 = b();
            if (i7 <= iB2 && iB2 < i8) {
                return iB2;
            }
        }
    }
}
