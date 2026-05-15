package androidx.lifecycle;

import R0.C0408t0;
import a.AbstractC0509a;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class L implements E3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V.o f9704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f9706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y4.m f9707d;

    public L(V.o oVar, Y y6) {
        AbstractC1209k.f(oVar, "savedStateRegistry");
        this.f9704a = oVar;
        this.f9707d = AbstractC0509a.O(new E3.e(18, y6));
    }

    @Override // E3.d
    public final Bundle a() {
        Bundle bundleF = android.support.v4.media.session.b.f((Y4.h[]) Arrays.copyOf(new Y4.h[0], 0));
        Bundle bundle = this.f9706c;
        if (bundle != null) {
            bundleF.putAll(bundle);
        }
        for (Map.Entry entry : ((M) this.f9707d.getValue()).f9708b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((C0408t0) ((I) entry.getValue()).f9696b.f2445t).a();
            if (!bundleA.isEmpty()) {
                AbstractC1209k.f(str, "key");
                bundleF.putBundle(str, bundleA);
            }
        }
        this.f9705b = false;
        return bundleF;
    }

    public final void b() {
        if (this.f9705b) {
            return;
        }
        Bundle bundleF = this.f9704a.f("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleF2 = android.support.v4.media.session.b.f((Y4.h[]) Arrays.copyOf(new Y4.h[0], 0));
        Bundle bundle = this.f9706c;
        if (bundle != null) {
            bundleF2.putAll(bundle);
        }
        if (bundleF != null) {
            bundleF2.putAll(bundleF);
        }
        this.f9706c = bundleF2;
        this.f9705b = true;
    }
}
