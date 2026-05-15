package H2;

import java.util.List;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: H2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0194k implements X {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E4.b0 f3198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f3199p;

    public C0194k(List list, List list2) {
        E4.F fO = E4.I.o();
        AbstractC1697a.d(list.size() == list2.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            fO.a(new C0193j((X) list.get(i7), (List) list2.get(i7)));
        }
        this.f3198o = fO.f();
        this.f3199p = -9223372036854775807L;
    }

    @Override // H2.X
    public final boolean c() {
        int i7 = 0;
        while (true) {
            E4.b0 b0Var = this.f3198o;
            if (i7 >= b0Var.f1915r) {
                return false;
            }
            if (((C0193j) b0Var.get(i7)).f3196o.c()) {
                return true;
            }
            i7++;
        }
    }

    @Override // H2.X
    public final boolean d(A2.Z z6) {
        boolean zD;
        boolean z7 = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                return z7;
            }
            int i7 = 0;
            zD = false;
            while (true) {
                E4.b0 b0Var = this.f3198o;
                if (i7 >= b0Var.f1915r) {
                    break;
                }
                long jE2 = ((C0193j) b0Var.get(i7)).f3196o.e();
                boolean z8 = jE2 != Long.MIN_VALUE && jE2 <= z6.f215a;
                if (jE2 == jE || z8) {
                    zD |= ((C0193j) b0Var.get(i7)).f3196o.d(z6);
                }
                i7++;
            }
            z7 |= zD;
        } while (zD);
        return z7;
    }

    @Override // H2.X
    public final long e() {
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            E4.b0 b0Var = this.f3198o;
            if (i7 >= b0Var.f1915r) {
                break;
            }
            long jE = ((C0193j) b0Var.get(i7)).f3196o.e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
            i7++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // H2.X
    public final long i() {
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            E4.b0 b0Var = this.f3198o;
            if (i7 >= b0Var.f1915r) {
                break;
            }
            C0193j c0193j = (C0193j) b0Var.get(i7);
            long jI = c0193j.f3196o.i();
            E4.I i8 = c0193j.f3197p;
            if ((i8.contains(1) || i8.contains(2) || i8.contains(4)) && jI != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jI);
            }
            if (jI != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jI);
            }
            i7++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f3199p = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.f3199p;
        return j3 != -9223372036854775807L ? j3 : jMin2;
    }

    @Override // H2.X
    public final void q(long j3) {
        int i7 = 0;
        while (true) {
            E4.b0 b0Var = this.f3198o;
            if (i7 >= b0Var.f1915r) {
                return;
            }
            ((C0193j) b0Var.get(i7)).q(j3);
            i7++;
        }
    }
}
