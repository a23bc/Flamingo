package x3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import c.C0706d;

/* JADX INFO: renamed from: x3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1938w implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f20114o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k.I f20115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0706d f20116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k.I f20117r;

    public RunnableC1938w(k.I i7, k.I i8, String str, C0706d c0706d) {
        this.f20117r = i7;
        this.f20115p = i8;
        this.f20116q = c0706d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20114o) {
            case 0:
                IBinder binder = ((Messenger) this.f20115p.f13847p).getBinder();
                k.I i7 = this.f20117r;
                C1931p c1931p = (C1931p) ((AbstractServiceC1940y) i7.f13847p).f20128s.get(binder);
                if (c1931p != null) {
                    AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) i7.f13847p;
                    abstractServiceC1940y.getClass();
                    C0706d c0706d = this.f20116q;
                    abstractServiceC1940y.f20129t = c1931p;
                    if ((2 & 2) != 0) {
                        c0706d.c(-1, null);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("media_item", null);
                        c0706d.c(0, bundle);
                    }
                    abstractServiceC1940y.f20129t = null;
                    break;
                }
                break;
            default:
                IBinder binder2 = ((Messenger) this.f20115p.f13847p).getBinder();
                k.I i8 = this.f20117r;
                C1931p c1931p2 = (C1931p) ((AbstractServiceC1940y) i8.f13847p).f20128s.get(binder2);
                if (c1931p2 != null) {
                    AbstractServiceC1940y abstractServiceC1940y2 = (AbstractServiceC1940y) i8.f13847p;
                    abstractServiceC1940y2.getClass();
                    C0706d c0706d2 = this.f20116q;
                    abstractServiceC1940y2.f20129t = c1931p2;
                    c0706d2.c(-1, null);
                    abstractServiceC1940y2.f20129t = null;
                    break;
                }
                break;
        }
    }

    public RunnableC1938w(k.I i7, k.I i8, String str, Bundle bundle, C0706d c0706d) {
        this.f20117r = i7;
        this.f20115p = i8;
        this.f20116q = c0706d;
    }
}
