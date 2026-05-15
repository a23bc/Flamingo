package g1;

import android.view.Choreographer;
import java.util.concurrent.Executor;
import w3.A0;
import w3.C1762z;

/* JADX INFO: renamed from: g1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0984z implements Executor {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f12407p;

    public /* synthetic */ ExecutorC0984z(int i7, Object obj) {
        this.f12406o = i7;
        this.f12407p = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        switch (this.f12406o) {
            case 0:
                ((Choreographer) this.f12407p).postFrameCallback(new Choreographer.FrameCallback() { // from class: g1.A
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j3) {
                        runnable.run();
                    }
                });
                break;
            case 1:
                w2.t.G(((C1762z) this.f12407p).f19427v, runnable);
                break;
            default:
                w2.t.G(((A0) this.f12407p).l, runnable);
                break;
        }
    }
}
