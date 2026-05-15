package X3;

import N3.u;
import N3.v;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: o */
    public final V.o f8267o = new V.o(23, (byte) 0);

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f8268p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ O3.l f8269q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f8270r;

    public a(O3.l lVar, Object obj, int i7) {
        this.f8268p = i7;
        this.f8269q = lVar;
        this.f8270r = obj;
    }

    public static void a(O3.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f5642e;
        W3.j jVarN = workDatabase.n();
        V1.a aVarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            v vVarH = jVarN.h(str2);
            if (vVarH != v.f5152q && vVarH != v.f5153r) {
                jVarN.q(v.f5155t, str2);
            }
            linkedList.addAll(aVarI.y(str2));
        }
        O3.b bVar = lVar.h;
        synchronized (bVar.f5617y) {
            try {
                N3.p pVarD = N3.p.d();
                int i7 = O3.b.f5606z;
                pVarD.b(new Throwable[0]);
                bVar.f5615w.add(str);
                O3.m mVar = (O3.m) bVar.f5612t.remove(str);
                boolean z6 = mVar != null;
                if (mVar == null) {
                    mVar = (O3.m) bVar.f5613u.remove(str);
                }
                O3.b.c(str, mVar);
                if (z6) {
                    bVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = lVar.f5644g.iterator();
        while (it.hasNext()) {
            ((O3.c) it.next()).b(str);
        }
    }

    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f8268p) {
            case 0:
                O3.l lVar = this.f8269q;
                workDatabase = lVar.f5642e;
                workDatabase.c();
                try {
                    a(lVar, ((UUID) this.f8270r).toString());
                    workDatabase.h();
                    workDatabase.f();
                    O3.d.a(lVar.f5641d, lVar.f5642e, lVar.f5644g);
                    return;
                } finally {
                    workDatabase.f();
                }
            default:
                O3.l lVar2 = this.f8269q;
                workDatabase = lVar2.f5642e;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().i((String) this.f8270r).iterator();
                    while (it.hasNext()) {
                        a(lVar2, (String) it.next());
                    }
                    workDatabase.h();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        V.o oVar = this.f8267o;
        try {
            b();
            oVar.J(u.f5149g);
        } catch (Throwable th) {
            oVar.J(new N3.r(th));
        }
    }
}
