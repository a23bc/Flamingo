package o0;

import H.I;
import M.C0265j;
import Y4.o;
import b1.x;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;
import f0.W;
import f0.a1;
import java.util.Map;
import l5.InterfaceC1182c;
import t.J;
import t.Q;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1249f implements InterfaceC1246c {

    /* JADX INFO: renamed from: s */
    public static final V1.a f14641s = new V1.a(new x(13), new C1247d(0));

    /* JADX INFO: renamed from: o */
    public final Map f14642o;

    /* JADX INFO: renamed from: p */
    public final J f14643p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1251h f14644q;

    /* JADX INFO: renamed from: r */
    public final D.J f14645r;

    public C1249f(Map map) {
        this.f14642o = map;
        long[] jArr = Q.f16032a;
        this.f14643p = new J();
        this.f14645r = new D.J(27, this);
    }

    @Override // o0.InterfaceC1246c
    public final void a(Object obj, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(533563200);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(dVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(this) ? 256 : 128;
        }
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            c0912t.a0(obj);
            Object objK = c0912t.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                D.J j3 = this.f14645r;
                if (!((Boolean) j3.b(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f14642o.get(obj);
                a1 a1Var = AbstractC1253j.f14649a;
                C1254k c1254k = new C1254k(new C1252i(map, j3));
                c0912t.i0(c1254k);
                objK = c1254k;
            }
            C1254k c1254k2 = (C1254k) objK;
            C0879c.b(new C0913t0[]{AbstractC1253j.f14649a.a(c1254k2), F3.a.f2311a.a(c1254k2)}, dVar, c0912t, (i8 & 112) | 8);
            o oVar = o.f8736a;
            boolean zH = c0912t.h(this) | c0912t.h(obj) | c0912t.h(c1254k2);
            Object objK2 = c0912t.K();
            if (zH || objK2 == w7) {
                objK2 = new C0265j(this, obj, c1254k2, 12);
                c0912t.i0(objK2);
            }
            C0879c.d(oVar, (InterfaceC1182c) objK2, c0912t);
            if (c0912t.f11915y && c0912t.f11878G.f11674i == c0912t.f11916z) {
                c0912t.f11916z = -1;
                c0912t.f11915y = false;
            }
            c0912t.p(false);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(i7, 9, this, obj, dVar);
        }
    }

    @Override // o0.InterfaceC1246c
    public final void b(Object obj) {
        if (this.f14643p.k(obj) == null) {
            this.f14642o.remove(obj);
        }
    }
}
