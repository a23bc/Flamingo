package Y;

import a.AbstractC0509a;
import f0.D;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f8384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f8385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0.h f8386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0.h f8387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0.h f8388e;

    static {
        AbstractC0509a.O(b.f8363w);
        f8384a = new D(b.f8362v);
        long j3 = C1987t.f20262j;
        new n(j3, true);
        f8385b = new n(j3, false);
        f8386c = new c0.h(0.16f, 0.24f, 0.08f, 0.24f);
        f8387d = new c0.h(0.08f, 0.12f, 0.04f, 0.12f);
        f8388e = new c0.h(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static n a() {
        long j3 = C1987t.f20262j;
        return (n1.g.a(Float.NaN, Float.NaN) && C1987t.c(j3, j3)) ? f8385b : new n(j3, false);
    }
}
