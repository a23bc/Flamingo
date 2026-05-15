package a5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import m5.AbstractC1209k;
import n5.InterfaceC1241e;
import o5.AbstractC1267a;

/* JADX INFO: renamed from: a5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0525e implements Map, Serializable, InterfaceC1241e {

    /* JADX INFO: renamed from: B */
    public static final C0525e f8862B;

    /* JADX INFO: renamed from: A */
    public boolean f8863A;

    /* JADX INFO: renamed from: o */
    public Object[] f8864o;

    /* JADX INFO: renamed from: p */
    public Object[] f8865p;

    /* JADX INFO: renamed from: q */
    public int[] f8866q;

    /* JADX INFO: renamed from: r */
    public int[] f8867r;

    /* JADX INFO: renamed from: s */
    public int f8868s;

    /* JADX INFO: renamed from: t */
    public int f8869t;

    /* JADX INFO: renamed from: u */
    public int f8870u;

    /* JADX INFO: renamed from: v */
    public int f8871v;

    /* JADX INFO: renamed from: w */
    public int f8872w;

    /* JADX INFO: renamed from: x */
    public C0526f f8873x;

    /* JADX INFO: renamed from: y */
    public C0527g f8874y;

    /* JADX INFO: renamed from: z */
    public C0526f f8875z;

    static {
        C0525e c0525e = new C0525e(0);
        c0525e.f8863A = true;
        f8862B = c0525e;
    }

    public C0525e(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        int iHighestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
        this.f8864o = objArr;
        this.f8865p = null;
        this.f8866q = iArr;
        this.f8867r = new int[iHighestOneBit];
        this.f8868s = 2;
        this.f8869t = 0;
        this.f8870u = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int b(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i7 = this.f8868s * 2;
            int length = this.f8867r.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f8867r;
                int i9 = iArr[iJ];
                if (i9 <= 0) {
                    int i10 = this.f8869t;
                    Object[] objArr = this.f8864o;
                    if (i10 < objArr.length) {
                        int i11 = i10 + 1;
                        this.f8869t = i11;
                        objArr[i10] = obj;
                        this.f8866q[i10] = iJ;
                        iArr[iJ] = i11;
                        this.f8872w++;
                        this.f8871v++;
                        if (i8 > this.f8868s) {
                            this.f8868s = i8;
                        }
                        return i10;
                    }
                    g(1);
                } else {
                    if (AbstractC1209k.a(this.f8864o[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i7) {
                        l(this.f8867r.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f8867r.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final void c() {
        if (this.f8863A) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f8869t - 1;
        if (i7 >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f8866q;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f8867r[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        AbstractC1267a.F(this.f8864o, 0, this.f8869t);
        Object[] objArr = this.f8865p;
        if (objArr != null) {
            AbstractC1267a.F(objArr, 0, this.f8869t);
        }
        this.f8872w = 0;
        this.f8869t = 0;
        this.f8871v++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z6) {
        int i7;
        Object[] objArr = this.f8865p;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f8869t;
            if (i8 >= i7) {
                break;
            }
            int[] iArr = this.f8866q;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f8864o;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z6) {
                    iArr[i9] = i10;
                    this.f8867r[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        AbstractC1267a.F(this.f8864o, i9, i7);
        if (objArr != null) {
            AbstractC1267a.F(objArr, i9, this.f8869t);
        }
        this.f8869t = i9;
    }

    public final boolean e(Collection collection) {
        AbstractC1209k.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0526f c0526f = this.f8875z;
        if (c0526f != null) {
            return c0526f;
        }
        C0526f c0526f2 = new C0526f(this, 0);
        this.f8875z = c0526f2;
        return c0526f2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f8872w == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        AbstractC1209k.f(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f8865p;
        AbstractC1209k.c(objArr);
        return AbstractC1209k.a(objArr[iH], entry.getValue());
    }

    public final void g(int i7) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f8864o;
        int length = objArr.length;
        int i8 = this.f8869t;
        int i9 = length - i8;
        int i10 = i8 - this.f8872w;
        if (i9 < i7 && i9 + i10 >= i7 && i10 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i11 = i8 + i7;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        if (i11 > objArr.length) {
            int length2 = objArr.length;
            int i12 = length2 + (length2 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i12);
            AbstractC1209k.e(objArrCopyOf2, "copyOf(...)");
            this.f8864o = objArrCopyOf2;
            Object[] objArr2 = this.f8865p;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i12);
                AbstractC1209k.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f8865p = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f8866q, i12);
            AbstractC1209k.e(iArrCopyOf, "copyOf(...)");
            this.f8866q = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i12 >= 1 ? i12 : 1) * 3);
            if (iHighestOneBit > this.f8867r.length) {
                l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f8865p;
        AbstractC1209k.c(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i7 = this.f8868s;
        while (true) {
            int i8 = this.f8867r[iJ];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (AbstractC1209k.a(this.f8864o[i9], obj)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f8867r.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0523c c0523c = new C0523c(this, 0);
        int i7 = 0;
        while (c0523c.hasNext()) {
            int i8 = c0523c.f2742o;
            C0525e c0525e = (C0525e) c0523c.f2745r;
            if (i8 >= c0525e.f8869t) {
                throw new NoSuchElementException();
            }
            c0523c.f2742o = i8 + 1;
            c0523c.f2743p = i8;
            Object obj = c0525e.f8864o[i8];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c0525e.f8865p;
            AbstractC1209k.c(objArr);
            Object obj2 = objArr[c0523c.f2743p];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0523c.f();
            i7 += iHashCode ^ iHashCode2;
        }
        return i7;
    }

    public final int i(Object obj) {
        int i7 = this.f8869t;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f8866q[i7] >= 0) {
                Object[] objArr = this.f8865p;
                AbstractC1209k.c(objArr);
                if (AbstractC1209k.a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8872w == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f8870u;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0526f c0526f = this.f8873x;
        if (c0526f != null) {
            return c0526f;
        }
        C0526f c0526f2 = new C0526f(this, 1);
        this.f8873x = c0526f2;
        return c0526f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f8866q[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r6) {
        /*
            r5 = this;
            int r0 = r5.f8871v
            int r0 = r0 + 1
            r5.f8871v = r0
            int r0 = r5.f8869t
            int r1 = r5.f8872w
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f8867r = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f8870u = r6
        L1c:
            int r6 = r5.f8869t
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f8864o
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f8868s
        L2c:
            int[] r3 = r5.f8867r
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f8866q
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C0525e.l(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[LOOP:0: B:43:0x0024->B:67:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f8864o
            java.lang.String r1 = "<this>"
            m5.AbstractC1209k.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f8865p
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f8866q
            r0 = r0[r12]
            int r1 = r11.f8868s
            int r1 = r1 * 2
            int[] r2 = r11.f8867r
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f8867r
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f8868s
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f8867r
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f8867r
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f8864o
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f8867r
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f8866q
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f8867r
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f8866q
            r0[r12] = r6
            int r12 = r11.f8872w
            int r12 = r12 + r6
            r11.f8872w = r12
            int r12 = r11.f8871v
            int r12 = r12 + 1
            r11.f8871v = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C0525e.m(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iB = b(obj);
        Object[] objArr = this.f8865p;
        if (objArr == null) {
            int length = this.f8864o.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f8865p = objArr;
        }
        if (iB >= 0) {
            objArr[iB] = obj2;
            return null;
        }
        int i7 = (-iB) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC1209k.f(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iB = b(entry.getKey());
            Object[] objArr = this.f8865p;
            if (objArr == null) {
                int length = this.f8864o.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f8865p = objArr;
            }
            if (iB >= 0) {
                objArr[iB] = entry.getValue();
            } else {
                int i7 = (-iB) - 1;
                if (!AbstractC1209k.a(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f8865p;
        AbstractC1209k.c(objArr);
        Object obj2 = objArr[iH];
        m(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8872w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f8872w * 3) + 2);
        sb.append("{");
        C0523c c0523c = new C0523c(this, 0);
        int i7 = 0;
        while (c0523c.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = c0523c.f2742o;
            C0525e c0525e = (C0525e) c0523c.f2745r;
            if (i8 >= c0525e.f8869t) {
                throw new NoSuchElementException();
            }
            c0523c.f2742o = i8 + 1;
            c0523c.f2743p = i8;
            Object obj = c0525e.f8864o[i8];
            if (obj == c0525e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c0525e.f8865p;
            AbstractC1209k.c(objArr);
            Object obj2 = objArr[c0523c.f2743p];
            if (obj2 == c0525e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0523c.f();
            i7++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C0527g c0527g = this.f8874y;
        if (c0527g != null) {
            return c0527g;
        }
        C0527g c0527g2 = new C0527g(0, this);
        this.f8874y = c0527g2;
        return c0527g2;
    }
}
