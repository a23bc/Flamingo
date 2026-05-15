package f0;

import java.util.ArrayList;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: f0.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0914u {

    /* JADX INFO: renamed from: a */
    public static final C0882d0 f11923a = new C0882d0("provider");

    /* JADX INFO: renamed from: b */
    public static final C0882d0 f11924b = new C0882d0("provider");

    /* JADX INFO: renamed from: c */
    public static final C0882d0 f11925c = new C0882d0("compositionLocalMap");

    /* JADX INFO: renamed from: d */
    public static final C0882d0 f11926d = new C0882d0("providers");

    /* JADX INFO: renamed from: e */
    public static final C0882d0 f11927e = new C0882d0("reference");

    /* JADX INFO: renamed from: f */
    public static final C1.b f11928f = new C1.b(17);

    public static final void a(ArrayList arrayList, int i7, int i8) {
        int iE = e(i7, arrayList);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < arrayList.size() && ((P) arrayList.get(iE)).f11729b < i8) {
        }
    }

    public static final void b(H0 h02, ArrayList arrayList, int i7) {
        if (h02.l(i7)) {
            arrayList.add(h02.n(i7));
            return;
        }
        int[] iArr = h02.f11668b;
        int i8 = iArr[(i7 * 5) + 3] + i7;
        for (int i9 = i7 + 1; i9 < i8; i9 += iArr[(i9 * 5) + 3]) {
            b(h02, arrayList, i9);
        }
    }

    public static final void c(String str) {
        throw new C0901n(Z1.l.q("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new C0901n(Z1.l.q("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i7, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int iG = AbstractC1209k.g(((P) arrayList.get(i9)).f11729b, i7);
            if (iG < 0) {
                i8 = i9 + 1;
            } else {
                if (iG <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final Object f(Object obj, Object obj2, Object obj3) {
        S s7 = obj instanceof S ? (S) obj : null;
        if (s7 == null) {
            return null;
        }
        Object obj4 = s7.f11739a;
        boolean zEquals = obj4.equals(obj2);
        Object obj5 = s7.f11740b;
        if (zEquals && AbstractC1209k.a(obj5, obj3)) {
            return obj;
        }
        Object objF = f(obj4, obj2, obj3);
        return objF == null ? f(obj5, obj2, obj3) : objF;
    }

    public static final void g(L0 l02, int i7, Object obj) {
        int iH = l02.h(i7);
        Object[] objArr = l02.f11696c;
        Object obj2 = objArr[iH];
        objArr[iH] = C0903o.f11850a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
