package v6;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18366b;

    public g(int i7, int i8) {
        this.f18365a = i7;
        this.f18366b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f18365a == gVar.f18365a && this.f18366b == gVar.f18366b;
    }

    public final int hashCode() {
        return (this.f18365a * 31) + this.f18366b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarqueeLayoutInfo(width=");
        sb.append(this.f18365a);
        sb.append(", containerWidth=");
        return Z1.l.r(sb, this.f18366b, ')');
    }
}
