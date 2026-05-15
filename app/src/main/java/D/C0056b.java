package D;

import I.C0211c;
import b1.AbstractC0606B;
import b1.AbstractC0607C;
import b1.C0605A;
import b1.C0608D;
import b1.C0610F;
import b1.C0620e;
import b1.C0622g;
import b1.C0627l;
import b1.C0628m;
import b1.EnumC0624i;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0879c;
import f0.C0886f0;
import f0.C0912t;
import i1.C1058a;
import i1.C1059b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m1.C1191a;
import m5.AbstractC1209k;
import o0.C1245b;
import x0.C1892b;
import y0.C1962L;
import y0.C1987t;
import z.EnumC2048l0;

/* JADX INFO: renamed from: D.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0056b implements l5.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1298o;

    public /* synthetic */ C0056b(int i7) {
        this.f1298o = 7;
        n0.d dVar = W5.c.f7833a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        EnumC0624i enumC0624i;
        Object objA;
        switch (this.f1298o) {
            case 0:
                return Integer.valueOf(Math.round((1 + (((n1.n) obj2) != n1.n.f14521o ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 1:
                F.A a4 = (F.A) obj2;
                return Z4.o.e0(Integer.valueOf(a4.f2028e.f2151b.h()), Integer.valueOf(a4.f2028e.f2152c.h()));
            case 2:
                ((Integer) obj2).intValue();
                return new G.b(N5.d.b(1));
            case 3:
                G.x xVar = (G.x) obj2;
                return Z4.o.e0(Integer.valueOf(xVar.f2614d.f2151b.h()), Integer.valueOf(xVar.f2614d.f2152c.h()));
            case 4:
                Map mapE = ((H.g0) obj2).e();
                if (mapE.isEmpty()) {
                    return null;
                }
                return mapE;
            case 5:
                C0211c c0211c = (C0211c) obj2;
                return Z4.o.e0(Integer.valueOf(c0211c.k()), Float.valueOf(i6.h.p(((C0886f0) c0211c.f3294d.f3207e).h(), -0.5f, 0.5f)), Integer.valueOf(c0211c.m()));
            case 6:
                M.B0 b0 = (M.B0) obj2;
                return Z4.o.e0(Float.valueOf(b0.f4365a.h()), Boolean.valueOf(((EnumC2048l0) b0.f4370f.getValue()) == EnumC2048l0.f20894o));
            case 7:
                ((Integer) obj2).getClass();
                n0.d dVar = W5.c.f7833a;
                N5.l.i(C0879c.B(7), (C0912t) obj);
                return Y4.o.f8736a;
            case 8:
                return Long.valueOf(((X.u0) obj2).f8176d.get());
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                C0622g c0622g = (C0622g) obj2;
                return Z4.o.b0(c0622g.f9970p, AbstractC0606B.a(c0622g.f9969o, AbstractC0606B.f9878a, (C1245b) obj));
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return Integer.valueOf(((m1.l) obj2).f14348a);
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                m1.p pVar = (m1.p) obj2;
                return Z4.o.b0(Float.valueOf(pVar.f14352a), Float.valueOf(pVar.f14353b));
            case 12:
                C1245b c1245b = (C1245b) obj;
                m1.q qVar = (m1.q) obj2;
                n1.p pVar2 = new n1.p(qVar.f14355a);
                C0605A c0605a = AbstractC0606B.f9892q;
                return Z4.o.b0(AbstractC0606B.a(pVar2, c0605a, c1245b), AbstractC0606B.a(new n1.p(qVar.f14356b), c0605a, c1245b));
            case 13:
                return Integer.valueOf(((f1.k) obj2).f12008o);
            case 14:
                C0628m c0628m = (C0628m) obj2;
                return Z4.o.b0(c0628m.f9985a, AbstractC0606B.a(c0628m.f9986b, AbstractC0606B.f9885i, (C1245b) obj));
            case 15:
                return Float.valueOf(((C1191a) obj2).f14326a);
            case 16:
                C1245b c1245b2 = (C1245b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(AbstractC0606B.a((C0620e) list.get(i7), AbstractC0606B.f9879b, c1245b2));
                }
                return arrayList;
            case 17:
                b1.L l = (b1.L) obj2;
                return Z4.o.b0(Integer.valueOf((int) (l.f9945a >> 32)), Integer.valueOf((int) (4294967295L & l.f9945a)));
            case 18:
                C1245b c1245b3 = (C1245b) obj;
                C1962L c1962l = (C1962L) obj2;
                return Z4.o.b0(AbstractC0606B.a(new C1987t(c1962l.f20208a), AbstractC0606B.f9891p, c1245b3), AbstractC0606B.a(new C1892b(c1962l.f20209b), AbstractC0606B.f9893r, c1245b3), Float.valueOf(c1962l.f20210c));
            case 19:
                n1.p pVar3 = (n1.p) obj2;
                return pVar3 == null ? false : n1.p.a(pVar3.f14527a, n1.p.f14526c) ? Boolean.FALSE : Z4.o.b0(Float.valueOf(n1.p.c(pVar3.f14527a)), new n1.q(n1.p.b(pVar3.f14527a)));
            case BuildConfig.API_VERSION /* 20 */:
                C1892b c1892b = (C1892b) obj2;
                return c1892b == null ? false : C1892b.b(c1892b.f19867a, 9205357640488583168L) ? Boolean.FALSE : Z4.o.b0(Float.valueOf(Float.intBitsToFloat((int) (c1892b.f19867a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & c1892b.f19867a))));
            case 21:
                C1245b c1245b4 = (C1245b) obj;
                List list2 = ((C1059b) obj2).f13290o;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    arrayList2.add(AbstractC0606B.a((C1058a) list2.get(i8), AbstractC0606B.f9895t, c1245b4));
                }
                return arrayList2;
            case 22:
                return ((C1058a) obj2).f13288a.toLanguageTag();
            case 23:
                m1.i iVar = (m1.i) obj2;
                return Z4.o.b0(new m1.f(iVar.f14339a), new m1.h(iVar.f14340b), new m1.g());
            case 24:
                C1245b c1245b5 = (C1245b) obj;
                C0620e c0620e = (C0620e) obj2;
                Object obj3 = c0620e.f9964a;
                if (obj3 instanceof b1.t) {
                    enumC0624i = EnumC0624i.f9974o;
                } else if (obj3 instanceof C0608D) {
                    enumC0624i = EnumC0624i.f9975p;
                } else if (obj3 instanceof b1.O) {
                    enumC0624i = EnumC0624i.f9976q;
                } else if (obj3 instanceof b1.N) {
                    enumC0624i = EnumC0624i.f9977r;
                } else if (obj3 instanceof C0628m) {
                    enumC0624i = EnumC0624i.f9978s;
                } else if (obj3 instanceof C0627l) {
                    enumC0624i = EnumC0624i.f9979t;
                } else {
                    if (!(obj3 instanceof C0610F)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0624i = EnumC0624i.f9980u;
                }
                int iOrdinal = enumC0624i.ordinal();
                Object obj4 = c0620e.f9964a;
                switch (iOrdinal) {
                    case 0:
                        AbstractC1209k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = AbstractC0606B.a((b1.t) obj4, AbstractC0606B.f9884g, c1245b5);
                        break;
                    case 1:
                        AbstractC1209k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = AbstractC0606B.a((C0608D) obj4, AbstractC0606B.h, c1245b5);
                        break;
                    case 2:
                        AbstractC1209k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = AbstractC0606B.a((b1.O) obj4, AbstractC0606B.f9880c, c1245b5);
                        break;
                    case 3:
                        AbstractC1209k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = AbstractC0606B.a((b1.N) obj4, AbstractC0606B.f9881d, c1245b5);
                        break;
                    case 4:
                        AbstractC1209k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = AbstractC0606B.a((C0628m) obj4, AbstractC0606B.f9882e, c1245b5);
                        break;
                    case 5:
                        AbstractC1209k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = AbstractC0606B.a((C0627l) obj4, AbstractC0606B.f9883f, c1245b5);
                        break;
                    case 6:
                        AbstractC1209k.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((C0610F) obj4).f9917a;
                        break;
                    default:
                        throw new A2.W();
                }
                return Z4.o.b0(enumC0624i, objA, Integer.valueOf(c0620e.f9965b), Integer.valueOf(c0620e.f9966c), c0620e.f9967d);
            case 25:
                C0627l c0627l = (C0627l) obj2;
                return Z4.o.b0(c0627l.f9983a, AbstractC0606B.a(c0627l.f9984b, AbstractC0606B.f9885i, (C1245b) obj));
            case 26:
                return ((b1.O) obj2).f9951a;
            case 27:
                return ((b1.N) obj2).f9950a;
            case 28:
                C1245b c1245b6 = (C1245b) obj;
                b1.t tVar = (b1.t) obj2;
                m1.k kVar = new m1.k(tVar.f10006a);
                m1.m mVar = new m1.m(tVar.f10007b);
                Object objA2 = AbstractC0606B.a(new n1.p(tVar.f10008c), AbstractC0606B.f9892q, c1245b6);
                m1.q qVar2 = m1.q.f14354c;
                Object objA3 = AbstractC0606B.a(tVar.f10009d, AbstractC0606B.l, c1245b6);
                Object objA4 = AbstractC0606B.a(tVar.f10010e, AbstractC0607C.f9897a, c1245b6);
                m1.i iVar2 = m1.i.f14338c;
                return Z4.o.b0(kVar, mVar, objA2, objA3, objA4, AbstractC0606B.a(tVar.f10011f, AbstractC0606B.f9896u, c1245b6), AbstractC0606B.a(new m1.e(tVar.f10012g), AbstractC0607C.f9898b, c1245b6), new m1.d(tVar.h), AbstractC0606B.a(tVar.f10013i, AbstractC0607C.f9899c, c1245b6));
            default:
                C1245b c1245b7 = (C1245b) obj;
                C0608D c0608d = (C0608D) obj2;
                C1987t c1987t = new C1987t(c0608d.f9900a.b());
                C0605A c0605a2 = AbstractC0606B.f9891p;
                Object objA5 = AbstractC0606B.a(c1987t, c0605a2, c1245b7);
                n1.p pVar4 = new n1.p(c0608d.f9901b);
                C0605A c0605a3 = AbstractC0606B.f9892q;
                Object objA6 = AbstractC0606B.a(pVar4, c0605a3, c1245b7);
                f1.k kVar2 = f1.k.f11998p;
                Object objA7 = AbstractC0606B.a(c0608d.f9902c, AbstractC0606B.f9888m, c1245b7);
                Object objA8 = AbstractC0606B.a(new n1.p(c0608d.h), c0605a3, c1245b7);
                Object objA9 = AbstractC0606B.a(c0608d.f9907i, AbstractC0606B.f9889n, c1245b7);
                Object objA10 = AbstractC0606B.a(c0608d.f9908j, AbstractC0606B.f9887k, c1245b7);
                C1059b c1059b = C1059b.f13289q;
                Object objA11 = AbstractC0606B.a(c0608d.f9909k, AbstractC0606B.f9894s, c1245b7);
                Object objA12 = AbstractC0606B.a(new C1987t(c0608d.l), c0605a2, c1245b7);
                Object objA13 = AbstractC0606B.a(c0608d.f9910m, AbstractC0606B.f9886j, c1245b7);
                C1962L c1962l2 = C1962L.f20207d;
                return Z4.o.b0(objA5, objA6, objA7, c0608d.f9903d, c0608d.f9904e, -1, c0608d.f9906g, objA8, objA9, objA10, objA11, objA12, objA13, AbstractC0606B.a(c0608d.f9911n, AbstractC0606B.f9890o, c1245b7));
        }
    }

    public /* synthetic */ C0056b(int i7, byte b7) {
        this.f1298o = i7;
    }
}
