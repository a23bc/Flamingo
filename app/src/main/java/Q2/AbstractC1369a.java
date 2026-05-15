package q2;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.K;
import androidx.lifecycle.Y;
import f0.C0912t;
import f0.D;
import n6.c;

/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1369a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f15525a = new D(new c(9));

    public static Y a(C0912t c0912t) {
        Y y6 = (Y) c0912t.j(f15525a);
        if (y6 != null) {
            c0912t.X(1260196493);
            c0912t.p(false);
            return y6;
        }
        c0912t.X(1260197609);
        Y yH = K.h((View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f));
        c0912t.p(false);
        return yH;
    }
}
