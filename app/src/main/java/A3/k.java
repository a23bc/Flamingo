package A3;

import A2.x0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    public static final s1.i f510a = new s1.i();

    /* JADX INFO: renamed from: b */
    public static final Object f511b = new Object();

    /* JADX INFO: renamed from: c */
    public static x0 f512c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static x0 b() {
        x0 x0Var = new x0(5);
        f512c = x0Var;
        s1.i iVar = f510a;
        iVar.getClass();
        if (s1.g.f15858t.u(iVar, null, x0Var)) {
            s1.g.c(iVar);
        }
        return f512c;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.k.c(android.content.Context, boolean):void");
    }
}
