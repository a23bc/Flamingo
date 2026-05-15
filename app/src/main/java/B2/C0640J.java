package b2;

import android.content.Context;
import android.os.Bundle;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: b2.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0640J extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f10068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0651c f10069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A0.b f10070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f10071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f10072u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0640J(Context context, C0651c c0651c, A0.b bVar, Bundle bundle, l5.f fVar, c5.d dVar) {
        super(2, dVar);
        this.f10068q = context;
        this.f10069r = c0651c;
        this.f10070s = bVar;
        this.f10071t = bundle;
        this.f10072u = (AbstractC0871i) fVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        ?? r52 = this.f10072u;
        C0640J c0640j = new C0640J(this.f10068q, this.f10069r, this.f10070s, this.f10071t, r52, dVar);
        c0640j.f10067p = obj;
        return c0640j;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0640J) create((i2.o) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r11.f10072u.d(r1, r12, r11) != r0) goto L24;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r11.f10066o
            b2.c r2 = r11.f10069r
            int r3 = r2.f10163a
            android.content.Context r4 = r11.f10068q
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L32
            if (r1 == r7) goto L2a
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            android.support.v4.media.session.b.K(r12)
            goto L88
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            java.lang.Object r1 = r11.f10067p
            i2.o r1 = (i2.o) r1
            android.support.v4.media.session.b.K(r12)
            goto L69
        L2a:
            java.lang.Object r1 = r11.f10067p
            i2.o r1 = (i2.o) r1
            android.support.v4.media.session.b.K(r12)
            goto L4b
        L32:
            android.support.v4.media.session.b.K(r12)
            java.lang.Object r12 = r11.f10067p
            i2.o r12 = (i2.o) r12
            java.lang.String r1 = I0.c.q(r3)
            r11.f10067p = r12
            r11.f10066o = r7
            java.lang.Object r1 = r12.a(r4, r1, r11)
            if (r1 != r0) goto L48
            goto L87
        L48:
            r10 = r1
            r1 = r12
            r12 = r10
        L4b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L69
            b2.m r12 = new b2.m
            android.os.Bundle r7 = r11.f10071t
            A0.b r8 = r11.f10070s
            r9 = 248(0xf8, float:3.48E-43)
            r12.<init>(r8, r2, r7, r9)
            r11.f10067p = r1
            r11.f10066o = r6
            java.lang.Object r12 = r1.b(r4, r12, r11)
            if (r12 != r0) goto L69
            goto L87
        L69:
            java.lang.String r12 = I0.c.q(r3)
            java.util.LinkedHashMap r2 = r1.f13407a
            java.lang.Object r12 = r2.get(r12)
            b2.m r12 = (b2.C0671m) r12
            java.lang.String r2 = "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession"
            m5.AbstractC1209k.d(r12, r2)
            r2 = 0
            r11.f10067p = r2
            r11.f10066o = r5
            e5.i r2 = r11.f10072u
            java.lang.Object r12 = r2.d(r1, r12, r11)
            if (r12 != r0) goto L88
        L87:
            return r0
        L88:
            Y4.o r12 = Y4.o.f8736a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0640J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
