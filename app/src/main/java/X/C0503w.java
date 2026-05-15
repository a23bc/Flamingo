package X;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: X.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0503w extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E5.a f8185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0505y f8186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8187q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0505y f8188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f8189s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0503w(C0505y c0505y, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f8188r = c0505y;
        this.f8189s = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0503w(this.f8188r, this.f8189s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0503w) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v9, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r9.f8187q
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            android.support.v4.media.session.b.K(r10)
            return r10
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            E5.a r1 = r9.f8185o
            android.support.v4.media.session.b.K(r10)     // Catch: java.lang.Throwable -> L22
            goto L68
        L22:
            r10 = move-exception
            goto L89
        L25:
            X.y r1 = r9.f8186p
            E5.a r4 = r9.f8185o
            android.support.v4.media.session.b.K(r10)
            r10 = r4
            goto L42
        L2e:
            android.support.v4.media.session.b.K(r10)
            X.y r1 = r9.f8188r
            E5.d r10 = r1.f8209e
            r9.f8185o = r10
            r9.f8186p = r1
            r9.f8187q = r4
            java.lang.Object r4 = r10.d(r9)
            if (r4 != r0) goto L42
            goto L87
        L42:
            android.view.textclassifier.TextClassifier r4 = r1.f8210f     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L51
            boolean r6 = X.AbstractC0496q.w(r4)     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L6d
            goto L51
        L4d:
            r0 = move-exception
            r1 = r10
            r10 = r0
            goto L89
        L51:
            X.v r4 = new X.v     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L4d
            r9.f8185o = r10     // Catch: java.lang.Throwable -> L4d
            r9.f8186p = r5     // Catch: java.lang.Throwable -> L4d
            r9.f8187q = r3     // Catch: java.lang.Throwable -> L4d
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r1 = w5.AbstractC1767D.D(r6, r4, r9)     // Catch: java.lang.Throwable -> L4d
            if (r1 != r0) goto L65
            goto L87
        L65:
            r8 = r1
            r1 = r10
            r10 = r8
        L68:
            android.view.textclassifier.TextClassifier r4 = A2.AbstractC0002c.p(r10)     // Catch: java.lang.Throwable -> L22
            r10 = r1
        L6d:
            E5.d r10 = (E5.d) r10
            r10.f(r5)
            X.u r10 = new X.u
            e5.i r1 = r9.f8189s
            r10.<init>(r4, r1, r5)
            r9.f8185o = r5
            r9.f8186p = r5
            r9.f8187q = r2
            r1 = 200(0xc8, double:9.9E-322)
            java.lang.Object r10 = w5.AbstractC1767D.D(r1, r10, r9)
            if (r10 != r0) goto L88
        L87:
            return r0
        L88:
            return r10
        L89:
            E5.d r1 = (E5.d) r1
            r1.f(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0503w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
