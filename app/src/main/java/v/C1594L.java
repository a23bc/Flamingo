package v;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1594L extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O0.m0 f17985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f17986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f17987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q0.M f17988s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594L(O0.m0 m0Var, long j3, long j7, Q0.M m7) {
        super(1);
        this.f17985p = m0Var;
        this.f17986q = j3;
        this.f17987r = j7;
        this.f17988s = m7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        O0.l0 l0Var = (O0.l0) obj;
        long j3 = this.f17986q;
        long j7 = this.f17987r;
        int i7 = ((int) (j3 >> 32)) + ((int) (j7 >> 32));
        int i8 = ((int) (j3 & 4294967295L)) + ((int) (j7 & 4294967295L));
        Q0.M m7 = this.f17988s;
        O0.m0 m0Var = this.f17985p;
        l0Var.getClass();
        O0.l0.a(l0Var, m0Var);
        m0Var.a0(n1.k.d((((long) i7) << 32) | (4294967295L & ((long) i8)), m0Var.f5420s), 0.0f, m7);
        return Y4.o.f8736a;
    }
}
