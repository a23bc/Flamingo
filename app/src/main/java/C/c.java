package C;

import java.util.concurrent.CancellationException;
import n0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends CancellationException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f930o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i7) {
        super(str);
        this.f930o = i7;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f930o) {
            case 0:
                setStackTrace(d.f931a);
                break;
            case 1:
                setStackTrace(N0.b.f4962a);
                break;
            default:
                setStackTrace(e.f14484b);
                break;
        }
        return this;
    }
}
