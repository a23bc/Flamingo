package t2;

import android.util.Pair;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f16472a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16475d;

    static {
        int i7 = w2.t.f18881a;
        f16473b = Integer.toString(0, 36);
        f16474c = Integer.toString(1, 36);
        f16475d = Integer.toString(2, 36);
    }

    public int a(boolean z6) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z6) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i7, e0 e0Var, g0 g0Var, int i8, boolean z6) {
        int i9 = f(i7, e0Var, false).f16428c;
        if (m(i9, g0Var, 0L).f16465n != i7) {
            return i7 + 1;
        }
        int iE = e(i9, i8, z6);
        if (iE == -1) {
            return -1;
        }
        return m(iE, g0Var, 0L).f16464m;
    }

    public int e(int i7, int i8, boolean z6) {
        if (i8 == 0) {
            if (i7 == c(z6)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == c(z6) ? a(z6) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                if (h0Var.o() == o() && h0Var.h() == h()) {
                    g0 g0Var = new g0();
                    e0 e0Var = new e0();
                    g0 g0Var2 = new g0();
                    e0 e0Var2 = new e0();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= o()) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= h()) {
                                    int iA = a(true);
                                    if (iA == h0Var.a(true) && (iC = c(true)) == h0Var.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == h0Var.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i8, e0Var, true).equals(h0Var.f(i8, e0Var2, true))) {
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        } else {
                            if (!m(i7, g0Var, 0L).equals(h0Var.m(i7, g0Var2, 0L))) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract e0 f(int i7, e0 e0Var, boolean z6);

    public e0 g(Object obj, e0 e0Var) {
        return f(b(obj), e0Var, true);
    }

    public abstract int h();

    public int hashCode() {
        g0 g0Var = new g0();
        e0 e0Var = new e0();
        int iO = o() + 217;
        for (int i7 = 0; i7 < o(); i7++) {
            iO = (iO * 31) + m(i7, g0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i8 = 0; i8 < h(); i8++) {
            iH = (iH * 31) + f(i8, e0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(g0 g0Var, e0 e0Var, int i7, long j3) {
        Pair pairJ = j(g0Var, e0Var, i7, j3, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(g0 g0Var, e0 e0Var, int i7, long j3, long j7) {
        AbstractC1697a.f(i7, o());
        m(i7, g0Var, j7);
        if (j3 == -9223372036854775807L) {
            j3 = g0Var.f16463k;
            if (j3 == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = g0Var.f16464m;
        f(i8, e0Var, false);
        while (i8 < g0Var.f16465n && e0Var.f16430e != j3) {
            int i9 = i8 + 1;
            if (f(i9, e0Var, false).f16430e > j3) {
                break;
            }
            i8 = i9;
        }
        f(i8, e0Var, true);
        long jMin = j3 - e0Var.f16430e;
        long j8 = e0Var.f16429d;
        if (j8 != -9223372036854775807L) {
            jMin = Math.min(jMin, j8 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = e0Var.f16427b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i7, int i8, boolean z6) {
        if (i8 == 0) {
            if (i7 == a(z6)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == a(z6) ? c(z6) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i7);

    public abstract g0 m(int i7, g0 g0Var, long j3);

    public final void n(int i7, g0 g0Var) {
        m(i7, g0Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
