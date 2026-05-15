package c2;

import Y4.h;
import a2.AbstractC0515e;
import a2.C0513c;
import a2.C0516f;
import a2.C0517g;
import a2.InterfaceC0511a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import b2.L0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import l5.InterfaceC1182c;
import n1.i;
import yos.music.player.MainActivity;

/* JADX INFO: renamed from: c2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0732g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0513c f10663a = new C0513c("android.widget.extra.CHECKED");

    public static Intent a(Intent intent, L0 l02, int i7) {
        Intent intent2 = new Intent(l02.f10084a, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent2.setData(c(l02, i7, 2, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static Intent b(Context context, Class cls, int i7, C0516f c0516f) {
        Intent intentPutExtra = new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i7);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(c0516f.f8836a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C0513c c0513c = (C0513c) entry.getKey();
            arrayList.add(new h(c0513c.f8835a, entry.getValue()));
        }
        h[] hVarArr = (h[]) arrayList.toArray(new h[0]);
        intentPutExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", android.support.v4.media.session.b.f((h[]) Arrays.copyOf(hVarArr, hVarArr.length)));
        return intentPutExtra;
    }

    public static final Uri c(L0 l02, int i7, int i8, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i8 == 1) {
            str2 = "ACTIVITY";
        } else if (i8 == 2) {
            str2 = "BROADCAST";
        } else if (i8 == 3) {
            str2 = "SERVICE";
        } else if (i8 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i8 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(l02.f10085b));
        builder.appendQueryParameter("viewId", String.valueOf(i7));
        builder.appendQueryParameter("viewSize", i.c(l02.f10092j));
        builder.appendQueryParameter("extraData", str);
        if (l02.f10089f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(l02.f10093k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final Intent d(InterfaceC0511a interfaceC0511a, L0 l02, int i7, InterfaceC1182c interfaceC1182c) {
        if (interfaceC0511a instanceof C0517g) {
            C0517g c0517g = (C0517g) interfaceC0511a;
            Intent intentF = f(c0517g, l02, (C0516f) interfaceC1182c.b(c0517g.f8837a));
            if (intentF.getData() == null) {
                intentF.setData(c(l02, i7, 5, ""));
            }
            return intentF;
        }
        boolean z6 = interfaceC0511a instanceof C0730e;
        int i8 = l02.f10085b;
        if (z6) {
            int i9 = ActionCallbackBroadcastReceiver.f9554a;
            C0730e c0730e = (C0730e) interfaceC0511a;
            return a(b(l02.f10084a, c0730e.f10660a, i8, (C0516f) interfaceC1182c.b(c0730e.f10661b)), l02, i7);
        }
        if (!(interfaceC0511a instanceof AbstractC0515e)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + interfaceC0511a).toString());
        }
        ComponentName componentName = l02.f10095n;
        if (componentName != null) {
            return a(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i8), l02, i7);
        }
        throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
    }

    public static final PendingIntent e(InterfaceC0511a interfaceC0511a, L0 l02, int i7, InterfaceC1182c interfaceC1182c) {
        boolean z6 = interfaceC0511a instanceof C0517g;
        Context context = l02.f10084a;
        if (z6) {
            C0517g c0517g = (C0517g) interfaceC0511a;
            Intent intentF = f(c0517g, l02, (C0516f) interfaceC1182c.b(c0517g.f8837a));
            if (intentF.getData() == null) {
                intentF.setData(c(l02, i7, 5, ""));
            }
            return PendingIntent.getActivity(context, 0, intentF, 201326592, null);
        }
        boolean z7 = interfaceC0511a instanceof C0730e;
        int i8 = l02.f10085b;
        if (z7) {
            int i9 = ActionCallbackBroadcastReceiver.f9554a;
            C0730e c0730e = (C0730e) interfaceC0511a;
            Intent intentB = b(context, c0730e.f10660a, i8, (C0516f) interfaceC1182c.b(c0730e.f10661b));
            intentB.setData(c(l02, i7, 5, ""));
            return PendingIntent.getBroadcast(context, 0, intentB, 201326592);
        }
        if (!(interfaceC0511a instanceof AbstractC0515e)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + interfaceC0511a).toString());
        }
        ComponentName componentName = l02.f10095n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i8);
        intentPutExtra.setData(c(l02, i7, 5, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final Intent f(C0517g c0517g, L0 l02, C0516f c0516f) {
        if (!(c0517g instanceof C0517g)) {
            throw new IllegalStateException(("Action type not defined in app widget package: " + c0517g).toString());
        }
        Intent intent = new Intent(l02.f10084a, (Class<?>) MainActivity.class);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(c0516f.f8836a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            arrayList.add(new h(((C0513c) entry.getKey()).f8835a, entry.getValue()));
        }
        h[] hVarArr = (h[]) arrayList.toArray(new h[0]);
        intent.putExtras(android.support.v4.media.session.b.f((h[]) Arrays.copyOf(hVarArr, hVarArr.length)));
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(android.app.Activity r5, android.content.Intent r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.AbstractC0732g.g(android.app.Activity, android.content.Intent):void");
    }
}
