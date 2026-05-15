package G1;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public final class W extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f2674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2675d;

    public W(P p7) {
        super(p7.f2653o);
        this.f2675d = new HashMap();
        this.f2672a = p7;
    }

    public final Z a(WindowInsetsAnimation windowInsetsAnimation) {
        Z z6 = (Z) this.f2675d.get(windowInsetsAnimation);
        if (z6 == null) {
            z6 = new Z(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                z6.f2681a = new X(windowInsetsAnimation);
            }
            this.f2675d.put(windowInsetsAnimation, z6);
        }
        return z6;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2672a.d(a(windowInsetsAnimation));
        this.f2675d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2672a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2674c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2674c = arrayList2;
            this.f2673b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = B0.l.j(list.get(size));
            Z zA = a(windowInsetsAnimationJ);
            zA.f2681a.e(windowInsetsAnimationJ.getFraction());
            this.f2674c.add(zA);
        }
        return this.f2672a.f(m0.c(null, windowInsets), this.f2673b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        V.o oVarG = this.f2672a.g(a(windowInsetsAnimation), new V.o(bounds));
        oVarG.getClass();
        B0.l.l();
        return B0.l.h(((C1993b) oVarG.f7342p).d(), ((C1993b) oVarG.f7343q).d());
    }
}
