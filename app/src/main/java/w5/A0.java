package w5;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f19463a = new ThreadLocal();

    public static W a() {
        ThreadLocal threadLocal = f19463a;
        W w7 = (W) threadLocal.get();
        if (w7 != null) {
            return w7;
        }
        C1785g c1785g = new C1785g(Thread.currentThread());
        threadLocal.set(c1785g);
        return c1785g;
    }
}
