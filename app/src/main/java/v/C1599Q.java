package v;

import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: v.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1599Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1599Q f18005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1599Q f18006c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f18007a;

    static {
        W w7 = null;
        LinkedHashMap linkedHashMap = null;
        C1600S c1600s = null;
        C1584B c1584b = null;
        f18005b = new C1599Q(new v0(c1600s, c1584b, w7, linkedHashMap, 63));
        f18006c = new C1599Q(new v0(c1600s, c1584b, w7, linkedHashMap, 47));
    }

    public C1599Q(v0 v0Var) {
        this.f18007a = v0Var;
    }

    public final C1599Q a(C1599Q c1599q) {
        v0 v0Var = c1599q.f18007a;
        v0 v0Var2 = this.f18007a;
        C1600S c1600s = v0Var.f18186a;
        if (c1600s == null) {
            c1600s = v0Var2.f18186a;
        }
        C1584B c1584b = v0Var.f18187b;
        if (c1584b == null) {
            c1584b = v0Var2.f18187b;
        }
        W w7 = v0Var.f18188c;
        if (w7 == null) {
            w7 = v0Var2.f18188c;
        }
        boolean z6 = v0Var.f18189d || v0Var2.f18189d;
        Map map = v0Var2.f18190e;
        AbstractC1209k.f(map, "<this>");
        Map map2 = v0Var.f18190e;
        AbstractC1209k.f(map2, "map");
        C1600S c1600s2 = c1600s;
        C1584B c1584b2 = c1584b;
        W w8 = w7;
        boolean z7 = z6;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C1599Q(new v0(c1600s2, c1584b2, w8, z7, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1599Q) && AbstractC1209k.a(((C1599Q) obj).f18007a, this.f18007a);
    }

    public final int hashCode() {
        return this.f18007a.hashCode();
    }

    public final String toString() {
        if (equals(f18005b)) {
            return "ExitTransition.None";
        }
        if (equals(f18006c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        v0 v0Var = this.f18007a;
        C1600S c1600s = v0Var.f18186a;
        sb.append(c1600s != null ? c1600s.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        C1584B c1584b = v0Var.f18187b;
        sb.append(c1584b != null ? c1584b.toString() : null);
        sb.append(",\nScale - ");
        W w7 = v0Var.f18188c;
        sb.append(w7 != null ? w7.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(v0Var.f18189d);
        return sb.toString();
    }
}
