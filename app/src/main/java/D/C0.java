package D;

import f0.C0903o;
import f0.C0912t;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1212o;

    public /* synthetic */ C0(int i7) {
        this.f1212o = i7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        f0.W w7 = C0903o.f11850a;
        switch (this.f1212o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t.X(359872873);
                WeakHashMap weakHashMap = z0.f1422u;
                z0 z0VarF = C0058c.f(c0912t);
                boolean zF = c0912t.f(z0VarF);
                Object objK = c0912t.K();
                if (zF || objK == w7) {
                    objK = new Y(z0VarF.f1425c);
                    c0912t.i0(objK);
                }
                Y y6 = (Y) objK;
                c0912t.p(false);
                return y6;
            case 1:
                C0912t c0912t2 = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t2.X(359872873);
                WeakHashMap weakHashMap2 = z0.f1422u;
                z0 z0VarF2 = C0058c.f(c0912t2);
                boolean zF2 = c0912t2.f(z0VarF2);
                Object objK2 = c0912t2.K();
                if (zF2 || objK2 == w7) {
                    objK2 = new Y(z0VarF2.f1427e);
                    c0912t2.i0(objK2);
                }
                Y y7 = (Y) objK2;
                c0912t2.p(false);
                return y7;
            case 2:
                C0912t c0912t3 = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t3.X(359872873);
                WeakHashMap weakHashMap3 = z0.f1422u;
                z0 z0VarF3 = C0058c.f(c0912t3);
                boolean zF3 = c0912t3.f(z0VarF3);
                Object objK3 = c0912t3.K();
                if (zF3 || objK3 == w7) {
                    objK3 = new Y(z0VarF3.f1428f);
                    c0912t3.i0(objK3);
                }
                Y y8 = (Y) objK3;
                c0912t3.p(false);
                return y8;
            default:
                C0912t c0912t4 = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t4.X(359872873);
                WeakHashMap weakHashMap4 = z0.f1422u;
                z0 z0VarF4 = C0058c.f(c0912t4);
                boolean zF4 = c0912t4.f(z0VarF4);
                Object objK4 = c0912t4.K();
                if (zF4 || objK4 == w7) {
                    objK4 = new Y(z0VarF4.f1429g);
                    c0912t4.i0(objK4);
                }
                Y y9 = (Y) objK4;
                c0912t4.p(false);
                return y9;
        }
    }
}
