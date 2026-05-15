package h3;

import E4.G;
import E4.I;
import E4.b0;
import N2.B;
import N2.F;
import c3.C0733a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m implements N2.m, B {

    /* JADX INFO: renamed from: A */
    public C0733a f12634A;

    /* JADX INFO: renamed from: a */
    public final k3.k f12635a;

    /* JADX INFO: renamed from: b */
    public final int f12636b;

    /* JADX INFO: renamed from: c */
    public final w2.m f12637c;

    /* JADX INFO: renamed from: d */
    public final w2.m f12638d;

    /* JADX INFO: renamed from: e */
    public final w2.m f12639e;

    /* JADX INFO: renamed from: f */
    public final w2.m f12640f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f12641g;
    public final o h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f12642i;

    /* JADX INFO: renamed from: j */
    public b0 f12643j;

    /* JADX INFO: renamed from: k */
    public int f12644k;
    public int l;

    /* JADX INFO: renamed from: m */
    public long f12645m;

    /* JADX INFO: renamed from: n */
    public int f12646n;

    /* JADX INFO: renamed from: o */
    public w2.m f12647o;

    /* JADX INFO: renamed from: p */
    public int f12648p;

    /* JADX INFO: renamed from: q */
    public int f12649q;

    /* JADX INFO: renamed from: r */
    public int f12650r;

    /* JADX INFO: renamed from: s */
    public int f12651s;

    /* JADX INFO: renamed from: t */
    public boolean f12652t;

    /* JADX INFO: renamed from: u */
    public N2.o f12653u;

    /* JADX INFO: renamed from: v */
    public l[] f12654v;

    /* JADX INFO: renamed from: w */
    public long[][] f12655w;

    /* JADX INFO: renamed from: x */
    public int f12656x;

    /* JADX INFO: renamed from: y */
    public long f12657y;

    /* JADX INFO: renamed from: z */
    public int f12658z;

    public m(k3.k kVar, int i7) {
        this.f12635a = kVar;
        this.f12636b = i7;
        G g6 = I.f1870p;
        this.f12643j = b0.f1913s;
        this.f12644k = (i7 & 4) != 0 ? 3 : 0;
        this.h = new o();
        this.f12642i = new ArrayList();
        this.f12640f = new w2.m(16);
        this.f12641g = new ArrayDeque();
        this.f12637c = new w2.m(x2.g.f19966a);
        this.f12638d = new w2.m(4);
        this.f12639e = new w2.m();
        this.f12648p = -1;
        this.f12653u = N2.o.f5066f;
        this.f12654v = new l[0];
    }

    @Override // N2.m
    public final N2.m b() {
        return this;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        if ((this.f12636b & 16) == 0) {
            oVar = new A0.b(oVar, this.f12635a);
        }
        this.f12653u = oVar;
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        this.f12641g.clear();
        this.f12646n = 0;
        this.f12648p = -1;
        this.f12649q = 0;
        this.f12650r = 0;
        this.f12651s = 0;
        if (j3 == 0) {
            if (this.f12644k != 3) {
                this.f12644k = 0;
                this.f12646n = 0;
                return;
            } else {
                o oVar = this.h;
                oVar.f12663a.clear();
                oVar.f12664b = 0;
                this.f12642i.clear();
                return;
            }
        }
        for (l lVar : this.f12654v) {
            t tVar = lVar.f12630b;
            int iD = w2.t.d(tVar.f12702f, j7, false);
            while (true) {
                if (iD < 0) {
                    iD = -1;
                    break;
                } else if ((tVar.f12703g[iD] & 1) != 0) {
                    break;
                } else {
                    iD--;
                }
            }
            if (iD == -1) {
                iD = tVar.a(j7);
            }
            lVar.f12633e = iD;
            N2.I i7 = lVar.f12632d;
            if (i7 != null) {
                i7.f4980b = false;
                i7.f4981c = 0;
            }
        }
    }

    @Override // N2.m
    public final List f() {
        return this.f12643j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x04af, code lost:
    
        r3 = r10;
        r10 = r4;
        r6 = r42.f12646n;
        r7 = r42.f12640f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x04b9, code lost:
    
        if (r6 != 0) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x04c3, code lost:
    
        if (r43.b(r7.f18867a, 0, 8, r3) != false) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x04c8, code lost:
    
        if (r42.f12658z != 2) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x04cd, code lost:
    
        if ((r42.f12636b & 2) == 0) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x04cf, code lost:
    
        r0 = r42.f12653u.E(0, 4);
        r2 = r42.f12634A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x04d8, code lost:
    
        if (r2 != null) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x04db, code lost:
    
        r15 = new t2.L(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x04e5, code lost:
    
        r2 = new t2.C1486o();
        r2.f16625j = r15;
        r0.e(new t2.C1487p(r2));
        r42.f12653u.k();
        r42.f12653u.H(new N2.r(-9223372036854775807L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x050a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x050b, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x050e, code lost:
    
        r42.f12646n = 8;
        r7.G(0);
        r42.f12645m = r7.w();
        r42.l = r7.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0528, code lost:
    
        r13 = r42.f12645m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x052e, code lost:
    
        if (r13 != 1) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0530, code lost:
    
        r43.readFully(r7.f18867a, 8, 8);
        r42.f12646n += 8;
        r42.f12645m = r7.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0547, code lost:
    
        if (r13 != 0) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0549, code lost:
    
        r13 = r43.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x054f, code lost:
    
        if (r13 != (-1)) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0551, code lost:
    
        r6 = (h3.C0999a) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0557, code lost:
    
        if (r6 == null) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0559, code lost:
    
        r13 = r6.f12561q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x055d, code lost:
    
        if (r13 == (-1)) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x055f, code lost:
    
        r42.f12645m = (r13 - r43.o()) + ((long) r42.f12646n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x056b, code lost:
    
        r4 = r42.f12645m;
        r6 = r42.f12646n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0572, code lost:
    
        if (r4 < r6) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0574, code lost:
    
        r4 = r42.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x057f, code lost:
    
        if (r4 == 1836019574) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0584, code lost:
    
        if (r4 == 1953653099) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0589, code lost:
    
        if (r4 == 1835297121) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x058e, code lost:
    
        if (r4 == 1835626086) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0593, code lost:
    
        if (r4 == 1937007212) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0598, code lost:
    
        if (r4 == 1701082227) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x059a, code lost:
    
        if (r4 != 1835365473) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x05a2, code lost:
    
        if (r4 == 1835296868) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x05a7, code lost:
    
        if (r4 == 1836476516) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x05a9, code lost:
    
        if (r4 == 1751411826) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x05ae, code lost:
    
        if (r4 == 1937011556) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x05b3, code lost:
    
        if (r4 == 1937011827) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x05b8, code lost:
    
        if (r4 == 1937011571) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x05bd, code lost:
    
        if (r4 == 1668576371) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x05c2, code lost:
    
        if (r4 == 1701606260) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x05c7, code lost:
    
        if (r4 == 1937011555) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x05cc, code lost:
    
        if (r4 == 1937011578) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x05d1, code lost:
    
        if (r4 == 1937013298) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x05d6, code lost:
    
        if (r4 == 1937007471) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x05db, code lost:
    
        if (r4 == 1668232756) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x05e0, code lost:
    
        if (r4 == 1953196132) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x05e5, code lost:
    
        if (r4 == 1718909296) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x05ea, code lost:
    
        if (r4 == 1969517665) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x05ef, code lost:
    
        if (r4 == 1801812339) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x05f4, code lost:
    
        if (r4 != 1768715124) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x05f9, code lost:
    
        r3 = r43.o();
        r5 = r42.f12646n;
        r34 = r3 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0607, code lost:
    
        if (r42.l != 1836086884) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0609, code lost:
    
        r42.f12634A = new c3.C0733a(0, r34, -9223372036854775807L, r34 + r5, r42.f12645m - r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x061f, code lost:
    
        r42.f12647o = null;
        r42.f12644k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x0624, code lost:
    
        r14 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0629, code lost:
    
        if (r6 != 8) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x062b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x062d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x062e, code lost:
    
        w2.AbstractC1697a.i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0638, code lost:
    
        if (r42.f12645m > 2147483647L) goto L723;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x063a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x063c, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x063d, code lost:
    
        w2.AbstractC1697a.i(r3);
        r3 = new w2.m((int) r42.f12645m);
        java.lang.System.arraycopy(r7.f18867a, 0, r3.f18867a, 0, 8);
        r42.f12647o = r3;
        r42.f12644k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0657, code lost:
    
        r6 = r43.o();
        r13 = r42.f12645m;
        r4 = r42.f12646n;
        r6 = (r6 + r13) - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x0664, code lost:
    
        if (r13 == r4) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0668, code lost:
    
        if (r42.l != 1835365473) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x066a, code lost:
    
        r14.D(8);
        r43.l(r14.f18867a, 0, 8);
        r4 = h3.f.f12575a;
        r4 = r14.f18868b;
        r14 = 4;
        r14.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0683, code lost:
    
        if (r14.g() == 1751411826) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x0685, code lost:
    
        r4 = r4 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x0686, code lost:
    
        r14.G(r4);
        r43.g(r14.f18868b);
        r43.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x0692, code lost:
    
        r14 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x0695, code lost:
    
        r12.push(new h3.C0999a(r6, r42.l));
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x06a6, code lost:
    
        if (r42.f12645m != r42.f12646n) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x06a8, code lost:
    
        n(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x06ac, code lost:
    
        r42.f12644k = 0;
        r42.f12646n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x06bb, code lost:
    
        throw t2.N.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0088  */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r43, N2.q r44) throws t2.N {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.m.g(N2.n, N2.q):int");
    }

    @Override // N2.B
    public final boolean h() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00e0 A[EDGE_INSN: B:159:0x00e0->B:151:0x00e0 BREAK  A[LOOP:1: B:116:0x0077->B:150:0x00db], SYNTHETIC] */
    @Override // N2.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final N2.A j(long r20) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.m.j(long):N2.A");
    }

    @Override // N2.B
    public final long l() {
        return this.f12657y;
    }

    @Override // N2.m
    public final boolean m(N2.n nVar) {
        b0 b0VarT;
        F fH = p.h(nVar, false, (this.f12636b & 2) != 0);
        if (fH != null) {
            b0VarT = I.t(fH);
        } else {
            G g6 = I.f1870p;
            b0VarT = b0.f1913s;
        }
        this.f12643j = b0VarT;
        return fH == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:466:0x009e, code lost:
    
        r7.G(r8);
        r8 = r8 + r9;
        r7.H(r4);
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x00aa, code lost:
    
        r10 = r7.f18868b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x00ac, code lost:
    
        if (r10 >= r8) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x00ae, code lost:
    
        r10 = r7.g() + r10;
        r11 = r7.g();
        r4 = (r11 >> 24) & 255;
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x00c4, code lost:
    
        if (r4 == 169) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x00c8, code lost:
    
        if (r4 != 253) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x00ca, code lost:
    
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x00d1, code lost:
    
        if (r11 != 1735291493) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x00d3, code lost:
    
        r4 = b3.AbstractC0694j.a(h3.p.c(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x00dd, code lost:
    
        if (r4 == null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x00df, code lost:
    
        r11 = new b3.C0698n("TCON", null, E4.I.t(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x00ea, code lost:
    
        w2.AbstractC1697a.w("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x00ef, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x00f0, code lost:
    
        r7.G(r10);
        r23 = r8;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x00fb, code lost:
    
        if (r11 != 1684632427) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x00fd, code lost:
    
        r12 = h3.p.b(r11, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0103, code lost:
    
        r7.G(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0106, code lost:
    
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x010a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0110, code lost:
    
        if (r11 != 1953655662) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0112, code lost:
    
        r12 = h3.p.b(r11, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x011c, code lost:
    
        if (r11 != 1953329263) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x011e, code lost:
    
        r4 = h3.p.d(r11, "TBPM", r7, r32, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0127, code lost:
    
        r7.G(r10);
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x012f, code lost:
    
        if (r11 != 1668311404) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0131, code lost:
    
        r12 = h3.p.d(r11, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x013c, code lost:
    
        if (r11 != 1668249202) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x013e, code lost:
    
        r4 = r7.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0149, code lost:
    
        if (r7.g() != 1684108385) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x014b, code lost:
    
        r6 = r7.g() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0153, code lost:
    
        if (r6 != 13) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0155, code lost:
    
        r12 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x015a, code lost:
    
        if (r6 != 14) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x015c, code lost:
    
        r12 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x015f, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0160, code lost:
    
        if (r12 != null) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0162, code lost:
    
        n1.c.x(r6, "Unrecognized cover art flags: ");
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x016a, code lost:
    
        r7.H(r30);
        r4 = r4 - 16;
        r6 = new byte[r4];
        r7.e(r6, 0, r4);
        r12 = new b3.C0685a(r12, null, 3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0180, code lost:
    
        w2.AbstractC1697a.w("Failed to parse cover art attribute");
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x018d, code lost:
    
        if (r11 != 1631670868) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x018f, code lost:
    
        r12 = h3.p.g(r11, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x019a, code lost:
    
        if (r11 != 1936682605) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x019c, code lost:
    
        r12 = h3.p.g(r11, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x01a7, code lost:
    
        if (r11 != 1936679276) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x01a9, code lost:
    
        r12 = h3.p.g(r11, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x01b4, code lost:
    
        if (r11 != 1936679282) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x01b6, code lost:
    
        r12 = h3.p.g(r11, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x01c1, code lost:
    
        if (r11 != 1936679265) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x01c3, code lost:
    
        r12 = h3.p.g(r11, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x01ce, code lost:
    
        if (r11 != 1936679791) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x01d0, code lost:
    
        r12 = h3.p.g(r11, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x01db, code lost:
    
        if (r11 != 1920233063) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x01dd, code lost:
    
        r4 = h3.p.d(r11, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x01e9, code lost:
    
        if (r11 != 1885823344) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x01eb, code lost:
    
        r4 = h3.p.d(r11, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x01f8, code lost:
    
        if (r11 != 1936683886) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x01fa, code lost:
    
        r12 = h3.p.g(r11, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0205, code lost:
    
        if (r11 != 1953919848) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0207, code lost:
    
        r12 = h3.p.g(r11, "TVSHOW", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0212, code lost:
    
        if (r11 != 757935405) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0214, code lost:
    
        r4 = null;
        r12 = null;
        r6 = -1;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0218, code lost:
    
        r13 = r7.f18868b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x021a, code lost:
    
        if (r13 >= r10) goto L842;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x021c, code lost:
    
        r22 = r7.g();
        r23 = r8;
        r8 = r7.g();
        r25 = r11;
        r7.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x022f, code lost:
    
        if (r8 != 1835360622) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0231, code lost:
    
        r12 = r7.q(r22 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0238, code lost:
    
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x023e, code lost:
    
        if (r8 != 1851878757) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0240, code lost:
    
        r4 = r7.q(r22 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x024a, code lost:
    
        if (r8 != 1684108385) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x024c, code lost:
    
        r6 = r13;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0250, code lost:
    
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0252, code lost:
    
        r7.H(r22 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0257, code lost:
    
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x025a, code lost:
    
        r23 = r8;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x025e, code lost:
    
        if (r12 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0260, code lost:
    
        if (r4 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0263, code lost:
    
        if (r6 != (-1)) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0266, code lost:
    
        r7.G(r6);
        r7.H(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0279, code lost:
    
        r12 = new b3.C0695k(r12, r4, r7.q(r25 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x027b, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x027c, code lost:
    
        r7.G(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0281, code lost:
    
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0285, code lost:
    
        r4 = r11 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x028a, code lost:
    
        if (r4 != 6516084) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x028c, code lost:
    
        r4 = r7.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0297, code lost:
    
        if (r7.g() != 1684108385) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0299, code lost:
    
        r7.H(8);
        r4 = r7.q(r4 - 16);
        r12 = new b3.C0689e("und", r4, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x02ae, code lost:
    
        w2.AbstractC1697a.w("Failed to parse comment attribute: " + h3.AbstractC1001c.b(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x02c7, code lost:
    
        if (r4 == 7233901) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x02cc, code lost:
    
        if (r4 != 7631467) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x02d3, code lost:
    
        if (r4 == 6516589) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x02d8, code lost:
    
        if (r4 != 7828084) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x02df, code lost:
    
        if (r4 != 6578553) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x02e1, code lost:
    
        r12 = h3.p.g(r11, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x02eb, code lost:
    
        if (r4 != 4280916) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x02ed, code lost:
    
        r12 = h3.p.g(r11, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x02f7, code lost:
    
        if (r4 != 7630703) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x02f9, code lost:
    
        r12 = h3.p.g(r11, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0304, code lost:
    
        if (r4 != 6384738) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0306, code lost:
    
        r12 = h3.p.g(r11, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0311, code lost:
    
        if (r4 != 7108978) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0313, code lost:
    
        r12 = h3.p.g(r11, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x031e, code lost:
    
        if (r4 != 6776174) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0320, code lost:
    
        r12 = h3.p.g(r11, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0329, code lost:
    
        if (r4 != 6779504) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x032b, code lost:
    
        r12 = h3.p.g(r11, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0333, code lost:
    
        w2.AbstractC1697a.l("Skipped unknown metadata entry: " + h3.AbstractC1001c.b(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0346, code lost:
    
        r7.G(r10);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x034b, code lost:
    
        r12 = h3.p.g(r11, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0353, code lost:
    
        r12 = h3.p.g(r11, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x035b, code lost:
    
        if (r12 == null) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x035d, code lost:
    
        r9.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0360, code lost:
    
        r8 = r23;
        r13 = 1;
        r28 = 16;
        r30 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x036e, code lost:
    
        r7.G(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0371, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0376, code lost:
    
        if (r9.isEmpty() == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x037a, code lost:
    
        r12 = new t2.L(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x03c1, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:655:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x076a A[LOOP:13: B:795:0x0767->B:797:0x076a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:801:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x0743 A[EDGE_INSN: B:858:0x0743->B:794:0x0743 BREAK  A[LOOP:10: B:723:0x05fd->B:793:0x0737], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(long r36) {
        /*
            Method dump skipped, instruction units count: 2060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.m.n(long):void");
    }

    @Override // N2.m
    public final void a() {
    }
}
