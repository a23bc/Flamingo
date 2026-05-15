package d;

import android.window.OnBackInvokedCallback;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0740F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0740F f10730a = new C0740F();

    public final OnBackInvokedCallback a(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2) {
        AbstractC1209k.f(interfaceC1182c, "onBackStarted");
        AbstractC1209k.f(interfaceC1182c2, "onBackProgressed");
        AbstractC1209k.f(interfaceC1180a, "onBackInvoked");
        AbstractC1209k.f(interfaceC1180a2, "onBackCancelled");
        return new C0739E(interfaceC1182c, interfaceC1182c2, interfaceC1180a, interfaceC1180a2);
    }
}
