package m;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import t.AbstractC1464t;
import t.C1463s;
import t.U;
import u.AbstractC1525a;

/* JADX INFO: renamed from: m.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1185b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A */
    public boolean f14265A;

    /* JADX INFO: renamed from: B */
    public ColorFilter f14266B;

    /* JADX INFO: renamed from: C */
    public boolean f14267C;

    /* JADX INFO: renamed from: D */
    public ColorStateList f14268D;

    /* JADX INFO: renamed from: E */
    public PorterDuff.Mode f14269E;

    /* JADX INFO: renamed from: F */
    public boolean f14270F;

    /* JADX INFO: renamed from: G */
    public boolean f14271G;

    /* JADX INFO: renamed from: H */
    public int[][] f14272H;

    /* JADX INFO: renamed from: I */
    public C1463s f14273I;

    /* JADX INFO: renamed from: J */
    public U f14274J;

    /* JADX INFO: renamed from: a */
    public final C1188e f14275a;

    /* JADX INFO: renamed from: b */
    public Resources f14276b;

    /* JADX INFO: renamed from: c */
    public int f14277c;

    /* JADX INFO: renamed from: d */
    public int f14278d;

    /* JADX INFO: renamed from: e */
    public int f14279e;

    /* JADX INFO: renamed from: f */
    public SparseArray f14280f;

    /* JADX INFO: renamed from: g */
    public Drawable[] f14281g;
    public int h;

    /* JADX INFO: renamed from: i */
    public boolean f14282i;

    /* JADX INFO: renamed from: j */
    public boolean f14283j;

    /* JADX INFO: renamed from: k */
    public Rect f14284k;
    public boolean l;

    /* JADX INFO: renamed from: m */
    public boolean f14285m;

    /* JADX INFO: renamed from: n */
    public int f14286n;

    /* JADX INFO: renamed from: o */
    public int f14287o;

    /* JADX INFO: renamed from: p */
    public int f14288p;

    /* JADX INFO: renamed from: q */
    public int f14289q;

    /* JADX INFO: renamed from: r */
    public boolean f14290r;

    /* JADX INFO: renamed from: s */
    public int f14291s;

    /* JADX INFO: renamed from: t */
    public boolean f14292t;

    /* JADX INFO: renamed from: u */
    public boolean f14293u;

    /* JADX INFO: renamed from: v */
    public boolean f14294v;

    /* JADX INFO: renamed from: w */
    public boolean f14295w;

    /* JADX INFO: renamed from: x */
    public int f14296x;

    /* JADX INFO: renamed from: y */
    public int f14297y;

    /* JADX INFO: renamed from: z */
    public int f14298z;

    public C1185b(C1185b c1185b, C1188e c1188e, Resources resources) {
        this.f14282i = false;
        this.l = false;
        this.f14295w = true;
        this.f14297y = 0;
        this.f14298z = 0;
        this.f14275a = c1188e;
        this.f14276b = resources != null ? resources : c1185b != null ? c1185b.f14276b : null;
        int i7 = c1185b != null ? c1185b.f14277c : 0;
        int i8 = C1188e.f14304H;
        i7 = resources != null ? resources.getDisplayMetrics().densityDpi : i7;
        i7 = i7 == 0 ? 160 : i7;
        this.f14277c = i7;
        if (c1185b != null) {
            this.f14278d = c1185b.f14278d;
            this.f14279e = c1185b.f14279e;
            this.f14293u = true;
            this.f14294v = true;
            this.f14282i = c1185b.f14282i;
            this.l = c1185b.l;
            this.f14295w = c1185b.f14295w;
            this.f14296x = c1185b.f14296x;
            this.f14297y = c1185b.f14297y;
            this.f14298z = c1185b.f14298z;
            this.f14265A = c1185b.f14265A;
            this.f14266B = c1185b.f14266B;
            this.f14267C = c1185b.f14267C;
            this.f14268D = c1185b.f14268D;
            this.f14269E = c1185b.f14269E;
            this.f14270F = c1185b.f14270F;
            this.f14271G = c1185b.f14271G;
            if (c1185b.f14277c == i7) {
                if (c1185b.f14283j) {
                    this.f14284k = c1185b.f14284k != null ? new Rect(c1185b.f14284k) : null;
                    this.f14283j = true;
                }
                if (c1185b.f14285m) {
                    this.f14286n = c1185b.f14286n;
                    this.f14287o = c1185b.f14287o;
                    this.f14288p = c1185b.f14288p;
                    this.f14289q = c1185b.f14289q;
                    this.f14285m = true;
                }
            }
            if (c1185b.f14290r) {
                this.f14291s = c1185b.f14291s;
                this.f14290r = true;
            }
            if (c1185b.f14292t) {
                this.f14292t = true;
            }
            Drawable[] drawableArr = c1185b.f14281g;
            this.f14281g = new Drawable[drawableArr.length];
            this.h = c1185b.h;
            SparseArray sparseArray = c1185b.f14280f;
            if (sparseArray != null) {
                this.f14280f = sparseArray.clone();
            } else {
                this.f14280f = new SparseArray(this.h);
            }
            int i9 = this.h;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f14280f.put(i10, constantState);
                    } else {
                        this.f14281g[i10] = drawableArr[i10];
                    }
                }
            }
        } else {
            this.f14281g = new Drawable[10];
            this.h = 0;
        }
        if (c1185b != null) {
            this.f14272H = c1185b.f14272H;
        } else {
            this.f14272H = new int[this.f14281g.length][];
        }
        if (c1185b != null) {
            this.f14273I = c1185b.f14273I;
            this.f14274J = c1185b.f14274J;
        } else {
            this.f14273I = new C1463s((Object) null);
            this.f14274J = new U(0);
        }
    }

    public final int a(Drawable drawable) {
        int i7 = this.h;
        if (i7 >= this.f14281g.length) {
            int i8 = i7 + 10;
            Drawable[] drawableArr = new Drawable[i8];
            Drawable[] drawableArr2 = this.f14281g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f14281g = drawableArr;
            int[][] iArr = new int[i8][];
            System.arraycopy(this.f14272H, 0, iArr, 0, i7);
            this.f14272H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f14275a);
        this.f14281g[i7] = drawable;
        this.h++;
        this.f14279e = drawable.getChangingConfigurations() | this.f14279e;
        this.f14290r = false;
        this.f14292t = false;
        this.f14284k = null;
        this.f14283j = false;
        this.f14285m = false;
        this.f14293u = false;
        return i7;
    }

    public final void b() {
        this.f14285m = true;
        c();
        int i7 = this.h;
        Drawable[] drawableArr = this.f14281g;
        this.f14287o = -1;
        this.f14286n = -1;
        this.f14289q = 0;
        this.f14288p = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f14286n) {
                this.f14286n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f14287o) {
                this.f14287o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f14288p) {
                this.f14288p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f14289q) {
                this.f14289q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f14280f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                int iKeyAt = this.f14280f.keyAt(i7);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14280f.valueAt(i7);
                Drawable[] drawableArr = this.f14281g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f14276b);
                drawableNewDrawable.setLayoutDirection(this.f14296x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f14275a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f14280f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i7 = this.h;
        Drawable[] drawableArr = this.f14281g;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14280f.get(i8);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i7) {
        int iIndexOfKey;
        Drawable drawable = this.f14281g[i7];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f14280f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i7)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f14280f.valueAt(iIndexOfKey)).newDrawable(this.f14276b);
        drawableNewDrawable.setLayoutDirection(this.f14296x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f14275a);
        this.f14281g[i7] = drawableMutate;
        this.f14280f.removeAt(iIndexOfKey);
        if (this.f14280f.size() == 0) {
            this.f14280f = null;
        }
        return drawableMutate;
    }

    public final int e(int i7) {
        Object obj;
        if (i7 < 0) {
            return 0;
        }
        U u7 = this.f14274J;
        Object obj2 = 0;
        int iA = AbstractC1525a.a(u7.f16040r, i7, u7.f16038p);
        if (iA >= 0 && (obj = u7.f16039q[iA]) != AbstractC1464t.f16109c) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f14272H;
        int i7 = this.h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f14278d | this.f14279e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1188e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1188e(this, resources);
    }
}
