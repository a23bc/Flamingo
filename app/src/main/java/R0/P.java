package R0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class P implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Configuration f6367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W0.c f6368p;

    public P(Configuration configuration, W0.c cVar) {
        this.f6367o = configuration;
        this.f6368p = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f6367o;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f6368p.f7727a.entrySet().iterator();
        while (it.hasNext()) {
            W0.a aVar = (W0.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f7724b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6368p.f7727a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        this.f6368p.f7727a.clear();
    }
}
