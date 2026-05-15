package p;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import k.DialogInterfaceC1119g;

/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* JADX INFO: renamed from: o */
    public SubMenuC1271D f14837o;

    /* JADX INFO: renamed from: p */
    public DialogInterfaceC1119g f14838p;

    /* JADX INFO: renamed from: q */
    public C1279h f14839q;

    @Override // p.w
    public final boolean B(l lVar) {
        return false;
    }

    @Override // p.w
    public final void b(l lVar, boolean z6) {
        DialogInterfaceC1119g dialogInterfaceC1119g;
        if ((z6 || lVar == this.f14837o) && (dialogInterfaceC1119g = this.f14838p) != null) {
            dialogInterfaceC1119g.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C1279h c1279h = this.f14839q;
        if (c1279h.f14807t == null) {
            c1279h.f14807t = new C1278g(c1279h);
        }
        this.f14837o.q(c1279h.f14807t.getItem(i7), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14839q.b(this.f14837o, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1271D subMenuC1271D = this.f14837o;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14838p.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14838p.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1271D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1271D.performShortcut(i7, keyEvent, 0);
    }
}
