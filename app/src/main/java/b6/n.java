package b6;

import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f10448c;

    public n(List list, List list2, o oVar) {
        AbstractC1209k.f(list2, "songPaths");
        this.f10446a = list;
        this.f10447b = list2;
        this.f10448c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f10446a.equals(nVar.f10446a) && AbstractC1209k.a(this.f10447b, nVar.f10447b) && this.f10448c.equals(nVar.f10448c);
    }

    public final int hashCode() {
        return this.f10448c.f10449a.hashCode() + ((this.f10447b.hashCode() + (this.f10446a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "YosReaderResult(songList=" + this.f10446a + ", songPaths=" + this.f10447b + ", shallowFolder=" + this.f10448c + ')';
    }
}
