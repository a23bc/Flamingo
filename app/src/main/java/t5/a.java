package T5;

import S5.C0427g;
import java.io.EOFException;
import m5.AbstractC1209k;
import u5.AbstractC1539a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6985a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1539a.f17313a);
        AbstractC1209k.e(bytes, "this as java.lang.String).getBytes(charset)");
        f6985a = bytes;
    }

    public static final String a(long j3, C0427g c0427g) throws EOFException {
        AbstractC1209k.f(c0427g, "<this>");
        if (j3 > 0) {
            long j7 = j3 - 1;
            if (c0427g.g(j7) == 13) {
                String strU = c0427g.u(j7, AbstractC1539a.f17313a);
                c0427g.w(2L);
                return strU;
            }
        }
        String strU2 = c0427g.u(j3, AbstractC1539a.f17313a);
        c0427g.w(1L);
        return strU2;
    }
}
