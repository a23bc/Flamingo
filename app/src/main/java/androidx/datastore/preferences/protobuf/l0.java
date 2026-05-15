package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9495b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f9495b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final boolean c(long j3, Object obj) {
        switch (this.f9495b) {
            case 0:
                if (o0.h) {
                    if (o0.g(j3, obj) == 0) {
                    }
                } else if (o0.h(j3, obj) == 0) {
                }
                break;
            default:
                if (o0.h) {
                    if (o0.g(j3, obj) == 0) {
                    }
                } else if (o0.h(j3, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final byte d(long j3, Object obj) {
        switch (this.f9495b) {
            case 0:
                if (!o0.h) {
                }
                break;
            default:
                if (!o0.h) {
                }
                break;
        }
        return o0.h(j3, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final double e(long j3, Object obj) {
        switch (this.f9495b) {
        }
        return Double.longBitsToDouble(h(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final float f(long j3, Object obj) {
        switch (this.f9495b) {
        }
        return Float.intBitsToFloat(g(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void k(Object obj, long j3, boolean z6) {
        switch (this.f9495b) {
            case 0:
                if (!o0.h) {
                    o0.l(obj, j3, z6 ? (byte) 1 : (byte) 0);
                } else {
                    o0.k(obj, j3, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!o0.h) {
                    o0.l(obj, j3, z6 ? (byte) 1 : (byte) 0);
                } else {
                    o0.k(obj, j3, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void l(Object obj, long j3, byte b7) {
        switch (this.f9495b) {
            case 0:
                if (!o0.h) {
                    o0.l(obj, j3, b7);
                } else {
                    o0.k(obj, j3, b7);
                }
                break;
            default:
                if (!o0.h) {
                    o0.l(obj, j3, b7);
                } else {
                    o0.k(obj, j3, b7);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void m(Object obj, long j3, double d4) {
        switch (this.f9495b) {
            case 0:
                p(obj, j3, Double.doubleToLongBits(d4));
                break;
            default:
                p(obj, j3, Double.doubleToLongBits(d4));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void n(Object obj, long j3, float f7) {
        switch (this.f9495b) {
            case 0:
                o(Float.floatToIntBits(f7), j3, obj);
                break;
            default:
                o(Float.floatToIntBits(f7), j3, obj);
                break;
        }
    }
}
