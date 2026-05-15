package w0;

import Q0.AbstractC0347f;
import Q0.K;
import java.util.Comparator;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v f18821o = new v();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        u uVar = (u) obj;
        u uVar2 = (u) obj2;
        int i7 = 0;
        if (f.r(uVar) && f.r(uVar2)) {
            K kX = AbstractC0347f.x(uVar);
            K kX2 = AbstractC0347f.x(uVar2);
            if (!AbstractC1209k.a(kX, kX2)) {
                Object[] objArr = new K[16];
                int i8 = 0;
                while (kX != null) {
                    int i9 = i8 + 1;
                    if (objArr.length < i9) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i9, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i8 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i8 + 0);
                    }
                    objArr[0] = kX;
                    i8++;
                    kX = kX.v();
                }
                Object[] objArr3 = new K[16];
                int i10 = 0;
                while (kX2 != null) {
                    int i11 = i10 + 1;
                    if (objArr3.length < i11) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i11, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i10 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i10 + 0);
                    }
                    objArr3[0] = kX2;
                    i10++;
                    kX2 = kX2.v();
                }
                int iMin = Math.min(i8 - 1, i10 - 1);
                if (iMin >= 0) {
                    while (AbstractC1209k.a(objArr[i7], objArr3[i7])) {
                        if (i7 != iMin) {
                            i7++;
                        }
                    }
                    return AbstractC1209k.g(((K) objArr[i7]).x(), ((K) objArr3[i7]).x());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (f.r(uVar)) {
                return -1;
            }
            if (f.r(uVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
