package t6;

import D.C0080v;
import M.C0273s;
import R0.AbstractC0403q0;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.AbstractC0805u;
import d0.C0803s;
import f0.C0879c;
import f0.C0912t;
import f0.C0915u0;
import f0.a1;
import j5.AbstractC1110d;
import m6.h;
import n0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    public static final C0803s f17122a;

    /* JADX INFO: renamed from: b */
    public static final C0803s f17123b;

    static {
        long j3 = a.f17114b;
        long j7 = a.f17118f;
        long j8 = a.f17117e;
        f17122a = AbstractC0805u.b(j3, 0L, 0L, 0L, 0L, a.h, a.f17121j, 0L, 0L, 0L, 0L, 0L, 0L, j7, j8, j7, j8, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122978, 15);
        f17123b = AbstractC0805u.d(a.f17113a, 0L, 0L, 0L, 0L, a.f17119g, a.f17120i, 0L, 0L, 0L, 0L, 0L, 0L, j8, j7, j8, j7, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122978, 15);
    }

    public static final void a(boolean z6, n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-1875087679);
        if (((i7 | 50) & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                z6 = a.a(c0912t);
            } else {
                c0912t.Q();
            }
            c0912t.q();
            c0912t.X(1222859310);
            C0803s c0803s = z6 ? f17122a : f17123b;
            c0912t.p(false);
            View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
            c0912t.X(1222870584);
            if (!view.isInEditMode()) {
                AbstractC1110d.n(e.e(-247008285, new h(view, z6), c0912t), c0912t, 6);
            }
            c0912t.p(false);
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            a1 a1Var = AbstractC0403q0.h;
            n1.d dVar2 = (n1.d) c0912t.j(a1Var);
            float f7 = context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? 0.4f : 1.0f;
            C0879c.a(a1Var.a(new n1.e(dVar2.b() * f7, dVar2.n() * f7)), e.e(-580111871, new C0080v(c0803s, dVar), c0912t), c0912t, 56);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0273s(z6, dVar, i7);
        }
    }
}
