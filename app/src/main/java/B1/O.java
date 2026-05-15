package b1;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class O implements InterfaceC0617b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9951a;

    public O(String str) {
        this.f9951a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return AbstractC1209k.a(this.f9951a, ((O) obj).f9951a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9951a.hashCode();
    }

    public final String toString() {
        return Z1.l.s(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f9951a, ')');
    }
}
