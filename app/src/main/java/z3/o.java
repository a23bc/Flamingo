package z3;

import O0.Q;
import R0.D0;
import f0.C0912t;
import f0.InterfaceC0878b0;
import j5.AbstractC1107a;
import java.util.List;
import java.util.ListIterator;
import m5.AbstractC1210l;
import o0.C1249f;
import v.C1614k;
import y3.C2019h;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1210l implements l5.g {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ g f21159p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1249f f21160q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC0878b0 f21161r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g gVar, C1249f c1249f, InterfaceC0878b0 interfaceC0878b0) {
        super(4);
        this.f21159p = gVar;
        this.f21160q = c1249f;
        this.f21161r = interfaceC0878b0;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        C1614k c1614k = (C1614k) obj;
        C2019h c2019h = (C2019h) obj2;
        C0912t c0912t = (C0912t) obj3;
        n1.c.B((Number) obj4, c1614k, "$this$AnimatedContent", c2019h, "it");
        List list = ((Boolean) c0912t.j(D0.f6266a)).booleanValue() ? (List) ((J) this.f21159p.b().f20426e.f21324o).getValue() : (List) this.f21161r.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (c2019h.equals((C2019h) objPrevious)) {
                break;
            }
        }
        C2019h c2019h2 = (C2019h) objPrevious;
        if (c2019h2 != null) {
            AbstractC1107a.c(c2019h2, this.f21160q, n0.e.b(c0912t, 1664366755, new Q(c2019h2, 14, c1614k)), c0912t, 456);
        }
        return Y4.o.f8736a;
    }
}
