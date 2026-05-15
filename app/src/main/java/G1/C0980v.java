package g1;

import b1.AbstractC0607C;
import b1.C0622g;
import b1.L;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0980v {

    /* JADX INFO: renamed from: a */
    public final C0622g f12384a;

    /* JADX INFO: renamed from: b */
    public final long f12385b;

    /* JADX INFO: renamed from: c */
    public final L f12386c;

    public C0980v(C0622g c0622g, long j3, L l) {
        L l7;
        this.f12384a = c0622g;
        this.f12385b = AbstractC0607C.c(j3, c0622g.f9970p.length());
        if (l != null) {
            l7 = new L(AbstractC0607C.c(l.f9945a, c0622g.f9970p.length()));
        } else {
            l7 = null;
        }
        this.f12386c = l7;
    }

    public static C0980v a(C0980v c0980v, C0622g c0622g, long j3, int i7) {
        if ((i7 & 1) != 0) {
            c0622g = c0980v.f12384a;
        }
        if ((i7 & 2) != 0) {
            j3 = c0980v.f12385b;
        }
        L l = (i7 & 4) != 0 ? c0980v.f12386c : null;
        c0980v.getClass();
        return new C0980v(c0622g, j3, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0980v)) {
            return false;
        }
        C0980v c0980v = (C0980v) obj;
        return L.b(this.f12385b, c0980v.f12385b) && AbstractC1209k.a(this.f12386c, c0980v.f12386c) && AbstractC1209k.a(this.f12384a, c0980v.f12384a);
    }

    public final int hashCode() {
        int i7;
        int iHashCode = this.f12384a.hashCode() * 31;
        int i8 = L.f9944c;
        long j3 = this.f12385b;
        int i9 = (((int) (j3 ^ (j3 >>> 32))) + iHashCode) * 31;
        L l = this.f12386c;
        if (l != null) {
            long j7 = l.f9945a;
            i7 = (int) ((j7 >>> 32) ^ j7);
        } else {
            i7 = 0;
        }
        return i9 + i7;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f12384a) + "', selection=" + ((Object) L.h(this.f12385b)) + ", composition=" + this.f12386c + ')';
    }

    public C0980v(long j3, String str, int i7) {
        this(new C0622g((i7 & 1) != 0 ? "" : str), (i7 & 2) != 0 ? L.f9943b : j3, (L) null);
    }
}
