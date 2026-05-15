package P;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5686a;

    public a(int i7) {
        this.f5686a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5686a == ((a) obj).f5686a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5686a;
    }
}
