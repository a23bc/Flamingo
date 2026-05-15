package E0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1816d;

    public z(float f7, float f8) {
        super(1);
        this.f1815c = f7;
        this.f1816d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f1815c, zVar.f1815c) == 0 && Float.compare(this.f1816d, zVar.f1816d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1816d) + (Float.floatToIntBits(this.f1815c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f1815c);
        sb.append(", dy=");
        return n1.c.u(sb, this.f1816d, ')');
    }
}
