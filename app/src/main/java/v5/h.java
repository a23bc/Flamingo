package V5;

import U5.I;
import Y4.o;
import android.content.Context;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import j5.AbstractC1109c;
import k2.C1144f;
import l2.C1167g;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import n1.p;
import v6.B;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class h implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7617o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Context f7618p;

    public /* synthetic */ h(Context context, int i7) {
        this.f7617o = i7;
        this.f7618p = context;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7617o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    String string = this.f7618p.getString(R.string.appwidget_description);
                    AbstractC1209k.e(string, "getString(...)");
                    AbstractC1109c.g(string, null, new C1144f(new C1167g(C1987t.f20259f), new p(AbstractC1109c.u(12)), null, 124), 0, c0912t, 0, 10);
                }
                return o.f8736a;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    String strS = I0.c.S(R.string.settings_others_about_developers_yos_x, c0912t2);
                    c0912t2.X(-1226357388);
                    Context context = this.f7618p;
                    boolean zF = c0912t2.f(context);
                    Object objK = c0912t2.K();
                    if (zF || objK == C0903o.f11850a) {
                        objK = new I(context, 4);
                        c0912t2.i0(objK);
                    }
                    c0912t2.p(false);
                    i6.g.f(false, "Yos-X", strS, false, (InterfaceC1180a) objK, c0912t2, 48, 9);
                }
                return o.f8736a;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    String strS2 = I0.c.S(R.string.settings_others_about_sponsor_us, c0912t3);
                    c0912t3.X(-1226339758);
                    Context context2 = this.f7618p;
                    boolean zF2 = c0912t3.f(context2);
                    Object objK2 = c0912t3.K();
                    if (zF2 || objK2 == C0903o.f11850a) {
                        objK2 = new I(context2, 5);
                        c0912t3.i0(objK2);
                    }
                    c0912t3.p(false);
                    i6.g.f(false, strS2, null, true, (InterfaceC1180a) objK2, c0912t3, 3072, 5);
                }
                return o.f8736a;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    String strS3 = I0.c.S(R.string.settings_others_about_contact_us, c0912t4);
                    c0912t4.X(-1226315373);
                    Context context3 = this.f7618p;
                    boolean zF3 = c0912t4.f(context3);
                    Object objK3 = c0912t4.K();
                    if (zF3 || objK3 == C0903o.f11850a) {
                        objK3 = new I(context3, 6);
                        c0912t4.i0(objK3);
                    }
                    c0912t4.p(false);
                    i6.g.f(false, strS3, null, true, (InterfaceC1180a) objK3, c0912t4, 3072, 5);
                }
                return o.f8736a;
            default:
                C0912t c0912t5 = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                o oVar = o.f8736a;
                if (iIntValue == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    c0912t5.X(1129338451);
                    Context context4 = this.f7618p;
                    boolean zF4 = c0912t5.f(context4);
                    Object objK4 = c0912t5.K();
                    if (zF4 || objK4 == C0903o.f11850a) {
                        objK4 = new B(context4, null);
                        c0912t5.i0(objK4);
                    }
                    c0912t5.p(false);
                    C0879c.e(c0912t5, oVar, (l5.e) objK4);
                }
                return oVar;
        }
    }
}
