package v;

import R0.AbstractC0403q0;
import android.view.ViewConfiguration;
import f0.C0903o;
import f0.C0912t;
import w.C1689w;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18182a = ViewConfiguration.getScrollFriction();

    public static final C1689w a(C0912t c0912t) {
        n1.d dVar = (n1.d) c0912t.j(AbstractC0403q0.h);
        boolean zC = c0912t.c(dVar.b());
        Object objK = c0912t.K();
        if (zC || objK == C0903o.f11850a) {
            objK = new C1689w(new k.I(dVar));
            c0912t.i0(objK);
        }
        return (C1689w) objK;
    }
}
