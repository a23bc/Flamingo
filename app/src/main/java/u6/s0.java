package u6;

import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import java.util.List;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f17851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G f17852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17854t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(InterfaceC0878b0 interfaceC0878b0, List list, G g6, InterfaceC1182c interfaceC1182c, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f17850p = interfaceC0878b0;
        this.f17851q = list;
        this.f17852r = g6;
        this.f17853s = interfaceC1182c;
        this.f17854t = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new s0(this.f17850p, this.f17851q, this.f17852r, this.f17853s, this.f17854t, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f17849o
            Y4.o r2 = Y4.o.f8736a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            android.support.v4.media.session.b.K(r7)
            return r2
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            android.support.v4.media.session.b.K(r7)
            f0.b0 r7 = r6.f17850p
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L2a
            goto L9a
        L2a:
            w.u r7 = u6.E0.f17383a
            f0.b0 r7 = r6.f17854t
            java.lang.Object r7 = r7.getValue()
            u6.F r7 = (u6.F) r7
            if (r7 == 0) goto L3f
            java.util.ArrayList r7 = r7.f17393a
            java.lang.Object r7 = Z4.n.r0(r7)
            u6.n r7 = (u6.C1571n) r7
            goto L40
        L3f:
            r7 = 0
        L40:
            f0.g0 r1 = a6.b.f8883a
            int r4 = r1.h()
            if (r4 > 0) goto L53
            if (r7 == 0) goto L53
            int r4 = r7.f17757a
            if (r4 != 0) goto L53
            int r7 = r7.f17758b
            if (r7 != 0) goto L53
            goto L9a
        L53:
            int r7 = r1.h()
            if (r7 <= 0) goto L6d
            int r7 = r1.h()
            int r7 = r7 - r3
            java.util.List r4 = r6.f17851q
            java.lang.Object r7 = r4.get(r7)
            d6.f r7 = (d6.f) r7
            boolean r7 = r7.c()
            if (r7 == 0) goto L6d
            goto L9a
        L6d:
            int r7 = r1.h()
            int r7 = r7 + r3
            r4 = 0
            if (r7 >= 0) goto L76
            r7 = r4
        L76:
            int r1 = r1.h()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            l5.c r1 = r6.f17853s
            java.lang.Object r1 = r1.b(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = o5.AbstractC1267a.H(r1)
            r6.f17849o = r3
            u6.G r3 = r6.f17852r
            java.lang.Object r7 = r3.a(r7, r1, r4, r6)
            if (r7 != r0) goto L9a
            return r0
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
