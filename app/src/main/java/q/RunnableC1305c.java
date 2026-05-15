package q;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1305c implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f15278p;

    public /* synthetic */ RunnableC1305c(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f15277o = i7;
        this.f15278p = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15277o) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f15278p;
                actionBarOverlayLayout.g();
                actionBarOverlayLayout.f9013K = actionBarOverlayLayout.f9022r.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f9014L);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f15278p;
                actionBarOverlayLayout2.g();
                actionBarOverlayLayout2.f9013K = actionBarOverlayLayout2.f9022r.animate().translationY(-actionBarOverlayLayout2.f9022r.getHeight()).setListener(actionBarOverlayLayout2.f9014L);
                break;
        }
    }
}
