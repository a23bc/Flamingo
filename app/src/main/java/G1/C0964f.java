package g1;

import h1.AbstractC0996a;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964f implements InterfaceC0965g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12353b;

    public C0964f(int i7, int i8) {
        this.f12352a = i7;
        this.f12353b = i8;
        if (i7 >= 0 && i8 >= 0) {
            return;
        }
        AbstractC0996a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i8 + " respectively.");
    }

    @Override // g1.InterfaceC0965g
    public final void a(C0966h c0966h) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 < this.f12352a) {
                int i10 = i9 + 1;
                int i11 = c0966h.f12355p;
                if (i11 <= i10) {
                    i9 = i11;
                    break;
                } else {
                    i9 = (Character.isHighSurrogate(c0966h.e((i11 - i10) + (-1))) && Character.isLowSurrogate(c0966h.e(c0966h.f12355p - i10))) ? i9 + 2 : i10;
                    i8++;
                }
            } else {
                break;
            }
        }
        int iF = 0;
        while (true) {
            if (i7 >= this.f12353b) {
                break;
            }
            int i12 = iF + 1;
            int i13 = c0966h.f12356q + i12;
            d1.e eVar = (d1.e) c0966h.f12359t;
            if (i13 >= eVar.f()) {
                iF = eVar.f() - c0966h.f12356q;
                break;
            } else {
                iF = (Character.isHighSurrogate(c0966h.e((c0966h.f12356q + i12) + (-1))) && Character.isLowSurrogate(c0966h.e(c0966h.f12356q + i12))) ? iF + 2 : i12;
                i7++;
            }
        }
        int i14 = c0966h.f12356q;
        c0966h.a(i14, iF + i14);
        int i15 = c0966h.f12355p;
        c0966h.a(i15 - i9, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0964f)) {
            return false;
        }
        C0964f c0964f = (C0964f) obj;
        return this.f12352a == c0964f.f12352a && this.f12353b == c0964f.f12353b;
    }

    public final int hashCode() {
        return (this.f12352a * 31) + this.f12353b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f12352a);
        sb.append(", lengthAfterCursor=");
        return Z1.l.r(sb, this.f12353b, ')');
    }
}
