package S;

import Y4.o;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f6712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h f6714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T.f f6715r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, T.f fVar, c5.d dVar) {
        super(2, dVar);
        this.f6714q = hVar;
        this.f6715r = fVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new g(this.f6714q, this.f6715r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Type inference failed for: r9v3, types: [e5.i, l5.c] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r8.f6713p
            Y4.o r2 = Y4.o.f8736a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            S.h r7 = r8.f6714q
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2e
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Throwable r0 = r8.f6712o
            android.support.v4.media.session.b.K(r9)
            goto L69
        L24:
            android.support.v4.media.session.b.K(r9)
            goto L59
        L28:
            android.support.v4.media.session.b.K(r9)     // Catch: java.lang.Throwable -> L2c
            goto L4d
        L2c:
            r9 = move-exception
            goto L5a
        L2e:
            android.support.v4.media.session.b.K(r9)     // Catch: java.lang.Throwable -> L2c
            goto L42
        L32:
            android.support.v4.media.session.b.K(r9)
            e5.i r9 = r7.f6717F     // Catch: java.lang.Throwable -> L2c
            if (r9 == 0) goto L42
            r8.f6713p = r6     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r9.b(r8)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L42
            goto L67
        L42:
            T.f r9 = r8.f6715r     // Catch: java.lang.Throwable -> L2c
            r8.f6713p = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r9.a(r7, r8)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L4d
            goto L67
        L4d:
            X.B0 r9 = r7.f6718G
            if (r9 == 0) goto L59
            r8.f6713p = r4
            r9.b(r8)
            if (r2 != r0) goto L59
            goto L67
        L59:
            return r2
        L5a:
            X.B0 r1 = r7.f6718G
            if (r1 == 0) goto L6a
            r8.f6712o = r9
            r8.f6713p = r3
            r1.b(r8)
            if (r2 != r0) goto L68
        L67:
            return r0
        L68:
            r0 = r9
        L69:
            r9 = r0
        L6a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: S.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
