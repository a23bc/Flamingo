package f1;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0926a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11988a;

    public C0926a(int i7) {
        this.f11988a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0926a) && this.f11988a == ((C0926a) obj).f11988a;
    }

    public final int hashCode() {
        return this.f11988a;
    }

    public final String toString() {
        return Z1.l.r(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f11988a, ')');
    }
}
