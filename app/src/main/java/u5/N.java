package U5;

import D.A0;
import android.content.Context;
import f0.C0888g0;
import f0.C0912t;
import f0.InterfaceC0878b0;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;
import o0.AbstractC1256m;
import w.C1670c;
import w5.InterfaceC1765B;
import yos.music.player.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class N implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ T4.l f7145A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Context f7146B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7147o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y3.x f7148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1670c f7151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D4.i f7152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f7153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f7154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f7155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f7156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w.S f7157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f7158z;

    public N(MainActivity mainActivity, y3.x xVar, InterfaceC0878b0 interfaceC0878b0, C0888g0 c0888g0, C1670c c1670c, D4.i iVar, InterfaceC1180a interfaceC1180a, long j3, float f7, InterfaceC1765B interfaceC1765B, w.S s7, float f8, T4.l lVar, Context context) {
        this.f7147o = mainActivity;
        this.f7148p = xVar;
        this.f7149q = interfaceC0878b0;
        this.f7150r = c0888g0;
        this.f7151s = c1670c;
        this.f7152t = iVar;
        this.f7153u = interfaceC1180a;
        this.f7154v = j3;
        this.f7155w = f7;
        this.f7156x = interfaceC1765B;
        this.f7157y = s7;
        this.f7158z = f8;
        this.f7145A = lVar;
        this.f7146B = context;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            System.out.getClass();
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) AbstractC1256m.c(new Object[0], null, "MainActivity_isPlaying", new A0(11), c0912t, 3456, 2);
            MainActivity mainActivity = this.f7147o;
            D4.i iVar = this.f7152t;
            AbstractC1110d.n(n0.e.e(687713758, new H(mainActivity, this.f7148p, interfaceC0878b0, this.f7149q, this.f7150r, this.f7151s, iVar, this.f7153u), c0912t), c0912t, 6);
            AbstractC1110d.n(n0.e.e(416458055, new M(iVar, this.f7150r, this.f7151s, this.f7154v, this.f7155w, this.f7156x, this.f7157y, this.f7158z, this.f7145A, this.f7146B, interfaceC0878b0), c0912t), c0912t, 6);
        }
        return Y4.o.f8736a;
    }
}
