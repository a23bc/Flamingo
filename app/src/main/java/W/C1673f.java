package w;

import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: w.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1673f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public y5.b f18656o;

    /* JADX INFO: renamed from: p */
    public int f18657p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f18658q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ y5.g f18659r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C1670c f18660s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC0878b0 f18661t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC0878b0 f18662u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673f(y5.g gVar, C1670c c1670c, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f18659r = gVar;
        this.f18660s = c1670c;
        this.f18661t = interfaceC0878b0;
        this.f18662u = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1673f c1673f = new C1673f(this.f18659r, this.f18660s, this.f18661t, this.f18662u, dVar);
        c1673f.f18658q = obj;
        return c1673f;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1673f) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0033 -> B:36:0x0036). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r14.f18657p
            y5.g r2 = r14.f18659r
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            y5.b r1 = r14.f18656o
            java.lang.Object r4 = r14.f18658q
            w5.B r4 = (w5.InterfaceC1765B) r4
            android.support.v4.media.session.b.K(r15)
            goto L36
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            android.support.v4.media.session.b.K(r15)
            java.lang.Object r15 = r14.f18658q
            w5.B r15 = (w5.InterfaceC1765B) r15
            y5.b r1 = r2.iterator()
            r4 = r15
        L29:
            r14.f18658q = r4
            r14.f18656o = r1
            r14.f18657p = r3
            java.lang.Object r15 = r1.b(r14)
            if (r15 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L63
            java.lang.Object r15 = r1.c()
            java.lang.Object r5 = r2.f()
            boolean r6 = r5 instanceof y5.i
            r7 = 0
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            r5 = r7
        L4d:
            if (r5 != 0) goto L51
            r9 = r15
            goto L52
        L51:
            r9 = r5
        L52:
            w.e r8 = new w.e
            f0.b0 r12 = r14.f18662u
            f0.b0 r11 = r14.f18661t
            w.c r10 = r14.f18660s
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r15 = 3
            w5.AbstractC1767D.t(r4, r7, r8, r15)
            goto L29
        L63:
            Y4.o r15 = Y4.o.f8736a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1673f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
