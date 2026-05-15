package b2;

import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10065b;

    public I0(int i7, int i8) {
        this.f10064a = i7;
        this.f10065b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return this.f10064a == i02.f10064a && this.f10065b == i02.f10065b;
    }

    public final int hashCode() {
        return AbstractC1676i.b(this.f10065b) + (AbstractC1676i.b(this.f10064a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + Z1.l.y(this.f10064a) + ", height=" + Z1.l.y(this.f10065b) + ')';
    }
}
