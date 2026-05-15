package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: q.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1337s0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC1339t0 f15392p;

    public /* synthetic */ RunnableC1337s0(AbstractViewOnTouchListenerC1339t0 abstractViewOnTouchListenerC1339t0, int i7) {
        this.f15391o = i7;
        this.f15392p = abstractViewOnTouchListenerC1339t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15391o) {
            case 0:
                ViewParent parent = this.f15392p.f15397r.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC1339t0 abstractViewOnTouchListenerC1339t0 = this.f15392p;
                abstractViewOnTouchListenerC1339t0.a();
                View view = abstractViewOnTouchListenerC1339t0.f15397r;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1339t0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1339t0.f15400u = true;
                    break;
                }
                break;
        }
    }
}
