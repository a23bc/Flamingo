package Z4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends M3.a {
    public static int k0(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map l0(Y4.h hVar) {
        AbstractC1209k.f(hVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(hVar.f8726o, hVar.f8727p);
        AbstractC1209k.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map m0(Y4.h... hVarArr) {
        if (hVarArr.length <= 0) {
            return w.f8819o;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0(hVarArr.length));
        n0(linkedHashMap, hVarArr);
        return linkedHashMap;
    }

    public static final void n0(HashMap map, Y4.h[] hVarArr) {
        AbstractC1209k.f(hVarArr, "pairs");
        for (Y4.h hVar : hVarArr) {
            map.put(hVar.f8726o, hVar.f8727p);
        }
    }

    public static Map o0(ArrayList arrayList) {
        w wVar = w.f8819o;
        int size = arrayList.size();
        if (size == 0) {
            return wVar;
        }
        if (size == 1) {
            return l0((Y4.h) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Y4.h hVar = (Y4.h) it.next();
            linkedHashMap.put(hVar.f8726o, hVar.f8727p);
        }
        return linkedHashMap;
    }

    public static Map p0(Map map) {
        AbstractC1209k.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return w.f8819o;
        }
        if (size != 1) {
            return q0(map);
        }
        AbstractC1209k.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC1209k.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap q0(Map map) {
        AbstractC1209k.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
