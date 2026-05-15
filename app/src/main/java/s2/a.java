package S2;

import N2.C0287d;
import N2.C0288e;
import N2.C0293j;
import N2.InterfaceC0289f;
import N2.InterfaceC0291h;
import N2.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0287d f6723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0291h f6724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0288e f6725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6726d;

    public a(InterfaceC0289f interfaceC0289f, InterfaceC0291h interfaceC0291h, long j3, long j7, long j8, long j9, long j10, int i7) {
        this.f6724b = interfaceC0291h;
        this.f6726d = i7;
        this.f6723a = new C0287d(interfaceC0289f, j3, j7, j8, j9, j10);
    }

    public static int a(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static int c(C0293j c0293j, long j3, q qVar) {
        if (j3 == c0293j.f5054r) {
            return 0;
        }
        qVar.f5067a = j3;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(N2.C0293j r28, N2.q r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            N2.e r3 = r0.f6725c
            w2.AbstractC1697a.j(r3)
            long r4 = r3.f5039f
            long r6 = r3.f5040g
            long r8 = r3.h
            long r6 = r6 - r4
            int r10 = r0.f6726d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            N2.h r10 = r0.f6724b
            if (r6 > 0) goto L26
            r0.f6725c = r7
            r10.m()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.f5054r
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc2
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc2
            int r4 = (int) r4
            r1.g(r4)
            r4 = 0
            r1.f5056t = r4
            long r4 = r3.f5035b
            N2.g r4 = r10.a(r1, r4)
            r5 = -3
            int r6 = r4.f5042a
            if (r6 == r5) goto Lb8
            r5 = -2
            long r8 = r4.f5043b
            r15 = r11
            long r11 = r4.f5044c
            if (r6 == r5) goto L97
            r4 = -1
            if (r6 == r4) goto L78
            if (r6 != 0) goto L70
            long r3 = r1.f5054r
            long r3 = r11 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L66
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L66
            int r3 = (int) r3
            r1.g(r3)
        L66:
            r0.f6725c = r7
            r10.m()
            int r1 = c(r1, r11, r2)
            return r1
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L78:
            r3.f5038e = r8
            r3.f5040g = r11
            long r4 = r3.f5037d
            long r6 = r3.f5039f
            long r13 = r3.f5036c
            r17 = r4
            long r4 = r3.f5035b
            r15 = r4
            r21 = r6
            r19 = r8
            r23 = r11
            r25 = r13
            long r4 = N2.C0288e.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        L97:
            r4 = r8
            r6 = r11
            r3.f5037d = r4
            r3.f5039f = r6
            long r8 = r3.f5038e
            long r10 = r3.f5040g
            long r12 = r3.f5036c
            long r14 = r3.f5035b
            r17 = r4
            r21 = r6
            r19 = r8
            r23 = r10
            r25 = r12
            r15 = r14
            long r4 = N2.C0288e.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        Lb8:
            r0.f6725c = r7
            r10.m()
            int r1 = c(r1, r8, r2)
            return r1
        Lc2:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.a.b(N2.j, N2.q):int");
    }

    public final void d(long j3) {
        C0288e c0288e = this.f6725c;
        if (c0288e == null || c0288e.f5034a != j3) {
            C0287d c0287d = this.f6723a;
            this.f6725c = new C0288e(j3, c0287d.f5028a.p(j3), c0287d.f5030c, c0287d.f5031d, c0287d.f5032e, c0287d.f5033f);
        }
    }
}
