package R0;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Y f6383o;

    public X(Y y6) {
        this.f6383o = y6;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f6383o.f6390r.removeCallbacks(this);
        Y.E(this.f6383o);
        Y y6 = this.f6383o;
        synchronized (y6.f6391s) {
            if (y6.f6396x) {
                y6.f6396x = false;
                ArrayList arrayList = y6.f6393u;
                y6.f6393u = y6.f6394v;
                y6.f6394v = arrayList;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((Choreographer.FrameCallback) arrayList.get(i7)).doFrame(j3);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y.E(this.f6383o);
        Y y6 = this.f6383o;
        synchronized (y6.f6391s) {
            if (y6.f6393u.isEmpty()) {
                y6.f6389q.removeFrameCallback(this);
                y6.f6396x = false;
            }
        }
    }
}
