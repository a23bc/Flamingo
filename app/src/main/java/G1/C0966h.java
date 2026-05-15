package g1;

import androidx.datastore.preferences.protobuf.C0535h;
import b1.AbstractC0607C;
import b1.C0622g;
import b1.L;
import h1.AbstractC0996a;
import h3.C1000b;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: g1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0966h implements h3.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12354o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f12359t;

    public C0966h(C0622g c0622g, long j3) {
        String str = c0622g.f9970p;
        d1.e eVar = new d1.e(1, (byte) 0);
        eVar.f11186d = str;
        eVar.f11184b = -1;
        eVar.f11185c = -1;
        this.f12359t = eVar;
        this.f12355p = L.f(j3);
        this.f12356q = L.e(j3);
        this.f12357r = -1;
        this.f12358s = -1;
        int iF = L.f(j3);
        int iE = L.e(j3);
        String str2 = c0622g.f9970p;
        if (iF < 0 || iF > str2.length()) {
            StringBuilder sbV = n1.c.v(iF, "start (", ") offset is outside of text region ");
            sbV.append(str2.length());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (iE < 0 || iE > str2.length()) {
            StringBuilder sbV2 = n1.c.v(iE, "end (", ") offset is outside of text region ");
            sbV2.append(str2.length());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (iF > iE) {
            throw new IllegalArgumentException(Z1.l.p("Do not set reversed range: ", iF, iE, " > "));
        }
    }

    public void a(int i7, int i8) {
        long jB = AbstractC0607C.b(i7, i8);
        ((d1.e) this.f12359t).s("", i7, i8);
        long jQ = AbstractC1267a.Q(AbstractC0607C.b(this.f12355p, this.f12356q), jB);
        k(L.f(jQ));
        j(L.e(jQ));
        int i9 = this.f12357r;
        if (i9 != -1) {
            long jQ2 = AbstractC1267a.Q(AbstractC0607C.b(i9, this.f12358s), jB);
            if (L.c(jQ2)) {
                this.f12357r = -1;
                this.f12358s = -1;
            } else {
                this.f12357r = L.f(jQ2);
                this.f12358s = L.e(jQ2);
            }
        }
    }

    @Override // h3.e
    public int b() {
        return -1;
    }

    @Override // h3.e
    public int c() {
        return this.f12355p;
    }

    @Override // h3.e
    public int d() {
        w2.m mVar = (w2.m) this.f12359t;
        int i7 = this.f12356q;
        if (i7 == 8) {
            return mVar.u();
        }
        if (i7 == 16) {
            return mVar.A();
        }
        int i8 = this.f12357r;
        this.f12357r = i8 + 1;
        if (i8 % 2 != 0) {
            return this.f12358s & 15;
        }
        int iU = mVar.u();
        this.f12358s = iU;
        return (iU & 240) >> 4;
    }

    public char e(int i7) {
        d1.e eVar = (d1.e) this.f12359t;
        C0535h c0535h = (C0535h) eVar.f11187e;
        if (c0535h == null) {
            return ((String) eVar.f11186d).charAt(i7);
        }
        if (i7 < eVar.f11184b) {
            return ((String) eVar.f11186d).charAt(i7);
        }
        int iC = c0535h.f9479b - c0535h.c();
        int i8 = eVar.f11184b;
        if (i7 >= iC + i8) {
            return ((String) eVar.f11186d).charAt(i7 - ((iC - eVar.f11185c) + i8));
        }
        int i9 = i7 - i8;
        int i10 = c0535h.f9480c;
        return i9 < i10 ? ((char[]) c0535h.f9482e)[i9] : ((char[]) c0535h.f9482e)[(i9 - i10) + c0535h.f9481d];
    }

    public L f() {
        int i7 = this.f12357r;
        if (i7 != -1) {
            return new L(AbstractC0607C.b(i7, this.f12358s));
        }
        return null;
    }

    public void g(String str, int i7, int i8) {
        d1.e eVar = (d1.e) this.f12359t;
        if (i7 < 0 || i7 > eVar.f()) {
            StringBuilder sbV = n1.c.v(i7, "start (", ") offset is outside of text region ");
            sbV.append(eVar.f());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (i8 < 0 || i8 > eVar.f()) {
            StringBuilder sbV2 = n1.c.v(i8, "end (", ") offset is outside of text region ");
            sbV2.append(eVar.f());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(Z1.l.p("Do not set reversed range: ", i7, i8, " > "));
        }
        eVar.s(str, i7, i8);
        k(str.length() + i7);
        j(str.length() + i7);
        this.f12357r = -1;
        this.f12358s = -1;
    }

    public void h(int i7, int i8) {
        d1.e eVar = (d1.e) this.f12359t;
        if (i7 < 0 || i7 > eVar.f()) {
            StringBuilder sbV = n1.c.v(i7, "start (", ") offset is outside of text region ");
            sbV.append(eVar.f());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (i8 < 0 || i8 > eVar.f()) {
            StringBuilder sbV2 = n1.c.v(i8, "end (", ") offset is outside of text region ");
            sbV2.append(eVar.f());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (i7 >= i8) {
            throw new IllegalArgumentException(Z1.l.p("Do not set reversed or empty range: ", i7, i8, " > "));
        }
        this.f12357r = i7;
        this.f12358s = i8;
    }

    public void i(int i7, int i8) {
        d1.e eVar = (d1.e) this.f12359t;
        if (i7 < 0 || i7 > eVar.f()) {
            StringBuilder sbV = n1.c.v(i7, "start (", ") offset is outside of text region ");
            sbV.append(eVar.f());
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        if (i8 < 0 || i8 > eVar.f()) {
            StringBuilder sbV2 = n1.c.v(i8, "end (", ") offset is outside of text region ");
            sbV2.append(eVar.f());
            throw new IndexOutOfBoundsException(sbV2.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(Z1.l.p("Do not set reversed range: ", i7, i8, " > "));
        }
        k(i7);
        j(i8);
    }

    public void j(int i7) {
        if (!(i7 >= 0)) {
            AbstractC0996a.a("Cannot set selectionEnd to a negative value: " + i7);
        }
        this.f12356q = i7;
    }

    public void k(int i7) {
        if (!(i7 >= 0)) {
            AbstractC0996a.a("Cannot set selectionStart to a negative value: " + i7);
        }
        this.f12355p = i7;
    }

    public String toString() {
        switch (this.f12354o) {
            case 0:
                return ((d1.e) this.f12359t).toString();
            default:
                return super.toString();
        }
    }

    public C0966h(int i7, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f12355p = i8;
        this.f12356q = i9;
        this.f12357r = i10;
        this.f12358s = i11;
        this.f12359t = bArr;
    }

    public C0966h(C1000b c1000b) {
        w2.m mVar = c1000b.f12564q;
        this.f12359t = mVar;
        mVar.G(12);
        this.f12356q = mVar.y() & 255;
        this.f12355p = mVar.y();
    }
}
