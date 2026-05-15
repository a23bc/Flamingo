package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9730a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f9730a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Q) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
