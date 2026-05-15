package J0;

import E0.K;
import Q0.AbstractC0347f;
import m5.AbstractC1210l;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public g f3595a;

    /* JADX INFO: renamed from: b */
    public g f3596b;

    /* JADX INFO: renamed from: c */
    public AbstractC1210l f3597c = new K(2, this);

    /* JADX INFO: renamed from: d */
    public InterfaceC1765B f3598d;

    /* JADX WARN: Code restructure failed: missing block: B:72:0x005c, code lost:
    
        if (r14 == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0081, code lost:
    
        if (r14 == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r10, long r12, e5.AbstractC0865c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof J0.b
            if (r0 == 0) goto L14
            r0 = r14
            J0.b r0 = (J0.b) r0
            int r1 = r0.f3591q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3591q = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            J0.b r0 = new J0.b
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f3589o
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f3591q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            android.support.v4.media.session.b.K(r14)
            goto L84
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            android.support.v4.media.session.b.K(r14)
            goto L5f
        L38:
            android.support.v4.media.session.b.K(r14)
            J0.g r14 = r9.f3595a
            r1 = 0
            if (r14 == 0) goto L4b
            boolean r4 = r14.f15636B
            if (r4 == 0) goto L4b
            Q0.F0 r14 = Q0.AbstractC0347f.j(r14)
            J0.g r14 = (J0.g) r14
            goto L4c
        L4b:
            r14 = r1
        L4c:
            r4 = 0
            if (r14 != 0) goto L64
            J0.g r1 = r9.f3596b
            if (r1 == 0) goto L8a
            r6.f3591q = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.x(r2, r4, r6)
            if (r14 != r0) goto L5f
            goto L83
        L5f:
            n1.r r14 = (n1.r) r14
            long r4 = r14.f14529a
            goto L8a
        L64:
            r7 = r10
            r10 = r2
            r2 = r7
            r7 = r4
            r4 = r12
            r11 = r7
            J0.g r13 = r9.f3595a
            if (r13 == 0) goto L79
            boolean r14 = r13.f15636B
            if (r14 == 0) goto L79
            Q0.F0 r13 = Q0.AbstractC0347f.j(r13)
            r1 = r13
            J0.g r1 = (J0.g) r1
        L79:
            if (r1 == 0) goto L89
            r6.f3591q = r10
            java.lang.Object r14 = r1.x(r2, r4, r6)
            if (r14 != r0) goto L84
        L83:
            return r0
        L84:
            n1.r r14 = (n1.r) r14
            long r4 = r14.f14529a
            goto L8a
        L89:
            r4 = r11
        L8a:
            n1.r r10 = new n1.r
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.d.a(long, long, e5.c):java.lang.Object");
    }

    public final long b(int i7, long j3, long j7) {
        g gVar = this.f3595a;
        g gVar2 = null;
        if (gVar != null && gVar.f15636B) {
            gVar2 = (g) AbstractC0347f.j(gVar);
        }
        g gVar3 = gVar2;
        if (gVar3 != null) {
            return gVar3.I(i7, j3, j7);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r6, e5.AbstractC0865c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof J0.c
            if (r0 == 0) goto L13
            r0 = r8
            J0.c r0 = (J0.c) r0
            int r1 = r0.f3594q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3594q = r1
            goto L18
        L13:
            J0.c r0 = new J0.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f3592o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f3594q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            android.support.v4.media.session.b.K(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            android.support.v4.media.session.b.K(r8)
            J0.g r8 = r5.f3595a
            r2 = 0
            if (r8 == 0) goto L42
            boolean r4 = r8.f15636B
            if (r4 == 0) goto L42
            Q0.F0 r8 = Q0.AbstractC0347f.j(r8)
            r2 = r8
            J0.g r2 = (J0.g) r2
        L42:
            if (r2 == 0) goto L52
            r0.f3594q = r3
            java.lang.Object r8 = r2.m0(r6, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            n1.r r8 = (n1.r) r8
            long r6 = r8.f14529a
            goto L54
        L52:
            r6 = 0
        L54:
            n1.r r8 = new n1.r
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.d.c(long, e5.c):java.lang.Object");
    }

    public final long d(long j3, int i7) {
        g gVar = this.f3595a;
        g gVar2 = null;
        if (gVar != null && gVar.f15636B) {
            gVar2 = (g) AbstractC0347f.j(gVar);
        }
        if (gVar2 != null) {
            return gVar2.m(j3, i7);
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l5.a, m5.l] */
    public final InterfaceC1765B e() {
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f3597c.a();
        if (interfaceC1765B != null) {
            return interfaceC1765B;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
