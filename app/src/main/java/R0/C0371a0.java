package R0;

import android.view.Choreographer;
import d5.EnumC0830a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w5.C1793k;

/* JADX INFO: renamed from: R0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0371a0 implements f0.X {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6412o;

    /* JADX INFO: renamed from: p */
    public final Object f6413p;

    /* JADX INFO: renamed from: q */
    public final Object f6414q;

    public C0371a0(Choreographer choreographer, Y y6) {
        this.f6412o = 0;
        this.f6413p = choreographer;
        this.f6414q = y6;
    }

    private final Object a(InterfaceC1182c interfaceC1182c, c5.d dVar) {
        Y y6 = (Y) this.f6414q;
        if (y6 == null) {
            c5.g gVarN = dVar.getContext().n(c5.e.f10684o);
            y6 = gVarN instanceof Y ? (Y) gVarN : null;
        }
        C1793k c1793k = new C1793k(1, I0.c.D(dVar));
        c1793k.r();
        Z z6 = new Z(c1793k, this, interfaceC1182c);
        if (y6 == null || !AbstractC1209k.a(y6.f6389q, (Choreographer) this.f6413p)) {
            ((Choreographer) this.f6413p).postFrameCallback(z6);
            c1793k.t(new K0.A(this, 8, z6));
        } else {
            synchronized (y6.f6391s) {
                y6.f6393u.add(z6);
                if (!y6.f6396x) {
                    y6.f6396x = true;
                    y6.f6389q.postFrameCallback(y6.f6397y);
                }
            }
            c1793k.t(new K0.A(y6, 7, z6));
        }
        Object objQ = c1793k.q();
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        return objQ;
    }

    @Override // c5.g
    public final c5.h getKey() {
        switch (this.f6412o) {
        }
        return f0.W.f11763p;
    }

    @Override // c5.i
    public final c5.i h(c5.i iVar) {
        switch (this.f6412o) {
        }
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        switch (this.f6412o) {
        }
        return I0.c.z(this, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0018  */
    @Override // f0.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(l5.InterfaceC1182c r7, c5.d r8) {
        /*
            r6 = this;
            int r0 = r6.f6412o
            switch(r0) {
                case 0: goto L91;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof f0.C0896k0
            if (r0 == 0) goto L18
            r0 = r8
            f0.k0 r0 = (f0.C0896k0) r0
            int r1 = r0.f11819r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f11819r = r1
            goto L1d
        L18:
            f0.k0 r0 = new f0.k0
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f11817p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f11819r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            android.support.v4.media.session.b.K(r8)
            goto L8d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            l5.c r7 = r0.f11816o
            android.support.v4.media.session.b.K(r8)
            goto L7d
        L3d:
            android.support.v4.media.session.b.K(r8)
            java.lang.Object r8 = r6.f6414q
            D2.B r8 = (D2.B) r8
            r0.f11816o = r7
            r0.f11819r = r4
            boolean r2 = r8.i()
            if (r2 == 0) goto L51
            Y4.o r8 = Y4.o.f8736a
            goto L7a
        L51:
            w5.k r2 = new w5.k
            c5.d r5 = I0.c.D(r0)
            r2.<init>(r4, r5)
            r2.r()
            java.lang.Object r4 = r8.f1459p
            monitor-enter(r4)
            java.lang.Object r5 = r8.f1460q     // Catch: java.lang.Throwable -> L8e
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L8e
            r5.add(r2)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r4)
            M.J r4 = new M.J
            r5 = 2
            r4.<init>(r8, r5, r2)
            r2.t(r4)
            java.lang.Object r8 = r2.q()
            if (r8 != r1) goto L78
            goto L7a
        L78:
            Y4.o r8 = Y4.o.f8736a
        L7a:
            if (r8 != r1) goto L7d
            goto L8c
        L7d:
            java.lang.Object r8 = r6.f6413p
            f0.X r8 = (f0.X) r8
            r2 = 0
            r0.f11816o = r2
            r0.f11819r = r3
            java.lang.Object r8 = r8.s(r7, r0)
            if (r8 != r1) goto L8d
        L8c:
            r8 = r1
        L8d:
            return r8
        L8e:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L91:
            java.lang.Object r7 = r6.a(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.C0371a0.s(l5.c, c5.d):java.lang.Object");
    }

    @Override // c5.i
    public final c5.i u(c5.h hVar) {
        switch (this.f6412o) {
        }
        return I0.c.H(this, hVar);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        switch (this.f6412o) {
        }
        return eVar.invoke(obj, this);
    }

    public C0371a0(f0.X x6) {
        this.f6412o = 1;
        this.f6413p = x6;
        this.f6414q = new D2.B();
    }
}
