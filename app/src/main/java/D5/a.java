package D5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1591w = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f1592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1220v f1593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f1594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1598u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f1599v;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i7) {
        this.f1599v = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f1592o = new m();
        this.f1593p = new C1220v();
        this.f1594q = b.f1603r;
        this.nextParkedWorker = c.f1609y;
        int iNanoTime = (int) System.nanoTime();
        this.f1597t = iNanoTime == 0 ? 42 : iNanoTime;
        f(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r13 = D5.m.f1635d.get(r3);
        r0 = D5.m.f1634c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r13 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (D5.m.f1636e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final D5.i a(boolean r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.a(boolean):D5.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i8 = this.f1597t;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f1597t = i11;
        int i12 = i7 - 1;
        return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f1599v;
        if (iD == 0) {
            i iVar = (i) cVar.f1614s.d();
            return iVar != null ? iVar : (i) cVar.f1615t.d();
        }
        i iVar2 = (i) cVar.f1615t.d();
        return iVar2 != null ? iVar2 : (i) cVar.f1614s.d();
    }

    public final void f(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1599v.f1613r);
        sb.append("-worker-");
        sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f1594q;
        boolean z6 = bVar2 == b.f1600o;
        if (z6) {
            c.f1607w.addAndGet(this.f1599v, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f1594q = bVar;
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final D5.i i(int r26) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.i(int):D5.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.run():void");
    }
}
