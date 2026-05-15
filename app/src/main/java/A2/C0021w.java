package A2;

import w3.r1;

/* JADX INFO: renamed from: A2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0021w implements w2.g, w2.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f463q;

    public /* synthetic */ C0021w(int i7, int i8, int i9) {
        this.f461o = i9;
        this.f462p = i7;
        this.f463q = i8;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f461o) {
            case 0:
                v3.L(this.f462p, this.f463q);
                break;
            default:
                v3.L(this.f462p, this.f463q);
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        r1 r1Var = (r1) obj;
        switch (this.f461o) {
            case 2:
                r1Var.b0(this.f462p, this.f463q);
                break;
            default:
                r1Var.g0(this.f462p, this.f463q);
                break;
        }
    }
}
