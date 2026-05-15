package v;

import m5.AbstractC1209k;
import w.InterfaceC1652A;
import y0.C1967Q;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1652A f18017c;

    public W(float f7, long j3, InterfaceC1652A interfaceC1652A) {
        this.f18015a = f7;
        this.f18016b = j3;
        this.f18017c = interfaceC1652A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w7 = (W) obj;
        return Float.compare(this.f18015a, w7.f18015a) == 0 && C1967Q.a(this.f18016b, w7.f18016b) && AbstractC1209k.a(this.f18017c, w7.f18017c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f18015a) * 31;
        int i7 = C1967Q.f20225c;
        long j3 = this.f18016b;
        return this.f18017c.hashCode() + ((((int) (j3 ^ (j3 >>> 32))) + iFloatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f18015a + ", transformOrigin=" + ((Object) C1967Q.d(this.f18016b)) + ", animationSpec=" + this.f18017c + ')';
    }
}
