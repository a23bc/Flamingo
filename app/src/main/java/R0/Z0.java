package R0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f6402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f0.B0 f6403p;

    public Z0(View view, f0.B0 b0) {
        this.f6402o = view;
        this.f6403p = b0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6402o.removeOnAttachStateChangeListener(this);
        this.f6403p.A();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
