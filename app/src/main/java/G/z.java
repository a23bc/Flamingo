package G;

import D.A0;
import f0.C0903o;
import f0.C0912t;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import o0.AbstractC1256m;
import w5.AbstractC1767D;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a */
    public static final n f2631a;

    static {
        y yVar = new y();
        Z4.v vVar = Z4.v.f8818o;
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        f2631a = new n(null, 0, false, 0.0f, yVar, 0.0f, false, AbstractC1767D.a(c5.j.f10685o), AbstractC1113a.f(), 0, new F.g(4), vVar, 0, 0, 0, enumC2048l0, 0, 0);
    }

    public static final x a(C0912t c0912t) {
        Object[] objArr = new Object[0];
        V1.a aVar = x.f2610w;
        boolean zD = c0912t.d(0) | c0912t.d(0);
        Object objK = c0912t.K();
        if (zD || objK == C0903o.f11850a) {
            objK = new A0(2);
            c0912t.i0(objK);
        }
        return (x) AbstractC1256m.d(objArr, aVar, (InterfaceC1180a) objK, c0912t, 0);
    }
}
