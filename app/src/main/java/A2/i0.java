package A2;

import H2.C0205w;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ V.o f312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Pair f313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H2.r f314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0205w f315s;

    public /* synthetic */ i0(V.o oVar, Pair pair, H2.r rVar, C0205w c0205w, int i7) {
        this.f311o = i7;
        this.f312p = oVar;
        this.f313q = pair;
        this.f314r = rVar;
        this.f315s = c0205w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f311o) {
            case 0:
                B2.i iVar = ((n0) this.f312p.f7343q).h;
                Pair pair = this.f313q;
                iVar.Q(((Integer) pair.first).intValue(), (H2.A) pair.second, this.f314r, this.f315s);
                break;
            case 1:
                B2.i iVar2 = ((n0) this.f312p.f7343q).h;
                Pair pair2 = this.f313q;
                iVar2.u(((Integer) pair2.first).intValue(), (H2.A) pair2.second, this.f314r, this.f315s);
                break;
            default:
                B2.i iVar3 = ((n0) this.f312p.f7343q).h;
                Pair pair3 = this.f313q;
                iVar3.I(((Integer) pair3.first).intValue(), (H2.A) pair3.second, this.f314r, this.f315s);
                break;
        }
    }
}
