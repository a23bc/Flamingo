package D0;

import A0.c;
import Q0.N;
import m5.AbstractC1209k;
import n1.n;
import w2.l;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f1447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1980m f1448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1449q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f1450r = n.f14521o;

    public abstract void b(float f7);

    public abstract void c(C1980m c1980m);

    public final void g(N n7, long j3, float f7, C1980m c1980m) {
        if (this.f1449q != f7) {
            b(f7);
            this.f1449q = f7;
        }
        if (!AbstractC1209k.a(this.f1448p, c1980m)) {
            c(c1980m);
            this.f1448p = c1980m;
        }
        n layoutDirection = n7.getLayoutDirection();
        if (this.f1450r != layoutDirection) {
            d(layoutDirection);
            this.f1450r = layoutDirection;
        }
        int i7 = (int) (j3 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (n7.f() >> 32)) - Float.intBitsToFloat(i7);
        int i8 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n7.f() & 4294967295L)) - Float.intBitsToFloat(i8);
        c cVar = n7.f5853o;
        ((A.b) cVar.f54p.f50p).t(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f7 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i7) > 0.0f && Float.intBitsToFloat(i8) > 0.0f) {
                    i(n7);
                }
            } finally {
                ((A.b) cVar.f54p.f50p).t(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long h();

    public abstract void i(N n7);

    public void d(n nVar) {
    }
}
