package I;

import H2.C0196m;
import f0.C0886f0;
import java.util.concurrent.CancellationException;
import z.EnumC2048l0;

/* JADX INFO: renamed from: I.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0209a implements J0.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0211c f3325o;

    public C0209a(C0211c c0211c) {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        this.f3325o = c0211c;
    }

    @Override // J0.a
    public final long I(int i7, long j3, long j7) {
        if (i7 != 2) {
            return 0L;
        }
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        if (Float.intBitsToFloat((int) (j7 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // J0.a
    public final long m(long j3, int i7) {
        if (i7 != 1) {
            return 0L;
        }
        C0211c c0211c = this.f3325o;
        if (Math.abs(((C0886f0) c0211c.f3294d.f3207e).h()) <= 1.0E-6d) {
            return 0L;
        }
        C0196m c0196m = c0211c.f3294d;
        float fH = ((C0886f0) c0196m.f3207e).h() * c0211c.n();
        float f7 = ((c0211c.l().f3409b + c0211c.l().f3410c) * (-Math.signum(((C0886f0) c0196m.f3207e).h()))) + fH;
        if (((C0886f0) c0196m.f3207e).h() > 0.0f) {
            f7 = fH;
            fH = f7;
        }
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        float f8 = -c0211c.f3300k.e(-i6.h.p(Float.intBitsToFloat((int) (j3 >> 32)), fH, f7));
        EnumC2048l0 enumC2048l02 = EnumC2048l0.f20894o;
        return (((long) Float.floatToRawIntBits(f8)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)))));
    }

    @Override // J0.a
    public final Object m0(long j3, c5.d dVar) {
        return new n1.r(0L);
    }

    @Override // J0.a
    public final Object x(long j3, long j7, c5.d dVar) {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        EnumC2048l0 enumC2048l02 = EnumC2048l0.f20894o;
        return new n1.r(n1.r.a(j7, 0.0f, 0.0f, 1));
    }
}
