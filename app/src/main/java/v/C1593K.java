package v;

import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1593K extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f17983p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1182c f17984q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1593K(InterfaceC1182c interfaceC1182c, int i7) {
        super(1);
        this.f17983p = i7;
        this.f17984q = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f17983p) {
            case 0:
                long j3 = ((n1.m) obj).f14520a;
                return new n1.m(AbstractC1107a.b(((Number) this.f17984q.b(Integer.valueOf((int) (j3 >> 32)))).intValue(), (int) (j3 & 4294967295L)));
            case 1:
                long j7 = ((n1.m) obj).f14520a;
                return new n1.m(AbstractC1107a.b((int) (j7 >> 32), ((Number) this.f17984q.b(Integer.valueOf((int) (j7 & 4294967295L)))).intValue()));
            case 2:
                long j8 = ((n1.m) obj).f14520a;
                return new n1.m(AbstractC1107a.b(((Number) this.f17984q.b(Integer.valueOf((int) (j8 >> 32)))).intValue(), (int) (j8 & 4294967295L)));
            case 3:
                long j9 = ((n1.m) obj).f14520a;
                return new n1.m(AbstractC1107a.b((int) (j9 >> 32), ((Number) this.f17984q.b(Integer.valueOf((int) (j9 & 4294967295L)))).intValue()));
            default:
                Q0.N n7 = (Q0.N) obj;
                this.f17984q.b(n7);
                n7.a();
                return Y4.o.f8736a;
        }
    }
}
