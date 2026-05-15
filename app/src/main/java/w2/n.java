package w2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f18870c = new n(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18872b;

    static {
        new n(0, 0);
    }

    public n(int i7, int i8) {
        AbstractC1697a.d((i7 == -1 || i7 >= 0) && (i8 == -1 || i8 >= 0));
        this.f18871a = i7;
        this.f18872b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f18871a == nVar.f18871a && this.f18872b == nVar.f18872b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f18871a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f18872b;
    }

    public final String toString() {
        return this.f18871a + "x" + this.f18872b;
    }
}
