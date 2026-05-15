package I4;

/* JADX INFO: renamed from: I4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0231f implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E f3514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f3515p;

    public RunnableC0231f(E e7, y yVar) {
        this.f3514o = e7;
        this.f3515p = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3514o.f3528o != this) {
            return;
        }
        if (p.f3526t.m(this.f3514o, this, p.h(this.f3515p))) {
            p.e(this.f3514o, false);
        }
    }
}
