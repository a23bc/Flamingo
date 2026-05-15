package f0;

import e5.AbstractC0871i;
import z5.InterfaceC2110e;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c5.i f11771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2110e f11772r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(c5.i iVar, InterfaceC2110e interfaceC2110e, c5.d dVar) {
        super(2, dVar);
        this.f11771q = iVar;
        this.f11772r = interfaceC2110e;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        W0 w02 = new W0(this.f11771q, this.f11772r, dVar);
        w02.f11770p = obj;
        return w02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W0) create((C0909r0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r5.b(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (w5.AbstractC1767D.C(r4, r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r0;
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
            int r1 = r6.f11769o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            android.support.v4.media.session.b.K(r7)
            goto L4a
        L19:
            android.support.v4.media.session.b.K(r7)
            java.lang.Object r7 = r6.f11770p
            f0.r0 r7 = (f0.C0909r0) r7
            c5.j r1 = c5.j.f10685o
            c5.i r4 = r6.f11771q
            boolean r1 = m5.AbstractC1209k.a(r4, r1)
            z5.e r5 = r6.f11772r
            if (r1 == 0) goto L3b
            f0.U0 r1 = new f0.U0
            r2 = 0
            r1.<init>(r7, r2)
            r6.f11769o = r3
            java.lang.Object r7 = r5.b(r1, r6)
            if (r7 != r0) goto L4a
            goto L49
        L3b:
            f0.V0 r1 = new f0.V0
            r3 = 0
            r1.<init>(r5, r7, r3)
            r6.f11769o = r2
            java.lang.Object r7 = w5.AbstractC1767D.C(r4, r1, r6)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            Y4.o r7 = Y4.o.f8736a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.W0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
