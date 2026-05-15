package I2;

import B2.g;
import E4.C0118p;
import E4.C0127z;
import E4.F;
import E4.G;
import E4.I;
import E4.Y;
import E4.b0;
import java.util.ArrayList;
import k3.C1145a;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0127z f3448p = new C0127z(new C0118p(new g(13), Y.f1898p), new C0118p(new g(14), Y.f1899q));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f3449o = new ArrayList();

    @Override // I2.a
    public final I a(long j3) {
        ArrayList arrayList = this.f3449o;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((C1145a) arrayList.get(0)).f14022b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    C1145a c1145a = (C1145a) arrayList.get(i7);
                    if (j3 >= c1145a.f14022b && j3 < c1145a.f14024d) {
                        arrayList2.add(c1145a);
                    }
                    if (j3 < c1145a.f14022b) {
                        break;
                    }
                }
                b0 b0VarV = I.v(f3448p, arrayList2);
                F fO = I.o();
                for (int i8 = 0; i8 < b0VarV.f1915r; i8++) {
                    fO.c(((C1145a) b0VarV.get(i8)).f14021a);
                }
                return fO.f();
            }
        }
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    @Override // I2.a
    public final long b(long j3) {
        int i7 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f3449o;
            if (i7 >= arrayList.size()) {
                break;
            }
            long j7 = ((C1145a) arrayList.get(i7)).f14022b;
            long j8 = ((C1145a) arrayList.get(i7)).f14024d;
            if (j3 < j7) {
                jMin = jMin == -9223372036854775807L ? j7 : Math.min(jMin, j7);
            } else {
                if (j3 < j8) {
                    jMin = jMin == -9223372036854775807L ? j8 : Math.min(jMin, j8);
                }
                i7++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // I2.a
    public final boolean c(C1145a c1145a, long j3) {
        long j7 = c1145a.f14022b;
        AbstractC1697a.d(j7 != -9223372036854775807L);
        AbstractC1697a.d(c1145a.f14023c != -9223372036854775807L);
        boolean z6 = j7 <= j3 && j3 < c1145a.f14024d;
        ArrayList arrayList = this.f3449o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j7 >= ((C1145a) arrayList.get(size)).f14022b) {
                arrayList.add(size + 1, c1145a);
                return z6;
            }
        }
        arrayList.add(0, c1145a);
        return z6;
    }

    @Override // I2.a
    public final void clear() {
        this.f3449o.clear();
    }

    @Override // I2.a
    public final long d(long j3) {
        ArrayList arrayList = this.f3449o;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j3 < ((C1145a) arrayList.get(0)).f14022b) {
            return -9223372036854775807L;
        }
        long jMax = ((C1145a) arrayList.get(0)).f14022b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long j7 = ((C1145a) arrayList.get(i7)).f14022b;
            long j8 = ((C1145a) arrayList.get(i7)).f14024d;
            if (j8 > j3) {
                if (j7 > j3) {
                    break;
                }
                jMax = Math.max(jMax, j7);
            } else {
                jMax = Math.max(jMax, j8);
            }
        }
        return jMax;
    }

    @Override // I2.a
    public final void e(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3449o;
            if (i7 >= arrayList.size()) {
                return;
            }
            long j7 = ((C1145a) arrayList.get(i7)).f14022b;
            if (j3 > j7 && j3 > ((C1145a) arrayList.get(i7)).f14024d) {
                arrayList.remove(i7);
                i7--;
            } else if (j3 < j7) {
                return;
            }
            i7++;
        }
    }
}
