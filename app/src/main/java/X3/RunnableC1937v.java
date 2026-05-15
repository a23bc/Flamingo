package x3;

import android.os.IBinder;
import android.os.Messenger;

/* JADX INFO: renamed from: x3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1937v implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f20111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k.I f20112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k.I f20113q;

    public /* synthetic */ RunnableC1937v(k.I i7, k.I i8, int i9) {
        this.f20111o = i9;
        this.f20113q = i7;
        this.f20112p = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20111o) {
            case 0:
                C1931p c1931p = (C1931p) ((AbstractServiceC1940y) this.f20113q.f13847p).f20128s.remove(((Messenger) this.f20112p.f13847p).getBinder());
                if (c1931p != null) {
                    k.I i7 = c1931p.f20096e;
                    i7.getClass();
                    ((Messenger) i7.f13847p).getBinder().unlinkToDeath(c1931p, 0);
                }
                break;
            default:
                IBinder binder = ((Messenger) this.f20112p.f13847p).getBinder();
                C1931p c1931p2 = (C1931p) ((AbstractServiceC1940y) this.f20113q.f13847p).f20128s.remove(binder);
                if (c1931p2 != null) {
                    binder.unlinkToDeath(c1931p2, 0);
                }
                break;
        }
    }
}
