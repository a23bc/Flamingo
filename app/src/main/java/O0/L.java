package O0;

import h0.C0994b;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class L implements B0 {

    /* JADX INFO: renamed from: o */
    public n1.n f5334o = n1.n.f14522p;

    /* JADX INFO: renamed from: p */
    public float f5335p;

    /* JADX INFO: renamed from: q */
    public float f5336q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ S f5337r;

    public L(S s7) {
        this.f5337r = s7;
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 B(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            N0.a.b("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new K(i7, i8, map, a4, this, this.f5337r, interfaceC1182c);
    }

    @Override // O0.B0
    public final List D(Object obj, l5.e eVar) throws Exception {
        S s7 = this.f5337r;
        s7.c();
        Q0.K k7 = s7.f5355o;
        Q0.G g6 = k7.f5822U.f5859d;
        Q0.G g7 = Q0.G.f5787o;
        if (g6 != g7 && g6 != Q0.G.f5789q && g6 != Q0.G.f5788p && g6 != Q0.G.f5790r) {
            N0.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        t.J j3 = s7.f5361u;
        Object objG = j3.g(obj);
        if (objG == null) {
            objG = (Q0.K) s7.f5364x.k(obj);
            if (objG != null) {
                if (s7.f5353C <= 0) {
                    N0.a.b("Check failed.");
                }
                s7.f5353C--;
            } else {
                objG = s7.j(obj);
                if (objG == null) {
                    int i7 = s7.f5358r;
                    Q0.K k8 = new Q0.K(2);
                    k7.f5806E = true;
                    k7.C(i7, k8);
                    k7.f5806E = false;
                    objG = k8;
                }
            }
            j3.m(obj, objG);
        }
        Q0.K k9 = (Q0.K) objG;
        if (Z4.n.s0(s7.f5358r, k7.p()) != k9) {
            int iJ = ((h0.e) ((C0994b) k7.p()).f12538p).j(k9);
            if (iJ < s7.f5358r) {
                N0.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i8 = s7.f5358r;
            if (i8 != iJ) {
                k7.f5806E = true;
                k7.M(iJ, i8, 1);
                k7.f5806E = false;
            }
        }
        s7.f5358r++;
        s7.i(k9, obj, false, eVar);
        return (g6 == g7 || g6 == Q0.G.f5789q) ? k9.n() : k9.m();
    }

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return n1.c.h(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return n1.c.f(f7, this);
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return n1.c.k(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return n1.c.j(j3, this);
    }

    @Override // n1.d
    public final float b() {
        return this.f5335p;
    }

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f5334o;
    }

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 k(int i7, int i8, Map map, InterfaceC1182c interfaceC1182c) {
        return B(i7, i8, map, null, interfaceC1182c);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
    }

    @Override // n1.d
    public final float n() {
        return this.f5336q;
    }

    @Override // O0.InterfaceC0327y
    public final boolean s() {
        Q0.G g6 = this.f5337r.f5355o.f5822U.f5859d;
        return g6 == Q0.G.f5790r || g6 == Q0.G.f5788p;
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return n1.c.i(j3, this);
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
