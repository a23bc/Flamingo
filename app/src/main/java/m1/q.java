package m1;

import j5.AbstractC1109c;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f14354c = new q(AbstractC1109c.u(0), AbstractC1109c.u(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14356b;

    public q(long j3, long j7) {
        this.f14355a = j3;
        this.f14356b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return n1.p.a(this.f14355a, qVar.f14355a) && n1.p.a(this.f14356b, qVar.f14356b);
    }

    public final int hashCode() {
        return n1.p.d(this.f14356b) + (n1.p.d(this.f14355a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) n1.p.e(this.f14355a)) + ", restLine=" + ((Object) n1.p.e(this.f14356b)) + ')';
    }
}
