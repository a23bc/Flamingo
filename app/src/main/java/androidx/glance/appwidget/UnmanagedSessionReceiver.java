package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b2.C0683y;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class UnmanagedSessionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final C0683y f9552a = new C0683y();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f9553b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC1209k.a(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
                throw new IllegalStateException("Intent is missing ActionKey extra");
            }
            int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
            if (intExtra == -1) {
                throw new IllegalStateException("Intent is missing AppWidgetId extra");
            }
            C0683y.a(intExtra);
        }
    }
}
