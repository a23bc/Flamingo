package y0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: renamed from: y0.d */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1971d implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1972e f20231o;

    public ComponentCallbacks2C1971d(C1972e c1972e) {
        this.f20231o = c1972e;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 >= 40) {
            this.f20231o.getClass();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
