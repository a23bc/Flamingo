package D1;

import C2.AbstractC0029a;
import C2.C;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import m5.AbstractC1209k;
import yos.music.player.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b f1451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f1452b;

    public a(b bVar, MainActivity mainActivity) {
        this.f1451a = bVar;
        this.f1452b = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (AbstractC0029a.B(view2)) {
            SplashScreenView splashScreenViewP = AbstractC0029a.p(view2);
            this.f1451a.getClass();
            AbstractC1209k.f(splashScreenViewP, "child");
            WindowInsets windowInsetsBuild = C.f().build();
            AbstractC1209k.e(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (windowInsetsBuild == splashScreenViewP.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.f1452b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
