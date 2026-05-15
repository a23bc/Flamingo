package M;

import A2.AbstractC0002c;
import Q0.AbstractC0347f;
import R0.C0391k0;
import U5.C0438j;
import U5.C0447t;
import X.C0490n;
import X.InterfaceC0488m;
import X.K0;
import X.N0;
import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import b1.C0608D;
import b1.C0612H;
import b1.C0613I;
import b1.C0622g;
import b1.C0630o;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0888g0;
import f0.InterfaceC0878b0;
import f0.Z0;
import g1.C0956B;
import g1.C0959a;
import g1.C0980v;
import h6.J0;
import j5.AbstractC1110d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1216r;
import m5.C1220v;
import o0.C1248e;
import o0.C1249f;
import o0.C1254k;
import t.C1441C;
import t.C1444F;
import w.C1670c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;
import x0.C1893c;
import y.AbstractC1946b;
import y.C1948d;
import y0.AbstractC1983p;
import y0.C1960J;
import y0.C1962L;
import y0.C1987t;
import y0.InterfaceC1985r;
import yos.music.player.data.libraries.Folder;
import yos.music.player.ui.settingpages.others.Library;
import z.C2039h;
import z.C2060s;
import z.M0;
import z.P0;
import z.t1;

/* JADX INFO: renamed from: M.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0265j implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4599o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f4600p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f4601q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f4602r;

    public /* synthetic */ C0265j(InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, Object obj, int i7) {
        this.f4599o = i7;
        this.f4601q = interfaceC0878b0;
        this.f4602r = interfaceC0878b02;
        this.f4600p = obj;
    }

    private final Object e(Object obj) {
        F.u uVar = (F.u) obj;
        List list = (List) this.f4600p;
        e.i iVar = (e.i) this.f4601q;
        AbstractC1209k.f(iVar, "$directoryLauncher");
        y3.x xVar = (y3.x) this.f4602r;
        AbstractC1209k.f(xVar, "$navController");
        AbstractC1209k.f(uVar, "$this$Title");
        if (Build.VERSION.SDK_INT >= 29) {
            A0.e.z(uVar, null, p6.b.f15104a, 3);
        }
        new v6.l(uVar).b(list.size(), null, new J0(7, list), new n0.d(2039820996, new C0447t(list, iVar, xVar, list, 2), true));
        return Y4.o.f8736a;
    }

    private final Object f(Object obj) {
        F.u uVar = (F.u) obj;
        Context context = (Context) this.f4602r;
        AbstractC1209k.f(context, "$context");
        AbstractC1209k.f(uVar, "$this$Title");
        String str = (String) this.f4600p;
        if (str != null) {
            A0.e.z(uVar, null, new n0.d(2128001928, new C0438j(str, 5), true), 3);
        } else {
            Iterable iterable = (List) this.f4601q;
            if (iterable == null) {
                iterable = Z4.v.f8818o;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (hashSet.add(((Library) obj2).getUniqueId())) {
                    arrayList.add(obj2);
                }
            }
            v6.E.b(uVar, new D.h0(Z4.n.G0(arrayList, new q6.c()), 25, context));
        }
        return Y4.o.f8736a;
    }

    private final Object i(Object obj) {
        O0.l0 l0Var = (O0.l0) obj;
        C1220v c1220v = (C1220v) this.f4600p;
        C1220v c1220v2 = (C1220v) this.f4601q;
        C0888g0 c0888g0 = (C0888g0) this.f4602r;
        AbstractC1209k.f(c0888g0, "$xOffset$delegate");
        AbstractC1209k.f(l0Var, "$this$layout");
        O0.l0.h(l0Var, (O0.m0) c1220v.f14439o, c0888g0.h(), 0);
        Y4.h hVar = (Y4.h) c1220v2.f14439o;
        if (hVar != null) {
            O0.l0.h(l0Var, (O0.m0) hVar.f8726o, ((Number) hVar.f8727p).intValue(), 0);
        }
        return Y4.o.f8736a;
    }

    private final Object j(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        C2039h c2039h = (C2039h) this.f4600p;
        float f7 = c2039h.f20844E ? 1.0f : -1.0f;
        P0 p02 = c2039h.f20843D;
        long jE = p02.e(p02.h(f7 * fFloatValue));
        P0 p03 = ((M0) this.f4602r).f20688a;
        float fG = p02.g(p02.e(p03.c(p03.f20720k, jE, 1))) * f7;
        if (Math.abs(fG) < Math.abs(fFloatValue)) {
            String str = "Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')';
            InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) this.f4601q;
            CancellationException cancellationException = new CancellationException(str);
            cancellationException.initCause(null);
            interfaceC1786g0.c(cancellationException);
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) throws Throwable {
        AbstractC1983p abstractC1983pC;
        m1.n nVar;
        C0630o c0630o;
        InterfaceC1985r interfaceC1985r;
        Integer numD;
        Integer numE;
        Integer numE2;
        Integer numD2;
        C0613I c0613i;
        C0613I c0613i2;
        E0 e02;
        E0 e03;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        C0613I c0613i3;
        C0613I c0613i4;
        E0 e04;
        E0 e05;
        C0980v c0980v;
        V.o oVar;
        C0980v c0980v2;
        C0391k0 c0391k0;
        n0.d dVar = null;
        int i7 = 0;
        Y4.o oVar2 = Y4.o.f8736a;
        Object obj2 = this.f4602r;
        Object obj3 = this.f4601q;
        Object obj4 = this.f4600p;
        switch (this.f4599o) {
            case 0:
                C0980v c0980v3 = (C0980v) obj;
                ((InterfaceC0878b0) obj3).setValue(c0980v3);
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) obj2;
                boolean zA = AbstractC1209k.a((String) interfaceC0878b0.getValue(), c0980v3.f12384a.f9970p);
                C0622g c0622g = c0980v3.f12384a;
                interfaceC0878b0.setValue(c0622g.f9970p);
                if (!zA) {
                    ((InterfaceC1182c) obj4).b(c0622g.f9970p);
                }
                return oVar2;
            case 1:
                A0.f fVar = (A0.f) obj;
                Z z6 = (Z) obj4;
                E0 e0D = z6.d();
                if (e0D != null) {
                    InterfaceC1985r interfaceC1985rS = fVar.A().S();
                    long j3 = ((b1.L) z6.f4495A.getValue()).f9945a;
                    long j7 = ((b1.L) z6.f4496B.getValue()).f9945a;
                    long j8 = z6.f4520z;
                    boolean zC = b1.L.c(j3);
                    C0613I c0613i5 = e0D.f4386a;
                    w2.l lVar = z6.f4519y;
                    B2.m mVar = (B2.m) obj2;
                    C0612H c0612h = c0613i5.f9929a;
                    if (!zC) {
                        lVar.h(j8);
                        int iF = b1.L.f(j3);
                        mVar.a(iF);
                        int iE = b1.L.e(j3);
                        mVar.a(iE);
                        if (iF != iE) {
                            interfaceC1985rS.e(c0613i5.j(iF, iE), lVar);
                        }
                    } else if (b1.L.c(j7)) {
                        long j9 = ((C0980v) obj3).f12385b;
                        if (!b1.L.c(j9)) {
                            lVar.h(j8);
                            int iF2 = b1.L.f(j9);
                            mVar.a(iF2);
                            int iE2 = b1.L.e(j9);
                            mVar.a(iE2);
                            if (iF2 != iE2) {
                                interfaceC1985rS.e(c0613i5.j(iF2, iE2), lVar);
                            }
                        }
                    } else {
                        long jB = c0612h.f9921b.b();
                        C1987t c1987t = jB == 16 ? null : new C1987t(jB);
                        long j10 = c1987t != null ? c1987t.f20264a : C1987t.f20255b;
                        lVar.h(C1987t.b(j10, C1987t.d(j10) * 0.2f));
                        int iF3 = b1.L.f(j7);
                        mVar.a(iF3);
                        int iE3 = b1.L.e(j7);
                        mVar.a(iE3);
                        if (iF3 != iE3) {
                            interfaceC1985rS.e(c0613i5.j(iF3, iE3), lVar);
                        }
                    }
                    boolean z7 = c0613i5.d() && c0612h.f9925f != 3;
                    if (z7) {
                        long j11 = c0613i5.f9931c;
                        C1893c c1893cO = AbstractC1113a.o(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                        interfaceC1985rS.l();
                        interfaceC1985rS.a(c1893cO);
                    }
                    C0608D c0608d = c0612h.f9921b.f9947a;
                    m1.l lVar2 = c0608d.f9910m;
                    m1.o oVar3 = c0608d.f9900a;
                    if (lVar2 == null) {
                        lVar2 = m1.l.f14345b;
                    }
                    m1.l lVar3 = lVar2;
                    C1962L c1962l = c0608d.f9911n;
                    if (c1962l == null) {
                        c1962l = C1962L.f20207d;
                    }
                    C1962L c1962l2 = c1962l;
                    A0.d dVar2 = c0608d.f9912o;
                    if (dVar2 == null) {
                        dVar2 = A0.h.f59b;
                    }
                    A0.d dVar3 = dVar2;
                    try {
                        abstractC1983pC = oVar3.c();
                        nVar = m1.n.f14350a;
                        c0630o = c0613i5.f9930b;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (abstractC1983pC != null) {
                            interfaceC1985r = interfaceC1985rS;
                            c0630o.j(interfaceC1985r, abstractC1983pC, oVar3 != nVar ? oVar3.a() : 1.0f, c1962l2, lVar3, dVar3);
                        } else {
                            interfaceC1985r = interfaceC1985rS;
                            c0630o.i(interfaceC1985r, oVar3 != nVar ? oVar3.b() : C1987t.f20255b, c1962l2, lVar3, dVar3);
                        }
                        if (z7) {
                            interfaceC1985r.k();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z7) {
                            interfaceC1985rS.k();
                        }
                        throw th;
                    }
                }
                return oVar2;
            case 2:
                C0956B c0956b = (C0956B) ((C1220v) obj2).f14439o;
                C0980v c0980vU = ((V1.a) obj4).u((List) obj);
                if (c0956b != null) {
                    c0956b.a(null, c0980vU);
                }
                ((C0276v) obj3).b(c0980vU);
                return oVar2;
            case 3:
                X.z0 z0Var = (X.z0) obj;
                C1216r c1216r = (C1216r) obj2;
                q0 q0Var = (q0) obj3;
                switch (p0.f4651a[((Q) obj4).ordinal()]) {
                    case 1:
                        q0Var.f4659b.d(false);
                        return oVar2;
                    case 2:
                        q0Var.f4659b.o();
                        return oVar2;
                    case 3:
                        q0Var.f4659b.f();
                        return oVar2;
                    case 4:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (b1.L.c(z0Var.f8220f)) {
                                z0Var.i();
                            } else if (z0Var.f()) {
                                int iF4 = b1.L.f(z0Var.f8220f);
                                z0Var.q(iF4, iF4);
                            } else {
                                int iE4 = b1.L.e(z0Var.f8220f);
                                z0Var.q(iE4, iE4);
                            }
                        }
                        return oVar2;
                    case 5:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (b1.L.c(z0Var.f8220f)) {
                                z0Var.m();
                            } else if (z0Var.f()) {
                                int iE5 = b1.L.e(z0Var.f8220f);
                                z0Var.q(iE5, iE5);
                            } else {
                                int iF5 = b1.L.f(z0Var.f8220f);
                                z0Var.q(iF5, iF5);
                            }
                        }
                        return oVar2;
                    case 6:
                        X.P0 p02 = z0Var.f8219e;
                        p02.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                p02.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numE = z0Var.e()) != null) {
                                    int iIntValue = numE.intValue();
                                    z0Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                p02.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numD = z0Var.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    z0Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return oVar2;
                    case 7:
                        X.P0 p03 = z0Var.f8219e;
                        p03.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                p03.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numD2 = z0Var.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    z0Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                p03.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numE2 = z0Var.e()) != null) {
                                    int iIntValue4 = numE2.intValue();
                                    z0Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return oVar2;
                    case 8:
                        z0Var.l();
                        return oVar2;
                    case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                        z0Var.j();
                        return oVar2;
                    case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        if (z0Var.f8221g.f9970p.length() > 0 && (c0613i = z0Var.f8217c) != null) {
                            int iG = z0Var.g(c0613i, -1);
                            z0Var.q(iG, iG);
                        }
                        return oVar2;
                    case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        if (z0Var.f8221g.f9970p.length() > 0 && (c0613i2 = z0Var.f8217c) != null) {
                            int iG2 = z0Var.g(c0613i2, 1);
                            z0Var.q(iG2, iG2);
                        }
                        return oVar2;
                    case 12:
                        if (z0Var.f8221g.f9970p.length() > 0 && (e02 = z0Var.f8222i) != null) {
                            int iH = z0Var.h(e02, -1);
                            z0Var.q(iH, iH);
                        }
                        return oVar2;
                    case 13:
                        if (z0Var.f8221g.f9970p.length() > 0 && (e03 = z0Var.f8222i) != null) {
                            int iH2 = z0Var.h(e03, 1);
                            z0Var.q(iH2, iH2);
                        }
                        return oVar2;
                    case 14:
                        z0Var.o();
                        return oVar2;
                    case 15:
                        z0Var.n();
                        return oVar2;
                    case 16:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                z0Var.o();
                            } else {
                                z0Var.n();
                            }
                        }
                        return oVar2;
                    case 17:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                z0Var.n();
                            } else {
                                z0Var.o();
                            }
                        }
                        return oVar2;
                    case 18:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            z0Var.q(0, 0);
                        }
                        return oVar2;
                    case 19:
                        z0Var.f8219e.f7982a = null;
                        C0622g c0622g2 = z0Var.f8221g;
                        if (c0622g2.f9970p.length() > 0) {
                            int length = c0622g2.f9970p.length();
                            z0Var.q(length, length);
                        }
                        return oVar2;
                    case BuildConfig.API_VERSION /* 20 */:
                        List listA = z0Var.a(new F.g(9));
                        if (listA != null) {
                            q0Var.a(listA);
                        }
                        return oVar2;
                    case 21:
                        List listA2 = z0Var.a(new F.g(10));
                        if (listA2 != null) {
                            q0Var.a(listA2);
                        }
                        return oVar2;
                    case 22:
                        List listA3 = z0Var.a(new F.g(11));
                        if (listA3 != null) {
                            q0Var.a(listA3);
                        }
                        return oVar2;
                    case 23:
                        List listA4 = z0Var.a(new F.g(12));
                        if (listA4 != null) {
                            q0Var.a(listA4);
                        }
                        return oVar2;
                    case 24:
                        List listA5 = z0Var.a(new F.g(13));
                        if (listA5 != null) {
                            q0Var.a(listA5);
                        }
                        return oVar2;
                    case 25:
                        List listA6 = z0Var.a(new F.g(14));
                        if (listA6 != null) {
                            q0Var.a(listA6);
                        }
                        return oVar2;
                    case 26:
                        if (q0Var.f4662e) {
                            C0276v c0276v = q0Var.f4658a.f4518x;
                            c0276v.getClass();
                            c1216r.f14435o = c0276v.f4713p.f4512r.b(q0Var.l);
                        } else {
                            q0Var.a(I0.c.G(new C0959a("\n", 1)));
                        }
                        return oVar2;
                    case 27:
                        if (q0Var.f4662e) {
                            c1216r.f14435o = false;
                        } else {
                            q0Var.a(I0.c.G(new C0959a("\t", 1)));
                        }
                        return oVar2;
                    case 28:
                        z0Var.f8219e.f7982a = null;
                        C0622g c0622g3 = z0Var.f8221g;
                        if (c0622g3.f9970p.length() > 0) {
                            z0Var.q(0, c0622g3.f9970p.length());
                        }
                        return oVar2;
                    case 29:
                        z0Var.i();
                        z0Var.p();
                        return oVar2;
                    case 30:
                        z0Var.m();
                        z0Var.p();
                        return oVar2;
                    case 31:
                        X.P0 p04 = z0Var.f8219e;
                        p04.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                p04.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numE3 = z0Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    z0Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                p04.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numD3 = z0Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    z0Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        z0Var.p();
                        return oVar2;
                    case 32:
                        X.P0 p05 = z0Var.f8219e;
                        p05.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                p05.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numD4 = z0Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    z0Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                p05.f7982a = null;
                                if (z0Var.f8221g.f9970p.length() > 0 && (numE4 = z0Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    z0Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        z0Var.p();
                        return oVar2;
                    case 33:
                        z0Var.l();
                        z0Var.p();
                        return oVar2;
                    case 34:
                        z0Var.j();
                        z0Var.p();
                        return oVar2;
                    case 35:
                        z0Var.o();
                        z0Var.p();
                        return oVar2;
                    case 36:
                        z0Var.n();
                        z0Var.p();
                        return oVar2;
                    case 37:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                z0Var.o();
                            } else {
                                z0Var.n();
                            }
                        }
                        z0Var.p();
                        return oVar2;
                    case 38:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            if (z0Var.f()) {
                                z0Var.n();
                            } else {
                                z0Var.o();
                            }
                        }
                        z0Var.p();
                        return oVar2;
                    case 39:
                        if (z0Var.f8221g.f9970p.length() > 0 && (c0613i3 = z0Var.f8217c) != null) {
                            int iG3 = z0Var.g(c0613i3, -1);
                            z0Var.q(iG3, iG3);
                        }
                        z0Var.p();
                        return oVar2;
                    case 40:
                        if (z0Var.f8221g.f9970p.length() > 0 && (c0613i4 = z0Var.f8217c) != null) {
                            int iG4 = z0Var.g(c0613i4, 1);
                            z0Var.q(iG4, iG4);
                        }
                        z0Var.p();
                        return oVar2;
                    case 41:
                        if (z0Var.f8221g.f9970p.length() > 0 && (e04 = z0Var.f8222i) != null) {
                            int iH3 = z0Var.h(e04, -1);
                            z0Var.q(iH3, iH3);
                        }
                        z0Var.p();
                        return oVar2;
                    case 42:
                        if (z0Var.f8221g.f9970p.length() > 0 && (e05 = z0Var.f8222i) != null) {
                            int iH4 = z0Var.h(e05, 1);
                            z0Var.q(iH4, iH4);
                        }
                        z0Var.p();
                        return oVar2;
                    case 43:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            z0Var.q(0, 0);
                        }
                        z0Var.p();
                        return oVar2;
                    case 44:
                        z0Var.f8219e.f7982a = null;
                        C0622g c0622g4 = z0Var.f8221g;
                        if (c0622g4.f9970p.length() > 0) {
                            int length2 = c0622g4.f9970p.length();
                            z0Var.q(length2, length2);
                        }
                        z0Var.p();
                        return oVar2;
                    case 45:
                        z0Var.f8219e.f7982a = null;
                        if (z0Var.f8221g.f9970p.length() > 0) {
                            long j12 = z0Var.f8220f;
                            int i8 = b1.L.f9944c;
                            int i9 = (int) (j12 & 4294967295L);
                            z0Var.q(i9, i9);
                        }
                        return oVar2;
                    case 46:
                        F0 f02 = q0Var.h;
                        if (f02 != null) {
                            f02.a(C0980v.a(z0Var.h, z0Var.f8221g, z0Var.f8220f, 4));
                        }
                        F0 f03 = q0Var.h;
                        if (f03 != null) {
                            V.o oVar4 = f03.f4392a;
                            if (oVar4 == null || (oVar = (V.o) oVar4.f7342p) == null) {
                                c0980v = null;
                            } else {
                                f03.f4392a = oVar;
                                f03.f4394c -= ((C0980v) oVar4.f7343q).f12384a.f9970p.length();
                                f03.f4393b = new V.o(f03.f4393b, 20, (C0980v) oVar4.f7343q);
                                c0980v = (C0980v) oVar.f7343q;
                            }
                            if (c0980v != null) {
                                q0Var.f4667k.b(c0980v);
                            }
                        }
                        return oVar2;
                    case 47:
                        F0 f04 = q0Var.h;
                        if (f04 != null) {
                            V.o oVar5 = f04.f4393b;
                            if (oVar5 != null) {
                                f04.f4393b = (V.o) oVar5.f7342p;
                                C0980v c0980v4 = (C0980v) oVar5.f7343q;
                                f04.f4392a = new V.o(f04.f4392a, 20, c0980v4);
                                f04.f4394c = c0980v4.f12384a.f9970p.length() + f04.f4394c;
                                c0980v2 = (C0980v) oVar5.f7343q;
                            } else {
                                c0980v2 = null;
                            }
                            if (c0980v2 != null) {
                                q0Var.f4667k.b(c0980v2);
                            }
                        }
                        return oVar2;
                    case 48:
                    case 49:
                        return oVar2;
                    default:
                        throw new A2.W();
                }
            case 4:
                C1948d c1948d = (C1948d) obj;
                ?? r32 = ((P.c) obj4).f5689a;
                int size = r32.size();
                int i10 = 0;
                while (i10 < size) {
                    P.b bVar = (P.b) r32.get(i10);
                    if (bVar instanceof P.d) {
                        P.d dVar4 = (P.d) bVar;
                        C1948d.b(c1948d, new R.n(i7, dVar4), ((P.d) bVar).f5691c == 0 ? dVar : new n0.d(-1930700965, new D.B0(3, dVar4), true), new G.i(dVar4, 6, (P.g) obj2), 6);
                    } else {
                        if (bVar instanceof P.h) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                P.h hVar = (P.h) bVar;
                                Context context = (Context) obj3;
                                if (context != null) {
                                    int i11 = hVar.f5700c;
                                    TextClassification textClassification = hVar.f5699b;
                                    if (i11 < 0) {
                                        R.n nVar2 = new R.n(1, textClassification);
                                        Drawable icon = textClassification.getIcon();
                                        C1948d.b(c1948d, nVar2, icon != null ? new n0.d(-1123224187, new D.B0(4, icon), true) : null, new G.i(context, 7, textClassification), 6);
                                    } else {
                                        RemoteAction remoteActionD = AbstractC0002c.d(textClassification.getActions().get(i11));
                                        C1948d.b(c1948d, new R.n(2, remoteActionD), ((i11 == 0) || remoteActionD.shouldShowIcon()) ? new n0.d(-1261173016, new D.B0(5, remoteActionD), true) : null, new E3.e(9, remoteActionD), 6);
                                    }
                                }
                            }
                        } else if (bVar instanceof P.f) {
                            c1948d.getClass();
                            c1948d.f20154a.add(AbstractC1946b.f20148a);
                        }
                        i10++;
                        i7 = 0;
                        dVar = null;
                    }
                    i10++;
                    i7 = 0;
                    dVar = null;
                }
                return oVar2;
            case 5:
                X.B b7 = (X.B) obj;
                int length3 = b7.f7878f.f9929a.f9920a.f9970p.length();
                ((C0490n) obj4).getClass();
                C0490n.n((C1441C) obj3, (X.E) obj2, b7, 0, length3);
                return oVar2;
            case 6:
                K0.u uVar = (K0.u) obj;
                if (((InterfaceC0488m) obj4).c(uVar.f3912c, (X.F) obj3)) {
                    uVar.a();
                    ((C1216r) obj2).f14435o = true;
                }
                return oVar2;
            case 7:
                O.a aVar = (O.a) obj;
                aVar.a();
                EnumC0263h0 enumC0263h0 = EnumC0263h0.f4583r;
                K0 k02 = (K0) obj4;
                boolean z8 = !b1.L.c(k02.m().f12385b) && ((Boolean) k02.l.getValue()).booleanValue();
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) obj3;
                G.i iVar = new G.i(new X.B0(k02, null, 1), interfaceC1765B);
                Context context2 = (Context) obj2;
                Resources resources = context2.getResources();
                D.h0 h0Var = new D.h0(iVar, 16, null);
                C1444F c1444f = aVar.f5273a;
                if (z8) {
                    c1444f.a(new P.d(P.e.f5693a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, h0Var));
                }
                EnumC0263h0 enumC0263h02 = EnumC0263h0.f4583r;
                boolean zC2 = b1.L.c(k02.m().f12385b);
                G.i iVar2 = new G.i(new X.B0(k02, null, 2), interfaceC1765B);
                Resources resources2 = context2.getResources();
                D.h0 h0Var2 = new D.h0(iVar2, 16, null);
                if (!zC2) {
                    c1444f.a(new P.d(P.e.f5694b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, h0Var2));
                }
                EnumC0263h0 enumC0263h03 = EnumC0263h0.f4583r;
                boolean z9 = ((Boolean) k02.l.getValue()).booleanValue() && (c0391k0 = (C0391k0) k02.f7959w.getValue()) != null && c0391k0.f6475a.getDescription().hasMimeType("text/*");
                G.i iVar3 = new G.i(new X.B0(k02, null, 3), interfaceC1765B);
                Resources resources3 = context2.getResources();
                D.h0 h0Var3 = new D.h0(iVar3, 16, null);
                if (z9) {
                    c1444f.a(new P.d(P.e.f5695c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, h0Var3));
                }
                EnumC0263h0 enumC0263h04 = EnumC0263h0.f4583r;
                boolean z10 = b1.L.d(k02.m().f12385b) != k02.m().f12384a.f9970p.length();
                N0 n02 = new N0(k02, 0);
                N0 n03 = new N0(k02, 1);
                Resources resources4 = context2.getResources();
                D.h0 h0Var4 = new D.h0(n03, 16, n02);
                if (z10) {
                    c1444f.a(new P.d(P.e.f5696d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, h0Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    EnumC0263h0 enumC0263h05 = EnumC0263h0.f4583r;
                    if (((Boolean) k02.l.getValue()).booleanValue() && b1.L.c(k02.m().f12385b)) {
                        i7 = 1;
                    }
                    N0 n04 = new N0(k02, 2);
                    Resources resources5 = context2.getResources();
                    D.h0 h0Var5 = new D.h0(n04, 16, null);
                    if (i7 != 0) {
                        c1444f.a(new P.d(enumC0263h05.f4585o, resources5.getString(enumC0263h05.f4586p), enumC0263h05.f4587q, h0Var5));
                    }
                }
                aVar.a();
                return oVar2;
            case 8:
                Context context3 = (Context) obj4;
                AbstractC1209k.f(context3, "$context");
                f6.a aVar2 = (f6.a) obj3;
                AbstractC1209k.f(aVar2, "$volumeChangeReceiver");
                IntentFilter intentFilter = (IntentFilter) obj2;
                AbstractC1209k.f((f0.J) obj, "$this$DisposableEffect");
                if (Build.VERSION.SDK_INT >= 33) {
                    context3.registerReceiver(aVar2, intentFilter, 4);
                } else {
                    context3.registerReceiver(aVar2, intentFilter);
                }
                return new D.y0(context3, 6, aVar2);
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                C1960J c1960j = (C1960J) obj;
                C1670c c1670c = (C1670c) obj4;
                AbstractC1209k.f(c1670c, "$alphaAnim");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj3;
                AbstractC1209k.f(interfaceC1180a, "$nowPageLambda");
                Z0 z02 = (Z0) obj2;
                AbstractC1209k.f(z02, "$lastPage");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.a(1.0f - ((Number) c1670c.e()).floatValue());
                if (AbstractC1209k.a(interfaceC1180a.a(), "Album")) {
                    c1960j.u(((Number) c1670c.e()).floatValue() * (-200));
                } else if (AbstractC1209k.a(z02.getValue(), "Album")) {
                    c1960j.u(((Number) c1670c.e()).floatValue() * (-800));
                }
                return oVar2;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                G.g gVar = (G.g) obj;
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) obj3;
                AbstractC1209k.f(interfaceC0878b02, "$list");
                InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) obj2;
                AbstractC1209k.f(interfaceC0878b03, "$searchText");
                y3.x xVar = (y3.x) obj4;
                AbstractC1209k.f(xVar, "$navController");
                AbstractC1209k.f(gVar, "$this$TitleWithLazyVerticalGrid");
                A0.e.A(gVar, "SearchField", new b6.k(28), new n0.d(-1742283239, new h6.H(interfaceC0878b03, 3), true));
                List list = (List) interfaceC0878b02.getValue();
                gVar.f2507d.b(list.size(), new G.f(new J(new b1.x(9), 6, list), G.g.f2505f, new J0(3, list), new n0.d(-1942245546, new U5.W(list, 3, xVar), true)));
                return oVar2;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                F.u uVar2 = (F.u) obj;
                InterfaceC0878b0 interfaceC0878b04 = (InterfaceC0878b0) obj3;
                AbstractC1209k.f(interfaceC0878b04, "$list");
                InterfaceC0878b0 interfaceC0878b05 = (InterfaceC0878b0) obj2;
                AbstractC1209k.f(interfaceC0878b05, "$searchText");
                List list2 = (List) obj4;
                AbstractC1209k.f(list2, "$artistsList");
                AbstractC1209k.f(uVar2, "$this$Title");
                A0.e.z(uVar2, "SearchField", new n0.d(-1058436308, new h6.H(interfaceC0878b05, 4), true), 2);
                List list3 = (List) interfaceC0878b04.getValue();
                uVar2.b(list3.size(), new J(new b1.x(10), 7, list3), new J0(4, list3), new n0.d(2039820996, new U5.W(list3, 4, list2), true));
                return oVar2;
            case 12:
                C1249f c1249f = (C1249f) obj4;
                if (c1249f.f14643p.b(obj3)) {
                    throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
                }
                c1249f.f14642o.remove(obj3);
                C1254k c1254k = (C1254k) obj2;
                c1249f.f14643p.m(obj3, c1254k);
                return new C1248e(c1249f, obj3, c1254k, 0);
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC1765B interfaceC1765B2 = (InterfaceC1765B) obj4;
                AbstractC1209k.f(interfaceC1765B2, "$scope");
                Context context4 = (Context) obj3;
                AbstractC1209k.f(context4, "$context");
                Folder folder = (Folder) obj2;
                AbstractC1209k.f(folder, "$folder");
                AbstractC1767D.t(interfaceC1765B2, w5.M.f19498b, new p6.g(context4, zBooleanValue, folder, null), 2);
                return oVar2;
            case 14:
                return e(obj);
            case 15:
                return f(obj);
            case 16:
                return i(obj);
            case 17:
                return j(obj);
            default:
                K1.l lVar4 = (K1.l) obj4;
                N5.d.h(lVar4, (K0.u) obj, 0L);
                K0.N n7 = (K0.N) ((K0.y) obj3);
                n7.getClass();
                float fA = AbstractC0347f.x(n7).f5816O.a();
                long jM = AbstractC1110d.m(fA, fA);
                if (n1.r.b(jM) <= 0.0f || n1.r.c(jM) <= 0.0f) {
                    N0.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) n1.r.g(jM)));
                }
                float fB = n1.r.b(jM);
                L0.d dVar5 = (L0.d) lVar4.f3973b;
                float fB2 = dVar5.b(fB);
                float fC = n1.r.c(jM);
                L0.d dVar6 = (L0.d) lVar4.f3974c;
                long jM2 = AbstractC1110d.m(fB2, dVar6.b(fC));
                L0.a[] aVarArr = dVar5.f4098d;
                Z4.l.d0(aVarArr, 0, aVarArr.length);
                dVar5.f4099e = 0;
                L0.a[] aVarArr2 = dVar6.f4098d;
                Z4.l.d0(aVarArr2, 0, aVarArr2.length);
                dVar6.f4099e = 0;
                lVar4.f3972a = 0L;
                y5.c cVar = ((z.J) obj2).f20662I;
                if (cVar != null) {
                    z.K k7 = z.L.f20674a;
                    cVar.k(new C2060s(AbstractC1110d.m(Float.isNaN(n1.r.b(jM2)) ? 0.0f : n1.r.b(jM2), Float.isNaN(n1.r.c(jM2)) ? 0.0f : n1.r.c(jM2))));
                }
                return oVar2;
        }
    }

    public /* synthetic */ C0265j(Object obj, Object obj2, Object obj3, int i7) {
        this.f4599o = i7;
        this.f4600p = obj;
        this.f4601q = obj2;
        this.f4602r = obj3;
    }

    public /* synthetic */ C0265j(C2039h c2039h, t1 t1Var, InterfaceC1786g0 interfaceC1786g0, M0 m02) {
        this.f4599o = 17;
        this.f4600p = c2039h;
        this.f4601q = interfaceC1786g0;
        this.f4602r = m02;
    }
}
