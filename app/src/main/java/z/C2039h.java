package z;

import H.C0170l;
import I.C0223o;
import Q0.AbstractC0347f;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0369z;
import j5.AbstractC1107a;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import x0.C1893c;

/* JADX INFO: renamed from: z.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2039h extends AbstractC1397o implements InterfaceC0356l, InterfaceC0369z {

    /* JADX INFO: renamed from: C */
    public EnumC2048l0 f20842C;

    /* JADX INFO: renamed from: D */
    public final P0 f20843D;

    /* JADX INFO: renamed from: E */
    public boolean f20844E;

    /* JADX INFO: renamed from: F */
    public C0223o f20845F;

    /* JADX INFO: renamed from: H */
    public O0.C f20847H;

    /* JADX INFO: renamed from: I */
    public boolean f20848I;

    /* JADX INFO: renamed from: J */
    public boolean f20849J;

    /* JADX INFO: renamed from: L */
    public boolean f20851L;

    /* JADX INFO: renamed from: G */
    public final C0170l f20846G = new C0170l(1);

    /* JADX INFO: renamed from: K */
    public long f20850K = 0;

    public C2039h(EnumC2048l0 enumC2048l0, P0 p02, boolean z6, C0223o c0223o) {
        this.f20842C = enumC2048l0;
        this.f20843D = p02;
        this.f20844E = z6;
        this.f20845F = c0223o;
    }

    public static final float B0(C2039h c2039h, InterfaceC2029c interfaceC2029c) {
        C1893c c1893c;
        int iCompare;
        if (n1.m.b(c2039h.f20850K, 0L)) {
            return 0.0f;
        }
        h0.e eVar = c2039h.f20846G.f2906a;
        int i7 = eVar.f12548q - 1;
        Object[] objArr = eVar.f12546o;
        if (i7 < objArr.length) {
            c1893c = null;
            while (true) {
                if (i7 < 0) {
                    break;
                }
                C1893c c1893c2 = (C1893c) ((C2033e) objArr[i7]).f20800a.a();
                if (c1893c2 != null) {
                    long jC = c1893c2.c();
                    long jE = AbstractC1107a.E(c2039h.f20850K);
                    int iOrdinal = c2039h.f20842C.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jE & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new A2.W();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jE >> 32)));
                    }
                    if (iCompare <= 0) {
                        c1893c = c1893c2;
                    } else if (c1893c == null) {
                        c1893c = c1893c2;
                    }
                }
                i7--;
            }
        } else {
            c1893c = null;
        }
        if (c1893c == null) {
            C1893c c1893cC0 = c2039h.f20848I ? c2039h.C0() : null;
            if (c1893cC0 == null) {
                return 0.0f;
            }
            c1893c = c1893cC0;
        }
        long jE2 = AbstractC1107a.E(c2039h.f20850K);
        int iOrdinal2 = c2039h.f20842C.ordinal();
        if (iOrdinal2 == 0) {
            float f7 = c1893c.f19872d;
            float f8 = c1893c.f19870b;
            return interfaceC2029c.a(f8, f7 - f8, Float.intBitsToFloat((int) (jE2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new A2.W();
        }
        float f9 = c1893c.f19871c;
        float f10 = c1893c.f19869a;
        return interfaceC2029c.a(f10, f9 - f10, Float.intBitsToFloat((int) (jE2 >> 32)));
    }

    public final C1893c C0() {
        if (this.f15636B) {
            Q0.j0 j0VarW = AbstractC0347f.w(this);
            O0.C c7 = this.f20847H;
            if (c7 != null) {
                if (!c7.y()) {
                    c7 = null;
                }
                if (c7 != null) {
                    return j0VarW.m(c7, false);
                }
            }
        }
        return null;
    }

    public final boolean D0(C1893c c1893c, long j3) {
        long jF0 = F0(c1893c, j3);
        return Math.abs(Float.intBitsToFloat((int) (jF0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF0 & 4294967295L))) <= 0.5f;
    }

    public final void E0() {
        InterfaceC2029c interfaceC2029c = this.f20845F;
        if (interfaceC2029c == null) {
            interfaceC2029c = (InterfaceC2029c) AbstractC0347f.i(this, AbstractC2031d.f20791a);
        }
        if (this.f20851L) {
            C.b.c("launchAnimation called when previous animation was running");
        }
        InterfaceC2029c interfaceC2029c2 = this.f20845F;
        if (interfaceC2029c2 == null) {
            interfaceC2029c2 = (InterfaceC2029c) AbstractC0347f.i(this, AbstractC2031d.f20791a);
        }
        t1 t1Var = new t1(interfaceC2029c2.b());
        InterfaceC1765B interfaceC1765BN0 = n0();
        EnumC1766C enumC1766C = EnumC1766C.f19467o;
        AbstractC1767D.t(interfaceC1765BN0, null, new C2037g(this, t1Var, interfaceC2029c, null), 1);
    }

    public final long F0(C1893c c1893c, long j3) {
        long jFloatToRawIntBits;
        long j7;
        long jE = AbstractC1107a.E(j3);
        int iOrdinal = this.f20842C.ordinal();
        if (iOrdinal == 0) {
            InterfaceC2029c interfaceC2029c = this.f20845F;
            if (interfaceC2029c == null) {
                interfaceC2029c = (InterfaceC2029c) AbstractC0347f.i(this, AbstractC2031d.f20791a);
            }
            float f7 = c1893c.f19872d;
            float f8 = c1893c.f19870b;
            float fA = interfaceC2029c.a(f8, f7 - f8, Float.intBitsToFloat((int) (jE & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j7 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new A2.W();
            }
            InterfaceC2029c interfaceC2029c2 = this.f20845F;
            if (interfaceC2029c2 == null) {
                interfaceC2029c2 = (InterfaceC2029c) AbstractC0347f.i(this, AbstractC2031d.f20791a);
            }
            float f9 = c1893c.f19871c;
            float f10 = c1893c.f19869a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(interfaceC2029c2.a(f10, f9 - f10, Float.intBitsToFloat((int) (jE >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j7 = jFloatToRawIntBits3 << 32;
        }
        return j7 | (jFloatToRawIntBits & 4294967295L);
    }

    @Override // Q0.InterfaceC0369z
    public final /* synthetic */ void Q(O0.C c7) {
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // Q0.InterfaceC0369z
    public final void r(long j3) {
        int iG;
        C1893c c1893cC0;
        long j7 = this.f20850K;
        this.f20850K = j3;
        int iOrdinal = this.f20842C.ordinal();
        if (iOrdinal == 0) {
            iG = AbstractC1209k.g((int) (j3 & 4294967295L), (int) (4294967295L & j7));
        } else {
            if (iOrdinal != 1) {
                throw new A2.W();
            }
            iG = AbstractC1209k.g((int) (j3 >> 32), (int) (j7 >> 32));
        }
        if (iG >= 0 || this.f20851L || this.f20848I || (c1893cC0 = C0()) == null || !D0(c1893cC0, j7)) {
            return;
        }
        this.f20849J = true;
    }
}
