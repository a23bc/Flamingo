package J2;

import E4.F;
import java.util.ArrayList;
import java.util.Arrays;
import t2.C1487p;
import t2.i0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f3616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f3618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1487p[] f3619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3621f;

    public b(int i7, i0 i0Var, int[] iArr) {
        C1487p[] c1487pArr;
        this.f3621f = i7;
        AbstractC1697a.i(iArr.length > 0);
        i0Var.getClass();
        this.f3616a = i0Var;
        int length = iArr.length;
        this.f3617b = length;
        this.f3619d = new C1487p[length];
        int i8 = 0;
        while (true) {
            int length2 = iArr.length;
            c1487pArr = i0Var.f16493d;
            if (i8 >= length2) {
                break;
            }
            this.f3619d[i8] = c1487pArr[iArr[i8]];
            i8++;
        }
        Arrays.sort(this.f3619d, new C1.b(3));
        this.f3618c = new int[this.f3617b];
        int i9 = 0;
        while (true) {
            int i10 = this.f3617b;
            if (i9 >= i10) {
                long[] jArr = new long[i10];
                return;
            }
            int[] iArr2 = this.f3618c;
            C1487p c1487p = this.f3619d[i9];
            int i11 = 0;
            while (true) {
                if (i11 >= c1487pArr.length) {
                    i11 = -1;
                    break;
                } else if (c1487p == c1487pArr[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
            iArr2[i9] = i11;
            i9++;
        }
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j7 : jArr) {
            j3 += j7;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            F f7 = (F) arrayList.get(i7);
            if (f7 != null) {
                f7.a(new a(j3, jArr[i7]));
            }
        }
    }

    @Override // J2.q
    public final /* synthetic */ void a(boolean z6) {
    }

    @Override // J2.q
    public final C1487p b(int i7) {
        return this.f3619d[i7];
    }

    @Override // J2.q
    public void c() {
        int i7 = this.f3621f;
    }

    @Override // J2.q
    public final int d(int i7) {
        return this.f3618c[i7];
    }

    @Override // J2.q
    public void e() {
        int i7 = this.f3621f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f3616a.equals(bVar.f3616a) && Arrays.equals(this.f3618c, bVar.f3618c)) {
                return true;
            }
        }
        return false;
    }

    @Override // J2.q
    public final int f() {
        return this.f3618c[0];
    }

    @Override // J2.q
    public final i0 g() {
        return this.f3616a;
    }

    @Override // J2.q
    public final C1487p h() {
        return this.f3619d[0];
    }

    public final int hashCode() {
        if (this.f3620e == 0) {
            this.f3620e = Arrays.hashCode(this.f3618c) + (System.identityHashCode(this.f3616a) * 31);
        }
        return this.f3620e;
    }

    @Override // J2.q
    public void i(float f7) {
        int i7 = this.f3621f;
    }

    @Override // J2.q
    public final /* synthetic */ void j() {
    }

    @Override // J2.q
    public final /* synthetic */ void k() {
    }

    @Override // J2.q
    public final int l(int i7) {
        for (int i8 = 0; i8 < this.f3617b; i8++) {
            if (this.f3618c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // J2.q
    public final int length() {
        return this.f3618c.length;
    }

    private final void n() {
    }

    private final void p() {
    }

    public final void o() {
    }

    public final void q() {
    }

    private final void r(float f7) {
    }

    public final void s(float f7) {
    }
}
