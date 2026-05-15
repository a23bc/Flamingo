package h6;

import d5.EnumC0830a;
import e5.AbstractC0870h;
import f0.InterfaceC0878b0;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f13271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13272r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(dVar);
        this.f13272r = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        x0 x0Var = new x0(this.f13272r, dVar);
        x0Var.f13271q = obj;
        return x0Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((x0) create((K0.L) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r5.f13270p
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r5.f13271q
            K0.L r1 = (K0.L) r1
            android.support.v4.media.session.b.K(r6)
            goto L2c
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            android.support.v4.media.session.b.K(r6)
            java.lang.Object r6 = r5.f13271q
            K0.L r6 = (K0.L) r6
            r1 = r6
        L21:
            r5.f13271q = r1
            r5.f13270p = r2
            java.lang.Object r6 = A0.e.q(r1, r5)
            if (r6 != r0) goto L2c
            return r0
        L2c:
            K0.m r6 = (K0.C0245m) r6
            int r6 = r6.f3900e
            f0.b0 r3 = r5.f13272r
            if (r6 != r2) goto L3a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r3.setValue(r6)
            goto L21
        L3a:
            r4 = 2
            if (r6 != r4) goto L21
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r3.setValue(r6)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
