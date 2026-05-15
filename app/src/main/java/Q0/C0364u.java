package Q0;

import O0.C0322t;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: Q0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0364u extends U {
    @Override // Q0.U
    public final void A0() {
        Y y6 = this.f5888C.f6024C.f5822U.f5870q;
        AbstractC1209k.c(y6);
        y6.m0();
    }

    @Override // O0.Y
    public final int M(int i7) {
        V.o oVarU = this.f5888C.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.b(k7.f5821T.f6003d, k7.m(), i7);
    }

    @Override // O0.Y
    public final int P(int i7) {
        V.o oVarU = this.f5888C.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.d(k7.f5821T.f6003d, k7.m(), i7);
    }

    @Override // O0.Y
    public final int Q(int i7) {
        V.o oVarU = this.f5888C.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.a(k7.f5821T.f6003d, k7.m(), i7);
    }

    @Override // O0.Y
    public final O0.m0 d(long j3) {
        d0(j3);
        j0 j0Var = this.f5888C;
        h0.e eVarA = j0Var.f6024C.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            Y y6 = ((K) objArr[i8]).f5822U.f5870q;
            AbstractC1209k.c(y6);
            y6.f5919x = I.f5796q;
        }
        K k7 = j0Var.f6024C;
        U.y0(this, k7.f5812K.g(this, k7.m(), j3));
        return this;
    }

    @Override // O0.Y
    public final int e(int i7) {
        V.o oVarU = this.f5888C.f6024C.u();
        O0.Z zS = oVarU.s();
        K k7 = (K) oVarU.f7342p;
        return zS.f(k7.f5821T.f6003d, k7.m(), i7);
    }

    @Override // Q0.T
    public final int g0(C0322t c0322t) {
        Y y6 = this.f5888C.f6024C.f5822U.f5870q;
        AbstractC1209k.c(y6);
        P p7 = y6.f5915t;
        G g6 = p7.f5859d;
        G g7 = G.f5788p;
        L l = y6.f5908F;
        if (g6 == g7) {
            l.f5845d = true;
            if (l.f5843b) {
                p7.f5861f = true;
                p7.f5862g = true;
            }
        } else {
            l.f5846e = true;
        }
        C0364u c0364u = y6.o().f6084g0;
        if (c0364u != null) {
            c0364u.f5886y = true;
        }
        y6.r();
        C0364u c0364u2 = y6.o().f6084g0;
        if (c0364u2 != null) {
            c0364u2.f5886y = false;
        }
        Integer num = (Integer) l.f5848g.get(c0322t);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f5893H.h(iIntValue, c0322t);
        return iIntValue;
    }
}
