package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f0 f9463f = new f0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9467d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9468e;

    public f0(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f9464a = i7;
        this.f9465b = iArr;
        this.f9466c = objArr;
        this.f9468e = z6;
    }

    public static f0 b() {
        return new f0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iY;
        int iA;
        int iU;
        int i7 = this.f9467d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9464a; i9++) {
            int i10 = this.f9465b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f9466c[i9]).getClass();
                    iU = C0537j.u(i11);
                } else if (i12 == 2) {
                    iU = C0537j.r(i11, (C0533f) this.f9466c[i9]);
                } else if (i12 == 3) {
                    iY = C0537j.y(i11) * 2;
                    iA = ((f0) this.f9466c[i9]).a();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(C0550x.b());
                    }
                    ((Integer) this.f9466c[i9]).getClass();
                    iU = C0537j.t(i11);
                }
                i8 = iU + i8;
            } else {
                long jLongValue = ((Long) this.f9466c[i9]).longValue();
                iY = C0537j.y(i11);
                iA = C0537j.A(jLongValue);
            }
            i8 = iA + iY + i8;
        }
        this.f9467d = i8;
        return i8;
    }

    public final void c(int i7, Object obj) {
        if (!this.f9468e) {
            throw new UnsupportedOperationException();
        }
        int i8 = this.f9464a;
        int[] iArr = this.f9465b;
        if (i8 == iArr.length) {
            int i9 = i8 + (i8 < 4 ? 8 : i8 >> 1);
            this.f9465b = Arrays.copyOf(iArr, i9);
            this.f9466c = Arrays.copyOf(this.f9466c, i9);
        }
        int[] iArr2 = this.f9465b;
        int i10 = this.f9464a;
        iArr2[i10] = i7;
        this.f9466c[i10] = obj;
        this.f9464a = i10 + 1;
    }

    public final void d(F f7) throws IOException {
        if (this.f9464a == 0) {
            return;
        }
        f7.getClass();
        for (int i7 = 0; i7 < this.f9464a; i7++) {
            int i8 = this.f9465b[i7];
            Object obj = this.f9466c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            C0537j c0537j = (C0537j) f7.f9391a;
            if (i10 == 0) {
                c0537j.U(((Long) obj).longValue(), i9);
            } else if (i10 == 1) {
                c0537j.K(((Long) obj).longValue(), i9);
            } else if (i10 == 2) {
                f7.a(i9, (C0533f) obj);
            } else if (i10 == 3) {
                c0537j.R(i9, 3);
                ((f0) obj).d(f7);
                c0537j.R(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(C0550x.b());
                }
                c0537j.I(i9, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i7 = this.f9464a;
        if (i7 == f0Var.f9464a) {
            int[] iArr = this.f9465b;
            int[] iArr2 = f0Var.f9465b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f9466c;
                    Object[] objArr2 = f0Var.f9466c;
                    int i9 = this.f9464a;
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
        int i7 = this.f9464a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f9465b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 + i9) * 31;
        Object[] objArr = this.f9466c;
        int i12 = this.f9464a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }
}
