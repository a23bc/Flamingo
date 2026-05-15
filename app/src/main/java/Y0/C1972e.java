package y0;

import R0.C0415x;
import android.content.Context;
import android.os.Build;
import yos.music.player.R;

/* JADX INFO: renamed from: y0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1972e implements y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f20232f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0415x f20233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20234b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0.b f20235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComponentCallbacks2C1971d f20237e;

    public C1972e(C0415x c0415x) {
        this.f20233a = c0415x;
        ComponentCallbacks2C1971d componentCallbacks2C1971d = new ComponentCallbacks2C1971d(this);
        this.f20237e = componentCallbacks2C1971d;
        if (c0415x.isAttachedToWindow()) {
            Context context = c0415x.getContext();
            if (!this.f20236d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C1971d);
                this.f20236d = true;
            }
        }
        c0415x.addOnAttachStateChangeListener(new R0.A(5, this));
    }

    @Override // y0.y
    public final void a(B0.d dVar) {
        synchronized (this.f20234b) {
            if (!dVar.f631s) {
                dVar.f631s = true;
                dVar.b();
            }
        }
    }

    @Override // y0.y
    public final B0.d b() {
        B0.f kVar;
        B0.d dVar;
        synchronized (this.f20234b) {
            try {
                C0415x c0415x = this.f20233a;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    c0415x.getUniqueDrawingId();
                }
                if (i7 >= 29) {
                    kVar = new B0.i();
                } else if (f20232f) {
                    try {
                        kVar = new B0.g(this.f20233a, new C1986s(), new A0.c());
                    } catch (Throwable unused) {
                        f20232f = false;
                        kVar = new B0.k(c(this.f20233a));
                    }
                } else {
                    kVar = new B0.k(c(this.f20233a));
                }
                dVar = new B0.d(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final C0.a c(C0415x c0415x) {
        C0.b bVar = this.f20235c;
        if (bVar != null) {
            return bVar;
        }
        C0.b bVar2 = new C0.b(c0415x.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        c0415x.addView(bVar2, -1);
        this.f20235c = bVar2;
        return bVar2;
    }
}
