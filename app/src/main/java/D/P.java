package D;

import t.C1455j;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    public final void a(O0.Y y6, O0.Y y7, long j3) {
        long jF = AbstractC0060d.f(j3, EnumC0063e0.f1315o);
        if (y6 != null) {
            int iM = y6.M(n1.a.g(jF));
            new C1455j(C1455j.a(iM, y6.Q(iM)));
            boolean z6 = y6 instanceof O0.Y;
        }
        if (y7 != null) {
            int iM2 = y7.M(n1.a.g(jF));
            new C1455j(C1455j.a(iM2, y7.Q(iM2)));
            boolean z7 = y7 instanceof O0.Y;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        ((P) obj).getClass();
        N n7 = N.f1254o;
        return true;
    }

    public final int hashCode() {
        return N.f1254o.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + N.f1254o + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
