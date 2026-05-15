package I;

import z.S;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.h f3323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0211c f3324b;

    public Q(A.h hVar, C0211c c0211c) {
        this.f3323a = hVar;
        this.f3324b = c0211c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(z.K0 r7, float r8, c5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof I.P
            if (r0 == 0) goto L13
            r0 = r9
            I.P r0 = (I.P) r0
            int r1 = r0.f3322q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3322q = r1
            goto L1a
        L13:
            I.P r0 = new I.P
            e5.c r9 = (e5.AbstractC0865c) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f3320o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f3322q
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            android.support.v4.media.session.b.K(r9)
            goto L46
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            android.support.v4.media.session.b.K(r9)
            D.J r9 = new D.J
            r2 = 9
            r9.<init>(r6, r2, r7)
            r0.f3322q = r3
            A.h r2 = r6.f3323a
            java.lang.Object r9 = r2.d(r7, r8, r9, r0)
            if (r9 != r1) goto L46
            return r1
        L46:
            java.lang.Number r9 = (java.lang.Number) r9
            float r7 = r9.floatValue()
            I.c r8 = r6.f3324b
            H2.m r9 = r8.f3294d
            java.lang.Object r9 = r9.f3207e
            f0.f0 r9 = (f0.C0886f0) r9
            float r9 = r9.h()
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            H2.m r1 = r8.f3294d
            if (r9 != 0) goto L60
            goto L9b
        L60:
            java.lang.Object r9 = r1.f3207e
            f0.f0 r9 = (f0.C0886f0) r9
            float r9 = r9.h()
            float r9 = java.lang.Math.abs(r9)
            double r2 = (double) r9
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L9b
            int r9 = r8.k()
            z.o r1 = r8.f3300k
            boolean r1 = r1.b()
            if (r1 == 0) goto L96
            f0.j0 r1 = r8.f3304p
            java.lang.Object r1 = r1.getValue()
            I.z r1 = (I.z) r1
            w5.B r1 = r1.f3424s
            I.H r2 = new I.H
            r3 = 0
            r2.<init>(r8, r3)
            r4 = 3
            w5.AbstractC1767D.t(r1, r3, r2, r4)
        L96:
            r1 = 0
            r8.u(r0, r9, r1)
            goto La8
        L9b:
            java.lang.Object r8 = r1.f3207e
            f0.f0 r8 = (f0.C0886f0) r8
            float r8 = r8.h()
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
        La8:
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I.Q.a(z.K0, float, c5.d):java.lang.Object");
    }
}
