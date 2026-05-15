package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import q.C1334q0;
import q.I0;
import yos.music.player.R;

/* JADX INFO: renamed from: p.C */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1270C extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A */
    public View f14733A;

    /* JADX INFO: renamed from: B */
    public w f14734B;

    /* JADX INFO: renamed from: C */
    public ViewTreeObserver f14735C;

    /* JADX INFO: renamed from: D */
    public boolean f14736D;

    /* JADX INFO: renamed from: E */
    public boolean f14737E;

    /* JADX INFO: renamed from: F */
    public int f14738F;

    /* JADX INFO: renamed from: H */
    public boolean f14740H;

    /* JADX INFO: renamed from: p */
    public final Context f14741p;

    /* JADX INFO: renamed from: q */
    public final l f14742q;

    /* JADX INFO: renamed from: r */
    public final i f14743r;

    /* JADX INFO: renamed from: s */
    public final boolean f14744s;

    /* JADX INFO: renamed from: t */
    public final int f14745t;

    /* JADX INFO: renamed from: u */
    public final int f14746u;

    /* JADX INFO: renamed from: v */
    public final I0 f14747v;

    /* JADX INFO: renamed from: y */
    public u f14750y;

    /* JADX INFO: renamed from: z */
    public View f14751z;

    /* JADX INFO: renamed from: w */
    public final ViewTreeObserverOnGlobalLayoutListenerC1275d f14748w = new ViewTreeObserverOnGlobalLayoutListenerC1275d(1, this);

    /* JADX INFO: renamed from: x */
    public final R0.A f14749x = new R0.A(4, this);

    /* JADX INFO: renamed from: G */
    public int f14739G = 0;

    public ViewOnKeyListenerC1270C(int i7, Context context, View view, l lVar, boolean z6) {
        this.f14741p = context;
        this.f14742q = lVar;
        this.f14744s = z6;
        this.f14743r = new i(lVar, LayoutInflater.from(context), z6, R.layout.abc_popup_menu_item_layout);
        this.f14746u = i7;
        Resources resources = context.getResources();
        this.f14745t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f14751z = view;
        this.f14747v = new I0(context, null, i7);
        lVar.b(this, context);
    }

    @Override // p.InterfaceC1269B
    public final boolean a() {
        return !this.f14736D && this.f14747v.f15148M.isShowing();
    }

    @Override // p.x
    public final void b(l lVar, boolean z6) {
        if (lVar != this.f14742q) {
            return;
        }
        dismiss();
        w wVar = this.f14734B;
        if (wVar != null) {
            wVar.b(lVar, z6);
        }
    }

    @Override // p.InterfaceC1269B
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.f14736D || (view = this.f14751z) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f14733A = view;
        I0 i02 = this.f14747v;
        i02.f15148M.setOnDismissListener(this);
        i02.f15139D = this;
        i02.f15147L = true;
        i02.f15148M.setFocusable(true);
        View view2 = this.f14733A;
        boolean z6 = this.f14735C == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f14735C = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f14748w);
        }
        view2.addOnAttachStateChangeListener(this.f14749x);
        i02.f15138C = view2;
        i02.f15160z = this.f14739G;
        boolean z7 = this.f14737E;
        Context context = this.f14741p;
        i iVar = this.f14743r;
        if (!z7) {
            this.f14738F = t.m(iVar, context, this.f14745t);
            this.f14737E = true;
        }
        i02.q(this.f14738F);
        i02.f15148M.setInputMethodMode(2);
        Rect rect = this.f14877o;
        i02.f15146K = rect != null ? new Rect(rect) : null;
        i02.c();
        C1334q0 c1334q0 = i02.f15151q;
        c1334q0.setOnKeyListener(this);
        if (this.f14740H) {
            l lVar = this.f14742q;
            if (lVar.f14825m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1334q0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f14825m);
                }
                frameLayout.setEnabled(false);
                c1334q0.addHeaderView(frameLayout, null, false);
            }
        }
        i02.o(iVar);
        i02.c();
    }

    @Override // p.x
    public final void d() {
        this.f14737E = false;
        i iVar = this.f14743r;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // p.InterfaceC1269B
    public final void dismiss() {
        if (a()) {
            this.f14747v.dismiss();
        }
    }

    @Override // p.InterfaceC1269B
    public final C1334q0 e() {
        return this.f14747v.f15151q;
    }

    @Override // p.x
    public final boolean f(SubMenuC1271D subMenuC1271D) {
        if (subMenuC1271D.hasVisibleItems()) {
            View view = this.f14733A;
            v vVar = new v(this.f14746u, this.f14741p, view, subMenuC1271D, this.f14744s);
            w wVar = this.f14734B;
            vVar.h = wVar;
            t tVar = vVar.f14886i;
            if (tVar != null) {
                tVar.j(wVar);
            }
            boolean zU = t.u(subMenuC1271D);
            vVar.f14885g = zU;
            t tVar2 = vVar.f14886i;
            if (tVar2 != null) {
                tVar2.o(zU);
            }
            vVar.f14887j = this.f14750y;
            this.f14750y = null;
            this.f14742q.c(false);
            I0 i02 = this.f14747v;
            int width = i02.f15154t;
            int iM = i02.m();
            if ((Gravity.getAbsoluteGravity(this.f14739G, this.f14751z.getLayoutDirection()) & 7) == 5) {
                width += this.f14751z.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f14883e != null) {
                    vVar.d(width, iM, true, true);
                }
            }
            w wVar2 = this.f14734B;
            if (wVar2 != null) {
                wVar2.B(subMenuC1271D);
            }
            return true;
        }
        return false;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final void j(w wVar) {
        this.f14734B = wVar;
    }

    @Override // p.t
    public final void n(View view) {
        this.f14751z = view;
    }

    @Override // p.t
    public final void o(boolean z6) {
        this.f14743r.f14810c = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14736D = true;
        this.f14742q.c(true);
        ViewTreeObserver viewTreeObserver = this.f14735C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f14735C = this.f14733A.getViewTreeObserver();
            }
            this.f14735C.removeGlobalOnLayoutListener(this.f14748w);
            this.f14735C = null;
        }
        this.f14733A.removeOnAttachStateChangeListener(this.f14749x);
        u uVar = this.f14750y;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p.t
    public final void p(int i7) {
        this.f14739G = i7;
    }

    @Override // p.t
    public final void q(int i7) {
        this.f14747v.f15154t = i7;
    }

    @Override // p.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f14750y = (u) onDismissListener;
    }

    @Override // p.t
    public final void s(boolean z6) {
        this.f14740H = z6;
    }

    @Override // p.t
    public final void t(int i7) {
        this.f14747v.i(i7);
    }

    @Override // p.t
    public final void l(l lVar) {
    }
}
