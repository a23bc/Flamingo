package x;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1851g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public B.n f19735o;

    /* JADX INFO: renamed from: p */
    public int f19736p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1885x f19737q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long f19738r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ B.k f19739s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851g(C1885x c1885x, long j3, B.k kVar, c5.d dVar) {
        super(2, dVar);
        this.f19737q = c1885x;
        this.f19738r = j3;
        this.f19739s = kVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1851g(this.f19737q, this.f19738r, this.f19739s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1851g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0059, code lost:
    
        if (r2.a(r1, r7) != r0) goto L48;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r7.f19736p
            B.k r2 = r7.f19739s
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            android.support.v4.media.session.b.K(r8)
            goto L5c
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            B.n r1 = r7.f19735o
            android.support.v4.media.session.b.K(r8)
            goto L50
        L23:
            android.support.v4.media.session.b.K(r8)
            goto L39
        L27:
            android.support.v4.media.session.b.K(r8)
            x.x r8 = r7.f19737q
            w5.w0 r8 = r8.f19807V
            if (r8 == 0) goto L39
            r7.f19736p = r5
            java.lang.Object r8 = w5.AbstractC1767D.g(r8, r7)
            if (r8 != r0) goto L39
            goto L5b
        L39:
            B.m r8 = new B.m
            long r5 = r7.f19738r
            r8.<init>(r5)
            B.n r1 = new B.n
            r1.<init>(r8)
            r7.f19735o = r1
            r7.f19736p = r4
            java.lang.Object r8 = r2.a(r8, r7)
            if (r8 != r0) goto L50
            goto L5b
        L50:
            r8 = 0
            r7.f19735o = r8
            r7.f19736p = r3
            java.lang.Object r8 = r2.a(r1, r7)
            if (r8 != r0) goto L5c
        L5b:
            return r0
        L5c:
            Y4.o r8 = Y4.o.f8736a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1851g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
