package d0;

import e0.AbstractC0843h;
import f0.C0912t;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public static p0 a(long j3, long j7, C0912t c0912t) {
        c0912t.Y(885588574);
        long j8 = C1987t.f20262j;
        p0 p0VarB = b((C0803s) c0912t.j(AbstractC0805u.f11147a));
        long j9 = j8 != j8 ? j8 : p0VarB.f11067a;
        long j10 = j3 != j8 ? j3 : p0VarB.f11068b;
        long j11 = j8 != j8 ? j8 : p0VarB.f11069c;
        long j12 = j7 != j8 ? j7 : p0VarB.f11070d;
        long j13 = j8 != j8 ? j8 : p0VarB.f11071e;
        long j14 = j8 != j8 ? j8 : p0VarB.f11072f;
        long j15 = j8 != j8 ? j8 : p0VarB.f11073g;
        long j16 = j8 != j8 ? j8 : p0VarB.h;
        long j17 = j8 != j8 ? j8 : p0VarB.f11074i;
        if (j8 == j8) {
            j8 = p0VarB.f11075j;
        }
        p0 p0Var = new p0(j9, j10, j11, j12, j13, j14, j15, j16, j17, j8);
        c0912t.p(false);
        return p0Var;
    }

    public static p0 b(C0803s c0803s) {
        p0 p0Var = c0803s.f11094K;
        if (p0Var != null) {
            return p0Var;
        }
        long jC = AbstractC0805u.c(c0803s, AbstractC0843h.f11440f);
        long jC2 = AbstractC0805u.c(c0803s, 26);
        long jB = C1987t.b(AbstractC0805u.c(c0803s, AbstractC0843h.h), 0.38f);
        long jC3 = AbstractC0805u.c(c0803s, AbstractC0843h.f11441g);
        long jB2 = C1987t.b(AbstractC0805u.c(c0803s, AbstractC0843h.f11443j), 0.38f);
        long j3 = AbstractC1959I.j(C1987t.b(AbstractC0805u.c(c0803s, 18), 0.38f), c0803s.f11108p);
        long jB3 = C1987t.b(AbstractC0805u.c(c0803s, 18), 0.38f);
        int i7 = AbstractC0843h.f11442i;
        p0 p0Var2 = new p0(jC, jC2, jB, jC3, jB2, j3, jB3, C1987t.b(AbstractC0805u.c(c0803s, i7), 0.38f), C1987t.b(AbstractC0805u.c(c0803s, AbstractC0843h.f11439e), 0.12f), C1987t.b(AbstractC0805u.c(c0803s, i7), 0.38f));
        c0803s.f11094K = p0Var2;
        return p0Var2;
    }
}
