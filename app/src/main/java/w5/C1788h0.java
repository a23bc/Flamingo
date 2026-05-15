package w5;

import java.util.concurrent.CancellationException;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: w5.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1788h0 extends CancellationException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient p0 f19537o;

    public C1788h0(String str, Throwable th, p0 p0Var) {
        super(str);
        this.f19537o = p0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1788h0)) {
            return false;
        }
        C1788h0 c1788h0 = (C1788h0) obj;
        return AbstractC1209k.a(c1788h0.getMessage(), getMessage()) && AbstractC1209k.a(c1788h0.f19537o, this.f19537o) && AbstractC1209k.a(c1788h0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC1209k.c(message);
        int iHashCode = (this.f19537o.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f19537o;
    }
}
