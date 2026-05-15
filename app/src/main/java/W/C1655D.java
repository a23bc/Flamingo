package w;

/* JADX INFO: renamed from: w.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1655D implements InterfaceC1653B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f18507b;

    public C1655D(float f7, float f8, float f9) {
        this.f18506a = f9;
        Q q7 = new Q();
        q7.f18548a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        q7.f18549b = dSqrt;
        q7.f18554g = 1.0f;
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        q7.f18554g = f7;
        q7.f18550c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        q7.f18549b = Math.sqrt(f8);
        q7.f18550c = false;
        this.f18507b = q7;
    }

    @Override // w.InterfaceC1653B
    public final float a(long j3, float f7, float f8, float f9) {
        Q q7 = this.f18507b;
        q7.f18548a = f8;
        return Float.intBitsToFloat((int) (q7.a(f7, f9, j3 / 1000000) >> 32));
    }

    @Override // w.InterfaceC1653B
    public final float b(long j3, float f7, float f8, float f9) {
        Q q7 = this.f18507b;
        q7.f18548a = f8;
        return Float.intBitsToFloat((int) (q7.a(f7, f9, j3 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    @Override // w.InterfaceC1653B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(float r37, float r38, float r39) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1655D.c(float, float, float):long");
    }

    @Override // w.InterfaceC1679l
    public final q0 d(o0 o0Var) {
        return new U3.h(this);
    }

    @Override // w.InterfaceC1653B
    public final float e(float f7, float f8, float f9) {
        return 0.0f;
    }
}
