package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import t.C1446a;
import t.C1451f;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: o */
    public static final m f13926o = new m(new n());

    /* JADX INFO: renamed from: p */
    public static final int f13927p = -100;

    /* JADX INFO: renamed from: q */
    public static B1.g f13928q = null;

    /* JADX INFO: renamed from: r */
    public static B1.g f13929r = null;

    /* JADX INFO: renamed from: s */
    public static Boolean f13930s = null;

    /* JADX INFO: renamed from: t */
    public static boolean f13931t = false;

    /* JADX INFO: renamed from: u */
    public static final C1451f f13932u = new C1451f(0);

    /* JADX INFO: renamed from: v */
    public static final Object f13933v = new Object();

    /* JADX INFO: renamed from: w */
    public static final Object f13934w = new Object();

    public static boolean a(Context context) {
        if (f13930s == null) {
            try {
                int i7 = F.f13839o;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) F.class), Build.VERSION.SDK_INT >= 24 ? E.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f13930s = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f13930s = Boolean.FALSE;
            }
        }
        return f13930s.booleanValue();
    }

    public static void d(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A) {
        synchronized (f13933v) {
            try {
                C1451f c1451f = f13932u;
                c1451f.getClass();
                C1446a c1446a = new C1446a(c1451f);
                while (c1446a.hasNext()) {
                    o oVar = (o) ((WeakReference) c1446a.next()).get();
                    if (oVar == layoutInflaterFactory2C1111A || oVar == null) {
                        c1446a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract boolean e(int i7);

    public abstract void f(int i7);

    public abstract void g(View view);

    public abstract void h(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void i(CharSequence charSequence);
}
