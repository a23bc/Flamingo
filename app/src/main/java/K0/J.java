package K0;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f3835o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ long f3836p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ L f3837q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(long j3, L l, c5.d dVar) {
        super(2, dVar);
        this.f3836p = j3;
        this.f3837q = l;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new J(this.f3836p, this.f3837q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
    
        if (w5.AbstractC1767D.i(8, r10) == r0) goto L36;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r10.f3835o
            r2 = 8
            long r4 = r10.f3836p
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            android.support.v4.media.session.b.K(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            android.support.v4.media.session.b.K(r11)
            goto L2e
        L20:
            android.support.v4.media.session.b.K(r11)
            long r8 = r4 - r2
            r10.f3835o = r7
            java.lang.Object r11 = w5.AbstractC1767D.i(r8, r10)
            if (r11 != r0) goto L2e
            goto L36
        L2e:
            r10.f3835o = r6
            java.lang.Object r11 = w5.AbstractC1767D.i(r2, r10)
            if (r11 != r0) goto L37
        L36:
            return r0
        L37:
            K0.L r11 = r10.f3837q
            w5.k r11 = r11.f3843q
            if (r11 == 0) goto L49
            K0.o r0 = new K0.o
            r0.<init>(r4)
            Y4.j r0 = android.support.v4.media.session.b.l(r0)
            r11.resumeWith(r0)
        L49:
            Y4.o r11 = Y4.o.f8736a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
