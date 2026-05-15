package v6;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18375b;

    public i(String str, int i7) {
        AbstractC1209k.f(str, "label");
        this.f18374a = str;
        this.f18375b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC1209k.a(this.f18374a, iVar.f18374a) && this.f18375b == iVar.f18375b;
    }

    public final int hashCode() {
        return (this.f18374a.hashCode() * 31) + this.f18375b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavItem(label=");
        sb.append(this.f18374a);
        sb.append(", iconResId=");
        return Z1.l.r(sb, this.f18375b, ')');
    }
}
