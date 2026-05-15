package W;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7709c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f7710d = null;

    public o(String str, String str2) {
        this.f7707a = str;
        this.f7708b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC1209k.a(this.f7707a, oVar.f7707a) && AbstractC1209k.a(this.f7708b, oVar.f7708b) && this.f7709c == oVar.f7709c && AbstractC1209k.a(this.f7710d, oVar.f7710d);
    }

    public final int hashCode() {
        int iC = (A0.e.C(this.f7708b, this.f7707a.hashCode() * 31, 31) + (this.f7709c ? 1231 : 1237)) * 31;
        e eVar = this.f7710d;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f7710d + ", isShowingSubstitution=" + this.f7709c + ')';
    }
}
