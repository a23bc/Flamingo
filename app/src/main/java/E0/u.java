package E0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1802c;

    public u(float f7) {
        super(3);
        this.f1802c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f1802c, ((u) obj).f1802c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1802c);
    }

    public final String toString() {
        return n1.c.u(new StringBuilder("RelativeHorizontalTo(dx="), this.f1802c, ')');
    }
}
