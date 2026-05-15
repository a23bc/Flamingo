package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final T f9594f = new T(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9598d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9599e;

    public T(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f9595a = i7;
        this.f9596b = iArr;
        this.f9597c = objArr;
        this.f9599e = z6;
    }

    public final void a(int i7) {
        int[] iArr = this.f9596b;
        if (i7 > iArr.length) {
            int i8 = this.f9595a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f9596b = Arrays.copyOf(iArr, i7);
            this.f9597c = Arrays.copyOf(this.f9597c, i7);
        }
    }

    public final int b() {
        int iI0;
        int iK0;
        int iI02;
        int i7 = this.f9598d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9595a; i9++) {
            int i10 = this.f9596b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f9597c[i9]).getClass();
                    iI02 = C0561i.i0(i11) + 8;
                } else if (i12 == 2) {
                    iI02 = C0561i.g0(i11, (C0558f) this.f9597c[i9]);
                } else if (i12 == 3) {
                    iI0 = C0561i.i0(i11) * 2;
                    iK0 = ((T) this.f9597c[i9]).b();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(C0574w.b());
                    }
                    ((Integer) this.f9597c[i9]).getClass();
                    iI02 = C0561i.i0(i11) + 4;
                }
                i8 = iI02 + i8;
            } else {
                long jLongValue = ((Long) this.f9597c[i9]).longValue();
                iI0 = C0561i.i0(i11);
                iK0 = C0561i.k0(jLongValue);
            }
            i8 = iK0 + iI0 + i8;
        }
        this.f9598d = i8;
        return i8;
    }

    public final void c(int i7, Object obj) {
        if (!this.f9599e) {
            throw new UnsupportedOperationException();
        }
        a(this.f9595a + 1);
        int[] iArr = this.f9596b;
        int i8 = this.f9595a;
        iArr[i8] = i7;
        this.f9597c[i8] = obj;
        this.f9595a = i8 + 1;
    }

    public final void d(B b7) throws IOException {
        if (this.f9595a == 0) {
            return;
        }
        b7.getClass();
        for (int i7 = 0; i7 < this.f9595a; i7++) {
            int i8 = this.f9596b[i7];
            Object obj = this.f9597c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            C0561i c0561i = (C0561i) b7.f9557a;
            if (i10 == 0) {
                c0561i.B0(((Long) obj).longValue(), i9);
            } else if (i10 == 1) {
                c0561i.s0(((Long) obj).longValue(), i9);
            } else if (i10 == 2) {
                c0561i.p0(i9, (C0558f) obj);
            } else if (i10 == 3) {
                c0561i.y0(i9, 3);
                ((T) obj).d(b7);
                c0561i.y0(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(C0574w.b());
                }
                c0561i.q0(i9, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof T)) {
            return false;
        }
        T t7 = (T) obj;
        int i7 = this.f9595a;
        if (i7 == t7.f9595a) {
            int[] iArr = this.f9596b;
            int[] iArr2 = t7.f9596b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f9597c;
                    Object[] objArr2 = t7.f9597c;
                    int i9 = this.f9595a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f9595a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f9596b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 + i9) * 31;
        Object[] objArr = this.f9597c;
        int i12 = this.f9595a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }
}
