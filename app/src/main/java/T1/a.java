package T1;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f6848p;

    public /* synthetic */ a(String str, int i7) {
        this.f6847o = i7;
        this.f6848p = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f6847o) {
            case 0:
                Thread thread = new Thread(runnable, this.f6848p);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f6848p);
        }
    }
}
