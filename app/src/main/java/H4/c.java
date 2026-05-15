package H4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3254a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < 10; i7++) {
            bArr[i7 + 48] = (byte) i7;
        }
        for (int i8 = 0; i8 < 26; i8++) {
            byte b7 = (byte) (i8 + 10);
            bArr[i8 + 65] = b7;
            bArr[i8 + 97] = b7;
        }
        f3254a = bArr;
    }
}
