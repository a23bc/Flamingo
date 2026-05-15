package G1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static m0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m0 m0VarC = m0.c(null, rootWindowInsets);
        j0 j0Var = m0VarC.f2725a;
        j0Var.t(m0VarC);
        j0Var.d(view.getRootView());
        return m0VarC;
    }

    public static void b(View view, int i7, int i8) {
        view.setScrollIndicators(i7, i8);
    }
}
