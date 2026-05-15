package G;

import H.C0167i;
import java.util.ArrayList;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2590a;

    /* JADX INFO: renamed from: b */
    public int f2591b;

    /* JADX INFO: renamed from: c */
    public int f2592c;

    /* JADX INFO: renamed from: d */
    public int f2593d;

    /* JADX INFO: renamed from: e */
    public int f2594e;

    /* JADX INFO: renamed from: f */
    public int f2595f;

    /* JADX INFO: renamed from: g */
    public final Object f2596g;
    public final Object h;

    /* JADX INFO: renamed from: i */
    public Object f2597i;

    public t(g gVar) {
        this.f2596g = gVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(0, 0));
        this.f2590a = arrayList;
        this.f2594e = -1;
        this.h = new ArrayList();
        this.f2597i = Z4.v.f8818o;
    }

    public static t a(t tVar, int i7, B0.a aVar, F5.t tVar2, int i8) {
        if ((i8 & 1) != 0) {
            i7 = tVar.f2591b;
        }
        int i9 = i7;
        if ((i8 & 2) != 0) {
            aVar = (B0.a) tVar.h;
        }
        B0.a aVar2 = aVar;
        if ((i8 & 4) != 0) {
            tVar2 = (F5.t) tVar.f2597i;
        }
        F5.t tVar3 = tVar2;
        AbstractC1209k.f(tVar3, "request");
        return new t((J5.h) tVar.f2596g, tVar.f2590a, i9, aVar2, tVar3, tVar.f2592c, tVar.f2593d, tVar.f2594e);
    }

    public int b() {
        return ((int) Math.sqrt((((double) e()) * 1.0d) / ((double) this.f2595f))) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a4  */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1.k c(int r13) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.t.c(int):C1.k");
    }

    public int d(int i7) {
        int i8;
        if (e() <= 0) {
            return 0;
        }
        if (i7 >= e()) {
            C.b.a("ItemIndex > total count");
        }
        if (!((g) this.f2596g).f2508e) {
            return i7 / this.f2595f;
        }
        ArrayList arrayList = this.f2590a;
        int size = arrayList.size();
        Z4.o.h0(arrayList.size(), size);
        int i9 = size - 1;
        int i10 = 0;
        while (true) {
            if (i10 > i9) {
                i8 = -(i10 + 1);
                break;
            }
            i8 = (i10 + i9) >>> 1;
            int i11 = ((r) arrayList.get(i8)).f2587a - i7;
            if (i11 >= 0) {
                if (i11 <= 0) {
                    break;
                }
                i9 = i8 - 1;
            } else {
                i10 = i8 + 1;
            }
        }
        if (i8 < 0) {
            i8 = (-i8) - 2;
        }
        int iB = b() * i8;
        int i12 = ((r) arrayList.get(i8)).f2587a;
        if (i12 > i7) {
            C.b.a("currentItemIndex > itemIndex");
        }
        int i13 = 0;
        while (i12 < i7) {
            int i14 = i12 + 1;
            int iG = g(i12);
            i13 += iG;
            int i15 = this.f2595f;
            if (i13 >= i15) {
                if (i13 == i15) {
                    iB++;
                    i13 = 0;
                } else {
                    iB++;
                    i13 = iG;
                }
            }
            if (iB % b() == 0 && iB / b() >= arrayList.size()) {
                arrayList.add(new r(i14 - (i13 > 0 ? 1 : 0), 0));
            }
            i12 = i14;
        }
        return g(i7) + i13 > this.f2595f ? iB + 1 : iB;
    }

    public int e() {
        return ((g) this.f2596g).f2507d.f1582p;
    }

    public F5.v f(F5.t tVar) {
        AbstractC1209k.f(tVar, "request");
        ArrayList arrayList = this.f2590a;
        int size = arrayList.size();
        int i7 = this.f2591b;
        if (i7 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f2595f++;
        B0.a aVar = (B0.a) this.h;
        if (aVar != null) {
            if (!((J5.d) aVar.f607c).b((F5.o) tVar.f2441p)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
            }
            if (this.f2595f != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i8 = i7 + 1;
        t tVarA = a(this, i8, null, tVar, 58);
        F5.p pVar = (F5.p) arrayList.get(i7);
        F5.v vVarA = pVar.a(tVarA);
        if (vVarA == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (aVar != null && i8 < arrayList.size() && tVarA.f2595f != 1) {
            throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (vVarA.f2465u != null) {
            return vVarA;
        }
        throw new IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }

    public int g(int i7) {
        s sVar = s.f2589a;
        C0167i c0167iJ = ((g) this.f2596g).f2507d.j(i7);
        return (int) ((b) ((f) c0167iJ.f2882c).f2502b.invoke(sVar, Integer.valueOf(i7 - c0167iJ.f2880a))).f2485a;
    }

    public t(J5.h hVar, ArrayList arrayList, int i7, B0.a aVar, F5.t tVar, int i8, int i9, int i10) {
        AbstractC1209k.f(hVar, "call");
        AbstractC1209k.f(tVar, "request");
        this.f2596g = hVar;
        this.f2590a = arrayList;
        this.f2591b = i7;
        this.h = aVar;
        this.f2597i = tVar;
        this.f2592c = i8;
        this.f2593d = i9;
        this.f2594e = i10;
    }
}
