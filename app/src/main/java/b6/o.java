package b6;

import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10449a;

    public o(Map map) {
        this.f10449a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && AbstractC1209k.a(this.f10449a, ((o) obj).f10449a);
    }

    public final int hashCode() {
        return this.f10449a.hashCode();
    }

    public final String toString() {
        return "YosShallowFolder(folderList=" + this.f10449a + ')';
    }
}
