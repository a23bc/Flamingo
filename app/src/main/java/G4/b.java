package G4;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2760a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d4) {
        if (Math.getExponent(d4) <= 1023) {
            if (d4 != 0.0d) {
                if (!(Math.getExponent(d4) <= 1023)) {
                    throw new IllegalArgumentException("not a normal value");
                }
                int exponent = Math.getExponent(d4);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(d4) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d4)) {
                }
            }
            return true;
        }
        return false;
    }
}
