package t4;

import I4.t;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0592o;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: t4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1516k implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1516k f17083g = new C1516k();
    public static final Activity h = new Activity();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f17084a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f17085b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f17086c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17087d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17088e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17089f = false;

    public static void d(Activity activity, boolean z6) {
        try {
            if (z6) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
                return;
            }
            Object tag = activity.getWindow().getDecorView().getTag(-123);
            if (tag instanceof Integer) {
                AbstractC1514i.f17080a.postDelayed(new t(activity, 11, (Integer) tag), 100L);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(Activity activity, EnumC0592o enumC0592o) {
        ConcurrentHashMap concurrentHashMap = this.f17086c;
        b(activity, enumC0592o, (List) concurrentHashMap.get(activity));
        b(activity, enumC0592o, (List) concurrentHashMap.get(h));
    }

    public final void b(Activity activity, EnumC0592o enumC0592o, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        if (enumC0592o.equals(EnumC0592o.ON_DESTROY)) {
            this.f17086c.remove(activity);
        }
    }

    public final void c(boolean z6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17085b;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z6) {
                throw null;
            }
            throw null;
        }
    }

    public final void e(Activity activity) {
        LinkedList linkedList = this.f17084a;
        if (!linkedList.contains(activity)) {
            linkedList.addFirst(activity);
        } else {
            if (((Activity) linkedList.getFirst()).equals(activity)) {
                return;
            }
            linkedList.remove(activity);
            linkedList.addFirst(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Locale locale;
        if (this.f17084a.size() == 0) {
            c(true);
        }
        String string = j0.k.v().f17072a.getString("KEY_LOCALE", "");
        if (!TextUtils.isEmpty(string)) {
            if ("VALUE_FOLLOW_SYSTEM".equals(string)) {
                Configuration configuration = Resources.getSystem().getConfiguration();
                locale = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
            } else {
                char[] charArray = string.toCharArray();
                int length = charArray.length;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i7 < length) {
                        if (charArray[i7] == '$') {
                            if (i8 >= 1) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        i7++;
                    } else if (i8 == 1) {
                        try {
                            int iIndexOf = string.indexOf("$");
                            locale = new Locale(string.substring(0, iIndexOf), string.substring(iIndexOf + 1));
                        } catch (Exception unused) {
                            locale = null;
                        }
                    }
                }
                if (locale == null) {
                    j0.k.v().f17072a.edit().remove("KEY_LOCALE").apply();
                }
            }
            if (locale != null) {
                Resources resources = activity.getResources();
                Configuration configuration2 = resources.getConfiguration();
                configuration2.setLocale(locale);
                resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
                Resources resources2 = i6.h.z().getResources();
                Configuration configuration3 = resources2.getConfiguration();
                configuration3.setLocale(locale);
                resources2.updateConfiguration(configuration3, resources2.getDisplayMetrics());
            }
        }
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                }
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (NoSuchFieldException e8) {
                e8.printStackTrace();
            }
        }
        e(activity);
        a(activity, EnumC0592o.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f17084a.remove(activity);
        Window window = activity.getWindow();
        InputMethodManager inputMethodManager = (InputMethodManager) i6.h.z().getSystemService("input_method");
        if (inputMethodManager != null) {
            String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
            for (int i7 = 0; i7 < 4; i7++) {
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i7]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                        declaredField.set(inputMethodManager, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        a(activity, EnumC0592o.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, EnumC0592o.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity);
        if (this.f17089f) {
            this.f17089f = false;
            c(true);
        }
        d(activity, false);
        a(activity, EnumC0592o.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f17089f) {
            e(activity);
        }
        int i7 = this.f17088e;
        if (i7 < 0) {
            this.f17088e = i7 + 1;
        } else {
            this.f17087d++;
        }
        a(activity, EnumC0592o.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f17088e--;
        } else {
            int i7 = this.f17087d - 1;
            this.f17087d = i7;
            if (i7 <= 0) {
                this.f17089f = true;
                c(false);
            }
        }
        d(activity, true);
        a(activity, EnumC0592o.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
