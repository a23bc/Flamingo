package q;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ D0 f15130a;

    public B0(D0 d02) {
        this.f15130a = d02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        if (i7 == 1) {
            D0 d02 = this.f15130a;
            if (d02.f15148M.getInputMethodMode() == 2 || d02.f15148M.getContentView() == null) {
                return;
            }
            Handler handler = d02.f15144I;
            RunnableC1351z0 runnableC1351z0 = d02.f15140E;
            handler.removeCallbacks(runnableC1351z0);
            runnableC1351z0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
    }
}
