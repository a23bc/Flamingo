package W3;

import N3.v;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f7797b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7797b != gVar.f7797b) {
            return false;
        }
        return this.f7796a.equals(gVar.f7796a);
    }

    public final int hashCode() {
        return this.f7797b.hashCode() + (this.f7796a.hashCode() * 31);
    }
}
