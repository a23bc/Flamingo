package A5;

import java.util.concurrent.CancellationException;
import z5.InterfaceC2111f;

/* JADX INFO: renamed from: A5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025a extends CancellationException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient InterfaceC2111f f532o;

    public C0025a(InterfaceC2111f interfaceC2111f) {
        super("Flow was aborted, no more elements needed");
        this.f532o = interfaceC2111f;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
