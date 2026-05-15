package x;

import I.C0223o;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0357m;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import z.EnumC2048l0;
import z.H0;
import z.I0;

/* JADX INFO: renamed from: x.F0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1819F0 extends AbstractC0358n implements InterfaceC0356l, Q0.n0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public I0 f19631E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EnumC2048l0 f19632F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f19633G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public z.S f19634H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public B.k f19635I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0223o f19636J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f19637K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C1875s f19638L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public H0 f19639M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public InterfaceC0357m f19640N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C1877t f19641O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1875s f19642P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f19643Q;

    public final void E0() {
        InterfaceC0357m interfaceC0357m = this.f19640N;
        if (interfaceC0357m != null) {
            if (((AbstractC1397o) interfaceC0357m).f15637o.f15636B) {
                return;
            }
            B0(interfaceC0357m);
            return;
        }
        if (this.f19637K) {
            AbstractC0347f.t(this, new C1808A(1, this));
        }
        C1875s c1875s = this.f19637K ? this.f19642P : this.f19638L;
        if (c1875s != null) {
            AbstractC0358n abstractC0358n = c1875s.f19836i;
            if (abstractC0358n.f15637o.f15636B) {
                return;
            }
            B0(abstractC0358n);
            this.f19640N = abstractC0358n;
        }
    }

    @Override // Q0.n0
    public final void F() {
        C1877t c1877t = (C1877t) AbstractC0347f.i(this, AbstractC1880u0.f19845a);
        if (AbstractC1209k.a(c1877t, this.f19641O)) {
            return;
        }
        this.f19641O = c1877t;
        this.f19642P = null;
        InterfaceC0357m interfaceC0357m = this.f19640N;
        if (interfaceC0357m != null) {
            C0(interfaceC0357m);
        }
        this.f19640N = null;
        E0();
        H0 h02 = this.f19639M;
        if (h02 != null) {
            I0 i02 = this.f19631E;
            EnumC2048l0 enumC2048l0 = this.f19632F;
            C1875s c1875s = this.f19637K ? this.f19642P : this.f19638L;
            h02.N0(this.f19635I, this.f19636J, c1875s, this.f19634H, enumC2048l0, i02, this.f19633G, this.f19643Q);
        }
    }

    public final boolean F0() {
        n1.n nVar = n1.n.f14521o;
        if (this.f15636B) {
            nVar = AbstractC0347f.x(this).f5815N;
        }
        return nVar != n1.n.f14522p || this.f19632F == EnumC2048l0.f20894o;
    }

    public final void G0(B.k kVar, C0223o c0223o, C1875s c1875s, z.S s7, EnumC2048l0 enumC2048l0, I0 i02, boolean z6, boolean z7) {
        boolean z8;
        this.f19631E = i02;
        this.f19632F = enumC2048l0;
        boolean z9 = true;
        if (this.f19637K != z6) {
            this.f19637K = z6;
            z8 = true;
        } else {
            z8 = false;
        }
        if (AbstractC1209k.a(this.f19638L, c1875s)) {
            z9 = false;
        } else {
            this.f19638L = c1875s;
        }
        if (z8 || (z9 && !z6)) {
            InterfaceC0357m interfaceC0357m = this.f19640N;
            if (interfaceC0357m != null) {
                C0(interfaceC0357m);
            }
            this.f19640N = null;
            E0();
        }
        this.f19633G = z7;
        this.f19634H = s7;
        this.f19635I = kVar;
        this.f19636J = c0223o;
        boolean zF0 = F0();
        this.f19643Q = zF0;
        H0 h02 = this.f19639M;
        if (h02 != null) {
            h02.N0(kVar, c0223o, this.f19637K ? this.f19642P : this.f19638L, s7, enumC2048l0, i02, z7, zF0);
        }
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        this.f19643Q = F0();
        E0();
        if (this.f19639M == null) {
            I0 i02 = this.f19631E;
            H0 h02 = new H0(this.f19635I, this.f19636J, this.f19637K ? this.f19642P : this.f19638L, this.f19634H, this.f19632F, i02, this.f19633G, this.f19643Q);
            B0(h02);
            this.f19639M = h02;
        }
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        InterfaceC0357m interfaceC0357m = this.f19640N;
        if (interfaceC0357m != null) {
            C0(interfaceC0357m);
        }
    }

    @Override // r0.AbstractC1397o
    public final void u0() {
        boolean zF0 = F0();
        if (this.f19643Q != zF0) {
            this.f19643Q = zF0;
            I0 i02 = this.f19631E;
            EnumC2048l0 enumC2048l0 = this.f19632F;
            boolean z6 = this.f19637K;
            C1875s c1875s = z6 ? this.f19642P : this.f19638L;
            G0(this.f19635I, this.f19636J, c1875s, this.f19634H, enumC2048l0, i02, z6, this.f19633G);
        }
    }
}
