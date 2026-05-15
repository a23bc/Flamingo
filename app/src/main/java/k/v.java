package k;

import C2.AbstractC0032d;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A) {
        Objects.requireNonNull(layoutInflaterFactory2C1111A);
        u uVar = new u(0, layoutInflaterFactory2C1111A);
        AbstractC0032d.n(obj).registerOnBackInvokedCallback(1000000, uVar);
        return uVar;
    }

    public static void c(Object obj, Object obj2) {
        AbstractC0032d.n(obj).unregisterOnBackInvokedCallback(AbstractC0032d.k(obj2));
    }
}
