package Q0;

import O0.C0322t;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class B extends U {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ D f5771I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d4) {
        super(d4);
        this.f5771I = d4;
    }

    @Override // O0.Y
    public final int M(int i7) {
        D d4 = this.f5771I;
        A a4 = d4.f5777f0;
        j0 j0Var = d4.f6027F;
        AbstractC1209k.c(j0Var);
        U uH0 = j0Var.H0();
        AbstractC1209k.c(uH0);
        return a4.d(this, uH0, i7);
    }

    @Override // O0.Y
    public final int P(int i7) {
        D d4 = this.f5771I;
        A a4 = d4.f5777f0;
        j0 j0Var = d4.f6027F;
        AbstractC1209k.c(j0Var);
        U uH0 = j0Var.H0();
        AbstractC1209k.c(uH0);
        return a4.h(this, uH0, i7);
    }

    @Override // O0.Y
    public final int Q(int i7) {
        D d4 = this.f5771I;
        A a4 = d4.f5777f0;
        j0 j0Var = d4.f6027F;
        AbstractC1209k.c(j0Var);
        U uH0 = j0Var.H0();
        AbstractC1209k.c(uH0);
        return a4.g(this, uH0, i7);
    }

    @Override // O0.Y
    public final O0.m0 d(long j3) {
        d0(j3);
        n1.a aVar = new n1.a(j3);
        D d4 = this.f5771I;
        d4.f5778g0 = aVar;
        A a4 = d4.f5777f0;
        j0 j0Var = d4.f6027F;
        AbstractC1209k.c(j0Var);
        U uH0 = j0Var.H0();
        AbstractC1209k.c(uH0);
        U.y0(this, a4.e(this, uH0, j3));
        return this;
    }

    @Override // O0.Y
    public final int e(int i7) {
        D d4 = this.f5771I;
        A a4 = d4.f5777f0;
        j0 j0Var = d4.f6027F;
        AbstractC1209k.c(j0Var);
        U uH0 = j0Var.H0();
        AbstractC1209k.c(uH0);
        return a4.c(this, uH0, i7);
    }

    @Override // Q0.T
    public final int g0(C0322t c0322t) {
        int iC = AbstractC0347f.c(this, c0322t);
        this.f5893H.h(iC, c0322t);
        return iC;
    }
}
