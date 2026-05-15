package W;

import b1.C0622g;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0622g f7687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0622g f7688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7689c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f7690d = null;

    public l(C0622g c0622g, C0622g c0622g2) {
        this.f7687a = c0622g;
        this.f7688b = c0622g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC1209k.a(this.f7687a, lVar.f7687a) && AbstractC1209k.a(this.f7688b, lVar.f7688b) && this.f7689c == lVar.f7689c && AbstractC1209k.a(this.f7690d, lVar.f7690d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f7688b.hashCode() + (this.f7687a.hashCode() * 31)) * 31) + (this.f7689c ? 1231 : 1237)) * 31;
        d dVar = this.f7690d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f7687a) + ", substitution=" + ((Object) this.f7688b) + ", isShowingSubstitution=" + this.f7689c + ", layoutCache=" + this.f7690d + ')';
    }
}
