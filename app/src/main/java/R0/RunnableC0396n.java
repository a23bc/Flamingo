package R0;

import android.os.Build;
import t.C1444F;

/* JADX INFO: renamed from: R0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0396n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1444F c1444f = C0415x.f6558Y0;
        synchronized (c1444f) {
            try {
                int i7 = 0;
                if (Build.VERSION.SDK_INT < 30) {
                    Object[] objArr = c1444f.f15983a;
                    int i8 = c1444f.f15984b;
                    while (i7 < i8) {
                        C0415x c0415x = (C0415x) objArr[i7];
                        boolean showLayoutBounds = c0415x.getShowLayoutBounds();
                        Class cls = C0415x.f6555V0;
                        c0415x.setShowLayoutBounds(M.y());
                        if (showLayoutBounds != c0415x.getShowLayoutBounds()) {
                            C0415x.r(c0415x.getRoot());
                        }
                        i7++;
                    }
                } else {
                    Object[] objArr2 = c1444f.f15983a;
                    int i9 = c1444f.f15984b;
                    while (i7 < i9) {
                        C0415x.r(((C0415x) objArr2[i7]).getRoot());
                        i7++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
