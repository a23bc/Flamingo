package f0;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11790a;

    public b1(Object obj) {
        this.f11790a = obj;
    }

    @Override // f0.c1
    public final Object a(InterfaceC0906p0 interfaceC0906p0) {
        return this.f11790a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && AbstractC1209k.a(this.f11790a, ((b1) obj).f11790a);
    }

    public final int hashCode() {
        Object obj = this.f11790a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f11790a + ')';
    }
}
