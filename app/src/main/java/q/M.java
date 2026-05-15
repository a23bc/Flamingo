package q;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import p.ViewTreeObserverOnGlobalLayoutListenerC1275d;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class M extends D0 implements O {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f15194Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public J f15195R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Rect f15196S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f15197T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final /* synthetic */ P f15198U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p7, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f15198U = p7;
        this.f15196S = new Rect();
        this.f15138C = p7;
        this.f15147L = true;
        this.f15148M.setFocusable(true);
        this.f15139D = new K(this);
    }

    @Override // q.O
    public final void f(CharSequence charSequence) {
        this.f15194Q = charSequence;
    }

    @Override // q.O
    public final void j(int i7) {
        this.f15197T = i7;
    }

    @Override // q.O
    public final void l(int i7, int i8) {
        ViewTreeObserver viewTreeObserver;
        C1350z c1350z = this.f15148M;
        boolean zIsShowing = c1350z.isShowing();
        r();
        this.f15148M.setInputMethodMode(2);
        c();
        C1334q0 c1334q0 = this.f15151q;
        c1334q0.setChoiceMode(1);
        c1334q0.setTextDirection(i7);
        c1334q0.setTextAlignment(i8);
        P p7 = this.f15198U;
        int selectedItemPosition = p7.getSelectedItemPosition();
        C1334q0 c1334q02 = this.f15151q;
        if (c1350z.isShowing() && c1334q02 != null) {
            c1334q02.setListSelectionHidden(false);
            c1334q02.setSelection(selectedItemPosition);
            if (c1334q02.getChoiceMode() != 0) {
                c1334q02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = p7.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1275d viewTreeObserverOnGlobalLayoutListenerC1275d = new ViewTreeObserverOnGlobalLayoutListenerC1275d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1275d);
        this.f15148M.setOnDismissListener(new L(this, viewTreeObserverOnGlobalLayoutListenerC1275d));
    }

    @Override // q.O
    public final CharSequence n() {
        return this.f15194Q;
    }

    @Override // q.D0, q.O
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f15195R = (J) listAdapter;
    }

    public final void r() {
        int i7;
        C1350z c1350z = this.f15148M;
        Drawable background = c1350z.getBackground();
        P p7 = this.f15198U;
        if (background != null) {
            background.getPadding(p7.f15215v);
            boolean z6 = j1.f15320a;
            int layoutDirection = p7.getLayoutDirection();
            Rect rect = p7.f15215v;
            i7 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = p7.f15215v;
            rect2.right = 0;
            rect2.left = 0;
            i7 = 0;
        }
        int paddingLeft = p7.getPaddingLeft();
        int paddingRight = p7.getPaddingRight();
        int width = p7.getWidth();
        int i8 = p7.f15214u;
        if (i8 == -2) {
            int iA = p7.a(this.f15195R, c1350z.getBackground());
            int i9 = p7.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = p7.f15215v;
            int i10 = (i9 - rect3.left) - rect3.right;
            if (iA > i10) {
                iA = i10;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i8 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i8);
        }
        boolean z7 = j1.f15320a;
        this.f15154t = p7.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f15153s) - this.f15197T) + i7 : paddingLeft + this.f15197T + i7;
    }
}
