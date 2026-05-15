package u6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17394b;

    public F(int i7, ArrayList arrayList) {
        this.f17393a = arrayList;
        this.f17394b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f7 = (F) obj;
        return this.f17393a.equals(f7.f17393a) && this.f17394b == f7.f17394b;
    }

    public final int hashCode() {
        return (this.f17393a.hashCode() * 961) + this.f17394b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WavyLazyColumnLayoutInfo(visibleItemsInfo=");
        sb.append(this.f17393a);
        sb.append(", viewportStartOffset=0, viewportEndOffset=");
        return Z1.l.r(sb, this.f17394b, ')');
    }
}
