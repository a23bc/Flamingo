package J0;

import K0.AbstractC0240h;
import Q0.F0;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import m5.C1220v;
import r0.AbstractC1397o;
import w0.u;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1220v f3613q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(C1220v c1220v, int i7) {
        super(1);
        this.f3612p = i7;
        this.f3613q = c1220v;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean z6;
        switch (this.f3612p) {
            case 0:
                Object obj2 = (F0) obj;
                if (((AbstractC1397o) obj2).f15637o.f15636B) {
                    this.f3613q.f14439o = obj2;
                    z6 = false;
                } else {
                    z6 = true;
                }
                break;
            case 1:
                AbstractC0240h abstractC0240h = (AbstractC0240h) obj;
                C1220v c1220v = this.f3613q;
                Object obj3 = c1220v.f14439o;
                if (obj3 == null && abstractC0240h.f3880E) {
                    c1220v.f14439o = abstractC0240h;
                } else if (obj3 != null) {
                    abstractC0240h.getClass();
                }
                break;
            default:
                this.f3613q.f14439o = (u) obj;
                break;
        }
        return Boolean.TRUE;
    }
}
