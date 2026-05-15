package A3;

import java.util.concurrent.Executor;
import r.C1380a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f492o;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f492o) {
            case 0:
                runnable.run();
                break;
            case 1:
                break;
            default:
                C1380a.L().f15600a.f15603b.execute(runnable);
                break;
        }
    }
}
