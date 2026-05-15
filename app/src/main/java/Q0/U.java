package Q0;

import O0.InterfaceC0296a0;
import java.util.LinkedHashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.C1443E;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends T implements O0.Y {

    /* JADX INFO: renamed from: C */
    public final j0 f5888C;

    /* JADX INFO: renamed from: E */
    public LinkedHashMap f5890E;

    /* JADX INFO: renamed from: G */
    public InterfaceC0296a0 f5892G;

    /* JADX INFO: renamed from: H */
    public final C1443E f5893H;

    /* JADX INFO: renamed from: D */
    public long f5889D = 0;

    /* JADX INFO: renamed from: F */
    public final O0.U f5891F = new O0.U(this);

    public U(j0 j0Var) {
        this.f5888C = j0Var;
        C1443E c1443e = t.N.f16028a;
        this.f5893H = new C1443E();
    }

    public static final void y0(U u7, InterfaceC0296a0 interfaceC0296a0) {
        LinkedHashMap linkedHashMap;
        if (interfaceC0296a0 != null) {
            u7.c0((((long) interfaceC0296a0.c()) & 4294967295L) | (((long) interfaceC0296a0.e()) << 32));
        } else {
            u7.c0(0L);
        }
        if (!AbstractC1209k.a(u7.f5892G, interfaceC0296a0) && interfaceC0296a0 != null && ((((linkedHashMap = u7.f5890E) != null && !linkedHashMap.isEmpty()) || !interfaceC0296a0.a().isEmpty()) && !AbstractC1209k.a(interfaceC0296a0.a(), u7.f5890E))) {
            Y y6 = u7.f5888C.f6024C.f5822U.f5870q;
            AbstractC1209k.c(y6);
            y6.f5908F.f();
            LinkedHashMap linkedHashMap2 = u7.f5890E;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                u7.f5890E = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC0296a0.a());
        }
        u7.f5892G = interfaceC0296a0;
    }

    public void A0() {
        r0().b();
    }

    public final void B0(long j3) {
        if (!n1.k.b(this.f5889D, j3)) {
            this.f5889D = j3;
            j0 j0Var = this.f5888C;
            Y y6 = j0Var.f6024C.f5822U.f5870q;
            if (y6 != null) {
                y6.j0();
            }
            T.v0(j0Var);
        }
        if (this.f5886y) {
            return;
        }
        l0(r0());
    }

    public final long C0(U u7, boolean z6) {
        long jD = 0;
        U uH0 = this;
        while (!uH0.equals(u7)) {
            if (!uH0.f5884w || !z6) {
                jD = n1.k.d(jD, uH0.f5889D);
            }
            j0 j0Var = uH0.f5888C.f6028G;
            AbstractC1209k.c(j0Var);
            uH0 = j0Var.H0();
            AbstractC1209k.c(uH0);
        }
        return jD;
    }

    @Override // O0.m0
    public final void a0(long j3, float f7, InterfaceC1182c interfaceC1182c) {
        B0(j3);
        if (this.f5885x) {
            return;
        }
        A0();
    }

    @Override // n1.d
    public final float b() {
        return this.f5888C.b();
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f5888C.f6024C.f5815N;
    }

    @Override // O0.m0, O0.Y
    public final Object i() {
        return this.f5888C.i();
    }

    @Override // n1.d
    public final float n() {
        return this.f5888C.n();
    }

    @Override // Q0.T
    public final T n0() {
        j0 j0Var = this.f5888C.f6027F;
        if (j0Var != null) {
            return j0Var.H0();
        }
        return null;
    }

    @Override // Q0.T
    public final O0.C o0() {
        return this.f5891F;
    }

    @Override // Q0.T
    public final boolean p0() {
        return this.f5892G != null;
    }

    @Override // Q0.T
    public final K q0() {
        return this.f5888C.f6024C;
    }

    @Override // Q0.T
    public final InterfaceC0296a0 r0() {
        InterfaceC0296a0 interfaceC0296a0 = this.f5892G;
        if (interfaceC0296a0 != null) {
            return interfaceC0296a0;
        }
        throw n1.c.p("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // Q0.T, O0.InterfaceC0327y
    public final boolean s() {
        return true;
    }

    @Override // Q0.T
    public final T s0() {
        j0 j0Var = this.f5888C.f6028G;
        if (j0Var != null) {
            return j0Var.H0();
        }
        return null;
    }

    @Override // Q0.T
    public final long t0() {
        return this.f5889D;
    }

    @Override // Q0.T
    public final void x0() {
        a0(this.f5889D, 0.0f, null);
    }

    public final long z0() {
        return (((long) this.f5417p) & 4294967295L) | (((long) this.f5416o) << 32);
    }
}
