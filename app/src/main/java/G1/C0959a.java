package g1;

import b1.C0622g;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0959a implements InterfaceC0965g {

    /* JADX INFO: renamed from: a */
    public final C0622g f12325a;

    /* JADX INFO: renamed from: b */
    public final int f12326b;

    public C0959a(C0622g c0622g, int i7) {
        this.f12325a = c0622g;
        this.f12326b = i7;
    }

    @Override // g1.InterfaceC0965g
    public final void a(C0966h c0966h) {
        int i7 = c0966h.f12357r;
        boolean z6 = i7 != -1;
        C0622g c0622g = this.f12325a;
        if (z6) {
            c0966h.g(c0622g.f9970p, i7, c0966h.f12358s);
        } else {
            c0966h.g(c0622g.f9970p, c0966h.f12355p, c0966h.f12356q);
        }
        int i8 = c0966h.f12355p;
        int i9 = c0966h.f12356q;
        int i10 = i8 == i9 ? i9 : -1;
        int i11 = this.f12326b;
        int iQ = i6.h.q(i11 > 0 ? (i10 + i11) - 1 : (i10 + i11) - c0622g.f9970p.length(), 0, ((d1.e) c0966h.f12359t).f());
        c0966h.i(iQ, iQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0959a)) {
            return false;
        }
        C0959a c0959a = (C0959a) obj;
        return AbstractC1209k.a(this.f12325a.f9970p, c0959a.f12325a.f9970p) && this.f12326b == c0959a.f12326b;
    }

    public final int hashCode() {
        return (this.f12325a.f9970p.hashCode() * 31) + this.f12326b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f12325a.f9970p);
        sb.append("', newCursorPosition=");
        return Z1.l.r(sb, this.f12326b, ')');
    }

    public C0959a(String str, int i7) {
        this(new C0622g(str), i7);
    }
}
