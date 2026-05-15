package z;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1786g0 f20913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f20914r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(InterfaceC1786g0 interfaceC1786g0, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f20913q = interfaceC1786g0;
        this.f20914r = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        m1 m1Var = new m1(this.f20913q, this.f20914r, dVar);
        m1Var.f20912p = obj;
        return m1Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4.f20914r.invoke(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v5, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r4.f20911o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r5)
            goto L43
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r1 = r4.f20912p
            w5.B r1 = (w5.InterfaceC1765B) r1
            android.support.v4.media.session.b.K(r5)
            goto L35
        L20:
            android.support.v4.media.session.b.K(r5)
            java.lang.Object r5 = r4.f20912p
            r1 = r5
            w5.B r1 = (w5.InterfaceC1765B) r1
            r4.f20912p = r1
            r4.f20911o = r3
            w5.g0 r5 = r4.f20913q
            java.lang.Object r5 = r5.j(r4)
            if (r5 != r0) goto L35
            goto L42
        L35:
            r5 = 0
            r4.f20912p = r5
            r4.f20911o = r2
            e5.i r5 = r4.f20914r
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L43
        L42:
            return r0
        L43:
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
