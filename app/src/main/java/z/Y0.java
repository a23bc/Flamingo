package z;

import e5.AbstractC0870h;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p */
    public w5.w0 f20757p;

    /* JADX INFO: renamed from: q */
    public int f20758q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f20759r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1765B f20760s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AbstractC0871i f20761t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1182c f20762u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C2054o0 f20763v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y0(InterfaceC1765B interfaceC1765B, l5.f fVar, InterfaceC1182c interfaceC1182c, C2054o0 c2054o0, c5.d dVar) {
        super(dVar);
        this.f20760s = interfaceC1765B;
        this.f20761t = (AbstractC0871i) fVar;
        this.f20762u = interfaceC1182c;
        this.f20763v = c2054o0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        InterfaceC1182c interfaceC1182c = this.f20762u;
        C2054o0 c2054o0 = this.f20763v;
        Y0 y02 = new Y0(this.f20760s, this.f20761t, interfaceC1182c, c2054o0, dVar);
        y02.f20759r = obj;
        return y02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0080  */
    /* JADX WARN: Type inference failed for: r8v0, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r10.f20758q
            z.o0 r2 = r10.f20763v
            r3 = 0
            r4 = 1
            w5.B r5 = r10.f20760s
            r6 = 2
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L21
            if (r1 != r6) goto L19
            java.lang.Object r0 = r10.f20759r
            w5.g0 r0 = (w5.InterfaceC1786g0) r0
            android.support.v4.media.session.b.K(r11)
            goto L73
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            w5.w0 r1 = r10.f20757p
            java.lang.Object r4 = r10.f20759r
            K0.L r4 = (K0.L) r4
            android.support.v4.media.session.b.K(r11)
            goto L50
        L2b:
            android.support.v4.media.session.b.K(r11)
            java.lang.Object r11 = r10.f20759r
            K0.L r11 = (K0.L) r11
            z.K r1 = z.q1.f20945a
            w5.C r1 = w5.EnumC1766C.f19467o
            z.X0 r1 = new z.X0
            r1.<init>(r2, r3)
            w5.w0 r1 = w5.AbstractC1767D.t(r5, r3, r1, r4)
            r10.f20759r = r11
            r10.f20757p = r1
            r10.f20758q = r4
            r4 = 3
            java.lang.Object r4 = z.q1.c(r11, r10, r4)
            if (r4 != r0) goto L4d
            goto L71
        L4d:
            r9 = r4
            r4 = r11
            r11 = r9
        L50:
            K0.u r11 = (K0.u) r11
            r11.a()
            z.K r7 = z.q1.f20945a
            e5.i r8 = r10.f20761t
            if (r8 == r7) goto L63
            z.U0 r7 = new z.U0
            r7.<init>(r8, r2, r11, r3)
            z.q1.g(r5, r1, r7)
        L63:
            r10.f20759r = r1
            r10.f20757p = r3
            r10.f20758q = r6
            K0.n r11 = K0.EnumC0246n.f3902p
            java.lang.Object r11 = z.q1.i(r4, r11, r10)
            if (r11 != r0) goto L72
        L71:
            return r0
        L72:
            r0 = r1
        L73:
            K0.u r11 = (K0.u) r11
            if (r11 != 0) goto L80
            z.V0 r11 = new z.V0
            r11.<init>(r2, r3)
            z.q1.g(r5, r0, r11)
            goto L97
        L80:
            r11.a()
            z.W0 r1 = new z.W0
            r1.<init>(r2, r3)
            z.q1.g(r5, r0, r1)
            l5.c r0 = r10.f20762u
            x0.b r1 = new x0.b
            long r2 = r11.f3912c
            r1.<init>(r2)
            r0.b(r1)
        L97:
            Y4.o r11 = Y4.o.f8736a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z.Y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
