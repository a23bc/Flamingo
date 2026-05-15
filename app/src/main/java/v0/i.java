package v0;

import O0.C0306f0;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.Y;
import O0.m0;
import O0.p0;
import O0.w0;
import Q0.A;
import Q0.InterfaceC0360p;
import Q0.N;
import Q0.T;
import Z4.w;
import r0.AbstractC1397o;
import r0.InterfaceC1386d;
import x0.C1895e;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1397o implements A, InterfaceC0360p {

    /* JADX INFO: renamed from: C */
    public D0.b f18215C;

    /* JADX INFO: renamed from: D */
    public boolean f18216D;

    /* JADX INFO: renamed from: E */
    public InterfaceC1386d f18217E;

    /* JADX INFO: renamed from: F */
    public C0306f0 f18218F;

    /* JADX INFO: renamed from: G */
    public float f18219G;

    /* JADX INFO: renamed from: H */
    public C1980m f18220H;

    public static boolean C0(long j3) {
        return !C1895e.a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean D0(long j3) {
        return !C1895e.a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean B0() {
        return this.f18216D && this.f18215C.h() != 9205357640488583168L;
    }

    public final long E0(long j3) {
        boolean z6 = false;
        boolean z7 = n1.a.d(j3) && n1.a.c(j3);
        if (n1.a.f(j3) && n1.a.e(j3)) {
            z6 = true;
        }
        if ((!B0() && z7) || z6) {
            return n1.a.a(j3, n1.a.h(j3), 0, n1.a.g(j3), 0, 10);
        }
        long jH = this.f18215C.h();
        int iRound = D0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : n1.a.j(j3);
        int iRound2 = C0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : n1.a.i(j3);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(n1.b.f(j3, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(n1.b.g(j3, iRound))) << 32);
        if (B0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!D0(this.f18215C.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f18215C.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!C0(this.f18215C.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f18215C.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : w0.l(jFloatToRawIntBits2, this.f18218F.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return n1.a.a(j3, n1.b.g(j3, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, n1.b.f(j3, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    @Override // Q0.InterfaceC0360p
    public final void a(N n7) {
        long jH = this.f18215C.h();
        boolean zD0 = D0(jH);
        A0.c cVar = n7.f5853o;
        float fIntBitsToFloat = zD0 ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (cVar.f54p.W() >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (cVar.f54p.W() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        long jL = (Float.intBitsToFloat((int) (cVar.f54p.W() >> 32)) == 0.0f || Float.intBitsToFloat((int) (cVar.f54p.W() & 4294967295L)) == 0.0f) ? 0L : w0.l(jFloatToRawIntBits, this.f18218F.a(jFloatToRawIntBits, cVar.f54p.W()));
        long jA = this.f18217E.a((((long) Math.round(Float.intBitsToFloat((int) (jL >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jL & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (cVar.f54p.W() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (cVar.f54p.W() & 4294967295L)))) & 4294967295L), n7.getLayoutDirection());
        float f7 = (int) (jA >> 32);
        float f8 = (int) (jA & 4294967295L);
        ((A.b) cVar.f54p.f50p).J(f7, f8);
        try {
            this.f18215C.g(n7, jL, this.f18219G, this.f18220H);
            ((A.b) cVar.f54p.f50p).J(-f7, -f8);
            n7.a();
        } catch (Throwable th) {
            ((A.b) cVar.f54p.f50p).J(-f7, -f8);
            throw th;
        }
    }

    @Override // Q0.A
    public final int c(T t7, Y y6, int i7) {
        if (!B0()) {
            return y6.e(i7);
        }
        long jE0 = E0(n1.b.b(i7, 0, 13));
        return Math.max(n1.a.i(jE0), y6.e(i7));
    }

    @Override // Q0.A
    public final int d(T t7, Y y6, int i7) {
        if (!B0()) {
            return y6.M(i7);
        }
        long jE0 = E0(n1.b.b(0, i7, 7));
        return Math.max(n1.a.j(jE0), y6.M(i7));
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        m0 m0VarD = y6.d(E0(j3));
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, w.f8819o, new p0(m0VarD, 8));
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // Q0.A
    public final int g(T t7, Y y6, int i7) {
        if (!B0()) {
            return y6.Q(i7);
        }
        long jE0 = E0(n1.b.b(i7, 0, 13));
        return Math.max(n1.a.i(jE0), y6.Q(i7));
    }

    @Override // Q0.A
    public final int h(T t7, Y y6, int i7) {
        if (!B0()) {
            return y6.P(i7);
        }
        long jE0 = E0(n1.b.b(0, i7, 7));
        return Math.max(n1.a.j(jE0), y6.P(i7));
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f18215C + ", sizeToIntrinsics=" + this.f18216D + ", alignment=" + this.f18217E + ", alpha=" + this.f18219G + ", colorFilter=" + this.f18220H + ')';
    }
}
