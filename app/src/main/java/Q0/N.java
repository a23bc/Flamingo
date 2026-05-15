package Q0;

import R0.C0415x;
import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import y0.AbstractC1983p;
import y0.C1973f;
import y0.C1976i;
import y0.C1980m;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class N implements A0.f {

    /* JADX INFO: renamed from: o */
    public final A0.c f5853o = new A0.c();

    /* JADX INFO: renamed from: p */
    public InterfaceC0360p f5854p;

    @Override // A0.f
    public final A0.b A() {
        return this.f5853o.f54p;
    }

    @Override // n1.d
    public final float E(long j3) {
        A0.c cVar = this.f5853o;
        cVar.getClass();
        return n1.c.h(j3, cVar);
    }

    @Override // A0.f
    public final void H(C1976i c1976i, long j3, A0.d dVar, int i7) {
        this.f5853o.H(c1976i, j3, dVar, i7);
    }

    @Override // A0.f
    public final void J(AbstractC1983p abstractC1983p, long j3, long j7, float f7, A0.d dVar, C1980m c1980m, int i7) {
        this.f5853o.J(abstractC1983p, j3, j7, f7, dVar, c1980m, i7);
    }

    @Override // n1.d
    public final int L(float f7) {
        A0.c cVar = this.f5853o;
        cVar.getClass();
        return n1.c.f(f7, cVar);
    }

    @Override // A0.f
    public final void O(long j3, long j7, long j8, float f7, int i7) {
        this.f5853o.O(j3, j7, j8, f7, i7);
    }

    @Override // A0.f
    public final long R() {
        return this.f5853o.R();
    }

    @Override // A0.f
    public final void U(long j3, long j7, long j8, float f7, A0.d dVar, int i7) {
        this.f5853o.U(j3, j7, j8, f7, dVar, i7);
    }

    @Override // n1.d
    public final long V(long j3) {
        A0.c cVar = this.f5853o;
        cVar.getClass();
        return n1.c.k(j3, cVar);
    }

    @Override // A0.f
    public final void W(C1976i c1976i, AbstractC1983p abstractC1983p, float f7, A0.d dVar, int i7) {
        this.f5853o.W(c1976i, abstractC1983p, f7, dVar, i7);
    }

    @Override // n1.d
    public final float Y(long j3) {
        A0.c cVar = this.f5853o;
        cVar.getClass();
        return n1.c.j(j3, cVar);
    }

    public final void a() {
        A0.c cVar = this.f5853o;
        InterfaceC1985r interfaceC1985rS = cVar.f54p.S();
        InterfaceC0357m interfaceC0357m = this.f5854p;
        if (interfaceC0357m == null) {
            throw n1.c.p("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC1397o abstractC1397o = (AbstractC1397o) interfaceC0357m;
        AbstractC1397o abstractC1397oF = abstractC1397o.f15637o.f15642t;
        if (abstractC1397oF == null || (abstractC1397oF.f15640r & 4) == 0) {
            abstractC1397oF = null;
        } else {
            while (abstractC1397oF != null) {
                int i7 = abstractC1397oF.f15639q;
                if ((i7 & 2) != 0) {
                    break;
                } else if ((i7 & 4) != 0) {
                    break;
                } else {
                    abstractC1397oF = abstractC1397oF.f15642t;
                }
            }
            abstractC1397oF = null;
        }
        if (abstractC1397oF == null) {
            j0 j0VarV = AbstractC0347f.v(interfaceC0357m, 4);
            if (j0VarV.J0() == abstractC1397o.f15637o) {
                j0VarV = j0VarV.f6027F;
                AbstractC1209k.c(j0VarV);
            }
            j0VarV.X0(interfaceC1985rS, (B0.d) cVar.f54p.f51q);
            return;
        }
        h0.e eVar = null;
        while (abstractC1397oF != null) {
            if (abstractC1397oF instanceof InterfaceC0360p) {
                InterfaceC0360p interfaceC0360p = (InterfaceC0360p) abstractC1397oF;
                B0.d dVar = (B0.d) cVar.f54p.f51q;
                j0 j0VarV2 = AbstractC0347f.v(interfaceC0360p, 4);
                long jE = AbstractC1107a.E(j0VarV2.f5418q);
                K k7 = j0VarV2.f6024C;
                k7.getClass();
                ((C0415x) O.a(k7)).getSharedDrawScope().c(interfaceC1985rS, jE, j0VarV2, interfaceC0360p, dVar);
            } else if ((abstractC1397oF.f15639q & 4) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                int i8 = 0;
                for (AbstractC1397o abstractC1397o2 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
                    if ((abstractC1397o2.f15639q & 4) != 0) {
                        i8++;
                        if (i8 == 1) {
                            abstractC1397oF = abstractC1397o2;
                        } else {
                            if (eVar == null) {
                                eVar = new h0.e(new AbstractC1397o[16]);
                            }
                            if (abstractC1397oF != null) {
                                eVar.b(abstractC1397oF);
                                abstractC1397oF = null;
                            }
                            eVar.b(abstractC1397o2);
                        }
                    }
                }
                if (i8 == 1) {
                }
            }
            abstractC1397oF = AbstractC0347f.f(eVar);
        }
    }

    @Override // n1.d
    public final float b() {
        return this.f5853o.b();
    }

    @Override // A0.f
    public final void b0(long j3, long j7, long j8, long j9, A0.d dVar, int i7) {
        this.f5853o.b0(j3, j7, j8, j9, dVar, i7);
    }

    public final void c(InterfaceC1985r interfaceC1985r, long j3, j0 j0Var, InterfaceC0360p interfaceC0360p, B0.d dVar) {
        InterfaceC0360p interfaceC0360p2 = this.f5854p;
        this.f5854p = interfaceC0360p;
        n1.n nVar = j0Var.f6024C.f5815N;
        A0.c cVar = this.f5853o;
        n1.d dVarU = cVar.f54p.U();
        A0.b bVar = cVar.f54p;
        n1.n nVarV = bVar.V();
        InterfaceC1985r interfaceC1985rS = bVar.S();
        long jW = bVar.W();
        B0.d dVar2 = (B0.d) bVar.f51q;
        bVar.n0(j0Var);
        bVar.o0(nVar);
        bVar.m0(interfaceC1985r);
        bVar.p0(j3);
        bVar.f51q = dVar;
        interfaceC1985r.l();
        try {
            interfaceC0360p.a(this);
            interfaceC1985r.k();
            bVar.n0(dVarU);
            bVar.o0(nVarV);
            bVar.m0(interfaceC1985rS);
            bVar.p0(jW);
            bVar.f51q = dVar2;
            this.f5854p = interfaceC0360p2;
        } catch (Throwable th) {
            interfaceC1985r.k();
            bVar.n0(dVarU);
            bVar.o0(nVarV);
            bVar.m0(interfaceC1985rS);
            bVar.p0(jW);
            bVar.f51q = dVar2;
            throw th;
        }
    }

    public final void d(long j3, B0.d dVar, InterfaceC1182c interfaceC1182c) {
        dVar.e(this, getLayoutDirection(), j3, new M(this, this.f5854p, interfaceC1182c, 0));
    }

    @Override // n1.d
    public final long e0(float f7) {
        return this.f5853o.e0(f7);
    }

    @Override // A0.f
    public final long f() {
        return this.f5853o.f54p.W();
    }

    @Override // A0.f
    public final n1.n getLayoutDirection() {
        return this.f5853o.f53o.f45b;
    }

    @Override // A0.f
    public final void h0(C1973f c1973f, long j3, long j7, long j8, float f7, C1980m c1980m, int i7) {
        this.f5853o.h0(c1973f, j3, j7, j8, f7, c1980m, i7);
    }

    @Override // n1.d
    public final float i0(int i7) {
        return this.f5853o.i0(i7);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / this.f5853o.b();
    }

    @Override // n1.d
    public final float n() {
        return this.f5853o.n();
    }

    @Override // A0.f
    public final void p(float f7, long j3, long j7) {
        this.f5853o.p(f7, j3, j7);
    }

    @Override // n1.d
    public final long t(long j3) {
        A0.c cVar = this.f5853o;
        cVar.getClass();
        return n1.c.i(j3, cVar);
    }

    @Override // n1.d
    public final float v(float f7) {
        return this.f5853o.b() * f7;
    }
}
