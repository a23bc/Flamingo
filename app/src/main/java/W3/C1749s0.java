package w3;

import java.util.List;

/* JADX INFO: renamed from: w3.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1749s0 {

    /* JADX INFO: renamed from: a */
    public final E4.I f19345a;

    /* JADX INFO: renamed from: b */
    public final int f19346b;

    /* JADX INFO: renamed from: c */
    public final long f19347c;

    public C1749s0(List list, int i7, long j3) {
        this.f19345a = E4.I.p(list);
        this.f19346b = i7;
        this.f19347c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1749s0)) {
            return false;
        }
        C1749s0 c1749s0 = (C1749s0) obj;
        if (this.f19345a.equals(c1749s0.f19345a)) {
            Integer numValueOf = Integer.valueOf(this.f19346b);
            Integer numValueOf2 = Integer.valueOf(c1749s0.f19346b);
            int i7 = w2.t.f18881a;
            if (numValueOf.equals(numValueOf2) && Long.valueOf(this.f19347c).equals(Long.valueOf(c1749s0.f19347c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return I0.c.C(this.f19347c) + (((this.f19345a.hashCode() * 31) + this.f19346b) * 31);
    }
}
