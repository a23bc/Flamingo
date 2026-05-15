package I4;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ boolean a(Unsafe unsafe, p pVar, long j3, C0229d c0229d, C0229d c0229d2) {
        while (!unsafe.compareAndSwapObject(pVar, j3, c0229d, c0229d2)) {
            if (unsafe.getObject(pVar, j3) != c0229d) {
                return false;
            }
        }
        return true;
    }
}
