package G1;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f2652a;

    public N(View view) {
        this.f2652a = new WeakReference(view);
    }

    public final void a(float f7) {
        View view = (View) this.f2652a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
    }

    public final void b() {
        View view = (View) this.f2652a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j3) {
        View view = (View) this.f2652a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
    }

    public final void d(O o7) {
        View view = (View) this.f2652a.get();
        if (view != null) {
            if (o7 != null) {
                view.animate().setListener(new M(o7, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f7) {
        View view = (View) this.f2652a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
