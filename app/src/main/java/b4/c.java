package B4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.AbstractC0911s0;
import f0.C0903o;
import f0.C0912t;
import m5.AbstractC1209k;
import r1.t;
import r1.v;
import y0.AbstractC1959I;
import z0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    public static final long f874a = AbstractC1959I.b(0.0f, 0.0f, 0.0f, 0.3f, d.f21037e);

    /* JADX INFO: renamed from: b */
    public static final b f875b = b.f873p;

    public static final a a(C0912t c0912t) {
        c0912t.Y(-715745933);
        c0912t.Y(1009281237);
        AbstractC0911s0 abstractC0911s0 = AndroidCompositionLocals_androidKt.f9328f;
        ViewParent parent = ((View) c0912t.j(abstractC0911s0)).getParent();
        Window window = null;
        v vVar = parent instanceof v ? (v) parent : null;
        Window window2 = vVar != null ? ((t) vVar).f15718w : null;
        if (window2 == null) {
            Context context = ((View) c0912t.j(abstractC0911s0)).getContext();
            AbstractC1209k.e(context, "LocalView.current.context");
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    AbstractC1209k.e(context, "baseContext");
                } else {
                    window = ((Activity) context).getWindow();
                    break;
                }
            }
            window2 = window;
        }
        c0912t.p(false);
        View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
        c0912t.Y(511388516);
        boolean zF = c0912t.f(view) | c0912t.f(window2);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new a(view, window2);
            c0912t.i0(objK);
        }
        c0912t.p(false);
        a aVar = (a) objK;
        c0912t.p(false);
        return aVar;
    }
}
