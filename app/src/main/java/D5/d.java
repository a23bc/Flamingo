package D5;

import B5.v;
import java.util.concurrent.Executor;
import w5.AbstractC1805x;
import w5.X;

/* JADX INFO: loaded from: classes.dex */
public final class d extends X implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f1617q = new d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC1805x f1618r;

    static {
        l lVar = l.f1632q;
        int i7 = v.f920a;
        if (64 >= i7) {
            i7 = 64;
        }
        f1618r = lVar.D(B5.a.k("kotlinx.coroutines.io.parallelism", i7, 12));
    }

    @Override // w5.AbstractC1805x
    public final void A(c5.i iVar, Runnable runnable) {
        f1618r.A(iVar, runnable);
    }

    @Override // w5.AbstractC1805x
    public final void B(c5.i iVar, Runnable runnable) {
        f1618r.B(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A(c5.j.f10685o, runnable);
    }

    @Override // w5.AbstractC1805x
    public final String toString() {
        return "Dispatchers.IO";
    }
}
