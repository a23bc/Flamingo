package v;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import j5.AbstractC1107a;
import java.util.List;
import r5.C1422c;
import r5.C1423d;

/* JADX INFO: renamed from: v.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1613j implements O0.Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1618o f18107a;

    public C1613j(C1618o c1618o) {
        this.f18107a = c1618o;
    }

    @Override // O0.Z
    public final int a(InterfaceC0327y interfaceC0327y, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((O0.Y) list.get(0)).Q(i7));
            int iD0 = Z4.o.d0(list);
            int i8 = 1;
            if (1 <= iD0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((O0.Y) list.get(i8)).Q(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iD0) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // O0.Z
    public final int b(InterfaceC0327y interfaceC0327y, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((O0.Y) list.get(0)).M(i7));
            int iD0 = Z4.o.d0(list);
            int i8 = 1;
            if (1 <= iD0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((O0.Y) list.get(i8)).M(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iD0) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // O0.Z
    public final int d(InterfaceC0327y interfaceC0327y, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((O0.Y) list.get(0)).P(i7));
            int iD0 = Z4.o.d0(list);
            int i8 = 1;
            if (1 <= iD0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((O0.Y) list.get(i8)).P(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iD0) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // O0.Z
    public final int f(InterfaceC0327y interfaceC0327y, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((O0.Y) list.get(0)).e(i7));
            int iD0 = Z4.o.d0(list);
            int i8 = 1;
            if (1 <= iD0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((O0.Y) list.get(i8)).e(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iD0) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        O0.m0 m0Var;
        O0.m0 m0Var2;
        int i7;
        int size = list.size();
        O0.m0[] m0VarArr = new O0.m0[size];
        int size2 = list.size();
        long j7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            m0Var = null;
            if (i9 >= size2) {
                break;
            }
            O0.Y y6 = (O0.Y) list.get(i9);
            Object objI = y6.i();
            C1615l c1615l = objI instanceof C1615l ? (C1615l) objI : null;
            if (c1615l != null && ((Boolean) c1615l.f18120a.getValue()).booleanValue()) {
                O0.m0 m0VarD = y6.d(j3);
                long jB = AbstractC1107a.b(m0VarD.f5416o, m0VarD.f5417p);
                m0VarArr[i9] = m0VarD;
                j7 = jB;
            }
            i9++;
        }
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            O0.Y y7 = (O0.Y) list.get(i10);
            if (m0VarArr[i10] == null) {
                m0VarArr[i10] = y7.d(j3);
            }
        }
        if (interfaceC0298b0.s()) {
            i7 = (int) (j7 >> 32);
        } else {
            if (size == 0) {
                m0Var2 = null;
            } else {
                m0Var2 = m0VarArr[0];
                int i11 = size - 1;
                if (i11 != 0) {
                    int i12 = m0Var2 != null ? m0Var2.f5416o : 0;
                    C1422c it = new C1423d(1, i11, 1).iterator();
                    while (it.f15786q) {
                        O0.m0 m0Var3 = m0VarArr[it.b()];
                        int i13 = m0Var3 != null ? m0Var3.f5416o : 0;
                        if (i12 < i13) {
                            m0Var2 = m0Var3;
                            i12 = i13;
                        }
                    }
                }
            }
            i7 = m0Var2 != null ? m0Var2.f5416o : 0;
        }
        if (interfaceC0298b0.s()) {
            i8 = (int) (4294967295L & j7);
        } else {
            if (size != 0) {
                m0Var = m0VarArr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = m0Var != null ? m0Var.f5417p : 0;
                    C1422c it2 = new C1423d(1, i14, 1).iterator();
                    while (it2.f15786q) {
                        O0.m0 m0Var4 = m0VarArr[it2.b()];
                        int i16 = m0Var4 != null ? m0Var4.f5417p : 0;
                        if (i15 < i16) {
                            m0Var = m0Var4;
                            i15 = i16;
                        }
                    }
                }
            }
            if (m0Var != null) {
                i8 = m0Var.f5417p;
            }
        }
        if (!interfaceC0298b0.s()) {
            this.f18107a.f18134c.setValue(new n1.m(AbstractC1107a.b(i7, i8)));
        }
        return interfaceC0298b0.k(i7, i8, Z4.w.f8819o, new C1612i(m0VarArr, this, i7, i8));
    }
}
