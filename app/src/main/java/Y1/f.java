package Y1;

import G1.InterfaceC0143j;
import R0.C0408t0;
import android.os.Bundle;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.W;
import d.AbstractActivityC0759l;
import d.C0743I;
import d.C0757j;
import f.InterfaceC0872a;
import g.InterfaceC0939f;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractActivityC1121i;
import m5.AbstractC1209k;
import m5.AbstractC1221w;
import m5.AbstractC1223y;
import v1.InterfaceC1632b;
import v1.InterfaceC1633c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0872a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0759l f8596b;

    public /* synthetic */ f(AbstractActivityC0759l abstractActivityC0759l, int i7) {
        this.f8595a = i7;
        this.f8596b = abstractActivityC0759l;
    }

    @Override // f.InterfaceC0872a
    public final void a(AbstractActivityC0759l abstractActivityC0759l) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f8595a) {
            case 0:
                g gVar = (g) ((AbstractActivityC1121i) this.f8596b).f13916H.f4105p;
                q qVar = gVar.f8599q;
                if (qVar.f8639r != null) {
                    throw new IllegalStateException("Already attached");
                }
                qVar.f8639r = gVar;
                qVar.f8640s = gVar;
                qVar.f8633k.add(gVar);
                AbstractActivityC1121i abstractActivityC1121i = gVar.f8600r;
                C0743I c0743iA = abstractActivityC1121i.a();
                qVar.f8629f = c0743iA;
                c0743iA.a(gVar, qVar.f8630g);
                t tVar = (t) new W(abstractActivityC1121i.g(), t.f8658f).a(AbstractC1221w.a(t.class));
                qVar.f8622E = tVar;
                U3.h hVar = qVar.f8626c;
                hVar.f7045r = tVar;
                g gVar2 = qVar.f8639r;
                if (gVar2 instanceof E3.f) {
                    V.o oVarB = gVar2.b();
                    oVarB.G("android:support:fragments", new C0408t0(2, qVar));
                    Bundle bundleF = oVarB.f("android:support:fragments");
                    if (bundleF != null) {
                        for (String str : bundleF.keySet()) {
                            if (str.startsWith("result_") && (bundle2 = bundleF.getBundle(str)) != null) {
                                bundle2.setClassLoader(qVar.f8639r.f8597o.getClassLoader());
                                qVar.f8632j.put(str.substring(7), bundle2);
                            }
                        }
                        ArrayList<u> arrayList = new ArrayList();
                        for (String str2 : bundleF.keySet()) {
                            if (str2.startsWith("fragment_") && (bundle = bundleF.getBundle(str2)) != null) {
                                bundle.setClassLoader(qVar.f8639r.f8597o.getClassLoader());
                                arrayList.add((u) bundle.getParcelable("state"));
                            }
                        }
                        HashMap map = (HashMap) hVar.f7044q;
                        map.clear();
                        for (u uVar : arrayList) {
                            map.put(uVar.f8665p, uVar);
                        }
                        r rVar = (r) bundleF.getParcelable("state");
                        if (rVar != null) {
                            HashMap map2 = (HashMap) hVar.f7043p;
                            map2.clear();
                            Iterator it = rVar.f8648o.iterator();
                            while (it.hasNext()) {
                                u uVar2 = (u) map.remove((String) it.next());
                                if (uVar2 != null) {
                                    if (qVar.f8622E.f8659b.get(uVar2.f8665p) != null) {
                                        throw new ClassCastException();
                                    }
                                    ClassLoader classLoader = qVar.f8639r.f8597o.getClassLoader();
                                    qVar.f8641t.a(uVar2.f8664o);
                                    Bundle bundle3 = uVar2.f8673x;
                                    if (bundle3 == null) {
                                        throw null;
                                    }
                                    bundle3.setClassLoader(classLoader);
                                    throw null;
                                }
                            }
                            t tVar2 = qVar.f8622E;
                            tVar2.getClass();
                            Iterator it2 = new ArrayList(tVar2.f8659b.values()).iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            ArrayList arrayList2 = rVar.f8649p;
                            ((ArrayList) hVar.f7042o).clear();
                            if (arrayList2 != null) {
                                Iterator it3 = arrayList2.iterator();
                                if (it3.hasNext()) {
                                    String str3 = (String) it3.next();
                                    A0.e.G(map2.get(str3));
                                    throw new IllegalStateException(Z1.l.q("No instantiated fragment for (", str3, ")"));
                                }
                            }
                            if (rVar.f8650q != null) {
                                qVar.f8627d = new ArrayList(rVar.f8650q.length);
                                int i7 = 0;
                                while (true) {
                                    b[] bVarArr = rVar.f8650q;
                                    if (i7 < bVarArr.length) {
                                        b bVar = bVarArr[i7];
                                        bVar.getClass();
                                        a aVar = new a(qVar);
                                        int i8 = 0;
                                        int i9 = 0;
                                        while (true) {
                                            int[] iArr = bVar.f8579o;
                                            boolean z6 = true;
                                            if (i8 < iArr.length) {
                                                v vVar = new v();
                                                int i10 = i8 + 1;
                                                vVar.f8676a = iArr[i8];
                                                if (q.h(2)) {
                                                    Objects.toString(aVar);
                                                    int i11 = iArr[i10];
                                                }
                                                vVar.f8682g = EnumC0593p.values()[bVar.f8581q[i9]];
                                                vVar.h = EnumC0593p.values()[bVar.f8582r[i9]];
                                                int i12 = i8 + 2;
                                                if (iArr[i10] == 0) {
                                                    z6 = false;
                                                }
                                                vVar.f8677b = z6;
                                                int i13 = iArr[i12];
                                                vVar.f8678c = i13;
                                                int i14 = iArr[i8 + 3];
                                                vVar.f8679d = i14;
                                                int i15 = i8 + 5;
                                                int i16 = iArr[i8 + 4];
                                                vVar.f8680e = i16;
                                                i8 += 6;
                                                int i17 = iArr[i15];
                                                vVar.f8681f = i17;
                                                aVar.f8563b = i13;
                                                aVar.f8564c = i14;
                                                aVar.f8565d = i16;
                                                aVar.f8566e = i17;
                                                aVar.f8562a.add(vVar);
                                                vVar.f8678c = aVar.f8563b;
                                                vVar.f8679d = aVar.f8564c;
                                                vVar.f8680e = aVar.f8565d;
                                                vVar.f8681f = aVar.f8566e;
                                                i9++;
                                            } else {
                                                aVar.f8567f = bVar.f8583s;
                                                aVar.h = bVar.f8584t;
                                                aVar.f8568g = true;
                                                aVar.f8569i = bVar.f8586v;
                                                aVar.f8570j = bVar.f8587w;
                                                aVar.f8571k = bVar.f8588x;
                                                aVar.l = bVar.f8589y;
                                                aVar.f8572m = bVar.f8590z;
                                                aVar.f8573n = bVar.f8577A;
                                                aVar.f8574o = bVar.f8578B;
                                                aVar.f8576q = bVar.f8585u;
                                                int i18 = 0;
                                                while (true) {
                                                    ArrayList arrayList3 = bVar.f8580p;
                                                    if (i18 < arrayList3.size()) {
                                                        String str4 = (String) arrayList3.get(i18);
                                                        if (str4 != null) {
                                                            v vVar2 = (v) aVar.f8562a.get(i18);
                                                            A0.e.G(((HashMap) hVar.f7043p).get(str4));
                                                            vVar2.getClass();
                                                        }
                                                        i18++;
                                                    } else {
                                                        aVar.a();
                                                        if (q.h(2)) {
                                                            aVar.toString();
                                                            PrintWriter printWriter = new PrintWriter(new w());
                                                            aVar.b("  ", printWriter, false);
                                                            printWriter.close();
                                                        }
                                                        qVar.f8627d.add(aVar);
                                                        i7++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                qVar.f8627d = null;
                            }
                            qVar.h.set(rVar.f8651r);
                            String str5 = rVar.f8652s;
                            if (str5 != null) {
                                A0.e.G(((HashMap) hVar.f7043p).get(str5));
                            }
                            ArrayList arrayList4 = rVar.f8653t;
                            if (arrayList4 != null) {
                                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                    qVar.f8631i.put((String) arrayList4.get(i19), (c) rVar.f8654u.get(i19));
                                }
                            }
                            qVar.f8645x = new ArrayDeque(rVar.f8655v);
                        }
                    }
                }
                g gVar3 = qVar.f8639r;
                if (gVar3 instanceof InterfaceC0939f) {
                    AbstractActivityC1121i abstractActivityC1121i2 = gVar3.f8600r;
                    o oVar = new o(2);
                    k kVar = new k(qVar, 1);
                    C0757j c0757j = abstractActivityC1121i2.f10790v;
                    qVar.f8642u = c0757j.c("FragmentManager:StartActivityForResult", oVar, kVar);
                    qVar.f8643v = c0757j.c("FragmentManager:StartIntentSenderForResult", new o(0), new k(qVar, 2));
                    qVar.f8644w = c0757j.c("FragmentManager:RequestPermissions", new o(1), new k(qVar, 0));
                }
                g gVar4 = qVar.f8639r;
                if (gVar4 instanceof InterfaceC1632b) {
                    AbstractActivityC1121i abstractActivityC1121i3 = gVar4.f8600r;
                    j jVar = qVar.l;
                    AbstractC1209k.f(jVar, "listener");
                    abstractActivityC1121i3.f10791w.add(jVar);
                }
                g gVar5 = qVar.f8639r;
                if (gVar5 instanceof InterfaceC1633c) {
                    AbstractActivityC1121i abstractActivityC1121i4 = gVar5.f8600r;
                    j jVar2 = qVar.f8634m;
                    AbstractC1209k.f(jVar2, "listener");
                    abstractActivityC1121i4.f10792x.add(jVar2);
                }
                g gVar6 = qVar.f8639r;
                if (gVar6 instanceof u1.s) {
                    AbstractActivityC1121i abstractActivityC1121i5 = gVar6.f8600r;
                    j jVar3 = qVar.f8635n;
                    AbstractC1209k.f(jVar3, "listener");
                    abstractActivityC1121i5.f10794z.add(jVar3);
                }
                g gVar7 = qVar.f8639r;
                if (gVar7 instanceof u1.t) {
                    AbstractActivityC1121i abstractActivityC1121i6 = gVar7.f8600r;
                    j jVar4 = qVar.f8636o;
                    AbstractC1209k.f(jVar4, "listener");
                    abstractActivityC1121i6.f10778A.add(jVar4);
                }
                g gVar8 = qVar.f8639r;
                if (gVar8 instanceof InterfaceC0143j) {
                    AbstractActivityC1121i abstractActivityC1121i7 = gVar8.f8600r;
                    m mVar = qVar.f8637p;
                    AbstractC1209k.f(mVar, "provider");
                    A0.b bVar2 = abstractActivityC1121i7.f10785q;
                    ((CopyOnWriteArrayList) bVar2.f51q).add(mVar);
                    ((Runnable) bVar2.f50p).run();
                    return;
                }
                return;
            default:
                AbstractActivityC0759l abstractActivityC0759l2 = this.f8596b;
                AbstractC1209k.f(abstractActivityC0759l, "it");
                Bundle bundleF2 = ((V.o) abstractActivityC0759l2.f10786r.f7343q).f("android:support:activity-result");
                if (bundleF2 != null) {
                    C0757j c0757j2 = abstractActivityC0759l2.f10790v;
                    c0757j2.getClass();
                    ArrayList<Integer> integerArrayList = bundleF2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleF2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleF2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0757j2.f10771d.addAll(stringArrayList2);
                    }
                    Bundle bundle4 = bundleF2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle5 = c0757j2.f10774g;
                    if (bundle4 != null) {
                        bundle5.putAll(bundle4);
                    }
                    int size = stringArrayList.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        String str6 = stringArrayList.get(i20);
                        LinkedHashMap linkedHashMap = c0757j2.f10769b;
                        boolean zContainsKey = linkedHashMap.containsKey(str6);
                        LinkedHashMap linkedHashMap2 = c0757j2.f10768a;
                        if (zContainsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str6);
                            if (!bundle5.containsKey(str6)) {
                                AbstractC1223y.b(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i20);
                        AbstractC1209k.e(num2, "rcs[i]");
                        int iIntValue = num2.intValue();
                        String str7 = stringArrayList.get(i20);
                        AbstractC1209k.e(str7, "keys[i]");
                        String str8 = str7;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str8);
                        linkedHashMap.put(str8, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
        }
    }
}
