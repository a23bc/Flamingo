package d;

import android.window.OnBackInvokedCallback;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0737C implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f10724b;

    public /* synthetic */ C0737C(InterfaceC1180a interfaceC1180a, int i7) {
        this.f10723a = i7;
        this.f10724b = interfaceC1180a;
    }

    public final void onBackInvoked() {
        switch (this.f10723a) {
            case 0:
                InterfaceC1180a interfaceC1180a = this.f10724b;
                AbstractC1209k.f(interfaceC1180a, "$onBackInvoked");
                interfaceC1180a.a();
                break;
            case 1:
                this.f10724b.a();
                break;
            default:
                InterfaceC1180a interfaceC1180a2 = this.f10724b;
                if (interfaceC1180a2 != null) {
                    interfaceC1180a2.a();
                }
                break;
        }
    }
}
