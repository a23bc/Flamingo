package M5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static int a(int i7, int i8, int i9) throws IOException {
        if ((i8 & 8) != 0) {
            i7--;
        }
        if (i9 <= i7) {
            return i7 - i9;
        }
        throw new IOException(Z1.l.p("PROTOCOL_ERROR padding ", i9, i7, " > remaining length "));
    }
}
