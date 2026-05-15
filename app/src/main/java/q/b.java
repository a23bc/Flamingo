package Q;

import K0.L;
import Y4.o;
import c5.d;
import e5.AbstractC0870h;
import l5.InterfaceC1182c;
import l5.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0870h implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f5769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f5770r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC1182c interfaceC1182c, d dVar) {
        super(dVar);
        this.f5770r = interfaceC1182c;
    }

    @Override // e5.AbstractC0863a
    public final d create(Object obj, d dVar) {
        b bVar = new b(this.f5770r, dVar);
        bVar.f5769q = obj;
        return bVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((L) obj, (d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f5768p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r7)
            goto L54
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.f5769q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r7)
            goto L33
        L20:
            android.support.v4.media.session.b.K(r7)
            java.lang.Object r7 = r6.f5769q
            r1 = r7
            K0.L r1 = (K0.L) r1
            r6.f5769q = r1
            r6.f5768p = r3
            java.lang.Object r7 = android.support.v4.media.session.b.c(r1, r6)
            if (r7 != r0) goto L33
            goto L53
        L33:
            K0.u r7 = (K0.u) r7
            r7.a()
            x0.b r3 = new x0.b
            long r4 = r7.f3912c
            r3.<init>(r4)
            l5.c r7 = r6.f5770r
            r7.b(r3)
            r7 = 0
            r6.f5769q = r7
            r6.f5768p = r2
            z.K r7 = z.q1.f20945a
            K0.n r7 = K0.EnumC0246n.f3902p
            java.lang.Object r7 = z.q1.i(r1, r7, r6)
            if (r7 != r0) goto L54
        L53:
            return r0
        L54:
            K0.u r7 = (K0.u) r7
            if (r7 == 0) goto L5b
            r7.a()
        L5b:
            Y4.o r7 = Y4.o.f8736a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
