package V4;

import a.AbstractC0509a;
import android.os.Bundle;
import d.C0757j;
import e.C0835a;
import f0.InterfaceC0878b0;
import g.C0938e;
import j5.AbstractC1110d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1216r;
import m5.C1218t;
import r1.C1405D;
import x0.C1892b;
import x0.C1895e;
import y0.C1987t;
import y3.C2019h;

/* JADX INFO: renamed from: V4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0459f extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f7492p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f7493q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f7494r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f7495s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f7496t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f7497u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459f(C0835a c0835a, C0757j c0757j, String str, AbstractC0509a abstractC0509a, InterfaceC0878b0 interfaceC0878b0) {
        super(1);
        this.f7492p = 1;
        this.f7494r = c0835a;
        this.f7495s = c0757j;
        this.f7496t = str;
        this.f7497u = abstractC0509a;
        this.f7493q = interfaceC0878b0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        List listSubList;
        C0459f c0459f = this;
        switch (c0459f.f7492p) {
            case 0:
                A0.f fVar = (A0.f) obj;
                AbstractC1209k.f(fVar, "$this$Canvas");
                boolean z6 = fVar.getLayoutDirection() == n1.n.f14522p;
                long jG = AbstractC1110d.g(0.0f, C1892b.e(fVar.R()));
                long jG2 = AbstractC1110d.g(C1895e.d(fVar.f()), C1892b.e(fVar.R()));
                long j3 = jG2;
                if (!z6) {
                    jG2 = jG;
                }
                if (z6) {
                    j3 = jG;
                }
                float fV = fVar.v(x.f7590b);
                float fV2 = fVar.v(x.f7591c);
                fVar.O(((C1987t) ((InterfaceC0878b0) c0459f.f7493q).getValue()).f20264a, jG2, j3, fV2, 1);
                long j7 = jG2;
                float fD = C1892b.d(j7);
                float fD2 = C1892b.d(j3) - C1892b.d(j7);
                H h = (H) c0459f.f7497u;
                long jG3 = AbstractC1110d.g((h.a().f15780b * fD2) + fD, C1892b.e(fVar.R()));
                long j8 = j3;
                fVar.O(((C1987t) ((InterfaceC0878b0) c0459f.f7494r).getValue()).f20264a, AbstractC1110d.g((h.a().f15779a * (C1892b.d(j3) - C1892b.d(j7))) + C1892b.d(j7), C1892b.e(fVar.R())), jG3, fV2, 1);
                float[] fArr = (float[]) h.f7468b.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = fArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    float f7 = fArr[i7];
                    Boolean boolValueOf = Boolean.valueOf(f7 > h.a().f15780b || f7 < h.a().f15779a);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(Float.valueOf(f7));
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    int size = list.size();
                    int i8 = 0;
                    while (i8 < size) {
                        float fFloatValue = ((Number) list.get(i8)).floatValue();
                        float f8 = 2;
                        float f9 = fV;
                        fVar.O(((C1987t) ((InterfaceC0878b0) (zBooleanValue ? c0459f.f7495s : c0459f.f7496t)).getValue()).f20264a, AbstractC1110d.g(C1892b.d(AbstractC1110d.A(fFloatValue, j7, j8)), C1892b.e(fVar.R()) - fVar.v(f8)), AbstractC1110d.g(C1892b.d(AbstractC1110d.A(fFloatValue, j7, j8)), fVar.v(f8) + C1892b.e(fVar.R())), f9, 2);
                        i8++;
                        list = list;
                        size = size;
                        fV = f9;
                        c0459f = this;
                    }
                    c0459f = this;
                }
                return Y4.o.f8736a;
            case 1:
                C0938e c0938eC = ((C0757j) c0459f.f7495s).c((String) c0459f.f7496t, (AbstractC0509a) c0459f.f7497u, new A2.I(14, (InterfaceC0878b0) c0459f.f7493q));
                C0835a c0835a = (C0835a) c0459f.f7494r;
                c0835a.f11303a = c0938eC;
                return new H.F(11, c0835a);
            case 2:
                r1.z zVar = (r1.z) c0459f.f7493q;
                zVar.f15741B.addView(zVar, zVar.f15742C);
                zVar.k((InterfaceC1180a) c0459f.f7494r, (C1405D) c0459f.f7495s, (String) c0459f.f7496t, (n1.n) c0459f.f7497u);
                return new H.F(14, zVar);
            default:
                C2019h c2019h = (C2019h) obj;
                AbstractC1209k.f(c2019h, "entry");
                ((C1216r) c0459f.f7493q).f14435o = true;
                ArrayList arrayList2 = (ArrayList) c0459f.f7494r;
                int iIndexOf = arrayList2.indexOf(c2019h);
                if (iIndexOf != -1) {
                    C1218t c1218t = (C1218t) c0459f.f7495s;
                    int i9 = iIndexOf + 1;
                    listSubList = arrayList2.subList(c1218t.f14437o, i9);
                    c1218t.f14437o = i9;
                } else {
                    listSubList = Z4.v.f8818o;
                }
                ((y3.x) c0459f.f7496t).a(c2019h.f20407p, (Bundle) c0459f.f7497u, c2019h, listSubList);
                return Y4.o.f8736a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459f(InterfaceC0878b0 interfaceC0878b0, H h, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, InterfaceC0878b0 interfaceC0878b04) {
        super(1);
        this.f7492p = 0;
        this.f7493q = interfaceC0878b0;
        this.f7497u = h;
        this.f7494r = interfaceC0878b02;
        this.f7495s = interfaceC0878b03;
        this.f7496t = interfaceC0878b04;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0459f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        super(1);
        this.f7492p = i7;
        this.f7493q = obj;
        this.f7494r = obj2;
        this.f7495s = obj3;
        this.f7496t = obj4;
        this.f7497u = obj5;
    }
}
