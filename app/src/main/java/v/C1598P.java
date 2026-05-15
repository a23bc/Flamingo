package v;

import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: v.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1598P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1598P f18003b = new C1598P(new v0((C1600S) null, (C1584B) null, (W) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f18004a;

    public C1598P(v0 v0Var) {
        this.f18004a = v0Var;
    }

    public final C1598P a(C1598P c1598p) {
        v0 v0Var = c1598p.f18004a;
        v0 v0Var2 = this.f18004a;
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
        Map map = v0Var2.f18190e;
        AbstractC1209k.f(map, "<this>");
        Map map2 = v0Var.f18190e;
        AbstractC1209k.f(map2, "map");
        C1600S c1600s2 = c1600s;
        C1584B c1584b2 = c1584b;
        W w8 = w7;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C1598P(new v0(c1600s2, c1584b2, w8, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1598P) && AbstractC1209k.a(((C1598P) obj).f18004a, this.f18004a);
    }

    public final int hashCode() {
        return this.f18004a.hashCode();
    }

    public final String toString() {
        if (equals(f18003b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        v0 v0Var = this.f18004a;
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
        return sb.toString();
    }
}
