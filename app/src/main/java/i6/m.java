package i6;

import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13550r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC1180a interfaceC1180a, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f13548p = interfaceC1180a;
        this.f13549q = interfaceC0878b0;
        this.f13550r = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new m(this.f13548p, this.f13549q, this.f13550r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (w5.AbstractC1767D.i(100, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (w5.AbstractC1767D.i(300, r6) == r0) goto L18;
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
            int r1 = r6.f13547o
            f0.b0 r2 = r6.f13549q
            f0.b0 r3 = r6.f13550r
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            android.support.v4.media.session.b.K(r7)
            goto L57
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            android.support.v4.media.session.b.K(r7)
            goto L41
        L20:
            android.support.v4.media.session.b.K(r7)
            l5.a r7 = r6.f13548p
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L47
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.setValue(r7)
            r6.f13547o = r5
            r1 = 100
            java.lang.Object r7 = w5.AbstractC1767D.i(r1, r6)
            if (r7 != r0) goto L41
            goto L56
        L41:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r3.setValue(r7)
            goto L5c
        L47:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.setValue(r7)
            r6.f13547o = r4
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r7 = w5.AbstractC1767D.i(r3, r6)
            if (r7 != r0) goto L57
        L56:
            return r0
        L57:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2.setValue(r7)
        L5c:
            Y4.o r7 = Y4.o.f8736a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
