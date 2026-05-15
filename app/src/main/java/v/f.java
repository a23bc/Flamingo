package V;

import M.C0276v;
import M.Z;
import Q0.AbstractC0347f;
import R0.C0404r0;
import R0.O0;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f7319p;

    public /* synthetic */ f(h hVar, int i7) {
        this.f7318o = i7;
        this.f7319p = hVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f7318o) {
            case 0:
                AbstractC0347f.u(this.f7319p);
                break;
            case 1:
                this.f7319p.f7327J.h(true);
                break;
            case 2:
                this.f7319p.f7327J.d(true);
                break;
            case 3:
                this.f7319p.f7327J.f();
                break;
            case 4:
                AbstractC0347f.u(this.f7319p);
                break;
            case 5:
                this.f7319p.f7327J.o();
                break;
            case 6:
                h hVar = this.f7319p;
                C0276v c0276v = hVar.f7324G.f4517w;
                int i7 = hVar.f7328K.f12366e;
                c0276v.getClass();
                c0276v.f4713p.f4512r.b(i7);
                break;
            default:
                h hVar2 = this.f7319p;
                Z z6 = hVar2.f7324G;
                w0.p pVar = hVar2.f7329L;
                if (z6.b()) {
                    O0 o02 = z6.f4499c;
                    if (o02 != null) {
                        ((C0404r0) o02).b();
                    }
                } else {
                    w0.p.b(pVar);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
