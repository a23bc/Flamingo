package N3;

import L2.C0247a;
import N2.z;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f5110a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f5111b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f5112c = new x();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f5113d = new z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0247a f5114e = new C0247a(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5115f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5116g = Integer.MAX_VALUE;
    public final int h = 20;

    public b(z zVar) {
    }
}
