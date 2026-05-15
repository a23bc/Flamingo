package K0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends CancellationException {
    public o(long j3) {
        super("Timed out waiting for " + j3 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(t.f3909c);
        return this;
    }
}
