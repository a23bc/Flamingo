package q;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends D0 implements E0 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Method f15177R;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public k.I f15178Q;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f15177R = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // q.E0
    public final void g(p.l lVar, p.n nVar) {
        k.I i7 = this.f15178Q;
        if (i7 != null) {
            i7.g(lVar, nVar);
        }
    }

    @Override // q.D0
    public final C1334q0 p(Context context, boolean z6) {
        H0 h02 = new H0(context, z6);
        h02.setHoverListener(this);
        return h02;
    }

    @Override // q.E0
    public final void y(p.l lVar, p.n nVar) {
        k.I i7 = this.f15178Q;
        if (i7 != null) {
            i7.y(lVar, nVar);
        }
    }
}
