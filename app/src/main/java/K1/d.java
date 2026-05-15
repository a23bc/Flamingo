package K1;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import q.C1334q0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f3948F = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f3949A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3950B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f3951C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f3952D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1334q0 f3953E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f3954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AccelerateInterpolator f3955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ListView f3956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B3.c f3957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f3958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f3959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f3960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f3962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f3963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f3964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3965z;

    public d(C1334q0 c1334q0) {
        a aVar = new a();
        aVar.f3944e = Long.MIN_VALUE;
        aVar.f3946g = -1L;
        aVar.f3945f = 0L;
        this.f3954o = aVar;
        this.f3955p = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3958s = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3959t = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3962w = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3963x = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3964y = fArr5;
        this.f3956q = c1334q0;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f8;
        fArr5[1] = f8;
        float f9 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f9;
        fArr4[1] = f9;
        this.f3960u = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3961v = f3948F;
        aVar.f3940a = 500;
        aVar.f3941b = 500;
        this.f3953E = c1334q0;
    }

    public static float b(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3958s
            r0 = r0[r7]
            float[] r1 = r3.f3959t
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f3955p
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f3962w
            r0 = r0[r7]
            float[] r1 = r3.f3963x
            r1 = r1[r7]
            float[] r2 = r3.f3964y
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.a(float, float, float, int):float");
    }

    public final float c(float f7, float f8) {
        if (f8 != 0.0f) {
            int i7 = this.f3960u;
            if (i7 == 0 || i7 == 1) {
                if (f7 < f8) {
                    if (f7 >= 0.0f) {
                        return 1.0f - (f7 / f8);
                    }
                    if (this.f3951C && i7 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i7 == 2 && f7 < 0.0f) {
                return f7 / (-f8);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f3949A) {
            this.f3951C = false;
            return;
        }
        a aVar = this.f3954o;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i8 = (int) (jCurrentAnimationTimeMillis - aVar.f3944e);
        int i9 = aVar.f3941b;
        if (i8 > i9) {
            i7 = i9;
        } else if (i8 >= 0) {
            i7 = i8;
        }
        aVar.f3947i = i7;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f3946g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C1334q0 c1334q0;
        int count;
        a aVar = this.f3954o;
        float f7 = aVar.f3943d;
        int iAbs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.f3942c);
        if (iAbs != 0 && (count = (c1334q0 = this.f3953E).getCount()) != 0) {
            int childCount = c1334q0.getChildCount();
            int firstVisiblePosition = c1334q0.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1334q0.getChildAt(0).getTop() >= 0)) : !(i7 >= count && c1334q0.getChildAt(childCount - 1).getBottom() <= c1334q0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r7.f3952D
            r2 = 0
            if (r1 != 0) goto L8
            goto L7c
        L8:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r0) goto L1f
            r8 = 3
            if (r1 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r2
        L1b:
            r7.f3950B = r3
            r7.f3965z = r2
        L1f:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f3956q
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r1, r4, r6, r2)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r9, r8, r4, r3)
            K1.a r9 = r7.f3954o
            r9.f3942c = r1
            r9.f3943d = r8
            boolean r8 = r7.f3951C
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            B3.c r8 = r7.f3957r
            if (r8 != 0) goto L60
            B3.c r8 = new B3.c
            r8.<init>(r0, r7)
            r7.f3957r = r8
        L60:
            r7.f3951C = r3
            r7.f3949A = r3
            boolean r8 = r7.f3965z
            if (r8 != 0) goto L75
            int r8 = r7.f3961v
            if (r8 <= 0) goto L75
            B3.c r9 = r7.f3957r
            long r0 = (long) r8
            java.util.WeakHashMap r8 = G1.I.f2641a
            r5.postOnAnimationDelayed(r9, r0)
            goto L7a
        L75:
            B3.c r8 = r7.f3957r
            r8.run()
        L7a:
            r7.f3965z = r3
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
