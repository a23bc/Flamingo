package w;

import a.AbstractC0509a;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1182c;
import v.C1587E;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f18715a = 0;

    static {
        AbstractC0509a.N(Y4.f.f8724p, k0.f18706p);
    }

    public static final j0 a(j0 j0Var, Object obj, Object obj2, String str, C0912t c0912t, int i7) {
        int i8 = (i7 & 14) ^ 6;
        boolean z6 = true;
        boolean z7 = (i8 > 4 && c0912t.f(j0Var)) || (i7 & 6) == 4;
        Object objK = c0912t.K();
        Object obj3 = C0903o.f11850a;
        if (z7 || objK == obj3) {
            objK = new j0(new C1662K(obj), j0Var, j0Var.f18690c + " > " + str);
            c0912t.i0(objK);
        }
        j0 j0Var2 = (j0) objK;
        if ((i8 <= 4 || !c0912t.f(j0Var)) && (i7 & 6) != 4) {
            z6 = false;
        }
        boolean zF = c0912t.f(j0Var2) | z6;
        Object objK2 = c0912t.K();
        if (zF || objK2 == obj3) {
            objK2 = new K0.A(j0Var, 23, j0Var2);
            c0912t.i0(objK2);
        }
        C0879c.d(j0Var2, (InterfaceC1182c) objK2, c0912t);
        if (j0Var.g()) {
            j0Var2.k(obj, obj2);
            return j0Var2;
        }
        j0Var2.l(obj2);
        j0Var2.f18697k.setValue(Boolean.FALSE);
        return j0Var2;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r7v5, types: [l5.c, m5.l] */
    /* JADX WARN: Type inference failed for: r9v3, types: [l5.c, m5.l] */
    public static final c0 b(j0 j0Var, o0 o0Var, String str, C0912t c0912t, int i7, int i8) {
        b0 b0Var;
        if ((i8 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i9 = (i7 & 14) ^ 6;
        boolean z6 = true;
        boolean z7 = (i9 > 4 && c0912t.f(j0Var)) || (i7 & 6) == 4;
        Object objK = c0912t.K();
        Object obj = C0903o.f11850a;
        if (z7 || objK == obj) {
            objK = new c0(j0Var, o0Var, str);
            c0912t.i0(objK);
        }
        c0 c0Var = (c0) objK;
        if ((i9 <= 4 || !c0912t.f(j0Var)) && (i7 & 6) != 4) {
            z6 = false;
        }
        boolean zH = c0912t.h(c0Var) | z6;
        Object objK2 = c0912t.K();
        if (zH || objK2 == obj) {
            objK2 = new K0.A(j0Var, 24, c0Var);
            c0912t.i0(objK2);
        }
        C0879c.d(c0Var, (InterfaceC1182c) objK2, c0912t);
        if (j0Var.g() && (b0Var = (b0) c0Var.f18640b.getValue()) != null) {
            ?? r7 = b0Var.f18626q;
            j0 j0Var2 = c0Var.f18641c;
            b0Var.f18624o.e(r7.b(j0Var2.f().a()), b0Var.f18626q.b(j0Var2.f().c()), (InterfaceC1652A) b0Var.f18625p.b(j0Var2.f()));
        }
        return c0Var;
    }

    public static final j0 c(Object obj, String str, C0912t c0912t, int i7) {
        Object objK = c0912t.K();
        f0.W w7 = C0903o.f11850a;
        if (objK == w7) {
            objK = new j0(new C1662K(obj), null, str);
            c0912t.i0(objK);
        }
        j0 j0Var = (j0) objK;
        j0Var.a(obj, c0912t, (i7 & 8) | 48 | (i7 & 14));
        Object objK2 = c0912t.K();
        if (objK2 == w7) {
            objK2 = new C1587E(j0Var, 2);
            c0912t.i0(objK2);
        }
        C0879c.d(j0Var, (InterfaceC1182c) objK2, c0912t);
        return j0Var;
    }
}
