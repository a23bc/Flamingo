package E5;

import B5.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f2017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f2018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f2019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f2020e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2016a = B5.a.k("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f2021f = B5.a.k("kotlinx.coroutines.semaphore.segmentSize", 16, 12);

    static {
        int i7 = 0;
        f2017b = new u("PERMIT", i7);
        f2018c = new u("TAKEN", i7);
        f2019d = new u("BROKEN", i7);
        f2020e = new u("CANCELLED", i7);
    }
}
