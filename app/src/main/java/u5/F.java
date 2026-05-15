package U5;

import e5.AbstractC0871i;
import f0.C0888g0;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f7105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1670c f7106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7107r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(float f7, C1670c c1670c, C0888g0 c0888g0, c5.d dVar) {
        super(2, dVar);
        this.f7105p = f7;
        this.f7106q = c1670c;
        this.f7107r = c0888g0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new F(this.f7105p, this.f7106q, this.f7107r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r13 == r0) goto L18;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r12.f7104o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r13)
            goto L67
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            android.support.v4.media.session.b.K(r13)
            r6 = r12
            goto L42
        L1d:
            android.support.v4.media.session.b.K(r13)
            float r13 = r12.f7105p
            r1 = 0
            int r4 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r4 >= 0) goto L45
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r13)
            r12.f7104o = r3
            r9 = 0
            r11 = 10
            w.c r5 = r12.f7106q
            r7 = 0
            r10 = r12
            java.lang.Object r13 = w.C1670c.c(r5, r6, r7, r8, r9, r10, r11)
            r6 = r10
            if (r13 != r0) goto L42
            goto L66
        L42:
            w.j r13 = (w.C1677j) r13
            goto L69
        L45:
            r6 = r12
            f0.g0 r1 = r6.f7107r
            int r1 = r1.h()
            float r1 = (float) r1
            r3 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r13)
            r6.f7104o = r3
            r5 = 0
            r7 = 10
            w.c r1 = r6.f7106q
            r3 = 0
            java.lang.Object r13 = w.C1670c.c(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L67
        L66:
            return r0
        L67:
            w.j r13 = (w.C1677j) r13
        L69:
            Y4.o r13 = Y4.o.f8736a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
