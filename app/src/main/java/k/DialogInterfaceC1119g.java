package k;

import G1.InterfaceC0142i;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import d.AbstractDialogC0760m;
import java.util.WeakHashMap;
import o5.AbstractC1267a;
import yos.music.player.R;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC1119g extends AbstractDialogC0760m implements DialogInterface, InterfaceC1122j {

    /* JADX INFO: renamed from: r */
    public LayoutInflaterFactory2C1111A f13912r;

    /* JADX INFO: renamed from: s */
    public final C1112B f13913s;

    /* JADX INFO: renamed from: t */
    public final C1118f f13914t;

    /* JADX WARN: Type inference failed for: r2v2, types: [k.B] */
    public DialogInterfaceC1119g(ContextThemeWrapper contextThemeWrapper, int i7) {
        int i8;
        int i9 = i(contextThemeWrapper, i7);
        if (i9 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i8 = typedValue.resourceId;
        } else {
            i8 = i9;
        }
        super(contextThemeWrapper, i8);
        this.f13913s = new InterfaceC0142i() { // from class: k.B
            @Override // G1.InterfaceC0142i
            public final boolean c(KeyEvent keyEvent) {
                return this.f13827o.k(keyEvent);
            }
        };
        o oVarE = e();
        if (i9 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i9 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C1111A) oVarE).f13810i0 = i9;
        oVarE.b();
        this.f13914t = new C1118f(getContext(), this, getWindow());
    }

    public static int i(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // d.AbstractDialogC0760m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) e();
        layoutInflaterFactory2C1111A.t();
        ((ViewGroup) layoutInflaterFactory2C1111A.f13794P.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1111A.f13779A.a(layoutInflaterFactory2C1111A.f13826z.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().c();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return N5.l.v(this.f13913s, getWindow().getDecorView(), this, keyEvent);
    }

    public final o e() {
        if (this.f13912r == null) {
            m mVar = o.f13926o;
            this.f13912r = new LayoutInflaterFactory2C1111A(getContext(), getWindow(), this, this);
        }
        return this.f13912r;
    }

    public final void f() {
        androidx.lifecycle.K.m(getWindow().getDecorView(), this);
        AbstractC1267a.K(getWindow().getDecorView(), this);
        N5.l.O(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i7) {
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) e();
        layoutInflaterFactory2C1111A.t();
        return layoutInflaterFactory2C1111A.f13826z.findViewById(i7);
    }

    public final void g(Bundle bundle) {
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) e();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C1111A.f13825y);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C1111A);
        } else {
            boolean z6 = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1111A;
        }
        super.onCreate(bundle);
        e().b();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) e();
        if (layoutInflaterFactory2C1111A.f13781C != null) {
            layoutInflaterFactory2C1111A.z();
            layoutInflaterFactory2C1111A.f13781C.getClass();
            layoutInflaterFactory2C1111A.A(0);
        }
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().i(charSequence);
    }

    public final boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d.AbstractDialogC0760m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i7;
        ListAdapter listAdapter;
        View viewFindViewById;
        g(bundle);
        C1118f c1118f = this.f13914t;
        c1118f.f13892b.setContentView(c1118f.f13905q);
        Window window = c1118f.f13893c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = C1118f.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = C1118f.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = C1118f.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1118f.f13898i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1118f.f13898i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        c1118f.f13901m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c1118f.f13898i.removeView(c1118f.f13901m);
            if (c1118f.f13895e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c1118f.f13898i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c1118f.f13898i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c1118f.f13895e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        c1118f.f13896f = button;
        ViewOnClickListenerC1114b viewOnClickListenerC1114b = c1118f.f13911w;
        button.setOnClickListener(viewOnClickListenerC1114b);
        if (TextUtils.isEmpty(null)) {
            c1118f.f13896f.setVisibility(8);
            i7 = 0;
        } else {
            c1118f.f13896f.setText((CharSequence) null);
            c1118f.f13896f.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        c1118f.f13897g = button2;
        button2.setOnClickListener(viewOnClickListenerC1114b);
        if (TextUtils.isEmpty(null)) {
            c1118f.f13897g.setVisibility(8);
        } else {
            c1118f.f13897g.setText((CharSequence) null);
            c1118f.f13897g.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        c1118f.h = button3;
        button3.setOnClickListener(viewOnClickListenerC1114b);
        if (TextUtils.isEmpty(null)) {
            c1118f.h.setVisibility(8);
        } else {
            c1118f.h.setText((CharSequence) null);
            c1118f.h.setVisibility(0);
            i7 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c1118f.f13891a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i7 == 1) {
                Button button4 = c1118f.f13896f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i7 == 2) {
                Button button5 = c1118f.f13897g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i7 == 4) {
                Button button6 = c1118f.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i7 == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (c1118f.f13902n != null) {
            viewGroupA.addView(c1118f.f13902n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1118f.f13900k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1118f.f13894d) || !c1118f.f13909u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1118f.f13900k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1118f.l = textView2;
                textView2.setText(c1118f.f13894d);
                Drawable drawable = c1118f.f13899j;
                if (drawable != null) {
                    c1118f.f13900k.setImageDrawable(drawable);
                } else {
                    c1118f.l.setPadding(c1118f.f13900k.getPaddingLeft(), c1118f.f13900k.getPaddingTop(), c1118f.f13900k.getPaddingRight(), c1118f.f13900k.getPaddingBottom());
                    c1118f.f13900k.setVisibility(8);
                }
            }
        }
        boolean z6 = viewGroup.getVisibility() != 8;
        int i8 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z7 = viewGroupA3.getVisibility() != 8;
        if (!z7 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i8 != 0) {
            NestedScrollView nestedScrollView2 = c1118f.f13898i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c1118f.f13895e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1118f.f13895e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z7 || i8 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i8 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f8939o, alertController$RecycleListView.getPaddingRight(), z7 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f8940p);
            }
        }
        if (!z6) {
            View view = c1118f.f13895e;
            if (view == null) {
                view = c1118f.f13898i;
            }
            if (view != null) {
                int i9 = (z7 ? 2 : 0) | i8;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = G1.I.f2641a;
                G1.C.b(view, i9, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1118f.f13895e;
        if (alertController$RecycleListView2 == null || (listAdapter = c1118f.f13903o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i10 = c1118f.f13904p;
        if (i10 > -1) {
            alertController$RecycleListView2.setItemChecked(i10, true);
            alertController$RecycleListView2.setSelection(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13914t.f13898i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13914t.f13898i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i7, keyEvent);
        }
        return true;
    }

    @Override // d.AbstractDialogC0760m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) e();
        layoutInflaterFactory2C1111A.z();
        K k7 = layoutInflaterFactory2C1111A.f13781C;
        if (k7 != null) {
            k7.f13872u = false;
            o.j jVar = k7.f13871t;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // d.AbstractDialogC0760m, android.app.Dialog
    public final void setContentView(int i7) {
        f();
        e().f(i7);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i7) {
        super.setTitle(i7);
        e().i(getContext().getString(i7));
    }

    @Override // d.AbstractDialogC0760m, android.app.Dialog
    public final void setContentView(View view) {
        f();
        e().g(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        C1118f c1118f = this.f13914t;
        c1118f.f13894d = charSequence;
        TextView textView = c1118f.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // d.AbstractDialogC0760m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        e().h(view, layoutParams);
    }
}
