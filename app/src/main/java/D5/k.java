package D5;

import B5.v;
import N3.p;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    public static final String f1625a;

    /* JADX INFO: renamed from: b */
    public static final long f1626b;

    /* JADX INFO: renamed from: c */
    public static final int f1627c;

    /* JADX INFO: renamed from: d */
    public static final int f1628d;

    /* JADX INFO: renamed from: e */
    public static final long f1629e;

    /* JADX INFO: renamed from: f */
    public static final g f1630f;

    /* JADX INFO: renamed from: g */
    public static final p f1631g;
    public static final p h;

    static {
        String property;
        int i7 = v.f920a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f1625a = property;
        f1626b = B5.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = v.f920a;
        if (i8 < 2) {
            i8 = 2;
        }
        f1627c = B5.a.k("kotlinx.coroutines.scheduler.core.pool.size", i8, 8);
        f1628d = B5.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f1629e = TimeUnit.SECONDS.toNanos(B5.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1630f = g.f1620a;
        f1631g = new p(0);
        h = new p(1);
    }
}
