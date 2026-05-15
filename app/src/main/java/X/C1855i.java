package x;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1855i extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f19745o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ B.k f19746p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ B.m f19747q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1885x f19748r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1855i(B.k kVar, B.m mVar, C1885x c1885x, c5.d dVar) {
        super(2, dVar);
        this.f19746p = kVar;
        this.f19747q = mVar;
        this.f19748r = c1885x;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1855i(this.f19746p, this.f19747q, this.f19748r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1855i) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        if (r7.f19746p.a(r2, r7) == r0) goto L33;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r7.f19745o
            B.m r2 = r7.f19747q
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            android.support.v4.media.session.b.K(r8)
            goto L37
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            android.support.v4.media.session.b.K(r8)
            goto L2c
        L1e:
            android.support.v4.media.session.b.K(r8)
            long r5 = x.AbstractC1887y.f19857a
            r7.f19745o = r4
            java.lang.Object r8 = w5.AbstractC1767D.i(r5, r7)
            if (r8 != r0) goto L2c
            goto L36
        L2c:
            r7.f19745o = r3
            B.k r8 = r7.f19746p
            java.lang.Object r8 = r8.a(r2, r7)
            if (r8 != r0) goto L37
        L36:
            return r0
        L37:
            x.x r8 = r7.f19748r
            r8.f19801P = r2
            Y4.o r8 = Y4.o.f8736a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1855i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
