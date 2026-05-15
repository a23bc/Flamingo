package G1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import y1.C1993b;

/* JADX INFO: loaded from: classes.dex */
public final class U implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f2668b;

    public U(View view, P p7) {
        m0 m0VarB;
        this.f2667a = p7;
        WeakHashMap weakHashMap = I.f2641a;
        m0 m0VarA = C.a(view);
        if (m0VarA != null) {
            int i7 = Build.VERSION.SDK_INT;
            m0VarB = (i7 >= 30 ? new c0(m0VarA) : i7 >= 29 ? new b0(m0VarA) : new a0(m0VarA)).b();
        } else {
            m0VarB = null;
        }
        this.f2668b = m0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        j0 j0Var;
        if (!view.isLaidOut()) {
            this.f2668b = m0.c(view, windowInsets);
            return V.j(view, windowInsets);
        }
        m0 m0VarC = m0.c(view, windowInsets);
        if (this.f2668b == null) {
            WeakHashMap weakHashMap = I.f2641a;
            this.f2668b = C.a(view);
        }
        if (this.f2668b == null) {
            this.f2668b = m0VarC;
            return V.j(view, windowInsets);
        }
        P pK = V.k(view);
        if (pK != null && Objects.equals((WindowInsets) pK.f2654p, windowInsets)) {
            return V.j(view, windowInsets);
        }
        m0 m0Var = this.f2668b;
        int i7 = 1;
        int i8 = 0;
        while (true) {
            j0Var = m0VarC.f2725a;
            if (i7 > 256) {
                break;
            }
            if (!j0Var.g(i7).equals(m0Var.f2725a.g(i7))) {
                i8 |= i7;
            }
            i7 <<= 1;
        }
        if (i8 == 0) {
            return V.j(view, windowInsets);
        }
        m0 m0Var2 = this.f2668b;
        Z z6 = new Z(i8, (i8 & 8) != 0 ? j0Var.g(8).f20274d > m0Var2.f2725a.g(8).f20274d ? V.f2669e : V.f2670f : V.f2671g, 160L);
        z6.f2681a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(z6.f2681a.a());
        C1993b c1993bG = j0Var.g(i8);
        C1993b c1993bG2 = m0Var2.f2725a.g(i8);
        int iMin = Math.min(c1993bG.f20271a, c1993bG2.f20271a);
        int i9 = c1993bG.f20272b;
        int i10 = c1993bG2.f20272b;
        int iMin2 = Math.min(i9, i10);
        int i11 = c1993bG.f20273c;
        int i12 = c1993bG2.f20273c;
        int iMin3 = Math.min(i11, i12);
        int i13 = c1993bG.f20274d;
        int i14 = i8;
        int i15 = c1993bG2.f20274d;
        V.o oVar = new V.o(C1993b.b(iMin, iMin2, iMin3, Math.min(i13, i15)), 14, C1993b.b(Math.max(c1993bG.f20271a, c1993bG2.f20271a), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i15)));
        V.g(view, z6, windowInsets, false);
        duration.addUpdateListener(new Q(z6, m0VarC, m0Var2, i14, view));
        duration.addListener(new S(z6, view));
        T t7 = new T(view, z6, oVar, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0149p viewTreeObserverOnPreDrawListenerC0149p = new ViewTreeObserverOnPreDrawListenerC0149p(view, t7);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0149p);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0149p);
        this.f2668b = m0VarC;
        return V.j(view, windowInsets);
    }
}
