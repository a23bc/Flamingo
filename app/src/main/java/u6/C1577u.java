package u6;

import e5.AbstractC0871i;
import f0.C0886f0;
import f0.C0894j0;
import l5.InterfaceC1182c;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: u6.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1577u extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f17864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1670c f17865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f17866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w.S f17867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0894j0 f17868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f17870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f17871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0.s f17872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17873y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1577u(long j3, C1670c c1670c, float f7, w.S s7, C0894j0 c0894j0, int i7, int i8, C0886f0 c0886f0, p0.s sVar, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f17864p = j3;
        this.f17865q = c1670c;
        this.f17866r = f7;
        this.f17867s = s7;
        this.f17868t = c0894j0;
        this.f17869u = i7;
        this.f17870v = i8;
        this.f17871w = c0886f0;
        this.f17872x = sVar;
        this.f17873y = interfaceC1182c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1577u(this.f17864p, this.f17865q, this.f17866r, this.f17867s, this.f17868t, this.f17869u, this.f17870v, this.f17871w, this.f17872x, this.f17873y, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1577u) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (w.C1670c.c(r12.f17865q, r4, r12.f17867s, null, r5, r12, 4) == r0) goto L15;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r12.f17863o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r13)
            goto L53
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            android.support.v4.media.session.b.K(r13)
            goto L2a
        L1c:
            android.support.v4.media.session.b.K(r13)
            r12.f17863o = r3
            long r3 = r12.f17864p
            java.lang.Object r13 = w5.AbstractC1767D.i(r3, r12)
            if (r13 != r0) goto L2a
            goto L52
        L2a:
            java.lang.Float r4 = new java.lang.Float
            float r13 = r12.f17866r
            r4.<init>(r13)
            D.p r5 = new D.p
            p0.s r10 = r12.f17872x
            l5.c r11 = r12.f17873y
            f0.j0 r6 = r12.f17868t
            int r7 = r12.f17869u
            int r8 = r12.f17870v
            f0.f0 r9 = r12.f17871w
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.f17863o = r2
            w.c r3 = r12.f17865q
            r7 = r5
            w.S r5 = r12.f17867s
            r6 = 0
            r9 = 4
            r8 = r12
            java.lang.Object r13 = w.C1670c.c(r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L53
        L52:
            return r0
        L53:
            Y4.o r13 = Y4.o.f8736a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C1577u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
