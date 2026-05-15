package Q0;

import H.C0163e;
import R0.C0415x;
import r0.AbstractC1397o;
import r0.InterfaceC1396n;
import t.C1443E;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a */
    public static final C1443E f6048a;

    static {
        C1443E c1443e = t.N.f16028a;
        f6048a = new C1443E();
    }

    public static final void a(AbstractC1397o abstractC1397o, int i7, int i8) {
        if (!(abstractC1397o instanceof AbstractC0358n)) {
            b(abstractC1397o, i7 & abstractC1397o.f15639q, i8);
            return;
        }
        AbstractC0358n abstractC0358n = (AbstractC0358n) abstractC1397o;
        b(abstractC1397o, abstractC0358n.f6055C & i7, i8);
        int i9 = (~abstractC0358n.f6055C) & i7;
        for (AbstractC1397o abstractC1397o2 = abstractC0358n.f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
            a(abstractC1397o2, i9, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(AbstractC1397o abstractC1397o, int i7, int i8) {
        if (i8 != 0 || abstractC1397o.o0()) {
            if ((i7 & 2) != 0 && (abstractC1397o instanceof A)) {
                AbstractC0347f.n((A) abstractC1397o);
                if (i8 == 2) {
                    j0 j0VarV = AbstractC0347f.v(abstractC1397o, 2);
                    j0VarV.f6029H = true;
                    j0VarV.f6044W.a();
                    j0VarV.a1();
                }
            }
            if ((i7 & 128) != 0 && (abstractC1397o instanceof InterfaceC0369z) && i8 != 2) {
                AbstractC0347f.x(abstractC1397o).F();
            }
            if ((i7 & 256) != 0 && (abstractC1397o instanceof InterfaceC0361q)) {
                if (i8 == 1) {
                    K kX = AbstractC0347f.x(abstractC1397o);
                    kX.a0(kX.f5828d0 + 1);
                } else if (i8 == 2) {
                    AbstractC0347f.x(abstractC1397o).a0(r0.f5828d0 - 1);
                }
                if (i8 != 2) {
                    K kX2 = AbstractC0347f.x(abstractC1397o);
                    if (kX2.f5828d0 != 0 && !kX2.q() && !kX2.r() && !kX2.f5827c0) {
                        C0415x c0415x = (C0415x) O.a(kX2);
                        V.o oVar = c0415x.f6606f0.f5929e;
                        oVar.getClass();
                        if (kX2.f5828d0 > 0) {
                            ((h0.e) oVar.f7342p).b(kX2);
                            kX2.f5827c0 = true;
                        }
                        c0415x.J(null);
                    }
                }
            }
            if ((i7 & 4) != 0 && (abstractC1397o instanceof InterfaceC0360p)) {
                AbstractC0347f.m((InterfaceC0360p) abstractC1397o);
            }
            if ((i7 & 8) != 0 && (abstractC1397o instanceof A0)) {
                AbstractC0347f.x(abstractC1397o).f5807F = true;
            }
            if ((i7 & 64) != 0 && (abstractC1397o instanceof v0)) {
                P p7 = AbstractC0347f.x((v0) abstractC1397o).f5822U;
                p7.f5869p.f5944E = true;
                Y y6 = p7.f5870q;
                if (y6 != null) {
                    y6.f5912J = true;
                }
            }
            if ((i7 & 2048) != 0 && (abstractC1397o instanceof w0.o)) {
                w0.o oVar2 = (w0.o) abstractC1397o;
                C0349g.f5994b = null;
                oVar2.G(C0349g.f5993a);
                if (C0349g.f5994b != null) {
                    AbstractC1397o abstractC1397o2 = (AbstractC1397o) oVar2;
                    if (!abstractC1397o2.f15637o.f15636B) {
                        N0.a.b("visitChildren called on an unattached node");
                    }
                    h0.e eVar = new h0.e(new AbstractC1397o[16]);
                    AbstractC1397o abstractC1397o3 = abstractC1397o2.f15637o;
                    AbstractC1397o abstractC1397o4 = abstractC1397o3.f15642t;
                    if (abstractC1397o4 == null) {
                        AbstractC0347f.b(eVar, abstractC1397o3);
                    } else {
                        eVar.b(abstractC1397o4);
                    }
                    while (true) {
                        int i9 = eVar.f12548q;
                        if (i9 == 0) {
                            break;
                        }
                        AbstractC1397o abstractC1397oF = (AbstractC1397o) eVar.l(i9 - 1);
                        if ((abstractC1397oF.f15640r & 1024) == 0) {
                            AbstractC0347f.b(eVar, abstractC1397oF);
                        } else {
                            while (true) {
                                if (abstractC1397oF == null) {
                                    break;
                                }
                                if ((abstractC1397oF.f15639q & 1024) != 0) {
                                    h0.e eVar2 = null;
                                    while (abstractC1397oF != null) {
                                        if (abstractC1397oF instanceof w0.u) {
                                            w0.u uVar = (w0.u) abstractC1397oF;
                                            w0.g gVar = ((w0.k) ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner()).f18789d;
                                            if (gVar.f18780c.a(uVar)) {
                                                gVar.a();
                                            }
                                        } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                            int i10 = 0;
                                            for (AbstractC1397o abstractC1397o5 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o5 != null; abstractC1397o5 = abstractC1397o5.f15642t) {
                                                if ((abstractC1397o5.f15639q & 1024) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        abstractC1397oF = abstractC1397o5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new h0.e(new AbstractC1397o[16]);
                                                        }
                                                        if (abstractC1397oF != null) {
                                                            eVar2.b(abstractC1397oF);
                                                            abstractC1397oF = null;
                                                        }
                                                        eVar2.b(abstractC1397o5);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        abstractC1397oF = AbstractC0347f.f(eVar2);
                                    }
                                } else {
                                    abstractC1397oF = abstractC1397oF.f15642t;
                                }
                            }
                        }
                    }
                }
            }
            if ((i7 & 4096) == 0 || !(abstractC1397o instanceof w0.e)) {
                return;
            }
            w0.e eVar3 = (w0.e) abstractC1397o;
            w0.g gVar2 = ((w0.k) ((C0415x) AbstractC0347f.y(eVar3)).getFocusOwner()).f18789d;
            if (gVar2.f18781d.a(eVar3)) {
                gVar2.a();
            }
        }
    }

    public static final void c(AbstractC1397o abstractC1397o) {
        if (!abstractC1397o.f15636B) {
            N0.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(abstractC1397o, -1, 0);
    }

    public static final int d(InterfaceC1396n interfaceC1396n) {
        int i7 = interfaceC1396n instanceof O0.G ? 3 : 1;
        if (interfaceC1396n instanceof v0.f) {
            i7 |= 4;
        }
        if (interfaceC1396n instanceof Y0.k) {
            i7 |= 8;
        }
        if (interfaceC1396n instanceof K0.B) {
            i7 |= 16;
        }
        if ((interfaceC1396n instanceof D.Y) || (interfaceC1396n instanceof D.Y)) {
            i7 |= 32;
        }
        if (interfaceC1396n instanceof C0163e) {
            i7 |= 256;
        }
        if (interfaceC1396n instanceof O0.j0) {
            i7 |= 64;
        }
        return interfaceC1396n instanceof V0.a ? 524288 | i7 : i7;
    }

    public static final int e(AbstractC1397o abstractC1397o) {
        int i7 = abstractC1397o.f15639q;
        if (i7 != 0) {
            return i7;
        }
        Class<?> cls = abstractC1397o.getClass();
        C1443E c1443e = f6048a;
        int iD = c1443e.d(cls);
        if (iD >= 0) {
            return c1443e.f15979c[iD];
        }
        int i8 = abstractC1397o instanceof A ? 3 : 1;
        if (abstractC1397o instanceof InterfaceC0360p) {
            i8 |= 4;
        }
        if (abstractC1397o instanceof A0) {
            i8 |= 8;
        }
        if (abstractC1397o instanceof x0) {
            i8 |= 16;
        }
        if (abstractC1397o instanceof P0.d) {
            i8 |= 32;
        }
        if (abstractC1397o instanceof v0) {
            i8 |= 64;
        }
        if (abstractC1397o instanceof InterfaceC0369z) {
            i8 |= 128;
        }
        if (abstractC1397o instanceof InterfaceC0361q) {
            i8 |= 256;
        }
        if (abstractC1397o instanceof v.Y) {
            i8 |= 512;
        }
        if (abstractC1397o instanceof w0.u) {
            i8 |= 1024;
        }
        if (abstractC1397o instanceof w0.o) {
            i8 |= 2048;
        }
        if (abstractC1397o instanceof w0.e) {
            i8 |= 4096;
        }
        if (abstractC1397o instanceof I0.d) {
            i8 |= 8192;
        }
        if (abstractC1397o instanceof M0.a) {
            i8 |= 16384;
        }
        if (abstractC1397o instanceof InterfaceC0356l) {
            i8 |= 32768;
        }
        if (abstractC1397o instanceof F0) {
            i8 |= 262144;
        }
        if (abstractC1397o instanceof V0.a) {
            i8 |= 524288;
        }
        c1443e.h(i8, cls);
        return i8;
    }

    public static final int f(AbstractC1397o abstractC1397o) {
        if (!(abstractC1397o instanceof AbstractC0358n)) {
            return e(abstractC1397o);
        }
        AbstractC0358n abstractC0358n = (AbstractC0358n) abstractC1397o;
        int iF = abstractC0358n.f6055C;
        for (AbstractC1397o abstractC1397o2 = abstractC0358n.f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
            iF |= f(abstractC1397o2);
        }
        return iF;
    }

    public static final boolean g(int i7) {
        return (i7 & 128) != 0;
    }
}
