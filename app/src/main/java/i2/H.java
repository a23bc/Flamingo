package i2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class H extends CancellationException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f13323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f13324p;

    public H(String str, int i7) {
        super(str);
        this.f13323o = str;
        this.f13324p = i7;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f13323o;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.f13323o);
        sb.append(", ");
        return Z1.l.r(sb, this.f13324p, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
