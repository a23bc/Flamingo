package R3;

import N3.p;
import N3.v;
import O3.c;
import O3.l;
import W3.i;
import X3.d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f6667s = 0;

    /* JADX INFO: renamed from: o */
    public final Context f6668o;

    /* JADX INFO: renamed from: p */
    public final JobScheduler f6669p;

    /* JADX INFO: renamed from: q */
    public final l f6670q;

    /* JADX INFO: renamed from: r */
    public final a f6671r;

    static {
        p.i("SystemJobScheduler");
    }

    public b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f6668o = context;
        this.f6670q = lVar;
        this.f6669p = jobScheduler;
        this.f6671r = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            p pVarD = p.d();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7));
            pVarD.c(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList c(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = d(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L31
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L31
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r2 = r6
        L32:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.c(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            p.d().c(th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // O3.c
    public final void b(String str) {
        Context context = this.f6668o;
        JobScheduler jobScheduler = this.f6669p;
        ArrayList arrayListC = c(context, jobScheduler, str);
        if (arrayListC == null || arrayListC.isEmpty()) {
            return;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f6670q.f5642e.k().k0(str);
    }

    @Override // O3.c
    public final boolean e() {
        return true;
    }

    @Override // O3.c
    public final void f(i... iVarArr) {
        int iA;
        ArrayList arrayListC;
        int iA2;
        l lVar = this.f6670q;
        WorkDatabase workDatabase = lVar.f5642e;
        d dVar = new d(workDatabase);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i iVarJ = workDatabase.n().j(iVar.f7805a);
                if (iVarJ == null) {
                    p.d().j(new Throwable[0]);
                    workDatabase.h();
                } else if (iVarJ.f7806b != v.f5150o) {
                    p.d().j(new Throwable[0]);
                    workDatabase.h();
                } else {
                    W3.d dVarX = workDatabase.k().X(iVar.f7805a);
                    if (dVarX != null) {
                        iA = dVarX.f7792b;
                    } else {
                        lVar.f5641d.getClass();
                        iA = dVar.a(lVar.f5641d.f5116g);
                    }
                    if (dVarX == null) {
                        lVar.f5642e.k().a0(new W3.d(iVar.f7805a, iA));
                    }
                    g(iVar, iA);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListC = c(this.f6668o, this.f6669p, iVar.f7805a)) != null) {
                        int iIndexOf = arrayListC.indexOf(Integer.valueOf(iA));
                        if (iIndexOf >= 0) {
                            arrayListC.remove(iIndexOf);
                        }
                        if (arrayListC.isEmpty()) {
                            lVar.f5641d.getClass();
                            iA2 = dVar.a(lVar.f5641d.f5116g);
                        } else {
                            iA2 = ((Integer) arrayListC.get(0)).intValue();
                        }
                        g(iVar, iA2);
                    }
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0071, code lost:
    
        if (r10 < 26) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(W3.i r19, int r20) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.g(W3.i, int):void");
    }
}
