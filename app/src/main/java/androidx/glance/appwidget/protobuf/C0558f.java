package androidx.glance.appwidget.protobuf;

import androidx.datastore.preferences.protobuf.C0531d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public class C0558f implements Iterable, Serializable {

    /* JADX INFO: renamed from: q */
    public static final C0558f f9617q = new C0558f(AbstractC0572u.f9657b);

    /* JADX INFO: renamed from: r */
    public static final C0556d f9618r;

    /* JADX INFO: renamed from: o */
    public int f9619o = 0;

    /* JADX INFO: renamed from: p */
    public final byte[] f9620p;

    static {
        f9618r = AbstractC0555c.a() ? new C0556d(1) : new C0556d(0);
    }

    public C0558f(byte[] bArr) {
        bArr.getClass();
        this.f9620p = bArr;
    }

    public static int b(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(Z1.l.o(i7, "Beginning index: ", " < 0"));
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException(Z1.l.p("Beginning index larger than ending index: ", i7, i8, ", "));
        }
        throw new IndexOutOfBoundsException(Z1.l.p("End index: ", i8, i9, " >= "));
    }

    public static C0558f c(byte[] bArr, int i7, int i8) {
        byte[] bArrCopyOfRange;
        b(i7, i7 + i8, bArr.length);
        switch (f9618r.f9614a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i8);
                break;
        }
        return new C0558f(bArrCopyOfRange);
    }

    public byte a(int i7) {
        return this.f9620p[i7];
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0558f) || size() != ((C0558f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0558f)) {
            return obj.equals(this);
        }
        C0558f c0558f = (C0558f) obj;
        int i7 = this.f9619o;
        int i8 = c0558f.f9619o;
        if (i7 != 0 && i8 != 0 && i7 != i8) {
            return false;
        }
        int size = size();
        if (size > c0558f.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0558f.size()) {
            StringBuilder sbV = n1.c.v(size, "Ran off end of other: 0, ", ", ");
            sbV.append(c0558f.size());
            throw new IllegalArgumentException(sbV.toString());
        }
        int iE = e() + size;
        int iE2 = e();
        int iE3 = c0558f.e();
        while (iE2 < iE) {
            if (this.f9620p[iE2] != c0558f.f9620p[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte g(int i7) {
        return this.f9620p[i7];
    }

    public final int hashCode() {
        int i7 = this.f9619o;
        if (i7 != 0) {
            return i7;
        }
        int size = size();
        int iE = e();
        int i8 = size;
        for (int i9 = iE; i9 < iE + size; i9++) {
            i8 = (i8 * 31) + this.f9620p[i9];
        }
        if (i8 == 0) {
            i8 = 1;
        }
        this.f9619o = i8;
        return i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0531d(this);
    }

    public int size() {
        return this.f9620p.length;
    }

    public final String toString() {
        C0558f c0557e;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = M3.a.M(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iB = b(0, 47, size());
            if (iB == 0) {
                c0557e = f9617q;
            } else {
                c0557e = new C0557e(this.f9620p, e(), iB);
            }
            sb.append(M3.a.M(c0557e));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return Z1.l.t(sb2, string, "\">");
    }
}
