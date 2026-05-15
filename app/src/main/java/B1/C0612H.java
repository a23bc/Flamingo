package b1;

import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0612H {

    /* JADX INFO: renamed from: a */
    public final C0622g f9920a;

    /* JADX INFO: renamed from: b */
    public final M f9921b;

    /* JADX INFO: renamed from: c */
    public final List f9922c;

    /* JADX INFO: renamed from: d */
    public final int f9923d;

    /* JADX INFO: renamed from: e */
    public final boolean f9924e;

    /* JADX INFO: renamed from: f */
    public final int f9925f;

    /* JADX INFO: renamed from: g */
    public final n1.d f9926g;
    public final n1.n h;

    /* JADX INFO: renamed from: i */
    public final f1.d f9927i;

    /* JADX INFO: renamed from: j */
    public final long f9928j;

    public C0612H(C0622g c0622g, M m7, List list, int i7, boolean z6, int i8, n1.d dVar, n1.n nVar, f1.d dVar2, long j3) {
        this.f9920a = c0622g;
        this.f9921b = m7;
        this.f9922c = list;
        this.f9923d = i7;
        this.f9924e = z6;
        this.f9925f = i8;
        this.f9926g = dVar;
        this.h = nVar;
        this.f9927i = dVar2;
        this.f9928j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0612H)) {
            return false;
        }
        C0612H c0612h = (C0612H) obj;
        return AbstractC1209k.a(this.f9920a, c0612h.f9920a) && AbstractC1209k.a(this.f9921b, c0612h.f9921b) && AbstractC1209k.a(this.f9922c, c0612h.f9922c) && this.f9923d == c0612h.f9923d && this.f9924e == c0612h.f9924e && this.f9925f == c0612h.f9925f && AbstractC1209k.a(this.f9926g, c0612h.f9926g) && this.h == c0612h.h && AbstractC1209k.a(this.f9927i, c0612h.f9927i) && n1.a.b(this.f9928j, c0612h.f9928j);
    }

    public final int hashCode() {
        int iHashCode = (this.f9927i.hashCode() + ((this.h.hashCode() + ((this.f9926g.hashCode() + ((((((((this.f9922c.hashCode() + A0.e.B(this.f9920a.hashCode() * 31, 31, this.f9921b)) * 31) + this.f9923d) * 31) + (this.f9924e ? 1231 : 1237)) * 31) + this.f9925f) * 31)) * 31)) * 31)) * 31;
        long j3 = this.f9928j;
        return ((int) (j3 ^ (j3 >>> 32))) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f9920a);
        sb.append(", style=");
        sb.append(this.f9921b);
        sb.append(", placeholders=");
        sb.append(this.f9922c);
        sb.append(", maxLines=");
        sb.append(this.f9923d);
        sb.append(", softWrap=");
        sb.append(this.f9924e);
        sb.append(", overflow=");
        int i7 = this.f9925f;
        sb.append((Object) (i7 == 1 ? "Clip" : i7 == 2 ? "Ellipsis" : i7 == 5 ? "MiddleEllipsis" : i7 == 3 ? "Visible" : i7 == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f9926g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f9927i);
        sb.append(", constraints=");
        sb.append((Object) n1.a.k(this.f9928j));
        sb.append(')');
        return sb.toString();
    }
}
