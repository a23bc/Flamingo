package A;

import java.util.concurrent.CancellationException;
import w.C1678k;
import z.K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f42a = 400;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(z.K0 r10, float r11, w.C1680m r12, w.C1689w r13, A.d r14, e5.AbstractC0865c r15) {
        /*
            boolean r0 = r15 instanceof A.j
            if (r0 == 0) goto L13
            r0 = r15
            A.j r0 = (A.j) r0
            int r1 = r0.f35s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35s = r1
            goto L18
        L13:
            A.j r0 = new A.j
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f34r
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f35s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r11 = r0.f31o
            m5.s r10 = r0.f33q
            w.m r12 = r0.f32p
            android.support.v4.media.session.b.K(r15)
            goto L6a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            android.support.v4.media.session.b.K(r15)
            m5.s r6 = new m5.s
            r6.<init>()
            java.lang.Object r15 = r12.b()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4e
            r15 = r3
            goto L4f
        L4e:
            r15 = 0
        L4f:
            r15 = r15 ^ r3
            A.i r4 = new A.i
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f32p = r12
            r0.f33q = r6
            r0.f31o = r5
            r0.f35s = r3
            java.lang.Object r10 = w.AbstractC1671d.e(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            r11 = r5
            r10 = r6
        L6a:
            A.a r13 = new A.a
            float r10 = r10.f14436o
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: A.l.a(z.K0, float, w.m, w.w, A.d, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(z.K0 r16, float r17, float r18, w.C1680m r19, w.S r20, l5.InterfaceC1182c r21, e5.AbstractC0865c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof A.k
            if (r2 == 0) goto L18
            r2 = r1
            A.k r2 = (A.k) r2
            int r3 = r2.f41t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f41t = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            A.k r2 = new A.k
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f40s
            d5.a r2 = d5.EnumC0830a.f11264o
            int r3 = r8.f41t
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L40
            if (r3 != r4) goto L38
            float r0 = r8.f37p
            float r2 = r8.f36o
            m5.s r3 = r8.f39r
            w.m r4 = r8.f38q
            android.support.v4.media.session.b.K(r1)
            r1 = r0
            r0 = r2
            goto L91
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            android.support.v4.media.session.b.K(r1)
            m5.s r12 = new m5.s
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L67
            r5 = r4
            goto L68
        L67:
            r5 = 0
        L68:
            r6 = r5 ^ 1
            A.i r10 = new A.i
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.f38q = r3
            r8.f39r = r12
            r8.f36o = r0
            r8.f37p = r1
            r8.f41t = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = w.AbstractC1671d.f(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8e
            return r2
        L8e:
            r4 = r19
            r3 = r12
        L91:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            A.a r2 = new A.a
            float r3 = r3.f14436o
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            w.m r0 = w.AbstractC1671d.h(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A.l.b(z.K0, float, float, w.m, w.S, l5.c, e5.c):java.lang.Object");
    }

    public static final void c(C1678k c1678k, K0 k02, d dVar, float f7) {
        float fA;
        try {
            fA = k02.a(f7);
        } catch (CancellationException unused) {
            c1678k.a();
            fA = 0.0f;
        }
        dVar.b(Float.valueOf(fA));
        if (Math.abs(f7 - fA) > 0.5f) {
            c1678k.a();
        }
    }

    public static final float d(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        return (f8 <= 0.0f ? f7 >= f8 : f7 <= f8) ? f7 : f8;
    }
}
