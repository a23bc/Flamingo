package H2;

import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final class F implements J2.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.q f2985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2.i0 f2986b;

    public F(J2.q qVar, t2.i0 i0Var) {
        this.f2985a = qVar;
        this.f2986b = i0Var;
    }

    @Override // J2.q
    public final void a(boolean z6) {
        this.f2985a.a(z6);
    }

    @Override // J2.q
    public final C1487p b(int i7) {
        return this.f2986b.f16493d[this.f2985a.d(i7)];
    }

    @Override // J2.q
    public final void c() {
        this.f2985a.c();
    }

    @Override // J2.q
    public final int d(int i7) {
        return this.f2985a.d(i7);
    }

    @Override // J2.q
    public final void e() {
        this.f2985a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f7 = (F) obj;
        return this.f2985a.equals(f7.f2985a) && this.f2986b.equals(f7.f2986b);
    }

    @Override // J2.q
    public final int f() {
        return this.f2985a.f();
    }

    @Override // J2.q
    public final t2.i0 g() {
        return this.f2986b;
    }

    @Override // J2.q
    public final C1487p h() {
        return this.f2986b.f16493d[this.f2985a.f()];
    }

    public final int hashCode() {
        return this.f2985a.hashCode() + ((this.f2986b.hashCode() + 527) * 31);
    }

    @Override // J2.q
    public final void i(float f7) {
        this.f2985a.i(f7);
    }

    @Override // J2.q
    public final void j() {
        this.f2985a.j();
    }

    @Override // J2.q
    public final void k() {
        this.f2985a.k();
    }

    @Override // J2.q
    public final int l(int i7) {
        return this.f2985a.l(i7);
    }

    @Override // J2.q
    public final int length() {
        return this.f2985a.length();
    }
}
