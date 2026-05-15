package X;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0505y f7908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f7909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f7910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b1.L f7911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K0 f7912t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B2.m f7913u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(C0505y c0505y, String str, long j3, b1.L l, K0 k02, B2.m mVar, c5.d dVar) {
        super(2, dVar);
        this.f7908p = c0505y;
        this.f7909q = str;
        this.f7910r = j3;
        this.f7911s = l;
        this.f7912t = k02;
        this.f7913u = mVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new G0(this.f7908p, this.f7909q, this.f7910r, this.f7911s, this.f7912t, this.f7913u, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r8.f7907o
            java.lang.String r7 = r8.f7909q
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            android.support.v4.media.session.b.K(r9)
            goto L47
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            android.support.v4.media.session.b.K(r9)
            r8.f7907o = r2
            X.y r5 = r8.f7908p
            r5.getClass()
            int r9 = r7.length()
            r1 = 0
            if (r9 != 0) goto L29
            goto L31
        L29:
            long r3 = r8.f7910r
            boolean r9 = b1.L.c(r3)
            if (r9 == 0) goto L33
        L31:
            r9 = r1
            goto L44
        L33:
            X.x r2 = new X.x
            r6 = 0
            r2.<init>(r3, r5, r6, r7)
            X.w r9 = new X.w
            r9.<init>(r5, r2, r1)
            c5.i r1 = r5.f8205a
            java.lang.Object r9 = w5.AbstractC1767D.C(r1, r9, r8)
        L44:
            if (r9 != r0) goto L47
            return r0
        L47:
            b1.L r9 = (b1.L) r9
            Y4.o r0 = Y4.o.f8736a
            if (r9 == 0) goto L99
            long r1 = r9.f9945a
            r9 = 32
            long r3 = r1 >> r9
            int r9 = (int) r3
            B2.m r3 = r8.f7913u
            r3.b(r9)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            int r1 = (int) r1
            r3.b(r1)
            long r1 = b1.AbstractC0607C.b(r9, r1)
            b1.L r9 = r8.f7911s
            boolean r9 = b1.L.a(r1, r9)
            if (r9 != 0) goto L99
            X.K0 r9 = r8.f7912t
            g1.v r4 = r9.m()
            b1.g r4 = r4.f12384a
            java.lang.String r4 = r4.f9970p
            boolean r4 = m5.AbstractC1209k.a(r4, r7)
            if (r4 == 0) goto L99
            B2.m r4 = r9.f7940b
            if (r3 != r4) goto L99
            l5.c r3 = r9.f7941c
            g1.v r4 = r9.m()
            b1.g r4 = r4.f12384a
            g1.v r4 = X.K0.e(r4, r1)
            r3.b(r4)
            b1.L r3 = new b1.L
            r3.<init>(r1)
            r9.f7958v = r3
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
