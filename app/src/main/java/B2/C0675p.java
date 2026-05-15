package b2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: b2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0675p implements c5.g {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ AtomicReference f10271o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ y5.p f10272p;

    public C0675p(AtomicReference atomicReference, y5.p pVar) {
        this.f10271o = atomicReference;
        this.f10272p = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n0.d r6, e5.AbstractC0865c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b2.C0674o
            if (r0 == 0) goto L13
            r0 = r7
            b2.o r0 = (b2.C0674o) r0
            int r1 = r0.f10245q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10245q = r1
            goto L18
        L13:
            b2.o r0 = new b2.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f10243o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f10245q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            android.support.v4.media.session.b.K(r7)
            goto L66
        L2f:
            android.support.v4.media.session.b.K(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f10271o
            y5.p r2 = r5.f10272p
            r0.f10245q = r3
            w5.k r4 = new w5.k
            c5.d r0 = I0.c.D(r0)
            r4.<init>(r3, r0)
            r4.r()
            B0.b r0 = new B0.b
            r3 = 21
            r0.<init>(r3, r2)
            r4.t(r0)
            java.lang.Object r7 = r7.getAndSet(r4)
            w5.j r7 = (w5.InterfaceC1791j) r7
            if (r7 == 0) goto L5a
            r0 = 0
            r7.l(r0)
        L5a:
            y5.o r2 = (y5.o) r2
            r2.k(r6)
            java.lang.Object r6 = r4.q()
            if (r6 != r1) goto L66
            return
        L66:
            A2.W r6 = new A2.W
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0675p.a(n0.d, e5.c):void");
    }

    @Override // c5.g
    public final c5.h getKey() {
        return C0683y.f10352o;
    }

    @Override // c5.i
    public final c5.i h(c5.i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // c5.i
    public final c5.i u(c5.h hVar) {
        return I0.c.H(this, hVar);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }
}
