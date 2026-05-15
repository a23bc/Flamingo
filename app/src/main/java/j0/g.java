package J0;

import E0.K;
import Q0.AbstractC0347f;
import Q0.F0;
import m5.C1220v;
import r0.AbstractC1397o;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1397o implements F0, a {

    /* JADX INFO: renamed from: C */
    public a f3608C;

    /* JADX INFO: renamed from: D */
    public d f3609D;

    /* JADX INFO: renamed from: E */
    public g f3610E;

    /* JADX INFO: renamed from: F */
    public final String f3611F;

    public g(a aVar, d dVar) {
        this.f3608C = aVar;
        this.f3609D = dVar == null ? new d() : dVar;
        this.f3611F = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final InterfaceC1765B B0() {
        g gVar = this.f15636B ? (g) AbstractC0347f.j(this) : null;
        InterfaceC1765B interfaceC1765BB0 = gVar != null ? gVar.B0() : null;
        if (interfaceC1765BB0 != null && AbstractC1767D.s(interfaceC1765BB0)) {
            return interfaceC1765BB0;
        }
        InterfaceC1765B interfaceC1765B = this.f3609D.f3598d;
        if (interfaceC1765B != null) {
            return interfaceC1765B;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // J0.a
    public final long I(int i7, long j3, long j7) {
        long jI = this.f3608C.I(i7, j3, j7);
        boolean z6 = this.f15636B;
        g gVar = null;
        if (z6 && z6) {
            gVar = (g) AbstractC0347f.j(this);
        }
        g gVar2 = gVar;
        return C1892b.h(jI, gVar2 != null ? gVar2.I(i7, C1892b.h(j3, jI), C1892b.g(j7, jI)) : 0L);
    }

    @Override // J0.a
    public final long m(long j3, int i7) {
        boolean z6 = this.f15636B;
        g gVar = null;
        if (z6 && z6) {
            gVar = (g) AbstractC0347f.j(this);
        }
        long jM = gVar != null ? gVar.m(j3, i7) : 0L;
        return C1892b.h(jM, this.f3608C.m(C1892b.g(j3, jM), i7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0057, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0073, code lost:
    
        if (r11 != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    @Override // J0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m0(long r9, c5.d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof J0.f
            if (r0 == 0) goto L13
            r0 = r11
            J0.f r0 = (J0.f) r0
            int r1 = r0.f3607r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3607r = r1
            goto L1a
        L13:
            J0.f r0 = new J0.f
            e5.c r11 = (e5.AbstractC0865c) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.f3605p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f3607r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f3604o
            android.support.v4.media.session.b.K(r11)
            goto L76
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f3604o
            android.support.v4.media.session.b.K(r11)
            goto L5a
        L3c:
            android.support.v4.media.session.b.K(r11)
            boolean r11 = r8.f15636B
            r2 = 0
            if (r11 == 0) goto L4d
            if (r11 == 0) goto L4d
            Q0.F0 r11 = Q0.AbstractC0347f.j(r8)
            r2 = r11
            J0.g r2 = (J0.g) r2
        L4d:
            if (r2 == 0) goto L62
            r0.f3604o = r9
            r0.f3607r = r4
            java.lang.Object r11 = r2.m0(r9, r0)
            if (r11 != r1) goto L5a
            goto L75
        L5a:
            n1.r r11 = (n1.r) r11
            long r4 = r11.f14529a
        L5e:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L65
        L62:
            r4 = 0
            goto L5e
        L65:
            J0.a r11 = r8.f3608C
            long r4 = n1.r.d(r4, r9)
            r0.f3604o = r9
            r0.f3607r = r3
            java.lang.Object r11 = r11.m0(r4, r0)
            if (r11 != r1) goto L76
        L75:
            return r1
        L76:
            n1.r r11 = (n1.r) r11
            long r0 = r11.f14529a
            long r9 = n1.r.e(r9, r0)
            n1.r r11 = new n1.r
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.g.m0(long, c5.d):java.lang.Object");
    }

    @Override // Q0.F0
    public final Object o() {
        return this.f3611F;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        d dVar = this.f3609D;
        dVar.f3595a = this;
        dVar.f3596b = null;
        this.f3610E = null;
        dVar.f3597c = new K(3, this);
        dVar.f3598d = n0();
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        C1220v c1220v = new C1220v();
        AbstractC0347f.B(this, new h(c1220v, 0));
        g gVar = (g) ((F0) c1220v.f14439o);
        this.f3610E = gVar;
        d dVar = this.f3609D;
        dVar.f3596b = gVar;
        if (dVar.f3595a == this) {
            dVar.f3595a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0014  */
    @Override // J0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(long r11, long r13, c5.d r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof J0.e
            if (r0 == 0) goto L14
            r0 = r15
            J0.e r0 = (J0.e) r0
            int r1 = r0.f3603s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3603s = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            J0.e r0 = new J0.e
            e5.c r15 = (e5.AbstractC0865c) r15
            r0.<init>(r10, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r6.f3601q
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f3603s
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            long r11 = r6.f3599o
            android.support.v4.media.session.b.K(r15)
            goto L83
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            long r13 = r6.f3600p
            long r11 = r6.f3599o
            android.support.v4.media.session.b.K(r15)
            goto L56
        L40:
            android.support.v4.media.session.b.K(r15)
            J0.a r1 = r10.f3608C
            r6.f3599o = r11
            r6.f3600p = r13
            r6.f3603s = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.x(r2, r4, r6)
            if (r15 != r0) goto L54
            goto L81
        L54:
            r11 = r2
            r13 = r4
        L56:
            n1.r r15 = (n1.r) r15
            long r8 = r15.f14529a
            boolean r15 = r10.f15636B
            if (r15 == 0) goto L6b
            r1 = 0
            if (r15 == 0) goto L6d
            if (r15 == 0) goto L6d
            Q0.F0 r15 = Q0.AbstractC0347f.j(r10)
            r1 = r15
            J0.g r1 = (J0.g) r1
            goto L6d
        L6b:
            J0.g r1 = r10.f3610E
        L6d:
            if (r1 == 0) goto L89
            long r2 = n1.r.e(r11, r8)
            long r4 = n1.r.d(r13, r8)
            r6.f3599o = r8
            r6.f3603s = r7
            java.lang.Object r15 = r1.x(r2, r4, r6)
            if (r15 != r0) goto L82
        L81:
            return r0
        L82:
            r11 = r8
        L83:
            n1.r r15 = (n1.r) r15
            long r13 = r15.f14529a
            r8 = r11
            goto L8b
        L89:
            r13 = 0
        L8b:
            long r11 = n1.r.e(r8, r13)
            n1.r r13 = new n1.r
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.g.x(long, long, c5.d):java.lang.Object");
    }
}
