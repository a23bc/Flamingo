package H2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements W {

    /* JADX INFO: renamed from: o */
    public int f3128o;

    /* JADX INFO: renamed from: p */
    public boolean f3129p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ c0 f3130q;

    public a0(c0 c0Var) {
        this.f3130q = c0Var;
    }

    @Override // H2.W
    public final void B() throws IOException {
        IOException iOException;
        c0 c0Var = this.f3130q;
        if (c0Var.f3156y) {
            return;
        }
        K2.m mVar = c0Var.f3154w;
        IOException iOException2 = mVar.f4035c;
        if (iOException2 != null) {
            throw iOException2;
        }
        K2.j jVar = mVar.f4034b;
        if (jVar != null && (iOException = jVar.f4025r) != null && jVar.f4026s > jVar.f4022o) {
            throw iOException;
        }
    }

    @Override // H2.W
    public final int C(long j3) {
        a();
        if (j3 <= 0 || this.f3128o == 2) {
            return 0;
        }
        this.f3128o = 2;
        return 1;
    }

    public final void a() {
        if (this.f3129p) {
            return;
        }
        c0 c0Var = this.f3130q;
        c0Var.f3150s.h(new C0205w(t2.M.e(c0Var.f3155x.f16701m), c0Var.f3155x, w2.t.N(0L), -9223372036854775807L));
        this.f3129p = true;
    }

    @Override // H2.W
    public final int f(V.o oVar, z2.f fVar, int i7) {
        a();
        c0 c0Var = this.f3130q;
        boolean z6 = c0Var.f3157z;
        if (z6 && c0Var.f3144A == null) {
            this.f3128o = 2;
        }
        int i8 = this.f3128o;
        if (i8 == 2) {
            fVar.a(4);
            return -4;
        }
        if ((i7 & 2) != 0 || i8 == 0) {
            oVar.f7343q = c0Var.f3155x;
            this.f3128o = 1;
            return -5;
        }
        if (!z6) {
            return -3;
        }
        c0Var.f3144A.getClass();
        fVar.a(1);
        fVar.f21117u = 0L;
        if ((i7 & 4) == 0) {
            fVar.h(c0Var.f3145B);
            fVar.f21115s.put(c0Var.f3144A, 0, c0Var.f3145B);
        }
        if ((i7 & 1) == 0) {
            this.f3128o = 2;
        }
        return -4;
    }

    @Override // H2.W
    public final boolean w() {
        return this.f3130q.f3157z;
    }
}
