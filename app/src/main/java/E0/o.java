package E0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1780d;

    public o(float f7, float f8) {
        super(3);
        this.f1779c = f7;
        this.f1780d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f1779c, oVar.f1779c) == 0 && Float.compare(this.f1780d, oVar.f1780d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1780d) + (Float.floatToIntBits(this.f1779c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f1779c);
        sb.append(", y=");
        return n1.c.u(sb, this.f1780d, ')');
    }
}
