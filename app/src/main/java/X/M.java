package X;

import b1.AbstractC0607C;
import b1.C0613I;
import b1.C0622g;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.C1219u;
import m5.C1220v;
import t.AbstractC1462q;
import t.C1441C;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x0.C1892b;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7968o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0495p0 f7969p;

    public /* synthetic */ M(C0495p0 c0495p0, int i7) {
        this.f7968o = i7;
        this.f7969p = c0495p0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        O0.C c7;
        O0.C c8;
        C1893c c1893c;
        int i7;
        List list;
        int i8;
        O0.C c9;
        O0.C c10;
        int[] iArr;
        C0492o c0492o;
        int i9;
        boolean z6;
        long j3;
        int iNextIndex;
        InterfaceC1765B interfaceC1765B;
        E e7;
        ArrayList arrayList;
        int i10;
        int i11 = 2;
        Y4.o oVar = Y4.o.f8736a;
        C0495p0 c0495p0 = this.f7969p;
        switch (this.f7968o) {
            case 0:
                C1892b c1892b = (C1892b) c0495p0.f8139p.getValue();
                return new C1892b(c1892b != null ? c1892b.f19867a : 9205357640488583168L);
            case 1:
                C1892b c1892b2 = (C1892b) c0495p0.f8140q.getValue();
                return new C1892b(c1892b2 != null ? c1892b2.f19867a : 9205357640488583168L);
            case 2:
                c0495p0.j();
                return oVar;
            case 3:
                c0495p0.f8136m.getValue();
                if (c0495p0.g() != null && (c7 = c0495p0.l) != null && c7.y()) {
                    O0.C cK = c0495p0.k();
                    u0 u0Var = c0495p0.f8126a;
                    ArrayList arrayListC = u0Var.c(cK);
                    ArrayList arrayList2 = new ArrayList(arrayListC.size());
                    int size = arrayListC.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        C0492o c0492o2 = (C0492o) arrayListC.get(i12);
                        E e8 = (E) u0Var.a().e(c0492o2.f8115a);
                        Y4.h hVar = e8 != null ? new Y4.h(c0492o2, e8) : null;
                        if (hVar != null) {
                            arrayList2.add(hVar);
                        }
                    }
                    int size2 = arrayList2.size();
                    List listE0 = arrayList2;
                    listE0 = arrayList2;
                    if (size2 != 0 && size2 != 1) {
                        listE0 = Z4.o.e0(Z4.n.q0(arrayList2), Z4.n.x0(arrayList2));
                    }
                    if (!listE0.isEmpty()) {
                        boolean zIsEmpty = listE0.isEmpty();
                        C1893c c1893c2 = AbstractC0498r0.f8149a;
                        if (zIsEmpty) {
                            c8 = c7;
                            c1893c = c1893c2;
                        } else {
                            int size3 = listE0.size();
                            int i13 = 0;
                            float f7 = Float.POSITIVE_INFINITY;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMax = Float.NEGATIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            List list2 = listE0;
                            while (i13 < size3) {
                                Y4.h hVar2 = (Y4.h) list2.get(i13);
                                C0492o c0492o3 = (C0492o) hVar2.f8726o;
                                E e9 = (E) hVar2.f8727p;
                                int i14 = e9.f7891a.f7888b;
                                int i15 = e9.f7892b.f7888b;
                                if (i14 == i15 || (c10 = c0492o3.c()) == null) {
                                    i7 = size3;
                                    list = list2;
                                    i8 = i13;
                                    c9 = c7;
                                    f7 = f7;
                                } else {
                                    boolean z7 = z;
                                    int iMin = Math.min(i14, i15);
                                    int iMax = Math.max(i14, i15) - 1;
                                    if (iMin == iMax) {
                                        iArr = new int[1];
                                        iArr[z7 ? 1 : 0] = iMin;
                                    } else {
                                        int[] iArr2 = new int[i11];
                                        iArr2[z7 ? 1 : 0] = iMin;
                                        iArr2[1] = iMax;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    i7 = size3;
                                    list = list2;
                                    int i16 = z7 ? 1 : 0;
                                    float fMin2 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    while (i16 < length) {
                                        int[] iArr3 = iArr;
                                        int i17 = iArr3[i16];
                                        int i18 = length;
                                        C0613I c0613i = (C0613I) c0492o3.f8117c.a();
                                        C1893c c1893cB = C1893c.f19868e;
                                        if (c0613i == null) {
                                            c0492o = c0492o3;
                                            i9 = i13;
                                        } else {
                                            c0492o = c0492o3;
                                            int length2 = c0613i.f9929a.f9920a.f9970p.length();
                                            i9 = i13;
                                            if (length2 >= 1) {
                                                z6 = z7;
                                                c1893cB = c0613i.b(i6.h.q(i17, z6 ? 1 : 0, length2 - 1));
                                            }
                                            C1893c c1893c3 = c1893cB;
                                            fMin3 = Math.min(fMin3, c1893c3.f19869a);
                                            fMin2 = Math.min(fMin2, c1893c3.f19870b);
                                            fMax3 = Math.max(fMax3, c1893c3.f19871c);
                                            fMax4 = Math.max(fMax4, c1893c3.f19872d);
                                            i16++;
                                            z7 = z6;
                                            iArr = iArr3;
                                            length = i18;
                                            c0492o3 = c0492o;
                                            i13 = i9;
                                        }
                                        z6 = z7;
                                        C1893c c1893c32 = c1893cB;
                                        fMin3 = Math.min(fMin3, c1893c32.f19869a);
                                        fMin2 = Math.min(fMin2, c1893c32.f19870b);
                                        fMax3 = Math.max(fMax3, c1893c32.f19871c);
                                        fMax4 = Math.max(fMax4, c1893c32.f19872d);
                                        i16++;
                                        z7 = z6;
                                        iArr = iArr3;
                                        length = i18;
                                        c0492o3 = c0492o;
                                        i13 = i9;
                                    }
                                    i8 = i13;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin3)) << 32) | (((long) Float.floatToRawIntBits(fMin2)) & 4294967295L);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                    int iFloatToRawIntBits = Float.floatToRawIntBits(fMax4);
                                    c9 = c7;
                                    long jK = c9.K(c10, jFloatToRawIntBits);
                                    long jK2 = c9.K(c10, (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits2 << 32));
                                    float fMin4 = Math.min(f7, Float.intBitsToFloat((int) (jK >> 32)));
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jK & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jK2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jK2 & 4294967295L)));
                                    f7 = fMin4;
                                }
                                i13 = i8 + 1;
                                c7 = c9;
                                size3 = i7;
                                list2 = list;
                                i11 = 2;
                                z = false;
                            }
                            c8 = c7;
                            c1893c = new C1893c(f7, fMin, fMax, fMax2);
                        }
                        if (!c1893c.equals(c1893c2)) {
                            C1893c c1893cE = AbstractC0498r0.y(c8).e(c1893c);
                            if (c1893cE.f19871c - c1893cE.f19869a >= 0.0f && c1893cE.f19872d - c1893cE.f19870b >= 0.0f) {
                                C1893c c1893cI = c1893cE.i(c8.I(0L));
                                return C1893c.a(c1893cI, 0.0f, 0.0f, (Y.f8017b * 4) + c1893cI.f19872d, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                C0495p0 c0495p02 = this.f7969p;
                c0495p02.f8147x = true;
                c0495p02.p();
                c0495p02.f8141r.setValue(null);
                c0495p02.f8142s.setValue(null);
                if (c0495p02.f8144u && c0495p02.i()) {
                    long j7 = 0;
                    C1220v c1220v = new C1220v();
                    C1220v c1220v2 = new C1220v();
                    C1219u c1219u = new C1219u();
                    O0.C cK2 = c0495p02.k();
                    u0 u0Var2 = c0495p02.f8126a;
                    ArrayList arrayListC2 = u0Var2.c(cK2);
                    ListIterator listIterator = arrayListC2.listIterator(arrayListC2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            j3 = j7;
                            E e10 = (E) u0Var2.a().e(((C0492o) listIterator.previous()).f8115a);
                            if (e10 == null || e10.f7891a.f7888b == e10.f7892b.f7888b) {
                                j7 = j3;
                            } else {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            j3 = j7;
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size4 = arrayListC2.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size4) {
                                C0492o c0492o4 = (C0492o) arrayListC2.get(i19);
                                E e11 = (E) u0Var2.a().e(c0492o4.f8115a);
                                if (e11 != null) {
                                    C0622g c0622gD = c0492o4.d();
                                    long jB = AbstractC0607C.b(e11.f7891a.f7888b, e11.f7892b.f7888b);
                                    if (i19 >= iNextIndex) {
                                        c1220v.f14439o = c0622gD;
                                        c1220v2.f14439o = new b1.L(jB);
                                        c1219u.f14438o = c0492o4.f8115a;
                                    }
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                    Object obj = c1220v.f14439o;
                    if (obj != null && c1220v2.f14439o != null && c1219u.f14438o != j3 && ((CharSequence) obj).length() > 0 && (interfaceC1765B = c0495p02.f8145v) != null) {
                        AbstractC1767D.t(interfaceC1765B, null, new C0493o0(c0495p02, c1220v, c1220v2, c1219u, null), 3);
                    }
                }
                c0495p02.f8144u = false;
                return oVar;
            case 5:
                c0495p0.c();
                return oVar;
            case 6:
                return Boolean.valueOf((c0495p0.f8147x && c0495p0.h()) ? false : true);
            default:
                O0.C cK3 = c0495p0.k();
                u0 u0Var3 = c0495p0.f8126a;
                ArrayList arrayListC3 = u0Var3.c(cK3);
                if (arrayListC3.isEmpty()) {
                    return oVar;
                }
                C1441C c1441c = AbstractC1462q.f16101a;
                C1441C c1441c2 = new C1441C();
                int size5 = arrayListC3.size();
                int i20 = 0;
                E e12 = null;
                E e13 = null;
                while (i20 < size5) {
                    C0492o c0492o5 = (C0492o) arrayListC3.get(i20);
                    C0613I c0613i2 = (C0613I) c0492o5.f8117c.a();
                    Y4.o oVar2 = oVar;
                    long j8 = c0492o5.f8115a;
                    if (c0613i2 == null) {
                        arrayList = arrayListC3;
                        i10 = size5;
                        e7 = null;
                    } else {
                        int length3 = c0613i2.f9929a.f9920a.f9970p.length();
                        arrayList = arrayListC3;
                        i10 = size5;
                        e7 = new E(new D(c0613i2.a(0), 0, j8), new D(c0613i2.a(Math.max(length3 - 1, 0)), length3, j8), false);
                    }
                    if (e7 != null) {
                        if (e12 == null) {
                            e12 = e7;
                        }
                        int iC = c1441c2.c(j8);
                        Object[] objArr = c1441c2.f15968c;
                        Object obj2 = objArr[iC];
                        c1441c2.f15967b[iC] = j8;
                        objArr[iC] = e7;
                        e13 = e7;
                    }
                    i20++;
                    oVar = oVar2;
                    arrayListC3 = arrayList;
                    size5 = i10;
                }
                Y4.o oVar3 = oVar;
                if (c1441c2.f15970e == 0) {
                    return oVar3;
                }
                if (e12 != e13) {
                    AbstractC1209k.c(e12);
                    AbstractC1209k.c(e13);
                    e12 = new E(e12.f7891a, e13.f7892b, false);
                }
                u0Var3.f8182k.setValue(c1441c2);
                c0495p0.f8129d.b(e12);
                c0495p0.f8143t = null;
                return oVar3;
        }
    }
}
