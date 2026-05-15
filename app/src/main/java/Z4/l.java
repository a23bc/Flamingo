package Z4;

import j5.AbstractC1109c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r5.C1423d;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends AbstractC1267a {
    public static List S(Object[] objArr) {
        AbstractC1209k.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC1209k.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean T(Object[] objArr, Object obj) {
        AbstractC1209k.f(objArr, "<this>");
        return l0(objArr, obj) >= 0;
    }

    public static void U(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        AbstractC1209k.f(bArr, "<this>");
        AbstractC1209k.f(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
    }

    public static void V(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        AbstractC1209k.f(iArr, "<this>");
        AbstractC1209k.f(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i7, i9 - i8);
    }

    public static void W(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        AbstractC1209k.f(objArr, "<this>");
        AbstractC1209k.f(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    public static void X(char[] cArr, char[] cArr2, int i7, int i8, int i9) {
        AbstractC1209k.f(cArr, "<this>");
        System.arraycopy(cArr, i8, cArr2, i7, i9 - i8);
    }

    public static void Y(long[] jArr, long[] jArr2, int i7, int i8, int i9) {
        AbstractC1209k.f(jArr, "<this>");
        AbstractC1209k.f(jArr2, "destination");
        System.arraycopy(jArr, i8, jArr2, i7, i9 - i8);
    }

    public static /* synthetic */ void Z(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = iArr.length;
        }
        V(i7, 0, i8, iArr, iArr2);
    }

    public static /* synthetic */ void a0(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        W(0, i7, i8, objArr, objArr2);
    }

    public static byte[] b0(byte[] bArr, int i7, int i8) {
        AbstractC1209k.f(bArr, "<this>");
        AbstractC1267a.q(i8, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        AbstractC1209k.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] c0(Object[] objArr, int i7, int i8) {
        AbstractC1209k.f(objArr, "<this>");
        AbstractC1267a.q(i8, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        AbstractC1209k.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void d0(Object[] objArr, int i7, int i8) {
        AbstractC1209k.f(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    public static void e0(long[] jArr, long j3) {
        int length = jArr.length;
        AbstractC1209k.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j3);
    }

    public static ArrayList g0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object h0(Object[] objArr) {
        AbstractC1209k.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object i0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static C1423d j0(int[] iArr) {
        return new C1423d(0, iArr.length - 1, 1);
    }

    public static int k0(long[] jArr) {
        AbstractC1209k.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int l0(Object[] objArr, Object obj) {
        AbstractC1209k.f(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static String m0(Object[] objArr, String str, b6.k kVar, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i7 & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i7 & 4) == 0 ? ")" : "";
        if ((i7 & 32) != 0) {
            kVar = null;
        }
        AbstractC1209k.f(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i8 = 0;
        for (Object obj : objArr) {
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC1109c.m(sb, obj, kVar);
        }
        sb.append((CharSequence) str3);
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static char n0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void o0(Object[] objArr, Comparator comparator, int i7, int i8) {
        AbstractC1209k.f(objArr, "<this>");
        AbstractC1209k.f(comparator, "comparator");
        Arrays.sort(objArr, i7, i8, comparator);
    }

    public static List p0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new j(objArr, false)) : I0.c.G(objArr[0]) : v.f8818o;
    }
}
