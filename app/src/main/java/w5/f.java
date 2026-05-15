package W5;

import N5.l;
import Y4.o;
import a.AbstractC0509a;
import android.content.Context;
import f0.C0912t;
import g2.p;
import m5.AbstractC1209k;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class f implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ float f7844o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ long f7845p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Context f7846q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ float f7847r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ YosMediaItem f7848s;

    public f(float f7, long j3, Context context, float f8, YosMediaItem yosMediaItem) {
        this.f7844o = f7;
        this.f7845p = j3;
        this.f7846q = context;
        this.f7847r = f8;
        this.f7848s = yosMediaItem;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f((g2.i) obj, "$this$Column");
        float f7 = 0;
        float f8 = this.f7844o;
        AbstractC0509a.d(0, 3072, 6, new p(android.support.v4.media.session.b.L(f8), android.support.v4.media.session.b.L(f7), android.support.v4.media.session.b.L(f8), android.support.v4.media.session.b.L(f7)), c0912t, n0.e.e(1836048099, new e(this.f7847r, this.f7846q, this.f7845p, this.f7848s), c0912t));
        l.g(this.f7844o, this.f7845p, this.f7846q, c0912t, 0);
        return o.f8736a;
    }
}
