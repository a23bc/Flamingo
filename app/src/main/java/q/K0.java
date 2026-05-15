package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import t.AbstractC1464t;
import t.C1463s;
import u.AbstractC1525a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: i */
    public static K0 f15183i;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f15185a;

    /* JADX INFO: renamed from: b */
    public t.T f15186b;

    /* JADX INFO: renamed from: c */
    public t.U f15187c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f15188d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f15189e;

    /* JADX INFO: renamed from: f */
    public boolean f15190f;

    /* JADX INFO: renamed from: g */
    public B2.h f15191g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    public static final T4.j f15184j = new T4.j(6, 1);

    public static synchronized K0 d() {
        try {
            if (f15183i == null) {
                K0 k02 = new K0();
                f15183i = k02;
                j(k02);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15183i;
    }

    public static synchronized PorterDuffColorFilter h(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        T4.j jVar = f15184j;
        jVar.getClass();
        int i8 = (31 + i7) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) jVar.c(Integer.valueOf(mode.hashCode() + i8));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(K0 k02) {
        if (Build.VERSION.SDK_INT < 24) {
            k02.a("vector", new J0(3));
            k02.a("animated-vector", new J0(2));
            k02.a("animated-selector", new J0(1));
            k02.a("drawable", new J0(0));
        }
    }

    public final void a(String str, J0 j02) {
        if (this.f15186b == null) {
            this.f15186b = new t.T(0);
        }
        this.f15186b.put(str, j02);
    }

    public final synchronized void b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1463s c1463s = (C1463s) this.f15188d.get(context);
                if (c1463s == null) {
                    c1463s = new C1463s((Object) null);
                    this.f15188d.put(context, c1463s);
                }
                c1463s.f(j3, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i7) {
        if (this.f15189e == null) {
            this.f15189e = new TypedValue();
        }
        TypedValue typedValue = this.f15189e;
        context.getResources().getValue(i7, typedValue, true);
        long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j3);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableE = null;
        if (this.f15191g != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawableE = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawableE = B2.h.e(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableE = B2.h.e(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableE = B2.h.e(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableE != null) {
            layerDrawableE.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawableE);
        }
        return layerDrawableE;
    }

    public final synchronized Drawable e(Context context, long j3) {
        Object obj;
        C1463s c1463s = (C1463s) this.f15188d.get(context);
        if (c1463s == null) {
            return null;
        }
        int iB = AbstractC1525a.b(c1463s.f16104p, c1463s.f16106r, j3);
        if (iB < 0 || (obj = c1463s.f16105q[iB]) == AbstractC1464t.f16107a) {
            obj = null;
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1463s.g(j3);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i7) {
        return g(context, i7, false);
    }

    public final synchronized Drawable g(Context context, int i7, boolean z6) {
        Drawable drawableK;
        try {
            if (!this.f15190f) {
                this.f15190f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof L3.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f15190f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i7);
            if (drawableK == null) {
                drawableK = c(context, i7);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i7);
            }
            if (drawableK != null) {
                drawableK = n(context, i7, z6, drawableK);
            }
            if (drawableK != null) {
                AbstractC1322k0.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i7) {
        ColorStateList colorStateList;
        t.U u7;
        WeakHashMap weakHashMap = this.f15185a;
        ColorStateList colorStateListF = null;
        colorStateList = (weakHashMap == null || (u7 = (t.U) weakHashMap.get(context)) == null) ? null : (ColorStateList) u7.e(i7);
        if (colorStateList == null) {
            B2.h hVar = this.f15191g;
            if (hVar != null) {
                colorStateListF = hVar.f(context, i7);
            }
            if (colorStateListF != null) {
                if (this.f15185a == null) {
                    this.f15185a = new WeakHashMap();
                }
                t.U u8 = (t.U) this.f15185a.get(context);
                if (u8 == null) {
                    u8 = new t.U(0);
                    this.f15185a.put(context, u8);
                }
                u8.a(i7, colorStateListF);
            }
            colorStateList = colorStateListF;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i7) {
        int next;
        t.T t7 = this.f15186b;
        if (t7 == null || t7.isEmpty()) {
            return null;
        }
        t.U u7 = this.f15187c;
        if (u7 != null) {
            String str = (String) u7.e(i7);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f15186b.get(str) == null) {
                return null;
            }
        } else {
            this.f15187c = new t.U(0);
        }
        if (this.f15189e == null) {
            this.f15189e = new TypedValue();
        }
        TypedValue typedValue = this.f15189e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j3);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f15187c.a(i7, name);
                J0 j02 = (J0) this.f15186b.get(name);
                if (j02 != null) {
                    drawableE = j02.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j3, drawableE);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableE == null) {
            this.f15187c.a(i7, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        C1463s c1463s = (C1463s) this.f15188d.get(context);
        if (c1463s != null) {
            c1463s.b();
        }
    }

    public final synchronized void m(B2.h hVar) {
        this.f15191g = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.K0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
