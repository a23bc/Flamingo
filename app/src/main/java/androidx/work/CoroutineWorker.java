package androidx.work;

import B3.c;
import B5.d;
import D5.e;
import I4.y;
import N3.f;
import N3.k;
import X3.g;
import Y3.j;
import android.content.Context;
import e5.AbstractC0865c;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import w5.AbstractC1805x;
import w5.C1792j0;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* JADX INFO: renamed from: t */
    public final C1792j0 f9834t;

    /* JADX INFO: renamed from: u */
    public final j f9835u;

    /* JADX INFO: renamed from: v */
    public final e f9836v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC1209k.f(context, "appContext");
        AbstractC1209k.f(workerParameters, "params");
        this.f9834t = AbstractC1767D.b();
        j jVar = new j();
        this.f9835u = jVar;
        jVar.b(new c(4, this), (g) this.f9838p.f9847e.f50p);
        this.f9836v = M.f19497a;
    }

    @Override // androidx.work.ListenableWorker
    public final y a() {
        C1792j0 c1792j0B = AbstractC1767D.b();
        AbstractC1805x abstractC1805xI = i();
        abstractC1805xI.getClass();
        d dVarA = AbstractC1767D.a(I0.c.L(abstractC1805xI, c1792j0B));
        k kVar = new k(c1792j0B);
        AbstractC1767D.t(dVarA, null, new f(kVar, this, null), 3);
        return kVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void e() {
        this.f9835u.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final j f() {
        AbstractC1805x abstractC1805xI = i();
        C1792j0 c1792j0 = this.f9834t;
        abstractC1805xI.getClass();
        AbstractC1767D.t(AbstractC1767D.a(I0.c.L(abstractC1805xI, c1792j0)), null, new N3.g(this, null), 3);
        return this.f9835u;
    }

    public abstract Object h(AbstractC0865c abstractC0865c);

    public AbstractC1805x i() {
        return this.f9836v;
    }
}
