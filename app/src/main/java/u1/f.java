package u1;

import G1.InterfaceC0142i;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0597u;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Activity implements InterfaceC0597u, InterfaceC0142i {

    /* JADX INFO: renamed from: o */
    public final C0599w f17150o = new C0599w(this, true);

    @Override // G1.InterfaceC0142i
    public final boolean c(KeyEvent keyEvent) {
        AbstractC1209k.f(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1209k.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        if (N5.l.u(decorView, keyEvent)) {
            return true;
        }
        return N5.l.v(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1209k.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        if (N5.l.u(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = H.f9693p;
        F.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1209k.f(bundle, "outState");
        this.f17150o.t(EnumC0593p.f9747q);
        super.onSaveInstanceState(bundle);
    }
}
