package v;

import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a */
    public final C1600S f18186a;

    /* JADX INFO: renamed from: b */
    public final C1584B f18187b;

    /* JADX INFO: renamed from: c */
    public final W f18188c;

    /* JADX INFO: renamed from: d */
    public final boolean f18189d;

    /* JADX INFO: renamed from: e */
    public final Map f18190e;

    public v0(C1600S c1600s, C1584B c1584b, W w7, boolean z6, Map map) {
        this.f18186a = c1600s;
        this.f18187b = c1584b;
        this.f18188c = w7;
        this.f18189d = z6;
        this.f18190e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC1209k.a(this.f18186a, v0Var.f18186a) && AbstractC1209k.a(this.f18187b, v0Var.f18187b) && AbstractC1209k.a(this.f18188c, v0Var.f18188c) && this.f18189d == v0Var.f18189d && AbstractC1209k.a(this.f18190e, v0Var.f18190e);
    }

    public final int hashCode() {
        C1600S c1600s = this.f18186a;
        int iHashCode = (c1600s == null ? 0 : c1600s.hashCode()) * 961;
        C1584B c1584b = this.f18187b;
        int iHashCode2 = (iHashCode + (c1584b == null ? 0 : c1584b.hashCode())) * 31;
        W w7 = this.f18188c;
        return this.f18190e.hashCode() + ((((iHashCode2 + (w7 != null ? w7.hashCode() : 0)) * 31) + (this.f18189d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f18186a + ", slide=null, changeSize=" + this.f18187b + ", scale=" + this.f18188c + ", hold=" + this.f18189d + ", effectsMap=" + this.f18190e + ')';
    }

    public /* synthetic */ v0(C1600S c1600s, C1584B c1584b, W w7, LinkedHashMap linkedHashMap, int i7) {
        this((i7 & 1) != 0 ? null : c1600s, (i7 & 4) != 0 ? null : c1584b, (i7 & 8) != 0 ? null : w7, (i7 & 16) == 0, (i7 & 32) != 0 ? Z4.w.f8819o : linkedHashMap);
    }
}
