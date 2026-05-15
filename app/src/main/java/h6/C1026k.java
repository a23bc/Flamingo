package h6;

import D.AbstractC0074o;
import O0.C0318o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.Z0;
import j5.AbstractC1109c;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;
import y0.C1980m;
import y0.C1987t;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: renamed from: h6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1026k implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f13084o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC0878b0 f13085p;

    public /* synthetic */ C1026k(InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f13084o = i7;
        this.f13085p = interfaceC0878b0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13084o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    p4.g gVar = new p4.g((Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b));
                    gVar.f15027c = this.f13085p.getValue();
                    gVar.f15035m = Boolean.valueOf(c6.a.f10688a);
                    gVar.b();
                    f4.r.a(gVar.a(), null, androidx.compose.foundation.layout.c.f9203c, C0318o.f5427c, new C1980m(AbstractC1959I.c(855638016), 15), c0912t, 1573296, 696);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else if (((Boolean) this.f13085p.getValue()).booleanValue()) {
                    InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f9203c, 0.0f, 40, 0.0f, 0.0f, 13);
                    c0912t2.X(-1491121495);
                    Object objK = c0912t2.K();
                    if (objK == C0903o.f11850a) {
                        objK = n1.c.q(c0912t2);
                    }
                    c0912t2.p(false);
                    AbstractC0074o.a(androidx.compose.foundation.a.c(interfaceC1398pJ, (B.k) objK, null, false, new C1048w(0), 28), c0912t2, 0);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    c0912t3.X(1777411607);
                    Object objK2 = c0912t3.K();
                    if (objK2 == C0903o.f11850a) {
                        objK2 = C0879c.o(new F.m(this.f13085p, 27));
                        c0912t3.i0(objK2);
                    }
                    c0912t3.p(false);
                    d0.H0.b(I0.c.S(((Number) ((Z0) objK2).getValue()).intValue(), c0912t3), i6.h.l(AbstractC1109c.v(c0912t3, C1395m.f15634a), 0.4f), C1987t.f20259f, AbstractC1109c.u(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t3, 3456, 0, 131056);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    String strS = I0.c.S(R.string.settings_extend_statusbarlyric_basic_switch, c0912t4);
                    c0912t4.X(1576382920);
                    Object objK3 = c0912t4.K();
                    if (objK3 == C0903o.f11850a) {
                        objK3 = new i6.r(this.f13085p, 5);
                        c0912t4.i0(objK3);
                    }
                    c0912t4.p(false);
                    i6.g.n(false, strS, (InterfaceC1180a) objK3, new n6.c(5), c0912t4, 27648);
                    AbstractC1113a.j(null, c0912t4, 0);
                    i6.g.e(false, I0.c.S(R.string.settings_extend_statusbarlyric_basic_status, c0912t4), I0.c.S(SettingsLibrary.INSTANCE.getSuperLyricAPIHooked() ? R.string.settings_extend_statusbarlyric_basic_status_enabled : R.string.settings_extend_statusbarlyric_basic_status_disabled, c0912t4), c0912t4, 3072);
                }
                break;
            case 4:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    String strS2 = I0.c.S(R.string.settings_extend_statusbarlyric_debug_send_lyric, c0912t5);
                    c0912t5.X(1576446414);
                    Object objK4 = c0912t5.K();
                    if (objK4 == C0903o.f11850a) {
                        objK4 = new i6.r(this.f13085p, 6);
                        c0912t5.i0(objK4);
                    }
                    c0912t5.p(false);
                    i6.g.f(false, strS2, null, true, (InterfaceC1180a) objK4, c0912t5, 27648, 5);
                }
                break;
            case 5:
                C0912t c0912t6 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    String strS3 = I0.c.S(R.string.settings_extend_statusbarlyric_debug_clear_lyric, c0912t6);
                    c0912t6.X(1576474975);
                    Object objK5 = c0912t6.K();
                    if (objK5 == C0903o.f11850a) {
                        objK5 = new i6.r(this.f13085p, 7);
                        c0912t6.i0(objK5);
                    }
                    c0912t6.p(false);
                    i6.g.f(false, strS3, null, true, (InterfaceC1180a) objK5, c0912t6, 27648, 5);
                }
                break;
            case 6:
                C0912t c0912t7 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    Object value = this.f13085p.getValue();
                    AbstractC1209k.e(value, "<get-value>(...)");
                    i6.g.e(false, "Flamingo", (String) value, c0912t7, 3120);
                }
                break;
            default:
                C0912t c0912t8 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t8.z()) {
                    c0912t8.Q();
                } else {
                    String strS4 = I0.c.S(R.string.settings_performance_ui_screen_corner_title, c0912t8);
                    c0912t8.X(1674124976);
                    Object objK6 = c0912t8.K();
                    if (objK6 == C0903o.f11850a) {
                        objK6 = new i6.r(this.f13085p, 9);
                        c0912t8.i0(objK6);
                    }
                    c0912t8.p(false);
                    i6.g.f(false, strS4, null, true, (InterfaceC1180a) objK6, c0912t8, 27648, 5);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
