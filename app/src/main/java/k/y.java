package k;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class y extends ContentFrameLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C1111A f13951w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A, o.c cVar) {
        super(cVar, null);
        this.f13951w = layoutInflaterFactory2C1111A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f13951w.q(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (x6 < -5 || y6 < -5 || x6 > getWidth() + 5 || y6 > getHeight() + 5) {
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13951w;
                layoutInflaterFactory2C1111A.o(layoutInflaterFactory2C1111A.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i7) {
        setBackgroundDrawable(i6.g.v(getContext(), i7));
    }
}
