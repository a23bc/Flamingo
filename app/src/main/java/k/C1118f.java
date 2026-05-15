package k;

import D2.HandlerC0087c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import j.AbstractC1089a;
import java.lang.ref.WeakReference;
import yos.music.player.R;

/* JADX INFO: renamed from: k.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1118f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC1119g f13892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f13893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f13894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f13895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f13896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f13897g;
    public Button h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f13898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f13899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f13900k;
    public TextView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f13901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f13902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListAdapter f13903o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f13909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HandlerC0087c f13910v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13904p = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewOnClickListenerC1114b f13911w = new ViewOnClickListenerC1114b(0, this);

    public C1118f(Context context, DialogInterfaceC1119g dialogInterfaceC1119g, Window window) {
        this.f13891a = context;
        this.f13892b = dialogInterfaceC1119g;
        this.f13893c = window;
        HandlerC0087c handlerC0087c = new HandlerC0087c(3);
        handlerC0087c.f1470b = new WeakReference(dialogInterfaceC1119g);
        this.f13910v = handlerC0087c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1089a.f13598e, R.attr.alertDialogStyle, 0);
        this.f13905q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f13906r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f13907s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f13908t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f13909u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC1119g.e().e(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
