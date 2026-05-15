package O0;

import f0.AbstractC0918w;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f5476p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ A0 f5477q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(A0 a0, int i7) {
        super(2);
        this.f5476p = i7;
        this.f5477q = a0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5476p) {
            case 0:
                this.f5477q.a().f5356p = (AbstractC0918w) obj2;
                break;
            case 1:
                S sA = this.f5477q.a();
                ((Q0.K) obj).c0(new N(sA, (l5.e) obj2, sA.f5354D));
                break;
            default:
                Q0.K k7 = (Q0.K) obj;
                S s7 = k7.f5823V;
                A0 a0 = this.f5477q;
                if (s7 == null) {
                    s7 = new S(k7, a0.f5278a);
                    k7.f5823V = s7;
                }
                a0.f5279b = s7;
                a0.a().c();
                S sA2 = a0.a();
                D0 d02 = sA2.f5357q;
                D0 d03 = a0.f5278a;
                if (d02 != d03) {
                    sA2.f5357q = d03;
                    sA2.d(false);
                    Q0.K.V(sA2.f5355o, false, 7);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
