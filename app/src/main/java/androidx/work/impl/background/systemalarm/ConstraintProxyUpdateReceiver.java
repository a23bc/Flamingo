package androidx.work.impl.background.systemalarm;

import N3.p;
import O3.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9858a = 0;

    static {
        p.i("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            l.l0(context).f5643f.Q(new C1.p(intent, context, goAsync()));
        } else {
            p.d().b(new Throwable[0]);
        }
    }
}
