package q;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements InterfaceC1320j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f15264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f15266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f15267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f15268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f15269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15270g;
    public CharSequence h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f15271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f15272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f15273k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1321k f15274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f15276o;

    public final void a(int i7) {
        View view;
        int i8 = this.f15265b ^ i7;
        this.f15265b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                int i9 = this.f15265b & 4;
                Toolbar toolbar = this.f15264a;
                if (i9 != 0) {
                    Drawable drawable = this.f15269f;
                    if (drawable == null) {
                        drawable = this.f15276o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i8 & 3) != 0) {
                c();
            }
            int i10 = i8 & 8;
            Toolbar toolbar2 = this.f15264a;
            if (i10 != 0) {
                if ((i7 & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.f15271i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f15266c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f15265b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f15272j);
            Toolbar toolbar = this.f15264a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f15275n);
            } else {
                toolbar.setNavigationContentDescription(this.f15272j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f15265b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f15268e) == null) {
            drawable = this.f15267d;
        }
        this.f15264a.setLogo(drawable);
    }
}
