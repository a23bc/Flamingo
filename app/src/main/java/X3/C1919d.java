package x3;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: x3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1919d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20033b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1916a f20034a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public C1919d(C1916a c1916a) {
        this.f20034a = c1916a;
    }

    public static C1919d a(AudioAttributes audioAttributes) {
        return Build.VERSION.SDK_INT >= 26 ? new C1919d(new C1918c(audioAttributes)) : new C1919d(new C1916a(audioAttributes));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1919d)) {
            return false;
        }
        C1919d c1919d = (C1919d) obj;
        C1916a c1916a = this.f20034a;
        return c1916a == null ? c1919d.f20034a == null : c1916a.equals(c1919d.f20034a);
    }

    public final int hashCode() {
        return this.f20034a.hashCode();
    }

    public final String toString() {
        return this.f20034a.toString();
    }
}
