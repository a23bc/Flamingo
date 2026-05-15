package X;

import w.C1682o;
import x0.C1892b;

/* JADX INFO: renamed from: X.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0481i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1682o f8082a = new C1682o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w.o0 f8083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w.S f8085d;

    static {
        C0469c0 c0469c0 = new C0469c0(0);
        C0469c0 c0469c02 = new C0469c0(1);
        w.o0 o0Var = w.p0.f18727a;
        f8083b = new w.o0(c0469c0, c0469c02);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f8084c = jFloatToRawIntBits;
        f8085d = new w.S(3, new C1892b(jFloatToRawIntBits));
    }
}
