package E0;

/* JADX INFO: loaded from: classes.dex */
public final class A extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1638c;

    public A(float f7) {
        super(3);
        this.f1638c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Float.compare(this.f1638c, ((A) obj).f1638c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1638c);
    }

    public final String toString() {
        return n1.c.u(new StringBuilder("RelativeVerticalTo(dy="), this.f1638c, ')');
    }
}
