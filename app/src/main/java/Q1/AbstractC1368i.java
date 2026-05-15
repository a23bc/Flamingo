package q1;

import G1.B;
import G1.I;
import G1.InterfaceC0146m;
import G1.InterfaceC0147n;
import G1.j0;
import G1.m0;
import K0.A;
import K0.C;
import K0.E;
import O0.w0;
import Q0.C0365v;
import Q0.K;
import Q0.M;
import Q0.s0;
import Q0.t0;
import Q0.u0;
import R0.C0415x;
import R0.h1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.InterfaceC0597u;
import f0.InterfaceC0895k;
import f0.r;
import j5.AbstractC1110d;
import java.util.LinkedHashMap;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import o5.AbstractC1267a;
import r0.C1395m;
import r0.InterfaceC1398p;
import w5.AbstractC1767D;
import y1.C1993b;
import yos.music.player.R;

/* JADX INFO: renamed from: q1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1368i extends ViewGroup implements InterfaceC0146m, InterfaceC0895k, t0, InterfaceC0147n {

    /* JADX INFO: renamed from: A */
    public E3.f f15473A;

    /* JADX INFO: renamed from: B */
    public final int[] f15474B;

    /* JADX INFO: renamed from: C */
    public long f15475C;

    /* JADX INFO: renamed from: D */
    public m0 f15476D;

    /* JADX INFO: renamed from: E */
    public final C1367h f15477E;

    /* JADX INFO: renamed from: F */
    public final C1367h f15478F;

    /* JADX INFO: renamed from: G */
    public InterfaceC1182c f15479G;

    /* JADX INFO: renamed from: H */
    public final int[] f15480H;

    /* JADX INFO: renamed from: I */
    public int f15481I;

    /* JADX INFO: renamed from: J */
    public int f15482J;

    /* JADX INFO: renamed from: K */
    public final B2.m f15483K;

    /* JADX INFO: renamed from: L */
    public boolean f15484L;

    /* JADX INFO: renamed from: M */
    public final K f15485M;

    /* JADX INFO: renamed from: o */
    public final J0.d f15486o;

    /* JADX INFO: renamed from: p */
    public final View f15487p;

    /* JADX INFO: renamed from: q */
    public final s0 f15488q;

    /* JADX INFO: renamed from: r */
    public InterfaceC1180a f15489r;

    /* JADX INFO: renamed from: s */
    public boolean f15490s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1180a f15491t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1180a f15492u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1398p f15493v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1182c f15494w;

    /* JADX INFO: renamed from: x */
    public n1.d f15495x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1182c f15496y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0597u f15497z;

    public AbstractC1368i(Context context, r rVar, int i7, J0.d dVar, View view, s0 s0Var) {
        super(context);
        this.f15486o = dVar;
        this.f15487p = view;
        this.f15488q = s0Var;
        LinkedHashMap linkedHashMap = h1.f6463a;
        setTag(R.id.androidx_compose_ui_view_composition_context, rVar);
        setSaveFromParentEnabled(false);
        addView(view);
        q qVar = (q) this;
        I.j(this, new C1360a(qVar, 0));
        B.h(this, this);
        this.f15489r = C1366g.f15469s;
        this.f15491t = C1366g.f15468r;
        this.f15492u = C1366g.f15467q;
        C1395m c1395m = C1395m.f15634a;
        this.f15493v = c1395m;
        this.f15495x = AbstractC1113a.f();
        this.f15474B = new int[2];
        this.f15475C = 0L;
        this.f15477E = new C1367h(qVar, 1);
        this.f15478F = new C1367h(qVar, 0);
        this.f15480H = new int[2];
        this.f15481I = Integer.MIN_VALUE;
        this.f15482J = Integer.MIN_VALUE;
        this.f15483K = new B2.m();
        K k7 = new K(3);
        k7.f5804C = qVar;
        InterfaceC1398p interfaceC1398pA = Y0.l.a(androidx.compose.ui.input.nestedscroll.a.a(c1395m, k.f15498a, dVar), true, C1361b.f15451s);
        K0.B b7 = new K0.B();
        b7.f3820a = new C(qVar, 0);
        E e7 = new E();
        E e8 = b7.f3821b;
        if (e8 != null) {
            e8.f3828p = null;
        }
        b7.f3821b = e7;
        e7.f3828p = b7;
        setOnRequestDisallowInterceptTouchEvent$ui_release(e7);
        InterfaceC1398p interfaceC1398pD = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(interfaceC1398pA.f(b7), new M(qVar, k7, qVar, 4)), new C1362c(qVar, k7, 2));
        k7.d0(this.f15493v.f(interfaceC1398pD));
        this.f15494w = new A(k7, 16, interfaceC1398pD);
        k7.Z(this.f15495x);
        this.f15496y = new B0.b(25, k7);
        k7.a0 = new C1362c(qVar, k7, 0);
        k7.b0 = new C(qVar, 1);
        k7.c0(new C1363d(qVar, k7, 0));
        this.f15485M = k7;
    }

    public final u0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            N0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((C0415x) this.f15488q).getSnapshotObserver();
    }

    public static final int l(q qVar, int i7, int i8, int i9) {
        return (i9 >= 0 || i7 == i8) ? View.MeasureSpec.makeMeasureSpec(i6.h.q(i9, i7, i8), 1073741824) : (i9 != -2 || i8 == Integer.MAX_VALUE) ? (i9 != -1 || i8 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    public static C1993b m(C1993b c1993b, int i7, int i8, int i9, int i10) {
        int i11 = c1993b.f20271a - i7;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = c1993b.f20272b - i8;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = c1993b.f20273c - i9;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = c1993b.f20274d - i10;
        return C1993b.b(i11, i12, i13, i14 >= 0 ? i14 : 0);
    }

    @Override // G1.InterfaceC0145l
    public final void a(View view, View view2, int i7, int i8) {
        B2.m mVar = this.f15483K;
        if (i8 == 1) {
            mVar.f780b = i7;
        } else {
            mVar.f779a = i7;
        }
    }

    @Override // G1.InterfaceC0145l
    public final void b(View view, int i7) {
        B2.m mVar = this.f15483K;
        if (i7 == 1) {
            mVar.f780b = 0;
        } else {
            mVar.f779a = 0;
        }
    }

    @Override // G1.InterfaceC0146m
    public final void c(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (this.f15487p.isNestedScrollingEnabled()) {
            float f7 = -1;
            long jB = this.f15486o.b(i11 == 0 ? 1 : 2, (((long) Float.floatToRawIntBits(i7 * f7)) << 32) | (((long) Float.floatToRawIntBits(i8 * f7)) & 4294967295L), (((long) Float.floatToRawIntBits(i10 * f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(i9 * f7)) << 32));
            iArr[0] = R0.M.s(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = R0.M.s(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // G1.InterfaceC0145l
    public final void d(int i7, int i8, int[] iArr, int i9) {
        if (this.f15487p.isNestedScrollingEnabled()) {
            float f7 = -1;
            long jD = this.f15486o.d((((long) Float.floatToRawIntBits(i8 * f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(i7 * f7)) << 32), i9 == 0 ? 1 : 2);
            iArr[0] = R0.M.s(Float.intBitsToFloat((int) (jD >> 32)));
            iArr[1] = R0.M.s(Float.intBitsToFloat((int) (jD & 4294967295L)));
        }
    }

    @Override // f0.InterfaceC0895k
    public final void e() {
        View view = this.f15487p;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f15491t.a();
        }
    }

    @Override // G1.InterfaceC0145l
    public final void f(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10, int i11) {
        if (this.f15487p.isNestedScrollingEnabled()) {
            float f7 = -1;
            this.f15486o.b(i11 == 0 ? 1 : 2, (((long) Float.floatToRawIntBits(i7 * f7)) << 32) | (((long) Float.floatToRawIntBits(i8 * f7)) & 4294967295L), (((long) Float.floatToRawIntBits(i9 * f7)) << 32) | (((long) Float.floatToRawIntBits(i10 * f7)) & 4294967295L));
        }
    }

    @Override // f0.InterfaceC0895k
    public final void g() {
        this.f15492u.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f15480H;
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], getWidth() + i7, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final n1.d getDensity() {
        return this.f15495x;
    }

    public final View getInteropView() {
        return this.f15487p;
    }

    public final K getLayoutNode() {
        return this.f15485M;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f15487p.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC0597u getLifecycleOwner() {
        return this.f15497z;
    }

    public final InterfaceC1398p getModifier() {
        return this.f15493v;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        B2.m mVar = this.f15483K;
        return mVar.f780b | mVar.f779a;
    }

    public final InterfaceC1182c getOnDensityChanged$ui_release() {
        return this.f15496y;
    }

    public final InterfaceC1182c getOnModifierChanged$ui_release() {
        return this.f15494w;
    }

    public final InterfaceC1182c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f15479G;
    }

    public final InterfaceC1180a getRelease() {
        return this.f15492u;
    }

    public final InterfaceC1180a getReset() {
        return this.f15491t;
    }

    public final E3.f getSavedStateRegistryOwner() {
        return this.f15473A;
    }

    public final InterfaceC1180a getUpdate() {
        return this.f15489r;
    }

    public final View getView() {
        return this.f15487p;
    }

    @Override // f0.InterfaceC0895k
    public final void h() {
        this.f15491t.a();
        removeAllViewsInLayout();
    }

    @Override // G1.InterfaceC0145l
    public final boolean i(View view, View view2, int i7, int i8) {
        return ((i7 & 2) == 0 && (i7 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f15484L) {
            this.f15485M.D();
            return null;
        }
        this.f15487p.postOnAnimation(new B2.e(18, this.f15478F));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f15487p.isNestedScrollingEnabled();
    }

    @Override // G1.InterfaceC0147n
    public final m0 j(View view, m0 m0Var) {
        this.f15476D = new m0(m0Var);
        return n(m0Var);
    }

    public final m0 n(m0 m0Var) {
        j0 j0Var = m0Var.f2725a;
        C1993b c1993bG = j0Var.g(-1);
        C1993b c1993b = C1993b.f20270e;
        if (!c1993bG.equals(c1993b) || !j0Var.h(-9).equals(c1993b) || j0Var.f() != null) {
            C0365v c0365v = this.f15485M.f5821T.f6002c;
            if (c0365v.f6083f0.f15636B) {
                long jH = i6.h.H(c0365v.I(0L));
                int i7 = (int) (jH >> 32);
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = (int) (jH & 4294967295L);
                if (i8 < 0) {
                    i8 = 0;
                }
                long jG = w0.i(c0365v).G();
                int i9 = (int) (jG >> 32);
                int i10 = (int) (jG & 4294967295L);
                long j3 = c0365v.f5418q;
                long jH2 = i6.h.H(c0365v.I((((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L)));
                int i11 = i9 - ((int) (jH2 >> 32));
                if (i11 < 0) {
                    i11 = 0;
                }
                int i12 = i10 - ((int) (4294967295L & jH2));
                int i13 = i12 >= 0 ? i12 : 0;
                if (i7 != 0 || i8 != 0 || i11 != 0 || i13 != 0) {
                    return m0Var.f2725a.n(i7, i8, i11, i13);
                }
            }
        }
        return m0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15477E.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f15484L) {
            this.f15485M.D();
        } else {
            this.f15487p.postOnAnimation(new B2.e(18, this.f15478F));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f6075a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        this.f15487p.layout(0, 0, i9 - i7, i10 - i8);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        View view = this.f15487p;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i7, i8);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f15481I = i7;
        this.f15482J = i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (!this.f15487p.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1767D.t(this.f15486o.e(), null, new C1364e(z6, this, AbstractC1110d.m(f7 * (-1.0f), f8 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        if (!this.f15487p.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1767D.t(this.f15486o.e(), null, new C1365f(this, AbstractC1110d.m(f7 * (-1.0f), f8 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        InterfaceC1182c interfaceC1182c = this.f15479G;
        if (interfaceC1182c != null) {
            interfaceC1182c.b(Boolean.valueOf(z6));
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    public final void setDensity(n1.d dVar) {
        if (dVar != this.f15495x) {
            this.f15495x = dVar;
            InterfaceC1182c interfaceC1182c = this.f15496y;
            if (interfaceC1182c != null) {
                interfaceC1182c.b(dVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0597u interfaceC0597u) {
        if (interfaceC0597u != this.f15497z) {
            this.f15497z = interfaceC0597u;
            androidx.lifecycle.K.m(this, interfaceC0597u);
        }
    }

    public final void setModifier(InterfaceC1398p interfaceC1398p) {
        if (interfaceC1398p != this.f15493v) {
            this.f15493v = interfaceC1398p;
            InterfaceC1182c interfaceC1182c = this.f15494w;
            if (interfaceC1182c != null) {
                interfaceC1182c.b(interfaceC1398p);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC1182c interfaceC1182c) {
        this.f15496y = interfaceC1182c;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC1182c interfaceC1182c) {
        this.f15494w = interfaceC1182c;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC1182c interfaceC1182c) {
        this.f15479G = interfaceC1182c;
    }

    public final void setRelease(InterfaceC1180a interfaceC1180a) {
        this.f15492u = interfaceC1180a;
    }

    public final void setReset(InterfaceC1180a interfaceC1180a) {
        this.f15491t = interfaceC1180a;
    }

    public final void setSavedStateRegistryOwner(E3.f fVar) {
        if (fVar != this.f15473A) {
            this.f15473A = fVar;
            AbstractC1267a.K(this, fVar);
        }
    }

    public final void setUpdate(InterfaceC1180a interfaceC1180a) {
        this.f15489r = interfaceC1180a;
        this.f15490s = true;
        this.f15477E.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // Q0.t0
    public final boolean w() {
        return isAttachedToWindow();
    }
}
