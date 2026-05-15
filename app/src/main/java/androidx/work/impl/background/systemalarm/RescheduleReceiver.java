package androidx.work.impl.background.systemalarm;

import N3.p;
import O3.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        p.i("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p pVarD = p.d();
        String.format("Received intent %s", intent);
        pVarD.b(new Throwable[0]);
        try {
            l lVarL0 = l.l0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (l.f5639n) {
                try {
                    lVarL0.f5647k = pendingResultGoAsync;
                    if (lVarL0.f5646j) {
                        pendingResultGoAsync.finish();
                        lVarL0.f5647k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e7) {
            p.d().c(e7);
        }
    }
}
