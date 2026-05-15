package p4;

import Z4.w;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b */
    public static final o f15099b = new o(w.f8819o);

    /* JADX INFO: renamed from: a */
    public final Map f15100a;

    public o(Map map) {
        this.f15100a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return AbstractC1209k.a(this.f15100a, ((o) obj).f15100a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15100a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f15100a + ')';
    }
}
