package p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f14880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f14883e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14885g;
    public w h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f14886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u f14887j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14884f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f14888k = new u(this);

    public v(int i7, Context context, View view, l lVar, boolean z6) {
        this.f14879a = context;
        this.f14880b = lVar;
        this.f14883e = view;
        this.f14881c = z6;
        this.f14882d = i7;
    }

    public final t a() {
        t viewOnKeyListenerC1270C;
        if (this.f14886i == null) {
            Context context = this.f14879a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1270C = new ViewOnKeyListenerC1277f(context, this.f14883e, this.f14882d, this.f14881c);
            } else {
                View view = this.f14883e;
                Context context2 = this.f14879a;
                boolean z6 = this.f14881c;
                viewOnKeyListenerC1270C = new ViewOnKeyListenerC1270C(this.f14882d, context2, view, this.f14880b, z6);
            }
            viewOnKeyListenerC1270C.l(this.f14880b);
            viewOnKeyListenerC1270C.r(this.f14888k);
            viewOnKeyListenerC1270C.n(this.f14883e);
            viewOnKeyListenerC1270C.j(this.h);
            viewOnKeyListenerC1270C.o(this.f14885g);
            viewOnKeyListenerC1270C.p(this.f14884f);
            this.f14886i = viewOnKeyListenerC1270C;
        }
        return this.f14886i;
    }

    public final boolean b() {
        t tVar = this.f14886i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.f14886i = null;
        u uVar = this.f14887j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final void d(int i7, int i8, boolean z6, boolean z7) {
        t tVarA = a();
        tVarA.s(z7);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f14884f, this.f14883e.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f14883e.getWidth();
            }
            tVarA.q(i7);
            tVarA.t(i8);
            int i9 = (int) ((this.f14879a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f14877o = new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9);
        }
        tVarA.c();
    }
}
