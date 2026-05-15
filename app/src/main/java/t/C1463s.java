package t;

import java.util.Arrays;
import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1463s implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f16103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ long[] f16104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object[] f16105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f16106r;

    public C1463s(int i7) {
        if (i7 == 0) {
            this.f16104p = AbstractC1525a.f17127b;
            this.f16105q = AbstractC1525a.f17128c;
            return;
        }
        int i8 = i7 * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 8;
        this.f16104p = new long[i11];
        this.f16105q = new Object[i11];
    }

    public final void a(long j3, Long l) {
        int i7 = this.f16106r;
        if (i7 != 0 && j3 <= this.f16104p[i7 - 1]) {
            f(j3, l);
            return;
        }
        if (this.f16103o) {
            long[] jArr = this.f16104p;
            if (i7 >= jArr.length) {
                Object[] objArr = this.f16105q;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj = objArr[i9];
                    if (obj != AbstractC1464t.f16107a) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr[i8] = obj;
                            objArr[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f16103o = false;
                this.f16106r = i8;
            }
        }
        int i10 = this.f16106r;
        if (i10 >= this.f16104p.length) {
            int i11 = (i10 + 1) * 8;
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
            int i14 = i11 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f16104p, i14);
            AbstractC1209k.e(jArrCopyOf, "copyOf(...)");
            this.f16104p = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16105q, i14);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f16105q = objArrCopyOf;
        }
        this.f16104p[i10] = j3;
        this.f16105q[i10] = l;
        this.f16106r = i10 + 1;
    }

    public final void b() {
        int i7 = this.f16106r;
        Object[] objArr = this.f16105q;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f16106r = 0;
        this.f16103o = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1463s clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC1209k.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1463s c1463s = (C1463s) objClone;
        c1463s.f16104p = (long[]) this.f16104p.clone();
        c1463s.f16105q = (Object[]) this.f16105q.clone();
        return c1463s;
    }

    public final Object d(long j3) {
        Object obj;
        int iB = AbstractC1525a.b(this.f16104p, this.f16106r, j3);
        if (iB < 0 || (obj = this.f16105q[iB]) == AbstractC1464t.f16107a) {
            return -1L;
        }
        return obj;
    }

    public final long e(int i7) {
        if (!(i7 >= 0 && i7 < this.f16106r)) {
            AbstractC1525a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f16103o) {
            int i8 = this.f16106r;
            long[] jArr = this.f16104p;
            Object[] objArr = this.f16105q;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC1464t.f16107a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f16103o = false;
            this.f16106r = i9;
        }
        return this.f16104p[i7];
    }

    public final void f(long j3, Object obj) {
        int iB = AbstractC1525a.b(this.f16104p, this.f16106r, j3);
        if (iB >= 0) {
            this.f16105q[iB] = obj;
            return;
        }
        int i7 = ~iB;
        int i8 = this.f16106r;
        Object obj2 = AbstractC1464t.f16107a;
        if (i7 < i8) {
            Object[] objArr = this.f16105q;
            if (objArr[i7] == obj2) {
                this.f16104p[i7] = j3;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f16103o) {
            long[] jArr = this.f16104p;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f16105q;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f16103o = false;
                this.f16106r = i9;
                i7 = ~AbstractC1525a.b(this.f16104p, i9, j3);
            }
        }
        int i11 = this.f16106r;
        if (i11 >= this.f16104p.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f16104p, i15);
            AbstractC1209k.e(jArrCopyOf, "copyOf(...)");
            this.f16104p = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16105q, i15);
            AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            this.f16105q = objArrCopyOf;
        }
        int i16 = this.f16106r;
        if (i16 - i7 != 0) {
            long[] jArr2 = this.f16104p;
            int i17 = i7 + 1;
            Z4.l.Y(jArr2, jArr2, i17, i7, i16);
            Object[] objArr3 = this.f16105q;
            Z4.l.W(i17, i7, this.f16106r, objArr3, objArr3);
        }
        this.f16104p[i7] = j3;
        this.f16105q[i7] = obj;
        this.f16106r++;
    }

    public final void g(long j3) {
        int iB = AbstractC1525a.b(this.f16104p, this.f16106r, j3);
        if (iB >= 0) {
            Object[] objArr = this.f16105q;
            Object obj = objArr[iB];
            Object obj2 = AbstractC1464t.f16107a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f16103o = true;
            }
        }
    }

    public final int h() {
        if (this.f16103o) {
            int i7 = this.f16106r;
            long[] jArr = this.f16104p;
            Object[] objArr = this.f16105q;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC1464t.f16107a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f16103o = false;
            this.f16106r = i8;
        }
        return this.f16106r;
    }

    public final Object i(int i7) {
        if (!(i7 >= 0 && i7 < this.f16106r)) {
            AbstractC1525a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f16103o) {
            int i8 = this.f16106r;
            long[] jArr = this.f16104p;
            Object[] objArr = this.f16105q;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC1464t.f16107a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f16103o = false;
            this.f16106r = i9;
        }
        return this.f16105q[i7];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16106r * 28);
        sb.append('{');
        int i7 = this.f16106r;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(e(i8));
            sb.append('=');
            Object objI = i(i8);
            if (objI != sb) {
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

    public /* synthetic */ C1463s(Object obj) {
        this(10);
    }
}
