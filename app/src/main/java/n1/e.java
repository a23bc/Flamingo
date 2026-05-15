package n1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: o */
    public final float f14506o;

    /* JADX INFO: renamed from: p */
    public final float f14507p;

    public e(float f7, float f8) {
        this.f14506o = f7;
        this.f14507p = f8;
    }

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return c.h(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return c.f(f7, this);
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return c.k(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return c.j(j3, this);
    }

    @Override // n1.d
    public final float b() {
        return this.f14506o;
    }

    @Override // n1.d
    public final long e0(float f7) {
        return c.l(k0(f7), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f14506o, eVar.f14506o) == 0 && Float.compare(this.f14507p, eVar.f14507p) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14507p) + (Float.floatToIntBits(this.f14506o) * 31);
    }

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
    }

    @Override // n1.d
    public final float n() {
        return this.f14507p;
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return c.i(j3, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f14506o);
        sb.append(", fontScale=");
        return c.u(sb, this.f14507p, ')');
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
