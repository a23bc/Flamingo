package w3;

import A2.RunnableC0022x;
import C2.C0039k;
import D2.HandlerC0087c;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t2.C1468A;
import t2.C1470C;
import t2.C1485n;
import t2.C1492v;
import t2.C1494x;
import t2.C1496z;
import v4.C1640c;
import w2.AbstractC1697a;
import x3.AbstractC1914P;
import x3.C1910L;
import x3.C1911M;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends AbstractC1914P {

    /* JADX INFO: renamed from: r */
    public static final int f19000r;

    /* JADX INFO: renamed from: f */
    public final U3.h f19001f;

    /* JADX INFO: renamed from: g */
    public final A0 f19002g;
    public final x3.g0 h;

    /* JADX INFO: renamed from: i */
    public final C1640c f19003i;

    /* JADX INFO: renamed from: j */
    public final HandlerC0087c f19004j;

    /* JADX INFO: renamed from: k */
    public final x3.Z f19005k;
    public final C0039k l;

    /* JADX INFO: renamed from: m */
    public final ComponentName f19006m;

    /* JADX INFO: renamed from: n */
    public p1 f19007n;

    /* JADX INFO: renamed from: o */
    public volatile long f19008o;

    /* JADX INFO: renamed from: p */
    public C1640c f19009p;

    /* JADX INFO: renamed from: q */
    public int f19010q;

    static {
        f19000r = w2.t.f18881a >= 31 ? 33554432 : 0;
    }

    public K0(A0 a0, Uri uri, Handler handler) {
        ComponentName componentName;
        ComponentName componentNameJ;
        PendingIntent foregroundService;
        this.f19002g = a0;
        YosPlaybackService yosPlaybackService = a0.f18903f;
        this.h = x3.g0.a(yosPlaybackService);
        C1640c c1640c = new C1640c();
        c1640c.f18304s = this;
        c1640c.f18301p = t2.J.f16263J;
        c1640c.f18302q = "";
        c1640c.f18300o = -9223372036854775807L;
        this.f19003i = c1640c;
        U3.h hVar = new U3.h(a0);
        this.f19001f = hVar;
        this.f19008o = 300000L;
        this.f19004j = new HandlerC0087c(a0.l.getLooper(), hVar);
        PackageManager packageManager = yosPlaybackService.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(yosPlaybackService.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        boolean z6 = true;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!listQueryBroadcastReceivers.isEmpty()) {
                throw new IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + listQueryBroadcastReceivers.size());
            }
            componentName = null;
        }
        this.f19006m = componentName;
        if (componentName == null || w2.t.f18881a < 31) {
            componentNameJ = J(yosPlaybackService, "androidx.media3.session.MediaLibraryService");
            componentNameJ = componentNameJ == null ? J(yosPlaybackService, "androidx.media3.session.MediaSessionService") : componentNameJ;
            if (componentNameJ == null || componentNameJ.equals(componentName)) {
                z6 = false;
            }
        } else {
            z6 = false;
            componentNameJ = componentName;
        }
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentNameJ == null) {
            C0039k c0039k = new C0039k(5, this);
            this.l = c0039k;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme(uri.getScheme());
            if (w2.t.f18881a < 33) {
                yosPlaybackService.registerReceiver(c0039k, intentFilter);
            } else {
                yosPlaybackService.registerReceiver(c0039k, intentFilter, 4);
            }
            intent2.setPackage(yosPlaybackService.getPackageName());
            foregroundService = PendingIntent.getBroadcast(yosPlaybackService, 0, intent2, f19000r);
            componentNameJ = new ComponentName(yosPlaybackService, (Class<?>) YosPlaybackService.class);
        } else {
            intent2.setComponent(componentNameJ);
            foregroundService = z6 ? w2.t.f18881a >= 26 ? PendingIntent.getForegroundService(yosPlaybackService, 0, intent2, f19000r) : PendingIntent.getService(yosPlaybackService, 0, intent2, f19000r) : PendingIntent.getBroadcast(yosPlaybackService, 0, intent2, f19000r);
            this.l = null;
        }
        String strJoin = TextUtils.join(".", new String[]{"androidx.media3.session.id", a0.f18905i});
        ComponentName componentName2 = componentNameJ;
        int i7 = w2.t.f18881a;
        x3.Z z7 = new x3.Z(yosPlaybackService, strJoin, i7 >= 31 ? null : componentName2, i7 < 31 ? foregroundService : null, a0.f18906j.f18932a.m());
        this.f19005k = z7;
        if (i7 >= 31 && componentName != null) {
            H0.a(z7, componentName);
        }
        PendingIntent pendingIntent = a0.f18915t;
        if (pendingIntent != null) {
            z7.f20025a.f20005a.setSessionActivity(pendingIntent);
        }
        z7.f20025a.e(this, handler);
    }

    public static void D(x3.Z z6, C1911M c1911m) {
        x3.S s7 = z6.f20025a;
        s7.f20012i = c1911m;
        MediaMetadata mediaMetadata = c1911m.f19996p;
        if (mediaMetadata == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                c1911m.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                MediaMetadata mediaMetadata2 = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                c1911m.f19996p = mediaMetadata2;
                parcelObtain.recycle();
                mediaMetadata = mediaMetadata2;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        s7.f20005a.setMetadata(mediaMetadata);
    }

    public static void E(K0 k02, r1 r1Var) {
        k02.getClass();
        int i7 = r1Var.K0(20) ? 4 : 0;
        if (k02.f19010q != i7) {
            k02.f19010q = i7;
            k02.f19005k.f20025a.f20005a.setFlags(i7 | 3);
        }
    }

    public static void F(x3.Z z6, ArrayList arrayList) {
        if (arrayList != null) {
            z6.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x3.W w7 = (x3.W) it.next();
                if (w7 == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j3 = w7.f20017p;
                if (hashSet.contains(Long.valueOf(j3))) {
                    new IllegalArgumentException("id of each queue item should be unique");
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        x3.S s7 = z6.f20025a;
        s7.h = arrayList;
        MediaSession mediaSession = s7.f20005a;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            x3.W w8 = (x3.W) it2.next();
            MediaSession.QueueItem queueItemA = w8.f20018q;
            if (queueItemA == null) {
                queueItemA = x3.V.a(w8.f20016o.c(), w8.f20017p);
                w8.f20018q = queueItemA;
            }
            queueItemA.getClass();
            arrayList2.add(queueItemA);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static t2.G G(String str, Uri uri, String str2, Bundle bundle) {
        C1492v c1492v = new C1492v();
        E4.G g6 = E4.I.f1870p;
        E4.b0 b0Var = E4.b0.f1913s;
        List list = Collections.EMPTY_LIST;
        E4.b0 b0Var2 = E4.b0.f1913s;
        C1496z c1496z = new C1496z();
        C1470C c1470c = C1470C.f16192d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        q.S0 s02 = new q.S0();
        s02.f15225p = uri;
        s02.f15226q = str2;
        s02.f15227r = bundle;
        return new t2.G(str3, new C1494x(c1492v), null, new C1468A(c1496z), t2.J.f16263J, new C1470C(s02));
    }

    public static ComponentName J(YosPlaybackService yosPlaybackService, String str) {
        PackageManager packageManager = yosPlaybackService.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(yosPlaybackService.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // x3.AbstractC1914P
    public final void A(long j3) {
        if (j3 < 0) {
            return;
        }
        H(10, new D0(this, j3, 0), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void B() {
        H(3, new C0(this, 7), this.f19005k.f20025a.c(), true);
    }

    public final void H(final int i7, final J0 j02, final x3.f0 f0Var, final boolean z6) {
        A0 a0 = this.f19002g;
        if (a0.h()) {
            return;
        }
        if (f0Var != null) {
            w2.t.G(a0.l, new Runnable() { // from class: w3.B0
                @Override // java.lang.Runnable
                public final void run() {
                    K0 k02 = this.f18925o;
                    A0 a02 = k02.f19002g;
                    if (a02.h()) {
                        return;
                    }
                    boolean zIsActive = k02.f19005k.f20025a.f20005a.isActive();
                    int i8 = i7;
                    x3.f0 f0Var2 = f0Var;
                    if (!zIsActive) {
                        StringBuilder sbV = n1.c.v(i8, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbV.append(f0Var2.f20039a.f20037b);
                        AbstractC1697a.w(sbV.toString());
                        return;
                    }
                    C1747r0 c1747r0L = k02.L(f0Var2);
                    if (!k02.f19001f.a0(c1747r0L, i8)) {
                        if (i8 != 1 || a02.f18914s.C()) {
                            return;
                        }
                        AbstractC1697a.w("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    a02.r(c1747r0L);
                    a02.f18902e.getClass();
                    try {
                        j02.f(c1747r0L);
                    } catch (RemoteException e7) {
                        AbstractC1697a.x("Exception in " + c1747r0L, e7);
                    }
                    if (z6) {
                        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                        sparseBooleanArray.append(i8, true);
                        a02.o(c1747r0L, new t2.T(new C1485n(sparseBooleanArray)));
                    }
                }
            });
            return;
        }
        AbstractC1697a.l("RemoteUserInfo is null, ignoring command=" + i7);
    }

    public final void I(v1 v1Var, int i7, J0 j02, x3.f0 f0Var) {
        if (f0Var != null) {
            w2.t.G(this.f19002g.l, new Y(this, v1Var, i7, f0Var, j02));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = v1Var;
        if (v1Var == null) {
            objValueOf = Integer.valueOf(i7);
        }
        sb.append(objValueOf);
        AbstractC1697a.l(sb.toString());
    }

    public final void K(t2.G g6, boolean z6) {
        H(31, new N(this, g6, z6), this.f19005k.f20025a.c(), false);
    }

    public final C1747r0 L(x3.f0 f0Var) {
        C1747r0 c1747r0S = this.f19001f.S(f0Var);
        if (c1747r0S == null) {
            C1747r0 c1747r0 = new C1747r0(f0Var, 0, 0, this.h.b(f0Var), new I0(f0Var), Bundle.EMPTY);
            C1744p0 c1744p0K = this.f19002g.k(c1747r0);
            this.f19001f.x(f0Var, c1747r0, c1744p0K.f19321a, c1744p0K.f19322b);
            c1747r0S = c1747r0;
        }
        HandlerC0087c handlerC0087c = this.f19004j;
        long j3 = this.f19008o;
        handlerC0087c.removeMessages(1001, c1747r0S);
        handlerC0087c.sendMessageDelayed(handlerC0087c.obtainMessage(1001, c1747r0S), j3);
        return c1747r0S;
    }

    public final void M(r1 r1Var) {
        w2.t.G(this.f19002g.l, new E0(this, r1Var, 0));
    }

    @Override // x3.AbstractC1914P
    public final void b(C1910L c1910l) {
        if (c1910l != null) {
            H(20, new A2.F(this, c1910l, -1), this.f19005k.f20025a.c(), false);
        }
    }

    @Override // x3.AbstractC1914P
    public final void c(C1910L c1910l, int i7) {
        if (c1910l != null) {
            if (i7 == -1 || i7 >= 0) {
                H(20, new A2.F(this, c1910l, i7), this.f19005k.f20025a.c(), false);
            }
        }
    }

    @Override // x3.AbstractC1914P
    public final void d(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        AbstractC1697a.j(str);
        if (TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) && resultReceiver != null) {
            resultReceiver.send(0, this.f19002g.f18906j.b());
        } else {
            final v1 v1Var = new v1(str, Bundle.EMPTY);
            I(v1Var, 0, new J0() { // from class: w3.G0
                @Override // w3.J0
                public final void f(C1747r0 c1747r0) {
                    K0 k02 = this.f18981o;
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        k02.getClass();
                        bundle2 = Bundle.EMPTY;
                    }
                    I4.y yVarL = k02.f19002g.l(c1747r0, v1Var, bundle2);
                    ResultReceiver resultReceiver2 = resultReceiver;
                    if (resultReceiver2 != null) {
                        ((I4.v) yVarL).b(new RunnableC0022x(yVarL, 18, resultReceiver2), I4.r.f3531o);
                    }
                }
            }, this.f19005k.f20025a.c());
        }
    }

    @Override // x3.AbstractC1914P
    public final void e(String str, Bundle bundle) {
        v1 v1Var = new v1(str, Bundle.EMPTY);
        I(v1Var, 0, new c6.d(this, v1Var, bundle, 2), this.f19005k.f20025a.c());
    }

    @Override // x3.AbstractC1914P
    public final void f() {
        H(12, new C0(this, 10), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final boolean g(Intent intent) {
        x3.f0 f0VarC = this.f19005k.f20025a.c();
        f0VarC.getClass();
        return this.f19002g.m(new C1747r0(f0VarC, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // x3.AbstractC1914P
    public final void h() {
        H(1, new C0(this, 0), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void i() {
        H(1, new C0(this, 11), this.f19005k.f20025a.c(), false);
    }

    @Override // x3.AbstractC1914P
    public final void j(String str, Bundle bundle) {
        K(G(str, null, null, bundle), true);
    }

    @Override // x3.AbstractC1914P
    public final void k(String str, Bundle bundle) {
        K(G(null, null, str, bundle), true);
    }

    @Override // x3.AbstractC1914P
    public final void l(Uri uri, Bundle bundle) {
        K(G(null, uri, null, bundle), true);
    }

    @Override // x3.AbstractC1914P
    public final void m() {
        H(2, new C0(this, 6), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void n(String str, Bundle bundle) {
        K(G(str, null, null, bundle), false);
    }

    @Override // x3.AbstractC1914P
    public final void o(String str, Bundle bundle) {
        K(G(null, null, str, bundle), false);
    }

    @Override // x3.AbstractC1914P
    public final void p(Uri uri, Bundle bundle) {
        K(G(null, uri, null, bundle), false);
    }

    @Override // x3.AbstractC1914P
    public final void q(C1910L c1910l) {
        if (c1910l == null) {
            return;
        }
        H(20, new B2.b(this, 15, c1910l), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void r() {
        H(11, new C0(this, 5), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void s(long j3) {
        H(5, new D0(this, j3, 1), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new C1699B(this, f7, 2), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void u(x3.n0 n0Var) {
        v(n0Var);
    }

    @Override // x3.AbstractC1914P
    public final void v(x3.n0 n0Var) {
        t2.Y yO = AbstractC1748s.o(n0Var);
        if (yO != null) {
            I(null, 40010, new C0(this, yO), this.f19005k.f20025a.c());
            return;
        }
        AbstractC1697a.w("Ignoring invalid RatingCompat " + n0Var);
    }

    @Override // x3.AbstractC1914P
    public final void w(int i7) {
        H(15, new F0(this, i7, 0), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void x(int i7) {
        H(14, new F0(this, i7, 1), this.f19005k.f20025a.c(), true);
    }

    @Override // x3.AbstractC1914P
    public final void y() {
        boolean zK0 = this.f19002g.f18914s.K0(9);
        x3.Z z6 = this.f19005k;
        if (zK0) {
            H(9, new C0(this, 8), z6.f20025a.c(), true);
        } else {
            H(8, new C0(this, 9), z6.f20025a.c(), true);
        }
    }

    @Override // x3.AbstractC1914P
    public final void z() {
        boolean zK0 = this.f19002g.f18914s.K0(7);
        x3.Z z6 = this.f19005k;
        if (zK0) {
            H(7, new C0(this, 3), z6.f20025a.c(), true);
        } else {
            H(6, new C0(this, 4), z6.f20025a.c(), true);
        }
    }
}
