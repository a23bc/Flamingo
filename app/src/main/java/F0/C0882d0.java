package f0;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: f0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0882d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11793a;

    public C0882d0(String str) {
        this.f11793a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0882d0) && AbstractC1209k.a(this.f11793a, ((C0882d0) obj).f11793a);
    }

    public final int hashCode() {
        return this.f11793a.hashCode();
    }

    public final String toString() {
        return Z1.l.s(new StringBuilder("OpaqueKey(key="), this.f11793a, ')');
    }
}
