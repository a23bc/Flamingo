package y2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class v extends k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f20379q;

    public v() {
        super(2008);
        this.f20379q = 1;
    }

    public static v a(int i7, IOException iOException) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !I0.c.V(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new u("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new v(i8, i7, iOException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(int i7, int i8, IOException iOException) {
        if (i7 == 2000 && i8 == 1) {
            i7 = 2001;
        }
        super(iOException, i7);
        this.f20379q = i8;
    }

    public v(String str, IOException iOException, int i7) {
        super(str, iOException, i7 == 2000 ? 2001 : i7);
        this.f20379q = 1;
    }
}
