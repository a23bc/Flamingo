package X;

import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M.M f8012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f8014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8015d;

    public X(M.M m7, long j3, W w7, boolean z6) {
        this.f8012a = m7;
        this.f8013b = j3;
        this.f8014c = w7;
        this.f8015d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        return this.f8012a == x6.f8012a && C1892b.b(this.f8013b, x6.f8013b) && this.f8014c == x6.f8014c && this.f8015d == x6.f8015d;
    }

    public final int hashCode() {
        return ((this.f8014c.hashCode() + ((C1892b.f(this.f8013b) + (this.f8012a.hashCode() * 31)) * 31)) * 31) + (this.f8015d ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f8012a + ", position=" + ((Object) C1892b.j(this.f8013b)) + ", anchor=" + this.f8014c + ", visible=" + this.f8015d + ')';
    }
}
