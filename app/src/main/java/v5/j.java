package V5;

import Y4.o;
import android.content.Context;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.W;
import h6.C1008b;
import l5.InterfaceC1180a;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7621o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ YosMediaItem f7622p;

    public j(YosMediaItem yosMediaItem) {
        this.f7621o = 0;
        n0.d dVar = W5.c.f7833a;
        C0888g0 c0888g0 = a6.b.f8883a;
        this.f7622p = yosMediaItem;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        YosMediaItem yosMediaItem = this.f7622p;
        o oVar = o.f8736a;
        W w7 = C0903o.f11850a;
        switch (this.f7621o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    Context context = (Context) c0912t.j(Z1.h.f8772b);
                    c0912t.X(2015365660);
                    C0888g0 c0888g0 = a6.b.f8883a;
                    Object objK = c0912t.K();
                    if (objK == w7) {
                        objK = a6.b.f8887e;
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    W5.c.f7833a.c(new n1.i(((n1.i) c0912t.j(Z1.h.f8771a)).f14513a), this.f7622p, context, ((InterfaceC0878b0) objK).getValue(), c0912t, 0);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    c0912t2.X(-1362175359);
                    boolean zF = c0912t2.f(yosMediaItem);
                    Object objK2 = c0912t2.K();
                    if (zF || objK2 == w7) {
                        objK2 = new C1008b(yosMediaItem, 0);
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    M3.a.a((InterfaceC1180a) objK2, c0912t2, 0);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    c0912t3.X(2010711074);
                    boolean zF2 = c0912t3.f(yosMediaItem);
                    Object objK3 = c0912t3.K();
                    if (zF2 || objK3 == w7) {
                        objK3 = new C1008b(yosMediaItem, 0);
                        c0912t3.i0(objK3);
                    }
                    c0912t3.p(false);
                    M3.a.a((InterfaceC1180a) objK3, c0912t3, 0);
                }
                break;
        }
        return oVar;
    }

    public /* synthetic */ j(YosMediaItem yosMediaItem, int i7) {
        this.f7621o = i7;
        this.f7622p = yosMediaItem;
    }
}
