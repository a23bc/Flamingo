package q4;

import j0.k;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f15593c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15595b;

    static {
        C1378b c1378b = C1378b.f15583a;
        f15593c = new h(c1378b, c1378b);
    }

    public h(k kVar, k kVar2) {
        this.f15594a = kVar;
        this.f15595b = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC1209k.a(this.f15594a, hVar.f15594a) && AbstractC1209k.a(this.f15595b, hVar.f15595b);
    }

    public final int hashCode() {
        return this.f15595b.hashCode() + (this.f15594a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f15594a + ", height=" + this.f15595b + ')';
    }
}
