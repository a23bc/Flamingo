package h6;

import android.content.Context;
import e4.C0862k;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: h6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1024j extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f13076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f13077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0862k f13078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13079s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024j(YosMediaItem yosMediaItem, Context context, C0862k c0862k, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f13076p = yosMediaItem;
        this.f13077q = context;
        this.f13078r = c0862k;
        this.f13079s = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0862k c0862k = this.f13078r;
        return new C1024j(this.f13076p, this.f13077q, c0862k, this.f13079s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1024j) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r12 == r0) goto L18;
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r11.f13075o
            e4.k r2 = r11.f13078r
            android.content.Context r3 = r11.f13077q
            Y4.o r4 = Y4.o.f8736a
            r5 = 0
            yos.music.player.data.libraries.YosMediaItem r6 = r11.f13076p
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L25
            if (r1 == r8) goto L21
            if (r1 != r7) goto L19
            android.support.v4.media.session.b.K(r12)
            goto L57
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            android.support.v4.media.session.b.K(r12)
            goto L3a
        L25:
            android.support.v4.media.session.b.K(r12)
            android.net.Uri r12 = r6.getThumb()
            if (r12 != 0) goto L2f
            return r4
        L2f:
            r11.f13075o = r8
            r9 = 200(0xc8, double:9.9E-322)
            java.lang.Object r12 = w5.AbstractC1767D.i(r9, r11)
            if (r12 != r0) goto L3a
            goto L56
        L3a:
            p4.g r12 = new p4.g
            r12.<init>(r3)
            android.net.Uri r1 = r6.getThumb()
            r12.f15027c = r1
            p4.h r12 = r12.a()
            r11.f13075o = r7
            e4.g r1 = new e4.g
            r1.<init>(r5, r2, r12)
            java.lang.Object r12 = w5.AbstractC1767D.h(r1, r11)
            if (r12 != r0) goto L57
        L56:
            return r0
        L57:
            p4.i r12 = (p4.i) r12
            android.graphics.drawable.Drawable r12 = r12.a()
            if (r12 == 0) goto L6a
            android.graphics.Bitmap r12 = i6.h.L(r12)
            if (r12 == 0) goto L6a
            r0 = 4
            android.graphics.Bitmap r5 = e6.a.a(r12, r0)
        L6a:
            if (r5 == 0) goto L86
            android.graphics.Bitmap r12 = u6.L.e(r5, r8)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "getResources(...)"
            m5.AbstractC1209k.e(r0, r1)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r0, r12)
            f0.b0 r12 = r11.f13079s
            r12.setValue(r1)
            r5.recycle()
        L86:
            r2.c()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C1024j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
