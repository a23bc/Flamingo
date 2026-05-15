package W0;

import E0.C0095f;
import Z1.l;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0095f f7723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7724b;

    public a(C0095f c0095f, int i7) {
        this.f7723a = c0095f;
        this.f7724b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1209k.a(this.f7723a, aVar.f7723a) && this.f7724b == aVar.f7724b;
    }

    public final int hashCode() {
        return (this.f7723a.hashCode() * 31) + this.f7724b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f7723a);
        sb.append(", configFlags=");
        return l.r(sb, this.f7724b, ')');
    }
}
