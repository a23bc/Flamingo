package O3;

import A2.x0;
import B3.n;
import N2.z;
import N3.p;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import r.C1380a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class l extends M3.a {
    public static l l;

    /* JADX INFO: renamed from: m */
    public static l f5638m;

    /* JADX INFO: renamed from: n */
    public static final Object f5639n;

    /* JADX INFO: renamed from: c */
    public final Context f5640c;

    /* JADX INFO: renamed from: d */
    public final N3.b f5641d;

    /* JADX INFO: renamed from: e */
    public final WorkDatabase f5642e;

    /* JADX INFO: renamed from: f */
    public final A0.b f5643f;

    /* JADX INFO: renamed from: g */
    public final List f5644g;
    public final b h;

    /* JADX INFO: renamed from: i */
    public final X3.d f5645i;

    /* JADX INFO: renamed from: j */
    public boolean f5646j;

    /* JADX INFO: renamed from: k */
    public BroadcastReceiver.PendingResult f5647k;

    static {
        p.i("WorkManagerImpl");
        l = null;
        f5638m = null;
        f5639n = new Object();
    }

    public l(Context context, N3.b bVar, A0.b bVar2) {
        B3.i iVar;
        Executor executor;
        String str;
        boolean z6 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        X3.g gVar = (X3.g) bVar2.f50p;
        int i7 = WorkDatabase.f9850k;
        if (z6) {
            iVar = new B3.i(applicationContext, null);
            iVar.f844g = true;
        } else {
            String[] strArr = k.f5637a;
            iVar = new B3.i(applicationContext, "androidx.work.workdb");
            iVar.f843f = new f(applicationContext, 0);
        }
        iVar.f841d = gVar;
        g gVar2 = new g();
        if (iVar.f840c == null) {
            iVar.f840c = new ArrayList();
        }
        iVar.f840c.add(gVar2);
        iVar.a(j.f5630a);
        iVar.a(new i(applicationContext, 2, 3));
        iVar.a(j.f5631b);
        iVar.a(j.f5632c);
        iVar.a(new i(applicationContext, 5, 6));
        iVar.a(j.f5633d);
        iVar.a(j.f5634e);
        iVar.a(j.f5635f);
        iVar.a(new i(applicationContext));
        iVar.a(new i(applicationContext, 10, 11));
        iVar.a(j.f5636g);
        iVar.h = false;
        iVar.f845i = true;
        Context context2 = iVar.f839b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = iVar.f841d;
        if (executor2 == null && iVar.f842e == null) {
            A3.d dVar = C1380a.f15599c;
            iVar.f842e = dVar;
            iVar.f841d = dVar;
        } else if (executor2 != null && iVar.f842e == null) {
            iVar.f842e = executor2;
        } else if (executor2 == null && (executor = iVar.f842e) != null) {
            iVar.f841d = executor;
        }
        if (iVar.f843f == null) {
            iVar.f843f = new x0(14);
        }
        H3.a aVar = iVar.f843f;
        ArrayList arrayList = iVar.f840c;
        boolean z7 = iVar.f844g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i8 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = iVar.f841d;
        B3.a aVar2 = new B3.a(context2, iVar.f838a, aVar, iVar.f846j, arrayList, z7, i8, executor3, iVar.f842e, iVar.h, iVar.f845i);
        int i9 = i8;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str2 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str2;
            } else {
                str = name + "." + str2;
            }
            B3.k kVar = (B3.k) Class.forName(str).newInstance();
            H3.b bVarE = kVar.e(aVar2);
            kVar.f851c = bVarE;
            if (bVarE instanceof n) {
                ((n) bVarE).getClass();
            }
            boolean z8 = i9 == 3;
            bVarE.setWriteAheadLoggingEnabled(z8);
            kVar.f855g = arrayList;
            kVar.f850b = executor3;
            new ArrayDeque();
            kVar.f853e = z7;
            kVar.f854f = z8;
            WorkDatabase workDatabase = (WorkDatabase) kVar;
            Context applicationContext2 = context.getApplicationContext();
            p pVar = new p(bVar.f5115f);
            synchronized (p.class) {
                p.f5143p = pVar;
            }
            int i10 = d.f5618a;
            R3.b bVar3 = new R3.b(applicationContext2, this);
            X3.e.a(applicationContext2, SystemJobService.class, true);
            p.d().b(new Throwable[0]);
            List listAsList = Arrays.asList(bVar3, new P3.b(applicationContext2, bVar, bVar2, this));
            b bVar4 = new b(context, bVar, bVar2, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.f5640c = applicationContext3;
            this.f5641d = bVar;
            this.f5643f = bVar2;
            this.f5642e = workDatabase;
            this.f5644g = listAsList;
            this.h = bVar4;
            this.f5645i = new X3.d(workDatabase);
            this.f5646j = false;
            if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f5643f.Q(new X3.c(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static l k0() {
        synchronized (f5639n) {
            try {
                l lVar = l;
                if (lVar != null) {
                    return lVar;
                }
                return f5638m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static l l0(Context context) {
        l lVarK0;
        synchronized (f5639n) {
            try {
                lVarK0 = k0();
                if (lVarK0 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVarK0;
    }

    public final void m0() {
        synchronized (f5639n) {
            try {
                this.f5646j = true;
                BroadcastReceiver.PendingResult pendingResult = this.f5647k;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f5647k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n0() {
        ArrayList arrayListD;
        WorkDatabase workDatabase = this.f5642e;
        Context context = this.f5640c;
        int i7 = R3.b.f6667s;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListD = R3.b.d(context, jobScheduler)) != null && !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                R3.b.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        W3.j jVarN = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = jVarN.f7821a;
        workDatabase_Impl.b();
        W3.e eVar = jVarN.f7828i;
        I3.f fVarA = eVar.a();
        workDatabase_Impl.c();
        try {
            fVarA.f3487r.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(fVarA);
            d.a(this.f5641d, workDatabase, this.f5644g);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            eVar.c(fVarA);
            throw th;
        }
    }

    public final void o0(String str, z zVar) {
        A0.b bVar = this.f5643f;
        C1.p pVar = new C1.p(5);
        pVar.f970p = this;
        pVar.f971q = str;
        pVar.f972r = zVar;
        bVar.Q(pVar);
    }
}
