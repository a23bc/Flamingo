package g1;

import b1.C0622g;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0957C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0622g f12322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B2.m f12323b;

    public C0957C(C0622g c0622g, B2.m mVar) {
        this.f12322a = c0622g;
        this.f12323b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0957C)) {
            return false;
        }
        C0957C c0957c = (C0957C) obj;
        return AbstractC1209k.a(this.f12322a, c0957c.f12322a) && AbstractC1209k.a(this.f12323b, c0957c.f12323b);
    }

    public final int hashCode() {
        return this.f12323b.hashCode() + (this.f12322a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f12322a) + ", offsetMapping=" + this.f12323b + ')';
    }
}
