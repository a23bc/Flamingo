package I4;

/* JADX INFO: loaded from: classes.dex */
public final class C extends i implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f3491v;

    public C(Runnable runnable) {
        runnable.getClass();
        this.f3491v = runnable;
    }

    @Override // I4.p
    public final String j() {
        return "task=[" + this.f3491v + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3491v.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
