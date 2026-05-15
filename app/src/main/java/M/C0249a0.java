package M;

import l5.InterfaceC1182c;
import x0.C1892b;

/* JADX INFO: renamed from: M.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0249a0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j0 f4526p;

    public /* synthetic */ C0249a0(j0 j0Var, int i7) {
        this.f4525o = i7;
        this.f4526p = j0Var;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f4525o) {
            case 0:
                this.f4526p.c(((C1892b) obj).f19867a);
                break;
            default:
                K0.u uVar = (K0.u) obj;
                this.f4526p.e(K0.t.f(uVar, false));
                uVar.a();
                break;
        }
        return Y4.o.f8736a;
    }
}
