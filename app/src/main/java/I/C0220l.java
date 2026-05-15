package I;

/* JADX INFO: renamed from: I.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220l implements InterfaceC0221m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3372a;

    public C0220l(float f7) {
        this.f3372a = f7;
    }

    @Override // I.InterfaceC0221m
    public final int a(H.N n7, int i7) {
        return n7.f2809p.L(this.f3372a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0220l)) {
            return false;
        }
        return n1.g.a(this.f3372a, ((C0220l) obj).f3372a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3372a);
    }
}
