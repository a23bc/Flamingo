package Q0;

import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: Q0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f6085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6086b;

    public C0366w() {
        this.f6085a = new int[10];
    }

    public int a(int i7) {
        int i8 = this.f6086b - 1;
        return i8 >= 0 ? this.f6085a[i8] : i7;
    }

    public int b() {
        int[] iArr = this.f6085a;
        int i7 = this.f6086b - 1;
        this.f6086b = i7;
        return iArr[i7];
    }

    public void c(int i7) {
        int[] iArrCopyOf = this.f6085a;
        if (this.f6086b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f6085a = iArrCopyOf;
        }
        int i8 = this.f6086b;
        this.f6086b = i8 + 1;
        iArrCopyOf[i8] = i7;
    }

    public void d(int i7, int i8, int i9) {
        int i10 = this.f6086b;
        int[] iArrCopyOf = this.f6085a;
        int i11 = i10 + 3;
        if (i11 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f6085a = iArrCopyOf;
        }
        iArrCopyOf[i10] = i7 + i9;
        iArrCopyOf[i10 + 1] = i8 + i9;
        iArrCopyOf[i10 + 2] = i9;
        this.f6086b = i11;
    }

    public void e(int i7, int i8, int i9, int i10) {
        int i11 = this.f6086b;
        int[] iArrCopyOf = this.f6085a;
        int i12 = i11 + 4;
        if (i12 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f6085a = iArrCopyOf;
        }
        iArrCopyOf[i11] = i7;
        iArrCopyOf[i11 + 1] = i8;
        iArrCopyOf[i11 + 2] = i9;
        iArrCopyOf[i11 + 3] = i10;
        this.f6086b = i12;
    }

    public void f(int i7, int i8) {
        if (i7 < i8) {
            int i9 = i7 - 3;
            for (int i10 = i7; i10 < i8; i10 += 3) {
                int[] iArr = this.f6085a;
                int i11 = iArr[i10];
                int i12 = iArr[i8];
                if (i11 < i12 || (i11 == i12 && iArr[i10 + 1] <= iArr[i8 + 1])) {
                    i9 += 3;
                    g(i9, i10);
                }
            }
            g(i9 + 3, i8);
            f(i7, i9);
            f(i9 + 6, i8);
        }
    }

    public void g(int i7, int i8) {
        int[] iArr = this.f6085a;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
        int i10 = i7 + 1;
        int i11 = i8 + 1;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i7 + 2;
        int i14 = i8 + 2;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
    }

    public C0366w(int i7) {
        this.f6085a = new int[i7];
    }
}
