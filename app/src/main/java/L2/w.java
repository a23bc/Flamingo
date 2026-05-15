package L2;

import A2.C0008i;
import A2.K;
import A2.N;
import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ V.o f4232p;

    public /* synthetic */ w(V.o oVar, int i7, long j3) {
        this.f4231o = 1;
        this.f4232p = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V.o oVar = this.f4232p;
        int i7 = this.f4231o;
        oVar.getClass();
        switch (i7) {
            case 0:
                int i8 = w2.t.f18881a;
                B2.i iVar = ((K) ((y) oVar.f7343q)).f83a.f135s;
                iVar.Z(iVar.Y(), 1016, new B2.d(7));
                break;
            case 1:
                int i9 = w2.t.f18881a;
                B2.i iVar2 = ((K) ((y) oVar.f7343q)).f83a.f135s;
                iVar2.Z(iVar2.b((H2.A) iVar2.f758r.f753e), 1018, new A2.r(18));
                break;
            case 2:
                int i10 = w2.t.f18881a;
                B2.i iVar3 = ((K) ((y) oVar.f7343q)).f83a.f135s;
                iVar3.Z(iVar3.b((H2.A) iVar3.f758r.f753e), 1021, new A2.r(25));
                break;
            case 3:
                int i11 = w2.t.f18881a;
                B2.i iVar4 = ((K) ((y) oVar.f7343q)).f83a.f135s;
                iVar4.Z(iVar4.Y(), 1030, new A2.r(8));
                break;
            case 4:
                int i12 = w2.t.f18881a;
                N n7 = ((K) ((y) oVar.f7343q)).f83a;
                n7.getClass();
                B2.i iVar5 = n7.f135s;
                iVar5.Z(iVar5.Y(), 1015, new B2.d(4));
                break;
            case 5:
                int i13 = w2.t.f18881a;
                N n8 = ((K) ((y) oVar.f7343q)).f83a;
                n8.getClass();
                B2.i iVar6 = n8.f135s;
                iVar6.Z(iVar6.Y(), 1017, new A2.r(29));
                break;
            default:
                int i14 = w2.t.f18881a;
                B2.i iVar7 = ((K) ((y) oVar.f7343q)).f83a.f135s;
                iVar7.Z(iVar7.Y(), 1019, new A2.r(17));
                break;
        }
    }

    public /* synthetic */ w(V.o oVar, long j3, int i7) {
        this.f4231o = 2;
        this.f4232p = oVar;
    }

    public /* synthetic */ w(V.o oVar, Object obj, int i7) {
        this.f4231o = i7;
        this.f4232p = oVar;
    }

    public /* synthetic */ w(V.o oVar, String str, long j3, long j7) {
        this.f4231o = 0;
        this.f4232p = oVar;
    }

    public /* synthetic */ w(V.o oVar, C1487p c1487p, C0008i c0008i) {
        this.f4231o = 5;
        this.f4232p = oVar;
    }
}
