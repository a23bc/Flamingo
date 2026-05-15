package F5;

import java.util.ArrayList;
import java.util.Set;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c */
    public static final e f2337c = new e(Z4.n.O0(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set f2338a;

    /* JADX INFO: renamed from: b */
    public final N5.d f2339b;

    public e(Set set, N5.d dVar) {
        this.f2338a = set;
        this.f2339b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC1209k.a(eVar.f2338a, this.f2338a) && AbstractC1209k.a(eVar.f2339b, this.f2339b);
    }

    public final int hashCode() {
        int iHashCode = (this.f2338a.hashCode() + 1517) * 41;
        N5.d dVar = this.f2339b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
