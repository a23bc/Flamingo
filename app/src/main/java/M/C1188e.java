package m;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import j0.k;

/* JADX INFO: renamed from: m.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1188e extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f14304H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1185b f14305A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14306B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1185b f14307C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public k f14308D;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f14311G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1185b f14312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Rect f14313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f14314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f14315r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14317t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B3.c f14320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f14321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f14322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public L3.b f14323z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14316s = 255;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14318u = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14309E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14310F = -1;

    public C1188e(C1185b c1185b, Resources resources) {
        i(new C1185b(c1185b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0279, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m.C1188e c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1188e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):m.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f14317t = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f14314q
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f14321x
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f14316s
            r3.setAlpha(r9)
            r13.f14321x = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            m.b r10 = r13.f14312o
            int r10 = r10.f14297y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f14316s
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f14321x = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f14315r
            if (r9 == 0) goto L61
            long r10 = r13.f14322y
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f14315r = r0
            r13.f14322y = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            m.b r4 = r13.f14312o
            int r4 = r4.f14298z
            int r3 = r3 / r4
            int r4 = r13.f14316s
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f14322y = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            B3.c r14 = r13.f14320w
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1188e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        C1185b c1185b = this.f14312o;
        if (theme == null) {
            c1185b.getClass();
            return;
        }
        c1185b.c();
        int i7 = c1185b.h;
        Drawable[] drawableArr = c1185b.f14281g;
        for (int i8 = 0; i8 < i7; i8++) {
            Drawable drawable = drawableArr[i8];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i8].applyTheme(theme);
                c1185b.f14279e |= drawableArr[i8].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c1185b.f14276b = resources;
            int i9 = resources.getDisplayMetrics().densityDpi;
            if (i9 == 0) {
                i9 = 160;
            }
            int i10 = c1185b.f14277c;
            c1185b.f14277c = i9;
            if (i10 != i9) {
                c1185b.f14285m = false;
                c1185b.f14283j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f14312o.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f14323z == null) {
            this.f14323z = new L3.b();
        }
        L3.b bVar = this.f14323z;
        bVar.f4248p = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f14312o.f14297y <= 0 && this.f14317t) {
                drawable.setAlpha(this.f14316s);
            }
            C1185b c1185b = this.f14312o;
            if (c1185b.f14267C) {
                drawable.setColorFilter(c1185b.f14266B);
            } else {
                if (c1185b.f14270F) {
                    drawable.setTintList(c1185b.f14268D);
                }
                C1185b c1185b2 = this.f14312o;
                if (c1185b2.f14271G) {
                    drawable.setTintMode(c1185b2.f14269E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f14312o.f14295w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f14312o.f14265A);
            Rect rect = this.f14313p;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            L3.b bVar2 = this.f14323z;
            Drawable.Callback callback = (Drawable.Callback) bVar2.f4248p;
            bVar2.f4248p = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            L3.b bVar3 = this.f14323z;
            Drawable.Callback callback2 = (Drawable.Callback) bVar3.f4248p;
            bVar3.f4248p = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f14315r;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z6;
        Drawable drawable = this.f14315r;
        boolean z7 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f14315r = null;
            z6 = true;
        } else {
            z6 = false;
        }
        Drawable drawable2 = this.f14314q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f14317t) {
                this.f14314q.setAlpha(this.f14316s);
            }
        }
        if (this.f14322y != 0) {
            this.f14322y = 0L;
            z6 = true;
        }
        if (this.f14321x != 0) {
            this.f14321x = 0L;
        } else {
            z7 = z6;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f14319v && super.mutate() == this) {
            C1185b c1185b = new C1185b(this.f14307C, this, null);
            c1185b.f14273I = c1185b.f14273I.clone();
            c1185b.f14274J = c1185b.f14274J.clone();
            i(c1185b);
            this.f14319v = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f14306B) {
            f();
            C1185b c1185b = this.f14305A;
            c1185b.f14273I = c1185b.f14273I.clone();
            c1185b.f14274J = c1185b.f14274J.clone();
            this.f14306B = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f14316s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f14312o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z6;
        C1185b c1185b = this.f14312o;
        if (!c1185b.f14293u) {
            c1185b.c();
            c1185b.f14293u = true;
            int i7 = c1185b.h;
            Drawable[] drawableArr = c1185b.f14281g;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    c1185b.f14294v = true;
                    z6 = true;
                    break;
                }
                if (drawableArr[i8].getConstantState() == null) {
                    c1185b.f14294v = false;
                    z6 = false;
                    break;
                }
                i8++;
            }
        } else {
            z6 = c1185b.f14294v;
        }
        if (!z6) {
            return null;
        }
        this.f14312o.f14278d = getChangingConfigurations();
        return this.f14312o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f14314q;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f14313p;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C1185b c1185b = this.f14312o;
        if (c1185b.l) {
            if (!c1185b.f14285m) {
                c1185b.b();
            }
            return c1185b.f14287o;
        }
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C1185b c1185b = this.f14312o;
        if (c1185b.l) {
            if (!c1185b.f14285m) {
                c1185b.b();
            }
            return c1185b.f14286n;
        }
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C1185b c1185b = this.f14312o;
        if (c1185b.l) {
            if (!c1185b.f14285m) {
                c1185b.b();
            }
            return c1185b.f14289q;
        }
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C1185b c1185b = this.f14312o;
        if (c1185b.l) {
            if (!c1185b.f14285m) {
                c1185b.b();
            }
            return c1185b.f14288p;
        }
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f14314q;
        if (drawable != null && drawable.isVisible()) {
            C1185b c1185b = this.f14312o;
            if (c1185b.f14290r) {
                return c1185b.f14291s;
            }
            c1185b.c();
            int i7 = c1185b.h;
            Drawable[] drawableArr = c1185b.f14281g;
            opacity = i7 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i8 = 1; i8 < i7; i8++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i8].getOpacity());
            }
            c1185b.f14291s = opacity;
            c1185b.f14290r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C1185b c1185b = this.f14312o;
        boolean padding = false;
        Rect rect2 = null;
        if (!c1185b.f14282i) {
            Rect rect3 = c1185b.f14284k;
            if (rect3 != null || c1185b.f14283j) {
                rect2 = rect3;
            } else {
                c1185b.c();
                Rect rect4 = new Rect();
                int i7 = c1185b.h;
                Drawable[] drawableArr = c1185b.f14281g;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (drawableArr[i8].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i9 = rect4.left;
                        if (i9 > rect2.left) {
                            rect2.left = i9;
                        }
                        int i10 = rect4.top;
                        if (i10 > rect2.top) {
                            rect2.top = i10;
                        }
                        int i11 = rect4.right;
                        if (i11 > rect2.right) {
                            rect2.right = i11;
                        }
                        int i12 = rect4.bottom;
                        if (i12 > rect2.bottom) {
                            rect2.bottom = i12;
                        }
                    }
                }
                c1185b.f14283j = true;
                c1185b.f14284k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f14314q;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f14312o.f14265A && getLayoutDirection() == 1) {
            int i13 = rect.left;
            rect.left = rect.right;
            rect.right = i13;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f14318u
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            m.b r0 = r9.f14312o
            int r0 = r0.f14298z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f14315r
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f14314q
            if (r0 == 0) goto L29
            r9.f14315r = r0
            m.b r0 = r9.f14312o
            int r0 = r0.f14298z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f14322y = r0
            goto L35
        L29:
            r9.f14315r = r4
            r9.f14322y = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f14314q
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            m.b r0 = r9.f14312o
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f14314q = r0
            r9.f14318u = r10
            if (r0 == 0) goto L5a
            m.b r10 = r9.f14312o
            int r10 = r10.f14297y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f14321x = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f14314q = r4
            r10 = -1
            r9.f14318u = r10
        L5a:
            long r0 = r9.f14321x
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f14322y
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            B3.c r10 = r9.f14320w
            if (r10 != 0) goto L75
            B3.c r10 = new B3.c
            r1 = 9
            r10.<init>(r1, r9)
            r9.f14320w = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1188e.h(int):boolean");
    }

    public final void i(C1185b c1185b) {
        this.f14312o = c1185b;
        int i7 = this.f14318u;
        if (i7 >= 0) {
            Drawable drawableD = c1185b.d(i7);
            this.f14314q = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.f14315r = null;
        this.f14305A = c1185b;
        this.f14307C = c1185b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1185b c1185b = this.f14312o;
        if (c1185b != null) {
            c1185b.f14290r = false;
            c1185b.f14292t = false;
        }
        if (drawable != this.f14314q || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f14312o.f14265A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        Drawable drawable = this.f14315r;
        if (drawable != null) {
            drawable.setVisible(z6, z7);
        }
        Drawable drawable2 = this.f14314q;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z7);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        k kVar = this.f14308D;
        if (kVar != null) {
            kVar.E();
            this.f14308D = null;
            h(this.f14309E);
            this.f14309E = -1;
            this.f14310F = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f14311G) {
            g();
            C1185b c1185b = this.f14307C;
            c1185b.f14273I = c1185b.f14273I.clone();
            c1185b.f14274J = c1185b.f14274J.clone();
            this.f14311G = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14315r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f14314q;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        C1185b c1185b = this.f14312o;
        int i8 = this.f14318u;
        int i9 = c1185b.h;
        Drawable[] drawableArr = c1185b.f14281g;
        boolean z6 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i7);
                if (i10 == i8) {
                    z6 = layoutDirection;
                }
            }
        }
        c1185b.f14296x = i7;
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f14315r;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f14314q;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1188e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable != this.f14314q || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f14317t && this.f14316s == i7) {
            return;
        }
        this.f14317t = true;
        this.f14316s = i7;
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            if (this.f14321x == 0) {
                drawable.setAlpha(i7);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        C1185b c1185b = this.f14312o;
        if (c1185b.f14265A != z6) {
            c1185b.f14265A = z6;
            Drawable drawable = this.f14314q;
            if (drawable != null) {
                drawable.setAutoMirrored(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1185b c1185b = this.f14312o;
        c1185b.f14267C = true;
        if (c1185b.f14266B != colorFilter) {
            c1185b.f14266B = colorFilter;
            Drawable drawable = this.f14314q;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        C1185b c1185b = this.f14312o;
        if (c1185b.f14295w != z6) {
            c1185b.f14295w = z6;
            Drawable drawable = this.f14314q;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f7, float f8) {
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            drawable.setHotspot(f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f14313p;
        if (rect == null) {
            this.f14313p = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f14314q;
        if (drawable != null) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C1185b c1185b = this.f14312o;
        c1185b.f14270F = true;
        if (c1185b.f14268D != colorStateList) {
            c1185b.f14268D = colorStateList;
            this.f14314q.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C1185b c1185b = this.f14312o;
        c1185b.f14271G = true;
        if (c1185b.f14269E != mode) {
            c1185b.f14269E = mode;
            this.f14314q.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        boolean zJ = j(z6, z7);
        k kVar = this.f14308D;
        if (kVar != null && (zJ || z7)) {
            if (z6) {
                kVar.D();
                return zJ;
            }
            jumpToCurrentState();
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f14314q || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
