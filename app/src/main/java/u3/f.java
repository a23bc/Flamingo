package U3;

import C2.C0039k;
import N3.p;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f7038j = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f7039g;
    public final e h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0039k f7040i;

    static {
        p.i("NetworkStateTracker");
    }

    public f(Context context, A0.b bVar) {
        super(context, bVar);
        this.f7039g = (ConnectivityManager) this.f7032b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = new e(0, this);
        } else {
            this.f7040i = new C0039k(2, this);
        }
    }

    @Override // U3.d
    public final Object a() {
        return f();
    }

    @Override // U3.d
    public final void d() {
        if (!(Build.VERSION.SDK_INT >= 24)) {
            p.d().b(new Throwable[0]);
            this.f7032b.registerReceiver(this.f7040i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            p.d().b(new Throwable[0]);
            this.f7039g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e7) {
            p.d().c(e7);
        }
    }

    @Override // U3.d
    public final void e() {
        if (!(Build.VERSION.SDK_INT >= 24)) {
            p.d().b(new Throwable[0]);
            this.f7032b.unregisterReceiver(this.f7040i);
            return;
        }
        try {
            p.d().b(new Throwable[0]);
            this.f7039g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e7) {
            p.d().c(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S3.a f() {
        /*
            r8 = this;
            android.net.ConnectivityManager r0 = r8.f7039g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            android.net.Network r5 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r5 = r3
            goto L37
        L27:
            r5 = move-exception
            goto L2b
        L29:
            r5 = r2
            goto L37
        L2b:
            N3.p r6 = N3.p.d()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            r6.c(r7)
            goto L29
        L37:
            boolean r0 = r0.isActiveNetworkMetered()
            if (r1 == 0) goto L44
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L44
            r2 = r3
        L44:
            S3.a r1 = new S3.a
            r1.<init>()
            r1.f6739a = r4
            r1.f6740b = r5
            r1.f6741c = r0
            r1.f6742d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.f.f():S3.a");
    }
}
