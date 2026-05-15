package A3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f505p;

    public /* synthetic */ h(Context context, int i7) {
        this.f504o = i7;
        this.f505p = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f504o
            switch(r0) {
                case 0: goto L97;
                case 1: goto L88;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L85
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f505p
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto L85
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L5e
            t.f r0 = k.o.f13932u
            r0.getClass()
            t.a r2 = new t.a
            r2.<init>(r0)
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            k.o r0 = (k.o) r0
            if (r0 == 0) goto L2d
            k.A r0 = (k.LayoutInflaterFactory2C1111A) r0
            android.content.Context r0 = r0.f13825y
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L63
            android.os.LocaleList r0 = k.l.a(r0)
            B1.g r2 = new B1.g
            B1.j r6 = new B1.j
            r6.<init>(r0)
            r2.<init>(r6)
            goto L65
        L5e:
            B1.g r2 = k.o.f13928q
            if (r2 == 0) goto L63
            goto L65
        L63:
            B1.g r2 = B1.g.f721b
        L65:
            B1.i r0 = r2.f722a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7e
            java.lang.String r0 = u1.d.e(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto L7e
            android.os.LocaleList r0 = k.AbstractC1123k.a(r0)
            k.l.b(r2, r0)
        L7e:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L85:
            k.o.f13931t = r1
            return
        L88:
            A3.d r0 = new A3.d
            r1 = 0
            r0.<init>(r1)
            A2.x0 r1 = A3.f.f493a
            r2 = 0
            android.content.Context r3 = r11.f505p
            A3.f.t(r3, r0, r1, r2)
            return
        L97:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            A3.h r0 = new A3.h
            android.content.Context r1 = r11.f505p
            r2 = 1
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.h.run():void");
    }
}
