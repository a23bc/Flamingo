package d0;

import r1.EnumC1406E;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10887a;

    public K(boolean z6) {
        EnumC1406E enumC1406E = EnumC1406E.f15661o;
        this.f10887a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        k7.getClass();
        EnumC1406E enumC1406E = EnumC1406E.f15661o;
        return this.f10887a == k7.f10887a;
    }

    public final int hashCode() {
        return (((EnumC1406E.f15661o.hashCode() * 31) + 1231) * 31) + (this.f10887a ? 1231 : 1237);
    }
}
