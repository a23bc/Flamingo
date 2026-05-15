package E0;

import b2.C0645O;
import b2.W;
import i2.C1072g;
import i2.C1074i;
import l5.InterfaceC1180a;
import m5.AbstractC1207i;
import m5.AbstractC1210l;
import m5.C1219u;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f1668p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f1669q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i7, Object obj) {
        super(0);
        this.f1668p = i7;
        this.f1669q = obj;
    }

    private final Object e() {
        R1.d dVarA;
        W w7 = (W) this.f1669q;
        w7.getClass();
        C0645O c0645o = W.f10124d;
        synchronized (c0645o) {
            dVarA = W.f10126f;
            if (dVarA == null) {
                dVarA = C0645O.a(c0645o, w7.f10128a);
                W.f10126f = dVarA;
            }
        }
        return dVarA;
    }

    private final Object f() {
        C1074i c1074i = (C1074i) this.f1669q;
        c1074i.getClass();
        long jNanoTime = System.nanoTime();
        C1219u c1219u = new C1219u();
        C1219u c1219u2 = new C1219u();
        synchronized (c1074i.f13380q) {
            c1219u.f14438o = jNanoTime - c1074i.f13382s;
            c1219u2.f14438o = 1000000000 / ((long) c1074i.f13381r);
        }
        AbstractC1767D.t(c1074i.f13378o, null, new C1072g(c1219u, c1219u2, c1074i, jNanoTime, null), 3);
        return Y4.o.f8736a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:531:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v96, types: [l5.a, m5.i] */
    /* JADX WARN: Type inference failed for: r2v10, types: [l5.a, m5.l] */
    @Override // l5.InterfaceC1180a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.K.a():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC1180a interfaceC1180a) {
        super(0);
        this.f1668p = 15;
        this.f1669q = (AbstractC1207i) interfaceC1180a;
    }
}
