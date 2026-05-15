package x;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1818F extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public long f19626o;

    /* JADX INFO: renamed from: p */
    public long f19627p;

    /* JADX INFO: renamed from: q */
    public int f19628q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1820G f19629r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f19630s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818F(C1820G c1820g, long j3, c5.d dVar) {
        super(2, dVar);
        this.f19629r = c1820g;
        this.f19630s = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1818F(this.f19629r, this.f19630s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1818F) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        if (w5.AbstractC1767D.i(r5 - r7, r11) == r0) goto L39;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r11.f19628q
            r2 = 2
            x.G r3 = r11.f19629r
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            android.support.v4.media.session.b.K(r12)
            goto L5b
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            long r5 = r11.f19627p
            long r7 = r11.f19626o
            android.support.v4.media.session.b.K(r12)
            goto L43
        L22:
            android.support.v4.media.session.b.K(r12)
            f0.a1 r12 = R0.AbstractC0403q0.f6518s
            java.lang.Object r12 = Q0.AbstractC0347f.i(r3, r12)
            R0.S0 r12 = (R0.S0) r12
            r12.getClass()
            long r5 = r12.b()
            r7 = 40
            r11.f19626o = r7
            r11.f19627p = r5
            r11.f19628q = r4
            java.lang.Object r12 = w5.AbstractC1767D.i(r7, r11)
            if (r12 != r0) goto L43
            goto L5a
        L43:
            t.C r12 = r3.f19646d0
            long r9 = r11.f19630s
            java.lang.Object r12 = r12.e(r9)
            x.B r12 = (x.C1810B) r12
            if (r12 == 0) goto L51
            r12.f19603b = r4
        L51:
            long r5 = r5 - r7
            r11.f19628q = r2
            java.lang.Object r12 = w5.AbstractC1767D.i(r5, r11)
            if (r12 != r0) goto L5b
        L5a:
            return r0
        L5b:
            l5.a r12 = r3.f19796K
            r12.a()
            Y4.o r12 = Y4.o.f8736a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1818F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
