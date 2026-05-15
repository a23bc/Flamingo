package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739E implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f10726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f10727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f10728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f10729d;

    public C0739E(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2) {
        this.f10726a = interfaceC1182c;
        this.f10727b = interfaceC1182c2;
        this.f10728c = interfaceC1180a;
        this.f10729d = interfaceC1180a2;
    }

    public final void onBackCancelled() {
        this.f10729d.a();
    }

    public final void onBackInvoked() {
        this.f10728c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1209k.f(backEvent, "backEvent");
        this.f10727b.b(new C0749b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1209k.f(backEvent, "backEvent");
        this.f10726a.b(new C0749b(backEvent));
    }
}
