package E3;

import V.o;
import Y4.h;
import Z4.n;
import android.os.Bundle;
import com.blankj.utilcode.util.UtilsTransActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1852a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f1853b;

    public a(o oVar) {
        AbstractC1209k.f(oVar, "registry");
        this.f1853b = new LinkedHashSet();
        oVar.G("androidx.savedstate.Restarter", this);
    }

    @Override // E3.d
    public final Bundle a() {
        switch (this.f1852a) {
            case 0:
                Bundle bundleF = android.support.v4.media.session.b.f((h[]) Arrays.copyOf(new h[0], 0));
                List listK0 = n.K0((LinkedHashSet) this.f1853b);
                bundleF.putStringArrayList("classes_to_restore", listK0 instanceof ArrayList ? (ArrayList) listK0 : new ArrayList<>(listK0));
                return bundleF;
            default:
                Bundle bundle = new Bundle();
                ((UtilsTransActivity) this.f1853b).l().getClass();
                return bundle;
        }
    }

    public a(UtilsTransActivity utilsTransActivity) {
        this.f1853b = utilsTransActivity;
    }
}
