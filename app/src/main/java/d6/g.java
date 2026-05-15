package d6;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11298b;

    public g(String str, int i7) {
        str = (i7 & 4) != 0 ? "No lyrics" : str;
        AbstractC1209k.f(str, "noLrcText");
        this.f11297a = str;
        this.f11298b = 18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return this.f11297a.equals(gVar.f11297a) && this.f11298b == gVar.f11298b && Float.compare(0.4f, 0.4f) == 0 && Float.compare(0.3f, 0.3f) == 0 && Float.compare(0.9f, 0.9f) == 0 && Float.compare(0.6f, 0.6f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.6f) + n1.c.n(0.9f, n1.c.n(0.3f, n1.c.n(0.4f, (((((((((((this.f11297a.hashCode() + 1221152) * 31) + 70) * 31) + 34) * 31) + this.f11298b) * 31) + ((int) 4294111986L)) * 31) + ((int) 4287730065L)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "YosUIConfig(edgeFade=true, formatText=true, noLrcText=" + this.f11297a + ", blankHeight=70, mainTextSize=34, subTextSize=" + this.f11298b + ", mainTextBasicColor=4294111986, subTextBasicColor=4287730065, normalMainTextAlpha=0.4, normalSubTextAlpha=0.3, currentMainTextAlpha=0.9, currentSubTextAlpha=0.6)";
    }
}
