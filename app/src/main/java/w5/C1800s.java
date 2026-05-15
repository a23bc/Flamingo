package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: w5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1800s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19569b = AtomicIntegerFieldUpdater.newUpdater(C1800s.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f19570a;

    public C1800s(Throwable th, boolean z6) {
        this.f19570a = th;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f19570a + ']';
    }
}
