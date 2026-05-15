package q;

import android.view.View;
import android.view.ViewConfiguration;
import p.InterfaceC1269B;

/* JADX INFO: renamed from: q.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1339t0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f15394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f15397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RunnableC1337s0 f15398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RunnableC1337s0 f15399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f15402w = new int[2];

    public AbstractViewOnTouchListenerC1339t0(View view) {
        this.f15397r = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f15394o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f15395p = tapTimeout;
        this.f15396q = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1337s0 runnableC1337s0 = this.f15399t;
        View view = this.f15397r;
        if (runnableC1337s0 != null) {
            view.removeCallbacks(runnableC1337s0);
        }
        RunnableC1337s0 runnableC1337s02 = this.f15398s;
        if (runnableC1337s02 != null) {
            view.removeCallbacks(runnableC1337s02);
        }
    }

    public abstract InterfaceC1269B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC1269B interfaceC1269BB = b();
        if (interfaceC1269BB == null || !interfaceC1269BB.a()) {
            return true;
        }
        interfaceC1269BB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractViewOnTouchListenerC1339t0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15400u = false;
        this.f15401v = -1;
        RunnableC1337s0 runnableC1337s0 = this.f15398s;
        if (runnableC1337s0 != null) {
            this.f15397r.removeCallbacks(runnableC1337s0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
