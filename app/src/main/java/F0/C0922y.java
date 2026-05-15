package f0;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: f0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0916v f11949a;

    public C0922y(InterfaceC0916v interfaceC0916v) {
        this.f11949a = interfaceC0916v;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0922y) {
            return AbstractC1209k.a(this.f11949a, ((C0922y) obj).f11949a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11949a.hashCode() * 31;
    }
}
