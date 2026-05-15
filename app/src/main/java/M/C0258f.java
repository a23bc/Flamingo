package M;

import X.Q0;
import X.R0;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1182c;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: M.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0258f implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0258f f4549p = new C0258f(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0258f f4550q = new C0258f(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4551o;

    public /* synthetic */ C0258f(int i7) {
        this.f4551o = i7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f4551o) {
            case 0:
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) obj;
                C0912t c0912t = (C0912t) obj2;
                ((Number) obj3).intValue();
                c0912t.X(-2126899193);
                long j3 = ((Q0) c0912t.j(R0.f7988a)).f7986a;
                C1395m c1395m = C1395m.f15634a;
                boolean zE = c0912t.e(j3);
                Object objK = c0912t.K();
                if (zE || objK == C0903o.f11850a) {
                    objK = new C0254d(j3, 0);
                    c0912t.i0(objK);
                }
                InterfaceC1398p interfaceC1398pF = interfaceC1398p.f(androidx.compose.ui.draw.a.b(c1395m, (InterfaceC1182c) objK));
                c0912t.p(false);
                return interfaceC1398pF;
            default:
                l5.e eVar = (l5.e) obj;
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0912t2.h(eVar) ? 4 : 2;
                }
                if (c0912t2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    eVar.invoke(c0912t2, Integer.valueOf(iIntValue & 14));
                } else {
                    c0912t2.Q();
                }
                return Y4.o.f8736a;
        }
    }
}
