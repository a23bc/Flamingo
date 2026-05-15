package H;

import D.C0056b;
import D.C0079u;
import D.C0080v;
import d.C0746L;
import f0.AbstractC0911s0;
import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import o0.AbstractC1253j;
import o0.AbstractC1256m;
import o0.C1249f;
import o0.InterfaceC1246c;
import o0.InterfaceC1251h;
import p0.AbstractC1289f;
import r0.InterfaceC1398p;
import r5.C1423d;
import t.AbstractC1456k;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a */
    public static final C0183z[] f2782a = new C0183z[0];

    /* JADX INFO: renamed from: b */
    public static final C1.b f2783b = new C1.b(2);

    public static final void c(B5.i iVar, InterfaceC1398p interfaceC1398p, X x6, M m7, C0912t c0912t, int i7) {
        c0912t.Z(1055276397);
        int i8 = (c0912t.h(iVar) ? 4 : 2) | i7 | (c0912t.f(interfaceC1398p) ? 32 : 16) | (c0912t.f(x6) ? 256 : 128) | (c0912t.f(m7) ? 2048 : 1024);
        if (c0912t.N(i8 & 1, (i8 & 1171) != 1170)) {
            e(n0.e.e(-933153643, new androidx.compose.foundation.lazy.layout.c(x6, interfaceC1398p, m7, C0879c.x(iVar, c0912t)), c0912t), c0912t, 6);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new L(iVar, interfaceC1398p, x6, m7, i7, 0);
        }
    }

    public static final void d(Object obj, int i7, U u7, n0.d dVar, C0912t c0912t, int i8) {
        int i9;
        c0912t.Z(872548579);
        if ((i8 & 6) == 0) {
            i9 = (c0912t.h(obj) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= c0912t.d(i7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= c0912t.h(u7) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= c0912t.h(dVar) ? 2048 : 1024;
        }
        if (c0912t.N(i9 & 1, (i9 & 1171) != 1170)) {
            boolean zF = c0912t.f(obj) | c0912t.f(u7);
            Object objK = c0912t.K();
            Object obj2 = C0903o.f11850a;
            if (zF || objK == obj2) {
                objK = new T(obj, u7);
                c0912t.i0(objK);
            }
            T t7 = (T) objK;
            t7.f2820c = i7;
            C0894j0 c0894j0 = t7.f2824g;
            AbstractC0911s0 abstractC0911s0 = O0.k0.f5410a;
            T t8 = (T) c0912t.j(abstractC0911s0);
            AbstractC1289f abstractC1289fQ = C0746L.q();
            InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
            AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
            try {
                if (t8 != ((T) c0894j0.getValue())) {
                    c0894j0.setValue(t8);
                    if (t7.f2821d > 0) {
                        T t9 = t7.f2822e;
                        if (t9 != null) {
                            t9.b();
                        }
                        if (t8 != null) {
                            t8.a();
                        } else {
                            t8 = null;
                        }
                        t7.f2822e = t8;
                    }
                }
                C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                boolean zF2 = c0912t.f(t7);
                Object objK2 = c0912t.K();
                if (zF2 || objK2 == obj2) {
                    objK2 = new D.J(6, t7);
                    c0912t.i0(objK2);
                }
                C0879c.d(t7, (InterfaceC1182c) objK2, c0912t);
                C0879c.a(abstractC0911s0.a(t7), dVar, c0912t, ((i9 >> 6) & 112) | 8);
            } catch (Throwable th) {
                C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
                throw th;
            }
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0079u(obj, i7, u7, dVar, i8);
        }
    }

    public static final void e(n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-709502251);
        if (c0912t.N(i7 & 1, (i7 & 3) != 2)) {
            a1 a1Var = AbstractC1253j.f14649a;
            InterfaceC1251h interfaceC1251h = (InterfaceC1251h) c0912t.j(a1Var);
            C1249f c1249fF = AbstractC1256m.f(c0912t);
            Object[] objArr = {interfaceC1251h};
            V1.a aVar = new V1.a(new C0056b(4, (byte) 0), new D.h0(interfaceC1251h, 6, c1249fF));
            boolean zH = c0912t.h(interfaceC1251h) | c0912t.h(c1249fF);
            Object objK = c0912t.K();
            if (zH || objK == C0903o.f11850a) {
                objK = new G.i(interfaceC1251h, 1, c1249fF);
                c0912t.i0(objK);
            }
            g0 g0Var = (g0) AbstractC1256m.d(objArr, aVar, (InterfaceC1180a) objK, c0912t, 0);
            C0879c.a(a1Var.a(g0Var), n0.e.e(-412824043, new C0080v(dVar, 2, g0Var), c0912t), c0912t, 56);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new h0(dVar, i7, 0);
        }
    }

    public static final void f(K k7, Object obj, int i7, Object obj2, C0912t c0912t, int i8) {
        c0912t.Z(1439843069);
        int i9 = (c0912t.f(k7) ? 4 : 2) | i8 | (c0912t.f(obj) ? 32 : 16) | (c0912t.d(i7) ? 256 : 128) | (c0912t.f(obj2) ? 2048 : 1024);
        if (c0912t.N(i9 & 1, (i9 & 1171) != 1170)) {
            ((InterfaceC1246c) obj).a(obj2, n0.e.e(980966366, new J(k7, i7, obj2, 0), c0912t), c0912t, 48);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(k7, obj, i7, obj2, i8);
        }
    }

    public static final int g(int i7, h0.e eVar) {
        int i8 = eVar.f12548q - 1;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = ((i8 - i9) / 2) + i9;
            Object[] objArr = eVar.f12546o;
            int i11 = ((C0167i) objArr[i10]).f2880a;
            if (i11 != i7) {
                if (i11 < i7) {
                    i9 = i10 + 1;
                    if (i7 < ((C0167i) objArr[i9]).f2880a) {
                    }
                } else {
                    i8 = i10 - 1;
                }
            }
            return i10;
        }
        return i9;
    }

    public static final List h(Q q7, int i7, int i8, ArrayList arrayList, t.x xVar, int i9, int i10, int i11, InterfaceC1182c interfaceC1182c) {
        int i12;
        t.x xVar2;
        char c7;
        long j3;
        int i13;
        Object obj;
        int i14;
        boolean z6;
        boolean z7 = true;
        if (q7 == null || arrayList.isEmpty() || (i12 = xVar.f16127b) == 0) {
            return Z4.v.f8818o;
        }
        int i15 = -1;
        if (i8 - i7 < 0 || i12 == 0) {
            xVar2 = AbstractC1456k.f16082a;
        } else {
            C1423d c1423dM = i6.h.M(0, i12);
            int i16 = c1423dM.f15781o;
            int i17 = c1423dM.f15782p;
            int iB = -1;
            if (i16 <= i17) {
                while (xVar.b(i16) <= i7) {
                    iB = xVar.b(i16);
                    if (i16 == i17) {
                        break;
                    }
                    i16++;
                }
            }
            if (iB == -1) {
                xVar2 = AbstractC1456k.f16082a;
            } else {
                t.x xVar3 = AbstractC1456k.f16082a;
                xVar2 = new t.x(1);
                xVar2.a(iB);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i18 = 0;
        while (i18 < size) {
            Object obj2 = arrayList.get(i18);
            int index = ((O) obj2).getIndex();
            int[] iArr = xVar.f16126a;
            int i19 = xVar.f16127b;
            int i20 = 0;
            while (true) {
                if (i20 >= i19) {
                    z6 = z7;
                    break;
                }
                z6 = z7;
                if (iArr[i20] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i20++;
                z7 = z6;
            }
            i18++;
            z7 = z6;
        }
        int[] iArr2 = xVar2.f16126a;
        int i21 = xVar2.f16127b;
        int i22 = 0;
        while (i22 < i21) {
            int i23 = iArr2[i22];
            Iterator it = arrayList.iterator();
            int i24 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i24 = i15;
                    break;
                }
                if (((O) it.next()).getIndex() == i23) {
                    break;
                }
                i24++;
            }
            O o7 = i24 == i15 ? (O) interfaceC1182c.b(Integer.valueOf(i23)) : (O) arrayList.remove(i24);
            int iE = o7.e();
            if (i24 == i15) {
                c7 = ' ';
                i13 = Integer.MIN_VALUE;
            } else {
                long jF = o7.f(0);
                if (o7.c()) {
                    c7 = ' ';
                    j3 = jF & 4294967295L;
                } else {
                    c7 = ' ';
                    j3 = jF >> 32;
                }
                i13 = (int) j3;
            }
            int size2 = arrayList3.size();
            int i25 = 0;
            while (true) {
                if (i25 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i25);
                if (((O) obj).getIndex() != i23) {
                    break;
                }
                i25++;
            }
            O o8 = (O) obj;
            if (o8 != null) {
                long jF2 = o8.f(0);
                i14 = (int) (o8.c() ? jF2 & 4294967295L : jF2 >> c7);
            } else {
                i14 = Integer.MIN_VALUE;
            }
            int iMax = i13 == Integer.MIN_VALUE ? -i9 : Math.max(-i9, i13);
            if (i14 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i14 - iE);
            }
            o7.d();
            o7.k(iMax, 0, i10, i11);
            arrayList2.add(o7);
            i22++;
            i15 = -1;
        }
        return arrayList2;
    }

    public static final List i(K k7, U u7, C0170l c0170l) {
        C1423d c1423d;
        if (c0170l.f2906a.f12548q == 0 && u7.f2825o.isEmpty()) {
            return Z4.v.f8818o;
        }
        ArrayList arrayList = new ArrayList();
        h0.e eVar = c0170l.f2906a;
        if (eVar.f12548q != 0) {
            int i7 = eVar.f12548q;
            if (i7 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar.f12546o;
            int i8 = ((C0169k) objArr[0]).f2904a;
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = ((C0169k) objArr[i9]).f2904a;
                if (i10 < i8) {
                    i8 = i10;
                }
            }
            if (i8 < 0) {
                C.b.a("negative minIndex");
            }
            int i11 = eVar.f12548q;
            if (i11 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar.f12546o;
            int i12 = ((C0169k) objArr2[0]).f2905b;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = ((C0169k) objArr2[i13]).f2905b;
                if (i14 > i12) {
                    i12 = i14;
                }
            }
            c1423d = new C1423d(i8, Math.min(i12, k7.a() - 1), 1);
        } else {
            c1423d = C1423d.f15788r;
        }
        int size = u7.f2825o.size();
        for (int i15 = 0; i15 < size; i15++) {
            T t7 = (T) u7.get(i15);
            int iK = k(k7, t7.f2818a, t7.f2820c);
            int i16 = c1423d.f15781o;
            if ((iK > c1423d.f15782p || i16 > iK) && iK >= 0 && iK < k7.a()) {
                arrayList.add(Integer.valueOf(iK));
            }
        }
        int i17 = c1423d.f15781o;
        int i18 = c1423d.f15782p;
        if (i17 <= i18) {
            while (true) {
                arrayList.add(Integer.valueOf(i17));
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return arrayList;
    }

    public static InterfaceC0878b0 j() {
        return new C0894j0(Y4.o.f8736a, f0.W.f11764q);
    }

    public static final int k(K k7, Object obj, int i7) {
        int iD;
        return (obj == null || k7.a() == 0 || (i7 < k7.a() && obj.equals(k7.b(i7))) || (iD = k7.d(obj)) == -1) ? i7 : iD;
    }

    public static final List o(int i7, int i8, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return Z4.v.f8818o;
        }
        ArrayList arrayListL0 = Z4.n.L0(list);
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            O o7 = (O) arrayList.get(i9);
            int index = o7.getIndex();
            if (i7 <= index && index <= i8) {
                arrayListL0.add(o7);
            }
        }
        Z4.s.k0(arrayListL0, f2783b);
        return arrayListL0;
    }

    public Object l(int i7) {
        C0167i c0167iJ = m().j(i7);
        return c0167iJ.f2882c.a().b(Integer.valueOf(i7 - c0167iJ.f2880a));
    }

    public abstract D4.i m();

    public Object n(int i7) {
        Object objB;
        C0167i c0167iJ = m().j(i7);
        int i8 = i7 - c0167iJ.f2880a;
        InterfaceC1182c key = c0167iJ.f2882c.getKey();
        return (key == null || (objB = key.b(Integer.valueOf(i8))) == null) ? new C0165g(i7) : objB;
    }
}
