package s4;

import Y4.o;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import d.C0746L;
import e4.C0862k;
import j5.AbstractC1109c;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.C1232c;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: o */
    public final Context f15933o;

    /* JADX INFO: renamed from: p */
    public final WeakReference f15934p;

    /* JADX INFO: renamed from: q */
    public final o4.e f15935q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f15936r;

    /* JADX INFO: renamed from: s */
    public final AtomicBoolean f15937s;

    public j(C0862k c0862k, Context context, boolean z6) {
        o4.e c0746l;
        this.f15933o = context;
        this.f15934p = new WeakReference(c0862k);
        if (z6) {
            c0862k.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
            if (connectivityManager == null || AbstractC1109c.n(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                c0746l = new C0746L(15);
            } else {
                try {
                    c0746l = new A0.b(connectivityManager, this);
                } catch (Exception unused) {
                    c0746l = new C0746L(15);
                }
            }
        } else {
            c0746l = new C0746L(15);
        }
        this.f15935q = c0746l;
        this.f15936r = c0746l.v();
        this.f15937s = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.f15937s.getAndSet(true)) {
            return;
        }
        this.f15933o.unregisterComponentCallbacks(this);
        this.f15935q.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((C0862k) this.f15934p.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        o oVar;
        C0862k c0862k = (C0862k) this.f15934p.get();
        if (c0862k != null) {
            C1232c c1232c = (C1232c) c0862k.f11595b.getValue();
            if (c1232c != null) {
                c1232c.f14543a.q(i7);
                C1.k kVar = c1232c.f14544b;
                synchronized (kVar) {
                    if (i7 >= 10 && i7 != 20) {
                        kVar.a();
                    }
                }
            }
            oVar = o.f8736a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            a();
        }
    }
}
