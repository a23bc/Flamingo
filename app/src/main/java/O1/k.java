package O1;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f5533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ U3.h f5535q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(U3.h hVar, c5.d dVar) {
        super(2, dVar);
        this.f5535q = hVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new k(this.f5535q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r1.invoke(r7, r6) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[PHI: r1 r7
  0x004c: PHI (r1v1 O1.p) = (r1v3 O1.p), (r1v4 O1.p) binds: [B:13:0x0049, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r7v5 java.lang.Object) = (r7v13 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0049, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f5534p
            r2 = 2
            r3 = 1
            U3.h r4 = r6.f5535q
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            android.support.v4.media.session.b.K(r7)
            goto L58
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            O1.p r1 = r6.f5533o
            android.support.v4.media.session.b.K(r7)
            goto L4c
        L20:
            android.support.v4.media.session.b.K(r7)
            java.lang.Object r7 = r4.f7045r
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L65
        L2d:
            java.lang.Object r7 = r4.f7042o
            w5.B r7 = (w5.InterfaceC1765B) r7
            c5.i r7 = r7.g()
            w5.AbstractC1767D.j(r7)
            java.lang.Object r7 = r4.f7043p
            r1 = r7
            O1.p r1 = (O1.p) r1
            java.lang.Object r7 = r4.f7044q
            y5.c r7 = (y5.c) r7
            r6.f5533o = r1
            r6.f5534p = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L4c
            goto L57
        L4c:
            r5 = 0
            r6.f5533o = r5
            r6.f5534p = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L58
        L57:
            return r0
        L58:
            java.lang.Object r7 = r4.f7045r
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            Y4.o r7 = Y4.o.f8736a
            return r7
        L65:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
