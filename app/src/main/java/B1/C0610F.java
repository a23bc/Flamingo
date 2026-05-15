package b1;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0610F implements InterfaceC0617b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9917a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0610F) {
            return AbstractC1209k.a(this.f9917a, ((C0610F) obj).f9917a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9917a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f9917a + ')';
    }
}
