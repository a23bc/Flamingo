package D;

import O0.InterfaceC0298b0;
import f0.C0879c;
import f0.C0894j0;
import y1.C1993b;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0054a implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0894j0 f1294c = C0879c.t(C1993b.f20270e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0894j0 f1295d = C0879c.t(Boolean.TRUE);

    public C0054a(int i7, String str) {
        this.f1292a = i7;
        this.f1293b = str;
    }

    @Override // D.x0
    public final int a(InterfaceC0298b0 interfaceC0298b0) {
        return e().f20274d;
    }

    @Override // D.x0
    public final int b(InterfaceC0298b0 interfaceC0298b0) {
        return e().f20272b;
    }

    @Override // D.x0
    public final int c(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        return e().f20271a;
    }

    @Override // D.x0
    public final int d(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        return e().f20273c;
    }

    public final C1993b e() {
        return (C1993b) this.f1294c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0054a) {
            return this.f1292a == ((C0054a) obj).f1292a;
        }
        return false;
    }

    public final void f(G1.m0 m0Var, int i7) {
        int i8 = this.f1292a;
        if (i7 == 0 || (i7 & i8) != 0) {
            this.f1294c.setValue(m0Var.f2725a.g(i8));
            this.f1295d.setValue(Boolean.valueOf(m0Var.f2725a.q(i8)));
        }
    }

    public final int hashCode() {
        return this.f1292a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1293b);
        sb.append('(');
        sb.append(e().f20271a);
        sb.append(", ");
        sb.append(e().f20272b);
        sb.append(", ");
        sb.append(e().f20273c);
        sb.append(", ");
        return Z1.l.r(sb, e().f20274d, ')');
    }
}
