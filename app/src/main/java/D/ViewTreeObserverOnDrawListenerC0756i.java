package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0756i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: o */
    public final long f10764o = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: p */
    public Runnable f10765p;

    /* JADX INFO: renamed from: q */
    public boolean f10766q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ AbstractActivityC0759l f10767r;

    public ViewTreeObserverOnDrawListenerC0756i(AbstractActivityC0759l abstractActivityC0759l) {
        this.f10767r = abstractActivityC0759l;
    }

    public final void a(View view) {
        if (this.f10766q) {
            return;
        }
        this.f10766q = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1209k.f(runnable, "runnable");
        this.f10765p = runnable;
        View decorView = this.f10767r.getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        if (!this.f10766q) {
            decorView.postOnAnimation(new B2.e(15, this));
        } else if (AbstractC1209k.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z6;
        Runnable runnable = this.f10765p;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f10764o) {
                this.f10766q = false;
                this.f10767r.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f10765p = null;
        C0767t c0767t = (C0767t) this.f10767r.f10789u.getValue();
        synchronized (c0767t.f10801b) {
            z6 = c0767t.f10802c;
        }
        if (z6) {
            this.f10766q = false;
            this.f10767r.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10767r.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
