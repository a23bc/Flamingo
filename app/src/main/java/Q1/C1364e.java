package q1;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: q1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1364e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f15461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1368i f15462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f15463r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364e(boolean z6, AbstractC1368i abstractC1368i, long j3, c5.d dVar) {
        super(2, dVar);
        this.f15461p = z6;
        this.f15462q = abstractC1368i;
        this.f15463r = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1364e(this.f15461p, this.f15462q, this.f15463r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1364e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r11 == r0) goto L18;
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
            int r1 = r10.f15460o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r11)
            goto L4d
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            android.support.v4.media.session.b.K(r11)
            r6 = r10
            goto L37
        L1d:
            android.support.v4.media.session.b.K(r11)
            q1.i r11 = r10.f15462q
            boolean r1 = r10.f15461p
            if (r1 != 0) goto L3d
            r10.f15460o = r3
            r5 = 0
            long r7 = r10.f15463r
            J0.d r4 = r11.f15486o
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L37
            goto L4c
        L37:
            n1.r r11 = (n1.r) r11
            r11.getClass()
            goto L52
        L3d:
            r6 = r10
            r6.f15460o = r2
            long r2 = r6.f15463r
            r4 = 0
            J0.d r1 = r11.f15486o
            java.lang.Object r11 = r1.a(r2, r4, r6)
            if (r11 != r0) goto L4d
        L4c:
            return r0
        L4d:
            n1.r r11 = (n1.r) r11
            r11.getClass()
        L52:
            Y4.o r11 = Y4.o.f8736a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C1364e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
