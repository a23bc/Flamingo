package p;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ v f14878o;

    public u(v vVar) {
        this.f14878o = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14878o.c();
    }
}
