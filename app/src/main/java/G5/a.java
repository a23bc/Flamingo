package G5;

import java.util.concurrent.ThreadFactory;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f2764p;

    public /* synthetic */ a(String str, boolean z6) {
        this.f2763o = str;
        this.f2764p = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f2763o;
        AbstractC1209k.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f2764p);
        return thread;
    }
}
