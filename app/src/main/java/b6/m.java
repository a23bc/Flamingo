package b6;

import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10445b;

    public m(List list, List list2) {
        AbstractC1209k.f(list, "songList");
        AbstractC1209k.f(list2, "songPaths");
        this.f10444a = list;
        this.f10445b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC1209k.a(this.f10444a, mVar.f10444a) && AbstractC1209k.a(this.f10445b, mVar.f10445b);
    }

    public final int hashCode() {
        return this.f10445b.hashCode() + (this.f10444a.hashCode() * 31);
    }

    public final String toString() {
        return "YosFolderNode(songList=" + this.f10444a + ", songPaths=" + this.f10445b + ')';
    }
}
