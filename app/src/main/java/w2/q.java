package w2;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f18875b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f18876a;

    public q(Handler handler) {
        this.f18876a = handler;
    }

    public static p b() {
        p pVar;
        ArrayList arrayList = f18875b;
        synchronized (arrayList) {
            try {
                pVar = arrayList.isEmpty() ? new p() : (p) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public final p a(int i7, Object obj) {
        p pVarB = b();
        pVarB.f18874a = this.f18876a.obtainMessage(i7, obj);
        return pVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f18876a.post(runnable);
    }

    public final void d(int i7) {
        AbstractC1697a.d(i7 != 0);
        this.f18876a.removeMessages(i7);
    }

    public final boolean e(int i7) {
        return this.f18876a.sendEmptyMessage(i7);
    }
}
