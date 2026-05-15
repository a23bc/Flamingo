package A2;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ V.o f304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Pair f305q;

    public /* synthetic */ h0(V.o oVar, Pair pair, int i7) {
        this.f303o = i7;
        this.f304p = oVar;
        this.f305q = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f303o) {
            case 0:
                B2.i iVar = ((n0) this.f304p.f7343q).h;
                Pair pair = this.f305q;
                iVar.T(((Integer) pair.first).intValue(), (H2.A) pair.second);
                break;
            case 1:
                B2.i iVar2 = ((n0) this.f304p.f7343q).h;
                Pair pair2 = this.f305q;
                iVar2.B(((Integer) pair2.first).intValue(), (H2.A) pair2.second);
                break;
            default:
                B2.i iVar3 = ((n0) this.f304p.f7343q).h;
                Pair pair3 = this.f305q;
                iVar3.k(((Integer) pair3.first).intValue(), (H2.A) pair3.second);
                break;
        }
    }
}
