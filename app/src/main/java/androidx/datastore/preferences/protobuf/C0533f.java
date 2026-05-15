package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public class C0533f implements Iterable, Serializable {

    /* JADX INFO: renamed from: q */
    public static final C0533f f9459q = new C0533f(AbstractC0548v.f9522b);

    /* JADX INFO: renamed from: r */
    public static final C0532e f9460r;

    /* JADX INFO: renamed from: o */
    public int f9461o = 0;

    /* JADX INFO: renamed from: p */
    public final byte[] f9462p;

    static {
        f9460r = AbstractC0530c.a() ? new C0532e(1) : new C0532e(0);
    }

    public C0533f(byte[] bArr) {
        bArr.getClass();
        this.f9462p = bArr;
    }

    public static C0533f a(byte[] bArr, int i7, int i8) {
        byte[] bArrCopyOfRange;
        int i9 = i7 + i8;
        int length = bArr.length;
        if (((i9 - i7) | i7 | i9 | (length - i9)) < 0) {
            if (i7 < 0) {
                throw new IndexOutOfBoundsException(Z1.l.o(i7, "Beginning index: ", " < 0"));
            }
            if (i9 < i7) {
                throw new IndexOutOfBoundsException(Z1.l.p("Beginning index larger than ending index: ", i7, i9, ", "));
            }
            throw new IndexOutOfBoundsException(Z1.l.p("End index: ", i9, length, " >= "));
        }
        switch (f9460r.f9456a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i8);
                break;
        }
        return new C0533f(bArrCopyOfRange);
    }

    public int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0533f) || size() != ((C0533f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0533f)) {
            return obj.equals(this);
        }
        C0533f c0533f = (C0533f) obj;
        int i7 = this.f9461o;
        int i8 = c0533f.f9461o;
        if (i7 != 0 && i8 != 0 && i7 != i8) {
            return false;
        }
        int size = size();
        if (size > c0533f.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0533f.size()) {
            StringBuilder sbV = n1.c.v(size, "Ran off end of other: 0, ", ", ");
            sbV.append(c0533f.size());
            throw new IllegalArgumentException(sbV.toString());
        }
        int iB = b() + size;
        int iB2 = b();
        int iB3 = c0533f.b();
        while (iB2 < iB) {
            if (this.f9462p[iB2] != c0533f.f9462p[iB3]) {
                return false;
            }
            iB2++;
            iB3++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f9461o;
        if (i7 != 0) {
            return i7;
        }
        int size = size();
        int iB = b();
        int i8 = size;
        for (int i9 = iB; i9 < iB + size; i9++) {
            i8 = (i8 * 31) + this.f9462p[i9];
        }
        if (i8 == 0) {
            i8 = 1;
        }
        this.f9461o = i8;
        return i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0531d(this);
    }

    public int size() {
        return this.f9462p.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
