package I0;

import android.view.KeyEvent;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f3439a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return AbstractC1209k.a(this.f3439a, ((b) obj).f3439a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3439a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f3439a + ')';
    }
}
