package A2;

import w3.r1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements w2.g, w2.c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f64o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f65p;

    public /* synthetic */ A(int i7, int i8) {
        this.f64o = i8;
        this.f65p = i7;
    }

    @Override // w2.g
    public void b(Object obj) {
        switch (this.f64o) {
            case 0:
                ((t2.V) obj).c(this.f65p);
                break;
            case 1:
                B2.n nVar = (B2.n) obj;
                nVar.getClass();
                int i7 = this.f65p;
                if (i7 == 1) {
                    nVar.f800u = true;
                }
                nVar.f791k = i7;
                break;
            default:
                ((t2.V) obj).c(this.f65p);
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        r1 r1Var = (r1) obj;
        switch (this.f64o) {
            case 3:
                r1Var.G(this.f65p);
                break;
            case 4:
                r1Var.d0(this.f65p);
                break;
            case 5:
                r1Var.f(this.f65p);
                break;
            default:
                r1Var.v0(this.f65p);
                break;
        }
    }

    public /* synthetic */ A(B2.a aVar, int i7, t2.W w7, t2.W w8) {
        this.f64o = 1;
        this.f65p = i7;
    }
}
