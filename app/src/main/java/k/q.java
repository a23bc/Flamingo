package k;

import G1.AbstractC0158z;
import G1.InterfaceC0147n;
import G1.a0;
import G1.b0;
import G1.c0;
import G1.d0;
import G1.j0;
import G1.m0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.InterfaceC1316h0;
import q.i1;
import q.j1;
import y1.C1993b;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC0147n, InterfaceC1316h0, p.w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C1111A f13938p;

    public /* synthetic */ q(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A, int i7) {
        this.f13937o = i7;
        this.f13938p = layoutInflaterFactory2C1111A;
    }

    @Override // p.w
    public boolean B(p.l lVar) {
        Window.Callback callback;
        switch (this.f13937o) {
            case 2:
                Window.Callback callback2 = this.f13938p.f13826z.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, lVar);
                }
                break;
            default:
                if (lVar == lVar.k()) {
                    LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13938p;
                    if (layoutInflaterFactory2C1111A.f13799U && (callback = layoutInflaterFactory2C1111A.f13826z.getCallback()) != null && !layoutInflaterFactory2C1111A.f13807f0) {
                        callback.onMenuOpened(108, lVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // p.w
    public void b(p.l lVar, boolean z6) {
        z zVar;
        switch (this.f13937o) {
            case 2:
                this.f13938p.n(lVar);
                break;
            default:
                p.l lVarK = lVar.k();
                int i7 = 0;
                boolean z7 = lVarK != lVar;
                if (z7) {
                    lVar = lVarK;
                }
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13938p;
                z[] zVarArr = layoutInflaterFactory2C1111A.a0;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i7 >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i7];
                        if (zVar == null || zVar.h != lVar) {
                            i7++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z7) {
                        layoutInflaterFactory2C1111A.o(zVar, z6);
                    } else {
                        layoutInflaterFactory2C1111A.m(zVar.f13952a, zVar, lVarK);
                        layoutInflaterFactory2C1111A.o(zVar, true);
                    }
                }
                break;
        }
    }

    @Override // G1.InterfaceC0147n
    public m0 j(View view, m0 m0Var) {
        int i7;
        boolean z6;
        boolean z7;
        m0 m0VarB = m0Var;
        j0 j0Var = m0VarB.f2725a;
        int i8 = j0Var.l().f20272b;
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13938p;
        layoutInflaterFactory2C1111A.getClass();
        int i9 = j0Var.l().f20272b;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C1111A.f13788J;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i7 = 0;
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C1111A.f13788J.getLayoutParams();
            if (layoutInflaterFactory2C1111A.f13788J.isShown()) {
                if (layoutInflaterFactory2C1111A.f13819r0 == null) {
                    layoutInflaterFactory2C1111A.f13819r0 = new Rect();
                    layoutInflaterFactory2C1111A.f13820s0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C1111A.f13819r0;
                Rect rect2 = layoutInflaterFactory2C1111A.f13820s0;
                z6 = true;
                rect.set(j0Var.l().f20271a, j0Var.l().f20272b, j0Var.l().f20273c, j0Var.l().f20274d);
                ViewGroup viewGroup = layoutInflaterFactory2C1111A.f13794P;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z8 = j1.f15320a;
                    i1.a(viewGroup, rect, rect2);
                } else {
                    if (!j1.f15320a) {
                        j1.f15320a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            j1.f15321b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                j1.f15321b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = j1.f15321b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[0] = rect;
                            z6 = true;
                            try {
                                objArr[1] = rect2;
                                method.invoke(viewGroup, objArr);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            z6 = true;
                        }
                    } else {
                        z6 = true;
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C1111A.f13794P;
                WeakHashMap weakHashMap = G1.I.f2641a;
                m0 m0VarA = G1.C.a(viewGroup2);
                int i13 = m0VarA == null ? 0 : m0VarA.f2725a.l().f20271a;
                int i14 = m0VarA == null ? 0 : m0VarA.f2725a.l().f20273c;
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z7 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z7 = z6;
                }
                Context context = layoutInflaterFactory2C1111A.f13825y;
                if (i10 <= 0 || layoutInflaterFactory2C1111A.f13796R != null) {
                    View view2 = layoutInflaterFactory2C1111A.f13796R;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != i14) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = i13;
                            marginLayoutParams2.rightMargin = i14;
                            layoutInflaterFactory2C1111A.f13796R.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C1111A.f13796R = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i13;
                    layoutParams.rightMargin = i14;
                    layoutInflaterFactory2C1111A.f13794P.addView(layoutInflaterFactory2C1111A.f13796R, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C1111A.f13796R;
                if (view4 == null) {
                    z6 = false;
                }
                if (z6 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C1111A.f13796R;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C1111A.f13801W && z6) {
                    i9 = 0;
                }
                i7 = 0;
            } else if (marginLayoutParams.topMargin != 0) {
                i7 = 0;
                marginLayoutParams.topMargin = 0;
                z7 = true;
                z6 = false;
            } else {
                i7 = 0;
                z7 = false;
                z6 = false;
            }
            if (z7) {
                layoutInflaterFactory2C1111A.f13788J.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C1111A.f13796R;
        if (view6 != null) {
            view6.setVisibility(z6 ? i7 : 8);
        }
        if (i8 != i9) {
            int i17 = j0Var.l().f20271a;
            int i18 = j0Var.l().f20273c;
            int i19 = j0Var.l().f20274d;
            int i20 = Build.VERSION.SDK_INT;
            d0 c0Var = i20 >= 30 ? new c0(m0VarB) : i20 >= 29 ? new b0(m0VarB) : new a0(m0VarB);
            c0Var.g(C1993b.b(i17, i9, i18, i19));
            m0VarB = c0Var.b();
        }
        WeakHashMap weakHashMap2 = G1.I.f2641a;
        WindowInsets windowInsetsB = m0VarB.b();
        if (windowInsetsB == null) {
            return m0VarB;
        }
        WindowInsets windowInsetsB2 = AbstractC0158z.b(view, windowInsetsB);
        return !windowInsetsB2.equals(windowInsetsB) ? m0.c(view, windowInsetsB2) : m0VarB;
    }
}
