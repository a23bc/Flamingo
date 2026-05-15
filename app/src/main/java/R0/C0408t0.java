package R0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.EnumC0593p;
import d.AbstractActivityC0759l;
import d.C0757j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.AbstractActivityC1121i;
import o0.C1252i;

/* JADX INFO: renamed from: R0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0408t0 implements E3.d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6533b;

    public /* synthetic */ C0408t0(int i7, Object obj) {
        this.f6532a = i7;
        this.f6533b = obj;
    }

    @Override // E3.d
    public final Bundle a() {
        ArrayList arrayList;
        Y1.b[] bVarArr;
        int size;
        Y4.h[] hVarArr;
        switch (this.f6532a) {
            case 0:
                Map mapE = ((C1252i) this.f6533b).e();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapE.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                AbstractActivityC1121i abstractActivityC1121i = (AbstractActivityC1121i) this.f6533b;
                Y1.g gVar = (Y1.g) abstractActivityC1121i.f13916H.f4105p;
                EnumC0593p enumC0593p = EnumC0593p.f9745o;
                Iterator it = gVar.f8599q.f8626c.U().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                abstractActivityC1121i.f13917I.r(EnumC0592o.ON_STOP);
                return new Bundle();
            case 2:
                Y1.q qVar = (Y1.q) this.f6533b;
                qVar.getClass();
                Bundle bundle2 = new Bundle();
                Iterator it2 = qVar.b().iterator();
                while (it2.hasNext()) {
                    ((Y1.x) it2.next()).getClass();
                }
                Iterator it3 = qVar.b().iterator();
                if (it3.hasNext()) {
                    ((Y1.x) it3.next()).a();
                    throw null;
                }
                qVar.e(true);
                qVar.f8646y = true;
                qVar.f8622E.getClass();
                U3.h hVar = qVar.f8626c;
                hVar.getClass();
                HashMap map = (HashMap) hVar.f7043p;
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator it4 = map.values().iterator();
                while (it4.hasNext()) {
                    if (it4.next() != null) {
                        throw new ClassCastException();
                    }
                }
                U3.h hVar2 = qVar.f8626c;
                hVar2.getClass();
                ArrayList<Y1.u> arrayList3 = new ArrayList(((HashMap) hVar2.f7044q).values());
                if (arrayList3.isEmpty()) {
                    Y1.q.h(2);
                } else {
                    U3.h hVar3 = qVar.f8626c;
                    synchronized (((ArrayList) hVar3.f7042o)) {
                        try {
                            if (((ArrayList) hVar3.f7042o).isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(((ArrayList) hVar3.f7042o).size());
                                Iterator it5 = ((ArrayList) hVar3.f7042o).iterator();
                                if (it5.hasNext()) {
                                    if (it5.next() == null) {
                                        throw null;
                                    }
                                    throw new ClassCastException();
                                }
                            }
                        } finally {
                        }
                    }
                    ArrayList arrayList4 = qVar.f8627d;
                    if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                        bVarArr = null;
                    } else {
                        bVarArr = new Y1.b[size];
                        for (int i7 = 0; i7 < size; i7++) {
                            bVarArr[i7] = new Y1.b((Y1.a) qVar.f8627d.get(i7));
                            if (Y1.q.h(2)) {
                                Objects.toString(qVar.f8627d.get(i7));
                            }
                        }
                    }
                    Y1.r rVar = new Y1.r();
                    rVar.f8652s = null;
                    ArrayList arrayList5 = new ArrayList();
                    rVar.f8653t = arrayList5;
                    ArrayList arrayList6 = new ArrayList();
                    rVar.f8654u = arrayList6;
                    rVar.f8648o = arrayList2;
                    rVar.f8649p = arrayList;
                    rVar.f8650q = bVarArr;
                    rVar.f8651r = qVar.h.get();
                    arrayList5.addAll(qVar.f8631i.keySet());
                    arrayList6.addAll(qVar.f8631i.values());
                    rVar.f8655v = new ArrayList(qVar.f8645x);
                    bundle2.putParcelable("state", rVar);
                    for (String str2 : qVar.f8632j.keySet()) {
                        bundle2.putBundle("result_" + str2, (Bundle) qVar.f8632j.get(str2));
                    }
                    for (Y1.u uVar : arrayList3) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("state", uVar);
                        bundle2.putBundle("fragment_" + uVar.f8665p, bundle3);
                    }
                }
                return bundle2;
            case 3:
                AbstractActivityC0759l abstractActivityC0759l = (AbstractActivityC0759l) this.f6533b;
                Bundle bundle4 = new Bundle();
                C0757j c0757j = abstractActivityC0759l.f10790v;
                c0757j.getClass();
                LinkedHashMap linkedHashMap = c0757j.f10769b;
                bundle4.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle4.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle4.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0757j.f10771d));
                bundle4.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0757j.f10774g));
                return bundle4;
            default:
                F5.t tVar = (F5.t) this.f6533b;
                for (Map.Entry entry2 : Z4.y.p0((LinkedHashMap) tVar.f2444s).entrySet()) {
                    tVar.r(((z5.J) ((z5.s) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : Z4.y.p0((LinkedHashMap) tVar.f2442q).entrySet()) {
                    tVar.r(((E3.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) tVar.f2441p;
                if (linkedHashMap2.isEmpty()) {
                    hVarArr = new Y4.h[0];
                } else {
                    ArrayList arrayList7 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList7.add(new Y4.h((String) entry4.getKey(), entry4.getValue()));
                    }
                    hVarArr = (Y4.h[]) arrayList7.toArray(new Y4.h[0]);
                }
                return android.support.v4.media.session.b.f((Y4.h[]) Arrays.copyOf(hVarArr, hVarArr.length));
        }
    }
}
