package w3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B1 {

    /* JADX INFO: renamed from: b */
    public static final String f18930b;

    /* JADX INFO: renamed from: c */
    public static final String f18931c;

    /* JADX INFO: renamed from: a */
    public final A1 f18932a;

    static {
        t2.H.a("media3.session");
        int i7 = w2.t.f18881a;
        f18930b = Integer.toString(0, 36);
        f18931c = Integer.toString(1, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B1(yos.music.player.YosBasicApplication r12, android.content.ComponentName r13) {
        /*
            r11 = this;
            r11.<init>()
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            java.lang.String r0 = r13.getPackageName()
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            int r0 = r0.uid     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
        L12:
            r2 = r0
            goto L16
        L14:
            r0 = -1
            goto L12
        L16:
            java.lang.String r0 = "androidx.media3.session.MediaLibraryService"
            boolean r0 = a(r12, r0, r13)
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L23
            r12 = 2
        L21:
            r3 = r12
            goto L36
        L23:
            java.lang.String r0 = "androidx.media3.session.MediaSessionService"
            boolean r0 = a(r12, r0, r13)
            if (r0 == 0) goto L2d
            r12 = 1
            goto L21
        L2d:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            boolean r12 = a(r12, r0, r13)
            if (r12 == 0) goto L57
            r3 = r1
        L36:
            if (r3 == r1) goto L4e
            w3.C1 r1 = new w3.C1
            java.lang.String r6 = r13.getPackageName()
            java.lang.String r7 = r13.getClassName()
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            r5 = 0
            r9 = 0
            r4 = 0
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f18932a = r1
            goto L56
        L4e:
            r8 = r13
            w3.D1 r12 = new w3.D1
            r12.<init>(r8, r2)
            r11.f18932a = r12
        L56:
            return
        L57:
            r8 = r13
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to resolve SessionToken for "
            r13.<init>(r0)
            r13.append(r8)
            java.lang.String r0 = ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name."
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.B1.<init>(yos.music.player.YosBasicApplication, android.content.ComponentName):void");
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i7 = 0; i7 < listQueryIntentServices.size(); i7++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i7);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        A1 a12 = this.f18932a;
        boolean z6 = a12 instanceof C1;
        String str = f18930b;
        if (z6) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(f18931c, a12.t());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B1) {
            return this.f18932a.equals(((B1) obj).f18932a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18932a.hashCode();
    }

    public final String toString() {
        return this.f18932a.toString();
    }

    public B1(int i7, int i8, int i9, String str, InterfaceC1741o interfaceC1741o, Bundle bundle) {
        str.getClass();
        IBinder iBinderAsBinder = interfaceC1741o.asBinder();
        bundle.getClass();
        this.f18932a = new C1(i7, 0, i8, i9, str, "", null, iBinderAsBinder, bundle);
    }
}
