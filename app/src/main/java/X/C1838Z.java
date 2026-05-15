package x;

import K0.C0245m;
import K0.EnumC0246n;
import r0.AbstractC1397o;
import w5.AbstractC1767D;

/* JADX INFO: renamed from: x.Z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1838Z extends AbstractC1397o implements Q0.x0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public B.k f19702C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public B.h f19703D;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B0(x.C1838Z r4, e5.AbstractC0865c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof x.C1834V
            if (r0 == 0) goto L16
            r0 = r5
            x.V r0 = (x.C1834V) r0
            int r1 = r0.f19694r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19694r = r1
            goto L1b
        L16:
            x.V r0 = new x.V
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f19692p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f19694r
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            B.h r0 = r0.f19691o
            android.support.v4.media.session.b.K(r5)
            goto L4e
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            android.support.v4.media.session.b.K(r5)
            B.h r5 = r4.f19703D
            if (r5 != 0) goto L50
            B.h r5 = new B.h
            r5.<init>()
            B.k r2 = r4.f19702C
            r0.f19691o = r5
            r0.f19694r = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            r4.f19703D = r0
        L50:
            Y4.o r4 = Y4.o.f8736a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1838Z.B0(x.Z, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C0(x.C1838Z r4, e5.AbstractC0865c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof x.C1835W
            if (r0 == 0) goto L16
            r0 = r5
            x.W r0 = (x.C1835W) r0
            int r1 = r0.f19697q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19697q = r1
            goto L1b
        L16:
            x.W r0 = new x.W
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f19695o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f19697q
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            android.support.v4.media.session.b.K(r5)
            goto L49
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            android.support.v4.media.session.b.K(r5)
            B.h r5 = r4.f19703D
            if (r5 == 0) goto L4c
            B.i r2 = new B.i
            r2.<init>(r5)
            B.k r5 = r4.f19702C
            r0.f19697q = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r5 = 0
            r4.f19703D = r5
        L4c:
            Y4.o r4 = Y4.o.f8736a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1838Z.C0(x.Z, e5.c):java.lang.Object");
    }

    public final void D0() {
        B.h hVar = this.f19703D;
        if (hVar != null) {
            this.f19702C.b(new B.i(hVar));
            this.f19703D = null;
        }
    }

    @Override // Q0.x0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // Q0.x0
    public final void X() {
        Z();
    }

    @Override // Q0.x0
    public final void Z() {
        D0();
    }

    @Override // Q0.x0
    public final /* synthetic */ void g0() {
    }

    @Override // Q0.x0
    public final long q() {
        return Q0.D0.f5781a;
    }

    @Override // r0.AbstractC1397o
    public final void s0() {
        Z();
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        D0();
    }

    @Override // Q0.x0
    public final void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        if (enumC0246n == EnumC0246n.f3902p) {
            int i7 = c0245m.f3900e;
            if (i7 == 4) {
                AbstractC1767D.t(n0(), null, new C1836X(this, null), 3);
            } else if (i7 == 5) {
                AbstractC1767D.t(n0(), null, new C1837Y(this, null), 3);
            }
        }
    }
}
