package z3;

import Z4.y;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import o0.C1245b;
import y3.AbstractC2010C;
import y3.C2019h;
import y3.C2020i;
import y3.x;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f21157p = new m(2);

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        x xVar = (x) obj2;
        AbstractC1209k.f((C1245b) obj, "$this$Saver");
        AbstractC1209k.f(xVar, "it");
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : y.p0(xVar.f20511w.f20392a).entrySet()) {
            ((AbstractC2010C) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        Z4.k kVar = xVar.f20497g;
        if (!kVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[kVar.f8814q];
            Iterator<E> it = kVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                parcelableArr[i7] = new C2020i((C2019h) it.next());
                i7++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = xVar.f20501m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i8 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i8] = iIntValue;
                arrayList2.add(str);
                i8++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = xVar.f20502n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                Z4.k kVar2 = (Z4.k) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[kVar2.f8814q];
                int i9 = 0;
                for (Object obj3 : kVar2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        Z4.o.i0();
                        throw null;
                    }
                    parcelableArr2[i9] = (C2020i) obj3;
                    i9 = i10;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (xVar.f20496f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", xVar.f20496f);
        }
        return bundle;
    }
}
