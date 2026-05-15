package b2;

import android.content.Context;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TwoByTwoReceiver f10137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f10138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10142t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TwoByTwoReceiver f10143u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f10144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int[] f10145w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(TwoByTwoReceiver twoByTwoReceiver, Context context, int[] iArr, c5.d dVar) {
        super(2, dVar);
        this.f10143u = twoByTwoReceiver;
        this.f10144v = context;
        this.f10145w = iArr;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        Y y6 = new Y(this.f10143u, this.f10144v, this.f10145w, dVar);
        y6.f10142t = obj;
        return y6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004f -> B:13:0x0052). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r8.f10141s
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            int r1 = r8.f10140r
            int r3 = r8.f10139q
            android.content.Context r4 = r8.f10138p
            yos.music.player.appwidget.layout.TwoByTwoReceiver r5 = r8.f10137o
            java.lang.Object r6 = r8.f10142t
            int[] r6 = (int[]) r6
            android.support.v4.media.session.b.K(r9)
            goto L52
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            android.support.v4.media.session.b.K(r9)
            java.lang.Object r9 = r8.f10142t
            w5.B r9 = (w5.InterfaceC1765B) r9
            yos.music.player.appwidget.layout.TwoByTwoReceiver r1 = r8.f10143u
            android.content.Context r3 = r8.f10144v
            yos.music.player.appwidget.layout.TwoByTwoReceiver.a(r1, r9, r3)
            int[] r9 = r8.f10145w
            int r4 = r9.length
            r5 = 0
            r6 = r5
            r5 = r1
            r1 = r4
            r4 = r3
            r3 = r6
            r6 = r9
        L39:
            if (r3 >= r1) goto L54
            r9 = r6[r3]
            A0.b r7 = r5.f20579b
            r8.f10142t = r6
            r8.f10137o = r5
            r8.f10138p = r4
            r8.f10139q = r3
            r8.f10140r = r1
            r8.f10141s = r2
            java.lang.Object r9 = r7.P(r4, r9, r8)
            if (r9 != r0) goto L52
            return r0
        L52:
            int r3 = r3 + r2
            goto L39
        L54:
            Y4.o r9 = Y4.o.f8736a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
