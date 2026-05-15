package r1;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC1406E f15724c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15722a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15723b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15725d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15726e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15727f = "";

    public u(EnumC1406E enumC1406E) {
        this.f15724c = enumC1406E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f15722a == uVar.f15722a && this.f15723b == uVar.f15723b && this.f15724c == uVar.f15724c && this.f15725d == uVar.f15725d && this.f15726e == uVar.f15726e;
    }

    public final int hashCode() {
        return ((((this.f15724c.hashCode() + ((((this.f15722a ? 1231 : 1237) * 31) + (this.f15723b ? 1231 : 1237)) * 31)) * 31) + (this.f15725d ? 1231 : 1237)) * 31) + (this.f15726e ? 1231 : 1237);
    }
}
