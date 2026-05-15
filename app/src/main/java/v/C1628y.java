package v;

import Z4.C0508b;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import d.C0746L;
import d2.C0821i;
import j5.AbstractC1110d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import w.C1678k;
import w.C1681n;
import w.C1684q;
import y0.AbstractC1959I;
import y0.C1960J;
import y0.C1964N;
import y0.C1987t;
import y3.AbstractC2010C;
import y3.C2019h;
import y3.C2020i;
import y3.C2021j;

/* JADX INFO: renamed from: v.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1628y extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f18193p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f18194q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1628y(int i7, Object obj) {
        super(1);
        this.f18193p = i7;
        this.f18194q = obj;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [l5.c, m5.l] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        int i7 = 0;
        Y4.o oVar = Y4.o.f8736a;
        Object obj2 = this.f18194q;
        switch (this.f18193p) {
            case 0:
                return ((C1629z) obj2).f18199e;
            case 1:
                C1684q c1684q = (C1684q) obj;
                float f7 = c1684q.f18736b;
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                float f8 = c1684q.f18737c;
                if (f8 < -0.5f) {
                    f8 = -0.5f;
                }
                if (f8 > 0.5f) {
                    f8 = 0.5f;
                }
                float f9 = c1684q.f18738d;
                float f10 = f9 >= -0.5f ? f9 : -0.5f;
                float f11 = f10 <= 0.5f ? f10 : 0.5f;
                float f12 = c1684q.f18735a;
                float f13 = f12 >= 0.0f ? f12 : 0.0f;
                return new C1987t(C1987t.a(AbstractC1959I.b(f7, f8, f11, f13 <= 1.0f ? f13 : 1.0f, z0.d.f21054x), (z0.c) obj2));
            case 2:
                ((C1960J) obj).a(((Number) ((w.f0) obj2).f18671v.getValue()).floatValue());
                return oVar;
            case 3:
                ((Q0.N) obj2).a();
                return oVar;
            case 4:
                ((a0) obj2).f();
                return oVar;
            case 5:
                C1960J c1960j = (C1960J) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj2;
                c1960j.l(c1960j.b() * shadowGraphicsLayerElement.f9287a);
                c1960j.m(shadowGraphicsLayerElement.f9288b);
                c1960j.d(shadowGraphicsLayerElement.f9289c);
                c1960j.c(shadowGraphicsLayerElement.f9290d);
                c1960j.o(shadowGraphicsLayerElement.f9291e);
                return oVar;
            case 6:
                C1678k c1678k = (C1678k) obj;
                Object value = c1678k.f18702e.getValue();
                w.o0 o0Var = w.p0.f18727a;
                ((l5.e) obj2).invoke(value, Float.valueOf(((C1681n) c1678k.f18703f).f18716a));
                return oVar;
            case 7:
                return ((AbstractC1210l) obj2).b(Long.valueOf(((Number) obj).longValue()));
            case 8:
                C1960J c1960j2 = (C1960J) obj;
                C1964N c1964n = (C1964N) obj2;
                c1960j2.i(c1964n.f20211C);
                c1960j2.j(c1964n.f20212D);
                c1960j2.a(c1964n.f20213E);
                c1960j2.r(0.0f);
                c1960j2.u(0.0f);
                c1960j2.l(c1964n.f20214F);
                c1960j2.h(0.0f);
                float f14 = c1964n.f20215G;
                if (c1960j2.f20203y != f14) {
                    c1960j2.f20193o |= 2048;
                    c1960j2.f20203y = f14;
                }
                c1960j2.q(c1964n.f20216H);
                c1960j2.m(c1964n.f20217I);
                c1960j2.d(c1964n.f20218J);
                c1960j2.g(null);
                c1960j2.c(c1964n.f20219K);
                c1960j2.o(c1964n.f20220L);
                c1960j2.e(0);
                int i8 = c1964n.f20221M;
                if (c1960j2.f20191H != i8) {
                    c1960j2.f20193o |= 524288;
                    c1960j2.f20191H = i8;
                }
                return oVar;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                AbstractC1209k.f((String) obj, "key");
                y3.q qVar = (y3.q) obj2;
                ArrayList arrayList = qVar.f20447b;
                Collection collectionValues = ((Map) qVar.f20451f.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    Z4.t.l0(arrayList2, ((y3.n) it.next()).f20439b);
                }
                return Boolean.valueOf(!Z4.n.B0(Z4.n.B0(arrayList, arrayList2), (List) qVar.f20453i.getValue()).contains(r11));
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C2019h c2019h = (C2019h) obj;
                AbstractC1209k.f(c2019h, "backStackEntry");
                y3.s sVar = c2019h.f20407p;
                if (!(sVar instanceof y3.s)) {
                    sVar = null;
                }
                if (sVar == null) {
                    return null;
                }
                c2019h.c();
                AbstractC2010C abstractC2010C = (AbstractC2010C) obj2;
                y3.s sVarC = abstractC2010C.c(sVar);
                if (sVarC == null) {
                    return null;
                }
                if (sVarC.equals(sVar)) {
                    return c2019h;
                }
                C2021j c2021jB = abstractC2010C.b();
                Bundle bundleC = sVarC.c(c2019h.c());
                y3.x xVar = c2021jB.h;
                return C0746L.j(xVar.f20491a, sVarC, bundleC, xVar.f(), xVar.f20505q);
            default:
                Bundle bundle = (Bundle) obj;
                AbstractC1209k.f(bundle, "it");
                y3.x xVarO = AbstractC1110d.o((Context) obj2);
                bundle.setClassLoader(xVarO.f20491a.getClassLoader());
                xVarO.f20494d = bundle.getBundle("android-support-nav:controller:navigatorState");
                xVarO.f20495e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                LinkedHashMap linkedHashMap = xVarO.f20502n;
                linkedHashMap.clear();
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                if (intArray != null && stringArrayList != null) {
                    int length = intArray.length;
                    int i9 = 0;
                    while (i7 < length) {
                        xVarO.f20501m.put(Integer.valueOf(intArray[i7]), stringArrayList.get(i9));
                        i7++;
                        i9++;
                    }
                }
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 != null) {
                    for (String str : stringArrayList2) {
                        Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                        if (parcelableArray != null) {
                            AbstractC1209k.e(str, "id");
                            Z4.k kVar = new Z4.k(parcelableArray.length);
                            C0508b c0508bJ = AbstractC1209k.j(parcelableArray);
                            while (c0508bJ.hasNext()) {
                                Parcelable parcelable = (Parcelable) c0508bJ.next();
                                AbstractC1209k.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                kVar.addLast((C2020i) parcelable);
                            }
                            linkedHashMap.put(str, kVar);
                        }
                    }
                }
                xVarO.f20496f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                return xVarO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1628y(InterfaceC1182c interfaceC1182c) {
        super(1);
        this.f18193p = 7;
        this.f18194q = (AbstractC1210l) interfaceC1182c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628y(l5.e eVar) {
        super(1);
        this.f18193p = 6;
        w.o0 o0Var = w.p0.f18727a;
        this.f18194q = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628y(AbstractC2010C abstractC2010C, y3.z zVar) {
        super(1);
        this.f18193p = 10;
        this.f18194q = abstractC2010C;
    }
}
