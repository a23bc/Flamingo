package U5;

import D.A0;
import f0.C0912t;
import j5.AbstractC1109c;
import r0.C1395m;
import v6.EnumC1649c;
import y0.C1987t;

/* JADX INFO: renamed from: U5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0430b implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0430b f7218p = new C0430b(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0430b f7219q = new C0430b(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7220o;

    public /* synthetic */ C0430b(int i7) {
        this.f7220o = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7220o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    AbstractC1109c.f(new A0(6), androidx.compose.foundation.layout.c.g(C1395m.f15634a, 47), 0.0f, null, false, 6, EnumC1649c.f18349p, false, c0912t, 14159286, 304);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    boolean zA = t6.a.a(c0912t2);
                    B4.a aVarA = B4.c.a(c0912t2);
                    long j3 = C1987t.f20261i;
                    boolean z6 = !zA;
                    A0.e.M(aVarA, j3, z6, 8);
                    A0.e.N(aVarA, j3, z6);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
