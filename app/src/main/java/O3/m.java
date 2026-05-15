package O3;

import I4.y;
import N3.n;
import N3.o;
import N3.p;
import N3.v;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f5648G = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public V1.a f5649A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f5650B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f5651C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Y3.j f5652D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public y f5653E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile boolean f5654F;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f5655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f5656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f5657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W3.i f5658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ListenableWorker f5659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public A0.b f5660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o f5661u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public N3.b f5662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f5663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WorkDatabase f5664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public W3.j f5665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public V1.a f5666z;

    static {
        p.i("WorkerWrapper");
    }

    public final void a(o oVar) {
        if (!(oVar instanceof n)) {
            if (oVar instanceof N3.m) {
                p.d().h(new Throwable[0]);
                d();
                return;
            }
            p.d().h(new Throwable[0]);
            if (this.f5658r.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        p.d().h(new Throwable[0]);
        if (this.f5658r.c()) {
            e();
            return;
        }
        V1.a aVar = this.f5666z;
        String str = this.f5656p;
        W3.j jVar = this.f5665y;
        WorkDatabase workDatabase = this.f5664x;
        workDatabase.c();
        try {
            jVar.q(v.f5152q, str);
            jVar.o(str, ((n) this.f5661u).f5142a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str2 : aVar.y(str)) {
                if (jVar.h(str2) == v.f5154s) {
                    B3.m mVarB = B3.m.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str2 == null) {
                        mVarB.h(1);
                    } else {
                        mVarB.i(1, str2);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVar.f7389o;
                    workDatabase_Impl.b();
                    Cursor cursorG = workDatabase_Impl.g(mVarB);
                    try {
                        if (cursorG.moveToFirst() && cursorG.getInt(0) != 0) {
                            p.d().h(new Throwable[0]);
                            jVar.q(v.f5150o, str2);
                            jVar.p(str2, jCurrentTimeMillis);
                        }
                    } finally {
                        cursorG.close();
                        mVarB.j();
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            f(false);
        } catch (Throwable th) {
            workDatabase.f();
            f(false);
            throw th;
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            W3.j jVar = this.f5665y;
            if (jVar.h(str2) != v.f5155t) {
                jVar.q(v.f5153r, str2);
            }
            linkedList.addAll(this.f5666z.y(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.f5656p;
        WorkDatabase workDatabase = this.f5664x;
        if (!zI) {
            workDatabase.c();
            try {
                v vVarH = this.f5665y.h(str);
                A0.b bVarM = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) bVarM.f50p;
                workDatabase_Impl.b();
                W3.e eVar = (W3.e) bVarM.f51q;
                I3.f fVarA = eVar.a();
                if (str == null) {
                    fVarA.g(1);
                } else {
                    fVarA.h(1, str);
                }
                workDatabase_Impl.c();
                try {
                    fVarA.r();
                    workDatabase_Impl.h();
                    if (vVarH == null) {
                        f(false);
                    } else if (vVarH == v.f5151p) {
                        a(this.f5661u);
                    } else if (!vVarH.a()) {
                        d();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.f5657q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(str);
            }
            d.a(this.f5662v, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f5656p;
        W3.j jVar = this.f5665y;
        WorkDatabase workDatabase = this.f5664x;
        workDatabase.c();
        try {
            jVar.q(v.f5150o, str);
            jVar.p(str, System.currentTimeMillis());
            jVar.m(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f5656p;
        W3.j jVar = this.f5665y;
        WorkDatabase workDatabase = this.f5664x;
        workDatabase.c();
        try {
            jVar.p(str, System.currentTimeMillis());
            jVar.q(v.f5150o, str);
            jVar.n(str);
            jVar.m(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r5) {
        /*
            r4 = this;
            androidx.work.impl.WorkDatabase r0 = r4.f5664x
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r4.f5664x     // Catch: java.lang.Throwable -> L3f
            W3.j r0 = r0.n()     // Catch: java.lang.Throwable -> L3f
            r0.getClass()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            B3.m r1 = B3.m.b(r2, r1)     // Catch: java.lang.Throwable -> L3f
            androidx.work.impl.WorkDatabase_Impl r0 = r0.f7821a     // Catch: java.lang.Throwable -> L3f
            r0.b()     // Catch: java.lang.Throwable -> L3f
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L3f
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2e
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2e
            r3 = 1
            goto L2f
        L2c:
            r5 = move-exception
            goto L8f
        L2e:
            r3 = r2
        L2f:
            r0.close()     // Catch: java.lang.Throwable -> L3f
            r1.j()     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L41
            android.content.Context r0 = r4.f5655o     // Catch: java.lang.Throwable -> L3f
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            X3.e.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r5 = move-exception
            goto L96
        L41:
            if (r5 == 0) goto L59
            W3.j r0 = r4.f5665y     // Catch: java.lang.Throwable -> L3f
            N3.v r1 = N3.v.f5150o     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r4.f5656p     // Catch: java.lang.Throwable -> L3f
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3f
            r0.q(r1, r2)     // Catch: java.lang.Throwable -> L3f
            W3.j r0 = r4.f5665y     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r4.f5656p     // Catch: java.lang.Throwable -> L3f
            r2 = -1
            r0.m(r1, r2)     // Catch: java.lang.Throwable -> L3f
        L59:
            W3.i r0 = r4.f5658r     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L7b
            androidx.work.ListenableWorker r0 = r4.f5659s     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L7b
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L7b
            O3.b r0 = r4.f5663w     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r4.f5656p     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r0.f5617y     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3f
            java.util.HashMap r3 = r0.f5612t     // Catch: java.lang.Throwable -> L78
            r3.remove(r1)     // Catch: java.lang.Throwable -> L78
            r0.i()     // Catch: java.lang.Throwable -> L78
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L78
            goto L7b
        L78:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L78
            throw r5     // Catch: java.lang.Throwable -> L3f
        L7b:
            androidx.work.impl.WorkDatabase r0 = r4.f5664x     // Catch: java.lang.Throwable -> L3f
            r0.h()     // Catch: java.lang.Throwable -> L3f
            androidx.work.impl.WorkDatabase r0 = r4.f5664x
            r0.f()
            Y3.j r0 = r4.f5652D
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.j(r5)
            return
        L8f:
            r0.close()     // Catch: java.lang.Throwable -> L3f
            r1.j()     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L3f
        L96:
            androidx.work.impl.WorkDatabase r0 = r4.f5664x
            r0.f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.m.f(boolean):void");
    }

    public final void g() {
        v vVarH = this.f5665y.h(this.f5656p);
        if (vVarH == v.f5151p) {
            p.d().b(new Throwable[0]);
            f(true);
        } else {
            p pVarD = p.d();
            Objects.toString(vVarH);
            pVarD.b(new Throwable[0]);
            f(false);
        }
    }

    public final void h() {
        String str = this.f5656p;
        WorkDatabase workDatabase = this.f5664x;
        workDatabase.c();
        try {
            b(str);
            this.f5665y.o(str, ((N3.l) this.f5661u).f5141a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f5654F) {
            return false;
        }
        p.d().b(new Throwable[0]);
        if (this.f5665y.h(this.f5656p) == null) {
            f(false);
            return true;
        }
        f(!r0.a());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: all -> 0x0069, TryCatch #2 {all -> 0x0069, blocks: (B:14:0x004e, B:16:0x0056, B:21:0x006c, B:24:0x0072, B:27:0x0089, B:29:0x008f, B:31:0x0095, B:44:0x00cc, B:36:0x009e, B:39:0x00ad, B:41:0x00b5), top: B:102:0x004e }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.m.run():void");
    }
}
