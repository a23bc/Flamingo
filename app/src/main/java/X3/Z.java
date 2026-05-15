package x3;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f20024d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f20025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.a f20026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20027c = new ArrayList();

    public Z(YosPlaybackService yosPlaybackService, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (yosPlaybackService == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null) {
            int i7 = AbstractC1941z.f20132a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(yosPlaybackService.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = yosPlaybackService.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                listQueryBroadcastReceivers.size();
                componentName = null;
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(yosPlaybackService, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            this.f20025a = new U(yosPlaybackService, str, bundle);
        } else if (i8 >= 28) {
            this.f20025a = new T(yosPlaybackService, str, bundle);
        } else {
            this.f20025a = new S(yosPlaybackService, str, bundle);
        }
        Looper looperMyLooper = Looper.myLooper();
        this.f20025a.e(new C1912N(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        this.f20025a.f20005a.setMediaButtonReceiver(pendingIntent);
        this.f20026b = new V1.a((Context) yosPlaybackService, this.f20025a.f20007c);
        if (f20024d == 0) {
            f20024d = (int) (TypedValue.applyDimension(1, 320.0f, yosPlaybackService.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = Z.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.List] */
    public final void b(m0 m0Var) {
        S s7 = this.f20025a;
        s7.f20011g = m0Var;
        synchronized (s7.f20008d) {
            for (int iBeginBroadcast = s7.f20010f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC1921f) s7.f20010f.getBroadcastItem(iBeginBroadcast)).r(m0Var);
                } catch (RemoteException unused) {
                }
            }
            s7.f20010f.finishBroadcast();
        }
        MediaSession mediaSession = s7.f20005a;
        if (m0Var.f20079z == null) {
            PlaybackState.Builder builderD = i0.d();
            i0.x(builderD, m0Var.f20068o, m0Var.f20069p, m0Var.f20071r, m0Var.f20075v);
            i0.u(builderD, m0Var.f20070q);
            i0.s(builderD, m0Var.f20072s);
            i0.v(builderD, m0Var.f20074u);
            for (l0 l0Var : m0Var.f20076w) {
                PlaybackState.CustomAction customActionB = l0Var.f20065s;
                if (customActionB == null) {
                    PlaybackState.CustomAction.Builder builderE = i0.e(l0Var.f20061o, l0Var.f20062p, l0Var.f20063q);
                    i0.w(builderE, l0Var.f20064r);
                    customActionB = i0.b(builderE);
                }
                if (customActionB != null) {
                    i0.a(builderD, customActionB);
                }
            }
            i0.t(builderD, m0Var.f20077x);
            j0.b(builderD, m0Var.f20078y);
            m0Var.f20079z = i0.c(builderD);
        }
        mediaSession.setPlaybackState(m0Var.f20079z);
    }
}
