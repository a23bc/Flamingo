package X3;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f8306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f8307p;

    public q(r rVar, String str) {
        this.f8306o = rVar;
        this.f8307p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8306o.f8311d) {
            try {
                if (((q) this.f8306o.f8309b.remove(this.f8307p)) != null) {
                    p pVar = (p) this.f8306o.f8310c.remove(this.f8307p);
                    if (pVar != null) {
                        int i7 = Q3.e.f6120x;
                        N3.p.d().b(new Throwable[0]);
                        ((Q3.e) pVar).f();
                    }
                } else {
                    N3.p.d().b(new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
