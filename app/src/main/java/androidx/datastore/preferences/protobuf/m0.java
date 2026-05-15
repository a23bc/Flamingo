package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends n0 {
    @Override // androidx.datastore.preferences.protobuf.n0
    public final boolean c(long j3, Object obj) {
        return this.f9498a.getBoolean(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final byte d(long j3, Object obj) {
        return this.f9498a.getByte(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final double e(long j3, Object obj) {
        return this.f9498a.getDouble(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final float f(long j3, Object obj) {
        return this.f9498a.getFloat(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void k(Object obj, long j3, boolean z6) {
        this.f9498a.putBoolean(obj, j3, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void l(Object obj, long j3, byte b7) {
        this.f9498a.putByte(obj, j3, b7);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void m(Object obj, long j3, double d4) {
        this.f9498a.putDouble(obj, j3, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final void n(Object obj, long j3, float f7) {
        this.f9498a.putFloat(obj, j3, f7);
    }
}
