package D;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: D.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059c0 extends AbstractC1397o implements Q0.A {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ int f1303C;

    public /* synthetic */ AbstractC0059c0(int i7) {
        this.f1303C = i7;
    }

    public abstract long B0(O0.Y y6, long j3);

    public abstract boolean C0();

    public int c(Q0.T t7, O0.Y y6, int i7) {
        switch (this.f1303C) {
        }
        return y6.e(i7);
    }

    @Override // Q0.A
    public int d(Q0.T t7, O0.Y y6, int i7) {
        switch (this.f1303C) {
        }
        return y6.M(i7);
    }

    @Override // Q0.A
    public InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        long jB0 = B0(y6, j3);
        if (C0()) {
            jB0 = n1.b.e(j3, jB0);
        }
        O0.m0 m0VarD = y6.d(jB0);
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new C0069j(m0VarD, 2));
    }

    public int g(Q0.T t7, O0.Y y6, int i7) {
        switch (this.f1303C) {
        }
        return y6.Q(i7);
    }

    @Override // Q0.A
    public int h(Q0.T t7, O0.Y y6, int i7) {
        switch (this.f1303C) {
        }
        return y6.P(i7);
    }
}
