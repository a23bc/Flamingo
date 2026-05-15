package g1;

import h1.AbstractC0996a;

/* JADX INFO: renamed from: g1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0963e implements InterfaceC0965g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12351b;

    public C0963e(int i7, int i8) {
        this.f12350a = i7;
        this.f12351b = i8;
        if (i7 >= 0 && i8 >= 0) {
            return;
        }
        AbstractC0996a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i8 + " respectively.");
    }

    @Override // g1.InterfaceC0965g
    public final void a(C0966h c0966h) {
        int i7 = c0966h.f12356q;
        int i8 = this.f12351b;
        int iF = i7 + i8;
        int i9 = (i7 ^ iF) & (i8 ^ iF);
        d1.e eVar = (d1.e) c0966h.f12359t;
        if (i9 < 0) {
            iF = eVar.f();
        }
        c0966h.a(c0966h.f12356q, Math.min(iF, eVar.f()));
        int i10 = c0966h.f12355p;
        int i11 = this.f12350a;
        int i12 = i10 - i11;
        if (((i10 ^ i12) & (i11 ^ i10)) < 0) {
            i12 = 0;
        }
        c0966h.a(Math.max(0, i12), c0966h.f12355p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0963e)) {
            return false;
        }
        C0963e c0963e = (C0963e) obj;
        return this.f12350a == c0963e.f12350a && this.f12351b == c0963e.f12351b;
    }

    public final int hashCode() {
        return (this.f12350a * 31) + this.f12351b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f12350a);
        sb.append(", lengthAfterCursor=");
        return Z1.l.r(sb, this.f12351b, ')');
    }
}
