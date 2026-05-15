package W5;

import N5.l;
import Z1.m;
import Z1.o;
import a2.AbstractC0514d;
import a2.C0512b;
import a2.C0517g;
import android.content.Context;
import b2.C0684z;
import f0.C0912t;
import f0.InterfaceC0878b0;
import g2.n;
import g2.s;
import java.util.Arrays;
import l2.C1162b;
import l2.C1167g;
import m5.AbstractC1209k;
import y0.AbstractC1959I;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class h implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f7858p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f7859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f7860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f7861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f7862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f7863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ YosMediaItem f7864v;

    public h(float f7, float f8, float f9, float f10, long j3, Context context, InterfaceC0878b0 interfaceC0878b0, YosMediaItem yosMediaItem) {
        this.f7857o = interfaceC0878b0;
        this.f7858p = f7;
        this.f7859q = context;
        this.f7860r = f8;
        this.f7861s = f9;
        this.f7862t = j3;
        this.f7863u = f10;
        this.f7864v = yosMediaItem;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        AbstractC1209k.f((g2.i) obj, "$this$Column");
        o cVar = this.f7857o.getValue() == null ? new Z1.c(new C1167g(AbstractC1959I.d(4294262855L))) : m.f8781a;
        float f7 = this.f7858p;
        l.c(cVar.c(new s(new C1162b(f7))).c(new n(new C1162b(f7))).c(new C0684z(new C1162b(20))).c(new C0512b(new C0517g(android.support.v4.media.session.b.v((AbstractC0514d[]) Arrays.copyOf(new AbstractC0514d[0], 0))))), null, n0.e.e(448823799, new g(this.f7858p, this.f7860r, this.f7861s, this.f7863u, this.f7862t, this.f7859q, this.f7857o, this.f7864v), c0912t), c0912t, 384, 2);
        l.b(this.f7859q, android.support.v4.media.session.b.B(new s(new C1162b(f7)), 0.0f, 5, 13), c0912t, 0);
        return Y4.o.f8736a;
    }
}
