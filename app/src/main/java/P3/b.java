package P3;

import I4.t;
import L2.C0247a;
import N3.p;
import N3.v;
import O3.c;
import O3.l;
import W3.i;
import X3.f;
import X3.h;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, S3.b, O3.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f5751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f5752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final S3.c f5753q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f5755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5756t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f5758v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashSet f5754r = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f5757u = new Object();

    static {
        p.i("GreedyScheduler");
    }

    public b(Context context, N3.b bVar, A0.b bVar2, l lVar) {
        this.f5751o = context;
        this.f5752p = lVar;
        this.f5753q = new S3.c(context, bVar2, this);
        this.f5755s = new a(this, bVar.f5114e);
    }

    @Override // O3.a
    public final void a(String str, boolean z6) {
        synchronized (this.f5757u) {
            try {
                Iterator it = this.f5754r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f7805a.equals(str)) {
                        p.d().b(new Throwable[0]);
                        this.f5754r.remove(iVar);
                        this.f5753q.c(this.f5754r);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O3.c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f5758v;
        l lVar = this.f5752p;
        if (bool == null) {
            this.f5758v = Boolean.valueOf(f.a(this.f5751o, lVar.f5641d));
        }
        if (!this.f5758v.booleanValue()) {
            p.d().h(new Throwable[0]);
            return;
        }
        if (!this.f5756t) {
            lVar.h.b(this);
            this.f5756t = true;
        }
        p.d().b(new Throwable[0]);
        a aVar = this.f5755s;
        if (aVar != null && (runnable = (Runnable) aVar.f5750c.remove(str)) != null) {
            ((Handler) aVar.f5749b.f4105p).removeCallbacks(runnable);
        }
        lVar.f5643f.Q(new h(lVar, str, false));
    }

    @Override // S3.b
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p.d().b(new Throwable[0]);
            l lVar = this.f5752p;
            lVar.f5643f.Q(new h(lVar, str, false));
        }
    }

    @Override // S3.b
    public final void d(List list) {
        for (String str : (ArrayList) list) {
            p.d().b(new Throwable[0]);
            this.f5752p.o0(str, null);
        }
    }

    @Override // O3.c
    public final boolean e() {
        return false;
    }

    @Override // O3.c
    public final void f(i... iVarArr) {
        if (this.f5758v == null) {
            this.f5758v = Boolean.valueOf(f.a(this.f5751o, this.f5752p.f5641d));
        }
        if (!this.f5758v.booleanValue()) {
            p.d().h(new Throwable[0]);
            return;
        }
        if (!this.f5756t) {
            this.f5752p.h.b(this);
            this.f5756t = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long jA = iVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iVar.f7806b == v.f5150o) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f5755s;
                    if (aVar != null) {
                        HashMap map = aVar.f5750c;
                        Runnable runnable = (Runnable) map.remove(iVar.f7805a);
                        C0247a c0247a = aVar.f5749b;
                        if (runnable != null) {
                            ((Handler) c0247a.f4105p).removeCallbacks(runnable);
                        }
                        t tVar = new t(5, aVar, iVar, false);
                        map.put(iVar.f7805a, tVar);
                        ((Handler) c0247a.f4105p).postDelayed(tVar, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    int i7 = Build.VERSION.SDK_INT;
                    N3.c cVar = iVar.f7813j;
                    if (cVar.f5120c) {
                        p pVarD = p.d();
                        iVar.toString();
                        pVarD.b(new Throwable[0]);
                    } else if (i7 < 24 || cVar.h.f5127a.size() <= 0) {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f7805a);
                    } else {
                        p pVarD2 = p.d();
                        iVar.toString();
                        pVarD2.b(new Throwable[0]);
                    }
                } else {
                    p.d().b(new Throwable[0]);
                    this.f5752p.o0(iVar.f7805a, null);
                }
            }
        }
        synchronized (this.f5757u) {
            try {
                if (!hashSet.isEmpty()) {
                    p pVarD3 = p.d();
                    TextUtils.join(",", hashSet2);
                    pVarD3.b(new Throwable[0]);
                    this.f5754r.addAll(hashSet);
                    this.f5753q.c(this.f5754r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
