package V4;

import K0.L;
import e5.AbstractC0870h;
import f0.InterfaceC0878b0;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public K0.u f7565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f7568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f7569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f7570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f7571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y4.e f7572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7573x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z6, int i7, InterfaceC1765B interfaceC1765B, G g6, Y4.e eVar, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(dVar);
        this.f7568s = z6;
        this.f7569t = i7;
        this.f7570u = interfaceC1765B;
        this.f7571v = g6;
        this.f7572w = eVar;
        this.f7573x = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        InterfaceC0878b0 interfaceC0878b0 = this.f7573x;
        u uVar = new u(this.f7568s, this.f7569t, this.f7570u, this.f7571v, this.f7572w, interfaceC0878b0, dVar);
        uVar.f7567r = obj;
        return uVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r12.f7566q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            K0.u r0 = r12.f7565p
            java.lang.Object r1 = r12.f7567r
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r13)
            goto L51
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            java.lang.Object r1 = r12.f7567r
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r13)
            goto L3c
        L27:
            android.support.v4.media.session.b.K(r13)
            java.lang.Object r13 = r12.f7567r
            K0.L r13 = (K0.L) r13
            r12.f7567r = r13
            r12.f7566q = r4
            java.lang.Object r1 = z.q1.c(r13, r12, r2)
            if (r1 != r0) goto L39
            goto L4e
        L39:
            r11 = r1
            r1 = r13
            r13 = r11
        L3c:
            K0.u r13 = (K0.u) r13
            r12.f7567r = r1
            r12.f7565p = r13
            r12.f7566q = r3
            z.K r4 = z.q1.f20945a
            K0.n r4 = K0.EnumC0246n.f3902p
            java.lang.Object r4 = z.q1.i(r1, r4, r12)
            if (r4 != r0) goto L4f
        L4e:
            return r0
        L4f:
            r0 = r13
            r13 = r4
        L51:
            K0.u r13 = (K0.u) r13
            Y4.o r4 = Y4.o.f8736a
            if (r13 != 0) goto L58
            goto Lad
        L58:
            R0.S0 r1 = r1.d()
            int r5 = r0.f3917i
            float r6 = V4.x.f7589a
            java.lang.String r6 = "$this$pointerSlop"
            m5.AbstractC1209k.f(r1, r6)
            if (r5 != r3) goto L6f
            float r1 = r1.d()
            float r3 = V4.x.f7594f
            float r1 = r1 * r3
            goto L73
        L6f:
            float r1 = r1.d()
        L73:
            long r5 = r0.f3912c
            float r0 = x0.C1892b.d(r5)
            long r5 = r13.f3912c
            float r13 = x0.C1892b.d(r5)
            float r0 = r0 - r13
            float r13 = java.lang.Math.abs(r0)
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 >= 0) goto Lad
            boolean r13 = r12.f7568s
            if (r13 == 0) goto L96
            int r13 = r12.f7569t
            float r13 = (float) r13
            float r0 = x0.C1892b.d(r5)
            float r13 = r13 - r0
        L94:
            r8 = r13
            goto L9b
        L96:
            float r13 = x0.C1892b.d(r5)
            goto L94
        L9b:
            V4.t r5 = new V4.t
            f0.b0 r9 = r12.f7573x
            V4.G r6 = r12.f7571v
            Y4.e r7 = r12.f7572w
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            w5.B r13 = r12.f7570u
            r0 = 0
            w5.AbstractC1767D.t(r13, r0, r5, r2)
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
