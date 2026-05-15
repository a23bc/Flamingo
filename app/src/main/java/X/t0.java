package X;

import android.os.Build;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import x.AbstractC1860k0;
import x.C1888y0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n1.d f8168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f8169q;

    public /* synthetic */ t0(n1.d dVar, InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f8167o = i7;
        this.f8168p = dVar;
        this.f8169q = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f8167o) {
            case 0:
                n1.i iVar = (n1.i) obj;
                float fB = n1.i.b(iVar.f14513a);
                n1.d dVar = this.f8168p;
                this.f8169q.setValue(new n1.m((((long) dVar.L(fB)) << 32) | (((long) dVar.L(n1.i.a(iVar.f14513a))) & 4294967295L)));
                return Y4.o.f8736a;
            case 1:
                s0 s0Var = new s0((InterfaceC1180a) obj, 0);
                t0 t0Var = new t0(this.f8168p, this.f8169q, 0);
                if (AbstractC1860k0.a()) {
                    return AbstractC1860k0.b(s0Var, t0Var, Build.VERSION.SDK_INT == 28 ? C1888y0.f19859b : C1888y0.f19860c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 2:
                s0 s0Var2 = new s0((InterfaceC1180a) obj, 1);
                t0 t0Var2 = new t0(this.f8168p, this.f8169q, 3);
                if (AbstractC1860k0.a()) {
                    return AbstractC1860k0.b(s0Var2, t0Var2, Build.VERSION.SDK_INT == 28 ? C1888y0.f19859b : C1888y0.f19860c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                n1.i iVar2 = (n1.i) obj;
                float fB2 = n1.i.b(iVar2.f14513a);
                n1.d dVar2 = this.f8168p;
                this.f8169q.setValue(new n1.m((((long) dVar2.L(fB2)) << 32) | (((long) dVar2.L(n1.i.a(iVar2.f14513a))) & 4294967295L)));
                return Y4.o.f8736a;
        }
    }
}
