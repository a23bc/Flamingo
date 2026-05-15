package t;

import java.util.Arrays;
import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f16037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ int[] f16038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object[] f16039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f16040r;

    public U(int i7) {
        int i8;
        int i9 = 4;
        while (true) {
            i8 = 40;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (40 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 4;
        this.f16038p = new int[i11];
        this.f16039q = new Object[i11];
    }

    public final void a(int i7, Object obj) {
        int i8 = this.f16040r;
        if (i8 != 0 && i7 <= this.f16038p[i8 - 1]) {
            g(i7, obj);
            return;
        }
        if (this.f16037o && i8 >= this.f16038p.length) {
            AbstractC1464t.a(this);
        }
        int i9 = this.f16040r;
        if (i9 >= this.f16038p.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f16038p, i13);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f16038p = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16039q, i13);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f16039q = objArrCopyOf;
        }
        this.f16038p[i9] = i7;
        this.f16039q[i9] = obj;
        this.f16040r = i9 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final U clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC1209k.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        U u7 = (U) objClone;
        u7.f16038p = (int[]) this.f16038p.clone();
        u7.f16039q = (Object[]) this.f16039q.clone();
        return u7;
    }

    public final boolean c(int i7) {
        if (this.f16037o) {
            AbstractC1464t.a(this);
        }
        return AbstractC1525a.a(this.f16040r, i7, this.f16038p) >= 0;
    }

    public final boolean d() {
        if (this.f16037o) {
            AbstractC1464t.a(this);
        }
        int i7 = this.f16040r;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (this.f16039q[i8] == null) {
                break;
            }
            i8++;
        }
        return i8 >= 0;
    }

    public final Object e(int i7) {
        Object obj;
        int iA = AbstractC1525a.a(this.f16040r, i7, this.f16038p);
        if (iA < 0 || (obj = this.f16039q[iA]) == AbstractC1464t.f16109c) {
            return null;
        }
        return obj;
    }

    public final int f(int i7) {
        if (this.f16037o) {
            AbstractC1464t.a(this);
        }
        return this.f16038p[i7];
    }

    public final void g(int i7, Object obj) {
        int iA = AbstractC1525a.a(this.f16040r, i7, this.f16038p);
        if (iA >= 0) {
            this.f16039q[iA] = obj;
            return;
        }
        int i8 = ~iA;
        int i9 = this.f16040r;
        if (i8 < i9) {
            Object[] objArr = this.f16039q;
            if (objArr[i8] == AbstractC1464t.f16109c) {
                this.f16038p[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f16037o && i9 >= this.f16038p.length) {
            AbstractC1464t.a(this);
            i8 = ~AbstractC1525a.a(this.f16040r, i7, this.f16038p);
        }
        int i10 = this.f16040r;
        if (i10 >= this.f16038p.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f16038p, i14);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f16038p = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16039q, i14);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f16039q = objArrCopyOf;
        }
        int i15 = this.f16040r;
        if (i15 - i8 != 0) {
            int[] iArr = this.f16038p;
            int i16 = i8 + 1;
            Z4.l.V(i16, i8, i15, iArr, iArr);
            Object[] objArr2 = this.f16039q;
            Z4.l.W(i16, i8, this.f16040r, objArr2, objArr2);
        }
        this.f16038p[i8] = i7;
        this.f16039q[i8] = obj;
        this.f16040r++;
    }

    public final int h() {
        if (this.f16037o) {
            AbstractC1464t.a(this);
        }
        return this.f16040r;
    }

    public final Object i(int i7) {
        if (this.f16037o) {
            AbstractC1464t.a(this);
        }
        Object[] objArr = this.f16039q;
        if (i7 < objArr.length) {
            return objArr[i7];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16040r * 28);
        sb.append('{');
        int i7 = this.f16040r;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(f(i8));
            sb.append('=');
            Object objI = i(i8);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }
}
