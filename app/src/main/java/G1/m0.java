package G1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f2724b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f2725a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2724b = i0.f2721q;
        } else {
            f2724b = j0.f2722b;
        }
    }

    public m0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f2725a = new i0(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f2725a = new h0(this, windowInsets);
        } else if (i7 >= 28) {
            this.f2725a = new g0(this, windowInsets);
        } else {
            this.f2725a = new f0(this, windowInsets);
        }
    }

    public static C1993b a(C1993b c1993b, int i7, int i8, int i9, int i10) {
        int iMax = Math.max(0, c1993b.f20271a - i7);
        int iMax2 = Math.max(0, c1993b.f20272b - i8);
        int iMax3 = Math.max(0, c1993b.f20273c - i9);
        int iMax4 = Math.max(0, c1993b.f20274d - i10);
        return (iMax == i7 && iMax2 == i8 && iMax3 == i9 && iMax4 == i10) ? c1993b : C1993b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static m0 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m0 m0Var = new m0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = I.f2641a;
            m0 m0VarA = C.a(view);
            j0 j0Var = m0Var.f2725a;
            j0Var.t(m0VarA);
            j0Var.d(view.getRootView());
        }
        return m0Var;
    }

    public final WindowInsets b() {
        j0 j0Var = this.f2725a;
        if (j0Var instanceof e0) {
            return ((e0) j0Var).f2703c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return Objects.equals(this.f2725a, ((m0) obj).f2725a);
    }

    public final int hashCode() {
        j0 j0Var = this.f2725a;
        if (j0Var == null) {
            return 0;
        }
        return j0Var.hashCode();
    }

    public m0(m0 m0Var) {
        if (m0Var != null) {
            j0 j0Var = m0Var.f2725a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && (j0Var instanceof i0)) {
                this.f2725a = new i0(this, (i0) j0Var);
            } else if (i7 >= 29 && (j0Var instanceof h0)) {
                this.f2725a = new h0(this, (h0) j0Var);
            } else if (i7 >= 28 && (j0Var instanceof g0)) {
                this.f2725a = new g0(this, (g0) j0Var);
            } else if (j0Var instanceof f0) {
                this.f2725a = new f0(this, (f0) j0Var);
            } else if (j0Var instanceof e0) {
                this.f2725a = new e0(this, (e0) j0Var);
            } else {
                this.f2725a = new j0(this);
            }
            j0Var.e(this);
            return;
        }
        this.f2725a = new j0(this);
    }
}
