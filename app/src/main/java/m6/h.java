package m6;

import Y4.o;
import android.view.View;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1180a;
import o5.AbstractC1267a;
import r0.C1395m;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class h implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14469o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f14470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f14471q;

    public h(View view, boolean z6) {
        this.f14471q = view;
        this.f14470p = z6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14469o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else if (!this.f14470p) {
                    AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_action_next, c0912t), (String) this.f14471q, i6.h.l(androidx.compose.foundation.layout.c.c(C1395m.f15634a, 11), 0.3f), ((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11107o, c0912t, 384, 0);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    c0912t2.X(563722529);
                    View view = (View) this.f14471q;
                    boolean zF = c0912t2.f(view);
                    boolean z6 = this.f14470p;
                    boolean zG = zF | c0912t2.g(z6);
                    Object objK = c0912t2.K();
                    if (zG || objK == C0903o.f11850a) {
                        objK = new K.a(2, view, z6);
                        c0912t2.i0(objK);
                    }
                    c0912t2.p(false);
                    C0879c.g((InterfaceC1180a) objK, c0912t2);
                }
                break;
        }
        return o.f8736a;
    }

    public h(String str, boolean z6) {
        this.f14470p = z6;
        this.f14471q = str;
    }
}
