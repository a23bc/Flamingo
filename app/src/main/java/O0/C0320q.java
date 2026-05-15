package O0;

/* JADX INFO: renamed from: O0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0320q implements Y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Y f5435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Enum f5436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Enum f5437r;

    public /* synthetic */ C0320q(Y y6, Enum r22, Enum r32, int i7) {
        this.f5434o = i7;
        this.f5435p = y6;
        this.f5436q = r22;
        this.f5437r = r32;
    }

    @Override // O0.Y
    public final int M(int i7) {
        switch (this.f5434o) {
        }
        return this.f5435p.M(i7);
    }

    @Override // O0.Y
    public final int P(int i7) {
        switch (this.f5434o) {
        }
        return this.f5435p.P(i7);
    }

    @Override // O0.Y
    public final int Q(int i7) {
        switch (this.f5434o) {
        }
        return this.f5435p.Q(i7);
    }

    @Override // O0.Y
    public final m0 d(long j3) {
        switch (this.f5434o) {
            case 0:
                A a4 = A.f5275o;
                EnumC0328z enumC0328z = (EnumC0328z) this.f5436q;
                A a7 = (A) this.f5437r;
                Y y6 = this.f5435p;
                if (a7 == a4) {
                    return new C0321s(enumC0328z == EnumC0328z.f5474p ? y6.P(n1.a.g(j3)) : y6.M(n1.a.g(j3)), n1.a.c(j3) ? n1.a.g(j3) : 32767, 0);
                }
                return new C0321s(n1.a.d(j3) ? n1.a.h(j3) : 32767, enumC0328z == EnumC0328z.f5474p ? y6.e(n1.a.h(j3)) : y6.Q(n1.a.h(j3)), 0);
            case 1:
                EnumC0302d0 enumC0302d0 = EnumC0302d0.f5379o;
                EnumC0300c0 enumC0300c0 = (EnumC0300c0) this.f5436q;
                EnumC0302d0 enumC0302d02 = (EnumC0302d0) this.f5437r;
                Y y7 = this.f5435p;
                if (enumC0302d02 == enumC0302d0) {
                    return new C0321s(enumC0300c0 == EnumC0300c0.f5377p ? y7.P(n1.a.g(j3)) : y7.M(n1.a.g(j3)), n1.a.c(j3) ? n1.a.g(j3) : 32767, 1);
                }
                return new C0321s(n1.a.d(j3) ? n1.a.h(j3) : 32767, enumC0300c0 == EnumC0300c0.f5377p ? y7.e(n1.a.h(j3)) : y7.Q(n1.a.h(j3)), 1);
            default:
                Q0.m0 m0Var = Q0.m0.f6052o;
                Q0.l0 l0Var = (Q0.l0) this.f5436q;
                Q0.m0 m0Var2 = (Q0.m0) this.f5437r;
                Y y8 = this.f5435p;
                if (m0Var2 == m0Var) {
                    return new C0321s(l0Var == Q0.l0.f6050p ? y8.P(n1.a.g(j3)) : y8.M(n1.a.g(j3)), n1.a.c(j3) ? n1.a.g(j3) : 32767, 2);
                }
                return new C0321s(n1.a.d(j3) ? n1.a.h(j3) : 32767, l0Var == Q0.l0.f6050p ? y8.e(n1.a.h(j3)) : y8.Q(n1.a.h(j3)), 2);
        }
    }

    @Override // O0.Y
    public final int e(int i7) {
        switch (this.f5434o) {
        }
        return this.f5435p.e(i7);
    }

    @Override // O0.Y
    public final Object i() {
        switch (this.f5434o) {
        }
        return this.f5435p.i();
    }
}
