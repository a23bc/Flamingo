package d0;

import f0.C0879c;
import f0.C0912t;
import f0.C0913t0;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;
import y0.C1987t;
import y0.InterfaceC1963M;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a */
    public static final f0.D f10848a = new f0.D(C0804t.f11133w);

    public static final void a(InterfaceC1398p interfaceC1398p, InterfaceC1963M interfaceC1963M, long j3, long j7, float f7, n0.d dVar, C0912t c0912t, int i7, int i8) {
        c0912t.Y(-513881741);
        if ((i8 & 2) != 0) {
            interfaceC1963M = AbstractC1959I.f20180a;
        }
        InterfaceC1963M interfaceC1963M2 = interfaceC1963M;
        long j8 = (i8 & 4) != 0 ? ((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11108p : j3;
        long jA = (i8 & 8) != 0 ? AbstractC0805u.a(j8, c0912t) : j7;
        float f8 = (i8 & 16) != 0 ? 0 : f7;
        f0.D d4 = f10848a;
        float f9 = ((n1.g) c0912t.j(d4)).f14511o + f8;
        C0879c.b(new C0913t0[]{AbstractC0808x.f11164a.a(new C1987t(jA)), d4.a(new n1.g(f9))}, n0.e.b(c0912t, -70914509, new Y.q(interfaceC1398p, interfaceC1963M2, j8, f9, 0, dVar, 2)), c0912t, 48);
        c0912t.p(false);
    }
}
