package y5;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f20565a;

    public h(Throwable th) {
        this.f20565a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return AbstractC1209k.a(this.f20565a, ((h) obj).f20565a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f20565a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // y5.i
    public final String toString() {
        return "Closed(" + this.f20565a + ')';
    }
}
