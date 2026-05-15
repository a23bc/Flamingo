package f6;

import F.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f12243a;

    public a(w wVar) {
        this.f12243a = wVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC1209k.f(context, "context");
        AbstractC1209k.f(intent, "intent");
        if (AbstractC1209k.a(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION")) {
            Object systemService = context.getSystemService("audio");
            AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.f12243a.b(Integer.valueOf(((AudioManager) systemService).getStreamVolume(3)));
        }
    }
}
