package l2;

import y0.C1987t;

/* JADX INFO: renamed from: l2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14166a;

    public C1167g(long j3) {
        this.f14166a = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1167g) && C1987t.c(this.f14166a, ((C1167g) obj).f14166a);
    }

    public final int hashCode() {
        return C1987t.i(this.f14166a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) C1987t.j(this.f14166a)) + ')';
    }
}
