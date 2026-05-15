package z;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1786g0 f20815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2054o0 f20816q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(InterfaceC1786g0 interfaceC1786g0, C2054o0 c2054o0, c5.d dVar) {
        super(2, dVar);
        this.f20815p = interfaceC1786g0;
        this.f20816q = c2054o0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e1(this.f20815p, this.f20816q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r4.f20816q.d(r4) == r0) goto L15;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r4.f20814o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r5)
            goto L35
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            android.support.v4.media.session.b.K(r5)
            goto L2a
        L1c:
            android.support.v4.media.session.b.K(r5)
            r4.f20814o = r3
            w5.g0 r5 = r4.f20815p
            java.lang.Object r5 = r5.j(r4)
            if (r5 != r0) goto L2a
            goto L34
        L2a:
            r4.f20814o = r2
            z.o0 r5 = r4.f20816q
            java.lang.Object r5 = r5.d(r4)
            if (r5 != r0) goto L35
        L34:
            return r0
        L35:
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
