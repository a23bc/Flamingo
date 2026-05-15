package L2;

import A2.I;
import A2.K;
import A2.N;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V.o f4233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f4235q;

    public /* synthetic */ x(V.o oVar, Object obj, long j3) {
        this.f4233o = oVar;
        this.f4234p = obj;
        this.f4235q = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V.o oVar = this.f4233o;
        oVar.getClass();
        int i7 = w2.t.f18881a;
        N n7 = ((K) ((y) oVar.f7343q)).f83a;
        B2.i iVar = n7.f135s;
        B2.a aVarY = iVar.Y();
        long j3 = this.f4235q;
        Object obj = this.f4234p;
        iVar.Z(aVarY, 26, new I(aVarY, obj, j3));
        if (n7.f105Q == obj) {
            n7.f129m.f(26, new A2.r(2));
        }
    }
}
