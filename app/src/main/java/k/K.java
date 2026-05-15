package k;

import G1.AbstractC0158z;
import G1.L;
import G1.N;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import j.AbstractC1089a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.InterfaceC1307d;
import q.InterfaceC1320j0;
import q.b1;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC1113a implements InterfaceC1307d {

    /* JADX INFO: renamed from: b */
    public Context f13855b;

    /* JADX INFO: renamed from: c */
    public Context f13856c;

    /* JADX INFO: renamed from: d */
    public ActionBarOverlayLayout f13857d;

    /* JADX INFO: renamed from: e */
    public ActionBarContainer f13858e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1320j0 f13859f;

    /* JADX INFO: renamed from: g */
    public ActionBarContextView f13860g;
    public final View h;

    /* JADX INFO: renamed from: i */
    public boolean f13861i;

    /* JADX INFO: renamed from: j */
    public J f13862j;

    /* JADX INFO: renamed from: k */
    public J f13863k;
    public V1.a l;

    /* JADX INFO: renamed from: m */
    public boolean f13864m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f13865n;

    /* JADX INFO: renamed from: o */
    public int f13866o;

    /* JADX INFO: renamed from: p */
    public boolean f13867p;

    /* JADX INFO: renamed from: q */
    public boolean f13868q;

    /* JADX INFO: renamed from: r */
    public boolean f13869r;

    /* JADX INFO: renamed from: s */
    public boolean f13870s;

    /* JADX INFO: renamed from: t */
    public o.j f13871t;

    /* JADX INFO: renamed from: u */
    public boolean f13872u;

    /* JADX INFO: renamed from: v */
    public boolean f13873v;

    /* JADX INFO: renamed from: w */
    public final H f13874w;

    /* JADX INFO: renamed from: x */
    public final H f13875x;

    /* JADX INFO: renamed from: y */
    public final I f13876y;

    /* JADX INFO: renamed from: z */
    public static final AccelerateInterpolator f13854z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public static final DecelerateInterpolator f13853A = new DecelerateInterpolator();

    public K(Activity activity, boolean z6) {
        new ArrayList();
        this.f13865n = new ArrayList();
        this.f13866o = 0;
        this.f13867p = true;
        this.f13870s = true;
        this.f13874w = new H(this, 0);
        this.f13875x = new H(this, 1);
        this.f13876y = new I(0, this);
        View decorView = activity.getWindow().getDecorView();
        R(decorView);
        if (z6) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    public final void P(boolean z6) {
        N nI;
        N nI2;
        if (z6) {
            if (!this.f13869r) {
                this.f13869r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13857d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                U(false);
            }
        } else if (this.f13869r) {
            this.f13869r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13857d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            U(false);
        }
        if (!this.f13858e.isLaidOut()) {
            if (z6) {
                ((b1) this.f13859f).f15264a.setVisibility(4);
                this.f13860g.setVisibility(0);
                return;
            } else {
                ((b1) this.f13859f).f15264a.setVisibility(0);
                this.f13860g.setVisibility(8);
                return;
            }
        }
        if (z6) {
            b1 b1Var = (b1) this.f13859f;
            nI = G1.I.a(b1Var.f15264a);
            nI.a(0.0f);
            nI.c(100L);
            nI.d(new o.i(b1Var, 4));
            nI2 = this.f13860g.i(200L, 0);
        } else {
            b1 b1Var2 = (b1) this.f13859f;
            N nA = G1.I.a(b1Var2.f15264a);
            nA.a(1.0f);
            nA.c(200L);
            nA.d(new o.i(b1Var2, 0));
            nI = this.f13860g.i(100L, 8);
            nI2 = nA;
        }
        o.j jVar = new o.j();
        ArrayList arrayList = jVar.f14617a;
        arrayList.add(nI);
        View view = (View) nI.f2652a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) nI2.f2652a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(nI2);
        jVar.b();
    }

    public final Context Q() {
        if (this.f13856c == null) {
            TypedValue typedValue = new TypedValue();
            this.f13855b.getTheme().resolveAttribute(yos.music.player.R.attr.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f13856c = new ContextThemeWrapper(this.f13855b, i7);
            } else {
                this.f13856c = this.f13855b;
            }
        }
        return this.f13856c;
    }

    public final void R(View view) {
        InterfaceC1320j0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(yos.music.player.R.id.decor_content_parent);
        this.f13857d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(yos.music.player.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1320j0) {
            wrapper = (InterfaceC1320j0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f13859f = wrapper;
        this.f13860g = (ActionBarContextView) view.findViewById(yos.music.player.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(yos.music.player.R.id.action_bar_container);
        this.f13858e = actionBarContainer;
        InterfaceC1320j0 interfaceC1320j0 = this.f13859f;
        if (interfaceC1320j0 == null || this.f13860g == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((b1) interfaceC1320j0).f15264a.getContext();
        this.f13855b = context;
        if ((((b1) this.f13859f).f15265b & 4) != 0) {
            this.f13861i = true;
        }
        int i7 = context.getApplicationInfo().targetSdkVersion;
        this.f13859f.getClass();
        T(context.getResources().getBoolean(yos.music.player.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f13855b.obtainStyledAttributes(null, AbstractC1089a.f13594a, yos.music.player.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13857d;
            if (!actionBarOverlayLayout2.f9025u) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f13873v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f13858e;
            WeakHashMap weakHashMap = G1.I.f2641a;
            G1.B.g(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void S(boolean z6) {
        if (this.f13861i) {
            return;
        }
        int i7 = z6 ? 4 : 0;
        b1 b1Var = (b1) this.f13859f;
        int i8 = b1Var.f15265b;
        this.f13861i = true;
        b1Var.a((i7 & 4) | (i8 & (-5)));
    }

    public final void T(boolean z6) {
        if (z6) {
            this.f13858e.setTabContainer(null);
            ((b1) this.f13859f).getClass();
        } else {
            ((b1) this.f13859f).getClass();
            this.f13858e.setTabContainer(null);
        }
        this.f13859f.getClass();
        ((b1) this.f13859f).f15264a.setCollapsible(false);
        this.f13857d.setHasNonEmbeddedTabs(false);
    }

    public final void U(boolean z6) {
        boolean z7 = this.f13869r || !this.f13868q;
        View view = this.h;
        I i7 = this.f13876y;
        if (!z7) {
            if (this.f13870s) {
                this.f13870s = false;
                o.j jVar = this.f13871t;
                if (jVar != null) {
                    jVar.a();
                }
                int i8 = this.f13866o;
                H h = this.f13874w;
                if (i8 != 0 || (!this.f13872u && !z6)) {
                    h.a();
                    return;
                }
                this.f13858e.setAlpha(1.0f);
                this.f13858e.setTransitioning(true);
                o.j jVar2 = new o.j();
                float f7 = -this.f13858e.getHeight();
                if (z6) {
                    this.f13858e.getLocationInWindow(new int[]{0, 0});
                    f7 -= r12[1];
                }
                N nA = G1.I.a(this.f13858e);
                nA.e(f7);
                View view2 = (View) nA.f2652a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(i7 != null ? new L(i7, view2) : null);
                }
                boolean z8 = jVar2.f14621e;
                ArrayList arrayList = jVar2.f14617a;
                if (!z8) {
                    arrayList.add(nA);
                }
                if (this.f13867p && view != null) {
                    N nA2 = G1.I.a(view);
                    nA2.e(f7);
                    if (!jVar2.f14621e) {
                        arrayList.add(nA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f13854z;
                boolean z9 = jVar2.f14621e;
                if (!z9) {
                    jVar2.f14619c = accelerateInterpolator;
                }
                if (!z9) {
                    jVar2.f14618b = 250L;
                }
                if (!z9) {
                    jVar2.f14620d = h;
                }
                this.f13871t = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f13870s) {
            return;
        }
        this.f13870s = true;
        o.j jVar3 = this.f13871t;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f13858e.setVisibility(0);
        int i9 = this.f13866o;
        H h7 = this.f13875x;
        if (i9 == 0 && (this.f13872u || z6)) {
            this.f13858e.setTranslationY(0.0f);
            float f8 = -this.f13858e.getHeight();
            if (z6) {
                this.f13858e.getLocationInWindow(new int[]{0, 0});
                f8 -= r12[1];
            }
            this.f13858e.setTranslationY(f8);
            o.j jVar4 = new o.j();
            N nA3 = G1.I.a(this.f13858e);
            nA3.e(0.0f);
            View view3 = (View) nA3.f2652a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(i7 != null ? new L(i7, view3) : null);
            }
            boolean z10 = jVar4.f14621e;
            ArrayList arrayList2 = jVar4.f14617a;
            if (!z10) {
                arrayList2.add(nA3);
            }
            if (this.f13867p && view != null) {
                view.setTranslationY(f8);
                N nA4 = G1.I.a(view);
                nA4.e(0.0f);
                if (!jVar4.f14621e) {
                    arrayList2.add(nA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f13853A;
            boolean z11 = jVar4.f14621e;
            if (!z11) {
                jVar4.f14619c = decelerateInterpolator;
            }
            if (!z11) {
                jVar4.f14618b = 250L;
            }
            if (!z11) {
                jVar4.f14620d = h7;
            }
            this.f13871t = jVar4;
            jVar4.b();
        } else {
            this.f13858e.setAlpha(1.0f);
            this.f13858e.setTranslationY(0.0f);
            if (this.f13867p && view != null) {
                view.setTranslationY(0.0f);
            }
            h7.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13857d;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = G1.I.f2641a;
            AbstractC0158z.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f13865n = new ArrayList();
        this.f13866o = 0;
        this.f13867p = true;
        this.f13870s = true;
        this.f13874w = new H(this, 0);
        this.f13875x = new H(this, 1);
        this.f13876y = new I(0, this);
        R(dialog.getWindow().getDecorView());
    }
}
