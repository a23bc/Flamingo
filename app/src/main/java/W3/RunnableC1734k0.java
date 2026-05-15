package w3;

import A2.C0001b;
import android.util.SparseBooleanArray;
import k.C1116d;
import t2.C1485n;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1734k0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19235o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f19236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f19237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f19238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f19239s;

    public /* synthetic */ RunnableC1734k0(C0001b c0001b, C1749s0 c1749s0, boolean z6, C1747r0 c1747r0) {
        this.f19237q = c0001b;
        this.f19238r = c1749s0;
        this.f19236p = z6;
        this.f19239s = c1747r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19235o) {
            case 0:
                ((C1116d) this.f19237q).d((C1751t0) this.f19238r, (C1.k) this.f19239s, this.f19236p);
                break;
            default:
                K0 k02 = (K0) ((C0001b) this.f19237q).f224r;
                r1 r1Var = k02.f19002g.f18914s;
                k1.i(r1Var, (C1749s0) this.f19238r);
                int iD = r1Var.d();
                if (iD == 1) {
                    if (r1Var.K0(2)) {
                        r1Var.b();
                    }
                } else if (iD == 4 && r1Var.K0(4)) {
                    r1Var.S();
                }
                boolean z6 = this.f19236p;
                if (z6 && r1Var.K0(1)) {
                    r1Var.e();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i7 : new int[]{31, 2}) {
                    AbstractC1697a.i(!false);
                    sparseBooleanArray.append(i7, true);
                }
                if (z6) {
                    AbstractC1697a.i(!false);
                    sparseBooleanArray.append(1, true);
                }
                AbstractC1697a.i(true);
                k02.f19002g.o((C1747r0) this.f19239s, new t2.T(new C1485n(sparseBooleanArray)));
                break;
        }
    }

    public /* synthetic */ RunnableC1734k0(C1116d c1116d, C1751t0 c1751t0, C1.k kVar, boolean z6) {
        this.f19237q = c1116d;
        this.f19238r = c1751t0;
        this.f19239s = kVar;
        this.f19236p = z6;
    }
}
