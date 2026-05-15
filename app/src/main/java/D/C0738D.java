package d;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0738D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0738D f10725a = new C0738D();

    public final OnBackInvokedCallback a(InterfaceC1180a interfaceC1180a) {
        AbstractC1209k.f(interfaceC1180a, "onBackInvoked");
        return new C0737C(interfaceC1180a, 0);
    }

    public final void b(Object obj, int i7, Object obj2) {
        AbstractC1209k.f(obj, "dispatcher");
        AbstractC1209k.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        AbstractC1209k.f(obj, "dispatcher");
        AbstractC1209k.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
