package androidx.glance.appwidget.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class W extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f9600b = i7;
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final boolean c(long j3, Object obj) {
        switch (this.f9600b) {
            case 0:
                if (!Z.f9608g) {
                }
                break;
            default:
                if (!Z.f9608g) {
                }
                break;
        }
        return Z.c(j3, obj);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final double d(long j3, Object obj) {
        switch (this.f9600b) {
        }
        return Double.longBitsToDouble(g(j3, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final float e(long j3, Object obj) {
        switch (this.f9600b) {
        }
        return Float.intBitsToFloat(f(j3, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void j(Object obj, long j3, boolean z6) {
        switch (this.f9600b) {
            case 0:
                if (!Z.f9608g) {
                    Z.l(obj, j3, z6 ? (byte) 1 : (byte) 0);
                } else {
                    Z.k(obj, j3, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!Z.f9608g) {
                    Z.l(obj, j3, z6 ? (byte) 1 : (byte) 0);
                } else {
                    Z.k(obj, j3, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void k(Object obj, long j3, byte b7) {
        switch (this.f9600b) {
            case 0:
                if (!Z.f9608g) {
                    Z.l(obj, j3, b7);
                } else {
                    Z.k(obj, j3, b7);
                }
                break;
            default:
                if (!Z.f9608g) {
                    Z.l(obj, j3, b7);
                } else {
                    Z.k(obj, j3, b7);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void l(Object obj, long j3, double d4) {
        switch (this.f9600b) {
            case 0:
                o(obj, j3, Double.doubleToLongBits(d4));
                break;
            default:
                o(obj, j3, Double.doubleToLongBits(d4));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void m(Object obj, long j3, float f7) {
        switch (this.f9600b) {
            case 0:
                n(Float.floatToIntBits(f7), j3, obj);
                break;
            default:
                n(Float.floatToIntBits(f7), j3, obj);
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final boolean r() {
        switch (this.f9600b) {
        }
        return false;
    }
}
