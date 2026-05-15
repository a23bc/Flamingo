package A2;

import w3.r1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements w2.g, w2.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f66o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f67p;

    public /* synthetic */ B(int i7, boolean z6) {
        this.f66o = i7;
        this.f67p = z6;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f66o) {
            case 0:
                v3.K(this.f67p);
                break;
            case 1:
                v3.r(this.f67p);
                break;
            default:
                v3.K(this.f67p);
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        r1 r1Var = (r1) obj;
        switch (this.f66o) {
            case 3:
                r1Var.p(this.f67p);
                break;
            case 4:
                r1Var.c0(this.f67p);
                break;
            default:
                r1Var.E(this.f67p);
                break;
        }
    }
}
