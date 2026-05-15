package R;

import D.AbstractC0074o;
import D.C0078t;
import D.C0080v;
import M.C0265j;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.D;
import f0.W;
import k.I;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import o5.AbstractC1267a;
import r0.C1395m;
import r0.InterfaceC1398p;
import r1.C1405D;
import y.AbstractC1949e;
import y.AbstractC1950f;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a */
    public static final C1405D f6206a = new C1405D(14);

    public static final void a(P.g gVar, P.c cVar, C0912t c0912t, int i7) {
        C0912t c0912t2;
        Context context;
        c0912t.Z(1904307118);
        int i8 = (c0912t.f(gVar) ? 4 : 2) | i7 | (c0912t.h(cVar) ? 32 : 16);
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c0912t.X(-1009462744);
                context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
                c0912t.p(false);
            } else {
                c0912t.X(-1009413640);
                c0912t.p(false);
                context = null;
            }
            boolean zH = c0912t.h(cVar) | ((i8 & 14) == 4) | c0912t.h(context);
            Object objK = c0912t.K();
            if (zH || objK == C0903o.f11850a) {
                objK = new C0265j(cVar, context, gVar, 4);
                c0912t.i0(objK);
            }
            c0912t2 = c0912t;
            AbstractC1950f.b(null, null, (InterfaceC1182c) objK, c0912t2, 0, 3);
        } else {
            c0912t2 = c0912t;
            c0912t2.Q();
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(gVar, cVar, i7, 5);
        }
    }

    public static final void b(final int i7, final long j3, C0912t c0912t, final int i8) {
        int i9;
        final int i10;
        final long j7;
        final int i11;
        c0912t.Z(-1240244237);
        if ((i8 & 6) == 0) {
            i9 = (c0912t.d(i7) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= c0912t.e(j3) ? 32 : 16;
        }
        if (c0912t.N(i9 & 1, (i9 & 19) != 18)) {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            boolean zF = ((i9 & 14) == 4) | c0912t.f(context);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (zF || objK == obj) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i7}).getResourceId(0, -1));
                c0912t.i0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                C0915u0 c0915u0R = c0912t.r();
                if (c0915u0R != null) {
                    final int i12 = 0;
                    c0915u0R.f11932d = new l5.e() { // from class: R.m
                        @Override // l5.e
                        public final Object invoke(Object obj2, Object obj3) {
                            int i13 = i12;
                            C0912t c0912t2 = (C0912t) obj2;
                            ((Integer) obj3).getClass();
                            switch (i13) {
                                case 0:
                                    p.b(i7, j3, c0912t2, C0879c.B(i8 | 1));
                                    break;
                                default:
                                    p.b(i7, j3, c0912t2, C0879c.B(i8 | 1));
                                    break;
                            }
                            return Y4.o.f8736a;
                        }
                    };
                    return;
                }
                return;
            }
            j7 = j3;
            i10 = i7;
            i11 = i8;
            D0.b bVarB = AbstractC1267a.B(iIntValue, c0912t);
            boolean z6 = (i9 & 112) == 32;
            Object objK2 = c0912t.K();
            if (z6 || objK2 == obj) {
                objK2 = j7 == 16 ? null : new C1980m(j7, 5);
                c0912t.i0(objK2);
            }
            AbstractC0074o.a(androidx.compose.ui.draw.a.d(androidx.compose.foundation.layout.c.g(C1395m.f15634a, AbstractC1949e.f20163j), bVarB, 0.0f, (C1980m) objK2, 22), c0912t, 0);
        } else {
            i10 = i7;
            j7 = j3;
            i11 = i8;
            c0912t.Q();
        }
        C0915u0 c0915u0R2 = c0912t.r();
        if (c0915u0R2 != null) {
            final int i13 = 1;
            c0915u0R2.f11932d = new l5.e() { // from class: R.m
                @Override // l5.e
                public final Object invoke(Object obj2, Object obj3) {
                    int i132 = i13;
                    C0912t c0912t2 = (C0912t) obj2;
                    ((Integer) obj3).getClass();
                    switch (i132) {
                        case 0:
                            p.b(i10, j7, c0912t2, C0879c.B(i11 | 1));
                            break;
                        default:
                            p.b(i10, j7, c0912t2, C0879c.B(i11 | 1));
                            break;
                    }
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void c(P.g gVar, T.e eVar, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(-2040393164);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? c0912t.f(gVar) : c0912t.h(gVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= (i7 & 64) == 0 ? c0912t.f(eVar) : c0912t.h(eVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(interfaceC1180a) ? 256 : 128;
        }
        boolean z6 = true;
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            boolean z7 = (i8 & 112) == 32 || ((i8 & 64) != 0 && c0912t.f(eVar));
            Object objK = c0912t.K();
            W w7 = C0903o.f11850a;
            if (z7 || objK == w7) {
                objK = new r(new I(23, new G.i(eVar, 5, interfaceC1180a)));
                c0912t.i0(objK);
            }
            r rVar = (r) objK;
            if ((i8 & 14) != 4 && ((i8 & 8) == 0 || !c0912t.h(gVar))) {
                z6 = false;
            }
            Object objK2 = c0912t.K();
            if (z6 || objK2 == w7) {
                objK2 = new E3.e(8, gVar);
                c0912t.i0(objK2);
            }
            r1.n.a(rVar, (InterfaceC1180a) objK2, f6206a, n0.e.e(1315155414, new C0080v(eVar, 3, gVar), c0912t), c0912t, 3456, 0);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new H.I(i7, 2, gVar, eVar, interfaceC1180a);
        }
    }

    public static final void d(InterfaceC1398p interfaceC1398p, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(1392105195);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(dVar) ? 32 : 16;
        }
        if (c0912t.N(1 & i8, (i8 & 19) != 18)) {
            D d4 = T.g.f6845a;
            n0.d dVar2 = l.f6197a;
            N5.l.h(interfaceC1398p, d4, dVar, c0912t, ((i8 << 6) & 7168) | (i8 & 14) | 432);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i(interfaceC1398p, dVar, i7, 2);
        }
    }
}
