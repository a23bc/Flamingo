package A2;

/* JADX INFO: loaded from: classes.dex */
public final class L implements q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public L f84o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public L f85p;

    @Override // A2.q0
    public final void a(int i7, Object obj) {
        if (i7 == 7) {
            this.f84o = (L) obj;
        } else if (i7 == 8) {
            this.f85p = (L) obj;
        } else if (i7 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void b() {
        L l = this.f85p;
        if (l != null) {
            l.b();
        }
    }

    public final void c() {
        L l = this.f85p;
        if (l != null) {
            l.c();
        }
    }

    public final void d() {
        L l = this.f84o;
        if (l != null) {
            l.d();
        }
    }
}
