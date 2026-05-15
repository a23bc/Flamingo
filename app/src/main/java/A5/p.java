package A5;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends CancellationException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f572o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, int i7) {
        super(str);
        this.f572o = i7;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f572o) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }
}
