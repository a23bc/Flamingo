package N2;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f4965c = new C(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4967b;

    public C(long j3, long j7) {
        this.f4966a = j3;
        this.f4967b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c7 = (C) obj;
            if (this.f4966a == c7.f4966a && this.f4967b == c7.f4967b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4966a) * 31) + ((int) this.f4967b);
    }

    public final String toString() {
        return "[timeUs=" + this.f4966a + ", position=" + this.f4967b + "]";
    }
}
