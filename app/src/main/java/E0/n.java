package E0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1778d;

    public n(float f7, float f8) {
        super(3);
        this.f1777c = f7;
        this.f1778d = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f1777c, nVar.f1777c) == 0 && Float.compare(this.f1778d, nVar.f1778d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1778d) + (Float.floatToIntBits(this.f1777c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f1777c);
        sb.append(", y=");
        return n1.c.u(sb, this.f1778d, ')');
    }
}
