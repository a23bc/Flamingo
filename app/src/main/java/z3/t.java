package z3;

import e5.AbstractC0871i;
import z5.InterfaceC2110e;

/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC2110e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f21191o = 1;

    /* JADX INFO: renamed from: p */
    public final Object f21192p;

    public t(z5.u uVar) {
        this.f21192p = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0018  */
    /* JADX WARN: Type inference failed for: r7v7, types: [e5.i, l5.e] */
    @Override // z5.InterfaceC2110e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(z5.InterfaceC2111f r7, c5.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f21191o
            switch(r0) {
                case 0: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof z5.C2106a
            if (r0 == 0) goto L18
            r0 = r8
            z5.a r0 = (z5.C2106a) r0
            int r1 = r0.f21274r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f21274r = r1
            goto L1d
        L18:
            z5.a r0 = new z5.a
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f21272p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f21274r
            Y4.o r3 = Y4.o.f8736a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            A5.v r7 = r0.f21271o
            android.support.v4.media.session.b.K(r8)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L65
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            android.support.v4.media.session.b.K(r8)
            A5.v r8 = new A5.v
            c5.i r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f21271o = r8     // Catch: java.lang.Throwable -> L63
            r0.f21274r = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r6.f21192p     // Catch: java.lang.Throwable -> L63
            e5.i r7 = (e5.AbstractC0871i) r7     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 != r1) goto L55
            goto L56
        L55:
            r7 = r3
        L56:
            if (r7 != r1) goto L59
            goto L5e
        L59:
            r7 = r8
        L5a:
            r7.releaseIntercepted()
            r1 = r3
        L5e:
            return r1
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L65
        L63:
            r7 = move-exception
            goto L5f
        L65:
            r7.releaseIntercepted()
            throw r8
        L69:
            O1.s r0 = new O1.s
            r1 = 3
            r0.<init>(r7, r1)
            java.lang.Object r7 = r6.f21192p
            z5.u r7 = (z5.u) r7
            r7.b(r0, r8)
            d5.a r7 = d5.EnumC0830a.f11264o
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.t.b(z5.f, c5.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(l5.e eVar) {
        this.f21192p = (AbstractC0871i) eVar;
    }
}
