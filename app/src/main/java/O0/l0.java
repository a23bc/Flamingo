package O0;

import Q0.InterfaceC0346e0;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 implements n1.d {

    /* JADX INFO: renamed from: o */
    public boolean f5412o;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(l0 l0Var, m0 m0Var) {
        l0Var.getClass();
        if (m0Var instanceof InterfaceC0346e0) {
            ((InterfaceC0346e0) m0Var).l(l0Var.f5412o);
        }
    }

    public static void h(l0 l0Var, m0 m0Var, int i7, int i8) {
        l0Var.getClass();
        a(l0Var, m0Var);
        m0Var.a0(n1.k.d((((long) i8) & 4294967295L) | (((long) i7) << 32), m0Var.f5420s), 0.0f, null);
    }

    public static void i(l0 l0Var, m0 m0Var, long j3) {
        l0Var.getClass();
        a(l0Var, m0Var);
        m0Var.a0(n1.k.d(j3, m0Var.f5420s), 0.0f, null);
    }

    public static void j(l0 l0Var, m0 m0Var, int i7, int i8) {
        long j3 = (((long) i7) << 32) | (((long) i8) & 4294967295L);
        if (l0Var.e() == n1.n.f14521o || l0Var.g() == 0) {
            a(l0Var, m0Var);
            m0Var.a0(n1.k.d(j3, m0Var.f5420s), 0.0f, null);
        } else {
            int iG = (l0Var.g() - m0Var.f5416o) - ((int) (j3 >> 32));
            a(l0Var, m0Var);
            m0Var.a0(n1.k.d((((long) iG) << 32) | (((long) ((int) (j3 & 4294967295L))) & 4294967295L), m0Var.f5420s), 0.0f, null);
        }
    }

    public static void l(l0 l0Var, m0 m0Var, long j3) {
        if (l0Var.e() == n1.n.f14521o || l0Var.g() == 0) {
            a(l0Var, m0Var);
            m0Var.a0(n1.k.d(j3, m0Var.f5420s), 0.0f, null);
        } else {
            int iG = (l0Var.g() - m0Var.f5416o) - ((int) (j3 >> 32));
            a(l0Var, m0Var);
            m0Var.a0(n1.k.d((((long) ((int) (j3 & 4294967295L))) & 4294967295L) | (((long) iG) << 32), m0Var.f5420s), 0.0f, null);
        }
    }

    public static void m(l0 l0Var, m0 m0Var, int i7, int i8) {
        int i9 = o0.f5431b;
        n0 n0Var = n0.f5422q;
        long j3 = (((long) i7) << 32) | (((long) i8) & 4294967295L);
        if (l0Var.e() == n1.n.f14521o || l0Var.g() == 0) {
            a(l0Var, m0Var);
            m0Var.a0(n1.k.d(j3, m0Var.f5420s), 0.0f, n0Var);
        } else {
            int iG = (l0Var.g() - m0Var.f5416o) - ((int) (j3 >> 32));
            a(l0Var, m0Var);
            m0Var.a0(n1.k.d((((long) iG) << 32) | (((long) ((int) (j3 & 4294967295L))) & 4294967295L), m0Var.f5420s), 0.0f, n0Var);
        }
    }

    public static void o(l0 l0Var, m0 m0Var, int i7, int i8, InterfaceC1182c interfaceC1182c, int i9) {
        if ((i9 & 8) != 0) {
            int i10 = o0.f5431b;
            interfaceC1182c = n0.f5422q;
        }
        l0Var.getClass();
        a(l0Var, m0Var);
        m0Var.a0(n1.k.d((((long) i8) & 4294967295L) | (((long) i7) << 32), m0Var.f5420s), 0.0f, interfaceC1182c);
    }

    public static void q(l0 l0Var, m0 m0Var, long j3) {
        int i7 = o0.f5431b;
        n0 n0Var = n0.f5422q;
        l0Var.getClass();
        a(l0Var, m0Var);
        m0Var.a0(n1.k.d(j3, m0Var.f5420s), 0.0f, n0Var);
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

    public float c(C0324v c0324v) {
        return Float.NaN;
    }

    public abstract C d();

    public abstract n1.n e();

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
    }

    public abstract int g();

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
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
