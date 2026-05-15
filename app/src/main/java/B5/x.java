package B5;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.AbstractC1209k;
import w5.T;
import w5.U;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f925b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f926a;

    public final void a(T t7) {
        t7.e((U) this);
        T[] tArr = this.f926a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f925b;
        if (tArr == null) {
            tArr = new T[4];
            this.f926a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            tArr = (T[]) objArrCopyOf;
            this.f926a = tArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        tArr[i7] = t7;
        t7.f19506p = i7;
        e(i7);
    }

    public final T b() {
        T t7;
        synchronized (this) {
            T[] tArr = this.f926a;
            t7 = tArr != null ? tArr[0] : null;
        }
        return t7;
    }

    public final void c(T t7) {
        synchronized (this) {
            if (t7.b() != null) {
                d(t7.f19506p);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w5.T d(int r9) {
        /*
            r8 = this;
            w5.T[] r0 = r8.f926a
            m5.AbstractC1209k.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = B5.x.f925b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            m5.AbstractC1209k.c(r4)
            r5 = r0[r2]
            m5.AbstractC1209k.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.f(r9, r2)
            r8.e(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            w5.T[] r5 = r8.f926a
            m5.AbstractC1209k.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            m5.AbstractC1209k.c(r6)
            r7 = r5[r4]
            m5.AbstractC1209k.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            m5.AbstractC1209k.c(r4)
            r5 = r5[r2]
            m5.AbstractC1209k.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.f(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            m5.AbstractC1209k.c(r9)
            r2 = 0
            r9.e(r2)
            r9.f19506p = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.x.d(int):w5.T");
    }

    public final void e(int i7) {
        while (i7 > 0) {
            T[] tArr = this.f926a;
            AbstractC1209k.c(tArr);
            int i8 = (i7 - 1) / 2;
            T t7 = tArr[i8];
            AbstractC1209k.c(t7);
            T t8 = tArr[i7];
            AbstractC1209k.c(t8);
            if (t7.compareTo(t8) <= 0) {
                return;
            }
            f(i7, i8);
            i7 = i8;
        }
    }

    public final void f(int i7, int i8) {
        T[] tArr = this.f926a;
        AbstractC1209k.c(tArr);
        T t7 = tArr[i8];
        AbstractC1209k.c(t7);
        T t8 = tArr[i7];
        AbstractC1209k.c(t8);
        tArr[i7] = t7;
        tArr[i8] = t8;
        t7.f19506p = i7;
        t8.f19506p = i8;
    }
}
