package O0;

/* JADX INFO: renamed from: O0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306f0 implements D0, InterfaceC0319p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0306f0 f5390p = new C0306f0(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5391o;

    public /* synthetic */ C0306f0(int i7) {
        this.f5391o = i7;
    }

    @Override // O0.InterfaceC0319p
    public long a(long j3, long j7) {
        switch (this.f5391o) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i7 = t0.f5445a;
                return jFloatToRawIntBits;
            case 2:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i8 = t0.f5445a;
                return jFloatToRawIntBits2;
            case 3:
                float fD = w0.d(j3, j7);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                int i9 = t0.f5445a;
                return jFloatToRawIntBits3;
            default:
                if (Float.intBitsToFloat((int) (j3 >> 32)) <= Float.intBitsToFloat((int) (j7 >> 32)) && Float.intBitsToFloat((int) (j3 & 4294967295L)) <= Float.intBitsToFloat((int) (j7 & 4294967295L))) {
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i10 = t0.f5445a;
                    return jFloatToRawIntBits4;
                }
                float fD2 = w0.d(j3, j7);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L);
                int i11 = t0.f5445a;
                return jFloatToRawIntBits5;
        }
    }

    @Override // O0.D0
    public void c(C0 c02) {
        c02.clear();
    }

    @Override // O0.D0
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f5391o) {
            case 5:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
