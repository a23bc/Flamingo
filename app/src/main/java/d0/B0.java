package d0;

import f0.C0879c;
import f0.C0894j0;
import java.util.Arrays;
import m5.AbstractC1209k;
import r5.C1420a;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0894j0 f10817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0894j0 f10818b = C0879c.t(new float[0]);

    public B0(C1420a c1420a) {
        this.f10817a = C0879c.t(c1420a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b0 = (B0) obj;
        return AbstractC1209k.a((C1420a) this.f10817a.getValue(), (C1420a) b0.f10817a.getValue()) && Arrays.equals((float[]) this.f10818b.getValue(), (float[]) b0.f10818b.getValue());
    }

    public final int hashCode() {
        return Arrays.hashCode((float[]) this.f10818b.getValue()) + (((C1420a) this.f10817a.getValue()).hashCode() * 31);
    }
}
