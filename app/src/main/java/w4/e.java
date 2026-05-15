package w4;

import Y4.o;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f19453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f19454q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, f fVar, c5.d dVar) {
        super(2, dVar);
        this.f19453p = obj;
        this.f19454q = fVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new e(this.f19453p, this.f19454q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Y4.e, java.lang.Object] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r9.f19452o
            Y4.o r2 = Y4.o.f8736a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            android.support.v4.media.session.b.K(r10)
            return r2
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            android.support.v4.media.session.b.K(r10)
            return r2
        L1e:
            android.support.v4.media.session.b.K(r10)
            java.lang.Object r10 = w4.b.f19444a
            java.lang.Object r10 = r9.f19453p
            l5.c r1 = w4.b.b(r10)
            java.lang.String r5 = "msg"
            java.lang.String r6 = " -> "
            w4.f r7 = r9.f19454q
            if (r1 == 0) goto L71
            java.lang.Object r1 = r1.b(r10)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = w4.f.f19455t
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "saveConvertedData(async: true): "
            r3.<init>(r8)
            r7.getClass()
            java.lang.String r8 = r7.f19457p
            r3.append(r8)
            r3.append(r6)
            r3.append(r10)
            java.lang.String r10 = "(as "
            r3.append(r10)
            r10 = 41
            java.lang.String r10 = Z1.l.s(r3, r1, r10)
            java.lang.Object r3 = w4.f.f19455t
            java.lang.Object r3 = r3.getValue()
            w4.c r3 = (w4.c) r3
            r3.getClass()
            m5.AbstractC1209k.f(r10, r5)
            r9.f19452o = r4
            L2.a r10 = r7.f19456o
            r10.q(r1, r8)
            if (r2 != r0) goto La4
            goto La3
        L71:
            java.lang.Object r1 = w4.f.f19455t
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "saveData(async: true): "
            r1.<init>(r4)
            r7.getClass()
            java.lang.String r4 = r7.f19457p
            r1.append(r4)
            r1.append(r6)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.Object r6 = w4.f.f19455t
            java.lang.Object r6 = r6.getValue()
            w4.c r6 = (w4.c) r6
            r6.getClass()
            m5.AbstractC1209k.f(r1, r5)
            r9.f19452o = r3
            L2.a r1 = r7.f19456o
            r1.q(r10, r4)
            if (r2 != r0) goto La4
        La3:
            return r0
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
