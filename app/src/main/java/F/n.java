package F;

import H.C0170l;
import K0.C0236d;
import Q0.j0;
import U5.S;
import b1.C0615K;
import d2.C0821i;
import f0.AbstractC0876a0;
import f0.C0877b;
import f0.C0888g0;
import f0.C0912t;
import f0.G;
import f0.H0;
import f0.InterfaceC0878b0;
import f0.L0;
import f0.Z0;
import g0.C0943a;
import g0.C0944b;
import g0.K;
import h6.C1022i;
import j5.AbstractC1110d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import q0.C1352a;
import r5.C1423d;
import u6.C1559d;
import u6.C1571n;
import u6.E0;
import u6.F;
import w.C1670c;
import w.C1687u;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;
import x0.C1893c;
import yos.music.player.data.libraries.YosMediaItem;
import z.C2033e;
import z.C2039h;
import z.InterfaceC2029c;
import z.t1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2089o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2090p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f2091q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f2092r;

    public /* synthetic */ n(C0912t c0912t, C0943a c0943a, H0 h02, AbstractC0876a0 abstractC0876a0) {
        this.f2089o = 4;
        this.f2090p = c0912t;
        this.f2091q = c0943a;
        this.f2092r = h02;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Y4.o oVar = Y4.o.f8736a;
        Object obj = this.f2091q;
        Object obj2 = this.f2092r;
        Object obj3 = this.f2090p;
        switch (this.f2089o) {
            case 0:
                i iVar = (i) ((G) obj3).getValue();
                A a4 = (A) obj;
                return new l(a4, iVar, (C0130c) obj2, new D4.i((C1423d) a4.f2028e.f2155f.getValue(), iVar));
            case 1:
                return new I.v((l5.g) ((InterfaceC0878b0) obj3).getValue(), (InterfaceC1182c) ((InterfaceC0878b0) obj).getValue(), ((Number) ((InterfaceC1180a) obj2).a()).intValue());
            case 2:
                J.h hVar = (J.h) obj3;
                C1893c c1893cB0 = J.h.B0(hVar, (j0) obj, (C0236d) obj2);
                if (c1893cB0 == null) {
                    return null;
                }
                C2039h c2039h = hVar.f3587C;
                if (n1.m.b(c2039h.f20850K, 0L)) {
                    C.b.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c1893cB0.i(c2039h.F0(c1893cB0, c2039h.f20850K) ^ (-9223372034707292160L));
            case 3:
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) obj3;
                AbstractC1209k.f(interfaceC1765B, "$scope");
                C1670c c1670c = (C1670c) obj;
                AbstractC1209k.f(c1670c, "$offsetY");
                return AbstractC1767D.t(interfaceC1765B, null, new S(c1670c, (w.S) obj2, null), 3);
            case 4:
                C0943a c0943a = (C0943a) obj;
                H0 h02 = (H0) obj2;
                C0912t c0912t = (C0912t) obj3;
                C0944b c0944b = c0912t.f11884M;
                C0943a c0943a2 = c0944b.f12281b;
                try {
                    c0944b.f12281b = c0943a;
                    H0 h03 = c0912t.f11878G;
                    int[] iArr = c0912t.f11905o;
                    t.y yVar = c0912t.f11912v;
                    c0912t.f11905o = null;
                    c0912t.f11912v = null;
                    try {
                        c0912t.f11878G = h02;
                        boolean z6 = c0944b.f12284e;
                        try {
                            c0944b.f12284e = false;
                            throw null;
                        } catch (Throwable th) {
                            c0944b.f12284e = z6;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c0912t.f11878G = h03;
                        c0912t.f11905o = iArr;
                        c0912t.f11912v = yVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0944b.f12281b = c0943a2;
                    throw th3;
                }
            case 5:
                L0 l02 = (L0) obj;
                C0877b c0877b = (C0877b) obj3;
                if (c0877b != null) {
                    l02.a(l02.c(c0877b) - l02.f11711t);
                }
                List listQ = AbstractC1110d.q(l02, null, l02.f11711t, null);
                C1352a c1352a = (C1352a) Z4.n.y0(listQ);
                Integer num = c1352a != null ? c1352a.f15439a : null;
                List listE = ((K) obj2).e(num);
                if (num != null && !listE.isEmpty()) {
                    C1352a c1352a2 = (C1352a) Z4.n.q0(listE);
                    List listO0 = Z4.n.o0(listE);
                    c1352a2.getClass();
                    listE = Z4.n.B0(I0.c.G(new C1352a(null, num)), listO0);
                }
                return Z4.n.B0(listQ, listE);
            case 6:
                InterfaceC1765B interfaceC1765B2 = (InterfaceC1765B) obj3;
                AbstractC1209k.f(interfaceC1765B2, "$scope");
                YosMediaItem yosMediaItem = (YosMediaItem) obj;
                AbstractC1209k.f(yosMediaItem, "$music");
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) obj2;
                AbstractC1209k.f(interfaceC0878b0, "$randomMusicList");
                AbstractC1767D.t(interfaceC1765B2, M.f19498b, new C1022i(yosMediaItem, interfaceC0878b0, null), 2);
                return oVar;
            case 7:
                String str = (String) obj3;
                AbstractC1209k.f(str, "$targetTitle");
                List list = (List) obj;
                AbstractC1209k.f(list, "$targetList");
                y3.x xVar = (y3.x) obj2;
                AbstractC1209k.f(xVar, "$navController");
                a6.a.a(str, list);
                y3.x.i(xVar, "NormalMusic");
                return oVar;
            case 8:
                InterfaceC1765B interfaceC1765B3 = (InterfaceC1765B) obj3;
                AbstractC1209k.f(interfaceC1765B3, "$scope");
                y3.x xVar2 = (y3.x) obj2;
                AbstractC1209k.f(xVar2, "$navController");
                AbstractC1767D.t(interfaceC1765B3, M.f19498b, new l6.c((String) obj, xVar2, null), 2);
                return oVar;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) obj3;
                AbstractC1209k.f(interfaceC1182c, "$onValueChange");
                String str2 = (String) obj;
                AbstractC1209k.f(str2, "$content");
                InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) obj2;
                AbstractC1209k.f(interfaceC1182c2, "$expandedOnChanged");
                interfaceC1182c.b(str2);
                interfaceC1182c2.b(Boolean.FALSE);
                return oVar;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                Z0 z02 = (Z0) obj3;
                AbstractC1209k.f(z02, "$isLossless");
                Z0 z03 = (Z0) obj;
                AbstractC1209k.f(z03, "$isHiRes");
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) obj2;
                AbstractC1209k.f(interfaceC0878b02, "$isDolby");
                return Boolean.valueOf(((Boolean) z02.getValue()).booleanValue() || ((Boolean) z03.getValue()).booleanValue() || ((Boolean) interfaceC0878b02.getValue()).booleanValue());
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                n1.d dVar = (n1.d) obj3;
                AbstractC1209k.f(dVar, "$density");
                n1.g gVar = (n1.g) obj;
                return Float.valueOf(gVar != null ? dVar.v(gVar.f14511o) : ((C0888g0) obj2).h() * 0.08f);
            case 12:
                List<d6.a> list2 = (List) obj3;
                b1.M m7 = (b1.M) obj;
                AbstractC1209k.f(m7, "$textStyle");
                C0615K c0615k = (C0615K) obj2;
                AbstractC1209k.f(c0615k, "$measurer");
                ArrayList arrayList = new ArrayList(Z4.p.j0(list2));
                for (d6.a aVar : list2) {
                    long j3 = aVar.f11274o;
                    C1687u c1687u = E0.f17383a;
                    String str3 = aVar.f11276q;
                    int length = str3.length();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i7 = -1;
                        } else if (str3.charAt(i7) == ' ') {
                            i7++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i7);
                    if (i7 < 0) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : str3.length();
                    String strSubstring = str3.substring(0, iIntValue);
                    AbstractC1209k.e(strSubstring, "substring(...)");
                    String strSubstring2 = str3.substring(iIntValue);
                    AbstractC1209k.e(strSubstring2, "substring(...)");
                    String str4 = aVar.f11277r ? " " : "";
                    arrayList.add(new C1559d(aVar.f11275p, j3, strSubstring, strSubstring2, str4, C0615K.a(c0615k, strSubstring, m7), C0615K.a(c0615k, strSubstring2, m7), C0615K.a(c0615k, str4, m7)));
                }
                return arrayList;
            case 13:
                C0888g0 c0888g0 = (C0888g0) obj3;
                InterfaceC0878b0 interfaceC0878b03 = (InterfaceC0878b0) obj;
                AbstractC1209k.f(interfaceC0878b03, "$enableLyricScroll");
                InterfaceC0878b0 interfaceC0878b04 = (InterfaceC0878b0) obj2;
                AbstractC1209k.f(interfaceC0878b04, "$currentLayoutInfo$delegate");
                if (c0888g0.h() >= 0 && ((Boolean) interfaceC0878b03.getValue()).booleanValue()) {
                    int iH = c0888g0.h();
                    C1687u c1687u2 = E0.f17383a;
                    F f7 = (F) interfaceC0878b04.getValue();
                    List list3 = f7 != null ? f7.f17393a : Z4.v.f8818o;
                    if (!list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int i8 = ((C1571n) it.next()).f17757a;
                        while (it.hasNext()) {
                            int i9 = ((C1571n) it.next()).f17757a;
                            if (i8 > i9) {
                                i8 = i9;
                            }
                        }
                        Iterator it2 = list3.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int i10 = ((C1571n) it2.next()).f17757a;
                        while (it2.hasNext()) {
                            int i11 = ((C1571n) it2.next()).f17757a;
                            if (i10 < i11) {
                                i10 = i11;
                            }
                        }
                        int i12 = i8 - 2;
                        if (iH <= i10 + 2 && i12 <= iH) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                C2039h c2039h2 = (C2039h) obj3;
                C0170l c0170l = c2039h2.f20846G;
                while (true) {
                    h0.e eVar = c0170l.f2906a;
                    int i13 = eVar.f12548q;
                    if (i13 != 0) {
                        if (i13 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        C1893c c1893c = (C1893c) ((C2033e) eVar.f12546o[i13 - 1]).f20800a.a();
                        if (c1893c == null ? true : c2039h2.D0(c1893c, c2039h2.f20850K)) {
                            h0.e eVar2 = c0170l.f2906a;
                            ((C2033e) eVar2.l(eVar2.f12548q - 1)).f20801b.resumeWith(oVar);
                        }
                    }
                }
                if (c2039h2.f20848I) {
                    C1893c c1893cC0 = c2039h2.C0();
                    if (c1893cC0 != null && c2039h2.D0(c1893cC0, c2039h2.f20850K)) {
                        c2039h2.f20848I = false;
                    }
                }
                ((t1) obj).f20962e = C2039h.B0(c2039h2, (InterfaceC2029c) obj2);
                return oVar;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i7) {
        this.f2089o = i7;
        this.f2090p = obj;
        this.f2091q = obj2;
        this.f2092r = obj3;
    }
}
