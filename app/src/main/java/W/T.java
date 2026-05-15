package w;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC1679l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1652A f18558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18559b;

    public T(InterfaceC1652A interfaceC1652A, long j3) {
        this.f18558a = interfaceC1652A;
        this.f18559b = j3;
    }

    @Override // w.InterfaceC1679l
    public final q0 d(o0 o0Var) {
        return new U(this.f18558a.d(o0Var), this.f18559b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T)) {
            return false;
        }
        T t7 = (T) obj;
        return t7.f18559b == this.f18559b && AbstractC1209k.a(t7.f18558a, this.f18558a);
    }

    public final int hashCode() {
        int iHashCode = this.f18558a.hashCode() * 31;
        long j3 = this.f18559b;
        return iHashCode + ((int) (j3 ^ (j3 >>> 32)));
    }
}
