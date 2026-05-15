package k;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13942b;

    public /* synthetic */ u(int i7, Object obj) {
        this.f13941a = i7;
        this.f13942b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f13941a) {
            case 0:
                ((LayoutInflaterFactory2C1111A) this.f13942b).C();
                break;
            default:
                ((Runnable) this.f13942b).run();
                break;
        }
    }
}
