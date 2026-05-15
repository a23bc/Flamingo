package C1;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t.C1465u;
import t.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1465u f955a = new C1465u(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T f958d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f956b = threadPoolExecutor;
        f957c = new Object();
        f958d = new T(0);
    }

    public static String a(int i7, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((f) list.get(i8)).f945e);
            sb.append("-");
            sb.append(i7);
            if (i8 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C1.i b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            o5.AbstractC1267a.n(r1)
            t.u r1 = C1.j.f955a
            java.lang.Object r2 = r1.c(r8)     // Catch: java.lang.Throwable -> Lb6
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L19
            C1.i r8 = new C1.i     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        L19:
            C1.k r10 = C1.e.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac java.lang.Throwable -> Lb6
            int r2 = r10.f959o     // Catch: java.lang.Throwable -> Lb6
            r3 = 0
            java.lang.Object r10 = r10.f960p
            java.util.List r10 = (java.util.List) r10
            r4 = -3
            if (r2 == 0) goto L2d
            if (r2 == r0) goto L2b
        L29:
            r2 = r4
            goto L4d
        L2b:
            r2 = -2
            goto L4d
        L2d:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb6
            C1.l[] r2 = (C1.l[]) r2     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L4c
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb6
            if (r5 != 0) goto L39
            goto L4c
        L39:
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb6
            r6 = r3
        L3b:
            if (r6 >= r5) goto L4a
            r7 = r2[r6]     // Catch: java.lang.Throwable -> Lb6
            int r7 = r7.f965e     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L48
            if (r7 >= 0) goto L46
            goto L29
        L46:
            r2 = r7
            goto L4d
        L48:
            int r6 = r6 + r0
            goto L3b
        L4a:
            r2 = r3
            goto L4d
        L4c:
            r2 = r0
        L4d:
            if (r2 == 0) goto L58
            C1.i r8 = new C1.i     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        L58:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> Lb6
            if (r2 <= r0) goto L7a
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb6
            r2 = 29
            if (r0 < r2) goto L7a
            k.a r0 = y1.AbstractC1996e.f20278a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            o5.AbstractC1267a.n(r0)     // Catch: java.lang.Throwable -> Lb6
            k.a r0 = y1.AbstractC1996e.f20278a     // Catch: java.lang.Throwable -> L75
            android.graphics.Typeface r9 = r0.B(r9, r10, r11)     // Catch: java.lang.Throwable -> L75
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            goto L90
        L75:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Throwable -> Lb6
        L7a:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb6
            C1.l[] r10 = (C1.l[]) r10     // Catch: java.lang.Throwable -> Lb6
            k.a r0 = y1.AbstractC1996e.f20278a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            o5.AbstractC1267a.n(r0)     // Catch: java.lang.Throwable -> Lb6
            k.a r0 = y1.AbstractC1996e.f20278a     // Catch: java.lang.Throwable -> La7
            android.graphics.Typeface r9 = r0.A(r9, r10, r11)     // Catch: java.lang.Throwable -> La7
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
        L90:
            if (r9 == 0) goto L9e
            r1.d(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            C1.i r8 = new C1.i     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        L9e:
            C1.i r8 = new C1.i     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        La7:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Throwable -> Lb6
        Lac:
            C1.i r8 = new C1.i     // Catch: java.lang.Throwable -> Lb6
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        Lb6:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.j.b(java.lang.String, android.content.Context, java.util.List, int):C1.i");
    }
}
