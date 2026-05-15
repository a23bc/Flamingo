package b1;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0617b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9950a;

    public N(String str) {
        this.f9950a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            return AbstractC1209k.a(this.f9950a, ((N) obj).f9950a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9950a.hashCode();
    }

    public final String toString() {
        return Z1.l.s(new StringBuilder("UrlAnnotation(url="), this.f9950a, ')');
    }
}
