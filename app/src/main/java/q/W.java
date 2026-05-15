package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import j.AbstractC1089a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a */
    public final TextView f15231a;

    /* JADX INFO: renamed from: b */
    public F5.h f15232b;

    /* JADX INFO: renamed from: c */
    public F5.h f15233c;

    /* JADX INFO: renamed from: d */
    public F5.h f15234d;

    /* JADX INFO: renamed from: e */
    public F5.h f15235e;

    /* JADX INFO: renamed from: f */
    public F5.h f15236f;

    /* JADX INFO: renamed from: g */
    public F5.h f15237g;
    public F5.h h;

    /* JADX INFO: renamed from: i */
    public final C1312f0 f15238i;

    /* JADX INFO: renamed from: j */
    public int f15239j = 0;

    /* JADX INFO: renamed from: k */
    public int f15240k = -1;
    public Typeface l;

    /* JADX INFO: renamed from: m */
    public boolean f15241m;

    public W(TextView textView) {
        this.f15231a = textView;
        this.f15238i = new C1312f0(textView);
    }

    public static F5.h c(Context context, C1336s c1336s, int i7) {
        ColorStateList colorStateListI;
        synchronized (c1336s) {
            colorStateListI = c1336s.f15390a.i(context, i7);
        }
        if (colorStateListI == null) {
            return null;
        }
        F5.h hVar = new F5.h();
        hVar.f2359b = true;
        hVar.f2360c = colorStateListI;
        return hVar;
    }

    public final void a(Drawable drawable, F5.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C1336s.d(drawable, hVar, this.f15231a.getDrawableState());
    }

    public final void b() {
        F5.h hVar = this.f15232b;
        TextView textView = this.f15231a;
        if (hVar != null || this.f15233c != null || this.f15234d != null || this.f15235e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f15232b);
            a(compoundDrawables[1], this.f15233c);
            a(compoundDrawables[2], this.f15234d);
            a(compoundDrawables[3], this.f15235e);
        }
        if (this.f15236f == null && this.f15237g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f15236f);
        a(compoundDrawablesRelative[2], this.f15237g);
    }

    public final ColorStateList d() {
        F5.h hVar = this.h;
        if (hVar != null) {
            return (ColorStateList) hVar.f2360c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        F5.h hVar = this.h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f2361d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:498:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:513:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.W.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i7) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC1089a.f13613v);
        S0 s02 = new S0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f15231a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, s02);
        if (i8 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            U.d(textView, string);
        }
        s02.l();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f15239j);
        }
    }

    public final void h(int i7, int i8, int i9, int i10) {
        C1312f0 c1312f0 = this.f15238i;
        if (c1312f0.j()) {
            DisplayMetrics displayMetrics = c1312f0.f15302j.getResources().getDisplayMetrics();
            c1312f0.k(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (c1312f0.h()) {
                c1312f0.a();
            }
        }
    }

    public final void i(int[] iArr, int i7) {
        C1312f0 c1312f0 = this.f15238i;
        if (c1312f0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1312f0.f15302j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArrCopyOf[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                c1312f0.f15299f = C1312f0.b(iArrCopyOf);
                if (!c1312f0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1312f0.f15300g = false;
            }
            if (c1312f0.h()) {
                c1312f0.a();
            }
        }
    }

    public final void j(int i7) {
        C1312f0 c1312f0 = this.f15238i;
        if (c1312f0.j()) {
            if (i7 == 0) {
                c1312f0.f15294a = 0;
                c1312f0.f15297d = -1.0f;
                c1312f0.f15298e = -1.0f;
                c1312f0.f15296c = -1.0f;
                c1312f0.f15299f = new int[0];
                c1312f0.f15295b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(n1.c.s(i7, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1312f0.f15302j.getResources().getDisplayMetrics();
            c1312f0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1312f0.h()) {
                c1312f0.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new F5.h();
        }
        F5.h hVar = this.h;
        hVar.f2360c = colorStateList;
        hVar.f2359b = colorStateList != null;
        this.f15232b = hVar;
        this.f15233c = hVar;
        this.f15234d = hVar;
        this.f15235e = hVar;
        this.f15236f = hVar;
        this.f15237g = hVar;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new F5.h();
        }
        F5.h hVar = this.h;
        hVar.f2361d = mode;
        hVar.f2358a = mode != null;
        this.f15232b = hVar;
        this.f15233c = hVar;
        this.f15234d = hVar;
        this.f15235e = hVar;
        this.f15236f = hVar;
        this.f15237g = hVar;
    }

    public final void m(Context context, S0 s02) {
        String string;
        int i7 = this.f15239j;
        TypedArray typedArray = (TypedArray) s02.f15226q;
        this.f15239j = typedArray.getInt(2, i7);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f15240k = i9;
            if (i9 != -1) {
                this.f15239j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f15241m = false;
                int i10 = typedArray.getInt(1, 1);
                if (i10 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i11 = typedArray.hasValue(12) ? 12 : 10;
        int i12 = this.f15240k;
        int i13 = this.f15239j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = s02.i(i11, this.f15239j, new d1.e(this, i12, i13, new WeakReference(this.f15231a)));
                if (typefaceI != null) {
                    if (i8 < 28 || this.f15240k == -1) {
                        this.l = typefaceI;
                    } else {
                        this.l = V.a(Typeface.create(typefaceI, 0), this.f15240k, (this.f15239j & 2) != 0);
                    }
                }
                this.f15241m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f15240k == -1) {
            this.l = Typeface.create(string, this.f15239j);
        } else {
            this.l = V.a(Typeface.create(string, 0), this.f15240k, (this.f15239j & 2) != 0);
        }
    }
}
