package b1;

import D.X;
import android.graphics.RectF;
import android.text.Layout;
import c1.C0724j;
import h1.AbstractC0996a;
import java.util.ArrayList;
import m5.AbstractC1209k;
import x0.C1893c;
import y0.AbstractC1978k;
import y0.C1976i;

/* JADX INFO: renamed from: b1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0613I {

    /* JADX INFO: renamed from: a */
    public final C0612H f9929a;

    /* JADX INFO: renamed from: b */
    public final C0630o f9930b;

    /* JADX INFO: renamed from: c */
    public final long f9931c;

    /* JADX INFO: renamed from: d */
    public final float f9932d;

    /* JADX INFO: renamed from: e */
    public final float f9933e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f9934f;

    public C0613I(C0612H c0612h, C0630o c0630o, long j3) {
        this.f9929a = c0612h;
        this.f9930b = c0630o;
        this.f9931c = j3;
        ArrayList arrayList = c0630o.h;
        float fD = 0.0f;
        this.f9932d = arrayList.isEmpty() ? 0.0f : ((q) arrayList.get(0)).f9996a.f9955d.d(0);
        if (!arrayList.isEmpty()) {
            q qVar = (q) Z4.n.x0(arrayList);
            fD = qVar.f9996a.f9955d.d(r4.f10642g - 1) + qVar.f10001f;
        }
        this.f9933e = fD;
        this.f9934f = c0630o.f9993g;
    }

    public final m1.j a(int i7) {
        C0630o c0630o = this.f9930b;
        c0630o.l(i7);
        int length = ((C0622g) c0630o.f9987a.f2441p).f9970p.length();
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(i7 == length ? Z4.o.d0(arrayList) : AbstractC0607C.e(i7, arrayList));
        return qVar.f9996a.f9955d.f10641f.isRtlCharAt(qVar.d(i7)) ? m1.j.f14342p : m1.j.f14341o;
    }

    public final C1893c b(int i7) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        C0630o c0630o = this.f9930b;
        c0630o.k(i7);
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(AbstractC0607C.e(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int iD = qVar.d(i7);
        CharSequence charSequence = c0616a.f9956e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbV = n1.c.v(iD, "offset(", ") is out of bounds [0,");
            sbV.append(charSequence.length());
            sbV.append(')');
            AbstractC0996a.a(sbV.toString());
        }
        C0724j c0724j = c0616a.f9955d;
        Layout layout = c0724j.f10641f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = c0724j.g(lineForOffset);
        float fE = c0724j.e(lineForOffset);
        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z6 || zIsRtlCharAt) {
            if (z6 && zIsRtlCharAt) {
                fH = c0724j.i(iD, false);
                fH2 = c0724j.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = c0724j.h(iD, false);
                fH2 = c0724j.h(iD + 1, true);
            } else {
                fI = c0724j.i(iD, false);
                fI2 = c0724j.i(iD + 1, true);
            }
            float f7 = fH;
            fI = fH2;
            fI2 = f7;
        } else {
            fI = c0724j.h(iD, false);
            fI2 = c0724j.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return qVar.a(new C1893c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final C1893c c(int i7) {
        C0630o c0630o = this.f9930b;
        c0630o.l(i7);
        int length = ((C0622g) c0630o.f9987a.f2441p).f9970p.length();
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(i7 == length ? Z4.o.d0(arrayList) : AbstractC0607C.e(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int iD = qVar.d(i7);
        CharSequence charSequence = c0616a.f9956e;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbV = n1.c.v(iD, "offset(", ") is out of bounds [0,");
            sbV.append(charSequence.length());
            sbV.append(']');
            AbstractC0996a.a(sbV.toString());
        }
        C0724j c0724j = c0616a.f9955d;
        float fH = c0724j.h(iD, false);
        int lineForOffset = c0724j.f10641f.getLineForOffset(iD);
        return qVar.a(new C1893c(fH, c0724j.g(lineForOffset), fH, c0724j.e(lineForOffset)));
    }

    public final boolean d() {
        long j3 = this.f9931c;
        float f7 = (int) (j3 >> 32);
        C0630o c0630o = this.f9930b;
        return f7 < c0630o.f9990d || c0630o.f9989c || ((float) ((int) (j3 & 4294967295L))) < c0630o.f9991e;
    }

    public final float e(int i7, boolean z6) {
        C0630o c0630o = this.f9930b;
        c0630o.l(i7);
        int length = ((C0622g) c0630o.f9987a.f2441p).f9970p.length();
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(i7 == length ? Z4.o.d0(arrayList) : AbstractC0607C.e(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int iD = qVar.d(i7);
        C0724j c0724j = c0616a.f9955d;
        return z6 ? c0724j.h(iD, false) : c0724j.i(iD, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0613I)) {
            return false;
        }
        C0613I c0613i = (C0613I) obj;
        return AbstractC1209k.a(this.f9929a, c0613i.f9929a) && this.f9930b.equals(c0613i.f9930b) && n1.m.b(this.f9931c, c0613i.f9931c) && this.f9932d == c0613i.f9932d && this.f9933e == c0613i.f9933e && AbstractC1209k.a(this.f9934f, c0613i.f9934f);
    }

    public final float f(int i7) {
        C0630o c0630o = this.f9930b;
        c0630o.m(i7);
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(AbstractC0607C.f(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int i8 = i7 - qVar.f9999d;
        C0724j c0724j = c0616a.f9955d;
        return c0724j.f10641f.getLineLeft(i8) + (i8 == c0724j.f10642g + (-1) ? c0724j.f10644j : 0.0f);
    }

    public final float g(int i7) {
        C0630o c0630o = this.f9930b;
        c0630o.m(i7);
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(AbstractC0607C.f(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int i8 = i7 - qVar.f9999d;
        C0724j c0724j = c0616a.f9955d;
        return c0724j.f10641f.getLineRight(i8) + (i8 == c0724j.f10642g + (-1) ? c0724j.f10645k : 0.0f);
    }

    public final int h(int i7) {
        C0630o c0630o = this.f9930b;
        c0630o.m(i7);
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(AbstractC0607C.f(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        return c0616a.f9955d.f10641f.getLineStart(i7 - qVar.f9999d) + qVar.f9997b;
    }

    public final int hashCode() {
        int iHashCode = (this.f9930b.hashCode() + (this.f9929a.hashCode() * 31)) * 31;
        long j3 = this.f9931c;
        return this.f9934f.hashCode() + n1.c.n(this.f9933e, n1.c.n(this.f9932d, (((int) (j3 ^ (j3 >>> 32))) + iHashCode) * 31, 31), 31);
    }

    public final m1.j i(int i7) {
        C0630o c0630o = this.f9930b;
        c0630o.l(i7);
        int length = ((C0622g) c0630o.f9987a.f2441p).f9970p.length();
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(i7 == length ? Z4.o.d0(arrayList) : AbstractC0607C.e(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int iD = qVar.d(i7);
        C0724j c0724j = c0616a.f9955d;
        return c0724j.f10641f.getParagraphDirection(c0724j.f10641f.getLineForOffset(iD)) == 1 ? m1.j.f14341o : m1.j.f14342p;
    }

    public final C1976i j(int i7, int i8) {
        C0630o c0630o = this.f9930b;
        C0622g c0622g = (C0622g) c0630o.f9987a.f2441p;
        if (i7 < 0 || i7 > i8 || i8 > c0622g.f9970p.length()) {
            AbstractC0996a.a("Start(" + i7 + ") or End(" + i8 + ") is out of range [0.." + c0622g.f9970p.length() + "), or start > end!");
        }
        if (i7 == i8) {
            return AbstractC1978k.a();
        }
        C1976i c1976iA = AbstractC1978k.a();
        AbstractC0607C.h(c0630o.h, AbstractC0607C.b(i7, i8), new X(c1976iA, i7, i8, 2));
        return c1976iA;
    }

    public final long k(int i7) {
        int iR;
        int iM;
        int iM2;
        C0630o c0630o = this.f9930b;
        c0630o.l(i7);
        int length = ((C0622g) c0630o.f9987a.f2441p).f9970p.length();
        ArrayList arrayList = c0630o.h;
        q qVar = (q) arrayList.get(i7 == length ? Z4.o.d0(arrayList) : AbstractC0607C.e(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int iD = qVar.d(i7);
        d1.e eVarJ = c0616a.f9955d.j();
        if (eVarJ.l(eVarJ.r(iD))) {
            eVarJ.c(iD);
            iR = iD;
            while (iR != -1 && (!eVarJ.l(iR) || eVarJ.h(iR))) {
                iR = eVarJ.r(iR);
            }
        } else {
            eVarJ.c(iD);
            iR = eVarJ.k(iD) ? (!eVarJ.i(iD) || eVarJ.g(iD)) ? eVarJ.r(iD) : iD : eVarJ.g(iD) ? eVarJ.r(iD) : -1;
        }
        if (iR == -1) {
            iR = iD;
        }
        if (eVarJ.h(eVarJ.m(iD))) {
            eVarJ.c(iD);
            iM = iD;
            while (iM != -1 && (eVarJ.l(iM) || !eVarJ.h(iM))) {
                iM = eVarJ.m(iM);
            }
        } else {
            eVarJ.c(iD);
            if (eVarJ.g(iD)) {
                if (!eVarJ.i(iD) || eVarJ.k(iD)) {
                    iM2 = eVarJ.m(iD);
                    iM = iM2;
                } else {
                    iM = iD;
                }
            } else if (eVarJ.k(iD)) {
                iM2 = eVarJ.m(iD);
                iM = iM2;
            } else {
                iM = -1;
            }
        }
        if (iM != -1) {
            iD = iM;
        }
        return qVar.b(AbstractC0607C.b(iR, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f9929a + ", multiParagraph=" + this.f9930b + ", size=" + ((Object) n1.m.c(this.f9931c)) + ", firstBaseline=" + this.f9932d + ", lastBaseline=" + this.f9933e + ", placeholderRects=" + this.f9934f + ')';
    }
}
