package I4;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: I4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0229d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0229d f3505d = new C0229d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f3506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0229d f3508c;

    public C0229d(Runnable runnable, Executor executor) {
        this.f3506a = runnable;
        this.f3507b = executor;
    }

    public C0229d() {
        this.f3506a = null;
        this.f3507b = null;
    }
}
