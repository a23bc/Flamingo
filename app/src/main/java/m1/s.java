package m1;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f14358c = new s(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f14359d = new s(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14361b;

    public s(int i7, boolean z6) {
        this.f14360a = i7;
        this.f14361b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f14360a == sVar.f14360a && this.f14361b == sVar.f14361b;
    }

    public final int hashCode() {
        return (this.f14360a * 31) + (this.f14361b ? 1231 : 1237);
    }

    public final String toString() {
        return equals(f14358c) ? "TextMotion.Static" : equals(f14359d) ? "TextMotion.Animated" : "Invalid";
    }
}
