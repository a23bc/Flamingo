package W0;

import Z1.l;
import android.content.res.Resources;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f7725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7726b;

    public b(Resources.Theme theme, int i7) {
        this.f7725a = theme;
        this.f7726b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC1209k.a(this.f7725a, bVar.f7725a) && this.f7726b == bVar.f7726b;
    }

    public final int hashCode() {
        return (this.f7725a.hashCode() * 31) + this.f7726b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f7725a);
        sb.append(", id=");
        return l.r(sb, this.f7726b, ')');
    }
}
