package E0;

/* JADX INFO: renamed from: E0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0102m extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1776c;

    public C0102m(float f7) {
        super(3);
        this.f1776c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0102m) && Float.compare(this.f1776c, ((C0102m) obj).f1776c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1776c);
    }

    public final String toString() {
        return n1.c.u(new StringBuilder("HorizontalTo(x="), this.f1776c, ')');
    }
}
