package n1;

import j5.AbstractC1109c;
import m5.AbstractC1209k;
import o1.InterfaceC1257a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: o */
    public final float f14508o;

    /* JADX INFO: renamed from: p */
    public final float f14509p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1257a f14510q;

    public f(float f7, float f8, InterfaceC1257a interfaceC1257a) {
        this.f14508o = f7;
        this.f14509p = f8;
        this.f14510q = interfaceC1257a;
    }

    @Override // n1.d
    public final float E(long j3) {
        if (q.a(p.b(j3), 4294967296L)) {
            return this.f14510q.b(p.c(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
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
        return this.f14508o;
    }

    @Override // n1.d
    public final long e0(float f7) {
        return AbstractC1109c.w(4294967296L, this.f14510q.a(k0(f7)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f14508o, fVar.f14508o) == 0 && Float.compare(this.f14509p, fVar.f14509p) == 0 && AbstractC1209k.a(this.f14510q, fVar.f14510q);
    }

    public final int hashCode() {
        return this.f14510q.hashCode() + c.n(this.f14509p, Float.floatToIntBits(this.f14508o) * 31, 31);
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
        return this.f14509p;
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return c.i(j3, this);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f14508o + ", fontScale=" + this.f14509p + ", converter=" + this.f14510q + ')';
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
