package H;

import l5.InterfaceC1182c;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f0 f2854p;

    public /* synthetic */ c0(f0 f0Var, int i7) {
        this.f2853o = i7;
        this.f2854p = f0Var;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f2853o) {
            case 0:
                K k7 = (K) this.f2854p.f2866C.j();
                int iA = k7.a();
                int i7 = 0;
                while (true) {
                    if (i7 >= iA) {
                        i7 = -1;
                    } else if (!k7.b(i7).equals(obj)) {
                        i7++;
                    }
                }
                return Integer.valueOf(i7);
            default:
                int iIntValue = ((Integer) obj).intValue();
                f0 f0Var = this.f2854p;
                K k8 = (K) f0Var.f2866C.j();
                if (iIntValue < 0 || iIntValue >= k8.a()) {
                    StringBuilder sbV = n1.c.v(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbV.append(k8.a());
                    sbV.append(')');
                    C.b.a(sbV.toString());
                }
                AbstractC1767D.t(f0Var.n0(), null, new e0(f0Var, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
