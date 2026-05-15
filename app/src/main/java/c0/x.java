package c0;

import Q0.AbstractC0347f;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0360p;
import Q0.InterfaceC0369z;
import Q0.N;
import j5.AbstractC1107a;
import r0.AbstractC1397o;
import t.C1444F;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends AbstractC1397o implements InterfaceC0356l, InterfaceC0360p, InterfaceC0369z {

    /* JADX INFO: renamed from: C */
    public final B.k f10607C;

    /* JADX INFO: renamed from: D */
    public final boolean f10608D;

    /* JADX INFO: renamed from: E */
    public final float f10609E;

    /* JADX INFO: renamed from: F */
    public final Y.h f10610F;

    /* JADX INFO: renamed from: G */
    public final Y.i f10611G;

    /* JADX INFO: renamed from: H */
    public B0.a f10612H;

    /* JADX INFO: renamed from: I */
    public float f10613I;

    /* JADX INFO: renamed from: K */
    public boolean f10615K;

    /* JADX INFO: renamed from: J */
    public long f10614J = 0;

    /* JADX INFO: renamed from: L */
    public final C1444F f10616L = new C1444F();

    public x(B.k kVar, boolean z6, float f7, Y.h hVar, Y.i iVar) {
        this.f10607C = kVar;
        this.f10608D = z6;
        this.f10609E = f7;
        this.f10610F = hVar;
        this.f10611G = iVar;
    }

    public abstract void B0(B.m mVar, long j3, float f7);

    public abstract void C0(N n7);

    public final void D0(B.o oVar) {
        if (oVar instanceof B.m) {
            B0((B.m) oVar, this.f10614J, this.f10613I);
        } else if (oVar instanceof B.n) {
            E0(((B.n) oVar).f601a);
        } else if (oVar instanceof B.l) {
            E0(((B.l) oVar).f599a);
        }
    }

    public abstract void E0(B.m mVar);

    @Override // Q0.InterfaceC0369z
    public final /* synthetic */ void Q(O0.C c7) {
    }

    @Override // Q0.InterfaceC0360p
    public final void a(N n7) {
        n7.a();
        B0.a aVar = this.f10612H;
        if (aVar != null) {
            aVar.c(n7, this.f10613I, this.f10610F.a());
        }
        C0(n7);
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // Q0.InterfaceC0369z
    public final void r(long j3) {
        this.f10615K = true;
        n1.d dVar = AbstractC0347f.x(this).f5814M;
        this.f10614J = AbstractC1107a.E(j3);
        float f7 = this.f10609E;
        this.f10613I = Float.isNaN(f7) ? q.a(dVar, this.f10608D, this.f10614J) : dVar.v(f7);
        C1444F c1444f = this.f10616L;
        Object[] objArr = c1444f.f15983a;
        int i7 = c1444f.f15984b;
        for (int i8 = 0; i8 < i7; i8++) {
            D0((B.o) objArr[i8]);
        }
        c1444f.c();
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        AbstractC1767D.t(n0(), null, new w(this, null), 3);
    }
}
