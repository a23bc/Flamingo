package W;

import D.C0069j;
import M.V;
import O0.AbstractC0299c;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.Y;
import O0.m0;
import Q0.A;
import Q0.A0;
import Q0.AbstractC0347f;
import Q0.InterfaceC0360p;
import Q0.T;
import Y0.t;
import Y0.w;
import Z4.v;
import android.os.Trace;
import b1.C0612H;
import b1.C0613I;
import b1.C0622g;
import b1.M;
import j5.AbstractC1110d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import s5.InterfaceC1438c;
import y0.C1987t;
import y0.InterfaceC1988u;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1397o implements A, InterfaceC0360p, A0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0622g f7691C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public M f7692D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public f1.d f7693E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC1182c f7694F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f7695G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f7696H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f7697I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f7698J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public h f7699K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public InterfaceC1988u f7700L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Map f7701M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public d f7702N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public k f7703O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public l f7704P;

    public m(C0622g c0622g, M m7, f1.d dVar, InterfaceC1182c interfaceC1182c, int i7, boolean z6, int i8, int i9, h hVar, InterfaceC1988u interfaceC1988u) {
        this.f7691C = c0622g;
        this.f7692D = m7;
        this.f7693E = dVar;
        this.f7694F = interfaceC1182c;
        this.f7695G = i7;
        this.f7696H = z6;
        this.f7697I = i8;
        this.f7698J = i9;
        this.f7699K = hVar;
        this.f7700L = interfaceC1988u;
    }

    public final void B0(boolean z6, boolean z7, boolean z8, boolean z9) {
        if (z7 || z8 || z9) {
            d dVarC0 = C0();
            C0622g c0622g = this.f7691C;
            M m7 = this.f7692D;
            f1.d dVar = this.f7693E;
            int i7 = this.f7695G;
            boolean z10 = this.f7696H;
            int i8 = this.f7697I;
            int i9 = this.f7698J;
            dVarC0.f7635a = c0622g;
            boolean zC = m7.c(dVarC0.f7644k);
            dVarC0.f7644k = m7;
            if (!zC) {
                dVarC0.f7649q <<= 2;
                dVarC0.l = null;
                dVarC0.f7646n = null;
                dVarC0.f7648p = -1;
                dVarC0.f7647o = -1;
            }
            dVarC0.f7636b = dVar;
            dVarC0.f7637c = i7;
            dVarC0.f7638d = z10;
            dVarC0.f7639e = i8;
            dVarC0.f7640f = i9;
            dVarC0.f7641g = null;
            dVarC0.f7649q = (dVarC0.f7649q << 2) | 2;
            dVarC0.l = null;
            dVarC0.f7646n = null;
            dVarC0.f7648p = -1;
            dVarC0.f7647o = -1;
        }
        if (this.f15636B) {
            if (z7 || (z6 && this.f7703O != null)) {
                AbstractC0347f.o(this);
            }
            if (z7 || z8 || z9) {
                AbstractC0347f.n(this);
                AbstractC0347f.m(this);
            }
            if (z6) {
                AbstractC0347f.m(this);
            }
        }
    }

    public final d C0() {
        if (this.f7702N == null) {
            this.f7702N = new d(this.f7691C, this.f7692D, this.f7693E, this.f7695G, this.f7696H, this.f7697I, this.f7698J, null);
        }
        d dVar = this.f7702N;
        AbstractC1209k.c(dVar);
        return dVar;
    }

    public final d D0(n1.d dVar) {
        d dVar2;
        l lVar = this.f7704P;
        if (lVar != null && lVar.f7689c && (dVar2 = lVar.f7690d) != null) {
            dVar2.d(dVar);
            return dVar2;
        }
        d dVarC0 = C0();
        dVarC0.d(dVar);
        return dVarC0;
    }

    public final boolean E0(InterfaceC1182c interfaceC1182c, h hVar) {
        boolean z6;
        if (this.f7694F != interfaceC1182c) {
            this.f7694F = interfaceC1182c;
            z6 = true;
        } else {
            z6 = false;
        }
        if (AbstractC1209k.a(this.f7699K, hVar)) {
            return z6;
        }
        this.f7699K = hVar;
        return true;
    }

    public final boolean F0(M m7, int i7, int i8, boolean z6, f1.d dVar, int i9) {
        boolean z7 = !this.f7692D.c(m7);
        this.f7692D = m7;
        if (this.f7698J != i7) {
            this.f7698J = i7;
            z7 = true;
        }
        if (this.f7697I != i8) {
            this.f7697I = i8;
            z7 = true;
        }
        if (this.f7696H != z6) {
            this.f7696H = z6;
            z7 = true;
        }
        if (!AbstractC1209k.a(this.f7693E, dVar)) {
            this.f7693E = dVar;
            z7 = true;
        }
        if (this.f7695G == i9) {
            return z7;
        }
        this.f7695G = i9;
        return true;
    }

    public final boolean G0(C0622g c0622g) {
        boolean zA = AbstractC1209k.a(this.f7691C.f9970p, c0622g.f9970p);
        boolean z6 = (zA && AbstractC1209k.a(this.f7691C.f9969o, c0622g.f9969o)) ? false : true;
        if (z6) {
            this.f7691C = c0622g;
        }
        if (!zA) {
            this.f7704P = null;
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [l5.c] */
    /* JADX WARN: Type inference failed for: r1v2, types: [W.k] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        int i7 = 15;
        k kVar = this.f7703O;
        ?? r12 = kVar;
        if (kVar == null) {
            final int i8 = 0;
            ?? r13 = new InterfaceC1182c(this) { // from class: W.k

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ m f7686p;

                {
                    this.f7686p = this;
                }

                @Override // l5.InterfaceC1182c
                public final Object b(Object obj) {
                    C0613I c0613i;
                    boolean z6;
                    switch (i8) {
                        case 0:
                            List list = (List) obj;
                            m mVar = this.f7686p;
                            C0613I c0613i2 = mVar.C0().f7646n;
                            if (c0613i2 != null) {
                                C0612H c0612h = c0613i2.f9929a;
                                C0622g c0622g = c0612h.f9920a;
                                M m7 = mVar.f7692D;
                                InterfaceC1988u interfaceC1988u = mVar.f7700L;
                                c0613i = new C0613I(new C0612H(c0622g, M.d(m7, interfaceC1988u != null ? interfaceC1988u.a() : C1987t.f20262j, 0L, null, null, 0L, 0, 0L, 16777214), c0612h.f9922c, c0612h.f9923d, c0612h.f9924e, c0612h.f9925f, c0612h.f9926g, c0612h.h, c0612h.f9927i, c0612h.f9928j), c0613i2.f9930b, c0613i2.f9931c);
                                list.add(c0613i);
                            } else {
                                c0613i = null;
                            }
                            return Boolean.valueOf(c0613i != null);
                        case 1:
                            C0622g c0622g2 = (C0622g) obj;
                            m mVar2 = this.f7686p;
                            l lVar = mVar2.f7704P;
                            v vVar = v.f8818o;
                            if (lVar == null) {
                                l lVar2 = new l(mVar2.f7691C, c0622g2);
                                d dVar = new d(c0622g2, mVar2.f7692D, mVar2.f7693E, mVar2.f7695G, mVar2.f7696H, mVar2.f7697I, mVar2.f7698J, vVar);
                                dVar.d(mVar2.C0().f7643j);
                                lVar2.f7690d = dVar;
                                mVar2.f7704P = lVar2;
                            } else if (!AbstractC1209k.a(c0622g2, lVar.f7688b)) {
                                lVar.f7688b = c0622g2;
                                d dVar2 = lVar.f7690d;
                                if (dVar2 != null) {
                                    M m8 = mVar2.f7692D;
                                    f1.d dVar3 = mVar2.f7693E;
                                    int i9 = mVar2.f7695G;
                                    boolean z7 = mVar2.f7696H;
                                    int i10 = mVar2.f7697I;
                                    int i11 = mVar2.f7698J;
                                    dVar2.f7635a = c0622g2;
                                    boolean zC = m8.c(dVar2.f7644k);
                                    dVar2.f7644k = m8;
                                    if (!zC) {
                                        dVar2.f7649q <<= 2;
                                        dVar2.l = null;
                                        dVar2.f7646n = null;
                                        dVar2.f7648p = -1;
                                        dVar2.f7647o = -1;
                                    }
                                    dVar2.f7636b = dVar3;
                                    dVar2.f7637c = i9;
                                    dVar2.f7638d = z7;
                                    dVar2.f7639e = i10;
                                    dVar2.f7640f = i11;
                                    dVar2.f7641g = vVar;
                                    dVar2.f7649q = (dVar2.f7649q << 2) | 2;
                                    dVar2.l = null;
                                    dVar2.f7646n = null;
                                    dVar2.f7648p = -1;
                                    dVar2.f7647o = -1;
                                }
                            }
                            AbstractC0347f.o(mVar2);
                            AbstractC0347f.n(mVar2);
                            AbstractC0347f.m(mVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            m mVar3 = this.f7686p;
                            l lVar3 = mVar3.f7704P;
                            if (lVar3 == null) {
                                z6 = false;
                            } else {
                                if (lVar3 != null) {
                                    lVar3.f7689c = zBooleanValue;
                                }
                                AbstractC0347f.o(mVar3);
                                AbstractC0347f.n(mVar3);
                                AbstractC0347f.m(mVar3);
                                z6 = true;
                            }
                            return Boolean.valueOf(z6);
                    }
                }
            };
            this.f7703O = r13;
            r12 = r13;
        }
        C0622g c0622g = this.f7691C;
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        jVar.i(t.f8515A, I0.c.G(c0622g));
        l lVar = this.f7704P;
        if (lVar != null) {
            C0622g c0622g2 = lVar.f7688b;
            w wVar = t.f8516B;
            InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
            InterfaceC1438c interfaceC1438c = interfaceC1438cArr2[15];
            wVar.a(jVar, c0622g2);
            boolean z6 = lVar.f7689c;
            w wVar2 = t.f8517C;
            InterfaceC1438c interfaceC1438c2 = interfaceC1438cArr2[16];
            wVar2.a(jVar, Boolean.valueOf(z6));
        }
        final int i9 = 1;
        jVar.i(Y0.i.f8458k, new Y0.a(null, new InterfaceC1182c(this) { // from class: W.k

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ m f7686p;

            {
                this.f7686p = this;
            }

            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0613I c0613i;
                boolean z62;
                switch (i9) {
                    case 0:
                        List list = (List) obj;
                        m mVar = this.f7686p;
                        C0613I c0613i2 = mVar.C0().f7646n;
                        if (c0613i2 != null) {
                            C0612H c0612h = c0613i2.f9929a;
                            C0622g c0622g3 = c0612h.f9920a;
                            M m7 = mVar.f7692D;
                            InterfaceC1988u interfaceC1988u = mVar.f7700L;
                            c0613i = new C0613I(new C0612H(c0622g3, M.d(m7, interfaceC1988u != null ? interfaceC1988u.a() : C1987t.f20262j, 0L, null, null, 0L, 0, 0L, 16777214), c0612h.f9922c, c0612h.f9923d, c0612h.f9924e, c0612h.f9925f, c0612h.f9926g, c0612h.h, c0612h.f9927i, c0612h.f9928j), c0613i2.f9930b, c0613i2.f9931c);
                            list.add(c0613i);
                        } else {
                            c0613i = null;
                        }
                        return Boolean.valueOf(c0613i != null);
                    case 1:
                        C0622g c0622g22 = (C0622g) obj;
                        m mVar2 = this.f7686p;
                        l lVar2 = mVar2.f7704P;
                        v vVar = v.f8818o;
                        if (lVar2 == null) {
                            l lVar22 = new l(mVar2.f7691C, c0622g22);
                            d dVar = new d(c0622g22, mVar2.f7692D, mVar2.f7693E, mVar2.f7695G, mVar2.f7696H, mVar2.f7697I, mVar2.f7698J, vVar);
                            dVar.d(mVar2.C0().f7643j);
                            lVar22.f7690d = dVar;
                            mVar2.f7704P = lVar22;
                        } else if (!AbstractC1209k.a(c0622g22, lVar2.f7688b)) {
                            lVar2.f7688b = c0622g22;
                            d dVar2 = lVar2.f7690d;
                            if (dVar2 != null) {
                                M m8 = mVar2.f7692D;
                                f1.d dVar3 = mVar2.f7693E;
                                int i92 = mVar2.f7695G;
                                boolean z7 = mVar2.f7696H;
                                int i10 = mVar2.f7697I;
                                int i11 = mVar2.f7698J;
                                dVar2.f7635a = c0622g22;
                                boolean zC = m8.c(dVar2.f7644k);
                                dVar2.f7644k = m8;
                                if (!zC) {
                                    dVar2.f7649q <<= 2;
                                    dVar2.l = null;
                                    dVar2.f7646n = null;
                                    dVar2.f7648p = -1;
                                    dVar2.f7647o = -1;
                                }
                                dVar2.f7636b = dVar3;
                                dVar2.f7637c = i92;
                                dVar2.f7638d = z7;
                                dVar2.f7639e = i10;
                                dVar2.f7640f = i11;
                                dVar2.f7641g = vVar;
                                dVar2.f7649q = (dVar2.f7649q << 2) | 2;
                                dVar2.l = null;
                                dVar2.f7646n = null;
                                dVar2.f7648p = -1;
                                dVar2.f7647o = -1;
                            }
                        }
                        AbstractC0347f.o(mVar2);
                        AbstractC0347f.n(mVar2);
                        AbstractC0347f.m(mVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m mVar3 = this.f7686p;
                        l lVar3 = mVar3.f7704P;
                        if (lVar3 == null) {
                            z62 = false;
                        } else {
                            if (lVar3 != null) {
                                lVar3.f7689c = zBooleanValue;
                            }
                            AbstractC0347f.o(mVar3);
                            AbstractC0347f.n(mVar3);
                            AbstractC0347f.m(mVar3);
                            z62 = true;
                        }
                        return Boolean.valueOf(z62);
                }
            }
        }));
        final int i10 = 2;
        jVar.i(Y0.i.l, new Y0.a(null, new InterfaceC1182c(this) { // from class: W.k

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ m f7686p;

            {
                this.f7686p = this;
            }

            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0613I c0613i;
                boolean z62;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        m mVar = this.f7686p;
                        C0613I c0613i2 = mVar.C0().f7646n;
                        if (c0613i2 != null) {
                            C0612H c0612h = c0613i2.f9929a;
                            C0622g c0622g3 = c0612h.f9920a;
                            M m7 = mVar.f7692D;
                            InterfaceC1988u interfaceC1988u = mVar.f7700L;
                            c0613i = new C0613I(new C0612H(c0622g3, M.d(m7, interfaceC1988u != null ? interfaceC1988u.a() : C1987t.f20262j, 0L, null, null, 0L, 0, 0L, 16777214), c0612h.f9922c, c0612h.f9923d, c0612h.f9924e, c0612h.f9925f, c0612h.f9926g, c0612h.h, c0612h.f9927i, c0612h.f9928j), c0613i2.f9930b, c0613i2.f9931c);
                            list.add(c0613i);
                        } else {
                            c0613i = null;
                        }
                        return Boolean.valueOf(c0613i != null);
                    case 1:
                        C0622g c0622g22 = (C0622g) obj;
                        m mVar2 = this.f7686p;
                        l lVar2 = mVar2.f7704P;
                        v vVar = v.f8818o;
                        if (lVar2 == null) {
                            l lVar22 = new l(mVar2.f7691C, c0622g22);
                            d dVar = new d(c0622g22, mVar2.f7692D, mVar2.f7693E, mVar2.f7695G, mVar2.f7696H, mVar2.f7697I, mVar2.f7698J, vVar);
                            dVar.d(mVar2.C0().f7643j);
                            lVar22.f7690d = dVar;
                            mVar2.f7704P = lVar22;
                        } else if (!AbstractC1209k.a(c0622g22, lVar2.f7688b)) {
                            lVar2.f7688b = c0622g22;
                            d dVar2 = lVar2.f7690d;
                            if (dVar2 != null) {
                                M m8 = mVar2.f7692D;
                                f1.d dVar3 = mVar2.f7693E;
                                int i92 = mVar2.f7695G;
                                boolean z7 = mVar2.f7696H;
                                int i102 = mVar2.f7697I;
                                int i11 = mVar2.f7698J;
                                dVar2.f7635a = c0622g22;
                                boolean zC = m8.c(dVar2.f7644k);
                                dVar2.f7644k = m8;
                                if (!zC) {
                                    dVar2.f7649q <<= 2;
                                    dVar2.l = null;
                                    dVar2.f7646n = null;
                                    dVar2.f7648p = -1;
                                    dVar2.f7647o = -1;
                                }
                                dVar2.f7636b = dVar3;
                                dVar2.f7637c = i92;
                                dVar2.f7638d = z7;
                                dVar2.f7639e = i102;
                                dVar2.f7640f = i11;
                                dVar2.f7641g = vVar;
                                dVar2.f7649q = (dVar2.f7649q << 2) | 2;
                                dVar2.l = null;
                                dVar2.f7646n = null;
                                dVar2.f7648p = -1;
                                dVar2.f7647o = -1;
                            }
                        }
                        AbstractC0347f.o(mVar2);
                        AbstractC0347f.n(mVar2);
                        AbstractC0347f.m(mVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m mVar3 = this.f7686p;
                        l lVar3 = mVar3.f7704P;
                        if (lVar3 == null) {
                            z62 = false;
                        } else {
                            if (lVar3 != null) {
                                lVar3.f7689c = zBooleanValue;
                            }
                            AbstractC0347f.o(mVar3);
                            AbstractC0347f.n(mVar3);
                            AbstractC0347f.m(mVar3);
                            z62 = true;
                        }
                        return Boolean.valueOf(z62);
                }
            }
        }));
        jVar.i(Y0.i.f8459m, new Y0.a(null, new E3.e(i7, this)));
        Y0.v.a(jVar, r12);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    @Override // Q0.InterfaceC0360p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(Q0.N r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.m.a(Q0.N):void");
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A
    public final int c(T t7, Y y6, int i7) {
        return D0(t7).a(i7, t7.getLayoutDirection());
    }

    @Override // Q0.A
    public final int d(T t7, Y y6, int i7) {
        return V.k(D0(t7).e(t7.getLayoutDirection()).a());
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            d dVarD0 = D0(interfaceC0298b0);
            boolean zC = dVarD0.c(j3, interfaceC0298b0.getLayoutDirection());
            C0613I c0613i = dVarD0.f7646n;
            if (c0613i == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dVarD0);
            }
            c0613i.f9930b.f9987a.b();
            if (zC) {
                AbstractC0347f.v(this, 2).Q0();
                InterfaceC1182c interfaceC1182c = this.f7694F;
                if (interfaceC1182c != null) {
                    interfaceC1182c.b(c0613i);
                }
                h hVar = this.f7699K;
                if (hVar != null) {
                    hVar.b(c0613i);
                }
                Map linkedHashMap = this.f7701M;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(AbstractC0299c.f5374a, Integer.valueOf(Math.round(c0613i.f9932d)));
                linkedHashMap.put(AbstractC0299c.f5375b, Integer.valueOf(Math.round(c0613i.f9933e)));
                this.f7701M = linkedHashMap;
            }
            long j7 = c0613i.f9931c;
            int i7 = (int) (j7 >> 32);
            int i8 = (int) (j7 & 4294967295L);
            m0 m0VarD = y6.d(AbstractC1110d.y(i7, i7, i8, i8));
            Map map = this.f7701M;
            AbstractC1209k.c(map);
            InterfaceC0296a0 interfaceC0296a0K = interfaceC0298b0.k(i7, i8, map, new C0069j(m0VarD, 7));
            Trace.endSection();
            return interfaceC0296a0K;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // Q0.A
    public final int g(T t7, Y y6, int i7) {
        return D0(t7).a(i7, t7.getLayoutDirection());
    }

    @Override // Q0.A
    public final int h(T t7, Y y6, int i7) {
        return V.k(D0(t7).e(t7.getLayoutDirection()).c());
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }
}
