package E0;

/* JADX INFO: loaded from: classes.dex */
public final class B extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1639c;

    public B(float f7) {
        super(3);
        this.f1639c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && Float.compare(this.f1639c, ((B) obj).f1639c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1639c);
    }

    public final String toString() {
        return n1.c.u(new StringBuilder("VerticalTo(y="), this.f1639c, ')');
    }
}
