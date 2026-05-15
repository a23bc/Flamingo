package u6;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: u6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1566i implements O0.Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1563f f17665c;

    public C1566i(int i7, int i8, C1563f c1563f) {
        this.f17663a = i7;
        this.f17664b = i8;
        this.f17665c = c1563f;
    }

    @Override // O0.Z
    public final /* synthetic */ int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.i(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.l(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.f(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final /* synthetic */ int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        return A0.e.c(this, interfaceC0327y, list, i7);
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        AbstractC1209k.f(interfaceC0298b0, "$this$Layout");
        AbstractC1209k.f(list, "measurables");
        final int iH = n1.a.h(j3);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        final Y4.h[] hVarArr = new Y4.h[size];
        for (int i7 = 0; i7 < size; i7++) {
            O0.Y y6 = (O0.Y) list.get(i7);
            O0.m0 m0VarD = y6.d(n1.a.a(j3, 0, 0, 0, 0, 14));
            Object objI = y6.i();
            C1569l c1569l = objI instanceof C1569l ? (C1569l) objI : null;
            hVarArr[i7] = new Y4.h(m0VarD, Boolean.valueOf(c1569l != null ? c1569l.f17735a : false));
        }
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z7 = true;
            if (i8 >= size) {
                break;
            }
            Y4.h hVar = hVarArr[i8];
            O0.m0 m0Var = (O0.m0) hVar.f8726o;
            boolean zBooleanValue = ((Boolean) hVar.f8727p).booleanValue();
            int i12 = i8 == i9 ? m0Var.f5416o : m0Var.f5416o + this.f17663a;
            if (i8 == i9 || i10 + i12 <= iH) {
                i10 += i12;
                int iMax = Math.max(i11, m0Var.f5417p);
                if (!z6 && zBooleanValue) {
                    z7 = false;
                }
                z6 = z7;
                i11 = iMax;
            } else {
                arrayList.add(new C1565h(!z6, i9, i8 - 1, i10, i11));
                int i13 = m0Var.f5416o;
                i9 = i8;
                i11 = m0Var.f5417p;
                i10 = i13;
                z6 = !zBooleanValue;
            }
            i8++;
        }
        if (size != 0) {
            arrayList.add(new C1565h(!z6, i9, size - 1, i10, i11));
        }
        int i14 = 0;
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((C1565h) obj).f17642e) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            i14 += ((C1565h) it.next()).f17641d;
        }
        int size2 = arrayList2.size() - 1;
        final int i15 = this.f17664b;
        final C1563f c1563f = this.f17665c;
        final int i16 = this.f17663a;
        return interfaceC0298b0.k(iH, (size2 * i15) + i14, Z4.w.f8819o, new InterfaceC1182c() { // from class: u6.g
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj2) {
                int i17;
                O0.l0 l0Var = (O0.l0) obj2;
                ArrayList<C1565h> arrayList3 = arrayList2;
                Y4.h[] hVarArr2 = hVarArr;
                AbstractC1209k.f(l0Var, "$this$layout");
                int i18 = 0;
                for (C1565h c1565h : arrayList3) {
                    int i19 = c1565h.f17638a;
                    C1563f c1563f2 = c1563f;
                    EnumC1561e enumC1561e = EnumC1561e.f17588q;
                    EnumC1561e enumC1561e2 = c1563f2.f17600c;
                    int i20 = c1565h.f17639b;
                    if (enumC1561e2 != enumC1561e) {
                        while (i19 <= i20 && ((Boolean) hVarArr2[i19].f8727p).booleanValue()) {
                            i19++;
                        }
                    }
                    if (enumC1561e2 != EnumC1561e.f17586o) {
                        while (i20 >= i19 && ((Boolean) hVarArr2[i20].f8727p).booleanValue()) {
                            i20--;
                        }
                    }
                    if (i19 <= i20) {
                        int i21 = 0;
                        int iMax2 = 0;
                        if (i19 <= i20) {
                            int i22 = i19;
                            while (true) {
                                O0.m0 m0Var2 = (O0.m0) hVarArr2[i22].f8726o;
                                i21 += m0Var2.f5416o;
                                iMax2 = Math.max(iMax2, m0Var2.f5417p);
                                if (i22 == i20) {
                                    break;
                                }
                                i22++;
                            }
                        }
                        int i23 = i16;
                        if (i19 != i20) {
                            i21 += (i20 - i19) * i23;
                        }
                        int iOrdinal = enumC1561e2.ordinal();
                        if (iOrdinal != 0) {
                            int i24 = iH;
                            if (iOrdinal == 1) {
                                i17 = i24 - i21;
                            } else {
                                if (iOrdinal != 2) {
                                    throw new A2.W();
                                }
                                i17 = (i24 - i21) / 2;
                            }
                        } else {
                            i17 = 0;
                        }
                        if (i19 <= i20) {
                            while (true) {
                                O0.m0 m0Var3 = (O0.m0) hVarArr2[i19].f8726o;
                                O0.l0.h(l0Var, m0Var3, i17, ((iMax2 - m0Var3.f5417p) / 2) + i18);
                                i17 += m0Var3.f5416o + i23;
                                if (i19 == i20) {
                                    break;
                                }
                                i19++;
                            }
                        }
                        i18 += iMax2 + i15;
                    }
                }
                return Y4.o.f8736a;
            }
        });
    }
}
