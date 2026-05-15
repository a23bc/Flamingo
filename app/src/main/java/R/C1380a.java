package r;

import A3.d;
import android.os.Looper;
import j5.AbstractC1110d;

/* JADX INFO: renamed from: r.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1380a extends AbstractC1110d {

    /* JADX INFO: renamed from: b */
    public static volatile C1380a f15598b;

    /* JADX INFO: renamed from: c */
    public static final d f15599c = new d(2);

    /* JADX INFO: renamed from: a */
    public final C1382c f15600a = new C1382c();

    public static C1380a L() {
        if (f15598b != null) {
            return f15598b;
        }
        synchronized (C1380a.class) {
            try {
                if (f15598b == null) {
                    f15598b = new C1380a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15598b;
    }

    public final void M(Runnable runnable) {
        C1382c c1382c = this.f15600a;
        if (c1382c.f15604c == null) {
            synchronized (c1382c.f15602a) {
                try {
                    if (c1382c.f15604c == null) {
                        c1382c.f15604c = C1382c.L(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c1382c.f15604c.post(runnable);
    }
}
