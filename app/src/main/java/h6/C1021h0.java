package h6;

import e5.AbstractC0871i;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: h6.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021h0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f13063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f13064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1670c f13065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f13066s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021h0(C1670c c1670c, float f7, C1670c c1670c2, float f8, c5.d dVar) {
        super(2, dVar);
        this.f13063p = c1670c;
        this.f13064q = f7;
        this.f13065r = c1670c2;
        this.f13066s = f8;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1021h0(this.f13063p, this.f13064q, this.f13065r, this.f13066s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1021h0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (w.C1670c.c(r6, r7, r8, null, null, r11, 12) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: CancellationException -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x008e, blocks: (B:6:0x0014, B:25:0x0070), top: B:35:0x000e }] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r14.f13062o
            r2 = 981668463(0x3a83126f, float:0.001)
            r3 = 1145569280(0x44480000, float:800.0)
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L25
            if (r1 == r6) goto L21
            if (r1 != r5) goto L19
            android.support.v4.media.session.b.K(r15)     // Catch: java.util.concurrent.CancellationException -> L8e
            goto L8e
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            android.support.v4.media.session.b.K(r15)     // Catch: java.util.concurrent.CancellationException -> L3a
            goto L3a
        L25:
            android.support.v4.media.session.b.K(r15)
            w.c r15 = r14.f13063p
            java.lang.Object r15 = r15.e()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            float r1 = r14.f13064q
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L3c
        L3a:
            r11 = r14
            goto L5d
        L3c:
            w.c r7 = r14.f13063p     // Catch: java.util.concurrent.CancellationException -> L3a
            java.lang.Float r8 = new java.lang.Float     // Catch: java.util.concurrent.CancellationException -> L3a
            r8.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L3a
            java.lang.Float r15 = new java.lang.Float     // Catch: java.util.concurrent.CancellationException -> L3a
            r15.<init>(r2)     // Catch: java.util.concurrent.CancellationException -> L3a
            w.S r9 = new w.S     // Catch: java.util.concurrent.CancellationException -> L3a
            r9.<init>(r4, r3, r15)     // Catch: java.util.concurrent.CancellationException -> L3a
            r14.f13062o = r6     // Catch: java.util.concurrent.CancellationException -> L3a
            r10 = 0
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r15 = w.C1670c.c(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L5c
            r11 = r12
            if (r15 != r0) goto L5d
            goto L8d
        L5c:
            r11 = r12
        L5d:
            w.c r15 = r11.f13065r
            java.lang.Object r15 = r15.e()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            float r1 = r11.f13066s
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L70
            goto L8e
        L70:
            w.c r6 = r11.f13065r     // Catch: java.util.concurrent.CancellationException -> L8e
            java.lang.Float r7 = new java.lang.Float     // Catch: java.util.concurrent.CancellationException -> L8e
            r7.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L8e
            java.lang.Float r15 = new java.lang.Float     // Catch: java.util.concurrent.CancellationException -> L8e
            r15.<init>(r2)     // Catch: java.util.concurrent.CancellationException -> L8e
            w.S r8 = new w.S     // Catch: java.util.concurrent.CancellationException -> L8e
            r8.<init>(r4, r3, r15)     // Catch: java.util.concurrent.CancellationException -> L8e
            r11.f13062o = r5     // Catch: java.util.concurrent.CancellationException -> L8e
            r9 = 0
            r10 = 0
            r12 = 12
            java.lang.Object r15 = w.C1670c.c(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r15 != r0) goto L8e
        L8d:
            return r0
        L8e:
            Y4.o r15 = Y4.o.f8736a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C1021h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
