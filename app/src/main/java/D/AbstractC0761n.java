package d;

import U5.AbstractActivityC0429a;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0761n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10798a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10799b = Color.argb(128, 27, 27, 27);

    public static void a(AbstractActivityC0429a abstractActivityC0429a) {
        C0745K c0745k = C0745K.f10744q;
        C0747M c0747m = new C0747M(0, 0, c0745k);
        C0747M c0747m2 = new C0747M(f10798a, f10799b, c0745k);
        View decorView = abstractActivityC0429a.getWindow().getDecorView();
        AbstractC1209k.e(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        AbstractC1209k.e(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) c0745k.b(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        AbstractC1209k.e(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) c0745k.b(resources2)).booleanValue();
        int i7 = Build.VERSION.SDK_INT;
        N5.d c0766s = i7 >= 30 ? new C0766s() : i7 >= 29 ? new C0765r() : i7 >= 28 ? new C0764q() : i7 >= 26 ? new C0763p() : new C0762o();
        Window window = abstractActivityC0429a.getWindow();
        AbstractC1209k.e(window, "window");
        c0766s.U(c0747m, c0747m2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = abstractActivityC0429a.getWindow();
        AbstractC1209k.e(window2, "window");
        c0766s.i(window2);
    }
}
