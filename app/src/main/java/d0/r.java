package d0;

import e0.AbstractC0842g;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import l5.InterfaceC1182c;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.C1987t;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a */
    public static final r f11081a = new r();

    /* JADX INFO: renamed from: b */
    public static final float f11082b;

    /* JADX INFO: renamed from: c */
    public static final float f11083c;

    static {
        float f7 = AbstractC0842g.f11432a;
        f11082b = AbstractC0842g.f11434c;
        f11083c = 640;
    }

    public final void a(C1395m c1395m, float f7, float f8, L.a aVar, long j3, C0912t c0912t, int i7) {
        C1395m c1395m2;
        float f9;
        float f10;
        L.a aVar2;
        long jB;
        L.a aVar3;
        long j7;
        C1395m c1395m3;
        float f11;
        float f12;
        c0912t.Z(-1364277227);
        if (((i7 | 9654) & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
            c1395m3 = c1395m;
            f11 = f7;
            f12 = f8;
            aVar3 = aVar;
            j7 = j3;
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                C1395m c1395m4 = C1395m.f15634a;
                float f13 = AbstractC0842g.f11433b;
                float f14 = AbstractC0842g.f11432a;
                c1395m2 = c1395m4;
                f9 = f13;
                f10 = f14;
                aVar2 = ((C0795j0) c0912t.j(k0.f11034a)).f11029e;
                jB = C1987t.b(AbstractC0805u.c((C0803s) c0912t.j(AbstractC0805u.f11147a), 19), 0.4f);
            } else {
                c0912t.Q();
                c1395m2 = c1395m;
                f9 = f7;
                f10 = f8;
                aVar2 = aVar;
                jB = j3;
            }
            c0912t.q();
            String strG = H.g(R.string.m3c_bottom_sheet_drag_handle_description, c0912t);
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(c1395m2, 0.0f, m0.f11046a, 1);
            c0912t.Y(-363350248);
            boolean zF = c0912t.f(strG);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new Y0.m(strG, 1);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            F0.a(Y0.l.a(interfaceC1398pI, false, (InterfaceC1182c) objK), aVar2, jB, 0L, 0.0f, n0.e.b(c0912t, -1039573072, new C0802q(f9, f10)), c0912t, 12582912, 120);
            aVar3 = aVar2;
            j7 = jB;
            c1395m3 = c1395m2;
            f11 = f9;
            f12 = f10;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new Y.q(this, c1395m3, f11, f12, aVar3, j7, i7);
        }
    }
}
