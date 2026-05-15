package v;

import O0.InterfaceC0298b0;
import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ s0 f18155p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ long f18156q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f18157r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f18158s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC0298b0 f18159t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ O0.m0 f18160u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, long j3, int i7, int i8, InterfaceC0298b0 interfaceC0298b0, O0.m0 m0Var) {
        super(1);
        this.f18155p = s0Var;
        this.f18156q = j3;
        this.f18157r = i7;
        this.f18158s = i8;
        this.f18159t = interfaceC0298b0;
        this.f18160u = m0Var;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        O0.l0 l0Var = (O0.l0) obj;
        this.f18155p.getClass();
        long jB = AbstractC1107a.b(this.f18157r, this.f18158s);
        n1.n layoutDirection = this.f18159t.getLayoutDirection();
        long j3 = this.f18156q;
        float f7 = (((int) (jB >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f8 = (((int) (jB & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        float f9 = layoutDirection == n1.n.f14521o ? -1.0f : (-1) * (-1.0f);
        float f10 = 1;
        float f11 = (f9 + f10) * f7;
        O0.l0.l(l0Var, this.f18160u, (((long) Math.round((f10 - 1.0f) * f8)) & 4294967295L) | (((long) Math.round(f11)) << 32));
        return Y4.o.f8736a;
    }
}
