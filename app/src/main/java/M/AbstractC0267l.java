package M;

import b1.C0622g;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import g1.C0958D;
import g1.C0968j;
import g1.C0969k;
import g1.C0970l;
import g1.C0980v;
import i1.C1059b;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import y0.C1965O;

/* JADX INFO: renamed from: M.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0267l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4623a = 0;

    static {
        float f7 = 40;
        i6.g.d(f7, f7);
    }

    public static final void a(final String str, final InterfaceC1182c interfaceC1182c, final InterfaceC1398p interfaceC1398p, boolean z6, final b1.M m7, final Y y6, final X x6, final boolean z7, int i7, int i8, B2.g gVar, InterfaceC1182c interfaceC1182c2, final C1965O c1965o, n0.d dVar, C0912t c0912t, final int i9) {
        final boolean z8;
        final int i10;
        final int i11;
        final B2.g gVar2;
        final InterfaceC1182c interfaceC1182c3;
        final n0.d dVar2;
        B2.g gVar3;
        int i12;
        int i13;
        InterfaceC1182c interfaceC1182c4;
        n0.d dVar3;
        boolean z9;
        int i14;
        c0912t.Z(2026950908);
        int i15 = i9 | (c0912t.f(str) ? 4 : 2) | (c0912t.h(interfaceC1182c) ? 32 : 16) | 27648 | (c0912t.f(m7) ? 131072 : 65536) | (c0912t.f(x6) ? 8388608 : 4194304) | 268435456;
        int i16 = (c0912t.f(c1965o) ? 16384 : 8192) | 200118;
        if (c0912t.N(i15 & 1, ((306783379 & i15) == 306783378 && (74899 & i16) == 74898) ? false : true)) {
            c0912t.S();
            int i17 = i9 & 1;
            Object obj = C0903o.f11850a;
            if (i17 == 0 || c0912t.x()) {
                int i18 = z7 ? 1 : Integer.MAX_VALUE;
                int i19 = i15 & (-1879048193);
                gVar3 = C0958D.f12324a;
                Object objK = c0912t.K();
                if (objK == obj) {
                    objK = new F.g(6);
                    c0912t.i0(objK);
                }
                i12 = i19;
                i13 = i18;
                interfaceC1182c4 = (InterfaceC1182c) objK;
                dVar3 = AbstractC0270o.f4645a;
                z9 = true;
                i14 = 1;
            } else {
                c0912t.Q();
                i13 = i7;
                i14 = i8;
                gVar3 = gVar;
                interfaceC1182c4 = interfaceC1182c2;
                dVar3 = dVar;
                i12 = i15 & (-1879048193);
                z9 = z6;
            }
            c0912t.q();
            Object objK2 = c0912t.K();
            if (objK2 == obj) {
                objK2 = C0879c.t(new C0980v(0L, str, 6));
                c0912t.i0(objK2);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK2;
            C0980v c0980v = (C0980v) interfaceC0878b0.getValue();
            boolean z10 = z9;
            C0980v c0980v2 = new C0980v(new C0622g(str), c0980v.f12385b, c0980v.f12386c);
            boolean zF = c0912t.f(c0980v2);
            Object objK3 = c0912t.K();
            if (zF || objK3 == obj) {
                objK3 = new G.i(c0980v2, 3, interfaceC0878b0);
                c0912t.i0(objK3);
            }
            C0879c.g((InterfaceC1180a) objK3, c0912t);
            boolean z11 = (i12 & 14) == 4;
            Object objK4 = c0912t.K();
            if (z11 || objK4 == obj) {
                objK4 = C0879c.t(str);
                c0912t.i0(objK4);
            }
            Object obj2 = (InterfaceC0878b0) objK4;
            int i20 = y6.f4493a;
            C0970l c0970l = new C0970l(i20);
            if (i20 == 0) {
                c0970l = null;
            }
            int i21 = c0970l != null ? c0970l.f12368a : 1;
            int i22 = y6.f4494b;
            C0968j c0968j = new C0968j(i22);
            int i23 = i21;
            if (i22 == -1) {
                c0968j = null;
            }
            C0969k c0969k = new C0969k(z7, 0, true, i23, c0968j != null ? c0968j.f12360a : 1, C1059b.f13289q);
            boolean z12 = !z7;
            int i24 = z7 ? 1 : i14;
            int i25 = z7 ? 1 : i13;
            boolean zF2 = c0912t.f(obj2) | ((i12 & 112) == 32);
            Object objK5 = c0912t.K();
            if (zF2 || objK5 == obj) {
                objK5 = new C0265j(interfaceC1182c, interfaceC0878b0, obj2, 0);
                c0912t.i0(objK5);
            }
            gVar2 = gVar3;
            n0.d dVar4 = dVar3;
            interfaceC1182c3 = interfaceC1182c4;
            V.e(c0980v2, (InterfaceC1182c) objK5, interfaceC1398p, m7, gVar2, interfaceC1182c3, c1965o, z12, i25, i24, c0969k, x6, z10, dVar4, c0912t, ((i12 >> 6) & 7168) | 1794432 | ((i16 << 9) & 29360128), ((i12 >> 15) & 896) | 224256);
            z8 = z10;
            dVar2 = dVar4;
            i10 = i13;
            i11 = i14;
        } else {
            c0912t.Q();
            z8 = z6;
            i10 = i7;
            i11 = i8;
            gVar2 = gVar;
            interfaceC1182c3 = interfaceC1182c2;
            dVar2 = dVar;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(str, interfaceC1182c, interfaceC1398p, z8, m7, y6, x6, z7, i10, i11, gVar2, interfaceC1182c3, c1965o, dVar2, i9) { // from class: M.k

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                public final /* synthetic */ C1965O f4603A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                public final /* synthetic */ n0.d f4604B;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f4605o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f4606p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1398p f4607q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ boolean f4608r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ b1.M f4609s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Y f4610t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ X f4611u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f4612v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f4613w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ int f4614x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ B2.g f4615y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f4616z;

                @Override // l5.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iB = C0879c.B(102236545);
                    Y y7 = this.f4610t;
                    X x7 = this.f4611u;
                    C1965O c1965o2 = this.f4603A;
                    n0.d dVar5 = this.f4604B;
                    AbstractC0267l.a(this.f4605o, this.f4606p, this.f4607q, this.f4608r, this.f4609s, y7, x7, this.f4612v, this.f4613w, this.f4614x, this.f4615y, this.f4616z, c1965o2, dVar5, (C0912t) obj3, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }
}
