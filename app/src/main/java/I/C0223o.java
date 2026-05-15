package I;

import w.S;
import z.C2027b;
import z.InterfaceC2029c;

/* JADX INFO: renamed from: I.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0223o implements InterfaceC2029c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0211c f3375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2029c f3376c;

    public C0223o(C0211c c0211c, InterfaceC2029c interfaceC2029c) {
        this.f3375b = c0211c;
        this.f3376c = interfaceC2029c;
    }

    @Override // z.InterfaceC2029c
    public final float a(float f7, float f8, float f9) {
        float fA = this.f3376c.a(f7, f8, f9);
        boolean z6 = false;
        if (f7 <= 0.0f ? f7 + f8 <= 0.0f : f7 + f8 > f9) {
            z6 = true;
        }
        float fAbs = Math.abs(fA);
        C0211c c0211c = this.f3375b;
        if (fAbs == 0.0f || !z6) {
            if (Math.abs(c0211c.f3296f) < 1.0E-6d) {
                return 0.0f;
            }
            float fO = c0211c.f3296f * (-1.0f);
            if (((Boolean) c0211c.f3289F.getValue()).booleanValue()) {
                fO += c0211c.o();
            }
            return i6.h.p(fO, -f9, f9);
        }
        float fO2 = c0211c.f3296f * (-1);
        while (fA > 0.0f && fO2 < fA) {
            fO2 += c0211c.o();
        }
        while (fA < 0.0f && fO2 > fA) {
            fO2 -= c0211c.o();
        }
        return fO2;
    }

    @Override // z.InterfaceC2029c
    public final S b() {
        InterfaceC2029c.f20786a.getClass();
        return C2027b.f20781b;
    }
}
