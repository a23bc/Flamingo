package L3;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import m5.AbstractC1209k;
import x0.C1895e;
import y4.AbstractC2024c;
import y4.C2022a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f4248p;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f4247o) {
            case 0:
                ((e) this.f4248p).invalidateSelf();
                break;
            case 1:
                break;
            default:
                AbstractC1209k.f(drawable, "d");
                C2022a c2022a = (C2022a) this.f4248p;
                c2022a.f20523t.setValue(Integer.valueOf(((Number) c2022a.f20523t.getValue()).intValue() + 1));
                Object obj = AbstractC2024c.f20527a;
                Drawable drawable2 = c2022a.f20522s;
                c2022a.f20524u.setValue(new C1895e((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : i6.h.i(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Y4.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f4247o) {
            case 0:
                ((e) this.f4248p).scheduleSelf(runnable, j3);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f4248p;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                }
                break;
            default:
                AbstractC1209k.f(drawable, "d");
                AbstractC1209k.f(runnable, "what");
                ((Handler) AbstractC2024c.f20527a.getValue()).postAtTime(runnable, j3);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Y4.e, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f4247o) {
            case 0:
                ((e) this.f4248p).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f4248p;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                AbstractC1209k.f(drawable, "d");
                AbstractC1209k.f(runnable, "what");
                ((Handler) AbstractC2024c.f20527a.getValue()).removeCallbacks(runnable);
                break;
        }
    }

    public /* synthetic */ b(int i7, Object obj) {
        this.f4247o = i7;
        this.f4248p = obj;
    }

    private final void a(Drawable drawable) {
    }
}
