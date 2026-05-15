package w5;

import e5.AbstractC0871i;

/* JADX INFO: renamed from: w5.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1782e0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f19528o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ E0.K f19529p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1782e0(E0.K k7, c5.d dVar) {
        super(2, dVar);
        this.f19529p = k7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1782e0 c1782e0 = new C1782e0(this.f19529p, dVar);
        c1782e0.f19528o = obj;
        return c1782e0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1782e0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x005a, code lost:
    
        return r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005f, code lost:
    
        r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0063, code lost:
    
        throw r0;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            android.support.v4.media.session.b.K(r11)
            java.lang.Object r11 = r10.f19528o
            w5.B r11 = (w5.InterfaceC1765B) r11
            c5.i r11 = r11.g()
            E0.K r0 = r10.f19529p
            w5.B0 r3 = new w5.B0     // Catch: java.lang.InterruptedException -> L5b
            w5.g0 r11 = w5.AbstractC1767D.n(r11)     // Catch: java.lang.InterruptedException -> L5b
            r3.<init>(r11)     // Catch: java.lang.InterruptedException -> L5b
            boolean r1 = r11 instanceof w5.p0     // Catch: java.lang.InterruptedException -> L5b
            r9 = 1
            if (r1 == 0) goto L24
            w5.p0 r11 = (w5.p0) r11     // Catch: java.lang.InterruptedException -> L5b
            w5.N r11 = r11.S(r9, r9, r3)     // Catch: java.lang.InterruptedException -> L5b
            goto L36
        L24:
            M.r0 r1 = new M.r0     // Catch: java.lang.InterruptedException -> L5b
            java.lang.String r6 = "invoke(Ljava/lang/Throwable;)V"
            java.lang.Class<w5.d0> r4 = w5.InterfaceC1780d0.class
            java.lang.String r5 = "invoke"
            r7 = 0
            r2 = 1
            r8 = 3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.InterruptedException -> L5b
            w5.N r11 = r11.o(r9, r9, r1)     // Catch: java.lang.InterruptedException -> L5b
        L36:
            r3.f19466p = r11     // Catch: java.lang.InterruptedException -> L5b
        L38:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = w5.B0.f19464q     // Catch: java.lang.InterruptedException -> L5b
            int r1 = r11.get(r3)     // Catch: java.lang.InterruptedException -> L5b
            if (r1 == 0) goto L4c
            r11 = 2
            if (r1 == r11) goto L53
            r11 = 3
            if (r1 != r11) goto L47
            goto L53
        L47:
            w5.B0.b(r1)     // Catch: java.lang.InterruptedException -> L5b
            r11 = 0
            throw r11     // Catch: java.lang.InterruptedException -> L5b
        L4c:
            r2 = 0
            boolean r11 = r11.compareAndSet(r3, r1, r2)     // Catch: java.lang.InterruptedException -> L5b
            if (r11 == 0) goto L38
        L53:
            java.lang.Object r11 = r0.a()     // Catch: java.lang.Throwable -> L5e
            r3.a()     // Catch: java.lang.InterruptedException -> L5b
            return r11
        L5b:
            r0 = move-exception
            r11 = r0
            goto L64
        L5e:
            r0 = move-exception
            r11 = r0
            r3.a()     // Catch: java.lang.InterruptedException -> L5b
            throw r11     // Catch: java.lang.InterruptedException -> L5b
        L64:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r11 = r0.initCause(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C1782e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
