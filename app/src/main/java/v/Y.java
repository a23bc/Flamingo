package v;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0307g;
import Q0.AbstractC0347f;
import Q0.InterfaceC0360p;
import R0.C0415x;
import a.AbstractC0509a;
import j5.AbstractC1107a;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x0.C1893c;
import y0.C1976i;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1397o implements InterfaceC0360p, P0.d, Q0.A {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b0 f18020C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public B0.d f18021D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final P0.g f18022E;

    public Y(b0 b0Var) {
        this.f18020C = b0Var;
        this.f18021D = (B0.d) b0Var.f18045z.getValue();
        P0.f fVar = Z.f18023a;
        P0.g gVar = new P0.g(fVar);
        gVar.V(fVar, b0Var);
        this.f18022E = gVar;
    }

    public static final void B0(Y y6, O0.C c7) {
        a0 a0VarC = y6.f18020C.c();
        O0.C c8 = y6.f18020C.c().f18026a.f18116t;
        if (c8 == null) {
            AbstractC1209k.m("root");
            throw null;
        }
        a0VarC.f18029d.setValue(AbstractC1113a.o(c8.K(c7, 0L), i6.h.i((int) (c7.G() >> 32), (int) (c7.G() & 4294967295L))));
    }

    public final InterfaceC0296a0 C0(InterfaceC0307g interfaceC0307g, O0.Y y6, long j3) {
        if (this.f18020C.c().b()) {
            C1893c c1893cC = this.f18020C.b().c();
            if (c1893cC == null) {
                c1893cC = this.f18020C.c().a();
            }
            if (c1893cC != null) {
                long jW = AbstractC1107a.w(c1893cC.c());
                int i7 = (int) (jW >> 32);
                int i8 = (int) (jW & 4294967295L);
                if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + this.f18020C.b().c() + ", current bounds: " + this.f18020C.c().a()).toString());
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                if (!((i8 >= 0) & (i7 >= 0))) {
                    n1.j.a("width and height must be >= 0");
                }
                j3 = n1.b.h(i7, i7, i8, i8);
            }
        }
        O0.m0 m0VarD = y6.d(j3);
        e0 e0Var = (e0) this.f18020C.f18038s.getValue();
        long jG = D0().G();
        e0Var.a(jG, AbstractC1107a.b(m0VarD.f5416o, m0VarD.f5417p));
        return interfaceC0307g.k((int) (jG >> 32), (int) (4294967295L & jG), Z4.w.f8819o, new K0.A(this, 20, m0VarD));
    }

    public final O0.C D0() {
        k0 k0Var = this.f18020C.c().f18026a;
        return k0Var.f18112p.a(AbstractC0347f.w(this));
    }

    public final void E0(B0.d dVar) {
        if (dVar == null) {
            B0.d dVar2 = this.f18021D;
            if (dVar2 != null) {
                ((C0415x) AbstractC0347f.y(this)).getGraphicsContext().a(dVar2);
            }
        } else {
            this.f18020C.f18045z.setValue(dVar);
        }
        this.f18021D = dVar;
    }

    @Override // Q0.InterfaceC0360p
    public final void a(Q0.N n7) {
        b0 b0Var = this.f18020C;
        m0 m0Var = (m0) b0Var.f18040u.getValue();
        f0 f0Var = (f0) this.f18020C.f18041v.getValue();
        AbstractC1209k.c(this.f18020C.c().a());
        n7.getLayoutDirection();
        n1.d dVar = AbstractC0347f.x(this).f5814M;
        m0Var.getClass();
        b0 b0Var2 = (b0) f0Var.f18085a.getValue();
        if (b0Var2 == null) {
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }
        b0 b0Var3 = b0Var2.f18044y;
        C1976i c1976i = null;
        f0 f0Var2 = b0Var3 != null ? (f0) b0Var3.f18041v.getValue() : null;
        if (f0Var2 != null) {
            b0 b0Var4 = (b0) f0Var2.f18085a.getValue();
            if (b0Var4 == null) {
                throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
            }
            c1976i = b0Var4.f18042w;
        }
        b0Var.f18042w = c1976i;
        B0.d dVar2 = (B0.d) this.f18020C.f18045z.getValue();
        if (dVar2 == null) {
            StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : album,target: ");
            this.f18020C.c().getClass();
            sb.append(this.f18020C.b().b());
            sb.append(", is attached: ");
            sb.append(this.f15636B);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        A0.e.J(n7, dVar2, new C1628y(3, n7));
        b0 b0Var5 = this.f18020C;
        if (!b0Var5.c().b() || (!b0Var5.g() && b0Var5.d())) {
            AbstractC0509a.t(n7, dVar2);
        }
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
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new C1616m(m0VarD, this, i6.h.i(m0VarD.f5416o, m0VarD.f5417p)));
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
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
        return this.f18022E;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        P0.f fVar = Z.f18023a;
        A0.e.n(this, fVar, this.f18020C);
        this.f18020C.f18044y = (b0) A0.e.a(this, fVar);
        E0(((C0415x) AbstractC0347f.y(this)).getGraphicsContext().b());
        this.f18020C.f18043x = new X(this, 0);
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        E0(null);
        b0 b0Var = this.f18020C;
        b0Var.f18044y = null;
        b0Var.f18043x = C1591I.f17976r;
    }

    @Override // r0.AbstractC1397o
    public final void v0() {
        B0.d dVar = this.f18021D;
        if (dVar != null) {
            ((C0415x) AbstractC0347f.y(this)).getGraphicsContext().a(dVar);
        }
        E0(((C0415x) AbstractC0347f.y(this)).getGraphicsContext().b());
    }

    @Override // P0.e
    public final /* synthetic */ Object y(P0.f fVar) {
        return A0.e.a(this, fVar);
    }
}
