package k;

import C2.O;
import G1.AbstractC0144k;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import w3.AbstractC1738m0;
import w3.C1751t0;
import w3.C1760y;
import w3.InterfaceC1730i0;
import w3.N0;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1116d {

    /* JADX INFO: renamed from: a */
    public int f13882a;

    /* JADX INFO: renamed from: b */
    public boolean f13883b;

    /* JADX INFO: renamed from: c */
    public final ContextWrapper f13884c;

    /* JADX INFO: renamed from: d */
    public final Object f13885d;

    /* JADX INFO: renamed from: e */
    public Object f13886e;

    /* JADX INFO: renamed from: f */
    public Object f13887f;

    /* JADX INFO: renamed from: g */
    public Object f13888g;
    public Object h;

    /* JADX INFO: renamed from: i */
    public Object f13889i;

    /* JADX INFO: renamed from: j */
    public Object f13890j;

    public C1116d(N0 n02, InterfaceC1730i0 interfaceC1730i0, C1.k kVar) {
        this.f13884c = n02;
        this.f13885d = interfaceC1730i0;
        this.f13886e = kVar;
        this.f13887f = new u1.r(n02);
        this.f13888g = new O(new Handler(Looper.getMainLooper()), 1);
        this.h = new Intent(n02, n02.getClass());
        this.f13889i = new HashMap();
        this.f13883b = false;
    }

    public C1760y a(C1751t0 c1751t0) {
        I4.y yVar = (I4.y) ((HashMap) this.f13889i).get(c1751t0);
        if (yVar == null || !yVar.isDone()) {
            return null;
        }
        try {
            return (C1760y) M3.a.O(yVar);
        } catch (ExecutionException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public void b(boolean z6) {
        ArrayList arrayList;
        C1.k kVar;
        N0 n02 = (N0) this.f13884c;
        synchronized (n02.f19023o) {
            arrayList = new ArrayList(n02.f19025q.values());
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (c((C1751t0) arrayList.get(i7), false)) {
                return;
            }
        }
        int i8 = w2.t.f18881a;
        N0 n03 = (N0) this.f13884c;
        if (i8 >= 24) {
            AbstractC1738m0.a(n03, z6);
        } else {
            n03.stopForeground(z6 || i8 < 21);
        }
        this.f13883b = false;
        if (!z6 || (kVar = (C1.k) this.f13890j) == null) {
            return;
        }
        ((u1.r) this.f13887f).f17196b.cancel(null, kVar.f959o);
        this.f13882a++;
        this.f13890j = null;
    }

    public boolean c(C1751t0 c1751t0, boolean z6) {
        C1760y c1760yA = a(c1751t0);
        if (c1760yA == null) {
            return false;
        }
        if (c1760yA.C() || z6) {
            return c1760yA.d() == 3 || c1760yA.d() == 2;
        }
        return false;
    }

    public void d(C1751t0 c1751t0, C1.k kVar, boolean z6) {
        int i7 = w2.t.f18881a;
        if (i7 >= 21) {
            ((Notification) kVar.f960p).extras.putParcelable("android.mediaSession", (MediaSession.Token) c1751t0.f19363a.h.f19005k.f20025a.f20007c.f20021p);
        }
        this.f13890j = kVar;
        if (z6) {
            Intent intent = (Intent) this.h;
            N0 n02 = (N0) this.f13884c;
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0144k.k(n02, intent);
            } else {
                n02.startService(intent);
            }
            int i8 = kVar.f959o;
            Notification notification = (Notification) kVar.f960p;
            if (i7 >= 29) {
                w2.s.a(n02, i8, notification, 2, "mediaPlayback");
            } else {
                n02.startForeground(i8, notification);
            }
            this.f13883b = true;
            return;
        }
        int i9 = kVar.f959o;
        u1.r rVar = (u1.r) this.f13887f;
        rVar.getClass();
        Notification notification2 = (Notification) kVar.f960p;
        Bundle bundle = notification2.extras;
        NotificationManager notificationManager = rVar.f17196b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i9, notification2);
        } else {
            u1.n nVar = new u1.n(rVar.f17195a.getPackageName(), i9, notification2);
            synchronized (u1.r.f17193f) {
                try {
                    if (u1.r.f17194g == null) {
                        u1.r.f17194g = new u1.q(rVar.f17195a.getApplicationContext());
                    }
                    u1.r.f17194g.f17187p.obtainMessage(0, nVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            notificationManager.cancel(null, i9);
        }
        b(false);
    }

    public C1116d(ContextThemeWrapper contextThemeWrapper) {
        this.f13882a = -1;
        this.f13884c = contextThemeWrapper;
        this.f13885d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
