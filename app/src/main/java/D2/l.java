package D2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f1523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1524q;

    public /* synthetic */ l(n nVar, o oVar, int i7) {
        this.f1522o = i7;
        this.f1523p = nVar;
        this.f1524q = oVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [D2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [D2.o, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1522o) {
            case 0:
                n nVar = this.f1523p;
                this.f1524q.k(nVar.f1527a, nVar.f1528b);
                break;
            case 1:
                n nVar2 = this.f1523p;
                this.f1524q.T(nVar2.f1527a, nVar2.f1528b);
                break;
            default:
                n nVar3 = this.f1523p;
                this.f1524q.B(nVar3.f1527a, nVar3.f1528b);
                break;
        }
    }
}
