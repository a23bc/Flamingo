package q;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p.SubMenuC1271D;

/* JADX INFO: loaded from: classes.dex */
public final class W0 implements p.x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p.l f15242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p.n f15243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Toolbar f15244q;

    public W0(Toolbar toolbar) {
        this.f15244q = toolbar;
    }

    @Override // p.x
    public final void d() {
        if (this.f15243p != null) {
            p.l lVar = this.f15242o;
            if (lVar != null) {
                int size = lVar.f14820f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f15242o.getItem(i7) == this.f15243p) {
                        return;
                    }
                }
            }
            k(this.f15243p);
        }
    }

    @Override // p.x
    public final boolean f(SubMenuC1271D subMenuC1271D) {
        return false;
    }

    @Override // p.x
    public final void g(Context context, p.l lVar) {
        p.n nVar;
        p.l lVar2 = this.f15242o;
        if (lVar2 != null && (nVar = this.f15243p) != null) {
            lVar2.d(nVar);
        }
        this.f15242o = lVar;
    }

    @Override // p.x
    public final boolean h(p.n nVar) {
        Toolbar toolbar = this.f15244q;
        toolbar.c();
        ViewParent parent = toolbar.f9093v.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f9093v);
            }
            toolbar.addView(toolbar.f9093v);
        }
        View actionView = nVar.getActionView();
        toolbar.f9094w = actionView;
        this.f15243p = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f9094w);
            }
            X0 x0H = Toolbar.h();
            x0H.f15245a = (toolbar.f9058B & 112) | 8388611;
            x0H.f15246b = 2;
            toolbar.f9094w.setLayoutParams(x0H);
            toolbar.addView(toolbar.f9094w);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((X0) childAt.getLayoutParams()).f15246b != 2 && childAt != toolbar.f9086o) {
                toolbar.removeViewAt(childCount);
                toolbar.f9075S.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f14842C = true;
        nVar.f14854n.p(false);
        KeyEvent.Callback callback = toolbar.f9094w;
        if (callback instanceof o.b) {
            ((p.p) ((o.b) callback)).f14870o.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final boolean k(p.n nVar) {
        Toolbar toolbar = this.f15244q;
        KeyEvent.Callback callback = toolbar.f9094w;
        if (callback instanceof o.b) {
            ((p.p) ((o.b) callback)).f14870o.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f9094w);
        toolbar.removeView(toolbar.f9093v);
        toolbar.f9094w = null;
        ArrayList arrayList = toolbar.f9075S;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15243p = null;
        toolbar.requestLayout();
        nVar.f14842C = false;
        nVar.f14854n.p(false);
        toolbar.t();
        return true;
    }

    @Override // p.x
    public final void b(p.l lVar, boolean z6) {
    }
}
