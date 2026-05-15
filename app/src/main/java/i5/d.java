package I5;

import A2.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final x0 h = new x0(15);

    /* JADX INFO: renamed from: i */
    public static final d f3554i;

    /* JADX INFO: renamed from: j */
    public static final Logger f3555j;

    /* JADX INFO: renamed from: a */
    public final A.b f3556a;

    /* JADX INFO: renamed from: c */
    public boolean f3558c;

    /* JADX INFO: renamed from: d */
    public long f3559d;

    /* JADX INFO: renamed from: b */
    public int f3557b = 10000;

    /* JADX INFO: renamed from: e */
    public final ArrayList f3560e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f3561f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final B3.c f3562g = new B3.c(1, this);

    static {
        String str = G5.b.f2770f + " TaskRunner";
        AbstractC1209k.f(str, "name");
        f3554i = new d(new A.b(new G5.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        AbstractC1209k.e(logger, "getLogger(TaskRunner::class.java.name)");
        f3555j = logger;
    }

    public d(A.b bVar) {
        this.f3556a = bVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = G5.b.f2765a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f3542a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j3) {
        byte[] bArr = G5.b.f2765a;
        c cVar = aVar.f3544c;
        AbstractC1209k.c(cVar);
        if (cVar.f3551d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z6 = cVar.f3553f;
        cVar.f3553f = false;
        cVar.f3551d = null;
        this.f3560e.remove(cVar);
        if (j3 != -1 && !z6 && !cVar.f3550c) {
            cVar.d(aVar, j3, true);
        }
        if (cVar.f3552e.isEmpty()) {
            return;
        }
        this.f3561f.add(cVar);
    }

    public final a c() {
        long j3;
        a aVar;
        boolean z6;
        byte[] bArr = G5.b.f2765a;
        while (true) {
            ArrayList arrayList = this.f3561f;
            if (arrayList.isEmpty()) {
                return null;
            }
            A.b bVar = this.f3556a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j3 = jNanoTime;
                    aVar = null;
                    z6 = false;
                    break;
                }
                a aVar3 = (a) ((c) it.next()).f3552e.get(0);
                j3 = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f3545d - j3);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z6 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j3;
            }
            ArrayList arrayList2 = this.f3560e;
            if (aVar2 != null) {
                byte[] bArr2 = G5.b.f2765a;
                aVar2.f3545d = -1L;
                c cVar = aVar2.f3544c;
                AbstractC1209k.c(cVar);
                cVar.f3552e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f3551d = aVar2;
                arrayList2.add(cVar);
                if (z6 || (!this.f3558c && !arrayList.isEmpty())) {
                    B3.c cVar2 = this.f3562g;
                    AbstractC1209k.f(cVar2, "runnable");
                    ((ThreadPoolExecutor) bVar.f3p).execute(cVar2);
                }
                return aVar2;
            }
            if (this.f3558c) {
                if (jMin >= this.f3559d - j3) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f3558c = true;
            this.f3559d = j3 + jMin;
            try {
                try {
                    long j7 = jMin / 1000000;
                    Long.signum(j7);
                    long j8 = jMin - (1000000 * j7);
                    if (j7 > 0 || jMin > 0) {
                        wait(j7, (int) j8);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar3 = (c) arrayList.get(size2);
                        cVar3.b();
                        if (cVar3.f3552e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f3558c = false;
            }
        }
    }

    public final void d(c cVar) {
        AbstractC1209k.f(cVar, "taskQueue");
        byte[] bArr = G5.b.f2765a;
        if (cVar.f3551d == null) {
            boolean zIsEmpty = cVar.f3552e.isEmpty();
            ArrayList arrayList = this.f3561f;
            if (zIsEmpty) {
                arrayList.remove(cVar);
            } else {
                AbstractC1209k.f(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z6 = this.f3558c;
        A.b bVar = this.f3556a;
        if (z6) {
            notify();
            return;
        }
        B3.c cVar2 = this.f3562g;
        AbstractC1209k.f(cVar2, "runnable");
        ((ThreadPoolExecutor) bVar.f3p).execute(cVar2);
    }

    public final c e() {
        int i7;
        synchronized (this) {
            i7 = this.f3557b;
            this.f3557b = i7 + 1;
        }
        return new c(this, n1.c.s(i7, "Q"));
    }
}
