package M4;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4792a;

    static {
        int i7;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i7 = Integer.parseInt(strArrSplit[0]);
            if (i7 == 1 && strArrSplit.length > 1) {
                i7 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i7 = -1;
        }
        if (i7 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < property.length(); i8++) {
                    char cCharAt = property.charAt(i8);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i7 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i7 = -1;
            }
        }
        if (i7 == -1) {
            i7 = 6;
        }
        f4792a = i7;
    }
}
