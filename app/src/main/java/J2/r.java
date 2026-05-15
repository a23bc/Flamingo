package J2;

import G1.B;
import G1.I;
import O0.C0324v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import j.AbstractC1089a;
import java.util.WeakHashMap;
import q.AbstractC1322k0;
import q.C1336s;
import q.S0;
import t.K;
import t.S;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a */
    public int f3725a;

    /* JADX INFO: renamed from: b */
    public Object f3726b;

    /* JADX INFO: renamed from: c */
    public Object f3727c;

    /* JADX INFO: renamed from: d */
    public Object f3728d;

    /* JADX INFO: renamed from: e */
    public Object f3729e;

    /* JADX INFO: renamed from: f */
    public Object f3730f;

    public r(View view) {
        this.f3725a = -1;
        this.f3726b = view;
        this.f3727c = C1336s.a();
    }

    public void a() {
        View view = (View) this.f3726b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((F5.h) this.f3728d) != null) {
                if (((F5.h) this.f3730f) == null) {
                    this.f3730f = new F5.h();
                }
                F5.h hVar = (F5.h) this.f3730f;
                hVar.f2360c = null;
                hVar.f2359b = false;
                hVar.f2361d = null;
                hVar.f2358a = false;
                WeakHashMap weakHashMap = I.f2641a;
                ColorStateList colorStateListC = B.c(view);
                if (colorStateListC != null) {
                    hVar.f2359b = true;
                    hVar.f2360c = colorStateListC;
                }
                PorterDuff.Mode modeD = B.d(view);
                if (modeD != null) {
                    hVar.f2358a = true;
                    hVar.f2361d = modeD;
                }
                if (hVar.f2359b || hVar.f2358a) {
                    C1336s.d(background, hVar, view.getDrawableState());
                    return;
                }
            }
            F5.h hVar2 = (F5.h) this.f3729e;
            if (hVar2 != null) {
                C1336s.d(background, hVar2, view.getDrawableState());
                return;
            }
            F5.h hVar3 = (F5.h) this.f3728d;
            if (hVar3 != null) {
                C1336s.d(background, hVar3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        F5.h hVar = (F5.h) this.f3729e;
        if (hVar != null) {
            return (ColorStateList) hVar.f2360c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        F5.h hVar = (F5.h) this.f3729e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f2361d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListI;
        View view = (View) this.f3726b;
        Context context = view.getContext();
        int[] iArr = AbstractC1089a.f13616y;
        S0 s0K = S0.k(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        View view2 = (View) this.f3726b;
        I.g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) s0K.f15226q, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f3725a = typedArray.getResourceId(0, -1);
                C1336s c1336s = (C1336s) this.f3727c;
                Context context2 = view.getContext();
                int i8 = this.f3725a;
                synchronized (c1336s) {
                    colorStateListI = c1336s.f15390a.i(context2, i8);
                }
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                B.e(view, s0K.f(1));
            }
            if (typedArray.hasValue(2)) {
                B.f(view, AbstractC1322k0.b(typedArray.getInt(2, -1), null));
            }
            s0K.l();
        } catch (Throwable th) {
            s0K.l();
            throw th;
        }
    }

    public void e() {
        this.f3725a = -1;
        g(null);
        a();
    }

    public void f(int i7) {
        ColorStateList colorStateListI;
        this.f3725a = i7;
        C1336s c1336s = (C1336s) this.f3727c;
        if (c1336s != null) {
            Context context = ((View) this.f3726b).getContext();
            synchronized (c1336s) {
                colorStateListI = c1336s.f15390a.i(context, i7);
            }
        } else {
            colorStateListI = null;
        }
        g(colorStateListI);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((F5.h) this.f3728d) == null) {
                this.f3728d = new F5.h();
            }
            F5.h hVar = (F5.h) this.f3728d;
            hVar.f2360c = colorStateList;
            hVar.f2359b = true;
        } else {
            this.f3728d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((F5.h) this.f3729e) == null) {
            this.f3729e = new F5.h();
        }
        F5.h hVar = (F5.h) this.f3729e;
        hVar.f2360c = colorStateList;
        hVar.f2359b = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((F5.h) this.f3729e) == null) {
            this.f3729e = new F5.h();
        }
        F5.h hVar = (F5.h) this.f3729e;
        hVar.f2361d = mode;
        hVar.f2358a = true;
        a();
    }

    public r() {
        this.f3726b = new C0324v[32];
        this.f3727c = new float[32];
        this.f3728d = new byte[32];
        K k7 = S.f16033a;
        this.f3729e = new K();
        this.f3730f = new K();
    }
}
