package g1;

import b1.C0622g;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0978t implements InterfaceC0965g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0622g f12380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12381b;

    public C0978t(String str, int i7) {
        this.f12380a = new C0622g(str);
        this.f12381b = i7;
    }

    @Override // g1.InterfaceC0965g
    public final void a(C0966h c0966h) {
        int i7 = c0966h.f12357r;
        boolean z6 = i7 != -1;
        C0622g c0622g = this.f12380a;
        if (z6) {
            c0966h.g(c0622g.f9970p, i7, c0966h.f12358s);
            String str = c0622g.f9970p;
            if (str.length() > 0) {
                c0966h.h(i7, str.length() + i7);
            }
        } else {
            int i8 = c0966h.f12355p;
            c0966h.g(c0622g.f9970p, i8, c0966h.f12356q);
            String str2 = c0622g.f9970p;
            if (str2.length() > 0) {
                c0966h.h(i8, str2.length() + i8);
            }
        }
        int i9 = c0966h.f12355p;
        int i10 = c0966h.f12356q;
        int i11 = i9 == i10 ? i10 : -1;
        int i12 = this.f12381b;
        int iQ = i6.h.q(i12 > 0 ? (i11 + i12) - 1 : (i11 + i12) - c0622g.f9970p.length(), 0, ((d1.e) c0966h.f12359t).f());
        c0966h.i(iQ, iQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0978t)) {
            return false;
        }
        C0978t c0978t = (C0978t) obj;
        return AbstractC1209k.a(this.f12380a.f9970p, c0978t.f12380a.f9970p) && this.f12381b == c0978t.f12381b;
    }

    public final int hashCode() {
        return (this.f12380a.f9970p.hashCode() * 31) + this.f12381b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f12380a.f9970p);
        sb.append("', newCursorPosition=");
        return Z1.l.r(sb, this.f12381b, ')');
    }
}
