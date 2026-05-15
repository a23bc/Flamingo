package Z1;

import A2.I;
import E4.F;
import androidx.datastore.preferences.protobuf.C0537j;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import b2.A0;
import b2.C0672m0;
import b2.C0678t;
import b2.C0681w;
import b2.C0682x;
import b2.I0;
import d0.C0799n;
import d0.C0801p;
import k.AbstractC1113a;
import l2.C1168h;
import m1.C1192b;
import m5.AbstractC1209k;
import m5.C1203e;
import p2.C1293c;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static Q a(U u7, C1203e c1203e, C1293c c1293c) {
        return u7.b(AbstractC1113a.G(c1203e), c1293c);
    }

    public static m1.o b(m1.o oVar, m1.o oVar2) {
        boolean z6 = oVar2 instanceof C1192b;
        if (!z6 || !(oVar instanceof C1192b)) {
            return (!z6 || (oVar instanceof C1192b)) ? (z6 || !(oVar instanceof C1192b)) ? oVar2.e(new E3.e(24, oVar)) : oVar : oVar2;
        }
        C1192b c1192b = (C1192b) oVar2;
        float f7 = c1192b.f14328b;
        if (Float.isNaN(f7)) {
            f7 = ((C1192b) oVar).f14328b;
        }
        return new C1192b(c1192b.f14327a, f7);
    }

    public static void c(InterfaceC0597u interfaceC0597u) {
        AbstractC1209k.f(interfaceC0597u, "owner");
    }

    public static void d(k3.m mVar, byte[] bArr, k3.l lVar, I i7) {
        mVar.l(bArr, 0, bArr.length, lVar, i7);
    }

    public static k3.b e(k3.m mVar, byte[] bArr, int i7) {
        F fO = E4.I.o();
        mVar.l(bArr, 0, i7, k3.l.f14044c, new I(17, fO));
        return new k3.b(fO.f());
    }

    public static o f(o oVar, o oVar2) {
        return oVar2 == m.f8781a ? oVar : new f(oVar, oVar2);
    }

    public static void g(C0799n c0799n, float f7) {
        C0801p c0801p = c0799n.f11047a;
        c0801p.f11063i.j(f7);
        c0801p.f11064j.j(0.0f);
    }

    public static int h(int i7, int i8, int i9) {
        return C0537j.y(i7) + i8 + i9;
    }

    public static int i(int i7, int i8, int i9, int i10) {
        return C0537j.z(i7) + i8 + i9 + i10;
    }

    public static int j(C1168h c1168h, int i7, int i8) {
        return (c1168h.f14167a + i7) * i8;
    }

    public static Y4.h k(int i7, int i8, Integer num) {
        return new Y4.h(new I0(i7, i8), num);
    }

    public static Y4.h l(int i7, C0678t c0678t) {
        return new Y4.h(c0678t, new C0672m0(i7));
    }

    public static Y4.h m(int i7, C0682x c0682x) {
        return new Y4.h(c0682x, new C0681w(i7));
    }

    public static Y4.h n(int i7, A0 a0) {
        return new Y4.h(a0, new C0672m0(i7));
    }

    public static String o(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String p(String str, int i7, int i8, String str2) {
        return str + i7 + str2 + i8;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(StringBuilder sb, int i7, char c7) {
        sb.append(i7);
        sb.append(c7);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, char c7) {
        sb.append(str);
        sb.append(c7);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void v(int i7) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC1209k.k(nullPointerException, AbstractC1209k.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void w(int i7, String str) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC1209k.i(str));
        AbstractC1209k.k(nullPointerException, AbstractC1209k.class.getName());
        throw nullPointerException;
    }

    public static void x(int i7, C1450e c1450e, String str, int i8, String str2) {
        c1450e.put(str, Integer.valueOf(i7));
        c1450e.put(str2, Integer.valueOf(i8));
    }

    public static /* synthetic */ String y(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "MatchParent" : "Expand" : "Fixed" : "Wrap";
    }
}
