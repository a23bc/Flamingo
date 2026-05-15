package e;

import R0.C0401p0;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import d.AbstractActivityC0759l;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f11313a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(AbstractActivityC0759l abstractActivityC0759l, n0.d dVar) {
        View childAt = ((ViewGroup) abstractActivityC0759l.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0401p0 c0401p0 = childAt instanceof C0401p0 ? (C0401p0) childAt : null;
        if (c0401p0 != null) {
            c0401p0.setParentCompositionContext(null);
            c0401p0.setContent(dVar);
            return;
        }
        C0401p0 c0401p02 = new C0401p0(abstractActivityC0759l);
        c0401p02.setParentCompositionContext(null);
        c0401p02.setContent(dVar);
        View decorView = abstractActivityC0759l.getWindow().getDecorView();
        if (K.g(decorView) == null) {
            K.m(decorView, abstractActivityC0759l);
        }
        if (K.h(decorView) == null) {
            K.n(decorView, abstractActivityC0759l);
        }
        if (AbstractC1267a.w(decorView) == null) {
            AbstractC1267a.K(decorView, abstractActivityC0759l);
        }
        abstractActivityC0759l.setContentView(c0401p02, f11313a);
    }
}
