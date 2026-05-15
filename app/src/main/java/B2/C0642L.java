package b2;

import android.content.Context;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: b2.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0642L extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10079o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f10080p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Context f10081q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0651c f10082r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ A0.b f10083s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0642L(A0.b bVar, Context context, C0651c c0651c, c5.d dVar) {
        super(2, dVar);
        this.f10081q = context;
        this.f10082r = c0651c;
        this.f10083s = bVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0651c c0651c = this.f10082r;
        C0642L c0642l = new C0642L(this.f10083s, this.f10081q, c0651c, dVar);
        c0642l.f10080p = obj;
        return c0642l;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0642L) create((i2.o) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085 A[RETURN] */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r9.f10079o
            b2.c r2 = r9.f10082r
            Y4.o r3 = Y4.o.f8736a
            int r4 = r2.f10163a
            android.content.Context r5 = r9.f10081q
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L2f
            if (r1 == r8) goto L27
            if (r1 == r7) goto L23
            if (r1 != r6) goto L1b
            android.support.v4.media.session.b.K(r10)
            return r3
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            android.support.v4.media.session.b.K(r10)
            return r3
        L27:
            java.lang.Object r1 = r9.f10080p
            i2.o r1 = (i2.o) r1
            android.support.v4.media.session.b.K(r10)
            goto L46
        L2f:
            android.support.v4.media.session.b.K(r10)
            java.lang.Object r10 = r9.f10080p
            r1 = r10
            i2.o r1 = (i2.o) r1
            java.lang.String r10 = I0.c.q(r4)
            r9.f10080p = r1
            r9.f10079o = r8
            java.lang.Object r10 = r1.a(r5, r10, r9)
            if (r10 != r0) goto L46
            goto L84
        L46:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r8 = 0
            if (r10 != 0) goto L63
            b2.m r10 = new b2.m
            A0.b r4 = r9.f10083s
            r6 = 248(0xf8, float:3.48E-43)
            r10.<init>(r4, r2, r8, r6)
            r9.f10080p = r8
            r9.f10079o = r7
            java.lang.Object r10 = r1.b(r5, r10, r9)
            if (r10 != r0) goto L85
            goto L84
        L63:
            java.lang.String r10 = I0.c.q(r4)
            java.util.LinkedHashMap r1 = r1.f13407a
            java.lang.Object r10 = r1.get(r10)
            b2.m r10 = (b2.C0671m) r10
            java.lang.String r1 = "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession"
            m5.AbstractC1209k.d(r10, r1)
            r9.f10080p = r8
            r9.f10079o = r6
            b2.f r1 = b2.C0657f.f10175a
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto L81
            goto L82
        L81:
            r10 = r3
        L82:
            if (r10 != r0) goto L85
        L84:
            return r0
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0642L.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
