package androidx.work.impl.background.systemjob;

import N2.z;
import N3.p;
import O3.a;
import O3.l;
import X3.h;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f9861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f9862p = new HashMap();

    static {
        p.i("SystemJobService");
    }

    @Override // O3.a
    public final void a(String str, boolean z6) {
        JobParameters jobParameters;
        p.d().b(new Throwable[0]);
        synchronized (this.f9862p) {
            jobParameters = (JobParameters) this.f9862p.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l lVarL0 = l.l0(getApplicationContext());
            this.f9861o = lVarL0;
            lVarL0.h.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            p.d().j(new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f9861o;
        if (lVar != null) {
            lVar.h.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f9861o == null) {
            p.d().b(new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        z zVar = null;
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            p.d().c(new Throwable[0]);
            return false;
        }
        synchronized (this.f9862p) {
            try {
                if (this.f9862p.containsKey(string)) {
                    p.d().b(new Throwable[0]);
                    return false;
                }
                p.d().b(new Throwable[0]);
                this.f9862p.put(string, jobParameters);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 24) {
                    zVar = new z(3);
                    if (jobParameters.getTriggeredContentUris() != null) {
                        Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i7 >= 28) {
                        jobParameters.getNetwork();
                    }
                }
                this.f9861o.o0(string, zVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f9861o == null) {
            p.d().b(new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            p.d().c(new Throwable[0]);
            return false;
        }
        p.d().b(new Throwable[0]);
        synchronized (this.f9862p) {
            this.f9862p.remove(string);
        }
        l lVar = this.f9861o;
        lVar.f5643f.Q(new h(lVar, string, false));
        return !this.f9861o.h.d(string);
    }
}
