package H2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4.i f2979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f2981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0205w f2982s;

    public /* synthetic */ C(D4.i iVar, E e7, r rVar, C0205w c0205w, int i7) {
        this.f2978o = i7;
        this.f2979p = iVar;
        this.f2980q = e7;
        this.f2981r = rVar;
        this.f2982s = c0205w;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [H2.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [H2.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [H2.E, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2978o) {
            case 0:
                D4.i iVar = this.f2979p;
                int i7 = iVar.f1582p;
                this.f2980q.u(i7, (A) iVar.f1583q, this.f2981r, this.f2982s);
                break;
            case 1:
                D4.i iVar2 = this.f2979p;
                int i8 = iVar2.f1582p;
                this.f2980q.I(i8, (A) iVar2.f1583q, this.f2981r, this.f2982s);
                break;
            default:
                D4.i iVar3 = this.f2979p;
                int i9 = iVar3.f1582p;
                this.f2980q.Q(i9, (A) iVar3.f1583q, this.f2981r, this.f2982s);
                break;
        }
    }
}
