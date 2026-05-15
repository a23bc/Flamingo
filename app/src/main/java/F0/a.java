package F0;

import Z1.l;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f2168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2169b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A.b f2170c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f2168a = xmlResourceParser;
        A.b bVar = new A.b(9);
        bVar.f3p = new float[64];
        this.f2170c = bVar;
    }

    public final float a(TypedArray typedArray, String str, int i7, float f7) {
        if (x1.b.d(this.f2168a, str)) {
            f7 = typedArray.getFloat(i7, f7);
        }
        b(typedArray.getChangingConfigurations());
        return f7;
    }

    public final void b(int i7) {
        this.f2169b = i7 | this.f2169b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1209k.a(this.f2168a, aVar.f2168a) && this.f2169b == aVar.f2169b;
    }

    public final int hashCode() {
        return (this.f2168a.hashCode() * 31) + this.f2169b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f2168a);
        sb.append(", config=");
        return l.r(sb, this.f2169b, ')');
    }
}
