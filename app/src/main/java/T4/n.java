package T4;

import Q0.AbstractC0347f;
import Q0.InterfaceC0356l;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j5.AbstractC1110d;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f6984a = new ThreadLocal();

    public static final long a(InterfaceC0356l interfaceC0356l) {
        ThreadLocal threadLocal = f6984a;
        Object obj = threadLocal.get();
        if (obj == null) {
            obj = new int[2];
            threadLocal.set(obj);
        }
        ((View) AbstractC0347f.i(interfaceC0356l, AndroidCompositionLocals_androidKt.f9328f)).getRootView().getLocationOnScreen((int[]) obj);
        return AbstractC1110d.g(r1[0], r1[1]);
    }
}
