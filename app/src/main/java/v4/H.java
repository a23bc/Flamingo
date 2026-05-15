package V4;

import f0.C0879c;
import f0.C0894j0;
import java.util.Arrays;
import m5.AbstractC1209k;
import r5.C1420a;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0894j0 f7467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0894j0 f7468b;

    public H(C1420a c1420a, float[] fArr) {
        AbstractC1209k.f(fArr, "initialTickFractions");
        this.f7467a = C0879c.t(c1420a);
        this.f7468b = C0879c.t(fArr);
    }

    public final C1420a a() {
        return (C1420a) this.f7467a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        return AbstractC1209k.a(a(), h.a()) && Arrays.equals((float[]) this.f7468b.getValue(), (float[]) h.f7468b.getValue());
    }

    public final int hashCode() {
        return Arrays.hashCode((float[]) this.f7468b.getValue()) + (a().hashCode() * 31);
    }
}
