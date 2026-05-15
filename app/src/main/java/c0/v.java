package c0;

import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import w.AbstractC1692z;
import w.n0;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f10603a = new n0(15, AbstractC1692z.f18767b, 2);

    public static final C0714f a(float f7, C0912t c0912t, int i7, int i8) {
        boolean z6 = (i8 & 1) != 0;
        if ((i8 & 2) != 0) {
            f7 = Float.NaN;
        }
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(new C1987t(C1987t.f20262j), c0912t);
        boolean z7 = ((((i7 & 14) ^ 6) > 4 && c0912t.g(z6)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && c0912t.c(f7)) || (i7 & 48) == 32);
        Object objK = c0912t.K();
        if (z7 || objK == C0903o.f11850a) {
            objK = new C0714f(z6, f7, interfaceC0878b0X);
            c0912t.i0(objK);
        }
        return (C0714f) objK;
    }
}
