package W5;

import N5.l;
import Y4.o;
import a.AbstractC0509a;
import android.content.Context;
import android.graphics.Bitmap;
import f0.C0912t;
import f0.InterfaceC0878b0;
import g2.n;
import g2.s;
import l2.C1162b;
import l2.C1164d;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f7850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f7851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f7852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f7853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f7854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f7855u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f7856v;

    public g(float f7, float f8, float f9, float f10, long j3, Context context, InterfaceC0878b0 interfaceC0878b0, YosMediaItem yosMediaItem) {
        this.f7849o = interfaceC0878b0;
        this.f7850p = f7;
        this.f7851q = f8;
        this.f7852r = f9;
        this.f7853s = j3;
        this.f7854t = context;
        this.f7855u = f10;
        this.f7856v = yosMediaItem;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            Bitmap bitmap = (Bitmap) this.f7849o.getValue();
            float f7 = this.f7850p;
            l.d(bitmap, new s(new C1162b(f7)).c(new n(new C1162b(f7))), c0912t, 0);
            float f8 = this.f7851q;
            float f9 = this.f7852r;
            l.a(f8, f9, c0912t, 0);
            C1164d c1164d = C1164d.f14164a;
            AbstractC0509a.d(1, 3072, 4, android.support.v4.media.session.b.A(new s(c1164d).c(new n(c1164d)), f9, f8), c0912t, n0.e.e(179382253, new f(this.f7852r, this.f7853s, this.f7854t, this.f7855u, this.f7856v), c0912t));
        }
        return o.f8736a;
    }
}
