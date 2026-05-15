package i2;

import f0.C0887g;
import f0.W;
import f0.X;
import l5.InterfaceC1182c;
import w5.C1793k;

/* JADX INFO: renamed from: i2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1074i implements X {

    /* JADX INFO: renamed from: o */
    public final K f13378o;

    /* JADX INFO: renamed from: p */
    public final C0887g f13379p = new C0887g(new E0.K(28, this));

    /* JADX INFO: renamed from: q */
    public final Object f13380q = new Object();

    /* JADX INFO: renamed from: r */
    public int f13381r = 5;

    /* JADX INFO: renamed from: s */
    public long f13382s;

    /* JADX INFO: renamed from: t */
    public C1793k f13383t;

    public C1074i(K k7) {
        this.f13378o = k7;
    }

    public static final void a(C1074i c1074i, long j3) {
        c1074i.f13379p.e(j3);
        synchronized (c1074i.f13380q) {
            c1074i.f13382s = j3;
        }
    }

    public final void e() {
        synchronized (this.f13380q) {
            C1793k c1793k = this.f13383t;
            if (c1793k != null) {
                c1793k.l(null);
            }
        }
    }

    @Override // c5.g
    public final c5.h getKey() {
        return W.f11763p;
    }

    @Override // c5.i
    public final c5.i h(c5.i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // f0.X
    public final Object s(InterfaceC1182c interfaceC1182c, c5.d dVar) {
        return this.f13379p.s(interfaceC1182c, dVar);
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
