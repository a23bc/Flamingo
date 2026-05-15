package X;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y0.w f8018c = new Y0.w("SelectionHandleInfo");

    static {
        float f7 = 25;
        f8016a = f7;
        f8017b = f7;
    }

    public static final long a(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
