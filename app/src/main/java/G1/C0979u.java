package g1;

/* JADX INFO: renamed from: g1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979u implements InterfaceC0965g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12383b;

    public C0979u(int i7, int i8) {
        this.f12382a = i7;
        this.f12383b = i8;
    }

    @Override // g1.InterfaceC0965g
    public final void a(C0966h c0966h) {
        int iQ = i6.h.q(this.f12382a, 0, ((d1.e) c0966h.f12359t).f());
        int iQ2 = i6.h.q(this.f12383b, 0, ((d1.e) c0966h.f12359t).f());
        if (iQ < iQ2) {
            c0966h.i(iQ, iQ2);
        } else {
            c0966h.i(iQ2, iQ);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0979u)) {
            return false;
        }
        C0979u c0979u = (C0979u) obj;
        return this.f12382a == c0979u.f12382a && this.f12383b == c0979u.f12383b;
    }

    public final int hashCode() {
        return (this.f12382a * 31) + this.f12383b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f12382a);
        sb.append(", end=");
        return Z1.l.r(sb, this.f12383b, ')');
    }
}
