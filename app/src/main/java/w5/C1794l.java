package w5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: w5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1794l extends C1800s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19545c = AtomicIntegerFieldUpdater.newUpdater(C1794l.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1794l(C1793k c1793k, Throwable th, boolean z6) {
        if (th == null) {
            th = new CancellationException("Continuation " + c1793k + " was cancelled normally");
        }
        super(th, z6);
        this._resumed$volatile = 0;
    }
}
