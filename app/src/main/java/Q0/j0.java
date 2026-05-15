package Q0;

import K0.InterfaceC0241i;
import O0.C0322t;
import O0.InterfaceC0296a0;
import R0.C0415x;
import a.AbstractC0509a;
import android.os.Build;
import android.view.ViewParent;
import d.C0746L;
import j5.AbstractC1107a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import p0.AbstractC1289f;
import r0.AbstractC1397o;
import t.C1443E;
import t.C1444F;
import x0.C1891a;
import x0.C1892b;
import x0.C1893c;
import x0.C1894d;
import y0.AbstractC1959I;
import y0.C1953C;
import y0.C1954D;
import y0.C1955E;
import y0.C1956F;
import y0.C1960J;
import y0.C1967Q;
import y0.C1976i;
import y0.C1982o;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends T implements O0.Y, O0.C, t0 {
    public static final C1960J a0;
    public static final C0368y b0;

    /* JADX INFO: renamed from: c0 */
    public static final float[] f6021c0;

    /* JADX INFO: renamed from: d0 */
    public static final C0343d f6022d0;

    /* JADX INFO: renamed from: e0 */
    public static final C0343d f6023e0;

    /* JADX INFO: renamed from: C */
    public final K f6024C;

    /* JADX INFO: renamed from: D */
    public boolean f6025D;

    /* JADX INFO: renamed from: E */
    public boolean f6026E;

    /* JADX INFO: renamed from: F */
    public j0 f6027F;

    /* JADX INFO: renamed from: G */
    public j0 f6028G;

    /* JADX INFO: renamed from: H */
    public boolean f6029H;

    /* JADX INFO: renamed from: I */
    public boolean f6030I;

    /* JADX INFO: renamed from: J */
    public InterfaceC1182c f6031J;

    /* JADX INFO: renamed from: K */
    public n1.d f6032K;

    /* JADX INFO: renamed from: L */
    public n1.n f6033L;

    /* JADX INFO: renamed from: N */
    public InterfaceC0296a0 f6035N;

    /* JADX INFO: renamed from: O */
    public C1443E f6036O;

    /* JADX INFO: renamed from: Q */
    public float f6038Q;

    /* JADX INFO: renamed from: R */
    public C1891a f6039R;

    /* JADX INFO: renamed from: S */
    public C0368y f6040S;

    /* JADX INFO: renamed from: T */
    public B0.d f6041T;

    /* JADX INFO: renamed from: U */
    public InterfaceC1985r f6042U;

    /* JADX INFO: renamed from: V */
    public O0.Q f6043V;

    /* JADX INFO: renamed from: X */
    public boolean f6045X;

    /* JADX INFO: renamed from: Y */
    public r0 f6046Y;
    public B0.d Z;

    /* JADX INFO: renamed from: M */
    public float f6034M = 0.8f;

    /* JADX INFO: renamed from: P */
    public long f6037P = 0;

    /* JADX INFO: renamed from: W */
    public final i0 f6044W = new i0(this, 1);

    static {
        C1960J c1960j = new C1960J();
        c1960j.f20194p = 1.0f;
        c1960j.f20195q = 1.0f;
        c1960j.f20196r = 1.0f;
        long j3 = y0.z.f20268a;
        c1960j.f20200v = j3;
        c1960j.f20201w = j3;
        c1960j.f20203y = 8.0f;
        c1960j.f20204z = C1967Q.f20224b;
        c1960j.f20184A = AbstractC1959I.f20180a;
        c1960j.f20186C = 0;
        c1960j.f20187D = 9205357640488583168L;
        c1960j.f20188E = AbstractC1113a.f();
        c1960j.f20189F = n1.n.f14521o;
        c1960j.f20191H = 3;
        a0 = c1960j;
        b0 = new C0368y();
        f6021c0 = C1953C.a();
        f6022d0 = new C0343d(1);
        f6023e0 = new C0343d(2);
    }

    public j0(K k7) {
        this.f6024C = k7;
        this.f6032K = k7.f5814M;
        this.f6033L = k7.f5815N;
    }

    public static j0 c1(O0.C c7) {
        j0 j0Var;
        O0.U u7 = c7 instanceof O0.U ? (O0.U) c7 : null;
        if (u7 != null && (j0Var = u7.f5369o.f5888C) != null) {
            return j0Var;
        }
        AbstractC1209k.d(c7, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (j0) c7;
    }

    public final long A0(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - T();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - S();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float B0(long j3, long j7) {
        if (T() >= Float.intBitsToFloat((int) (j7 >> 32)) && S() >= Float.intBitsToFloat((int) (j7 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jA0 = A0(j7);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - T());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - S()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i7 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i7) <= fIntBitsToFloat) {
                int i8 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i8) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i7);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i8);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // O0.C
    public final void C(O0.C c7, float[] fArr) {
        j0 j0VarC1 = c1(c7);
        j0VarC1.T0();
        j0 j0VarF0 = F0(j0VarC1);
        C1953C.d(fArr);
        j0VarC1.f1(j0VarF0, fArr);
        e1(j0VarF0, fArr);
    }

    public final void C0(InterfaceC1985r interfaceC1985r, B0.d dVar) {
        r0 r0Var = this.f6046Y;
        if (r0Var == null) {
            long j3 = this.f6037P;
            float f7 = (int) (j3 >> 32);
            float f8 = (int) (j3 & 4294967295L);
            interfaceC1985r.h(f7, f8);
            D0(interfaceC1985r, dVar);
            interfaceC1985r.h(-f7, -f8);
            return;
        }
        R0.A0 a02 = (R0.A0) r0Var;
        a02.f();
        a02.f6233H = a02.f6235o.f615a.I() > 0.0f;
        A0.c cVar = a02.f6226A;
        A0.b bVar = cVar.f54p;
        bVar.m0(interfaceC1985r);
        bVar.f51q = dVar;
        AbstractC0509a.t(cVar, a02.f6235o);
    }

    public final void D0(InterfaceC1985r interfaceC1985r, B0.d dVar) {
        InterfaceC1985r interfaceC1985r2;
        B0.d dVar2;
        AbstractC1397o abstractC1397oK0 = K0(4);
        if (abstractC1397oK0 == null) {
            X0(interfaceC1985r, dVar);
            return;
        }
        K k7 = this.f6024C;
        k7.getClass();
        N sharedDrawScope = ((C0415x) O.a(k7)).getSharedDrawScope();
        long jE = AbstractC1107a.E(this.f5418q);
        sharedDrawScope.getClass();
        h0.e eVar = null;
        while (abstractC1397oK0 != null) {
            if (abstractC1397oK0 instanceof InterfaceC0360p) {
                interfaceC1985r2 = interfaceC1985r;
                dVar2 = dVar;
                sharedDrawScope.c(interfaceC1985r2, jE, this, (InterfaceC0360p) abstractC1397oK0, dVar2);
            } else {
                interfaceC1985r2 = interfaceC1985r;
                dVar2 = dVar;
                if ((abstractC1397oK0.f15639q & 4) != 0 && (abstractC1397oK0 instanceof AbstractC0358n)) {
                    int i7 = 0;
                    for (AbstractC1397o abstractC1397o = ((AbstractC0358n) abstractC1397oK0).f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
                        if ((abstractC1397o.f15639q & 4) != 0) {
                            i7++;
                            if (i7 == 1) {
                                abstractC1397oK0 = abstractC1397o;
                            } else {
                                if (eVar == null) {
                                    eVar = new h0.e(new AbstractC1397o[16]);
                                }
                                if (abstractC1397oK0 != null) {
                                    eVar.b(abstractC1397oK0);
                                    abstractC1397oK0 = null;
                                }
                                eVar.b(abstractC1397o);
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
                interfaceC1985r = interfaceC1985r2;
                dVar = dVar2;
            }
            abstractC1397oK0 = AbstractC0347f.f(eVar);
            interfaceC1985r = interfaceC1985r2;
            dVar = dVar2;
        }
    }

    public abstract void E0();

    public final j0 F0(j0 j0Var) {
        K kV = j0Var.f6024C;
        K k7 = this.f6024C;
        if (kV == k7) {
            AbstractC1397o abstractC1397oJ0 = j0Var.J0();
            AbstractC1397o abstractC1397oJ02 = J0();
            if (!abstractC1397oJ02.f15637o.f15636B) {
                N0.a.b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC1397o abstractC1397o = abstractC1397oJ02.f15637o.f15641s; abstractC1397o != null; abstractC1397o = abstractC1397o.f15641s) {
                if ((abstractC1397o.f15639q & 2) != 0 && abstractC1397o == abstractC1397oJ0) {
                    return j0Var;
                }
            }
            return this;
        }
        while (kV.f5805D > k7.f5805D) {
            kV = kV.v();
            AbstractC1209k.c(kV);
        }
        K kV2 = k7;
        while (kV2.f5805D > kV.f5805D) {
            kV2 = kV2.v();
            AbstractC1209k.c(kV2);
        }
        while (kV != kV2) {
            kV = kV.v();
            kV2 = kV2.v();
            if (kV == null || kV2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (kV2 != k7) {
            if (kV != j0Var.f6024C) {
                return kV.f5821T.f6002c;
            }
            return j0Var;
        }
        return this;
    }

    @Override // O0.C
    public final long G() {
        return this.f5418q;
    }

    public final long G0(long j3) {
        long j7 = this.f6037P;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - ((int) (j7 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) - ((int) (j7 >> 32)))) << 32);
        r0 r0Var = this.f6046Y;
        return r0Var != null ? ((R0.A0) r0Var).c(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public abstract U H0();

    @Override // O0.C
    public final long I(long j3) {
        if (!J0().f15636B) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        T0();
        for (j0 j0Var = this; j0Var != null; j0Var = j0Var.f6028G) {
            r0 r0Var = j0Var.f6046Y;
            if (r0Var != null) {
                j3 = ((R0.A0) r0Var).c(j3, false);
            }
            j3 = i6.h.F(j3, j0Var.f6037P);
        }
        return j3;
    }

    public final long I0() {
        return this.f6032K.V(this.f6024C.f5816O.g());
    }

    public abstract AbstractC1397o J0();

    @Override // O0.C
    public final long K(O0.C c7, long j3) {
        return S0(c7, j3);
    }

    public final AbstractC1397o K0(int i7) {
        boolean zG = k0.g(i7);
        AbstractC1397o abstractC1397oJ0 = J0();
        if (!zG && (abstractC1397oJ0 = abstractC1397oJ0.f15641s) == null) {
            return null;
        }
        for (AbstractC1397o abstractC1397oL0 = L0(zG); abstractC1397oL0 != null && (abstractC1397oL0.f15640r & i7) != 0; abstractC1397oL0 = abstractC1397oL0.f15642t) {
            if ((abstractC1397oL0.f15639q & i7) != 0) {
                return abstractC1397oL0;
            }
            if (abstractC1397oL0 == abstractC1397oJ0) {
                return null;
            }
        }
        return null;
    }

    public final AbstractC1397o L0(boolean z6) {
        AbstractC1397o abstractC1397oJ0;
        C0352h0 c0352h0 = this.f6024C.f5821T;
        if (c0352h0.f6003d == this) {
            return c0352h0.f6005f;
        }
        if (!z6) {
            j0 j0Var = this.f6028G;
            if (j0Var != null) {
                return j0Var.J0();
            }
            return null;
        }
        j0 j0Var2 = this.f6028G;
        if (j0Var2 == null || (abstractC1397oJ0 = j0Var2.J0()) == null) {
            return null;
        }
        return abstractC1397oJ0.f15642t;
    }

    public final void M0(AbstractC1397o abstractC1397o, C0343d c0343d, long j3, C0363t c0363t, int i7, boolean z6) {
        if (abstractC1397o == null) {
            P0(c0343d, j3, c0363t, i7, z6);
            return;
        }
        int i8 = c0363t.f6074q;
        C1444F c1444f = c0363t.f6072o;
        c0363t.c(i8 + 1, c1444f.f15984b);
        c0363t.f6074q++;
        c1444f.a(abstractC1397o);
        c0363t.f6073p.a(AbstractC0347f.a(-1.0f, z6, false));
        M0(AbstractC0347f.e(abstractC1397o, c0343d.b()), c0343d, j3, c0363t, i7, z6);
        c0363t.f6074q = i8;
    }

    public final void N0(AbstractC1397o abstractC1397o, C0343d c0343d, long j3, C0363t c0363t, int i7, boolean z6, float f7) {
        if (abstractC1397o == null) {
            P0(c0343d, j3, c0363t, i7, z6);
            return;
        }
        int i8 = c0363t.f6074q;
        C1444F c1444f = c0363t.f6072o;
        c0363t.c(i8 + 1, c1444f.f15984b);
        c0363t.f6074q++;
        c1444f.a(abstractC1397o);
        c0363t.f6073p.a(AbstractC0347f.a(f7, z6, false));
        W0(AbstractC0347f.e(abstractC1397o, c0343d.b()), c0343d, j3, c0363t, i7, z6, f7, true);
        c0363t.f6074q = i8;
    }

    public final void O0(C0343d c0343d, long j3, C0363t c0363t, int i7, boolean z6) {
        boolean z7;
        boolean z8;
        AbstractC1397o abstractC1397oK0 = K0(c0343d.b());
        if (!i1(j3)) {
            if (i7 == 1) {
                float fB0 = B0(j3, I0());
                if ((Float.floatToRawIntBits(fB0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c0363t.f6074q != Z4.o.d0(c0363t)) {
                        if (AbstractC0347f.h(c0363t.b(), AbstractC0347f.a(fB0, false, false)) <= 0) {
                            return;
                        }
                    }
                    N0(abstractC1397oK0, c0343d, j3, c0363t, i7, false, fB0);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC1397oK0 == null) {
            P0(c0343d, j3, c0363t, i7, z6);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < T() && fIntBitsToFloat2 < S()) {
            M0(abstractC1397oK0, c0343d, j3, c0363t, i7, z6);
            return;
        }
        float fB02 = i7 == 1 ? B0(j3, I0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fB02) & Integer.MAX_VALUE) < 2139095040) {
            if (c0363t.f6074q != Z4.o.d0(c0363t)) {
                z7 = z6;
                if (AbstractC0347f.h(c0363t.b(), AbstractC0347f.a(fB02, z7, false)) > 0) {
                }
                W0(abstractC1397oK0, c0343d, j3, c0363t, i7, z7, fB02, z8);
            }
            z7 = z6;
            z8 = true;
            W0(abstractC1397oK0, c0343d, j3, c0363t, i7, z7, fB02, z8);
        }
        z7 = z6;
        z8 = false;
        W0(abstractC1397oK0, c0343d, j3, c0363t, i7, z7, fB02, z8);
    }

    public void P0(C0343d c0343d, long j3, C0363t c0363t, int i7, boolean z6) {
        j0 j0Var = this.f6027F;
        if (j0Var != null) {
            j0Var.O0(c0343d, j0Var.G0(j3), c0363t, i7, z6);
        }
    }

    public final void Q0() {
        r0 r0Var = this.f6046Y;
        if (r0Var != null) {
            r0Var.invalidate();
            return;
        }
        j0 j0Var = this.f6028G;
        if (j0Var != null) {
            j0Var.Q0();
        }
    }

    public final boolean R0() {
        if (this.f6046Y != null && this.f6034M <= 0.0f) {
            return true;
        }
        j0 j0Var = this.f6028G;
        if (j0Var != null) {
            return j0Var.R0();
        }
        return false;
    }

    public final long S0(O0.C c7, long j3) {
        if (c7 instanceof O0.U) {
            O0.U u7 = (O0.U) c7;
            u7.f5369o.f5888C.T0();
            return u7.b(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        j0 j0VarC1 = c1(c7);
        j0VarC1.T0();
        j0 j0VarF0 = F0(j0VarC1);
        while (j0VarC1 != j0VarF0) {
            r0 r0Var = j0VarC1.f6046Y;
            if (r0Var != null) {
                j3 = ((R0.A0) r0Var).c(j3, false);
            }
            j3 = i6.h.F(j3, j0VarC1.f6037P);
            j0VarC1 = j0VarC1.f6028G;
            AbstractC1209k.c(j0VarC1);
        }
        return z0(j0VarF0, j3);
    }

    public final void T0() {
        this.f6024C.f5822U.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r7v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void U0() {
        AbstractC1397o abstractC1397oJ0;
        AbstractC1397o abstractC1397oL0 = L0(k0.g(128));
        if (abstractC1397oL0 == null || (abstractC1397oL0.f15637o.f15640r & 128) == 0) {
            return;
        }
        AbstractC1289f abstractC1289fQ = C0746L.q();
        InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
        AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
        try {
            boolean zG = k0.g(128);
            if (!zG) {
                abstractC1397oJ0 = J0().f15641s;
                if (abstractC1397oJ0 == null) {
                }
            }
            abstractC1397oJ0 = J0();
            for (AbstractC1397o abstractC1397oL02 = L0(zG); abstractC1397oL02 != null; abstractC1397oL02 = abstractC1397oL02.f15642t) {
                if ((abstractC1397oL02.f15640r & 128) == 0) {
                    break;
                }
                if ((abstractC1397oL02.f15639q & 128) != 0) {
                    ?? eVar = 0;
                    ?? F6 = abstractC1397oL02;
                    while (F6 != 0) {
                        if (F6 instanceof InterfaceC0369z) {
                            ((InterfaceC0369z) F6).r(this.f5418q);
                        } else if ((F6.f15639q & 128) != 0 && (F6 instanceof AbstractC0358n)) {
                            AbstractC1397o abstractC1397o = ((AbstractC0358n) F6).f6056D;
                            int i7 = 0;
                            F6 = F6;
                            eVar = eVar;
                            while (abstractC1397o != null) {
                                if ((abstractC1397o.f15639q & 128) != 0) {
                                    i7++;
                                    eVar = eVar;
                                    if (i7 == 1) {
                                        F6 = abstractC1397o;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new h0.e(new AbstractC1397o[16]);
                                        }
                                        if (F6 != 0) {
                                            eVar.b(F6);
                                            F6 = 0;
                                        }
                                        eVar.b(abstractC1397o);
                                    }
                                }
                                abstractC1397o = abstractC1397o.f15642t;
                                F6 = F6;
                                eVar = eVar;
                            }
                            if (i7 == 1) {
                            }
                        }
                        F6 = AbstractC0347f.f(eVar);
                    }
                }
                if (abstractC1397oL02 == abstractC1397oJ0) {
                    break;
                }
            }
        } finally {
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void V0() {
        boolean zG = k0.g(128);
        AbstractC1397o abstractC1397oJ0 = J0();
        if (!zG && (abstractC1397oJ0 = abstractC1397oJ0.f15641s) == null) {
            return;
        }
        for (AbstractC1397o abstractC1397oL0 = L0(zG); abstractC1397oL0 != null && (abstractC1397oL0.f15640r & 128) != 0; abstractC1397oL0 = abstractC1397oL0.f15642t) {
            if ((abstractC1397oL0.f15639q & 128) != 0) {
                ?? F6 = abstractC1397oL0;
                ?? eVar = 0;
                while (F6 != 0) {
                    if (F6 instanceof InterfaceC0369z) {
                        ((InterfaceC0369z) F6).Q(this);
                    } else if ((F6.f15639q & 128) != 0 && (F6 instanceof AbstractC0358n)) {
                        AbstractC1397o abstractC1397o = ((AbstractC0358n) F6).f6056D;
                        int i7 = 0;
                        F6 = F6;
                        eVar = eVar;
                        while (abstractC1397o != null) {
                            if ((abstractC1397o.f15639q & 128) != 0) {
                                i7++;
                                eVar = eVar;
                                if (i7 == 1) {
                                    F6 = abstractC1397o;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new h0.e(new AbstractC1397o[16]);
                                    }
                                    if (F6 != 0) {
                                        eVar.b(F6);
                                        F6 = 0;
                                    }
                                    eVar.b(abstractC1397o);
                                }
                            }
                            abstractC1397o = abstractC1397o.f15642t;
                            F6 = F6;
                            eVar = eVar;
                        }
                        if (i7 == 1) {
                        }
                    }
                    F6 = AbstractC0347f.f(eVar);
                }
            }
            if (abstractC1397oL0 == abstractC1397oJ0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01bb A[PHI: r4
  0x01bb: PHI (r4v3 ??) = (r4v1 ??), (r4v1 ??), (r4v5 ??) binds: [B:183:0x0181, B:185:0x0185, B:199:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v8, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(r0.AbstractC1397o r21, Q0.C0343d r22, long r23, Q0.C0363t r25, int r26, boolean r27, float r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.j0.W0(r0.o, Q0.d, long, Q0.t, int, boolean, float, boolean):void");
    }

    public abstract void X0(InterfaceC1985r interfaceC1985r, B0.d dVar);

    public final void Y0(long j3, float f7, InterfaceC1182c interfaceC1182c, B0.d dVar) {
        K k7 = this.f6024C;
        if (dVar != null) {
            if (interfaceC1182c != null) {
                N0.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.Z != dVar) {
                this.Z = null;
                g1(null, false);
                this.Z = dVar;
            }
            if (this.f6046Y == null) {
                s0 s0VarA = O.a(k7);
                O0.Q q7 = this.f6043V;
                if (q7 == null) {
                    O0.Q q8 = new O0.Q(this, 1, new i0(this, 0));
                    this.f6043V = q8;
                    q7 = q8;
                }
                i0 i0Var = this.f6044W;
                r0 r0VarN = ((C0415x) s0VarA).n(q7, i0Var, dVar);
                R0.A0 a02 = (R0.A0) r0VarN;
                a02.e(this.f5418q);
                a02.d(j3);
                this.f6046Y = r0VarN;
                k7.f5825X = true;
                i0Var.a();
            }
        } else {
            if (this.Z != null) {
                this.Z = null;
                g1(null, false);
            }
            g1(interfaceC1182c, false);
        }
        if (!n1.k.b(this.f6037P, j3)) {
            ((C0415x) O.a(k7)).P(-4.0f);
            this.f6037P = j3;
            k7.f5822U.f5869p.l0();
            r0 r0Var = this.f6046Y;
            if (r0Var != null) {
                ((R0.A0) r0Var).d(j3);
            } else {
                j0 j0Var = this.f6028G;
                if (j0Var != null) {
                    j0Var.Q0();
                }
            }
            T.v0(this);
            C0415x c0415x = k7.f5803B;
            if (c0415x != null) {
                c0415x.C(k7);
            }
        }
        this.f6038Q = f7;
        if (!this.f5886y) {
            l0(r0());
        }
        if (this == k7.f5821T.f6003d) {
            ((C0415x) O.a(k7)).getRectManager().f(k7, j3, !k7.f5822U.f5869p.f5970y);
        }
    }

    @Override // O0.m0
    public abstract void Z(long j3, float f7, B0.d dVar);

    public final void Z0(C1891a c1891a, boolean z6, boolean z7) {
        r0 r0Var = this.f6046Y;
        if (r0Var != null) {
            if (this.f6030I) {
                if (z7) {
                    long jI0 = I0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jI0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI0 & 4294967295L)) / 2.0f;
                    long j3 = this.f5418q;
                    c1891a.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j3 >> 32)) + fIntBitsToFloat, ((int) (j3 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z6) {
                    long j7 = this.f5418q;
                    c1891a.a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                }
                if (c1891a.b()) {
                    return;
                }
            }
            R0.A0 a02 = (R0.A0) r0Var;
            float[] fArrB = a02.b();
            if (!a02.f6232G) {
                if (fArrB == null) {
                    c1891a.f19863a = 0.0f;
                    c1891a.f19864b = 0.0f;
                    c1891a.f19865c = 0.0f;
                    c1891a.f19866d = 0.0f;
                } else {
                    C1953C.c(fArrB, c1891a);
                }
            }
        }
        long j8 = this.f6037P;
        float f7 = (int) (j8 >> 32);
        c1891a.f19863a += f7;
        c1891a.f19865c += f7;
        float f8 = (int) (j8 & 4294967295L);
        c1891a.f19864b += f8;
        c1891a.f19866d += f8;
    }

    public final void a1() {
        if (this.f6046Y != null) {
            if (this.Z != null) {
                this.Z = null;
            }
            g1(null, false);
            this.f6024C.U(false);
        }
    }

    @Override // n1.d
    public final float b() {
        return this.f6024C.f5814M.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void b1(InterfaceC0296a0 interfaceC0296a0) {
        j0 j0Var;
        boolean z6;
        boolean z7;
        boolean z8 = true;
        InterfaceC0296a0 interfaceC0296a02 = this.f6035N;
        if (interfaceC0296a0 != interfaceC0296a02) {
            this.f6035N = interfaceC0296a0;
            K k7 = this.f6024C;
            int i7 = 0;
            if (interfaceC0296a02 == null || interfaceC0296a0.e() != interfaceC0296a02.e() || interfaceC0296a0.c() != interfaceC0296a02.c()) {
                int iE = interfaceC0296a0.e();
                int iC = interfaceC0296a0.c();
                r0 r0Var = this.f6046Y;
                if (r0Var != null) {
                    ((R0.A0) r0Var).e((((long) iE) << 32) | (((long) iC) & 4294967295L));
                } else if (k7.J() && (j0Var = this.f6028G) != null) {
                    j0Var.Q0();
                }
                c0((((long) iC) & 4294967295L) | (((long) iE) << 32));
                if (this.f6031J != null) {
                    h1(false);
                }
                boolean zG = k0.g(4);
                AbstractC1397o abstractC1397oJ0 = J0();
                if (zG || (abstractC1397oJ0 = abstractC1397oJ0.f15641s) != null) {
                    for (AbstractC1397o abstractC1397oL0 = L0(zG); abstractC1397oL0 != null && (abstractC1397oL0.f15640r & 4) != 0; abstractC1397oL0 = abstractC1397oL0.f15642t) {
                        if ((abstractC1397oL0.f15639q & 4) != 0) {
                            ?? F6 = abstractC1397oL0;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof InterfaceC0360p) {
                                    ((InterfaceC0360p) F6).f0();
                                } else if ((F6.f15639q & 4) != 0 && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o = ((AbstractC0358n) F6).f6056D;
                                    int i8 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o != null) {
                                        if ((abstractC1397o.f15639q & 4) != 0) {
                                            i8++;
                                            eVar = eVar;
                                            if (i8 == 1) {
                                                F6 = abstractC1397o;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.b(F6);
                                                    F6 = 0;
                                                }
                                                eVar.b(abstractC1397o);
                                            }
                                        }
                                        abstractC1397o = abstractC1397o.f15642t;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                F6 = AbstractC0347f.f(eVar);
                            }
                        }
                        if (abstractC1397oL0 == abstractC1397oJ0) {
                            break;
                        }
                    }
                }
                C0415x c0415x = k7.f5803B;
                if (c0415x != null) {
                    c0415x.C(k7);
                }
            }
            C1443E c1443e = this.f6036O;
            if ((c1443e == null || c1443e.f15981e == 0) && interfaceC0296a0.a().isEmpty()) {
                return;
            }
            C1443E c1443e2 = this.f6036O;
            Map mapA = interfaceC0296a0.a();
            if (c1443e2 != null && c1443e2.f15981e == mapA.size()) {
                Object[] objArr = c1443e2.f15978b;
                int[] iArr = c1443e2.f15979c;
                long[] jArr = c1443e2.f15977a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i9 = 0;
                loop0: while (true) {
                    long j3 = jArr[i9];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = i7;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr[i12];
                                z7 = z8;
                                int i13 = iArr[i12];
                                Integer num = (Integer) mapA.get((C0322t) obj);
                                if (num == null || num.intValue() != i13) {
                                    break loop0;
                                }
                            } else {
                                z7 = z8;
                            }
                            j3 >>= 8;
                            i11++;
                            z8 = z7;
                        }
                        z6 = z8;
                        if (i10 != 8) {
                            return;
                        }
                    } else {
                        z6 = z8;
                    }
                    if (i9 == length) {
                        return;
                    }
                    i9++;
                    z8 = z6;
                    i7 = 0;
                }
            }
            k7.f5822U.f5869p.f5951L.f();
            C1443E c1443e3 = this.f6036O;
            if (c1443e3 == null) {
                C1443E c1443e4 = t.N.f16028a;
                c1443e3 = new C1443E();
                this.f6036O = c1443e3;
            }
            c1443e3.a();
            for (Map.Entry entry : interfaceC0296a0.a().entrySet()) {
                c1443e3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // O0.C
    public final long c(long j3) {
        if (!J0().f15636B) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((C0415x) O.a(this.f6024C)).x(I(j3));
    }

    public final C1893c d1() {
        boolean z6 = J0().f15636B;
        C1893c c1893c = C1893c.f19868e;
        if (z6) {
            O0.C cI = O0.w0.i(this);
            C1891a c1891a = this.f6039R;
            if (c1891a == null) {
                c1891a = new C1891a();
                this.f6039R = c1891a;
            }
            long jA0 = A0(I0());
            int i7 = (int) (jA0 >> 32);
            c1891a.f19863a = -Float.intBitsToFloat(i7);
            int i8 = (int) (jA0 & 4294967295L);
            c1891a.f19864b = -Float.intBitsToFloat(i8);
            c1891a.f19865c = Float.intBitsToFloat(i7) + T();
            c1891a.f19866d = Float.intBitsToFloat(i8) + S();
            j0 j0Var = this;
            while (j0Var != cI) {
                j0Var.Z0(c1891a, false, true);
                if (!c1891a.b()) {
                    j0Var = j0Var.f6028G;
                    AbstractC1209k.c(j0Var);
                }
            }
            return new C1893c(c1891a.f19863a, c1891a.f19864b, c1891a.f19865c, c1891a.f19866d);
        }
        return c1893c;
    }

    public final void e1(j0 j0Var, float[] fArr) {
        float[] fArrA;
        if (AbstractC1209k.a(j0Var, this)) {
            return;
        }
        j0 j0Var2 = this.f6028G;
        AbstractC1209k.c(j0Var2);
        j0Var2.e1(j0Var, fArr);
        if (!n1.k.b(this.f6037P, 0L)) {
            float[] fArr2 = f6021c0;
            C1953C.d(fArr2);
            long j3 = this.f6037P;
            C1953C.f(fArr2, -((int) (j3 >> 32)), -((int) (j3 & 4294967295L)));
            C1953C.e(fArr, fArr2);
        }
        r0 r0Var = this.f6046Y;
        if (r0Var == null || (fArrA = ((R0.A0) r0Var).a()) == null) {
            return;
        }
        C1953C.e(fArr, fArrA);
    }

    public final void f1(j0 j0Var, float[] fArr) {
        j0 j0Var2 = this;
        while (!j0Var2.equals(j0Var)) {
            r0 r0Var = j0Var2.f6046Y;
            if (r0Var != null) {
                C1953C.e(fArr, ((R0.A0) r0Var).b());
            }
            if (!n1.k.b(j0Var2.f6037P, 0L)) {
                float[] fArr2 = f6021c0;
                C1953C.d(fArr2);
                C1953C.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C1953C.e(fArr, fArr2);
            }
            j0Var2 = j0Var2.f6028G;
            AbstractC1209k.c(j0Var2);
        }
    }

    @Override // O0.C
    public final long g(long j3) {
        if (!J0().f15636B) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        O0.C cI = O0.w0.i(this);
        C0415x c0415x = (C0415x) O.a(this.f6024C);
        c0415x.G();
        return S0(cI, C1892b.g(C1953C.b(j3, c0415x.f6611k0), cI.I(0L)));
    }

    public final void g1(InterfaceC1182c interfaceC1182c, boolean z6) {
        C0415x c0415x;
        V.o oVar;
        Reference referencePoll;
        h0.e eVar;
        if (interfaceC1182c != null && this.Z != null) {
            N0.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        K k7 = this.f6024C;
        boolean z7 = (!z6 && this.f6031J == interfaceC1182c && AbstractC1209k.a(this.f6032K, k7.f5814M) && this.f6033L == k7.f5815N) ? false : true;
        this.f6032K = k7.f5814M;
        this.f6033L = k7.f5815N;
        boolean zI = k7.I();
        i0 i0Var = this.f6044W;
        if (zI && interfaceC1182c != null) {
            this.f6031J = interfaceC1182c;
            if (this.f6046Y != null) {
                if (z7 && h1(true)) {
                    ((C0415x) O.a(k7)).getRectManager().e(k7);
                    return;
                }
                return;
            }
            s0 s0VarA = O.a(k7);
            O0.Q q7 = this.f6043V;
            if (q7 == null) {
                O0.Q q8 = new O0.Q(this, 1, new i0(this, 0));
                this.f6043V = q8;
                q7 = q8;
            }
            r0 r0VarN = ((C0415x) s0VarA).n(q7, i0Var, null);
            R0.A0 a02 = (R0.A0) r0VarN;
            a02.e(this.f5418q);
            a02.d(this.f6037P);
            this.f6046Y = r0VarN;
            h1(true);
            k7.f5825X = true;
            i0Var.a();
            return;
        }
        this.f6031J = null;
        r0 r0Var = this.f6046Y;
        if (r0Var != null) {
            R0.A0 a03 = (R0.A0) r0Var;
            a03.f6238r = null;
            a03.f6239s = null;
            a03.f6241u = true;
            boolean z8 = a03.f6244x;
            C0415x c0415x2 = a03.f6237q;
            if (z8) {
                a03.f6244x = false;
                c0415x2.A(a03, false);
            }
            y0.y yVar = a03.f6236p;
            if (yVar != null) {
                yVar.a(a03.f6235o);
                do {
                    oVar = c0415x2.f6578I0;
                    referencePoll = ((ReferenceQueue) oVar.f7343q).poll();
                    eVar = (h0.e) oVar.f7342p;
                    if (referencePoll != null) {
                        eVar.k(referencePoll);
                    }
                } while (referencePoll != null);
                eVar.b(new WeakReference(a03, (ReferenceQueue) oVar.f7343q));
                c0415x2.f6583L.remove(a03);
            }
            k7.f5825X = true;
            i0Var.a();
            if (J0().f15636B && k7.J() && (c0415x = k7.f5803B) != null) {
                c0415x.C(k7);
            }
        }
        this.f6046Y = null;
        this.f6045X = false;
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f6024C.f5815N;
    }

    @Override // O0.C
    public final long h(long j3) {
        long jI = I(j3);
        C0415x c0415x = (C0415x) O.a(this.f6024C);
        c0415x.G();
        return C1953C.b(jI, c0415x.f6610j0);
    }

    public final boolean h1(boolean z6) {
        boolean z7;
        boolean z8;
        C0415x c0415x;
        i0 i0Var;
        int i7;
        i0 i0Var2;
        if (this.Z != null) {
            return false;
        }
        r0 r0Var = this.f6046Y;
        if (r0Var == null) {
            if (this.f6031J == null) {
                return false;
            }
            N0.a.b("null layer with a non-null layerBlock");
            return false;
        }
        InterfaceC1182c interfaceC1182c = this.f6031J;
        if (interfaceC1182c == null) {
            throw n1.c.p("updateLayerParameters requires a non-null layerBlock");
        }
        C1960J c1960j = a0;
        c1960j.i(1.0f);
        c1960j.j(1.0f);
        c1960j.a(1.0f);
        c1960j.r(0.0f);
        c1960j.u(0.0f);
        c1960j.l(0.0f);
        long j3 = y0.z.f20268a;
        c1960j.c(j3);
        c1960j.o(j3);
        c1960j.h(0.0f);
        if (c1960j.f20203y != 8.0f) {
            c1960j.f20193o |= 2048;
            c1960j.f20203y = 8.0f;
        }
        long j7 = C1967Q.f20224b;
        c1960j.q(j7);
        c1960j.m(AbstractC1959I.f20180a);
        c1960j.d(false);
        c1960j.g(null);
        if (c1960j.f20191H != 3) {
            c1960j.f20193o |= 524288;
            c1960j.f20191H = 3;
        }
        c1960j.e(0);
        c1960j.f20187D = 9205357640488583168L;
        c1960j.f20192I = null;
        c1960j.f20193o = 0;
        K k7 = this.f6024C;
        c1960j.f20188E = k7.f5814M;
        c1960j.f20189F = k7.f5815N;
        c1960j.f20187D = AbstractC1107a.E(this.f5418q);
        ((C0415x) O.a(k7)).getSnapshotObserver().a(this, C0345e.f5978t, new E0.K(9, interfaceC1182c));
        C0368y c0368y = this.f6040S;
        if (c0368y == null) {
            c0368y = new C0368y();
            this.f6040S = c0368y;
        }
        C0368y c0368y2 = b0;
        c0368y2.getClass();
        c0368y2.f6094a = c0368y.f6094a;
        c0368y2.f6095b = c0368y.f6095b;
        c0368y2.f6096c = c0368y.f6096c;
        c0368y2.f6097d = c0368y.f6097d;
        c0368y2.f6098e = c0368y.f6098e;
        c0368y2.f6099f = c0368y.f6099f;
        c0368y2.f6100g = c0368y.f6100g;
        float f7 = c1960j.f20194p;
        c0368y.f6094a = f7;
        c0368y.f6095b = c1960j.f20195q;
        c0368y.f6096c = c1960j.f20197s;
        c0368y.f6097d = c1960j.f20198t;
        c0368y.f6098e = c1960j.f20202x;
        c0368y.f6099f = c1960j.f20203y;
        long j8 = c1960j.f20204z;
        c0368y.f6100g = j8;
        R0.A0 a02 = (R0.A0) r0Var;
        int i8 = c1960j.f20193o | a02.f6227B;
        a02.f6246z = c1960j.f20189F;
        a02.f6245y = c1960j.f20188E;
        int i9 = i8 & 4096;
        if (i9 != 0) {
            a02.f6228C = j8;
        }
        if ((i8 & 1) != 0) {
            B0.f fVar = a02.f6235o.f615a;
            if (fVar.e() != f7) {
                fVar.p(f7);
            }
        }
        if ((i8 & 2) != 0) {
            B0.d dVar = a02.f6235o;
            float f8 = c1960j.f20195q;
            B0.f fVar2 = dVar.f615a;
            if (fVar2.K() != f8) {
                fVar2.B(f8);
            }
        }
        if ((i8 & 4) != 0) {
            a02.f6235o.f(c1960j.f20196r);
        }
        if ((i8 & 8) != 0) {
            B0.d dVar2 = a02.f6235o;
            float f9 = c1960j.f20197s;
            B0.f fVar3 = dVar2.f615a;
            if (fVar3.t() != f9) {
                fVar3.z(f9);
            }
        }
        if ((i8 & 16) != 0) {
            B0.d dVar3 = a02.f6235o;
            float f10 = c1960j.f20198t;
            B0.f fVar4 = dVar3.f615a;
            if (fVar4.g() != f10) {
                fVar4.k(f10);
            }
        }
        if ((i8 & 32) != 0) {
            B0.d dVar4 = a02.f6235o;
            float f11 = c1960j.f20199u;
            B0.f fVar5 = dVar4.f615a;
            if (fVar5.I() != f11) {
                fVar5.f(f11);
                dVar4.f621g = true;
                dVar4.a();
            }
            if (c1960j.f20199u > 0.0f && !a02.f6233H && (i0Var2 = a02.f6239s) != null) {
                i0Var2.a();
            }
        }
        if ((i8 & 64) != 0) {
            B0.d dVar5 = a02.f6235o;
            long j9 = c1960j.f20200v;
            B0.f fVar6 = dVar5.f615a;
            if (!C1987t.c(j9, fVar6.O())) {
                fVar6.m(j9);
            }
        }
        if ((i8 & 128) != 0) {
            B0.d dVar6 = a02.f6235o;
            long j10 = c1960j.f20201w;
            B0.f fVar7 = dVar6.f615a;
            if (!C1987t.c(j10, fVar7.l())) {
                fVar7.A(j10);
            }
        }
        if ((i8 & 1024) != 0) {
            B0.d dVar7 = a02.f6235o;
            float f12 = c1960j.f20202x;
            B0.f fVar8 = dVar7.f615a;
            if (fVar8.L() != f12) {
                fVar8.i(f12);
            }
        }
        if ((i8 & 256) != 0) {
            B0.f fVar9 = a02.f6235o.f615a;
            if (fVar9.w() != 0.0f) {
                fVar9.b();
            }
        }
        if ((i8 & 512) != 0) {
            B0.f fVar10 = a02.f6235o.f615a;
            if (fVar10.G() != 0.0f) {
                fVar10.j();
            }
        }
        if ((i8 & 2048) != 0) {
            B0.d dVar8 = a02.f6235o;
            float f13 = c1960j.f20203y;
            B0.f fVar11 = dVar8.f615a;
            if (fVar11.r() != f13) {
                fVar11.H(f13);
            }
        }
        if (i9 != 0) {
            if (C1967Q.a(a02.f6228C, j7)) {
                B0.d dVar9 = a02.f6235o;
                if (!C1892b.b(dVar9.f634v, 9205357640488583168L)) {
                    dVar9.f634v = 9205357640488583168L;
                    dVar9.f615a.N(9205357640488583168L);
                }
            } else {
                B0.d dVar10 = a02.f6235o;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C1967Q.c(a02.f6228C) * ((int) (a02.f6240t & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(C1967Q.b(a02.f6228C) * ((int) (a02.f6240t >> 32)))) << 32);
                if (!C1892b.b(dVar10.f634v, jFloatToRawIntBits)) {
                    dVar10.f634v = jFloatToRawIntBits;
                    dVar10.f615a.N(jFloatToRawIntBits);
                }
            }
        }
        if ((i8 & 16384) != 0) {
            B0.d dVar11 = a02.f6235o;
            boolean z9 = c1960j.f20185B;
            if (dVar11.f635w != z9) {
                dVar11.f635w = z9;
                dVar11.f621g = true;
                dVar11.a();
            }
        }
        if ((131072 & i8) != 0) {
            B0.d dVar12 = a02.f6235o;
            C1982o c1982o = c1960j.f20190G;
            B0.f fVar12 = dVar12.f615a;
            if (!AbstractC1209k.a(fVar12.h(), c1982o)) {
                fVar12.C(c1982o);
            }
        }
        if ((262144 & i8) != 0) {
            B0.f fVar13 = a02.f6235o.f615a;
            if (!AbstractC1209k.a(fVar13.x(), null)) {
                fVar13.o();
            }
        }
        if ((i8 & 524288) != 0) {
            B0.d dVar13 = a02.f6235o;
            int i10 = c1960j.f20191H;
            B0.f fVar14 = dVar13.f615a;
            if (fVar14.M() != i10) {
                fVar14.q(i10);
            }
        }
        if ((32768 & i8) != 0) {
            B0.d dVar14 = a02.f6235o;
            int i11 = c1960j.f20186C;
            if (i11 == 0) {
                i7 = 0;
            } else if (i11 == 1) {
                i7 = 1;
            } else {
                i7 = 2;
                if (i11 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            B0.f fVar15 = dVar14.f615a;
            if (fVar15.v() != i7) {
                fVar15.y(i7);
            }
        }
        if ((i8 & 7963) != 0) {
            a02.f6230E = true;
            a02.f6231F = true;
        }
        if (AbstractC1209k.a(a02.f6229D, c1960j.f20192I)) {
            z7 = true;
            z8 = false;
        } else {
            AbstractC1959I abstractC1959I = c1960j.f20192I;
            a02.f6229D = abstractC1959I;
            if (abstractC1959I == null) {
                z7 = true;
            } else {
                B0.d dVar15 = a02.f6235o;
                if (abstractC1959I instanceof C1955E) {
                    C1893c c1893c = ((C1955E) abstractC1959I).f20176e;
                    float f14 = c1893c.f19869a;
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(f14);
                    float f15 = c1893c.f19870b;
                    dVar15.g(0.0f, (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits(c1893c.f19871c - f14)) << 32) | (((long) Float.floatToRawIntBits(c1893c.f19872d - f15)) & 4294967295L));
                } else if (abstractC1959I instanceof C1954D) {
                    dVar15.f624k = null;
                    dVar15.f622i = 9205357640488583168L;
                    dVar15.h = 0L;
                    dVar15.f623j = 0.0f;
                    dVar15.f621g = true;
                    dVar15.f626n = false;
                    dVar15.l = ((C1954D) abstractC1959I).f20175e;
                    dVar15.a();
                } else {
                    if (!(abstractC1959I instanceof C1956F)) {
                        throw new A2.W();
                    }
                    C1956F c1956f = (C1956F) abstractC1959I;
                    C1976i c1976i = c1956f.f20178f;
                    if (c1976i != null) {
                        dVar15.f624k = null;
                        dVar15.f622i = 9205357640488583168L;
                        dVar15.h = 0L;
                        dVar15.f623j = 0.0f;
                        z7 = true;
                        dVar15.f621g = true;
                        dVar15.f626n = false;
                        dVar15.l = c1976i;
                        dVar15.a();
                    } else {
                        z7 = true;
                        C1894d c1894d = c1956f.f20177e;
                        dVar15.g(Float.intBitsToFloat((int) (c1894d.h >> 32)), (((long) Float.floatToRawIntBits(c1894d.f19873a)) << 32) | (((long) Float.floatToRawIntBits(c1894d.f19874b)) & 4294967295L), (((long) Float.floatToRawIntBits(c1894d.b())) << 32) | (((long) Float.floatToRawIntBits(c1894d.a())) & 4294967295L));
                    }
                    if ((abstractC1959I instanceof C1954D) && Build.VERSION.SDK_INT < 33 && (i0Var = a02.f6239s) != null) {
                        i0Var.a();
                    }
                }
                z7 = true;
                if (abstractC1959I instanceof C1954D) {
                    i0Var.a();
                }
            }
            z8 = z7;
        }
        a02.f6227B = c1960j.f20193o;
        if (i8 != 0 || z8) {
            int i12 = Build.VERSION.SDK_INT;
            C0415x c0415x2 = a02.f6237q;
            if (i12 >= 26) {
                ViewParent parent = c0415x2.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(c0415x2, c0415x2);
                }
            } else {
                c0415x2.invalidate();
            }
            if (c0415x2.f6625t) {
                c0415x2.P(0.0f);
            }
        }
        boolean z10 = this.f6030I;
        this.f6030I = c1960j.f20185B;
        this.f6034M = c1960j.f20196r;
        boolean z11 = (c0368y2.f6094a == c0368y.f6094a && c0368y2.f6095b == c0368y.f6095b && c0368y2.f6096c == c0368y.f6096c && c0368y2.f6097d == c0368y.f6097d && c0368y2.f6098e == c0368y.f6098e && c0368y2.f6099f == c0368y.f6099f && C1967Q.a(c0368y2.f6100g, c0368y.f6100g)) ? z7 : false;
        boolean z12 = !z11;
        if (z6 && ((!z11 || z10 != this.f6030I) && (c0415x = k7.f5803B) != null)) {
            c0415x.C(k7);
        }
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // O0.m0, O0.Y
    public final Object i() {
        K k7 = this.f6024C;
        if (!k7.f5821T.d(64)) {
            return null;
        }
        J0();
        Object objM = null;
        for (AbstractC1397o abstractC1397o = k7.f5821T.f6004e; abstractC1397o != null; abstractC1397o = abstractC1397o.f15641s) {
            if ((abstractC1397o.f15639q & 64) != 0) {
                ?? F6 = abstractC1397o;
                ?? eVar = 0;
                while (F6 != 0) {
                    if (F6 instanceof v0) {
                        objM = ((v0) F6).M(k7.f5814M, objM);
                    } else if ((F6.f15639q & 64) != 0 && (F6 instanceof AbstractC0358n)) {
                        AbstractC1397o abstractC1397o2 = ((AbstractC0358n) F6).f6056D;
                        int i7 = 0;
                        F6 = F6;
                        eVar = eVar;
                        while (abstractC1397o2 != null) {
                            if ((abstractC1397o2.f15639q & 64) != 0) {
                                i7++;
                                eVar = eVar;
                                if (i7 == 1) {
                                    F6 = abstractC1397o2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new h0.e(new AbstractC1397o[16]);
                                    }
                                    if (F6 != 0) {
                                        eVar.b(F6);
                                        F6 = 0;
                                    }
                                    eVar.b(abstractC1397o2);
                                }
                            }
                            abstractC1397o2 = abstractC1397o2.f15642t;
                            F6 = F6;
                            eVar = eVar;
                        }
                        if (i7 == 1) {
                        }
                    }
                    F6 = AbstractC0347f.f(eVar);
                }
            }
        }
        return objM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0063, code lost:
    
        if (r5 < r1.f19872d) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i1(long r26) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.j0.i1(long):boolean");
    }

    @Override // O0.C
    public final O0.C j() {
        if (!J0().f15636B) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        T0();
        return this.f6024C.f5821T.f6003d.f6028G;
    }

    @Override // O0.C
    public final C1893c m(O0.C c7, boolean z6) {
        if (!J0().f15636B) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!c7.y()) {
            N0.a.b("LayoutCoordinates " + c7 + " is not attached!");
        }
        j0 j0VarC1 = c1(c7);
        j0VarC1.T0();
        j0 j0VarF0 = F0(j0VarC1);
        C1891a c1891a = this.f6039R;
        if (c1891a == null) {
            c1891a = new C1891a();
            this.f6039R = c1891a;
        }
        c1891a.f19863a = 0.0f;
        c1891a.f19864b = 0.0f;
        c1891a.f19865c = (int) (c7.G() >> 32);
        c1891a.f19866d = (int) (c7.G() & 4294967295L);
        while (j0VarC1 != j0VarF0) {
            j0VarC1.Z0(c1891a, z6, false);
            if (c1891a.b()) {
                return C1893c.f19868e;
            }
            j0VarC1 = j0VarC1.f6028G;
            AbstractC1209k.c(j0VarC1);
        }
        y0(j0VarF0, c1891a, z6);
        return new C1893c(c1891a.f19863a, c1891a.f19864b, c1891a.f19865c, c1891a.f19866d);
    }

    @Override // n1.d
    public final float n() {
        return this.f6024C.f5814M.n();
    }

    @Override // Q0.T
    public final T n0() {
        return this.f6027F;
    }

    @Override // Q0.T
    public final boolean p0() {
        return this.f6035N != null;
    }

    @Override // Q0.T
    public final K q0() {
        return this.f6024C;
    }

    @Override // Q0.T
    public final InterfaceC0296a0 r0() {
        InterfaceC0296a0 interfaceC0296a0 = this.f6035N;
        if (interfaceC0296a0 != null) {
            return interfaceC0296a0;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // Q0.T
    public final T s0() {
        return this.f6028G;
    }

    @Override // Q0.T
    public final long t0() {
        return this.f6037P;
    }

    @Override // Q0.t0
    public final boolean w() {
        return (this.f6046Y == null || this.f6029H || !this.f6024C.I()) ? false : true;
    }

    @Override // O0.C
    public final long x(long j3) {
        if (!J0().f15636B) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return S0(O0.w0.i(this), ((C0415x) O.a(this.f6024C)).K(j3));
    }

    @Override // Q0.T
    public final void x0() {
        B0.d dVar = this.Z;
        if (dVar != null) {
            Z(this.f6037P, this.f6038Q, dVar);
        } else {
            a0(this.f6037P, this.f6038Q, this.f6031J);
        }
    }

    @Override // O0.C
    public final boolean y() {
        return J0().f15636B;
    }

    public final void y0(j0 j0Var, C1891a c1891a, boolean z6) {
        if (j0Var == this) {
            return;
        }
        j0 j0Var2 = this.f6028G;
        if (j0Var2 != null) {
            j0Var2.y0(j0Var, c1891a, z6);
        }
        long j3 = this.f6037P;
        float f7 = (int) (j3 >> 32);
        c1891a.f19863a -= f7;
        c1891a.f19865c -= f7;
        float f8 = (int) (j3 & 4294967295L);
        c1891a.f19864b -= f8;
        c1891a.f19866d -= f8;
        r0 r0Var = this.f6046Y;
        if (r0Var != null) {
            R0.A0 a02 = (R0.A0) r0Var;
            float[] fArrA = a02.a();
            if (!a02.f6232G) {
                if (fArrA == null) {
                    c1891a.f19863a = 0.0f;
                    c1891a.f19864b = 0.0f;
                    c1891a.f19865c = 0.0f;
                    c1891a.f19866d = 0.0f;
                } else {
                    C1953C.c(fArrA, c1891a);
                }
            }
            if (this.f6030I && z6) {
                long j7 = this.f5418q;
                c1891a.a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
            }
        }
    }

    @Override // O0.C
    public final void z(float[] fArr) {
        s0 s0VarA = O.a(this.f6024C);
        f1(c1(O0.w0.i(this)), fArr);
        ((C0415x) ((InterfaceC0241i) s0VarA)).w(fArr);
    }

    public final long z0(j0 j0Var, long j3) {
        if (j0Var == this) {
            return j3;
        }
        j0 j0Var2 = this.f6028G;
        return (j0Var2 == null || AbstractC1209k.a(j0Var, j0Var2)) ? G0(j3) : G0(j0Var2.z0(j0Var, j3));
    }

    @Override // Q0.T
    public final O0.C o0() {
        return this;
    }
}
