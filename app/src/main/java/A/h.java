package A;

import V.o;
import e5.AbstractC0865c;
import m5.AbstractC1209k;
import w.C1689w;
import z.K0;
import z.S;
import z.r1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements S {

    /* JADX INFO: renamed from: a */
    public final o f23a;

    /* JADX INFO: renamed from: b */
    public final C1689w f24b;

    /* JADX INFO: renamed from: c */
    public final w.S f25c;

    public h(o oVar, C1689w c1689w, w.S s7) {
        this.f23a = oVar;
        this.f24b = c1689w;
        this.f25c = s7;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(A.h r14, z.K0 r15, float r16, float r17, A.d r18, e5.AbstractC0865c r19) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.b(A.h, z.K0, float, float, A.d, e5.c):java.lang.Object");
    }

    @Override // z.S
    public final Object a(K0 k02, float f7, c5.d dVar) {
        return d(k02, f7, r1.f20949a, (AbstractC0865c) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(z.K0 r11, float r12, l5.InterfaceC1182c r13, e5.AbstractC0865c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof A.c
            if (r0 == 0) goto L13
            r0 = r14
            A.c r0 = (A.c) r0
            int r1 = r0.f7r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7r = r1
            goto L18
        L13:
            A.c r0 = new A.c
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f5p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f7r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            l5.c r13 = r0.f4o
            android.support.v4.media.session.b.K(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            android.support.v4.media.session.b.K(r14)
            z.s0 r14 = androidx.compose.foundation.gestures.a.f9178c
            A.e r4 = new A.e
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f4o = r7
            r0.f7r = r3
            java.lang.Object r14 = w5.AbstractC1767D.C(r14, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r13 = r7
        L4c:
            A.a r14 = (A.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.b(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.c(z.K0, float, l5.c, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(z.K0 r5, float r6, l5.InterfaceC1182c r7, e5.AbstractC0865c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof A.f
            if (r0 == 0) goto L13
            r0 = r8
            A.f r0 = (A.f) r0
            int r1 = r0.f19q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19q = r1
            goto L18
        L13:
            A.f r0 = new A.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f17o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f19q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            android.support.v4.media.session.b.K(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            android.support.v4.media.session.b.K(r8)
            r0.f19q = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            A.a r8 = (A.a) r8
            java.lang.Float r5 = r8.f0a
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L49
            goto L55
        L49:
            w.m r5 = r8.f1b
            java.lang.Object r5 = r5.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.d(z.K0, float, l5.c, e5.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f25c.equals(this.f25c) && AbstractC1209k.a(hVar.f24b, this.f24b) && hVar.f23a.equals(this.f23a);
    }

    public final int hashCode() {
        return this.f23a.hashCode() + ((this.f24b.hashCode() + (this.f25c.hashCode() * 31)) * 31);
    }
}
