package O3;

import A2.d0;
import D2.B;
import V.o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaRouter2;
import android.os.Build;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class f implements H3.a, T1.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f5626o;

    public f(Context context, int i7) {
        switch (i7) {
            case 1:
                this.f5626o = context.getApplicationContext();
                break;
            case 2:
                AbstractC1209k.f(context, "context");
                this.f5626o = context;
                break;
            default:
                this.f5626o = context;
                break;
        }
    }

    @Override // T1.i
    public void a(android.support.v4.media.session.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new T1.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new d0(this, bVar, threadPoolExecutor, 6));
    }

    public void b() {
        String str = Build.MANUFACTURER;
        AbstractC1209k.e(str, "MANUFACTURER");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1209k.e(lowerCase, "toLowerCase(...)");
        boolean zN = AbstractC1545g.N(lowerCase, "xiaomi", false);
        Context context = this.f5626o;
        try {
            if (zN) {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setClassName("miui.systemui.plugin", "miui.systemui.miplay.MiPlayDetailActivity");
                context.startActivity(intent);
                return;
            }
            if (AbstractC1545g.N(lowerCase, "samsung", false)) {
                Intent intent2 = new Intent();
                intent2.setFlags(268435456);
                intent2.setClassName("com.samsung.android.mdx.quickboard", "com.samsung.android.mdx.quickboard.view.MediaActivity");
                context.startActivity(intent2);
                return;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                MediaRouter2 mediaRouter2 = MediaRouter2.getInstance(context);
                AbstractC1209k.e(mediaRouter2, "getInstance(...)");
                mediaRouter2.showSystemOutputSwitcher();
                return;
            }
            if (i7 >= 31) {
                Intent intent3 = new Intent();
                intent3.setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG");
                intent3.setPackage("com.android.systemui");
                intent3.putExtra("package_name", context.getPackageName());
                c(intent3);
                return;
            }
            if (i7 != 30) {
                Intent intent4 = new Intent();
                intent4.setFlags(268435456);
                intent4.setAction("com.android.settings.panel.action.MEDIA_OUTPUT");
                intent4.putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
                c(intent4);
                return;
            }
            Intent intent5 = new Intent();
            intent5.setFlags(268435456);
            intent5.setAction("com.android.settings.panel.action.MEDIA_OUTPUT");
            intent5.putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent5, 0);
            AbstractC1209k.e(listQueryIntentActivities, "queryIntentActivities(...)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                ApplicationInfo applicationInfo = activityInfo != null ? activityInfo.applicationInfo : null;
                if (applicationInfo != null && (applicationInfo.flags & 1) != 0) {
                    context.startActivity(intent5);
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public void c(Intent intent) {
        Context context = this.f5626o;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        AbstractC1209k.e(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            ApplicationInfo applicationInfo = activityInfo != null ? activityInfo.applicationInfo : null;
            if (applicationInfo != null && (applicationInfo.flags & 1) != 0) {
                context.startActivity(intent);
                return;
            }
        }
    }

    @Override // H3.a
    public H3.b n(B b7) {
        o oVar = (o) b7.f1461r;
        if (oVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f5626o;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        String str = (String) b7.f1460q;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        B b8 = new B(context, str, oVar, true);
        return new I3.e((Context) b8.f1459p, (String) b8.f1460q, (o) b8.f1461r, b8.f1458o);
    }
}
