package F;

import f0.C0903o;
import f0.C0912t;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import o0.AbstractC1256m;
import w5.AbstractC1767D;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a */
    public static final r f2047a = new r(null, 0, false, 0.0f, new C(), 0.0f, false, AbstractC1767D.a(c5.j.f10685o), AbstractC1113a.f(), n1.b.b(0, 0, 15), Z4.v.f8818o, 0, 0, 0, EnumC2048l0.f20894o, 0, 0);

    public static final A a(final int i7, C0912t c0912t, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        final int i10 = (i9 & 2) != 0 ? 0 : -15;
        Object[] objArr = new Object[0];
        V1.a aVar = A.f2023x;
        boolean zD = c0912t.d(i7);
        boolean z6 = true;
        if ((((i8 & 112) ^ 48) <= 32 || !c0912t.d(i10)) && (i8 & 48) != 32) {
            z6 = false;
        }
        boolean z7 = zD | z6;
        Object objK = c0912t.K();
        if (z7 || objK == C0903o.f11850a) {
            objK = new InterfaceC1180a() { // from class: F.B
                @Override // l5.InterfaceC1180a
                public final Object a() {
                    return new A(i7, i10);
                }
            };
            c0912t.i0(objK);
        }
        return (A) AbstractC1256m.d(objArr, aVar, (InterfaceC1180a) objK, c0912t, 0);
    }
}
