package z4;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;
import f0.a1;

/* JADX INFO: renamed from: z4.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2102u {

    /* JADX INFO: renamed from: a */
    public static final a1 f21245a = new a1(C2099r.f21239p);

    public static final void a(boolean z6, boolean z7, n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-184522253);
        int i8 = i7 | 54;
        if ((i8 & 731) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
            c0912t.Y(-492369756);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = new C2092k();
                c0912t.i0(objK);
            }
            c0912t.p(false);
            C2092k c2092k = (C2092k) objK;
            C0879c.d(view, new z3.h(view, 1, c2092k), c0912t);
            C0879c.b(new C0913t0[]{f21245a.a(c2092k)}, n0.e.b(c0912t, -1033208141, new C2100s(i8, dVar)), c0912t, 56);
            z6 = true;
            z7 = true;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R == null) {
            return;
        }
        c0915u0R.f11932d = new C2101t(z6, z7, dVar, i7);
    }
}
