package v;

import m5.AbstractC1209k;
import w.InterfaceC1652A;

/* JADX INFO: renamed from: v.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1600S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1652A f18008a;

    public C1600S(InterfaceC1652A interfaceC1652A) {
        this.f18008a = interfaceC1652A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1600S)) {
            return false;
        }
        C1600S c1600s = (C1600S) obj;
        c1600s.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && AbstractC1209k.a(this.f18008a, c1600s.f18008a);
    }

    public final int hashCode() {
        return this.f18008a.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f18008a + ')';
    }
}
