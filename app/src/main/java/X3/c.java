package X3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f8273r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f8274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final O3.l f8275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8276q = 0;

    static {
        N3.p.i("ForceStopRunnable");
        f8273r = TimeUnit.DAYS.toMillis(3650L);
    }

    public c(Context context, O3.l lVar) {
        this.f8274o = context.getApplicationContext();
        this.f8275p = lVar;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i7 = B1.b.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
        long jCurrentTimeMillis = System.currentTimeMillis() + f8273r;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.c.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        O3.l lVar = this.f8275p;
        try {
            N3.b bVar = lVar.f5641d;
            bVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f8274o;
            if (zIsEmpty) {
                N3.p.d().b(new Throwable[0]);
                zA = true;
            } else {
                zA = f.a(context, bVar);
                N3.p.d().b(new Throwable[0]);
            }
            if (!zA) {
                return;
            }
            while (true) {
                O3.k.a(context);
                N3.p.d().b(new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e7) {
                    int i7 = this.f8276q + 1;
                    this.f8276q = i7;
                    if (i7 >= 3) {
                        N3.p.d().c(e7);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                        lVar.f5641d.getClass();
                        throw illegalStateException;
                    }
                    N3.p.d().b(e7);
                    try {
                        Thread.sleep(((long) this.f8276q) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            lVar.m0();
        }
    }
}
