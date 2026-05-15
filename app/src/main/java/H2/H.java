package H2;

import A2.x0;
import D2.C0088d;
import E4.AbstractC0119q;
import E4.C0122u;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import t2.C1468A;
import t2.C1470C;
import t2.C1492v;
import t2.C1494x;
import t2.C1496z;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0192i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t2.G f2996r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0184a[] f2997k;
    public final t2.h0[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f2998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x0 f2999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[][] f3001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0088d f3002q;

    static {
        C1492v c1492v = new C1492v();
        E4.G g6 = E4.I.f1870p;
        E4.b0 b0Var = E4.b0.f1913s;
        List list = Collections.EMPTY_LIST;
        E4.b0 b0Var2 = E4.b0.f1913s;
        C1496z c1496z = new C1496z();
        f2996r = new t2.G("MergingMediaSource", new C1494x(c1492v), null, new C1468A(c1496z), t2.J.f16263J, C1470C.f16192d);
    }

    public H(AbstractC0184a... abstractC0184aArr) {
        x0 x0Var = new x0(12);
        this.f2997k = abstractC0184aArr;
        this.f2999n = x0Var;
        this.f2998m = new ArrayList(Arrays.asList(abstractC0184aArr));
        this.f3000o = -1;
        this.l = new t2.h0[abstractC0184aArr.length];
        this.f3001p = new long[0][];
        new HashMap();
        AbstractC0119q.d(8, "expectedKeys");
        AbstractC0119q.d(2, "expectedValuesPerKey");
        C0122u c0122uB = C0122u.b();
        new E4.V();
        if (!c0122uB.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // H2.AbstractC0184a
    public final boolean a(t2.G g6) {
        AbstractC0184a[] abstractC0184aArr = this.f2997k;
        return abstractC0184aArr.length > 0 && abstractC0184aArr[0].a(g6);
    }

    @Override // H2.AbstractC0184a
    public final InterfaceC0207y b(A a4, K2.e eVar, long j3) {
        AbstractC0184a[] abstractC0184aArr = this.f2997k;
        int length = abstractC0184aArr.length;
        InterfaceC0207y[] interfaceC0207yArr = new InterfaceC0207y[length];
        t2.h0[] h0VarArr = this.l;
        int iB = h0VarArr[0].b(a4.f2973a);
        for (int i7 = 0; i7 < length; i7++) {
            interfaceC0207yArr[i7] = abstractC0184aArr[i7].b(a4.a(h0VarArr[i7].l(iB)), eVar, j3 - this.f3001p[iB][i7]);
        }
        return new G(this.f2999n, this.f3001p[iB], interfaceC0207yArr);
    }

    @Override // H2.AbstractC0184a
    public final t2.G h() {
        AbstractC0184a[] abstractC0184aArr = this.f2997k;
        return abstractC0184aArr.length > 0 ? abstractC0184aArr[0].h() : f2996r;
    }

    @Override // H2.AbstractC0192i, H2.AbstractC0184a
    public final void j() throws C0088d {
        C0088d c0088d = this.f3002q;
        if (c0088d != null) {
            throw c0088d;
        }
        super.j();
    }

    @Override // H2.AbstractC0184a
    public final void l(y2.C c7) {
        this.f3194j = c7;
        this.f3193i = w2.t.j(null);
        int i7 = 0;
        while (true) {
            AbstractC0184a[] abstractC0184aArr = this.f2997k;
            if (i7 >= abstractC0184aArr.length) {
                return;
            }
            x(Integer.valueOf(i7), abstractC0184aArr[i7]);
            i7++;
        }
    }

    @Override // H2.AbstractC0184a
    public final void n(InterfaceC0207y interfaceC0207y) {
        G g6 = (G) interfaceC0207y;
        int i7 = 0;
        while (true) {
            AbstractC0184a[] abstractC0184aArr = this.f2997k;
            if (i7 >= abstractC0184aArr.length) {
                return;
            }
            AbstractC0184a abstractC0184a = abstractC0184aArr[i7];
            InterfaceC0207y interfaceC0207y2 = g6.f2987o[i7];
            if (interfaceC0207y2 instanceof f0) {
                interfaceC0207y2 = ((f0) interfaceC0207y2).f3180o;
            }
            abstractC0184a.n(interfaceC0207y2);
            i7++;
        }
    }

    @Override // H2.AbstractC0192i, H2.AbstractC0184a
    public final void p() {
        super.p();
        Arrays.fill(this.l, (Object) null);
        this.f3000o = -1;
        this.f3002q = null;
        ArrayList arrayList = this.f2998m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f2997k);
    }

    @Override // H2.AbstractC0184a
    public final void s(t2.G g6) {
        this.f2997k[0].s(g6);
    }

    @Override // H2.AbstractC0192i
    public final A t(Object obj, A a4) {
        if (((Integer) obj).intValue() == 0) {
            return a4;
        }
        return null;
    }

    @Override // H2.AbstractC0192i
    public final void w(Object obj, AbstractC0184a abstractC0184a, t2.h0 h0Var) {
        Integer num = (Integer) obj;
        if (this.f3002q != null) {
            return;
        }
        if (this.f3000o == -1) {
            this.f3000o = h0Var.h();
        } else if (h0Var.h() != this.f3000o) {
            this.f3002q = new C0088d();
            return;
        }
        int length = this.f3001p.length;
        t2.h0[] h0VarArr = this.l;
        if (length == 0) {
            this.f3001p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f3000o, h0VarArr.length);
        }
        ArrayList arrayList = this.f2998m;
        arrayList.remove(abstractC0184a);
        h0VarArr[num.intValue()] = h0Var;
        if (arrayList.isEmpty()) {
            m(h0VarArr[0]);
        }
    }
}
