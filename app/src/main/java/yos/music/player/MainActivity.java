package yos.music.player;

import B5.n;
import D.D0;
import D.h0;
import R.j;
import U5.AbstractActivityC0429a;
import U5.C0441m;
import U5.C0449v;
import U5.T;
import Y1.o;
import Y4.g;
import Z5.a;
import Z5.b;
import Z5.c;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.K;
import androidx.lifecycle.S;
import c5.i;
import d.AbstractC0761n;
import e.f;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import j5.AbstractC1110d;
import l5.InterfaceC1182c;
import m5.AbstractC1221w;
import n0.d;
import n0.e;
import o5.AbstractC1267a;
import r2.C1415a;
import w5.AbstractC1767D;
import w5.M;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0429a {

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f20573K = 0;

    /* JADX INFO: renamed from: H */
    public final S f20574H = new S(AbstractC1221w.a(c.class), new T(this, 1), new T(this, 0), new T(this, 2));

    /* JADX INFO: renamed from: I */
    public final S f20575I = new S(AbstractC1221w.a(b.class), new T(this, 4), new T(this, 3), new T(this, 5));

    /* JADX INFO: renamed from: J */
    public final S f20576J = new S(AbstractC1221w.a(a.class), new T(this, 7), new T(this, 6), new T(this, 8));

    public final void l(int i7, C0912t c0912t) {
        c0912t.Z(1407144936);
        int i8 = (c0912t.f(this) ? 4 : 2) | i7;
        if ((i8 & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            o oVar = new o(1);
            c0912t.X(913785717);
            boolean zF = ((i8 & 14) == 4) | c0912t.f(context);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new h0(this, 9, context);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            AbstractC1110d.n(e.e(896507397, new j(context, AbstractC1267a.E(oVar, (InterfaceC1182c) objK, c0912t, 0), this, 1), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new D0(i7, 5, this);
        }
    }

    public final void m(Context context, boolean z6) {
        C1415a c1415a;
        if (!SettingsLibrary.INSTANCE.getRefreshEveryTime() && !z6) {
            a6.b.f8884b.setValue(Boolean.TRUE);
            return;
        }
        c cVar = (c) this.f20574H.getValue();
        synchronized (K.f9703d) {
            c1415a = (C1415a) cVar.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c1415a == null) {
                i iVar = c5.j.f10685o;
                try {
                    D5.e eVar = M.f19497a;
                    iVar = n.f912a.f20145t;
                } catch (g | IllegalStateException unused) {
                }
                C1415a c1415a2 = new C1415a(iVar.h(AbstractC1767D.c()));
                cVar.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c1415a2);
                c1415a = c1415a2;
            }
        }
        AbstractC1767D.t(c1415a, M.f19498b, new C0441m(context, null), 2);
    }

    @Override // d.AbstractActivityC0759l, u1.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        (Build.VERSION.SDK_INT >= 31 ? new D1.b(this) : new A.b(7, this)).u();
        AbstractC0761n.a(this);
        f.a(this, new d(579742919, new C0449v(this, 3), true));
    }
}
