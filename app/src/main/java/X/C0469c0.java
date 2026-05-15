package X;

import b1.AbstractC0606B;
import b1.AbstractC0607C;
import b1.C0605A;
import b1.C0608D;
import b1.C0610F;
import b1.C0614J;
import b1.C0620e;
import b1.C0622g;
import b1.C0626k;
import b1.C0627l;
import b1.C0628m;
import b1.EnumC0624i;
import b1.InterfaceC0617b;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import i1.AbstractC1061d;
import i1.C1058a;
import i1.C1059b;
import j5.AbstractC1109c;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1182c;
import m1.C1191a;
import m5.AbstractC1209k;
import w.C1682o;
import x0.C1892b;
import y0.AbstractC1959I;
import y0.C1962L;
import y0.C1987t;

/* JADX INFO: renamed from: X.c0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0469c0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f8047o;

    public /* synthetic */ C0469c0(int i7) {
        this.f8047o = i7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        int i7 = 0;
        switch (this.f8047o) {
            case 0:
                C1892b c1892b = (C1892b) obj;
                long j3 = c1892b.f19867a;
                return (9223372034707292159L & j3) != 9205357640488583168L ? new C1682o(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (c1892b.f19867a & 4294967295L))) : AbstractC0481i0.f8082a;
            case 1:
                C1682o c1682o = (C1682o) obj;
                return new C1892b((((long) Float.floatToRawIntBits(c1682o.f18720a)) << 32) | (((long) Float.floatToRawIntBits(c1682o.f18721b)) & 4294967295L));
            case 2:
                return new u0(((Long) obj).longValue());
            case 3:
                return Boolean.valueOf(!(((InterfaceC0617b) obj) instanceof b1.t));
            case 4:
                b1.q qVar = (b1.q) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(qVar.f9997b);
                sb.append(", ");
                return Z1.l.r(sb, qVar.f9998c, ')');
            case 5:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                V1.a aVar = AbstractC0606B.h;
                Boolean bool = Boolean.FALSE;
                boolean zA = AbstractC1209k.a(obj2, bool);
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) aVar.f7390p;
                C0608D c0608d = (zA || obj2 == null) ? null : (C0608D) interfaceC1182c.b(obj2);
                Object obj3 = list.get(1);
                C0608D c0608d2 = (AbstractC1209k.a(obj3, bool) || obj3 == null) ? null : (C0608D) interfaceC1182c.b(obj3);
                Object obj4 = list.get(2);
                C0608D c0608d3 = (AbstractC1209k.a(obj4, bool) || obj4 == null) ? null : (C0608D) interfaceC1182c.b(obj4);
                Object obj5 = list.get(3);
                return new C0614J(c0608d, c0608d2, c0608d3, (AbstractC1209k.a(obj5, bool) || obj5 == null) ? null : (C0608D) interfaceC1182c.b(obj5));
            case 6:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC1209k.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((InterfaceC1182c) AbstractC0606B.f9878a.f7390p).b(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                AbstractC1209k.c(str);
                return new C0622g(list3, str);
            case 7:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new m1.l(((Integer) obj).intValue());
            case 8:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new m1.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                n1.q[] qVarArr = n1.p.f14525b;
                C0605A c0605a = AbstractC0606B.f9892q;
                Boolean bool2 = Boolean.FALSE;
                AbstractC1209k.a(obj8, bool2);
                InterfaceC1182c interfaceC1182c2 = c0605a.f9877p;
                n1.p pVar = obj8 != null ? (n1.p) interfaceC1182c2.b(obj8) : null;
                AbstractC1209k.c(pVar);
                Object obj9 = list5.get(1);
                AbstractC1209k.a(obj9, bool2);
                n1.p pVar2 = obj9 != null ? (n1.p) interfaceC1182c2.b(obj9) : null;
                AbstractC1209k.c(pVar2);
                return new m1.q(pVar.f14527a, pVar2.f14527a);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new f1.k(((Integer) obj).intValue());
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new C1191a(((Float) obj).floatValue());
            case 12:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                AbstractC1209k.c(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                AbstractC1209k.c(num2);
                return new b1.L(AbstractC0607C.b(iIntValue, num2.intValue()));
            case 13:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i8 = C1987t.f20263k;
                Boolean bool3 = Boolean.FALSE;
                AbstractC1209k.a(obj12, bool3);
                C1987t c1987t = obj12 != null ? AbstractC1209k.a(obj12, Boolean.FALSE) ? new C1987t(C1987t.f20262j) : new C1987t(AbstractC1959I.c(((Integer) obj12).intValue())) : null;
                AbstractC1209k.c(c1987t);
                Object obj13 = list7.get(1);
                C0605A c0605a2 = AbstractC0606B.f9893r;
                AbstractC1209k.a(obj13, bool3);
                C1892b c1892b2 = obj13 != null ? (C1892b) c0605a2.f9877p.b(obj13) : null;
                AbstractC1209k.c(c1892b2);
                Object obj14 = list7.get(2);
                Float f7 = obj14 != null ? (Float) obj14 : null;
                AbstractC1209k.c(f7);
                return new C1962L(f7.floatValue(), c1987t.f20264a, c1892b2.f19867a);
            case 14:
                if (AbstractC1209k.a(obj, Boolean.FALSE)) {
                    return new n1.p(n1.p.f14526c);
                }
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f8 = obj15 != null ? (Float) obj15 : null;
                AbstractC1209k.c(f8);
                float fFloatValue = f8.floatValue();
                Object obj16 = list8.get(1);
                n1.q qVar2 = obj16 != null ? (n1.q) obj16 : null;
                AbstractC1209k.c(qVar2);
                return new n1.p(AbstractC1109c.w(qVar2.f14528a, fFloatValue));
            case 15:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                AbstractC1209k.c(str2);
                Object obj18 = list9.get(1);
                return new C0628m(str2, (AbstractC1209k.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (C0614J) ((InterfaceC1182c) AbstractC0606B.f9885i.f7390p).b(obj18));
            case 16:
                if (AbstractC1209k.a(obj, Boolean.FALSE)) {
                    return new C1892b(9205357640488583168L);
                }
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f9 = obj19 != null ? (Float) obj19 : null;
                AbstractC1209k.c(f9);
                float fFloatValue2 = f9.floatValue();
                Object obj20 = list10.get(1);
                Float f10 = obj20 != null ? (Float) obj20 : null;
                AbstractC1209k.c(f10);
                return new C1892b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f10.floatValue())) & 4294967295L));
            case 17:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i7 < size) {
                    Object obj21 = list11.get(i7);
                    C1058a c1058a = (AbstractC1209k.a(obj21, Boolean.FALSE) || obj21 == null) ? null : (C1058a) ((InterfaceC1182c) AbstractC0606B.f9895t.f7390p).b(obj21);
                    AbstractC1209k.c(c1058a);
                    arrayList.add(c1058a);
                    i7++;
                }
                return new C1059b(arrayList);
            case 18:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i7 < size2) {
                    Object obj22 = list12.get(i7);
                    C0620e c0620e = (AbstractC1209k.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (C0620e) ((InterfaceC1182c) AbstractC0606B.f9879b.f7390p).b(obj22);
                    AbstractC1209k.c(c0620e);
                    arrayList2.add(c0620e);
                    i7++;
                }
                return arrayList2;
            case 19:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.String");
                return new C1058a(AbstractC1061d.f13292a.I((String) obj));
            case BuildConfig.API_VERSION /* 20 */:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                m1.f fVar = obj23 != null ? (m1.f) obj23 : null;
                AbstractC1209k.c(fVar);
                Object obj24 = list13.get(1);
                m1.h hVar = obj24 != null ? (m1.h) obj24 : null;
                AbstractC1209k.c(hVar);
                Object obj25 = list13.get(2);
                AbstractC1209k.c(obj25 != null ? (m1.g) obj25 : null);
                return new m1.i(hVar.f14337a, fVar.f14336a);
            case 21:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                EnumC0624i enumC0624i = obj26 != null ? (EnumC0624i) obj26 : null;
                AbstractC1209k.c(enumC0624i);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                AbstractC1209k.c(num3);
                int iIntValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                AbstractC1209k.c(num4);
                int iIntValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str3 = obj29 != null ? (String) obj29 : null;
                AbstractC1209k.c(str3);
                switch (enumC0624i.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        b1.t tVar = (AbstractC1209k.a(obj30, Boolean.FALSE) || obj30 == null) ? null : (b1.t) ((InterfaceC1182c) AbstractC0606B.f9884g.f7390p).b(obj30);
                        AbstractC1209k.c(tVar);
                        return new C0620e(tVar, iIntValue2, iIntValue3, str3);
                    case 1:
                        Object obj31 = list14.get(1);
                        C0608D c0608d4 = (AbstractC1209k.a(obj31, Boolean.FALSE) || obj31 == null) ? null : (C0608D) ((InterfaceC1182c) AbstractC0606B.h.f7390p).b(obj31);
                        AbstractC1209k.c(c0608d4);
                        return new C0620e(c0608d4, iIntValue2, iIntValue3, str3);
                    case 2:
                        Object obj32 = list14.get(1);
                        b1.O o7 = (AbstractC1209k.a(obj32, Boolean.FALSE) || obj32 == null) ? null : (b1.O) ((InterfaceC1182c) AbstractC0606B.f9880c.f7390p).b(obj32);
                        AbstractC1209k.c(o7);
                        return new C0620e(o7, iIntValue2, iIntValue3, str3);
                    case 3:
                        Object obj33 = list14.get(1);
                        b1.N n7 = (AbstractC1209k.a(obj33, Boolean.FALSE) || obj33 == null) ? null : (b1.N) ((InterfaceC1182c) AbstractC0606B.f9881d.f7390p).b(obj33);
                        AbstractC1209k.c(n7);
                        return new C0620e(n7, iIntValue2, iIntValue3, str3);
                    case 4:
                        Object obj34 = list14.get(1);
                        C0628m c0628m = (AbstractC1209k.a(obj34, Boolean.FALSE) || obj34 == null) ? null : (C0628m) ((InterfaceC1182c) AbstractC0606B.f9882e.f7390p).b(obj34);
                        AbstractC1209k.c(c0628m);
                        return new C0620e(c0628m, iIntValue2, iIntValue3, str3);
                    case 5:
                        Object obj35 = list14.get(1);
                        C0627l c0627l = (AbstractC1209k.a(obj35, Boolean.FALSE) || obj35 == null) ? null : (C0627l) ((InterfaceC1182c) AbstractC0606B.f9883f.f7390p).b(obj35);
                        AbstractC1209k.c(c0627l);
                        return new C0620e(c0627l, iIntValue2, iIntValue3, str3);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str4 = obj36 != null ? (String) obj36 : null;
                        AbstractC1209k.c(str4);
                        return new C0620e(new C0610F(str4), iIntValue2, iIntValue3, str3);
                    default:
                        throw new A2.W();
                }
            case 22:
                String str5 = obj != null ? (String) obj : null;
                AbstractC1209k.c(str5);
                return new b1.O(str5);
            case 23:
                String str6 = obj != null ? (String) obj : null;
                AbstractC1209k.c(str6);
                return new b1.N(str6);
            case 24:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str7 = obj37 != null ? (String) obj37 : null;
                AbstractC1209k.c(str7);
                Object obj38 = list15.get(1);
                return new C0627l(str7, (AbstractC1209k.a(obj38, Boolean.FALSE) || obj38 == null) ? null : (C0614J) ((InterfaceC1182c) AbstractC0606B.f9885i.f7390p).b(obj38));
            case 25:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                m1.k kVar = obj39 != null ? (m1.k) obj39 : null;
                AbstractC1209k.c(kVar);
                Object obj40 = list16.get(1);
                m1.m mVar = obj40 != null ? (m1.m) obj40 : null;
                AbstractC1209k.c(mVar);
                Object obj41 = list16.get(2);
                n1.q[] qVarArr2 = n1.p.f14525b;
                C0605A c0605a3 = AbstractC0606B.f9892q;
                Boolean bool4 = Boolean.FALSE;
                AbstractC1209k.a(obj41, bool4);
                n1.p pVar3 = obj41 != null ? (n1.p) c0605a3.f9877p.b(obj41) : null;
                AbstractC1209k.c(pVar3);
                Object obj42 = list16.get(3);
                m1.q qVar3 = m1.q.f14354c;
                m1.q qVar4 = (AbstractC1209k.a(obj42, bool4) || obj42 == null) ? null : (m1.q) ((InterfaceC1182c) AbstractC0606B.l.f7390p).b(obj42);
                Object obj43 = list16.get(4);
                b1.v vVar = (AbstractC1209k.a(obj43, bool4) || obj43 == null) ? null : (b1.v) ((InterfaceC1182c) AbstractC0607C.f9897a.f7390p).b(obj43);
                Object obj44 = list16.get(5);
                m1.i iVar = m1.i.f14338c;
                m1.i iVar2 = (AbstractC1209k.a(obj44, bool4) || obj44 == null) ? null : (m1.i) ((InterfaceC1182c) AbstractC0606B.f9896u.f7390p).b(obj44);
                Object obj45 = list16.get(6);
                int i9 = m1.e.f14331b;
                m1.e eVar = (AbstractC1209k.a(obj45, bool4) || obj45 == null) ? null : (m1.e) ((InterfaceC1182c) AbstractC0607C.f9898b.f7390p).b(obj45);
                AbstractC1209k.c(eVar);
                Object obj46 = list16.get(7);
                m1.d dVar = obj46 != null ? (m1.d) obj46 : null;
                AbstractC1209k.c(dVar);
                Object obj47 = list16.get(8);
                return new b1.t(kVar.f14344a, mVar.f14349a, pVar3.f14527a, qVar4, vVar, iVar2, eVar.f14332a, dVar.f14330a, (AbstractC1209k.a(obj47, bool4) || obj47 == null) ? null : (m1.s) ((InterfaceC1182c) AbstractC0607C.f9899c.f7390p).b(obj47));
            case 26:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i10 = C1987t.f20263k;
                Boolean bool5 = Boolean.FALSE;
                AbstractC1209k.a(obj48, bool5);
                C1987t c1987t2 = obj48 != null ? obj48.equals(bool5) ? new C1987t(C1987t.f20262j) : new C1987t(AbstractC1959I.c(((Integer) obj48).intValue())) : null;
                AbstractC1209k.c(c1987t2);
                Object obj49 = list17.get(1);
                n1.q[] qVarArr3 = n1.p.f14525b;
                C0605A c0605a4 = AbstractC0606B.f9892q;
                AbstractC1209k.a(obj49, bool5);
                InterfaceC1182c interfaceC1182c3 = c0605a4.f9877p;
                n1.p pVar4 = obj49 != null ? (n1.p) interfaceC1182c3.b(obj49) : null;
                AbstractC1209k.c(pVar4);
                Object obj50 = list17.get(2);
                f1.k kVar2 = f1.k.f11998p;
                f1.k kVar3 = (AbstractC1209k.a(obj50, bool5) || obj50 == null) ? null : (f1.k) ((InterfaceC1182c) AbstractC0606B.f9888m.f7390p).b(obj50);
                Object obj51 = list17.get(3);
                f1.i iVar3 = obj51 != null ? (f1.i) obj51 : null;
                Object obj52 = list17.get(4);
                f1.j jVar = obj52 != null ? (f1.j) obj52 : null;
                Object obj53 = list17.get(6);
                String str8 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                AbstractC1209k.a(obj54, bool5);
                n1.p pVar5 = obj54 != null ? (n1.p) interfaceC1182c3.b(obj54) : null;
                AbstractC1209k.c(pVar5);
                Object obj55 = list17.get(8);
                C1191a c1191a = (AbstractC1209k.a(obj55, bool5) || obj55 == null) ? null : (C1191a) ((InterfaceC1182c) AbstractC0606B.f9889n.f7390p).b(obj55);
                Object obj56 = list17.get(9);
                m1.p pVar6 = (AbstractC1209k.a(obj56, bool5) || obj56 == null) ? null : (m1.p) ((InterfaceC1182c) AbstractC0606B.f9887k.f7390p).b(obj56);
                Object obj57 = list17.get(10);
                C1059b c1059b = C1059b.f13289q;
                C1059b c1059b2 = (AbstractC1209k.a(obj57, bool5) || obj57 == null) ? null : (C1059b) ((InterfaceC1182c) AbstractC0606B.f9894s.f7390p).b(obj57);
                Object obj58 = list17.get(11);
                AbstractC1209k.a(obj58, bool5);
                C1987t c1987t3 = obj58 != null ? obj58.equals(bool5) ? new C1987t(C1987t.f20262j) : new C1987t(AbstractC1959I.c(((Integer) obj58).intValue())) : null;
                AbstractC1209k.c(c1987t3);
                Object obj59 = list17.get(12);
                m1.l lVar = (AbstractC1209k.a(obj59, bool5) || obj59 == null) ? null : (m1.l) ((InterfaceC1182c) AbstractC0606B.f9886j.f7390p).b(obj59);
                Object obj60 = list17.get(13);
                C1962L c1962l = C1962L.f20207d;
                return new C0608D(c1987t2.f20264a, pVar4.f14527a, kVar3, iVar3, jVar, (f1.n) null, str8, pVar5.f14527a, c1191a, pVar6, c1059b2, c1987t3.f20264a, lVar, (AbstractC1209k.a(obj60, bool5) || obj60 == null) ? null : (C1962L) ((InterfaceC1182c) AbstractC0606B.f9890o.f7390p).b(obj60), 49184);
            case 27:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                AbstractC1209k.c(bool6);
                boolean zBooleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                AbstractC1209k.c(obj62 != null ? (C0626k) obj62 : null);
                return new b1.v(zBooleanValue);
            case 28:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new m1.e(((Integer) obj).intValue());
            default:
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                m1.r rVar = obj63 != null ? (m1.r) obj63 : null;
                AbstractC1209k.c(rVar);
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                AbstractC1209k.c(bool7);
                return new m1.s(rVar.f14357a, bool7.booleanValue());
        }
    }
}
