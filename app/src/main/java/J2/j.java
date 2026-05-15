package J2;

import E4.Z;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o f3687a;

    public j(o oVar) {
        this.f3687a = oVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
        o oVar = this.f3687a;
        Z z7 = o.f3716j;
        oVar.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
        o oVar = this.f3687a;
        Z z7 = o.f3716j;
        oVar.f();
    }
}
