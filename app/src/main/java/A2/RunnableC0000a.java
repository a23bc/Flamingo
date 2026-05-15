package A2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: renamed from: A2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0000a extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final K f218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0001b f220q;

    public RunnableC0000a(C0001b c0001b, Handler handler, K k7) {
        this.f220q = c0001b;
        this.f219p = handler;
        this.f218o = k7;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f219p.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f220q.f222p) {
            this.f218o.f83a.u1(-1, 3, false);
        }
    }
}
