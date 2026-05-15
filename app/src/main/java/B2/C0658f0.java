package b2;

import e5.AbstractC0871i;

/* JADX INFO: renamed from: b2.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658f0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10176o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f10177p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0660g0 f10178q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0651c f10179r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ A0.b f10180s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0658f0(C0660g0 c0660g0, C0651c c0651c, A0.b bVar, c5.d dVar) {
        super(2, dVar);
        this.f10178q = c0660g0;
        this.f10179r = c0651c;
        this.f10180s = bVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0658f0 c0658f0 = new C0658f0(this.f10178q, this.f10179r, this.f10180s, dVar);
        c0658f0.f10177p = obj;
        return c0658f0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0658f0) create((i2.o) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0088 A[RETURN] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r10.f10176o
            b2.g0 r2 = r10.f10178q
            b2.c r3 = r10.f10179r
            r4 = 0
            androidx.glance.appwidget.GlanceRemoteViewsService r2 = r2.f10182a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L32
            if (r1 == r7) goto L2a
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            android.support.v4.media.session.b.K(r11)
            return r11
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            java.lang.Object r1 = r10.f10177p
            i2.o r1 = (i2.o) r1
            android.support.v4.media.session.b.K(r11)
            goto L6a
        L2a:
            java.lang.Object r1 = r10.f10177p
            i2.o r1 = (i2.o) r1
            android.support.v4.media.session.b.K(r11)
            goto L4d
        L32:
            android.support.v4.media.session.b.K(r11)
            java.lang.Object r11 = r10.f10177p
            i2.o r11 = (i2.o) r11
            int r1 = r3.f10163a
            java.lang.String r1 = I0.c.q(r1)
            r10.f10177p = r11
            r10.f10176o = r7
            java.lang.Object r1 = r11.a(r2, r1, r10)
            if (r1 != r0) goto L4a
            goto L87
        L4a:
            r9 = r1
            r1 = r11
            r11 = r9
        L4d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L56
            return r4
        L56:
            b2.m r11 = new b2.m
            A0.b r7 = r10.f10180s
            r8 = 252(0xfc, float:3.53E-43)
            r11.<init>(r7, r3, r4, r8)
            r10.f10177p = r1
            r10.f10176o = r6
            java.lang.Object r11 = r1.b(r2, r11, r10)
            if (r11 != r0) goto L6a
            goto L87
        L6a:
            int r11 = r3.f10163a
            java.lang.String r11 = I0.c.q(r11)
            java.util.LinkedHashMap r1 = r1.f13407a
            java.lang.Object r11 = r1.get(r11)
            b2.m r11 = (b2.C0671m) r11
            java.lang.String r1 = "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession"
            m5.AbstractC1209k.d(r11, r1)
            r10.f10177p = r4
            r10.f10176o = r5
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r0) goto L88
        L87:
            return r0
        L88:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0658f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
