package q;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ D0 f15132o;

    public C0(D0 d02) {
        this.f15132o = d02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1350z c1350z;
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        D0 d02 = this.f15132o;
        if (action == 0 && (c1350z = d02.f15148M) != null && c1350z.isShowing() && x6 >= 0 && x6 < d02.f15148M.getWidth() && y6 >= 0 && y6 < d02.f15148M.getHeight()) {
            d02.f15144I.postDelayed(d02.f15140E, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        d02.f15144I.removeCallbacks(d02.f15140E);
        return false;
    }
}
