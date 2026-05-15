package H;

import Q0.A0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import s5.InterfaceC1438c;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AbstractC1397o implements A0 {

    /* JADX INFO: renamed from: C */
    public B5.i f2866C;

    /* JADX INFO: renamed from: D */
    public b0 f2867D;

    /* JADX INFO: renamed from: E */
    public EnumC2048l0 f2868E;

    /* JADX INFO: renamed from: F */
    public boolean f2869F;

    /* JADX INFO: renamed from: G */
    public Y0.h f2870G;

    /* JADX INFO: renamed from: H */
    public final c0 f2871H = new c0(this, 0);

    /* JADX INFO: renamed from: I */
    public c0 f2872I;

    public f0(B5.i iVar, b0 b0Var, EnumC2048l0 enumC2048l0, boolean z6) {
        this.f2866C = iVar;
        this.f2867D = b0Var;
        this.f2868E = enumC2048l0;
        this.f2869F = z6;
        B0();
    }

    public final void B0() {
        this.f2870G = new Y0.h(new d0(this, 0), new d0(this, 1));
        this.f2872I = this.f2869F ? new c0(this, 1) : null;
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        Y0.w wVar = Y0.t.f8540m;
        InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
        InterfaceC1438c interfaceC1438c = interfaceC1438cArr2[6];
        wVar.a(jVar, Boolean.TRUE);
        jVar.i(Y0.t.f8526L, this.f2871H);
        if (this.f2868E == EnumC2048l0.f20894o) {
            Y0.h hVar = this.f2870G;
            if (hVar == null) {
                AbstractC1209k.m("scrollAxisRange");
                throw null;
            }
            Y0.w wVar2 = Y0.t.f8548u;
            InterfaceC1438c interfaceC1438c2 = interfaceC1438cArr2[12];
            wVar2.a(jVar, hVar);
        } else {
            Y0.h hVar2 = this.f2870G;
            if (hVar2 == null) {
                AbstractC1209k.m("scrollAxisRange");
                throw null;
            }
            Y0.w wVar3 = Y0.t.f8547t;
            InterfaceC1438c interfaceC1438c3 = interfaceC1438cArr2[11];
            wVar3.a(jVar, hVar2);
        }
        c0 c0Var = this.f2872I;
        if (c0Var != null) {
            jVar.i(Y0.i.f8454f, new Y0.a(null, c0Var));
        }
        jVar.i(Y0.i.f8448B, new Y0.a(null, new B0.b(18, new d0(this, 2))));
        Y0.b bVarC = this.f2867D.c();
        Y0.w wVar4 = Y0.t.f8535f;
        InterfaceC1438c interfaceC1438c4 = interfaceC1438cArr2[22];
        wVar4.a(jVar, bVarC);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }
}
