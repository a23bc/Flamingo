package Q3;

import N3.p;
import O3.l;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6110a = 0;

    static {
        p.i("Alarms");
    }

    public static void a(Context context, String str, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        p.d().b(new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j3) {
        int iIntValue;
        WorkDatabase workDatabase = lVar.f5642e;
        A0.b bVarK = workDatabase.k();
        W3.d dVarX = bVarK.X(str);
        if (dVarX != null) {
            a(context, str, dVarX.f7792b);
            int i7 = dVarX.f7792b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i7, b.b(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j3, service);
                return;
            }
            return;
        }
        synchronized (X3.d.class) {
            workDatabase.c();
            try {
                Long lZ = workDatabase.j().z("next_alarm_manager_id");
                iIntValue = lZ != null ? lZ.intValue() : 0;
                workDatabase.j().G(new W3.c("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        bVarK.a0(new W3.d(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, b.b(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j3, service2);
        }
    }
}
