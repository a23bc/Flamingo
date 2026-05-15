package b6;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosPlaybackService f10505p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(YosPlaybackService yosPlaybackService, c5.d dVar) {
        super(2, dVar);
        this.f10505p = yosPlaybackService;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new y(this.f10505p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (w5.AbstractC1767D.C(r6, r1, r5) == r0) goto L15;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r5.f10504o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            android.support.v4.media.session.b.K(r6)
            goto L3f
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            android.support.v4.media.session.b.K(r6)
            goto L2a
        L1c:
            android.support.v4.media.session.b.K(r6)
            r5.f10504o = r3
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = w5.AbstractC1767D.i(r3, r5)
            if (r6 != r0) goto L2a
            goto L3e
        L2a:
            D5.e r6 = w5.M.f19497a
            x5.d r6 = B5.n.f912a
            b6.x r1 = new b6.x
            yos.music.player.logic.YosPlaybackService r3 = r5.f10505p
            r4 = 0
            r1.<init>(r3, r4)
            r5.f10504o = r2
            java.lang.Object r6 = w5.AbstractC1767D.C(r6, r1, r5)
            if (r6 != r0) goto L3f
        L3e:
            return r0
        L3f:
            Y4.o r6 = Y4.o.f8736a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
