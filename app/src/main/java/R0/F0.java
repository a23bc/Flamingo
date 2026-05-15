package R0;

import f0.C0886f0;
import r0.C1385c;
import r0.InterfaceC1399q;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements InterfaceC1399q {

    /* JADX INFO: renamed from: o */
    public final C0886f0 f6308o = new C0886f0(1.0f);

    @Override // c5.g
    public final c5.h getKey() {
        return C1385c.f15611D;
    }

    @Override // c5.i
    public final c5.i h(c5.i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // r0.InterfaceC1399q
    public final float r() {
        return this.f6308o.h();
    }

    @Override // c5.i
    public final c5.i u(c5.h hVar) {
        return I0.c.H(this, hVar);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }
}
