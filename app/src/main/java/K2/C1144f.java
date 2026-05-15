package k2;

import l2.C1167g;
import m5.AbstractC1209k;
import n1.p;
import y0.C1987t;

/* JADX INFO: renamed from: k2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1144f {

    /* JADX INFO: renamed from: a */
    public final C1167g f14018a;

    /* JADX INFO: renamed from: b */
    public final p f14019b;

    /* JADX INFO: renamed from: c */
    public final C1140b f14020c;

    public C1144f(C1167g c1167g, p pVar, C1140b c1140b, int i7) {
        pVar = (i7 & 2) != 0 ? null : pVar;
        c1140b = (i7 & 4) != 0 ? null : c1140b;
        this.f14018a = c1167g;
        this.f14019b = pVar;
        this.f14020c = c1140b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144f)) {
            return false;
        }
        C1144f c1144f = (C1144f) obj;
        return AbstractC1209k.a(this.f14018a, c1144f.f14018a) && AbstractC1209k.a(this.f14019b, c1144f.f14019b) && AbstractC1209k.a(this.f14020c, c1144f.f14020c);
    }

    public final int hashCode() {
        int i7 = C1987t.i(this.f14018a.f14166a) * 31;
        p pVar = this.f14019b;
        return (((i7 + (pVar != null ? p.d(pVar.f14527a) : 0)) * 31) + (this.f14020c != null ? 500 : 0)) * 923521;
    }

    public final String toString() {
        return "TextStyle(color=" + this.f14018a + ", fontSize=" + this.f14019b + ", fontWeight=" + this.f14020c + ", fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
