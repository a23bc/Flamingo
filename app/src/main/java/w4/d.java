package w4;

import L2.C0247a;
import Z1.l;
import a.AbstractC0509a;
import f0.C0879c;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import i6.h;
import java.util.List;
import m5.AbstractC1209k;
import r1.x;
import s5.InterfaceC1438c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0878b0 {

    /* JADX INFO: renamed from: s */
    public static final Object f19447s = AbstractC0509a.N(Y4.f.f8723o, a.f19441u);

    /* JADX INFO: renamed from: o */
    public final C0247a f19448o;

    /* JADX INFO: renamed from: p */
    public final String f19449p;

    /* JADX INFO: renamed from: q */
    public final C0894j0 f19450q;

    /* JADX INFO: renamed from: r */
    public final Object f19451r;

    public d(C0247a c0247a, String str, List list) {
        AbstractC1209k.f(c0247a, "dataSaverInterface");
        this.f19448o = c0247a;
        this.f19449p = str;
        this.f19450q = C0879c.t(list);
        this.f19451r = AbstractC0509a.N(Y4.f.f8723o, new x(6, this));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Y4.e, java.lang.Object] */
    public final void b(List list) {
        C0894j0 c0894j0 = this.f19450q;
        List list2 = (List) c0894j0.getValue();
        c0894j0.setValue(list);
        if (h.w(list2, list)) {
            return;
        }
        Object obj = g.f19461a;
        if (obj.equals(obj)) {
            List list3 = (List) c0894j0.getValue();
            String strA = b.a(list3);
            StringBuilder sb = new StringBuilder("saveConvertedData(async: false): ");
            String str = this.f19449p;
            sb.append(str);
            sb.append(" -> ");
            sb.append(list3);
            sb.append("(as ");
            String strS = l.s(sb, strA, ')');
            ((c) f19447s.getValue()).getClass();
            AbstractC1209k.f(strS, "msg");
            this.f19448o.q(strA, str);
        }
    }

    public final List c(InterfaceC1438c interfaceC1438c) {
        AbstractC1209k.f(interfaceC1438c, "property");
        return (List) this.f19450q.getValue();
    }

    public final void d(InterfaceC1438c interfaceC1438c, List list) {
        AbstractC1209k.f(interfaceC1438c, "property");
        AbstractC1209k.f(list, "value");
        b(list);
    }

    @Override // f0.Z0
    public final Object getValue() {
        return (List) this.f19450q.getValue();
    }

    @Override // f0.InterfaceC0878b0
    public final void setValue(Object obj) {
        List list = (List) obj;
        AbstractC1209k.f(list, "value");
        b(list);
    }
}
