package y1;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import k.AbstractC1113a;
import o5.AbstractC1267a;
import t.C1465u;

/* JADX INFO: renamed from: y1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1996e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1113a f20278a;

    /* JADX INFO: renamed from: b */
    public static final C1465u f20279b;

    static {
        AbstractC1267a.n("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f20278a = new C2001j();
        } else if (i7 >= 28) {
            f20278a = new C2000i();
        } else if (i7 >= 26) {
            f20278a = new C1999h();
        } else if (i7 < 24 || C1998g.f20287d == null) {
            f20278a = new C1997f();
        } else {
            f20278a = new C1998g();
        }
        f20279b = new C1465u(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, x1.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, d1.e r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.AbstractC1996e.a(android.content.Context, x1.d, android.content.res.Resources, int, java.lang.String, int, int, d1.e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }
}
