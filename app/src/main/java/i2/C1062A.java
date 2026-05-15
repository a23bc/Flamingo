package i2;

import android.content.Context;
import b2.C0671m;
import b2.y0;
import e5.AbstractC0871i;
import f0.B0;
import f0.EnumC0917v0;
import m5.C1219u;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: i2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062A extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0671m f13295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B0 f13296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1219u f13297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z5.J f13298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f13299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y0 f13300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ K f13301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ I f13302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f13303y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1062A(C0671m c0671m, B0 b0, C1219u c1219u, z5.J j3, Context context, y0 y0Var, K k7, I i7, InterfaceC1765B interfaceC1765B, c5.d dVar) {
        super(2, dVar);
        this.f13295q = c0671m;
        this.f13296r = b0;
        this.f13297s = c1219u;
        this.f13298t = j3;
        this.f13299u = context;
        this.f13300v = y0Var;
        this.f13301w = k7;
        this.f13302x = i7;
        this.f13303y = interfaceC1765B;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1062A c1062a = new C1062A(this.f13295q, this.f13296r, this.f13297s, this.f13298t, this.f13299u, this.f13300v, this.f13301w, this.f13302x, this.f13303y, dVar);
        c1062a.f13294p = obj;
        return c1062a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1062A) create((EnumC0917v0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r2 == r0) goto L27;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r12.f13293o
            Y4.o r2 = Y4.o.f8736a
            m5.u r3 = r12.f13297s
            f0.B0 r4 = r12.f13296r
            z5.J r5 = r12.f13298t
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L24
            if (r1 == r7) goto L20
            if (r1 != r6) goto L18
            android.support.v4.media.session.b.K(r13)
            goto L7c
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            android.support.v4.media.session.b.K(r13)
            goto L5e
        L24:
            android.support.v4.media.session.b.K(r13)
            java.lang.Object r13 = r12.f13294p
            f0.v0 r13 = (f0.EnumC0917v0) r13
            int r13 = r13.ordinal()
            if (r13 == 0) goto L8a
            r1 = 4
            if (r13 == r1) goto L35
            return r2
        L35:
            long r8 = r4.f11621a
            long r10 = r3.f14438o
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 > 0) goto L49
            java.lang.Object r13 = r5.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L85
        L49:
            b2.y0 r13 = r12.f13300v
            Z1.i r13 = r13.a()
            Z1.k r13 = (Z1.k) r13
            r12.f13293o = r7
            b2.m r1 = r12.f13295q
            android.content.Context r7 = r12.f13299u
            java.lang.Object r13 = r1.b(r7, r13, r12)
            if (r13 != r0) goto L5e
            goto L7b
        L5e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.Object r1 = r5.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L85
            if (r13 == 0) goto L85
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r12.f13293o = r6
            r5.f(r13, r12)
            if (r2 != r0) goto L7c
        L7b:
            return r0
        L7c:
            i2.I r13 = r12.f13302x
            long r0 = r13.f13325a
            i2.K r13 = r12.f13301w
            r13.b(r0)
        L85:
            long r0 = r4.f11621a
            r3.f14438o = r0
            return r2
        L8a:
            r13 = 0
            w5.B r0 = r12.f13303y
            w5.AbstractC1767D.f(r0, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C1062A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
