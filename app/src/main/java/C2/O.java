package C2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Handler f1008p;

    public /* synthetic */ O(Handler handler, int i7) {
        this.f1007o = i7;
        this.f1008p = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1007o) {
            case 0:
                this.f1008p.post(runnable);
                break;
            default:
                w2.t.G(this.f1008p, runnable);
                break;
        }
    }
}
