package b2;

/* JADX INFO: renamed from: b2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0681w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10344a;

    public C0681w(int i7) {
        this.f10344a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0681w) && this.f10344a == ((C0681w) obj).f10344a;
    }

    public final int hashCode() {
        return this.f10344a;
    }

    public final String toString() {
        return Z1.l.r(new StringBuilder("ContainerInfo(layoutId="), this.f10344a, ')');
    }
}
