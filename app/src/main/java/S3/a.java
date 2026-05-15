package S3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6742d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6739a == aVar.f6739a && this.f6740b == aVar.f6740b && this.f6741c == aVar.f6741c && this.f6742d == aVar.f6742d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z6 = this.f6740b;
        ?? r12 = this.f6739a;
        int i7 = r12;
        if (z6) {
            i7 = r12 + 16;
        }
        int i8 = i7;
        if (this.f6741c) {
            i8 = i7 + 256;
        }
        return this.f6742d ? i8 + 4096 : i8;
    }

    public final String toString() {
        return "[ Connected=" + this.f6739a + " Validated=" + this.f6740b + " Metered=" + this.f6741c + " NotRoaming=" + this.f6742d + " ]";
    }
}
