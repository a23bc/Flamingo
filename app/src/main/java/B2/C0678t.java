package b2;

import g2.C0985a;
import g2.C0986b;

/* JADX INFO: renamed from: b2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0678t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f10325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10327c;

    public C0678t(s0 s0Var, int i7, int i8) {
        this.f10325a = s0Var;
        this.f10326b = i7;
        this.f10327c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0678t)) {
            return false;
        }
        C0678t c0678t = (C0678t) obj;
        return this.f10325a == c0678t.f10325a && this.f10326b == c0678t.f10326b && this.f10327c == c0678t.f10327c;
    }

    public final int hashCode() {
        return (((this.f10325a.hashCode() * 31) + this.f10326b) * 31) + this.f10327c;
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f10325a + ", horizontalAlignment=" + ((Object) C0985a.b(this.f10326b)) + ", verticalAlignment=" + ((Object) C0986b.b(this.f10327c)) + ')';
    }
}
