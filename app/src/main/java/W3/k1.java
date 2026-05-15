package w3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;
import t2.C1485n;
import w2.AbstractC1697a;
import x3.C1930o;

/* JADX INFO: loaded from: classes.dex */
public abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1930o f19240a = new C1930o(null);

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static boolean d(y1 y1Var, y1 y1Var2) {
        t2.W w7 = y1Var.f19418a;
        int i7 = w7.f16364b;
        t2.W w8 = y1Var2.f19418a;
        return i7 == w8.f16364b && w7.f16367e == w8.f16367e && w7.h == w8.h && w7.f16370i == w8.f16370i;
    }

    public static int e(long j3, long j7) {
        if (j3 == -9223372036854775807L || j7 == -9223372036854775807L) {
            return 0;
        }
        if (j7 == 0) {
            return 100;
        }
        return w2.t.g((int) ((j3 * 100) / j7), 0, 100);
    }

    public static long f(n1 n1Var, long j3, long j7, long j8) {
        boolean zEquals = n1Var.f19291c.equals(y1.l);
        y1 y1Var = n1Var.f19291c;
        boolean z6 = zEquals || j7 < y1Var.f19420c;
        if (n1Var.f19308v) {
            if (z6 || j3 == -9223372036854775807L) {
                if (j8 == -9223372036854775807L) {
                    j8 = SystemClock.elapsedRealtime() - y1Var.f19420c;
                }
                long j9 = y1Var.f19418a.f16368f + ((long) (j8 * n1Var.f19295g.f16348a));
                long j10 = y1Var.f19421d;
                return j10 != -9223372036854775807L ? Math.min(j9, j10) : j9;
            }
        } else if (z6 || j3 == -9223372036854775807L) {
            return y1Var.f19418a.f16368f;
        }
        return j3;
    }

    public static t2.T g(t2.T t7, t2.T t8) {
        if (t7 == null || t8 == null) {
            return t2.T.f16353b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int i7 = 0;
        while (true) {
            C1485n c1485n = t7.f16355a;
            if (i7 >= c1485n.f16552a.size()) {
                AbstractC1697a.i(!false);
                return new t2.T(new C1485n(sparseBooleanArray));
            }
            if (t8.a(c1485n.b(i7))) {
                int iB = c1485n.b(i7);
                AbstractC1697a.i(!false);
                sparseBooleanArray.append(iB, true);
            }
            i7++;
        }
    }

    public static Pair h(n1 n1Var, l1 l1Var, n1 n1Var2, l1 l1Var2, t2.T t7) {
        boolean z6 = l1Var2.f19250a;
        boolean z7 = l1Var2.f19251b;
        if (z6 && t7.a(17) && !l1Var.f19250a) {
            n1Var2 = n1Var2.l(n1Var.f19297j);
            l1Var2 = new l1(false, z7);
        }
        if (z7 && t7.a(30) && !l1Var.f19251b) {
            n1Var2 = n1Var2.b(n1Var.f19287D);
            l1Var2 = new l1(l1Var2.f19250a, false);
        }
        return new Pair(n1Var2, l1Var2);
    }

    public static void i(t2.X x6, C1749s0 c1749s0) {
        int i7 = c1749s0.f19346b;
        E4.I i8 = c1749s0.f19345a;
        if (i7 == -1) {
            if (x6.K0(20)) {
                x6.C0(i8);
                return;
            } else {
                if (i8.isEmpty()) {
                    return;
                }
                x6.z((t2.G) i8.get(0));
                return;
            }
        }
        boolean zK0 = x6.K0(20);
        long j3 = c1749s0.f19347c;
        if (zK0) {
            x6.m(i8, c1749s0.f19346b, j3);
        } else {
            if (i8.isEmpty()) {
                return;
            }
            x6.E0((t2.G) i8.get(0), j3);
        }
    }

    public static void j(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
