package V4;

import f0.AbstractC0911s0;
import f0.C0912t;
import m5.AbstractC1210l;
import y0.C1987t;

/* JADX INFO: renamed from: V4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0456c extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0456c f7479q = new C0456c(2, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7480p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0456c(int i7, int i8) {
        super(i7);
        this.f7480p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7480p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                ((Number) obj2).intValue();
                c0912t.Y(-1637639664);
                long jB = C1987t.b(((C1987t) c0912t.j((AbstractC0911s0) c0912t.j(U4.b.f7051a))).f20264a, 0.1f);
                c0912t.p(false);
                return new C1987t(jB);
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                }
                return Y4.o.f8736a;
        }
    }
}
