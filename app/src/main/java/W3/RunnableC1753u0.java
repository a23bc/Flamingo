package w3;

import android.os.RemoteException;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.u0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1753u0 implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19367o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ A0 f19368p;

    public /* synthetic */ RunnableC1753u0(A0 a0, int i7) {
        this.f19367o = i7;
        this.f19368p = a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19367o) {
            case 0:
                A0 a0 = this.f19368p;
                b6.u uVar = a0.f18916u;
                if (uVar != null) {
                    a0.f18914s.J0(uVar);
                    return;
                }
                return;
            case 1:
                A0 a02 = this.f19368p;
                synchronized (a02.f18898a) {
                    try {
                        if (a02.f18919x) {
                            return;
                        }
                        final y1 y1VarE1 = a02.f18914s.e1();
                        if (!a02.f18900c.hasMessages(1) && k1.d(y1VarE1, a02.f18913r.f19291c)) {
                            U3.h hVar = a02.f18904g.f19226e;
                            E4.I iR = hVar.R();
                            for (int i7 = 0; i7 < iR.size(); i7++) {
                                final C1747r0 c1747r0 = (C1747r0) iR.get(i7);
                                final boolean zA0 = hVar.a0(c1747r0, 16);
                                final boolean zA02 = hVar.a0(c1747r0, 17);
                                a02.b(c1747r0, new InterfaceC1763z0() { // from class: w3.v0
                                    @Override // w3.InterfaceC1763z0
                                    public final void e(InterfaceC1746q0 interfaceC1746q0, int i8) {
                                        interfaceC1746q0.j(i8, y1VarE1, zA0, zA02, c1747r0.f19338c);
                                    }
                                });
                            }
                            try {
                                a02.h.f19003i.j(0, y1VarE1, true, true, 0);
                            } catch (RemoteException e7) {
                                AbstractC1697a.n("Exception in using media1 API", e7);
                            }
                            break;
                        }
                        a02.s();
                        return;
                    } finally {
                    }
                }
            case 2:
                this.f19368p.s();
                return;
            default:
                A0 a03 = this.f19368p;
                k.I i8 = a03.f18917v;
                if (i8 != null) {
                    ((N0) i8.f13847p).g(a03.f18907k, false);
                    return;
                }
                return;
        }
    }
}
