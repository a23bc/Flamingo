package C1;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Thread {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f966o;

    public m(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f966o = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f966o);
        super.run();
    }
}
