package G1;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;
import y1.C1993b;

/* JADX INFO: renamed from: G1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0141h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2717a;

    public C0141h(DisplayCutout displayCutout) {
        this.f2717a = displayCutout;
    }

    public final C1993b a() {
        return Build.VERSION.SDK_INT >= 30 ? C1993b.c(B1.a.d(this.f2717a)) : C1993b.f20270e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0141h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2717a, ((C0141h) obj).f2717a);
    }

    public final int hashCode() {
        return this.f2717a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2717a + "}";
    }
}
