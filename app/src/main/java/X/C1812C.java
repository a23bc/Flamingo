package x;

import Q0.AbstractC0347f;
import R0.AbstractC0403q0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: x.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1812C implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1820G f19607p;

    public /* synthetic */ C1812C(C1820G c1820g, int i7) {
        this.f19606o = i7;
        this.f19607p = c1820g;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f19606o) {
            case 0:
                InterfaceC1180a interfaceC1180a = this.f19607p.a0;
                if (interfaceC1180a != null) {
                    interfaceC1180a.a();
                }
                break;
            case 1:
                C1820G c1820g = this.f19607p;
                InterfaceC1180a interfaceC1180a2 = c1820g.Z;
                if (interfaceC1180a2 != null) {
                    interfaceC1180a2.a();
                }
                if (c1820g.b0) {
                    ((G0.a) AbstractC0347f.i(c1820g, AbstractC0403q0.l)).a(0);
                }
                break;
            default:
                C1820G c1820g2 = this.f19607p;
                if (c1820g2.f19795J) {
                    c1820g2.f19796K.a();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
