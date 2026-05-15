package D2;

import android.media.MediaDrm;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return w2.t.p(w2.t.q(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
