package R1;

import Z4.n;
import Z4.y;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6655b;

    public b(LinkedHashMap linkedHashMap, boolean z6) {
        this.f6654a = linkedHashMap;
        this.f6655b = new AtomicBoolean(z6);
    }

    public final Object a(e eVar) {
        AbstractC1209k.f(eVar, "key");
        return this.f6654a.get(eVar);
    }

    public final void b(e eVar, Object obj) {
        AbstractC1209k.f(eVar, "key");
        if (this.f6655b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        boolean z6 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f6654a;
        if (!z6) {
            linkedHashMap.put(eVar, obj);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(n.O0((Iterable) obj));
        AbstractC1209k.e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        linkedHashMap.put(eVar, setUnmodifiableSet);
    }

    public final b c() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f6654a);
        AbstractC1209k.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return new b(y.q0(mapUnmodifiableMap), true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return AbstractC1209k.a(this.f6654a, ((b) obj).f6654a);
    }

    public final int hashCode() {
        return this.f6654a.hashCode();
    }

    public final String toString() {
        return n.w0(this.f6654a.entrySet(), ",\n", "{\n", "\n}", a.f6653p, 24);
    }

    public /* synthetic */ b(boolean z6) {
        this(new LinkedHashMap(), z6);
    }
}
