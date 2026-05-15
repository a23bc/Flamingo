package R0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import e5.AbstractC0871i;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y5.b f6453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f6456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f6457s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g1 f6458t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y5.c f6459u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f6460v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ContentResolver contentResolver, Uri uri, g1 g1Var, y5.c cVar, Context context, c5.d dVar) {
        super(2, dVar);
        this.f6456r = contentResolver;
        this.f6457s = uri;
        this.f6458t = g1Var;
        this.f6459u = cVar;
        this.f6460v = context;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        y5.c cVar = this.f6459u;
        f1 f1Var = new f1(this.f6456r, this.f6457s, this.f6458t, cVar, this.f6460v, dVar);
        f1Var.f6455q = obj;
        return f1Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((InterfaceC2111f) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.f(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r10.f6454p
            R0.g1 r2 = r10.f6458t
            r3 = 2
            r4 = 1
            android.content.ContentResolver r5 = r10.f6456r
            if (r1 == 0) goto L30
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            y5.b r1 = r10.f6453o
            java.lang.Object r6 = r10.f6455q
            z5.f r6 = (z5.InterfaceC2111f) r6
            android.support.v4.media.session.b.K(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r1
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            y5.b r1 = r10.f6453o
            java.lang.Object r6 = r10.f6455q
            z5.f r6 = (z5.InterfaceC2111f) r6
            android.support.v4.media.session.b.K(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            android.support.v4.media.session.b.K(r11)
            java.lang.Object r11 = r10.f6455q
            z5.f r11 = (z5.InterfaceC2111f) r11
            android.net.Uri r1 = r10.f6457s
            r6 = 0
            r5.registerContentObserver(r1, r6, r2)
            y5.c r1 = r10.f6459u     // Catch: java.lang.Throwable -> L1c
            y5.b r6 = new y5.b     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f6455q = r11     // Catch: java.lang.Throwable -> L1c
            r10.f6453o = r6     // Catch: java.lang.Throwable -> L1c
            r10.f6454p = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r6.b(r10)     // Catch: java.lang.Throwable -> L1c
            if (r1 != r0) goto L51
            goto L7f
        L51:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r1.c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f6460v     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f6455q = r6     // Catch: java.lang.Throwable -> L1c
            r10.f6453o = r1     // Catch: java.lang.Throwable -> L1c
            r10.f6454p = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.f(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L19
        L7f:
            return r0
        L80:
            r5.unregisterContentObserver(r2)
            Y4.o r11 = Y4.o.f8736a
            return r11
        L86:
            r5.unregisterContentObserver(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
