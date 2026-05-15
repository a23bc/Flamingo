package o;

import G1.AbstractC0144k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p.n;
import p.o;
import p.s;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A */
    public CharSequence f14578A;

    /* JADX INFO: renamed from: B */
    public CharSequence f14579B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ h f14582E;

    /* JADX INFO: renamed from: a */
    public final Menu f14583a;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public int f14590i;

    /* JADX INFO: renamed from: j */
    public int f14591j;

    /* JADX INFO: renamed from: k */
    public CharSequence f14592k;
    public CharSequence l;

    /* JADX INFO: renamed from: m */
    public int f14593m;

    /* JADX INFO: renamed from: n */
    public char f14594n;

    /* JADX INFO: renamed from: o */
    public int f14595o;

    /* JADX INFO: renamed from: p */
    public char f14596p;

    /* JADX INFO: renamed from: q */
    public int f14597q;

    /* JADX INFO: renamed from: r */
    public int f14598r;

    /* JADX INFO: renamed from: s */
    public boolean f14599s;

    /* JADX INFO: renamed from: t */
    public boolean f14600t;

    /* JADX INFO: renamed from: u */
    public boolean f14601u;

    /* JADX INFO: renamed from: v */
    public int f14602v;

    /* JADX INFO: renamed from: w */
    public int f14603w;

    /* JADX INFO: renamed from: x */
    public String f14604x;

    /* JADX INFO: renamed from: y */
    public String f14605y;

    /* JADX INFO: renamed from: z */
    public o f14606z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f14580C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f14581D = null;

    /* JADX INFO: renamed from: b */
    public int f14584b = 0;

    /* JADX INFO: renamed from: c */
    public int f14585c = 0;

    /* JADX INFO: renamed from: d */
    public int f14586d = 0;

    /* JADX INFO: renamed from: e */
    public int f14587e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f14588f = true;

    /* JADX INFO: renamed from: g */
    public boolean f14589g = true;

    public g(h hVar, Menu menu) {
        this.f14582E = hVar;
        this.f14583a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f14582E.f14611c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z6 = false;
        menuItem.setChecked(this.f14599s).setVisible(this.f14600t).setEnabled(this.f14601u).setCheckable(this.f14598r >= 1).setTitleCondensed(this.l).setIcon(this.f14593m);
        int i7 = this.f14602v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.f14605y;
        h hVar = this.f14582E;
        if (str != null) {
            if (hVar.f14611c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f14612d == null) {
                hVar.f14612d = h.a(hVar.f14611c);
            }
            Object obj = hVar.f14612d;
            String str2 = this.f14605y;
            f fVar = new f();
            fVar.f14576a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f14577b = cls.getMethod(str2, f.f14575c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e7) {
                StringBuilder sbU = Z1.l.u("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbU.append(cls.getName());
                InflateException inflateException = new InflateException(sbU.toString());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f14598r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f14864x = (nVar.f14864x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f14876d;
                    A1.a aVar = sVar.f14875c;
                    if (method == null) {
                        sVar.f14876d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f14876d.invoke(aVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.f14604x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f14607e, hVar.f14609a));
            z6 = true;
        }
        int i8 = this.f14603w;
        if (i8 > 0 && !z6) {
            menuItem.setActionView(i8);
        }
        o oVar = this.f14606z;
        if (oVar != null && (menuItem instanceof A1.a)) {
            ((A1.a) menuItem).a(oVar);
        }
        CharSequence charSequence = this.f14578A;
        boolean z7 = menuItem instanceof A1.a;
        if (z7) {
            ((A1.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0144k.f(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f14579B;
        if (z7) {
            ((A1.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0144k.j(menuItem, charSequence2);
        }
        char c7 = this.f14594n;
        int i9 = this.f14595o;
        if (z7) {
            ((A1.a) menuItem).setAlphabeticShortcut(c7, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0144k.e(menuItem, c7, i9);
        }
        char c8 = this.f14596p;
        int i10 = this.f14597q;
        if (z7) {
            ((A1.a) menuItem).setNumericShortcut(c8, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0144k.i(menuItem, c8, i10);
        }
        PorterDuff.Mode mode = this.f14581D;
        if (mode != null) {
            if (z7) {
                ((A1.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0144k.h(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f14580C;
        if (colorStateList != null) {
            if (z7) {
                ((A1.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0144k.g(menuItem, colorStateList);
            }
        }
    }
}
