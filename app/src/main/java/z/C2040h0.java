package z;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: z.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2040h0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A3.b f20854q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2040h0(A3.b bVar, c5.d dVar) {
        super(2, dVar);
        this.f20854q = bVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2040h0 c2040h0 = new C2040h0(this.f20854q, dVar);
        c2040h0.f20853p = obj;
        return c2040h0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2040h0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (A3.b.a(r2, r3, r4, r5, r6, r12) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0032, B:19:0x003c, B:23:0x004e, B:14:0x0027), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r12.f20852o
            A3.b r2 = r12.f20854q
            r8 = 0
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L2b
            if (r1 == r10) goto L23
            if (r1 != r9) goto L1b
            java.lang.Object r1 = r12.f20853p
            w5.B r1 = (w5.InterfaceC1765B) r1
            android.support.v4.media.session.b.K(r13)     // Catch: java.lang.Throwable -> L18
        L16:
            r13 = r1
            goto L32
        L18:
            r0 = move-exception
            r13 = r0
            goto L7b
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.f20853p
            w5.B r1 = (w5.InterfaceC1765B) r1
            android.support.v4.media.session.b.K(r13)     // Catch: java.lang.Throwable -> L18
            goto L4e
        L2b:
            android.support.v4.media.session.b.K(r13)
            java.lang.Object r13 = r12.f20853p
            w5.B r13 = (w5.InterfaceC1765B) r13
        L32:
            c5.i r1 = r13.g()     // Catch: java.lang.Throwable -> L18
            boolean r1 = w5.AbstractC1767D.r(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L76
            java.lang.Object r1 = r2.f482f     // Catch: java.lang.Throwable -> L18
            y5.c r1 = (y5.c) r1     // Catch: java.lang.Throwable -> L18
            r12.f20853p = r13     // Catch: java.lang.Throwable -> L18
            r12.f20852o = r10     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.a(r12)     // Catch: java.lang.Throwable -> L18
            if (r1 != r0) goto L4b
            goto L75
        L4b:
            r11 = r1
            r1 = r13
            r13 = r11
        L4e:
            r4 = r13
            z.a0 r4 = (z.C2026a0) r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r2.f481e     // Catch: java.lang.Throwable -> L18
            n1.d r13 = (n1.d) r13     // Catch: java.lang.Throwable -> L18
            float r3 = z.Z.f20764a     // Catch: java.lang.Throwable -> L18
            float r5 = r13.v(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r2.f481e     // Catch: java.lang.Throwable -> L18
            n1.d r13 = (n1.d) r13     // Catch: java.lang.Throwable -> L18
            float r3 = z.Z.f20765b     // Catch: java.lang.Throwable -> L18
            float r6 = r13.v(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r2.f478b     // Catch: java.lang.Throwable -> L18
            r3 = r13
            z.P0 r3 = (z.P0) r3     // Catch: java.lang.Throwable -> L18
            r12.f20853p = r1     // Catch: java.lang.Throwable -> L18
            r12.f20852o = r9     // Catch: java.lang.Throwable -> L18
            r7 = r12
            java.lang.Object r13 = A3.b.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L18
            if (r13 != r0) goto L16
        L75:
            return r0
        L76:
            r2.f483g = r8
            Y4.o r13 = Y4.o.f8736a
            return r13
        L7b:
            r2.f483g = r8
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2040h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
