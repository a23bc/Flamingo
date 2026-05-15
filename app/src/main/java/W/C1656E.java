package w;

/* JADX INFO: renamed from: w.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1656E implements InterfaceC1653B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1690x f18510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18512e;

    public C1656E(int i7, int i8, InterfaceC1690x interfaceC1690x) {
        this.f18508a = i7;
        this.f18509b = i8;
        this.f18510c = interfaceC1690x;
        this.f18511d = ((long) i7) * 1000000;
        this.f18512e = ((long) i8) * 1000000;
    }

    @Override // w.InterfaceC1653B
    public final float a(long j3, float f7, float f8, float f9) {
        float fR = this.f18508a == 0 ? 1.0f : i6.h.r(j3 - this.f18512e, 0L, this.f18511d) / this.f18511d;
        if (fR < 0.0f) {
            fR = 0.0f;
        }
        float fK = this.f18510c.k(fR <= 1.0f ? fR : 1.0f);
        o0 o0Var = p0.f18727a;
        return (f8 * fK) + ((1 - fK) * f7);
    }

    @Override // w.InterfaceC1653B
    public final float b(long j3, float f7, float f8, float f9) {
        long jR = i6.h.r(j3 - this.f18512e, 0L, this.f18511d);
        if (jR < 0) {
            return 0.0f;
        }
        if (jR == 0) {
            return f9;
        }
        return (a(jR, f7, f8, f9) - a(jR - 1000000, f7, f8, f9)) * 1000.0f;
    }

    @Override // w.InterfaceC1653B
    public final long c(float f7, float f8, float f9) {
        return ((long) (this.f18509b + this.f18508a)) * 1000000;
    }

    @Override // w.InterfaceC1679l
    public final q0 d(o0 o0Var) {
        return new U3.h(this);
    }

    @Override // w.InterfaceC1653B
    public final float e(float f7, float f8, float f9) {
        return b(c(f7, f8, f9), f7, f8, f9);
    }
}
