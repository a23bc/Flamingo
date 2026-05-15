package G1;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f2683e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2684f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f2685g = null;
    public static boolean h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f2686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1993b f2687d;

    public a0() {
        this.f2686c = i();
    }

    private static WindowInsets i() {
        if (!f2684f) {
            try {
                f2683e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f2684f = true;
        }
        Field field = f2683e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                f2685g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = f2685g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // G1.d0
    public m0 b() {
        a();
        m0 m0VarC = m0.c(null, this.f2686c);
        C1993b[] c1993bArr = this.f2699b;
        j0 j0Var = m0VarC.f2725a;
        j0Var.r(c1993bArr);
        j0Var.u(this.f2687d);
        return m0VarC;
    }

    @Override // G1.d0
    public void e(C1993b c1993b) {
        this.f2687d = c1993b;
    }

    @Override // G1.d0
    public void g(C1993b c1993b) {
        WindowInsets windowInsets = this.f2686c;
        if (windowInsets != null) {
            this.f2686c = windowInsets.replaceSystemWindowInsets(c1993b.f20271a, c1993b.f20272b, c1993b.f20273c, c1993b.f20274d);
        }
    }

    public a0(m0 m0Var) {
        super(m0Var);
        this.f2686c = m0Var.b();
    }
}
