package c0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import o5.AbstractC1267a;
import x0.C1892b;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class t extends View {

    /* JADX INFO: renamed from: t */
    public static final int[] f10594t = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: u */
    public static final int[] f10595u = new int[0];

    /* JADX INFO: renamed from: o */
    public F f10596o;

    /* JADX INFO: renamed from: p */
    public Boolean f10597p;

    /* JADX INFO: renamed from: q */
    public Long f10598q;

    /* JADX INFO: renamed from: r */
    public B2.e f10599r;

    /* JADX INFO: renamed from: s */
    public AbstractC1210l f10600s;

    private final void setRippleState(boolean z6) throws Exception {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f10599r;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f10598q;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z6 || jLongValue >= 5) {
            int[] iArr = z6 ? f10594t : f10595u;
            F f7 = this.f10596o;
            if (f7 != null) {
                f7.setState(iArr);
            }
        } else {
            B2.e eVar = new B2.e(14, this);
            this.f10599r = eVar;
            postDelayed(eVar, 50L);
        }
        this.f10598q = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(t tVar) {
        F f7 = tVar.f10596o;
        if (f7 != null) {
            f7.setState(f10595u);
        }
        tVar.f10599r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(B.m mVar, boolean z6, long j3, int i7, long j7, float f7, InterfaceC1180a interfaceC1180a) throws Exception {
        if (this.f10596o == null || !Boolean.valueOf(z6).equals(this.f10597p)) {
            F f8 = new F(z6);
            setBackground(f8);
            this.f10596o = f8;
            this.f10597p = Boolean.valueOf(z6);
        }
        F f9 = this.f10596o;
        AbstractC1209k.c(f9);
        this.f10600s = (AbstractC1210l) interfaceC1180a;
        Integer num = f9.f10528q;
        if (num == null || num.intValue() != i7) {
            f9.f10528q = Integer.valueOf(i7);
            E.f10525a.a(f9, i7);
        }
        e(f7, j3, j7);
        if (z6) {
            f9.setHotspot(C1892b.d(mVar.f600a), C1892b.e(mVar.f600a));
        } else {
            f9.setHotspot(f9.getBounds().centerX(), f9.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws Exception {
        this.f10600s = null;
        B2.e eVar = this.f10599r;
        if (eVar != null) {
            removeCallbacks(eVar);
            B2.e eVar2 = this.f10599r;
            AbstractC1209k.c(eVar2);
            eVar2.run();
        } else {
            F f7 = this.f10596o;
            if (f7 != null) {
                f7.setState(f10595u);
            }
        }
        F f8 = this.f10596o;
        if (f8 == null) {
            return;
        }
        f8.setVisible(false, false);
        unscheduleDrawable(f8);
    }

    public final void d() throws Exception {
        setRippleState(false);
    }

    public final void e(float f7, long j3, long j7) {
        F f8 = this.f10596o;
        if (f8 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f7 *= 2;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        long jB = C1987t.b(j7, f7);
        C1987t c1987t = f8.f10527p;
        if (!(c1987t == null ? false : C1987t.c(c1987t.f20264a, jB))) {
            f8.f10527p = new C1987t(jB);
            f8.setColor(ColorStateList.valueOf(AbstractC1959I.x(jB)));
        }
        Rect rect = new Rect(0, 0, AbstractC1267a.H(C1895e.d(j3)), AbstractC1267a.H(C1895e.b(j3)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        f8.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l5.a, m5.l] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r12 = this.f10600s;
        if (r12 != 0) {
            r12.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }
}
