package Q0;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T f5875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0 f5878s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t7, long j3, long j7, w0 w0Var) {
        super(0);
        this.f5875p = t7;
        this.f5876q = j3;
        this.f5877r = j7;
        this.f5878s = w0Var;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        T t7 = this.f5875p;
        t7.u0().f5871o = false;
        t7.u0().f5872p = this.f5876q;
        t7.u0().f5873q = this.f5877r;
        InterfaceC1182c interfaceC1182cD = this.f5878s.f6087o.d();
        if (interfaceC1182cD != null) {
            interfaceC1182cD.b(t7.u0());
        }
        return Y4.o.f8736a;
    }
}
