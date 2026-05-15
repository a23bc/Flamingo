package b2;

/* JADX INFO: renamed from: b2.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0672m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10237a;

    public C0672m0(int i7) {
        this.f10237a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0672m0) && this.f10237a == ((C0672m0) obj).f10237a;
    }

    public final int hashCode() {
        return this.f10237a;
    }

    public final String toString() {
        return Z1.l.r(new StringBuilder("LayoutInfo(layoutId="), this.f10237a, ')');
    }
}
