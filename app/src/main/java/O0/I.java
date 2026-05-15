package O0;

import Q0.C0342c0;
import h0.C0994b;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class I implements B0, InterfaceC0298b0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ L f5308o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ S f5309p;

    public I(S s7) {
        this.f5309p = s7;
        this.f5308o = s7.f5362v;
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 B(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c) {
        return this.f5308o.B(i7, i8, map, a4, interfaceC1182c);
    }

    @Override // O0.B0
    public final List D(Object obj, l5.e eVar) throws Exception {
        S s7 = this.f5309p;
        Q0.K k7 = (Q0.K) s7.f5361u.g(obj);
        Q0.K k8 = s7.f5355o;
        if (k7 != null && ((h0.e) ((C0994b) k8.p()).f12538p).j(k7) < s7.f5358r) {
            return k7.n();
        }
        h0.e eVar2 = s7.f5351A;
        if (eVar2.f12548q < s7.f5359s) {
            N0.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i7 = eVar2.f12548q;
        int i8 = s7.f5359s;
        if (i7 == i8) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f12546o;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
        }
        s7.f5359s++;
        t.J j3 = s7.f5364x;
        if (j3.b(obj)) {
            Q0.K k9 = (Q0.K) j3.g(obj);
            J j7 = k9 != null ? (J) s7.f5360t.g(k9) : null;
            if (j7 != null && j7.f5323d) {
                s7.i(k9, obj, false, eVar);
            }
        } else {
            boolean zI = k8.I();
            t.J j8 = s7.f5366z;
            if (zI) {
                s7.c();
                if (!s7.f5361u.c(obj)) {
                    j8.k(obj);
                    Object objG = j3.g(obj);
                    if (objG == null) {
                        objG = s7.j(obj);
                        if (objG != null) {
                            int iJ = ((h0.e) ((C0994b) k8.p()).f12538p).j(objG);
                            int i9 = ((h0.e) ((C0994b) k8.p()).f12538p).f12548q;
                            k8.f5806E = true;
                            k8.M(iJ, i9, 1);
                            k8.f5806E = false;
                            s7.f5353C++;
                        } else {
                            int i10 = ((h0.e) ((C0994b) k8.p()).f12538p).f12548q;
                            Q0.K k10 = new Q0.K(2);
                            k8.f5806E = true;
                            k8.C(i10, k10);
                            k8.f5806E = false;
                            s7.f5353C++;
                            objG = k10;
                        }
                        j3.m(obj, objG);
                    }
                    s7.i((Q0.K) objG, obj, false, eVar);
                }
            }
            j8.m(obj, !k8.I() ? new O() : new P(s7, obj));
            if (k8.f5822U.f5859d == Q0.G.f5789q) {
                k8.S(true);
            } else {
                Q0.K.T(k8, true, 6);
            }
        }
        Q0.K k11 = (Q0.K) j3.g(obj);
        if (k11 == null) {
            return Z4.v.f8818o;
        }
        List listF0 = k11.f5822U.f5869p.f0();
        C0994b c0994b = (C0994b) listF0;
        int i11 = ((h0.e) c0994b.f12538p).f12548q;
        for (int i12 = 0; i12 < i11; i12++) {
            ((C0342c0) c0994b.get(i12)).f5965t.f5857b = true;
        }
        return listF0;
    }

    @Override // n1.d
    public final float E(long j3) {
        L l = this.f5308o;
        l.getClass();
        return n1.c.h(j3, l);
    }

    @Override // n1.d
    public final int L(float f7) {
        L l = this.f5308o;
        l.getClass();
        return n1.c.f(f7, l);
    }

    @Override // n1.d
    public final long V(long j3) {
        L l = this.f5308o;
        l.getClass();
        return n1.c.k(j3, l);
    }

    @Override // n1.d
    public final float Y(long j3) {
        L l = this.f5308o;
        l.getClass();
        return n1.c.j(j3, l);
    }

    @Override // n1.d
    public final float b() {
        return this.f5308o.f5335p;
    }

    @Override // n1.d
    public final long e0(float f7) {
        return this.f5308o.e0(f7);
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f5308o.f5334o;
    }

    @Override // n1.d
    public final float i0(int i7) {
        return this.f5308o.i0(i7);
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 k(int i7, int i8, Map map, InterfaceC1182c interfaceC1182c) {
        return this.f5308o.B(i7, i8, map, null, interfaceC1182c);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / this.f5308o.b();
    }

    @Override // n1.d
    public final float n() {
        return this.f5308o.f5336q;
    }

    @Override // O0.InterfaceC0327y
    public final boolean s() {
        return this.f5308o.s();
    }

    @Override // n1.d
    public final long t(long j3) {
        L l = this.f5308o;
        l.getClass();
        return n1.c.i(j3, l);
    }

    @Override // n1.d
    public final float v(float f7) {
        return this.f5308o.b() * f7;
    }
}
