package H2;

import A2.x0;
import d.C0746L;
import t2.C1495y;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC0208z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V1.a f3060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A2.I f3061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0.b f3062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f3063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3064e;

    public P(V1.a aVar, N2.p pVar) {
        A2.I i7 = new A2.I(9, pVar);
        A0.b bVar = new A0.b(2);
        x0 x0Var = new x0(17);
        this.f3060a = aVar;
        this.f3061b = i7;
        this.f3062c = bVar;
        this.f3063d = x0Var;
        this.f3064e = 1048576;
    }

    @Override // H2.InterfaceC0208z
    public final InterfaceC0208z a(boolean z6) {
        return this;
    }

    @Override // H2.InterfaceC0208z
    public final InterfaceC0208z b(C0746L c0746l) {
        return this;
    }

    @Override // H2.InterfaceC0208z
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Q c(t2.G g6) {
        D2.q qVar;
        g6.f16224b.getClass();
        V1.a aVar = this.f3060a;
        A2.I i7 = this.f3061b;
        A0.b bVar = this.f3062c;
        bVar.getClass();
        g6.f16224b.getClass();
        C1495y c1495y = g6.f16224b.f16187c;
        if (c1495y == null) {
            qVar = D2.q.f1531b;
        } else {
            synchronized (bVar.f50p) {
                try {
                    if (!c1495y.equals((C1495y) bVar.f51q)) {
                        bVar.f51q = c1495y;
                        bVar.f52r = A0.b.N(c1495y);
                    }
                    qVar = (D2.i) bVar.f52r;
                    qVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new Q(g6, aVar, i7, qVar, this.f3063d, this.f3064e);
    }
}
