package androidx.appcompat.widget;

import G1.N;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import k.LayoutInflaterFactory2C1111A;
import k.q;
import p.l;
import q.C1313g;
import q.C1321k;
import q.InterfaceC1316h0;
import q.InterfaceC1318i0;
import q.b1;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: o */
    public TypedValue f9046o;

    /* JADX INFO: renamed from: p */
    public TypedValue f9047p;

    /* JADX INFO: renamed from: q */
    public TypedValue f9048q;

    /* JADX INFO: renamed from: r */
    public TypedValue f9049r;

    /* JADX INFO: renamed from: s */
    public TypedValue f9050s;

    /* JADX INFO: renamed from: t */
    public TypedValue f9051t;

    /* JADX INFO: renamed from: u */
    public final Rect f9052u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1316h0 f9053v;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9052u = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f9050s == null) {
            this.f9050s = new TypedValue();
        }
        return this.f9050s;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f9051t == null) {
            this.f9051t = new TypedValue();
        }
        return this.f9051t;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f9048q == null) {
            this.f9048q = new TypedValue();
        }
        return this.f9048q;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f9049r == null) {
            this.f9049r = new TypedValue();
        }
        return this.f9049r;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f9046o == null) {
            this.f9046o = new TypedValue();
        }
        return this.f9046o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f9047p == null) {
            this.f9047p = new TypedValue();
        }
        return this.f9047p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1316h0 interfaceC1316h0 = this.f9053v;
        if (interfaceC1316h0 != null) {
            interfaceC1316h0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1321k c1321k;
        super.onDetachedFromWindow();
        InterfaceC1316h0 interfaceC1316h0 = this.f9053v;
        if (interfaceC1316h0 != null) {
            LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = ((q) interfaceC1316h0).f13938p;
            InterfaceC1318i0 interfaceC1318i0 = layoutInflaterFactory2C1111A.f13784F;
            if (interfaceC1318i0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1318i0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((b1) actionBarOverlayLayout.f9023s).f15264a.f9086o;
                if (actionMenuView != null && (c1321k = actionMenuView.f9035H) != null) {
                    c1321k.c();
                    C1313g c1313g = c1321k.f15330H;
                    if (c1313g != null && c1313g.b()) {
                        c1313g.f14886i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C1111A.f13789K != null) {
                layoutInflaterFactory2C1111A.f13826z.getDecorView().removeCallbacks(layoutInflaterFactory2C1111A.f13790L);
                if (layoutInflaterFactory2C1111A.f13789K.isShowing()) {
                    try {
                        layoutInflaterFactory2C1111A.f13789K.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1111A.f13789K = null;
            }
            N n7 = layoutInflaterFactory2C1111A.f13791M;
            if (n7 != null) {
                n7.b();
            }
            l lVar = layoutInflaterFactory2C1111A.y(0).h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0062  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC1316h0 interfaceC1316h0) {
        this.f9053v = interfaceC1316h0;
    }
}
