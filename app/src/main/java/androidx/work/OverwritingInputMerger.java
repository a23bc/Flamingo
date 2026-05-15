package androidx.work;

import N3.h;
import N3.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // N3.j
    public final h a(ArrayList arrayList) throws Throwable {
        B3.j jVar = new B3.j();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((h) it.next()).f5135a));
        }
        jVar.h(map);
        h hVar = new h(jVar.f848a);
        h.b(hVar);
        return hVar;
    }
}
