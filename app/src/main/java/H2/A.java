package H2;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2977e;

    public A(Object obj) {
        this(-1L, obj);
    }

    public final A a(Object obj) {
        if (this.f2973a.equals(obj)) {
            return this;
        }
        return new A(obj, this.f2974b, this.f2975c, this.f2976d, this.f2977e);
    }

    public final boolean b() {
        return this.f2974b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a4 = (A) obj;
        return this.f2973a.equals(a4.f2973a) && this.f2974b == a4.f2974b && this.f2975c == a4.f2975c && this.f2976d == a4.f2976d && this.f2977e == a4.f2977e;
    }

    public final int hashCode() {
        return ((((((((this.f2973a.hashCode() + 527) * 31) + this.f2974b) * 31) + this.f2975c) * 31) + ((int) this.f2976d)) * 31) + this.f2977e;
    }

    public A(long j3, Object obj) {
        this(obj, -1, -1, j3, -1);
    }

    public A(int i7, long j3, Object obj) {
        this(obj, -1, -1, j3, i7);
    }

    public A(Object obj, int i7, int i8, long j3, int i9) {
        this.f2973a = obj;
        this.f2974b = i7;
        this.f2975c = i8;
        this.f2976d = j3;
        this.f2977e = i9;
    }
}
