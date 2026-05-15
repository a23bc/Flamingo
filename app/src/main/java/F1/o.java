package f1;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f12015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12019e;

    public o(n nVar, k kVar, int i7, int i8, Object obj) {
        this.f12015a = nVar;
        this.f12016b = kVar;
        this.f12017c = i7;
        this.f12018d = i8;
        this.f12019e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC1209k.a(this.f12015a, oVar.f12015a) && AbstractC1209k.a(this.f12016b, oVar.f12016b) && this.f12017c == oVar.f12017c && this.f12018d == oVar.f12018d && AbstractC1209k.a(this.f12019e, oVar.f12019e);
    }

    public final int hashCode() {
        n nVar = this.f12015a;
        int iHashCode = (((((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f12016b.f12008o) * 31) + this.f12017c) * 31) + this.f12018d) * 31;
        Object obj = this.f12019e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f12015a);
        sb.append(", fontWeight=");
        sb.append(this.f12016b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i7 = this.f12017c;
        sb.append((Object) (i7 == 0 ? "Normal" : i7 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i8 = this.f12018d;
        if (i8 == 0) {
            str = "None";
        } else if (i8 == 1) {
            str = "Weight";
        } else if (i8 == 2) {
            str = "Style";
        } else if (i8 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f12019e);
        sb.append(')');
        return sb.toString();
    }
}
