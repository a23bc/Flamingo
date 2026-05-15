package v;

import w.C1670c;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1670c f18139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18140b;

    public p0(C1670c c1670c, long j3) {
        this.f18139a = c1670c;
        this.f18140b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f18139a.equals(p0Var.f18139a) && n1.m.b(this.f18140b, p0Var.f18140b);
    }

    public final int hashCode() {
        int iHashCode = this.f18139a.hashCode() * 31;
        long j3 = this.f18140b;
        return ((int) (j3 ^ (j3 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "AnimData(anim=" + this.f18139a + ", startSize=" + ((Object) n1.m.c(this.f18140b)) + ')';
    }
}
