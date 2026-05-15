package L;

import n1.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4084a;

    public c(float f7) {
        this.f4084a = f7;
    }

    @Override // L.b
    public final float a(long j3, n1.d dVar) {
        return dVar.v(this.f4084a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && g.a(this.f4084a, ((c) obj).f4084a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4084a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4084a + ".dp)";
    }
}
