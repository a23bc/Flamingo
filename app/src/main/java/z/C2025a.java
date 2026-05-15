package z;

/* JADX INFO: renamed from: z.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2025a implements InterfaceC2029c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20772b;

    public /* synthetic */ C2025a(int i7) {
        this.f20772b = i7;
    }

    @Override // z.InterfaceC2029c
    public final float a(float f7, float f8, float f9) {
        switch (this.f20772b) {
            case 0:
                InterfaceC2029c.f20786a.getClass();
                float f10 = f8 + f7;
                if ((f7 >= 0.0f && f10 <= f9) || (f7 < 0.0f && f10 > f9)) {
                    return 0.0f;
                }
                float f11 = f10 - f9;
                return Math.abs(f7) < Math.abs(f11) ? f7 : f11;
            default:
                float fAbs = Math.abs((f8 + f7) - f7);
                float f12 = (0.3f * f9) - (0.0f * fAbs);
                float f13 = f9 - f12;
                if ((fAbs <= f9) && f13 < fAbs) {
                    f12 = f9 - fAbs;
                }
                return f7 - f12;
        }
    }

    @Override // z.InterfaceC2029c
    public final w.S b() {
        switch (this.f20772b) {
            case 0:
                InterfaceC2029c.f20786a.getClass();
                break;
            default:
                InterfaceC2029c.f20786a.getClass();
                break;
        }
        return C2027b.f20781b;
    }
}
