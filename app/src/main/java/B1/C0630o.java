package b1;

import A2.W;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import c1.AbstractC0725k;
import c1.C0723i;
import c1.C0724j;
import h1.AbstractC0996a;
import java.util.ArrayList;
import java.util.List;
import m5.C1217s;
import m5.C1218t;
import x0.C1893c;
import y0.AbstractC1961K;
import y0.AbstractC1983p;
import y0.C1962L;
import y0.C1965O;
import y0.C1984q;
import y0.InterfaceC1985r;

/* JADX INFO: renamed from: b1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0630o {

    /* JADX INFO: renamed from: a */
    public final F5.t f9987a;

    /* JADX INFO: renamed from: b */
    public final int f9988b;

    /* JADX INFO: renamed from: c */
    public final boolean f9989c;

    /* JADX INFO: renamed from: d */
    public final float f9990d;

    /* JADX INFO: renamed from: e */
    public final float f9991e;

    /* JADX INFO: renamed from: f */
    public final int f9992f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f9993g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public C0630o(F5.t tVar, long j3, int i7, int i8) {
        boolean z6;
        int i9;
        int iG;
        int i10;
        this.f9987a = tVar;
        this.f9988b = i7;
        if (n1.a.j(j3) != 0 || n1.a.i(j3) != 0) {
            AbstractC0996a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) tVar.f2445t;
        int size = arrayList2.size();
        float f7 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            r rVar = (r) arrayList2.get(i11);
            j1.c cVar = rVar.f10003a;
            int iH = n1.a.h(j3);
            if (n1.a.c(j3)) {
                i9 = i11;
                iG = n1.a.g(j3) - ((int) Math.ceil(f7));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i9 = i11;
                iG = n1.a.g(j3);
            }
            C0616a c0616a = new C0616a(cVar, this.f9988b - i12, i8, n1.b.b(iH, iG, 5));
            float fB = c0616a.b() + f7;
            C0724j c0724j = c0616a.f9955d;
            int i13 = i12 + c0724j.f10642g;
            arrayList.add(new q(c0616a, rVar.f10004b, rVar.f10005c, i12, i13, f7, fB));
            if (!c0724j.f10639d) {
                if (i13 == this.f9988b) {
                    i10 = i9;
                    if (i10 != Z4.o.d0((ArrayList) this.f9987a.f2445t)) {
                    }
                } else {
                    i10 = i9;
                }
                i11 = i10 + 1;
                i12 = i13;
                f7 = fB;
            }
            z6 = true;
            i12 = i13;
            f7 = fB;
            break;
        }
        z6 = false;
        this.f9991e = f7;
        this.f9992f = i12;
        this.f9989c = z6;
        this.h = arrayList;
        this.f9990d = n1.a.h(j3);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            q qVar = (q) arrayList.get(i14);
            ?? r7 = qVar.f9996a.f9957f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C1893c c1893c = (C1893c) r7.get(i15);
                arrayList4.add(c1893c != null ? qVar.a(c1893c) : null);
            }
            Z4.t.l0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f9987a.f2442q).size()) {
            int size4 = ((List) this.f9987a.f2442q).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList5.add(null);
            }
            arrayList3 = Z4.n.B0(arrayList3, arrayList5);
        }
        this.f9993g = arrayList3;
    }

    public final void a(long j3, float[] fArr) {
        k(L.f(j3));
        l(L.e(j3));
        C1218t c1218t = new C1218t();
        c1218t.f14437o = 0;
        AbstractC0607C.h(this.h, j3, new T4.g(j3, fArr, c1218t, new C1217s()));
    }

    public final float b(int i7) {
        m(i7);
        ArrayList arrayList = this.h;
        q qVar = (q) arrayList.get(AbstractC0607C.f(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        return c0616a.f9955d.e(i7 - qVar.f9999d) + qVar.f10001f;
    }

    public final int c(int i7, boolean z6) {
        int iF;
        m(i7);
        ArrayList arrayList = this.h;
        q qVar = (q) arrayList.get(AbstractC0607C.f(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        int i8 = i7 - qVar.f9999d;
        C0724j c0724j = c0616a.f9955d;
        if (z6) {
            Layout layout = c0724j.f10641f;
            C0723i c0723i = AbstractC0725k.f10651a;
            if (layout.getEllipsisCount(i8) <= 0 || c0724j.f10637b != TextUtils.TruncateAt.END) {
                F5.t tVarC = c0724j.c();
                Layout layout2 = (Layout) tVarC.f2441p;
                iF = tVarC.o(layout2.getLineEnd(i8), layout2.getLineStart(i8));
            } else {
                iF = layout.getEllipsisStart(i8) + layout.getLineStart(i8);
            }
        } else {
            iF = c0724j.f(i8);
        }
        return iF + qVar.f9997b;
    }

    public final int d(int i7) {
        int length = ((C0622g) this.f9987a.f2441p).f9970p.length();
        ArrayList arrayList = this.h;
        q qVar = (q) arrayList.get(i7 >= length ? Z4.o.d0(arrayList) : i7 < 0 ? 0 : AbstractC0607C.e(i7, arrayList));
        return qVar.f9996a.f9955d.f10641f.getLineForOffset(qVar.d(i7)) + qVar.f9999d;
    }

    public final int e(float f7) {
        ArrayList arrayList = this.h;
        q qVar = (q) arrayList.get(AbstractC0607C.g(arrayList, f7));
        int i7 = qVar.f9998c - qVar.f9997b;
        int i8 = qVar.f9999d;
        if (i7 == 0) {
            return i8;
        }
        float f8 = f7 - qVar.f10001f;
        C0724j c0724j = qVar.f9996a.f9955d;
        return c0724j.f10641f.getLineForVertical(((int) f8) - c0724j.h) + i8;
    }

    public final float f(int i7) {
        m(i7);
        ArrayList arrayList = this.h;
        q qVar = (q) arrayList.get(AbstractC0607C.f(i7, arrayList));
        C0616a c0616a = qVar.f9996a;
        return c0616a.f9955d.g(i7 - qVar.f9999d) + qVar.f10001f;
    }

    public final int g(long j3) {
        ArrayList arrayList = this.h;
        int i7 = (int) (j3 & 4294967295L);
        q qVar = (q) arrayList.get(AbstractC0607C.g(arrayList, Float.intBitsToFloat(i7)));
        int i8 = qVar.f9998c;
        int i9 = qVar.f9997b;
        if (i8 - i9 == 0) {
            return i9;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i7) - qVar.f10001f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        C0616a c0616a = qVar.f9996a;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        C0724j c0724j = c0616a.f9955d;
        int i10 = iIntBitsToFloat - c0724j.h;
        Layout layout = c0724j.f10641f;
        int lineForVertical = layout.getLineForVertical(i10);
        return layout.getOffsetForHorizontal(lineForVertical, (c0724j.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i9;
    }

    public final long h(C1893c c1893c, int i7, B2.g gVar) {
        long jB;
        long j3;
        ArrayList arrayList = this.h;
        int iG = AbstractC0607C.g(arrayList, c1893c.f19870b);
        float f7 = ((q) arrayList.get(iG)).f10002g;
        float f8 = c1893c.f19872d;
        if (f7 >= f8 || iG == Z4.o.d0(arrayList)) {
            q qVar = (q) arrayList.get(iG);
            return qVar.b(qVar.f9996a.c(qVar.c(c1893c), i7, gVar), true);
        }
        int iG2 = AbstractC0607C.g(arrayList, f8);
        long jB2 = L.f9943b;
        while (true) {
            jB = L.f9943b;
            if (!L.b(jB2, jB) || iG > iG2) {
                break;
            }
            q qVar2 = (q) arrayList.get(iG);
            jB2 = qVar2.b(qVar2.f9996a.c(qVar2.c(c1893c), i7, gVar), true);
            iG++;
        }
        if (L.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j3 = L.f9943b;
            if (!L.b(jB, j3) || iG > iG2) {
                break;
            }
            q qVar3 = (q) arrayList.get(iG2);
            jB = qVar3.b(qVar3.f9996a.c(qVar3.c(c1893c), i7, gVar), true);
            iG2--;
        }
        return L.b(jB, j3) ? jB2 : AbstractC0607C.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(InterfaceC1985r interfaceC1985r, long j3, C1962L c1962l, m1.l lVar, A0.d dVar) {
        interfaceC1985r.l();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            qVar.f9996a.f(interfaceC1985r, j3, c1962l, lVar, dVar);
            interfaceC1985r.h(0.0f, qVar.f9996a.b());
        }
        interfaceC1985r.k();
    }

    public final void j(InterfaceC1985r interfaceC1985r, AbstractC1983p abstractC1983p, float f7, C1962L c1962l, m1.l lVar, A0.d dVar) {
        interfaceC1985r.l();
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 1 || (abstractC1983p instanceof C1965O)) {
            j1.j.a(this, interfaceC1985r, abstractC1983p, f7, c1962l, lVar, dVar);
        } else {
            if (!(abstractC1983p instanceof AbstractC1961K)) {
                throw new W();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i7 = 0; i7 < size; i7++) {
                q qVar = (q) arrayList.get(i7);
                fB += qVar.f9996a.b();
                fMax = Math.max(fMax, qVar.f9996a.d());
            }
            Shader shaderB = ((AbstractC1961K) abstractC1983p).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                q qVar2 = (q) arrayList.get(i8);
                qVar2.f9996a.g(interfaceC1985r, new C1984q(shaderB), f7, c1962l, lVar, dVar);
                C0616a c0616a = qVar2.f9996a;
                interfaceC1985r.h(0.0f, c0616a.b());
                matrix.setTranslate(0.0f, -c0616a.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC1985r.k();
    }

    public final void k(int i7) {
        boolean z6 = false;
        F5.t tVar = this.f9987a;
        if (i7 >= 0 && i7 < ((C0622g) tVar.f2441p).f9970p.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbV = n1.c.v(i7, "offset(", ") is out of bounds [0, ");
        sbV.append(((C0622g) tVar.f2441p).f9970p.length());
        sbV.append(')');
        AbstractC0996a.a(sbV.toString());
    }

    public final void l(int i7) {
        boolean z6 = false;
        F5.t tVar = this.f9987a;
        if (i7 >= 0 && i7 <= ((C0622g) tVar.f2441p).f9970p.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbV = n1.c.v(i7, "offset(", ") is out of bounds [0, ");
        sbV.append(((C0622g) tVar.f2441p).f9970p.length());
        sbV.append(']');
        AbstractC0996a.a(sbV.toString());
    }

    public final void m(int i7) {
        boolean z6 = false;
        int i8 = this.f9992f;
        if (i7 >= 0 && i7 < i8) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        AbstractC0996a.a("lineIndex(" + i7 + ") is out of bounds [0, " + i8 + ')');
    }
}
