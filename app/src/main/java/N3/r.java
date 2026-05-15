package N3;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1267a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f5148d;

    public r(Throwable th) {
        this.f5148d = th;
    }

    public final String toString() {
        return Z1.l.q("FAILURE (", this.f5148d.getMessage(), ")");
    }
}
