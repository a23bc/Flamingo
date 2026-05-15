package x;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import z.C2054o0;

/* JADX INFO: renamed from: x.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1847e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f19725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2054o0 f19726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f19727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.k f19728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC1869p f19729u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1847e(C2054o0 c2054o0, long j3, B.k kVar, AbstractC1869p abstractC1869p, c5.d dVar) {
        super(2, dVar);
        this.f19726r = c2054o0;
        this.f19727s = j3;
        this.f19728t = kVar;
        this.f19729u = abstractC1869p;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1847e c1847e = new C1847e(this.f19726r, this.f19727s, this.f19728t, this.f19729u, dVar);
        c1847e.f19725q = obj;
        return c1847e;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1847e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r10.a(r2, r17) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (r10.a(r4, r17) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f19724p
            r3 = 0
            r4 = 3
            x.p r5 = r0.f19729u
            r6 = 5
            r7 = 4
            r8 = 2
            r9 = 1
            B.k r10 = r0.f19728t
            if (r2 == 0) goto L43
            if (r2 == r9) goto L39
            if (r2 == r8) goto L33
            if (r2 == r4) goto L2a
            if (r2 == r7) goto L25
            if (r2 != r6) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            android.support.v4.media.session.b.K(r18)
            goto Lc3
        L2a:
            java.lang.Object r2 = r0.f19725q
            B.n r2 = (B.n) r2
            android.support.v4.media.session.b.K(r18)
            goto L9c
        L33:
            boolean r2 = r0.f19723o
            android.support.v4.media.session.b.K(r18)
            goto L82
        L39:
            java.lang.Object r2 = r0.f19725q
            w5.g0 r2 = (w5.InterfaceC1786g0) r2
            android.support.v4.media.session.b.K(r18)
            r9 = r18
            goto L68
        L43:
            android.support.v4.media.session.b.K(r18)
            java.lang.Object r2 = r0.f19725q
            w5.B r2 = (w5.InterfaceC1765B) r2
            x.d r11 = new x.d
            x.p r12 = r0.f19729u
            long r13 = r0.f19727s
            B.k r15 = r0.f19728t
            r16 = 0
            r11.<init>(r12, r13, r15, r16)
            w5.w0 r2 = w5.AbstractC1767D.t(r2, r3, r11, r4)
            r0.f19725q = r2
            r0.f19724p = r9
            z.o0 r9 = r0.f19726r
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto L68
            goto Lc2
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            boolean r11 = r2.b()
            if (r11 == 0) goto La7
            r0.f19725q = r3
            r0.f19723o = r9
            r0.f19724p = r8
            java.lang.Object r2 = w5.AbstractC1767D.g(r2, r0)
            if (r2 != r1) goto L81
            goto Lc2
        L81:
            r2 = r9
        L82:
            if (r2 == 0) goto Lc3
            B.m r2 = new B.m
            long r8 = r0.f19727s
            r2.<init>(r8)
            B.n r6 = new B.n
            r6.<init>(r2)
            r0.f19725q = r6
            r0.f19724p = r4
            java.lang.Object r2 = r10.a(r2, r0)
            if (r2 != r1) goto L9b
            goto Lc2
        L9b:
            r2 = r6
        L9c:
            r0.f19725q = r3
            r0.f19724p = r7
            java.lang.Object r2 = r10.a(r2, r0)
            if (r2 != r1) goto Lc3
            goto Lc2
        La7:
            B.m r2 = r5.f19801P
            if (r2 == 0) goto Lc3
            if (r9 == 0) goto Lb3
            B.n r4 = new B.n
            r4.<init>(r2)
            goto Lb8
        Lb3:
            B.l r4 = new B.l
            r4.<init>(r2)
        Lb8:
            r0.f19725q = r3
            r0.f19724p = r6
            java.lang.Object r2 = r10.a(r4, r0)
            if (r2 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            r5.f19801P = r3
            Y4.o r1 = Y4.o.f8736a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1847e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
