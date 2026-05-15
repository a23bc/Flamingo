package v;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import j5.AbstractC1107a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: v.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1619p implements O0.Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1627x f18137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18138b;

    public C1619p(C1627x c1627x) {
        this.f18137a = c1627x;
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
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((O0.Y) list.get(i7)).d(j3));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i8 = ((O0.m0) obj).f5416o;
            int iD0 = Z4.o.d0(arrayList);
            if (1 <= iD0) {
                int i9 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i9);
                    int i10 = ((O0.m0) obj3).f5416o;
                    if (i8 < i10) {
                        obj = obj3;
                        i8 = i10;
                    }
                    if (i9 == iD0) {
                        break;
                    }
                    i9++;
                }
            }
        }
        O0.m0 m0Var = (O0.m0) obj;
        int i11 = m0Var != null ? m0Var.f5416o : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i12 = ((O0.m0) obj2).f5417p;
            int iD02 = Z4.o.d0(arrayList);
            if (1 <= iD02) {
                int i13 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i13);
                    int i14 = ((O0.m0) obj4).f5417p;
                    if (i12 < i14) {
                        obj2 = obj4;
                        i12 = i14;
                    }
                    if (i13 == iD02) {
                        break;
                    }
                    i13++;
                }
            }
        }
        O0.m0 m0Var2 = (O0.m0) obj2;
        int i15 = m0Var2 != null ? m0Var2.f5417p : 0;
        boolean zS = interfaceC0298b0.s();
        C1627x c1627x = this.f18137a;
        if (zS) {
            this.f18138b = true;
            c1627x.f18192b.setValue(new n1.m(AbstractC1107a.b(i11, i15)));
        } else if (!this.f18138b) {
            c1627x.f18192b.setValue(new n1.m(AbstractC1107a.b(i11, i15)));
        }
        return interfaceC0298b0.k(i11, i15, Z4.w.f8819o, new O0.q0(3, arrayList));
    }
}
