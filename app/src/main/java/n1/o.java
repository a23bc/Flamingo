package n1;

import o1.InterfaceC1257a;

/* JADX INFO: loaded from: classes.dex */
public final class o implements InterfaceC1257a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14524a;

    public o(float f7) {
        this.f14524a = f7;
    }

    @Override // o1.InterfaceC1257a
    public final float a(float f7) {
        return f7 / this.f14524a;
    }

    @Override // o1.InterfaceC1257a
    public final float b(float f7) {
        return f7 * this.f14524a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Float.compare(this.f14524a, ((o) obj).f14524a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14524a);
    }

    public final String toString() {
        return c.u(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f14524a, ')');
    }
}
