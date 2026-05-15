package E0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1806d;

    public w(float f7, float f8) {
        super(3);
        this.f1805c = f7;
        this.f1806d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f1805c, wVar.f1805c) == 0 && Float.compare(this.f1806d, wVar.f1806d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1806d) + (Float.floatToIntBits(this.f1805c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f1805c);
        sb.append(", dy=");
        return n1.c.u(sb, this.f1806d, ')');
    }
}
