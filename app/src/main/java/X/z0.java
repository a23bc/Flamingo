package X;

import b1.AbstractC0607C;
import b1.C0613I;
import b1.C0622g;
import b1.C0630o;
import g1.C0959a;
import g1.C0979u;
import g1.C0980v;
import g1.InterfaceC0965g;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a */
    public final C0622g f8215a;

    /* JADX INFO: renamed from: b */
    public final long f8216b;

    /* JADX INFO: renamed from: c */
    public final C0613I f8217c;

    /* JADX INFO: renamed from: d */
    public final B2.m f8218d;

    /* JADX INFO: renamed from: e */
    public final P0 f8219e;

    /* JADX INFO: renamed from: f */
    public long f8220f;

    /* JADX INFO: renamed from: g */
    public final C0622g f8221g;
    public final C0980v h;

    /* JADX INFO: renamed from: i */
    public final M.E0 f8222i;

    public z0(C0980v c0980v, B2.m mVar, M.E0 e02, P0 p02) {
        C0622g c0622g = c0980v.f12384a;
        C0613I c0613i = e02 != null ? e02.f4386a : null;
        long j3 = c0980v.f12385b;
        this.f8215a = c0622g;
        this.f8216b = j3;
        this.f8217c = c0613i;
        this.f8218d = mVar;
        this.f8219e = p02;
        this.f8220f = j3;
        this.f8221g = c0622g;
        this.h = c0980v;
        this.f8222i = e02;
    }

    public final List a(InterfaceC1182c interfaceC1182c) {
        if (!b1.L.c(this.f8220f)) {
            return Z4.o.e0(new C0959a("", 0), new C0979u(b1.L.f(this.f8220f), b1.L.f(this.f8220f)));
        }
        InterfaceC0965g interfaceC0965g = (InterfaceC0965g) interfaceC1182c.b(this);
        if (interfaceC0965g != null) {
            return I0.c.G(interfaceC0965g);
        }
        return null;
    }

    public final Integer b() {
        C0613I c0613i = this.f8217c;
        if (c0613i == null) {
            return null;
        }
        int iE = b1.L.e(this.f8220f);
        B2.m mVar = this.f8218d;
        mVar.a(iE);
        C0630o c0630o = c0613i.f9930b;
        int iC = c0630o.c(c0630o.d(iE), true);
        mVar.b(iC);
        return Integer.valueOf(iC);
    }

    public final Integer c() {
        C0613I c0613i = this.f8217c;
        if (c0613i == null) {
            return null;
        }
        int iF = b1.L.f(this.f8220f);
        B2.m mVar = this.f8218d;
        mVar.a(iF);
        int iH = c0613i.h(c0613i.f9930b.d(iF));
        mVar.b(iH);
        return Integer.valueOf(iH);
    }

    public final Integer d() {
        int length;
        C0613I c0613i = this.f8217c;
        if (c0613i == null) {
            return null;
        }
        int iR = r();
        while (true) {
            C0622g c0622g = this.f8215a;
            if (iR < c0622g.f9970p.length()) {
                int length2 = this.f8221g.f9970p.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jK = c0613i.k(length2);
                int i7 = b1.L.f9944c;
                int i8 = (int) (jK & 4294967295L);
                if (i8 > iR) {
                    this.f8218d.b(i8);
                    length = i8;
                    break;
                }
                iR++;
            } else {
                length = c0622g.f9970p.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i7;
        C0613I c0613i = this.f8217c;
        if (c0613i == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                i7 = 0;
                break;
            }
            int length = this.f8221g.f9970p.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jK = c0613i.k(length);
            int i8 = b1.L.f9944c;
            int i9 = (int) (jK >> 32);
            if (i9 < iR) {
                this.f8218d.b(i9);
                i7 = i9;
                break;
            }
            iR--;
        }
        return Integer.valueOf(i7);
    }

    public final boolean f() {
        C0613I c0613i = this.f8217c;
        return (c0613i != null ? c0613i.i(r()) : null) != m1.j.f14342p;
    }

    public final int g(C0613I c0613i, int i7) {
        int iR = r();
        P0 p02 = this.f8219e;
        if (p02.f7982a == null) {
            p02.f7982a = Float.valueOf(c0613i.c(iR).f19869a);
        }
        int iD = c0613i.f9930b.d(iR) + i7;
        if (iD < 0) {
            return 0;
        }
        C0630o c0630o = c0613i.f9930b;
        if (iD >= c0630o.f9992f) {
            return this.f8221g.f9970p.length();
        }
        float fB = c0630o.b(iD) - 1;
        Float f7 = p02.f7982a;
        AbstractC1209k.c(f7);
        float fFloatValue = f7.floatValue();
        if ((f() && fFloatValue >= c0613i.g(iD)) || (!f() && fFloatValue <= c0613i.f(iD))) {
            return c0630o.c(iD, true);
        }
        int iG = c0630o.g((((long) Float.floatToRawIntBits(f7.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
        this.f8218d.b(iG);
        return iG;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(M.E0 r8, int r9) {
        /*
            r7 = this;
            O0.C r0 = r8.f4387b
            if (r0 == 0) goto L11
            O0.C r1 = r8.f4388c
            if (r1 == 0) goto Le
            r2 = 1
            x0.c r0 = r1.m(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
        L11:
            x0.c r0 = x0.C1893c.f19868e
        L13:
            g1.v r1 = r7.h
            long r1 = r1.f12385b
            int r3 = b1.L.f9944c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            B2.m r2 = r7.f8218d
            r2.a(r1)
            b1.I r8 = r8.f4386a
            x0.c r1 = r8.c(r1)
            long r5 = r0.c()
            long r5 = r5 & r3
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r9 = (float) r9
            float r0 = r0 * r9
            float r9 = r1.f19870b
            float r0 = r0 + r9
            float r9 = r1.f19869a
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r5 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r9
            r9 = 32
            long r5 = r5 << r9
            long r0 = r0 & r3
            long r0 = r0 | r5
            b1.o r8 = r8.f9930b
            int r8 = r8.g(r0)
            r2.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.z0.h(M.E0, int):int");
    }

    public final void i() {
        C0622g c0622g = this.f8221g;
        P0 p02 = this.f8219e;
        p02.f7982a = null;
        if (c0622g.f9970p.length() > 0) {
            if (f()) {
                k();
                return;
            }
            p02.f7982a = null;
            if (c0622g.f9970p.length() > 0) {
                String str = c0622g.f9970p;
                long j3 = this.f8220f;
                int i7 = b1.L.f9944c;
                int iO = M.V.o((int) (j3 & 4294967295L), str);
                if (iO != -1) {
                    q(iO, iO);
                }
            }
        }
    }

    public final void j() {
        this.f8219e.f7982a = null;
        C0622g c0622g = this.f8221g;
        if (c0622g.f9970p.length() > 0) {
            int iE = b1.L.e(this.f8220f);
            String str = c0622g.f9970p;
            int iP = M.V.p(str, iE);
            if (iP == b1.L.e(this.f8220f) && iP != str.length()) {
                iP = M.V.p(str, iP + 1);
            }
            q(iP, iP);
        }
    }

    public final void k() {
        this.f8219e.f7982a = null;
        C0622g c0622g = this.f8221g;
        if (c0622g.f9970p.length() > 0) {
            long j3 = this.f8220f;
            int i7 = b1.L.f9944c;
            int iR = M.V.r((int) (j3 & 4294967295L), c0622g.f9970p);
            if (iR != -1) {
                q(iR, iR);
            }
        }
    }

    public final void l() {
        this.f8219e.f7982a = null;
        C0622g c0622g = this.f8221g;
        if (c0622g.f9970p.length() > 0) {
            int iF = b1.L.f(this.f8220f);
            String str = c0622g.f9970p;
            int iQ = M.V.q(str, iF);
            if (iQ == b1.L.f(this.f8220f) && iQ != 0) {
                iQ = M.V.q(str, iQ - 1);
            }
            q(iQ, iQ);
        }
    }

    public final void m() {
        C0622g c0622g = this.f8221g;
        P0 p02 = this.f8219e;
        p02.f7982a = null;
        if (c0622g.f9970p.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            p02.f7982a = null;
            if (c0622g.f9970p.length() > 0) {
                String str = c0622g.f9970p;
                long j3 = this.f8220f;
                int i7 = b1.L.f9944c;
                int iO = M.V.o((int) (j3 & 4294967295L), str);
                if (iO != -1) {
                    q(iO, iO);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.f8219e.f7982a = null;
        if (this.f8221g.f9970p.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.f8219e.f7982a = null;
        if (this.f8221g.f9970p.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.f8221g.f9970p.length() > 0) {
            int i7 = b1.L.f9944c;
            this.f8220f = AbstractC0607C.b((int) (this.f8216b >> 32), (int) (this.f8220f & 4294967295L));
        }
    }

    public final void q(int i7, int i8) {
        this.f8220f = AbstractC0607C.b(i7, i8);
    }

    public final int r() {
        long j3 = this.f8220f;
        int i7 = b1.L.f9944c;
        int i8 = (int) (j3 & 4294967295L);
        this.f8218d.a(i8);
        return i8;
    }
}
