package G1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import o5.AbstractC1267a;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends j0 {
    public static boolean h = false;

    /* JADX INFO: renamed from: i */
    public static Method f2700i;

    /* JADX INFO: renamed from: j */
    public static Class f2701j;

    /* JADX INFO: renamed from: k */
    public static Field f2702k;
    public static Field l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f2703c;

    /* JADX INFO: renamed from: d */
    public C1993b[] f2704d;

    /* JADX INFO: renamed from: e */
    public C1993b f2705e;

    /* JADX INFO: renamed from: f */
    public m0 f2706f;

    /* JADX INFO: renamed from: g */
    public C1993b f2707g;

    public e0(m0 m0Var, WindowInsets windowInsets) {
        super(m0Var);
        this.f2705e = null;
        this.f2703c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void A() {
        try {
            f2700i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2701j = cls;
            f2702k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2702k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            e7.getMessage();
        }
        h = true;
    }

    @SuppressLint({"WrongConstant"})
    private C1993b v(int i7, boolean z6) {
        C1993b c1993bA = C1993b.f20270e;
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                c1993bA = C1993b.a(c1993bA, w(i8, z6));
            }
        }
        return c1993bA;
    }

    private C1993b x() {
        m0 m0Var = this.f2706f;
        return m0Var != null ? m0Var.f2725a.j() : C1993b.f20270e;
    }

    private C1993b y(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            A();
        }
        Method method = f2700i;
        if (method != null && f2701j != null && f2702k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke != null) {
                    Rect rect = (Rect) f2702k.get(l.get(objInvoke));
                    if (rect != null) {
                        return C1993b.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e7) {
                e7.getMessage();
            }
        }
        return null;
    }

    @Override // G1.j0
    public void d(View view) {
        C1993b c1993bY = y(view);
        if (c1993bY == null) {
            c1993bY = C1993b.f20270e;
        }
        s(c1993bY);
    }

    @Override // G1.j0
    public void e(m0 m0Var) {
        m0Var.f2725a.t(this.f2706f);
        m0Var.f2725a.s(this.f2707g);
    }

    @Override // G1.j0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2707g, ((e0) obj).f2707g);
        }
        return false;
    }

    @Override // G1.j0
    public C1993b g(int i7) {
        return v(i7, false);
    }

    @Override // G1.j0
    public C1993b h(int i7) {
        return v(i7, true);
    }

    @Override // G1.j0
    public final C1993b l() {
        if (this.f2705e == null) {
            WindowInsets windowInsets = this.f2703c;
            this.f2705e = C1993b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2705e;
    }

    @Override // G1.j0
    public m0 n(int i7, int i8, int i9, int i10) {
        m0 m0VarC = m0.c(null, this.f2703c);
        int i11 = Build.VERSION.SDK_INT;
        d0 c0Var = i11 >= 30 ? new c0(m0VarC) : i11 >= 29 ? new b0(m0VarC) : new a0(m0VarC);
        c0Var.g(m0.a(l(), i7, i8, i9, i10));
        c0Var.e(m0.a(j(), i7, i8, i9, i10));
        return c0Var.b();
    }

    @Override // G1.j0
    public boolean p() {
        return this.f2703c.isRound();
    }

    @Override // G1.j0
    @SuppressLint({"WrongConstant"})
    public boolean q(int i7) {
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0 && !z(i8)) {
                return false;
            }
        }
        return true;
    }

    @Override // G1.j0
    public void r(C1993b[] c1993bArr) {
        this.f2704d = c1993bArr;
    }

    @Override // G1.j0
    public void s(C1993b c1993b) {
        this.f2707g = c1993b;
    }

    @Override // G1.j0
    public void t(m0 m0Var) {
        this.f2706f = m0Var;
    }

    public C1993b w(int i7, boolean z6) {
        C1993b c1993bJ;
        int i8;
        if (i7 == 1) {
            return z6 ? C1993b.b(0, Math.max(x().f20272b, l().f20272b), 0, 0) : C1993b.b(0, l().f20272b, 0, 0);
        }
        if (i7 == 2) {
            if (z6) {
                C1993b c1993bX = x();
                C1993b c1993bJ2 = j();
                return C1993b.b(Math.max(c1993bX.f20271a, c1993bJ2.f20271a), 0, Math.max(c1993bX.f20273c, c1993bJ2.f20273c), Math.max(c1993bX.f20274d, c1993bJ2.f20274d));
            }
            C1993b c1993bL = l();
            m0 m0Var = this.f2706f;
            c1993bJ = m0Var != null ? m0Var.f2725a.j() : null;
            int iMin = c1993bL.f20274d;
            if (c1993bJ != null) {
                iMin = Math.min(iMin, c1993bJ.f20274d);
            }
            return C1993b.b(c1993bL.f20271a, 0, c1993bL.f20273c, iMin);
        }
        C1993b c1993b = C1993b.f20270e;
        if (i7 == 8) {
            C1993b[] c1993bArr = this.f2704d;
            c1993bJ = c1993bArr != null ? c1993bArr[AbstractC1267a.y(8)] : null;
            if (c1993bJ != null) {
                return c1993bJ;
            }
            C1993b c1993bL2 = l();
            C1993b c1993bX2 = x();
            int i9 = c1993bL2.f20274d;
            if (i9 > c1993bX2.f20274d) {
                return C1993b.b(0, 0, 0, i9);
            }
            C1993b c1993b2 = this.f2707g;
            if (c1993b2 != null && !c1993b2.equals(c1993b) && (i8 = this.f2707g.f20274d) > c1993bX2.f20274d) {
                return C1993b.b(0, 0, 0, i8);
            }
        } else {
            if (i7 == 16) {
                return k();
            }
            if (i7 == 32) {
                return i();
            }
            if (i7 == 64) {
                return m();
            }
            if (i7 == 128) {
                m0 m0Var2 = this.f2706f;
                C0141h c0141hF = m0Var2 != null ? m0Var2.f2725a.f() : f();
                if (c0141hF != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    return C1993b.b(i10 >= 28 ? B1.d.i(c0141hF.f2717a) : 0, i10 >= 28 ? B1.d.k(c0141hF.f2717a) : 0, i10 >= 28 ? B1.d.j(c0141hF.f2717a) : 0, i10 >= 28 ? B1.d.h(c0141hF.f2717a) : 0);
                }
            }
        }
        return c1993b;
    }

    public boolean z(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !w(i7, false).equals(C1993b.f20270e);
    }

    public e0(m0 m0Var, e0 e0Var) {
        this(m0Var, new WindowInsets(e0Var.f2703c));
    }
}
