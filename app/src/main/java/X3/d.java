package X3;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f8277a;

    public /* synthetic */ d(WorkDatabase workDatabase) {
        this.f8277a = workDatabase;
    }

    public int a(int i7) {
        WorkDatabase workDatabase;
        int i8;
        synchronized (d.class) {
            try {
                workDatabase = this.f8277a;
                workDatabase.c();
                Long lZ = workDatabase.j().z("next_job_scheduler_id");
                i8 = 0;
                int iIntValue = lZ != null ? lZ.intValue() : 0;
                workDatabase.j().G(new W3.c("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
                if (iIntValue < 0 || iIntValue > i7) {
                    this.f8277a.j().G(new W3.c("next_job_scheduler_id", 1));
                } else {
                    i8 = iIntValue;
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i8;
    }
}
