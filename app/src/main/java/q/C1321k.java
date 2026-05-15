package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p.SubMenuC1271D;
import yos.music.player.R;

/* JADX INFO: renamed from: q.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1321k implements p.x {

    /* JADX INFO: renamed from: A */
    public boolean f15323A;

    /* JADX INFO: renamed from: B */
    public int f15324B;

    /* JADX INFO: renamed from: C */
    public int f15325C;

    /* JADX INFO: renamed from: D */
    public int f15326D;

    /* JADX INFO: renamed from: E */
    public boolean f15327E;

    /* JADX INFO: renamed from: G */
    public C1313g f15329G;

    /* JADX INFO: renamed from: H */
    public C1313g f15330H;

    /* JADX INFO: renamed from: I */
    public RunnableC1317i f15331I;

    /* JADX INFO: renamed from: J */
    public C1315h f15332J;

    /* JADX INFO: renamed from: o */
    public final Context f15334o;

    /* JADX INFO: renamed from: p */
    public Context f15335p;

    /* JADX INFO: renamed from: q */
    public p.l f15336q;

    /* JADX INFO: renamed from: r */
    public final LayoutInflater f15337r;

    /* JADX INFO: renamed from: s */
    public p.w f15338s;

    /* JADX INFO: renamed from: v */
    public p.z f15341v;

    /* JADX INFO: renamed from: w */
    public C1319j f15342w;

    /* JADX INFO: renamed from: x */
    public Drawable f15343x;

    /* JADX INFO: renamed from: y */
    public boolean f15344y;

    /* JADX INFO: renamed from: z */
    public boolean f15345z;

    /* JADX INFO: renamed from: t */
    public final int f15339t = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: u */
    public final int f15340u = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: F */
    public final SparseBooleanArray f15328F = new SparseBooleanArray();

    /* JADX INFO: renamed from: K */
    public final k.I f15333K = new k.I(7, this);

    public C1321k(Context context) {
        this.f15334o = context;
        this.f15337r = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(p.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            p.y yVar = view instanceof p.y ? (p.y) view : (p.y) this.f15337r.inflate(this.f15340u, viewGroup, false);
            yVar.b(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f15341v);
            if (this.f15332J == null) {
                this.f15332J = new C1315h(this);
            }
            actionMenuItemView.setPopupCallback(this.f15332J);
            actionView = (View) yVar;
        }
        actionView.setVisibility(nVar.f14842C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1325m)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // p.x
    public final void b(p.l lVar, boolean z6) {
        c();
        C1313g c1313g = this.f15330H;
        if (c1313g != null && c1313g.b()) {
            c1313g.f14886i.dismiss();
        }
        p.w wVar = this.f15338s;
        if (wVar != null) {
            wVar.b(lVar, z6);
        }
    }

    public final boolean c() {
        Object obj;
        RunnableC1317i runnableC1317i = this.f15331I;
        if (runnableC1317i != null && (obj = this.f15341v) != null) {
            ((View) obj).removeCallbacks(runnableC1317i);
            this.f15331I = null;
            return true;
        }
        C1313g c1313g = this.f15329G;
        if (c1313g == null) {
            return false;
        }
        if (c1313g.b()) {
            c1313g.f14886i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.x
    public final void d() {
        int i7;
        ViewGroup viewGroup = (ViewGroup) this.f15341v;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            p.l lVar = this.f15336q;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f15336q.l();
                int size = arrayListL.size();
                i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    p.n nVar = (p.n) arrayListL.get(i8);
                    if ((nVar.f14864x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i7);
                        p.n itemData = childAt instanceof p.y ? ((p.y) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f15341v).addView(viewA, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f15342w) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.f15341v).requestLayout();
        p.l lVar2 = this.f15336q;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f14822i;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                p.o oVar = ((p.n) arrayList2.get(i9)).f14840A;
            }
        }
        p.l lVar3 = this.f15336q;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f14823j;
        }
        if (this.f15345z && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((p.n) arrayList.get(0)).f14842C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f15342w == null) {
                this.f15342w = new C1319j(this, this.f15334o);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f15342w.getParent();
            if (viewGroup3 != this.f15341v) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f15342w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f15341v;
                C1319j c1319j = this.f15342w;
                actionMenuView.getClass();
                C1325m c1325mI = ActionMenuView.i();
                c1325mI.f15348a = true;
                actionMenuView.addView(c1319j, c1325mI);
            }
        } else {
            C1319j c1319j2 = this.f15342w;
            if (c1319j2 != null) {
                Object parent = c1319j2.getParent();
                Object obj = this.f15341v;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f15342w);
                }
            }
        }
        ((ActionMenuView) this.f15341v).setOverflowReserved(this.f15345z);
    }

    public final boolean e() {
        C1313g c1313g = this.f15329G;
        return c1313g != null && c1313g.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.x
    public final boolean f(SubMenuC1271D subMenuC1271D) {
        boolean z6;
        if (subMenuC1271D.hasVisibleItems()) {
            SubMenuC1271D subMenuC1271D2 = subMenuC1271D;
            while (true) {
                p.l lVar = subMenuC1271D2.f14753z;
                if (lVar == this.f15336q) {
                    break;
                }
                subMenuC1271D2 = (SubMenuC1271D) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f15341v;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i7);
                    if ((childAt instanceof p.y) && ((p.y) childAt).getItemData() == subMenuC1271D2.f14752A) {
                        view = childAt;
                        break;
                    }
                    i7++;
                }
            }
            if (view != null) {
                subMenuC1271D.f14752A.getClass();
                int size = subMenuC1271D.f14820f.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        z6 = false;
                        break;
                    }
                    MenuItem item = subMenuC1271D.getItem(i8);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i8++;
                }
                C1313g c1313g = new C1313g(this, this.f15335p, subMenuC1271D, view);
                this.f15330H = c1313g;
                c1313g.f14885g = z6;
                p.t tVar = c1313g.f14886i;
                if (tVar != null) {
                    tVar.o(z6);
                }
                C1313g c1313g2 = this.f15330H;
                if (!c1313g2.b()) {
                    if (c1313g2.f14883e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1313g2.d(0, 0, false, false);
                }
                p.w wVar = this.f15338s;
                if (wVar != null) {
                    wVar.B(subMenuC1271D);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p.x
    public final void g(Context context, p.l lVar) {
        this.f15335p = context;
        LayoutInflater.from(context);
        this.f15336q = lVar;
        Resources resources = context.getResources();
        if (!this.f15323A) {
            this.f15345z = true;
        }
        int i7 = 2;
        this.f15324B = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
            i7 = 5;
        } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
            i7 = 4;
        } else if (i8 >= 360) {
            i7 = 3;
        }
        this.f15326D = i7;
        int measuredWidth = this.f15324B;
        if (this.f15345z) {
            if (this.f15342w == null) {
                C1319j c1319j = new C1319j(this, this.f15334o);
                this.f15342w = c1319j;
                if (this.f15344y) {
                    c1319j.setImageDrawable(this.f15343x);
                    this.f15343x = null;
                    this.f15344y = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f15342w.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f15342w.getMeasuredWidth();
        } else {
            this.f15342w = null;
        }
        this.f15325C = measuredWidth;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override // p.x
    public final boolean h(p.n nVar) {
        return false;
    }

    @Override // p.x
    public final boolean i() {
        int size;
        ArrayList arrayListL;
        int i7;
        boolean z6;
        C1321k c1321k = this;
        p.l lVar = c1321k.f15336q;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i8 = c1321k.f15326D;
        int i9 = c1321k.f15325C;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1321k.f15341v;
        int i10 = 0;
        boolean z7 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i7 = 2;
            z6 = true;
            if (i10 >= size) {
                break;
            }
            p.n nVar = (p.n) arrayListL.get(i10);
            int i13 = nVar.f14865y;
            if ((i13 & 2) == 2) {
                i11++;
            } else if ((i13 & 1) == 1) {
                i12++;
            } else {
                z7 = true;
            }
            if (c1321k.f15327E && nVar.f14842C) {
                i8 = 0;
            }
            i10++;
        }
        if (c1321k.f15345z && (z7 || i12 + i11 > i8)) {
            i8--;
        }
        int i14 = i8 - i11;
        SparseBooleanArray sparseBooleanArray = c1321k.f15328F;
        sparseBooleanArray.clear();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            p.n nVar2 = (p.n) arrayListL.get(i15);
            int i17 = nVar2.f14865y;
            boolean z8 = (i17 & 2) == i7 ? z6 : false;
            int i18 = nVar2.f14844b;
            if (z8) {
                View viewA = c1321k.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                if (i18 != 0) {
                    sparseBooleanArray.put(i18, z6);
                }
                nVar2.f(z6);
            } else if ((i17 & 1) == z6) {
                boolean z9 = sparseBooleanArray.get(i18);
                boolean z10 = ((i14 > 0 || z9) && i9 > 0) ? z6 : false;
                if (z10) {
                    View viewA2 = c1321k.a(nVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z10 &= i9 + i16 > 0;
                }
                if (z10 && i18 != 0) {
                    sparseBooleanArray.put(i18, true);
                } else if (z9) {
                    sparseBooleanArray.put(i18, false);
                    for (int i19 = 0; i19 < i15; i19++) {
                        p.n nVar3 = (p.n) arrayListL.get(i19);
                        if (nVar3.f14844b == i18) {
                            if ((nVar3.f14864x & 32) == 32) {
                                i14++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z10) {
                    i14--;
                }
                nVar2.f(z10);
            } else {
                nVar2.f(false);
                i15++;
                i7 = 2;
                c1321k = this;
                z6 = true;
            }
            i15++;
            i7 = 2;
            c1321k = this;
            z6 = true;
        }
        return z6;
    }

    @Override // p.x
    public final void j(p.w wVar) {
        throw null;
    }

    @Override // p.x
    public final boolean k(p.n nVar) {
        return false;
    }

    public final boolean l() {
        p.l lVar;
        if (!this.f15345z || e() || (lVar = this.f15336q) == null || this.f15341v == null || this.f15331I != null) {
            return false;
        }
        lVar.i();
        if (lVar.f14823j.isEmpty()) {
            return false;
        }
        RunnableC1317i runnableC1317i = new RunnableC1317i(this, new C1313g(this, this.f15335p, this.f15336q, this.f15342w));
        this.f15331I = runnableC1317i;
        ((View) this.f15341v).post(runnableC1317i);
        return true;
    }
}
