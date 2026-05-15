package V3;

import N3.i;
import N3.p;
import O3.l;
import Q3.g;
import S3.c;
import T1.h;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements S3.b, O3.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f7428x = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f7429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A0.b f7430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f7431q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f7432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f7433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f7434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashSet f7435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f7436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SystemForegroundService f7437w;

    static {
        p.i("SystemFgDispatcher");
    }

    public a(Context context) {
        l lVarL0 = l.l0(context);
        this.f7429o = lVarL0;
        A0.b bVar = lVarL0.f5643f;
        this.f7430p = bVar;
        this.f7432r = null;
        this.f7433s = new LinkedHashMap();
        this.f7435u = new HashSet();
        this.f7434t = new HashMap();
        this.f7436v = new c(context, bVar, this);
        lVarL0.h.b(this);
    }

    public static Intent b(Context context, String str, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f5136a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f5137b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f5138c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context, String str, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f5136a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f5137b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f5138c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // O3.a
    public final void a(String str, boolean z6) {
        Map.Entry entry;
        synchronized (this.f7431q) {
            try {
                W3.i iVar = (W3.i) this.f7434t.remove(str);
                if (iVar != null ? this.f7435u.remove(iVar) : false) {
                    this.f7436v.c(this.f7435u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar2 = (i) this.f7433s.remove(str);
        if (str.equals(this.f7432r) && this.f7433s.size() > 0) {
            Iterator it = this.f7433s.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f7432r = (String) entry.getKey();
            if (this.f7437w != null) {
                i iVar3 = (i) entry.getValue();
                SystemForegroundService systemForegroundService = this.f7437w;
                systemForegroundService.f9863p.post(new b(systemForegroundService, iVar3.f5136a, iVar3.f5138c, iVar3.f5137b));
                SystemForegroundService systemForegroundService2 = this.f7437w;
                systemForegroundService2.f9863p.post(new h(systemForegroundService2, iVar3.f5136a));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f7437w;
        if (iVar2 == null || systemForegroundService3 == null) {
            return;
        }
        p.d().b(new Throwable[0]);
        systemForegroundService3.f9863p.post(new h(systemForegroundService3, iVar2.f5136a));
    }

    @Override // S3.b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p.d().b(new Throwable[0]);
            l lVar = this.f7429o;
            lVar.f5643f.Q(new X3.h(lVar, str, true));
        }
    }

    public final void f(Intent intent) {
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        p.d().b(new Throwable[0]);
        if (notification == null || this.f7437w == null) {
            return;
        }
        i iVar = new i(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f7433s;
        linkedHashMap.put(stringExtra, iVar);
        if (TextUtils.isEmpty(this.f7432r)) {
            this.f7432r = stringExtra;
            SystemForegroundService systemForegroundService = this.f7437w;
            systemForegroundService.f9863p.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f7437w;
        systemForegroundService2.f9863p.post(new g(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i7 |= ((i) ((Map.Entry) it.next()).getValue()).f5137b;
        }
        i iVar2 = (i) linkedHashMap.get(this.f7432r);
        if (iVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f7437w;
            systemForegroundService3.f9863p.post(new b(systemForegroundService3, iVar2.f5136a, iVar2.f5138c, i7));
        }
    }

    public final void g() {
        this.f7437w = null;
        synchronized (this.f7431q) {
            this.f7436v.d();
        }
        this.f7429o.h.f(this);
    }

    @Override // S3.b
    public final void d(List list) {
    }
}
