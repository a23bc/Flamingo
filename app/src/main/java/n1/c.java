package n1;

import A2.W;
import E4.G;
import E4.b0;
import I4.u;
import I4.y;
import Q0.C0351h;
import android.graphics.Path;
import android.graphics.RectF;
import f0.C0912t;
import j5.AbstractC1109c;
import java.util.HashMap;
import m5.AbstractC1209k;
import o1.AbstractC1258b;
import o1.InterfaceC1257a;
import r0.C1392j;
import r0.C1393k;
import r0.C1395m;
import r0.InterfaceC1398p;
import v.C1592J;
import v.C1614k;
import v.e0;
import v.f0;
import v.i0;
import v.k0;
import v.l0;
import v.m0;
import v.n0;
import w2.AbstractC1697a;
import x0.C1894d;
import y0.C1976i;
import y0.C1987t;
import y0.EnumC1957G;
import y3.C2019h;
import z4.InterfaceC2097p;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void A(A0.b bVar, long j3) {
        bVar.S().k();
        bVar.p0(j3);
    }

    public static void B(Number number, C1614k c1614k, String str, C2019h c2019h, String str2) {
        number.intValue();
        AbstractC1209k.f(c1614k, str);
        AbstractC1209k.f(c2019h, str2);
    }

    public static InterfaceC1398p D(k0 k0Var, f0 f0Var, boolean z6) {
        l0 l0Var = n0.f18130c;
        e0.f18078a.getClass();
        m0 m0Var = n0.f18129b;
        k0Var.getClass();
        return new C1393k(new i0(f0Var, new C1592J(1, z6), k0Var, m0Var, l0Var));
    }

    public static int a(InterfaceC2097p interfaceC2097p) {
        return (interfaceC2097p.p() ? interfaceC2097p.h() : interfaceC2097p.j()).b();
    }

    public static int b(InterfaceC2097p interfaceC2097p) {
        return (interfaceC2097p.p() ? interfaceC2097p.h() : interfaceC2097p.j()).g();
    }

    public static int c(InterfaceC2097p interfaceC2097p) {
        return (interfaceC2097p.p() ? interfaceC2097p.h() : interfaceC2097p.j()).q();
    }

    public static int d(InterfaceC2097p interfaceC2097p) {
        return (interfaceC2097p.p() ? interfaceC2097p.h() : interfaceC2097p.j()).c();
    }

    public static y e(b0 b0Var) {
        G gListIterator = b0Var.listIterator(0);
        while (gListIterator.hasNext()) {
            if (((t2.G) gListIterator.next()).f16224b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                u uVar = new u();
                uVar.m(unsupportedOperationException);
                return uVar;
            }
        }
        return M3.a.U(b0Var);
    }

    public static int f(float f7, d dVar) {
        float fV = dVar.v(f7);
        if (Float.isInfinite(fV)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fV);
    }

    public static InterfaceC1398p g(InterfaceC1398p interfaceC1398p, InterfaceC1398p interfaceC1398p2) {
        return interfaceC1398p2 == C1395m.f15634a ? interfaceC1398p : new C1392j(interfaceC1398p, interfaceC1398p2);
    }

    public static float h(long j3, d dVar) {
        float fC;
        float fN;
        if (!q.a(p.b(j3), 4294967296L)) {
            j.b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC1258b.f14655a;
        if (dVar.n() >= 1.03f) {
            InterfaceC1257a interfaceC1257aA = AbstractC1258b.a(dVar.n());
            fC = p.c(j3);
            if (interfaceC1257aA != null) {
                return interfaceC1257aA.b(fC);
            }
            fN = dVar.n();
        } else {
            fC = p.c(j3);
            fN = dVar.n();
        }
        return fN * fC;
    }

    public static long i(long j3, d dVar) {
        if (j3 != 9205357640488583168L) {
            return i6.g.d(dVar.k0(Float.intBitsToFloat((int) (j3 >> 32))), dVar.k0(Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static float j(long j3, d dVar) {
        if (!q.a(p.b(j3), 4294967296L)) {
            j.b("Only Sp can convert to Px");
        }
        return dVar.v(dVar.E(j3));
    }

    public static long k(long j3, d dVar) {
        if (j3 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fV = dVar.v(i.b(j3));
        float fV2 = dVar.v(i.a(j3));
        return (((long) Float.floatToRawIntBits(fV)) << 32) | (((long) Float.floatToRawIntBits(fV2)) & 4294967295L);
    }

    public static long l(float f7, d dVar) {
        float[] fArr = AbstractC1258b.f14655a;
        if (!(dVar.n() >= 1.03f)) {
            return AbstractC1109c.w(4294967296L, f7 / dVar.n());
        }
        InterfaceC1257a interfaceC1257aA = AbstractC1258b.a(dVar.n());
        return AbstractC1109c.w(4294967296L, interfaceC1257aA != null ? interfaceC1257aA.a(f7) : f7 / dVar.n());
    }

    public static void m(C1976i c1976i, C1894d c1894d) {
        EnumC1957G[] enumC1957GArr = EnumC1957G.f20179o;
        if (c1976i.f20242b == null) {
            c1976i.f20242b = new RectF();
        }
        RectF rectF = c1976i.f20242b;
        AbstractC1209k.c(rectF);
        float f7 = c1894d.f19876d;
        rectF.set(c1894d.f19873a, c1894d.f19874b, c1894d.f19875c, f7);
        if (c1976i.f20243c == null) {
            c1976i.f20243c = new float[8];
        }
        float[] fArr = c1976i.f20243c;
        AbstractC1209k.c(fArr);
        long j3 = c1894d.f19877e;
        fArr[0] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j7 = c1894d.f19878f;
        fArr[2] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        long j8 = c1894d.f19879g;
        fArr[4] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        long j9 = c1894d.h;
        fArr[6] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        RectF rectF2 = c1976i.f20242b;
        AbstractC1209k.c(rectF2);
        float[] fArr2 = c1976i.f20243c;
        AbstractC1209k.c(fArr2);
        c1976i.f20241a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static int n(float f7, int i7, int i8) {
        return (Float.floatToIntBits(f7) + i7) * i8;
    }

    public static int o(int i7, int i8, long j3) {
        return (C1987t.i(j3) + i7) * i8;
    }

    public static W p(String str) {
        N0.a.c(str);
        return new W();
    }

    public static B.k q(C0912t c0912t) {
        B.k kVar = new B.k();
        c0912t.i0(kVar);
        return kVar;
    }

    public static Object r(int i7, C0912t c0912t, boolean z6) {
        c0912t.p(z6);
        c0912t.X(i7);
        return c0912t.K();
    }

    public static String s(int i7, String str) {
        return str + i7;
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static String u(StringBuilder sb, float f7, char c7) {
        sb.append(f7);
        sb.append(c7);
        return sb.toString();
    }

    public static StringBuilder v(int i7, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    public static void w(int i7, C0912t c0912t, int i8, C0351h c0351h) {
        c0912t.i0(Integer.valueOf(i7));
        c0912t.b(Integer.valueOf(i8), c0351h);
    }

    public static void x(int i7, String str) {
        AbstractC1697a.w(str + i7);
    }

    public static void y(int i7, HashMap map, String str, int i8, String str2) {
        map.put(str, Integer.valueOf(i7));
        map.put(str2, Integer.valueOf(i8));
    }

    public static void z(long j3, StringBuilder sb, String str) {
        sb.append((Object) C1987t.j(j3));
        sb.append(str);
    }
}
