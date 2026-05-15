package w5;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends w0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c5.d f19563r;

    public q0(c5.i iVar, l5.e eVar) {
        super(iVar, false);
        this.f19563r = I0.c.p(this, this, eVar);
    }

    @Override // w5.p0
    public final void a0() {
        try {
            B5.a.h(I0.c.D(this.f19563r), Y4.o.f8736a);
        } catch (Throwable th) {
            resumeWith(android.support.v4.media.session.b.l(th));
            throw th;
        }
    }
}
