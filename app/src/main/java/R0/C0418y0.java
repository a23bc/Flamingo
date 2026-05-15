package R0;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: R0.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0418y0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y5.q f6646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y5.b f6647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y5.c f6649r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0418y0(y5.c cVar, c5.d dVar) {
        super(2, dVar);
        this.f6649r = cVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0418y0(this.f6649r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0418y0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:17:0x0033, B:19:0x003b, B:20:0x0049, B:28:0x005a, B:14:0x0026, B:30:0x005d, B:31:0x0061, B:32:0x0062, B:13:0x0020, B:21:0x004a, B:23:0x0050), top: B:39:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:17:0x0033). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f6648q
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            y5.b r1 = r6.f6647p
            y5.q r3 = r6.f6646o
            android.support.v4.media.session.b.K(r7)     // Catch: java.lang.Throwable -> L11
            goto L33
        L11:
            r7 = move-exception
            goto L6a
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            android.support.v4.media.session.b.K(r7)
            y5.c r3 = r6.f6649r
            y5.b r7 = new y5.b     // Catch: java.lang.Throwable -> L11
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L11
            r1 = r7
        L26:
            r6.f6646o = r3     // Catch: java.lang.Throwable -> L11
            r6.f6647p = r1     // Catch: java.lang.Throwable -> L11
            r6.f6648q = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r1.b(r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L33
            return r0
        L33:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L11
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r7 == 0) goto L63
            java.lang.Object r7 = r1.c()     // Catch: java.lang.Throwable -> L11
            Y4.o r7 = (Y4.o) r7     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r7 = R0.AbstractC0420z0.f6652b     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r7.set(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = p0.l.f14941c     // Catch: java.lang.Throwable -> L11
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L11
            p0.a r5 = p0.l.f14947j     // Catch: java.lang.Throwable -> L58
            t.K r5 = r5.h     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            boolean r5 = r5.h()     // Catch: java.lang.Throwable -> L58
            if (r5 != r2) goto L5a
            r4 = r2
            goto L5a
        L58:
            r0 = move-exception
            goto L61
        L5a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L26
            p0.l.a()     // Catch: java.lang.Throwable -> L11
            goto L26
        L61:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L63:
            r7 = 0
            r3.c(r7)
            Y4.o r7 = Y4.o.f8736a
            return r7
        L6a:
            throw r7     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            y5.j.b(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.C0418y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
