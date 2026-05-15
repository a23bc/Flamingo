package C2;

import E0.C0096g;
import N2.C0293j;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.InterruptedIOException;
import m5.AbstractC1209k;
import u5.AbstractC1545g;
import w2.AbstractC1697a;
import x0.C1892b;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class N implements N2.n, N2.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1006p;

    public /* synthetic */ N(long j3, Object obj) {
        this.f1005o = j3;
        this.f1006p = obj;
    }

    @Override // N2.o
    public N2.H E(int i7, int i8) {
        return ((N2.o) this.f1006p).E(i7, i8);
    }

    @Override // N2.o
    public void H(N2.B b7) {
        ((N2.o) this.f1006p).H(new V2.c(this, b7, b7));
    }

    @Override // N2.n
    public boolean b(byte[] bArr, int i7, int i8, boolean z6) {
        return ((C0293j) this.f1006p).b(bArr, 0, i8, z6);
    }

    @Override // N2.n
    public long c() {
        return ((C0293j) this.f1006p).f5053q - this.f1005o;
    }

    @Override // N2.n
    public void f() {
        ((C0293j) this.f1006p).f5056t = 0;
    }

    @Override // N2.n
    public void g(int i7) {
        ((C0293j) this.f1006p).g(i7);
    }

    @Override // N2.n
    public boolean i(byte[] bArr, int i7, int i8, boolean z6) {
        return ((C0293j) this.f1006p).i(bArr, 0, i8, z6);
    }

    @Override // N2.n
    public long j() {
        return ((C0293j) this.f1006p).j() - this.f1005o;
    }

    @Override // N2.o
    public void k() {
        ((N2.o) this.f1006p).k();
    }

    @Override // N2.n
    public void l(byte[] bArr, int i7, int i8) {
        ((C0293j) this.f1006p).i(bArr, i7, i8, false);
    }

    @Override // N2.n
    public void m(int i7) throws EOFException, InterruptedIOException {
        ((C0293j) this.f1006p).k(i7, false);
    }

    @Override // t2.InterfaceC1481j
    public int n(byte[] bArr, int i7, int i8) {
        return ((C0293j) this.f1006p).n(bArr, i7, i8);
    }

    @Override // N2.n
    public long o() {
        return ((C0293j) this.f1006p).f5054r - this.f1005o;
    }

    public long p(K0.u uVar, float f7) {
        long jH = C1892b.h(this.f1005o, C1892b.g(uVar.f3912c, uVar.f3916g));
        this.f1005o = jH;
        EnumC2048l0 enumC2048l0 = (EnumC2048l0) this.f1006p;
        if ((enumC2048l0 == null ? C1892b.c(jH) : Math.abs(q(jH))) < f7) {
            return 9205357640488583168L;
        }
        if (enumC2048l0 == null) {
            long j3 = this.f1005o;
            float fC = C1892b.c(j3);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / fC;
            return C1892b.g(this.f1005o, C1892b.i((4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fC))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f7));
        }
        float fQ = q(this.f1005o) - (Math.signum(q(this.f1005o)) * f7);
        long j7 = this.f1005o;
        EnumC2048l0 enumC2048l02 = EnumC2048l0.f20895p;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (enumC2048l0 == enumC2048l02 ? j7 & 4294967295L : j7 >> 32));
        if (enumC2048l0 == enumC2048l02) {
            return (((long) Float.floatToRawIntBits(fQ)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fQ)));
    }

    public float q(long j3) {
        return Float.intBitsToFloat((int) (((EnumC2048l0) this.f1006p) == EnumC2048l0.f20895p ? j3 >> 32 : j3 & 4294967295L));
    }

    public F5.m r() throws EOFException {
        C0096g c0096g = new C0096g(1);
        while (true) {
            String strS = ((S5.y) this.f1006p).s(this.f1005o);
            this.f1005o -= (long) strS.length();
            if (strS.length() == 0) {
                return c0096g.h();
            }
            int iW = AbstractC1545g.W(strS, ':', 1, 4);
            if (iW != -1) {
                String strSubstring = strS.substring(0, iW);
                AbstractC1209k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strS.substring(iW + 1);
                AbstractC1209k.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c0096g.f(strSubstring, strSubstring2);
            } else if (strS.charAt(0) == ':') {
                String strSubstring3 = strS.substring(1);
                AbstractC1209k.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                c0096g.f("", strSubstring3);
            } else {
                c0096g.f("", strS);
            }
        }
    }

    @Override // N2.n
    public void readFully(byte[] bArr, int i7, int i8) {
        ((C0293j) this.f1006p).b(bArr, i7, i8, false);
    }

    public void s(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f1006p) == null) {
            this.f1006p = exc;
            this.f1005o = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f1005o) {
            Exception exc2 = (Exception) this.f1006p;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f1006p;
            this.f1006p = null;
            throw exc3;
        }
    }

    public N(C0293j c0293j, long j3) {
        this.f1006p = c0293j;
        AbstractC1697a.d(c0293j.f5054r >= j3);
        this.f1005o = j3;
    }

    public N(long j3, EnumC2048l0 enumC2048l0) {
        this.f1006p = enumC2048l0;
        this.f1005o = j3;
    }
}
