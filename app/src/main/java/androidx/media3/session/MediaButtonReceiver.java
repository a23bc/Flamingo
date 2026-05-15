package androidx.media3.session;

import G1.AbstractC0144k;
import Z1.l;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import w2.AbstractC1697a;
import w2.t;
import w3.AbstractC1752u;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f9828a = {"android.intent.action.MEDIA_BUTTON", "androidx.media3.session.MediaLibraryService", "androidx.media3.session.MediaSessionService"};

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (intent == null || !Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        if (t.f18881a >= 26) {
            Bundle extras = intent.getExtras();
            extras.getClass();
            KeyEvent keyEvent = (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85) {
                return;
            }
        }
        String[] strArr = f9828a;
        for (int i7 = 0; i7 < 3; i7++) {
            String str = strArr[i7];
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent(str);
            intent2.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!listQueryIntentServices.isEmpty()) {
                    StringBuilder sbU = l.u("Expected 1 service that handles ", str, ", found ");
                    sbU.append(listQueryIntentServices.size());
                    throw new IllegalStateException(sbU.toString());
                }
                componentName = null;
            }
            if (componentName != null) {
                intent.setComponent(componentName);
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        AbstractC0144k.k(context, intent);
                        return;
                    } else {
                        context.startService(intent);
                        return;
                    }
                } catch (IllegalStateException e7) {
                    if (Build.VERSION.SDK_INT < 31 || !AbstractC1752u.b(e7)) {
                        throw e7;
                    }
                    AbstractC1697a.m("caught exception when trying to start a foreground service from the background: " + AbstractC1752u.a(e7).getMessage());
                    return;
                }
            }
        }
        throw new IllegalStateException("Could not find any Service that handles any of the actions " + Arrays.toString(strArr));
    }
}
