package g1;

/* JADX INFO: renamed from: g1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0977s implements InterfaceC0965g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12379b;

    public C0977s(int i7, int i8) {
        this.f12378a = i7;
        this.f12379b = i8;
    }

    @Override // g1.InterfaceC0965g
    public final void a(C0966h c0966h) {
        if (c0966h.f12357r != -1) {
            c0966h.f12357r = -1;
            c0966h.f12358s = -1;
        }
        d1.e eVar = (d1.e) c0966h.f12359t;
        int iQ = i6.h.q(this.f12378a, 0, eVar.f());
        int iQ2 = i6.h.q(this.f12379b, 0, eVar.f());
        if (iQ != iQ2) {
            if (iQ < iQ2) {
                c0966h.h(iQ, iQ2);
            } else {
                c0966h.h(iQ2, iQ);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0977s)) {
            return false;
        }
        C0977s c0977s = (C0977s) obj;
        return this.f12378a == c0977s.f12378a && this.f12379b == c0977s.f12379b;
    }

    public final int hashCode() {
        return (this.f12378a * 31) + this.f12379b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f12378a);
        sb.append(", end=");
        return Z1.l.r(sb, this.f12379b, ')');
    }
}
