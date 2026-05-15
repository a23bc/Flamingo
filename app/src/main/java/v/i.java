package V;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f7330o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1786g0 f7331p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ k f7332q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC1786g0 interfaceC1786g0, k kVar, c5.d dVar) {
        super(2, dVar);
        this.f7331p = interfaceC1786g0;
        this.f7332q = kVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new i(this.f7331p, this.f7332q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((i) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0045, code lost:
    
        if (w5.AbstractC1767D.g(r12, r11) == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006b, code lost:
    
        if (w5.AbstractC1767D.i(500, r11) != r0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:46:0x0019, B:71:0x006e, B:65:0x0057, B:68:0x0060, B:52:0x0027, B:53:0x002b, B:54:0x0033, B:61:0x0048, B:63:0x0051), top: B:75:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x006b -> B:71:0x006e). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r11.f7330o
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            V.k r10 = r11.f7332q
            if (r1 == 0) goto L38
            if (r1 == r9) goto L34
            if (r1 == r8) goto L2b
            if (r1 == r7) goto L27
            if (r1 != r6) goto L1f
            android.support.v4.media.session.b.K(r12)     // Catch: java.lang.Throwable -> L1d
            goto L6e
        L1d:
            r12 = move-exception
            goto L74
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            android.support.v4.media.session.b.K(r12)     // Catch: java.lang.Throwable -> L1d
            goto L60
        L2b:
            android.support.v4.media.session.b.K(r12)     // Catch: java.lang.Throwable -> L1d
            A2.W r12 = new A2.W     // Catch: java.lang.Throwable -> L1d
            r12.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r12     // Catch: java.lang.Throwable -> L1d
        L34:
            android.support.v4.media.session.b.K(r12)
            goto L48
        L38:
            android.support.v4.media.session.b.K(r12)
            w5.g0 r12 = r11.f7331p
            if (r12 == 0) goto L48
            r11.f7330o = r9
            java.lang.Object r12 = w5.AbstractC1767D.g(r12, r11)
            if (r12 != r0) goto L48
            goto L6d
        L48:
            f0.f0 r12 = r10.f7337c     // Catch: java.lang.Throwable -> L1d
            r12.j(r5)     // Catch: java.lang.Throwable -> L1d
            boolean r12 = r10.f7335a     // Catch: java.lang.Throwable -> L1d
            if (r12 != 0) goto L57
            r11.f7330o = r8     // Catch: java.lang.Throwable -> L1d
            w5.AbstractC1767D.e(r11)     // Catch: java.lang.Throwable -> L1d
            return r0
        L57:
            r11.f7330o = r7     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r12 = w5.AbstractC1767D.i(r3, r11)     // Catch: java.lang.Throwable -> L1d
            if (r12 != r0) goto L60
            goto L6d
        L60:
            f0.f0 r12 = r10.f7337c     // Catch: java.lang.Throwable -> L1d
            r12.j(r2)     // Catch: java.lang.Throwable -> L1d
            r11.f7330o = r6     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r12 = w5.AbstractC1767D.i(r3, r11)     // Catch: java.lang.Throwable -> L1d
            if (r12 != r0) goto L6e
        L6d:
            return r0
        L6e:
            f0.f0 r12 = r10.f7337c     // Catch: java.lang.Throwable -> L1d
            r12.j(r5)     // Catch: java.lang.Throwable -> L1d
            goto L57
        L74:
            f0.f0 r0 = r10.f7337c
            r0.j(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: V.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
