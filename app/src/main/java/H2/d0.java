package H2;

import A2.x0;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import t2.C1468A;
import t2.C1469B;
import t2.C1470C;
import t2.C1486o;
import t2.C1487p;
import t2.C1492v;
import t2.C1494x;
import t2.C1495y;
import t2.C1496z;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends AbstractC0184a {
    public final y2.m h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V1.a f3161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1487p f3162j;
    public final x0 l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z f3165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t2.G f3166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y2.C f3167p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3163k = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3164m = true;

    public d0(t2.F f7, V1.a aVar, x0 x0Var) {
        C1469B c1469b;
        this.f3161i = aVar;
        this.l = x0Var;
        boolean z6 = true;
        C1492v c1492v = new C1492v();
        C2.I i7 = new C2.I(2);
        List list = Collections.EMPTY_LIST;
        E4.b0 b0Var = E4.b0.f1913s;
        C1496z c1496z = new C1496z();
        C1470C c1470c = C1470C.f16192d;
        Uri uri = Uri.EMPTY;
        String string = f7.f16211a.toString();
        string.getClass();
        E4.I iP = E4.I.p(E4.I.t(f7));
        if (((Uri) i7.f985e) != null && ((UUID) i7.f984d) == null) {
            z6 = false;
        }
        AbstractC1697a.i(z6);
        if (uri != null) {
            c1469b = new C1469B(uri, null, ((UUID) i7.f984d) != null ? new C1495y(i7) : null, null, list, null, iP, -9223372036854775807L);
        } else {
            c1469b = null;
        }
        t2.G g6 = new t2.G(string, new C1494x(c1492v), c1469b, new C1468A(c1496z), t2.J.f16263J, c1470c);
        this.f3166o = g6;
        C1486o c1486o = new C1486o();
        String str = f7.f16212b;
        c1486o.l = t2.M.j(str == null ? "text/x-unknown" : str);
        c1486o.f16620d = f7.f16213c;
        c1486o.f16621e = f7.f16214d;
        c1486o.f16622f = f7.f16215e;
        c1486o.f16618b = f7.f16216f;
        String str2 = f7.f16217g;
        c1486o.f16617a = str2 != null ? str2 : null;
        this.f3162j = new C1487p(c1486o);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = f7.f16211a;
        AbstractC1697a.k(uri2, "The uri must be set.");
        this.h = new y2.m(uri2, 1, null, map, 0L, -1L, null, 1);
        this.f3165n = new Z(-9223372036854775807L, true, false, g6);
    }

    @Override // H2.AbstractC0184a
    public final InterfaceC0207y b(A a4, K2.e eVar, long j3) {
        y2.C c7 = this.f3167p;
        D4.i iVar = new D4.i((CopyOnWriteArrayList) this.f3123c.f1584r, 0, a4);
        return new c0(this.h, this.f3161i, c7, this.f3162j, this.f3163k, this.l, iVar, this.f3164m);
    }

    @Override // H2.AbstractC0184a
    public final t2.G h() {
        return this.f3166o;
    }

    @Override // H2.AbstractC0184a
    public final void l(y2.C c7) {
        this.f3167p = c7;
        m(this.f3165n);
    }

    @Override // H2.AbstractC0184a
    public final void n(InterfaceC0207y interfaceC0207y) {
        K2.m mVar = ((c0) interfaceC0207y).f3154w;
        K2.j jVar = mVar.f4034b;
        if (jVar != null) {
            jVar.a(true);
        }
        mVar.f4033a.shutdown();
    }

    @Override // H2.AbstractC0184a
    public final void j() {
    }

    @Override // H2.AbstractC0184a
    public final void p() {
    }
}
