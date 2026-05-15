package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import k.I;
import q.C1334q0;
import q.F0;
import q.I0;
import yos.music.player.R;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1277f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B */
    public View f14776B;

    /* JADX INFO: renamed from: C */
    public View f14777C;

    /* JADX INFO: renamed from: D */
    public int f14778D;

    /* JADX INFO: renamed from: E */
    public boolean f14779E;

    /* JADX INFO: renamed from: F */
    public boolean f14780F;

    /* JADX INFO: renamed from: G */
    public int f14781G;

    /* JADX INFO: renamed from: H */
    public int f14782H;

    /* JADX INFO: renamed from: J */
    public boolean f14784J;

    /* JADX INFO: renamed from: K */
    public w f14785K;

    /* JADX INFO: renamed from: L */
    public ViewTreeObserver f14786L;

    /* JADX INFO: renamed from: M */
    public u f14787M;

    /* JADX INFO: renamed from: N */
    public boolean f14788N;

    /* JADX INFO: renamed from: p */
    public final Context f14789p;

    /* JADX INFO: renamed from: q */
    public final int f14790q;

    /* JADX INFO: renamed from: r */
    public final int f14791r;

    /* JADX INFO: renamed from: s */
    public final boolean f14792s;

    /* JADX INFO: renamed from: t */
    public final Handler f14793t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f14794u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final ArrayList f14795v = new ArrayList();

    /* JADX INFO: renamed from: w */
    public final ViewTreeObserverOnGlobalLayoutListenerC1275d f14796w = new ViewTreeObserverOnGlobalLayoutListenerC1275d(0, this);

    /* JADX INFO: renamed from: x */
    public final R0.A f14797x = new R0.A(3, this);

    /* JADX INFO: renamed from: y */
    public final I f14798y = new I(4, this);

    /* JADX INFO: renamed from: z */
    public int f14799z = 0;

    /* JADX INFO: renamed from: A */
    public int f14775A = 0;

    /* JADX INFO: renamed from: I */
    public boolean f14783I = false;

    public ViewOnKeyListenerC1277f(Context context, View view, int i7, boolean z6) {
        this.f14789p = context;
        this.f14776B = view;
        this.f14791r = i7;
        this.f14792s = z6;
        this.f14778D = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f14790q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f14793t = new Handler();
    }

    @Override // p.InterfaceC1269B
    public final boolean a() {
        ArrayList arrayList = this.f14795v;
        return arrayList.size() > 0 && ((C1276e) arrayList.get(0)).f14772a.f15148M.isShowing();
    }

    @Override // p.x
    public final void b(l lVar, boolean z6) {
        ArrayList arrayList = this.f14795v;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (lVar == ((C1276e) arrayList.get(i7)).f14773b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i8 = i7 + 1;
        if (i8 < arrayList.size()) {
            ((C1276e) arrayList.get(i8)).f14773b.c(false);
        }
        C1276e c1276e = (C1276e) arrayList.remove(i7);
        c1276e.f14773b.r(this);
        boolean z7 = this.f14788N;
        I0 i02 = c1276e.f14772a;
        if (z7) {
            F0.b(i02.f15148M, null);
            i02.f15148M.setAnimationStyle(0);
        }
        i02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f14778D = ((C1276e) arrayList.get(size2 - 1)).f14774c;
        } else {
            this.f14778D = this.f14776B.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((C1276e) arrayList.get(0)).f14773b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f14785K;
        if (wVar != null) {
            wVar.b(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f14786L;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f14786L.removeGlobalOnLayoutListener(this.f14796w);
            }
            this.f14786L = null;
        }
        this.f14777C.removeOnAttachStateChangeListener(this.f14797x);
        this.f14787M.onDismiss();
    }

    @Override // p.InterfaceC1269B
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f14794u;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((l) it.next());
        }
        arrayList.clear();
        View view = this.f14776B;
        this.f14777C = view;
        if (view != null) {
            boolean z6 = this.f14786L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f14786L = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14796w);
            }
            this.f14777C.addOnAttachStateChangeListener(this.f14797x);
        }
    }

    @Override // p.x
    public final void d() {
        Iterator it = this.f14795v.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1276e) it.next()).f14772a.f15151q.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p.InterfaceC1269B
    public final void dismiss() {
        ArrayList arrayList = this.f14795v;
        int size = arrayList.size();
        if (size > 0) {
            C1276e[] c1276eArr = (C1276e[]) arrayList.toArray(new C1276e[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C1276e c1276e = c1276eArr[i7];
                if (c1276e.f14772a.f15148M.isShowing()) {
                    c1276e.f14772a.dismiss();
                }
            }
        }
    }

    @Override // p.InterfaceC1269B
    public final C1334q0 e() {
        ArrayList arrayList = this.f14795v;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1276e) arrayList.get(arrayList.size() - 1)).f14772a.f15151q;
    }

    @Override // p.x
    public final boolean f(SubMenuC1271D subMenuC1271D) {
        for (C1276e c1276e : this.f14795v) {
            if (subMenuC1271D == c1276e.f14773b) {
                c1276e.f14772a.f15151q.requestFocus();
                return true;
            }
        }
        if (!subMenuC1271D.hasVisibleItems()) {
            return false;
        }
        l(subMenuC1271D);
        w wVar = this.f14785K;
        if (wVar != null) {
            wVar.B(subMenuC1271D);
        }
        return true;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final void j(w wVar) {
        this.f14785K = wVar;
    }

    @Override // p.t
    public final void l(l lVar) {
        lVar.b(this, this.f14789p);
        if (a()) {
            v(lVar);
        } else {
            this.f14794u.add(lVar);
        }
    }

    @Override // p.t
    public final void n(View view) {
        if (this.f14776B != view) {
            this.f14776B = view;
            this.f14775A = Gravity.getAbsoluteGravity(this.f14799z, view.getLayoutDirection());
        }
    }

    @Override // p.t
    public final void o(boolean z6) {
        this.f14783I = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1276e c1276e;
        ArrayList arrayList = this.f14795v;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c1276e = null;
                break;
            }
            c1276e = (C1276e) arrayList.get(i7);
            if (!c1276e.f14772a.f15148M.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (c1276e != null) {
            c1276e.f14773b.c(false);
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
        if (this.f14799z != i7) {
            this.f14799z = i7;
            this.f14775A = Gravity.getAbsoluteGravity(i7, this.f14776B.getLayoutDirection());
        }
    }

    @Override // p.t
    public final void q(int i7) {
        this.f14779E = true;
        this.f14781G = i7;
    }

    @Override // p.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f14787M = (u) onDismissListener;
    }

    @Override // p.t
    public final void s(boolean z6) {
        this.f14784J = z6;
    }

    @Override // p.t
    public final void t(int i7) {
        this.f14780F = true;
        this.f14782H = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(p.l r20) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ViewOnKeyListenerC1277f.v(p.l):void");
    }
}
