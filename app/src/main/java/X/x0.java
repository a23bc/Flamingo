package X;

import l5.InterfaceC1182c;
import t.AbstractC1462q;
import t.C1441C;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f8203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f8204e;

    public x0(boolean z6, int i7, int i8, E e7, B b7) {
        this.f8200a = z6;
        this.f8201b = i7;
        this.f8202c = i8;
        this.f8203d = e7;
        this.f8204e = b7;
    }

    @Override // X.Z
    public final boolean a() {
        return this.f8200a;
    }

    @Override // X.Z
    public final B b() {
        return this.f8204e;
    }

    @Override // X.Z
    public final E c() {
        return this.f8203d;
    }

    @Override // X.Z
    public final C1441C d(E e7) {
        boolean z6 = e7.f7893c;
        D d4 = e7.f7892b;
        D d7 = e7.f7891a;
        if ((!z6 && d7.f7888b > d4.f7888b) || (z6 && d7.f7888b <= d4.f7888b)) {
            e7 = E.a(e7, null, null, !z6, 3);
        }
        long j3 = this.f8204e.f7873a;
        C1441C c1441c = AbstractC1462q.f16101a;
        C1441C c1441c2 = new C1441C();
        c1441c2.h(j3, e7);
        return c1441c2;
    }

    @Override // X.Z
    public final B f() {
        return this.f8204e;
    }

    @Override // X.Z
    public final B g() {
        return this.f8204e;
    }

    @Override // X.Z
    public final int h() {
        return this.f8201b;
    }

    @Override // X.Z
    public final int i() {
        return this.f8202c;
    }

    @Override // X.Z
    public final B j() {
        return this.f8204e;
    }

    @Override // X.Z
    public final EnumC0482j k() {
        int i7 = this.f8201b;
        int i8 = this.f8202c;
        return i7 < i8 ? EnumC0482j.f8087p : i7 > i8 ? EnumC0482j.f8086o : this.f8204e.b();
    }

    @Override // X.Z
    public final int l() {
        return 1;
    }

    @Override // X.Z
    public final boolean m(Z z6) {
        if (this.f8203d == null || z6 == null || !(z6 instanceof x0)) {
            return true;
        }
        x0 x0Var = (x0) z6;
        if (this.f8201b != x0Var.f8201b || this.f8202c != x0Var.f8202c || this.f8200a != x0Var.f8200a) {
            return true;
        }
        B b7 = this.f8204e;
        b7.getClass();
        B b8 = x0Var.f8204e;
        return (b7.f7873a == b8.f7873a && b7.f7875c == b8.f7875c && b7.f7876d == b8.f7876d) ? false : true;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f8200a + ", crossed=" + k() + ", info=\n\t" + this.f8204e + ')';
    }

    @Override // X.Z
    public final void e(InterfaceC1182c interfaceC1182c) {
    }
}
