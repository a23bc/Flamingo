package androidx.glance.appwidget.action;

import N5.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c2.C0727b;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public final class ActionCallbackBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9554a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d.L(this, M.f19497a, new C0727b(intent, context, null));
    }
}
