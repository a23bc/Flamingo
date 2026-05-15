package O0;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m0 f5433q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(m0 m0Var, int i7) {
        super(1);
        this.f5432p = i7;
        this.f5433q = m0Var;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f5432p) {
            case 0:
                l0.m((l0) obj, this.f5433q, 0, 0);
                break;
            case 1:
                l0.h((l0) obj, this.f5433q, 0, 0);
                break;
            case 2:
                l0.h((l0) obj, this.f5433q, 0, 0);
                break;
            case 3:
                l0.j((l0) obj, this.f5433q, 0, 0);
                break;
            case 4:
                l0.j((l0) obj, this.f5433q, 0, 0);
                break;
            case 5:
                l0.h((l0) obj, this.f5433q, 0, 0);
                break;
            case 6:
                l0.h((l0) obj, this.f5433q, 0, 0);
                break;
            case 7:
                l0.h((l0) obj, this.f5433q, 0, 0);
                break;
            case 8:
                l0.j((l0) obj, this.f5433q, 0, 0);
                break;
            default:
                l0 l0Var = (l0) obj;
                AbstractC1209k.f(l0Var, "$this$layout");
                l0.h(l0Var, this.f5433q, 0, 0);
                break;
        }
        return Y4.o.f8736a;
    }
}
