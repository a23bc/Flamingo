package z;

import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public C1220v f20637o;

    /* JADX INFO: renamed from: p */
    public int f20638p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f20639q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1220v f20640r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ J f20641s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C1220v c1220v, J j3, c5.d dVar) {
        super(2, dVar);
        this.f20640r = c1220v;
        this.f20641s = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        H h = new H(this.f20640r, this.f20641s, dVar);
        h.f20639q = obj;
        return h;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC1182c) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0041 -> B:53:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x004d -> B:52:0x0050). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r6.f20638p
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            m5.v r1 = r6.f20637o
            java.lang.Object r3 = r6.f20639q
            l5.c r3 = (l5.InterfaceC1182c) r3
            android.support.v4.media.session.b.K(r7)
            goto L50
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            android.support.v4.media.session.b.K(r7)
            java.lang.Object r7 = r6.f20639q
            l5.c r7 = (l5.InterfaceC1182c) r7
            r3 = r7
        L23:
            m5.v r1 = r6.f20640r
            java.lang.Object r7 = r1.f14439o
            boolean r4 = r7 instanceof z.C2060s
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof z.C2055p
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof z.C2057q
            r5 = 0
            if (r4 == 0) goto L37
            z.q r7 = (z.C2057q) r7
            goto L38
        L37:
            r7 = r5
        L38:
            if (r7 == 0) goto L3d
            r3.b(r7)
        L3d:
            z.J r7 = r6.f20641s
            y5.c r7 = r7.f20662I
            if (r7 == 0) goto L53
            r6.f20639q = r3
            r6.f20637o = r1
            r6.f20638p = r2
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = r7
            z.t r5 = (z.AbstractC2062t) r5
        L53:
            r1.f14439o = r5
            goto L23
        L56:
            Y4.o r7 = Y4.o.f8736a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z.H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
