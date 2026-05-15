package M;

import D.AbstractC0060d;
import X.AbstractC0498r0;
import X.InterfaceC0494p;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import l5.InterfaceC1182c;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: M.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0260g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f4557b;

    static {
        float f7 = 25;
        f4556a = f7;
        f4557b = (f7 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0494p interfaceC0494p, InterfaceC1398p interfaceC1398p, long j3, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(1776202187);
        int i9 = (c0912t.f(interfaceC0494p) ? 4 : 2) | i7 | (c0912t.f(interfaceC1398p) ? 32 : 16) | 128;
        if (c0912t.N(i9 & 1, (i9 & 147) != 146)) {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                i8 = i9 & (-897);
                j3 = 9205357640488583168L;
            } else {
                c0912t.Q();
                i8 = i9 & (-897);
            }
            c0912t.q();
            int i10 = i8 & 14;
            boolean z6 = i10 == 4;
            Object objK = c0912t.K();
            if (z6 || objK == C0903o.f11850a) {
                objK = new D.J(10, interfaceC0494p);
                c0912t.i0(objK);
            }
            AbstractC0498r0.a(interfaceC0494p, C1385c.f15613p, n0.e.e(-1653527038, new C0252c(0, j3, Y0.l.a(interfaceC1398p, false, (InterfaceC1182c) objK)), c0912t), c0912t, i10 | 432);
        } else {
            c0912t.Q();
        }
        long j7 = j3;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0248a(interfaceC0494p, interfaceC1398p, j7, i7, 0);
        }
    }

    public static final void b(final InterfaceC1398p interfaceC1398p, C0912t c0912t, final int i7, final int i8) {
        int i9;
        c0912t.Z(694251107);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i7 | 6;
        } else {
            i9 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        }
        if (c0912t.N(i9 & 1, (i9 & 3) != 2)) {
            if (i10 != 0) {
                interfaceC1398p = C1395m.f15634a;
            }
            AbstractC0060d.d(c0912t, AbstractC1383a.a(androidx.compose.foundation.layout.c.i(interfaceC1398p, f4557b, f4556a), C0258f.f4549p));
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(i7, i8) { // from class: M.b

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ int f4528p;

                {
                    this.f4528p = i8;
                }

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iB = C0879c.B(1);
                    AbstractC0260g.b(this.f4527o, (C0912t) obj, iB, this.f4528p);
                    return Y4.o.f8736a;
                }
            };
        }
    }
}
