package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d.C0745K;
import d.InterfaceC0744J;
import f0.C0912t;
import f0.D;
import m5.AbstractC1209k;
import t5.C1521e;
import t5.C1522f;
import t5.C1523g;
import t5.j;
import t5.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f11315a = new D(b.f11306s);

    public static InterfaceC0744J a(C0912t c0912t) {
        c0912t.Y(-2068013981);
        InterfaceC0744J interfaceC0744J = (InterfaceC0744J) c0912t.j(f11315a);
        c0912t.Y(1680121597);
        Context context = null;
        if (interfaceC0744J == null) {
            View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
            AbstractC1209k.f(view, "<this>");
            C1521e c1521e = new C1521e(new C1522f(new C1523g(j.H(view, C0745K.f10745r), C0745K.f10746s, 2), false, m.f17109q));
            interfaceC0744J = (InterfaceC0744J) (!c1521e.hasNext() ? null : c1521e.next());
        }
        c0912t.p(false);
        if (interfaceC0744J == null) {
            Context baseContext = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    break;
                }
                if (baseContext instanceof InterfaceC0744J) {
                    context = baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC0744J = (InterfaceC0744J) context;
        }
        c0912t.p(false);
        return interfaceC0744J;
    }
}
