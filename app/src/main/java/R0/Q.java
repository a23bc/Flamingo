package R0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W0.d f6369o;

    public Q(W0.d dVar) {
        this.f6369o = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        W0.d dVar = this.f6369o;
        synchronized (dVar) {
            dVar.f7728a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        W0.d dVar = this.f6369o;
        synchronized (dVar) {
            dVar.f7728a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        W0.d dVar = this.f6369o;
        synchronized (dVar) {
            dVar.f7728a.c();
        }
    }
}
