package O0;

import R0.C0415x;

/* JADX INFO: loaded from: classes.dex */
public final class T extends l0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f5368q;

    public /* synthetic */ T(int i7, Object obj) {
        this.f5367p = i7;
        this.f5368q = obj;
    }

    @Override // n1.d
    public final float b() {
        switch (this.f5367p) {
            case 0:
                return ((Q0.T) this.f5368q).b();
            default:
                return ((C0415x) this.f5368q).getDensity().b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l5.e, m5.l] */
    @Override // O0.l0
    public float c(C0324v c0324v) {
        float fIntBitsToFloat;
        int iL0;
        switch (this.f5367p) {
            case 0:
                ?? r02 = c0324v.f5452a;
                if (r02 != 0) {
                    return ((Number) r02.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                Q0.T t7 = (Q0.T) this.f5368q;
                if (t7.f5886y) {
                    return Float.NaN;
                }
                Q0.T t8 = t7;
                while (true) {
                    J2.r rVar = t8.f5879A;
                    float f7 = (rVar == null || (iL0 = Z4.l.l0((C0324v[]) rVar.f3726b, c0324v)) < 0) ? Float.NaN : ((float[]) rVar.f3727c)[iL0];
                    if (!Float.isNaN(f7)) {
                        t8.f0(t7.q0(), c0324v);
                        C cO0 = t8.o0();
                        C cO02 = t7.o0();
                        switch (c0324v.f5453b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (cO02.K(cO0, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (cO0.G() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (cO02.K(cO0, (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(((int) (cO0.G() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    Q0.T tS0 = t8.s0();
                    if (tS0 == null) {
                        t8.f0(t7.q0(), c0324v);
                        return Float.NaN;
                    }
                    t8 = tS0;
                }
                break;
            default:
                return super.c(c0324v);
        }
    }

    @Override // O0.l0
    public final C d() {
        switch (this.f5367p) {
            case 0:
                Q0.T t7 = (Q0.T) this.f5368q;
                C cO0 = t7.f5886y ? null : t7.o0();
                if (cO0 == null) {
                    t7.q0().f5822U.b();
                }
                return cO0;
            default:
                return ((C0415x) this.f5368q).getRoot().f5821T.f6003d;
        }
    }

    @Override // O0.l0
    public final n1.n e() {
        switch (this.f5367p) {
            case 0:
                return ((Q0.T) this.f5368q).getLayoutDirection();
            default:
                return ((C0415x) this.f5368q).getLayoutDirection();
        }
    }

    @Override // O0.l0
    public final int g() {
        switch (this.f5367p) {
            case 0:
                return ((Q0.T) this.f5368q).T();
            default:
                return ((C0415x) this.f5368q).getRoot().f5822U.f5869p.f5416o;
        }
    }

    @Override // n1.d
    public final float n() {
        switch (this.f5367p) {
            case 0:
                return ((Q0.T) this.f5368q).n();
            default:
                return ((C0415x) this.f5368q).getDensity().n();
        }
    }
}
