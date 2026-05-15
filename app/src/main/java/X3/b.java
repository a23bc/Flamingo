package X3;

import N3.u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final O3.e f8271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V.o f8272p = new V.o(23, (byte) 0);

    static {
        N3.p.i("EnqueueRunnable");
    }

    public b(O3.e eVar) {
        this.f8271o = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(O3.e r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.b.a(O3.e):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        V.o oVar = this.f8272p;
        O3.e eVar = this.f8271o;
        try {
            eVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f5623g);
            HashSet hashSetC0 = O3.e.c0(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(eVar.f5623g);
                    z6 = false;
                    break;
                } else if (hashSetC0.contains((String) it.next())) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            O3.l lVar = eVar.f5619c;
            WorkDatabase workDatabase = lVar.f5642e;
            workDatabase.c();
            try {
                boolean zA = a(eVar);
                workDatabase.h();
                if (zA) {
                    e.a(lVar.f5640c, RescheduleReceiver.class, true);
                    O3.d.a(lVar.f5641d, lVar.f5642e, lVar.f5644g);
                }
                oVar.J(u.f5149g);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th) {
            oVar.J(new N3.r(th));
        }
    }
}
