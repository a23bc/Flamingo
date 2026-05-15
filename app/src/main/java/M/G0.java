package M;

import b1.C0613I;
import f0.C0915u0;
import f0.C0924z;
import f0.InterfaceC0916v;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.C1443E;
import x.C1813C0;
import x0.C1893c;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4400o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f4401p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f4402q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f4403r;

    public /* synthetic */ G0(H0 h02, O0.m0 m0Var, int i7) {
        this.f4400o = 0;
        this.f4402q = h02;
        this.f4403r = m0Var;
        this.f4401p = i7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        InterfaceC0916v interfaceC0916v;
        long[] jArr;
        InterfaceC0916v interfaceC0916v2;
        long[] jArr2;
        int i7;
        switch (this.f4400o) {
            case 0:
                O0.l0 l0Var = (O0.l0) obj;
                H0 h02 = (H0) this.f4402q;
                int i8 = h02.f4409b;
                E0 e02 = (E0) h02.f4411d.a();
                C0613I c0613i = e02 != null ? e02.f4386a : null;
                O0.m0 m0Var = (O0.m0) this.f4403r;
                C1893c c1893cI = V.i(l0Var, i8, h02.f4410c, c0613i, false, m0Var.f5416o);
                EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
                int i9 = m0Var.f5417p;
                B0 b0 = h02.f4408a;
                b0.a(enumC2048l0, c1893cI, this.f4401p, i9);
                O0.l0.j(l0Var, m0Var, 0, Math.round(-b0.f4365a.h()));
                break;
            case 1:
                InterfaceC0916v interfaceC0916v3 = (InterfaceC0916v) obj;
                C0915u0 c0915u0 = (C0915u0) this.f4402q;
                int i10 = c0915u0.f11933e;
                int i11 = this.f4401p;
                if (i10 == i11) {
                    C1443E c1443e = c0915u0.f11934f;
                    C1443E c1443e2 = (C1443E) this.f4403r;
                    if (AbstractC1209k.a(c1443e2, c1443e) && (interfaceC0916v3 instanceof C0924z)) {
                        long[] jArr3 = c1443e2.f15977a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j3 = jArr3[i12];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8;
                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        if ((255 & j3) < 128) {
                                            int i16 = (i12 << 3) + i15;
                                            Object obj2 = c1443e2.f15978b[i16];
                                            boolean z6 = c1443e2.f15979c[i16] != i11;
                                            if (z6) {
                                                i7 = i13;
                                                C0924z c0924z = (C0924z) interfaceC0916v3;
                                                interfaceC0916v2 = interfaceC0916v3;
                                                android.support.v4.media.session.b.E(c0924z.f11973u, obj2, c0915u0);
                                                if (obj2 instanceof f0.G) {
                                                    f0.G g6 = (f0.G) obj2;
                                                    jArr2 = jArr3;
                                                    if (!c0924z.f11973u.c(g6)) {
                                                        android.support.v4.media.session.b.F(c0924z.f11976x, g6);
                                                    }
                                                    t.J j7 = c0915u0.f11935g;
                                                    if (j7 != null) {
                                                        j7.k(obj2);
                                                    }
                                                } else {
                                                    jArr2 = jArr3;
                                                }
                                            } else {
                                                interfaceC0916v2 = interfaceC0916v3;
                                                jArr2 = jArr3;
                                                i7 = i13;
                                            }
                                            if (z6) {
                                                c1443e2.g(i16);
                                            }
                                        } else {
                                            interfaceC0916v2 = interfaceC0916v3;
                                            jArr2 = jArr3;
                                            i7 = i13;
                                        }
                                        j3 >>= i7;
                                        i15++;
                                        i13 = i7;
                                        interfaceC0916v3 = interfaceC0916v2;
                                        jArr3 = jArr2;
                                    }
                                    interfaceC0916v = interfaceC0916v3;
                                    jArr = jArr3;
                                    if (i14 == i13) {
                                    }
                                } else {
                                    interfaceC0916v = interfaceC0916v3;
                                    jArr = jArr3;
                                }
                                if (i12 != length) {
                                    i12++;
                                    interfaceC0916v3 = interfaceC0916v;
                                    jArr3 = jArr;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                O0.l0 l0Var2 = (O0.l0) obj;
                C1813C0 c1813c0 = (C1813C0) this.f4402q;
                int iH = c1813c0.f19608C.f19619a.h();
                if (iH < 0) {
                    iH = 0;
                }
                int i17 = this.f4401p;
                if (iH > i17) {
                    iH = i17;
                }
                int i18 = -iH;
                boolean z7 = c1813c0.f19609D;
                int i19 = z7 ? 0 : i18;
                if (!z7) {
                    i18 = 0;
                }
                O0.m0 m0Var2 = (O0.m0) this.f4403r;
                l0Var2.f5412o = true;
                O0.l0.m(l0Var2, m0Var2, i19, i18);
                l0Var2.f5412o = false;
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ G0(Object obj, int i7, Object obj2, int i8) {
        this.f4400o = i8;
        this.f4402q = obj;
        this.f4401p = i7;
        this.f4403r = obj2;
    }
}
