package G1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: G1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0149p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f2727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f2728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Runnable f2729q;

    public ViewTreeObserverOnPreDrawListenerC0149p(View view, Runnable runnable) {
        this.f2727o = view;
        this.f2728p = view.getViewTreeObserver();
        this.f2729q = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f2728p.isAlive();
        View view = this.f2727o;
        if (zIsAlive) {
            this.f2728p.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2729q.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2728p = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f2728p.isAlive();
        View view2 = this.f2727o;
        if (zIsAlive) {
            this.f2728p.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
