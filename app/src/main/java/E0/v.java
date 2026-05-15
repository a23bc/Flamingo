package E0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1804d;

    public v(float f7, float f8) {
        super(3);
        this.f1803c = f7;
        this.f1804d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f1803c, vVar.f1803c) == 0 && Float.compare(this.f1804d, vVar.f1804d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1804d) + (Float.floatToIntBits(this.f1803c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f1803c);
        sb.append(", dy=");
        return n1.c.u(sb, this.f1804d, ')');
    }
}
