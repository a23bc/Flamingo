package z;

import d5.EnumC0830a;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class P extends J {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Q f20705N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public EnumC2048l0 f20706O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f20707P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public l5.f f20708Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public l5.f f20709R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f20710S;

    @Override // z.J
    public final Object I0(H h, I i7) {
        Object objA = this.f20705N.a(EnumC1862l0.f19773p, new M(h, this, null), i7);
        return objA == EnumC0830a.f11264o ? objA : Y4.o.f8736a;
    }

    @Override // z.J
    public final void J0(long j3) {
        if (!this.f15636B || AbstractC1209k.a(this.f20708Q, L.f20674a)) {
            return;
        }
        InterfaceC1765B interfaceC1765BN0 = n0();
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        AbstractC1767D.t(interfaceC1765BN0, null, new N(this, j3, null), 1);
    }

    @Override // z.J
    public final void K0(long j3) {
        if (!this.f15636B || AbstractC1209k.a(this.f20709R, L.f20675b)) {
            return;
        }
        InterfaceC1765B interfaceC1765BN0 = n0();
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        AbstractC1767D.t(interfaceC1765BN0, null, new O(this, j3, null), 1);
    }

    @Override // z.J
    public final boolean L0() {
        return this.f20707P;
    }
}
