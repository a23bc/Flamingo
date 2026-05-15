package q;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p.ViewTreeObserverOnGlobalLayoutListenerC1275d;

/* JADX INFO: loaded from: classes.dex */
public final class L implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1275d f15192o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ M f15193p;

    public L(M m7, ViewTreeObserverOnGlobalLayoutListenerC1275d viewTreeObserverOnGlobalLayoutListenerC1275d) {
        this.f15193p = m7;
        this.f15192o = viewTreeObserverOnGlobalLayoutListenerC1275d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f15193p.f15198U.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f15192o);
        }
    }
}
