package C1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Executor {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f967o;

    /* JADX INFO: renamed from: p */
    public final Object f968p;

    public /* synthetic */ o(int i7, Object obj) {
        this.f967o = i7;
        this.f968p = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f967o) {
            case 0:
                runnable.getClass();
                Handler handler = (Handler) this.f968p;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((Handler) ((A0.b) this.f968p).f51q).post(runnable);
                return;
        }
    }
}
