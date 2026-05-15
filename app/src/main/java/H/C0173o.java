package H;

import D.C0069j;
import O0.AbstractC0315l;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import Q0.AbstractC0347f;
import r0.AbstractC1397o;
import z.EnumC2048l0;

/* JADX INFO: renamed from: H.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0173o extends AbstractC1397o implements P0.d, Q0.A {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0171m f2913F = new C0171m();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC0174p f2914C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0170l f2915D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public EnumC2048l0 f2916E;

    public final boolean B0(C0169k c0169k, int i7) {
        if (i7 == 5 || i7 == 6) {
            if (this.f2916E == EnumC2048l0.f20895p) {
                return false;
            }
        } else if (i7 == 3 || i7 == 4) {
            if (this.f2916E == EnumC2048l0.f20894o) {
                return false;
            }
        } else if (i7 != 1 && i7 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (C0(i7)) {
            if (c0169k.f2905b >= this.f2914C.a() - 1) {
                return false;
            }
        } else if (c0169k.f2904a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean C0(int i7) {
        if (i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            return true;
        }
        if (i7 == 5) {
            return false;
        }
        if (i7 == 6) {
            return true;
        }
        if (i7 == 3) {
            int iOrdinal = AbstractC0347f.x(this).f5815N.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new A2.W();
        }
        if (i7 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = AbstractC0347f.x(this).f5815N.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new A2.W();
    }

    @Override // Q0.A
    public final /* synthetic */ int c(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.d(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int d(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.m(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        O0.m0 m0VarD = y6.d(j3);
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new C0069j(m0VarD, 4));
    }

    @Override // Q0.A
    public final /* synthetic */ int g(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.j(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int h(Q0.T t7, O0.Y y6, int i7) {
        return A0.e.g(this, t7, y6, i7);
    }

    @Override // P0.d
    public final N5.l j() {
        P0.f fVar = AbstractC0315l.f5411a;
        P0.g gVar = new P0.g(fVar);
        gVar.V(fVar, this);
        return gVar;
    }

    @Override // P0.e
    public final /* synthetic */ Object y(P0.f fVar) {
        return A0.e.a(this, fVar);
    }
}
