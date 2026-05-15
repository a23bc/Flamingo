package E4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: E4.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0119q {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1973o = 2;

    public static void c(int i7, Object[] objArr) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException(n1.c.s(i8, "at index "));
            }
        }
    }

    public static void d(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static Object e(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(n1.c.s(i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
    }

    public static boolean g(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static k0 i(Set set, D4.f fVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof k0)) {
                set.getClass();
                return new k0(set, fVar);
            }
            k0 k0Var = (k0) set;
            D4.f fVar2 = k0Var.f1957p;
            fVar2.getClass();
            return new k0(k0Var.f1956o, new D4.g(Arrays.asList(fVar2, fVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof k0)) {
            set2.getClass();
            return new l0(set2, fVar);
        }
        k0 k0Var2 = (k0) set2;
        D4.f fVar3 = k0Var2.f1957p;
        fVar3.getClass();
        return new l0((SortedSet) k0Var2.f1956o, new D4.g(Arrays.asList(fVar3, fVar)));
    }

    public static Object j(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int l(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static j0 m(M m7, M m8) {
        N5.d.q(m7, "set1");
        N5.d.q(m8, "set2");
        return new j0(m7, m8);
    }

    public static int n(int i7, int i8, int i9) {
        return (i7 & (~i9)) | (i8 & i9);
    }

    public static ArrayList o(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002d, code lost:
    
        if (r5 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002f, code lost:
    
        u(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0033, code lost:
    
        r13[r5] = n(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int p(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = s(r9)
            r1 = r0 & r11
            int r2 = t(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = M3.a.L(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = M3.a.L(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            u(r1, r9, r12)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = n(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.AbstractC0119q.p(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void q(List list, D4.f fVar, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }

    public static int r(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * (-862048943)), 15)) * 461845907);
    }

    public static int s(Object obj) {
        return r(obj == null ? 0 : obj.hashCode());
    }

    public static int t(int i7, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? ((short[]) obj)[i7] & 65535 : ((int[]) obj)[i7];
    }

    public static void u(int i7, int i8, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }

    public abstract Object f();

    public String toString() {
        switch (this.f1973o) {
            case 2:
                return f().toString();
            default:
                return super.toString();
        }
    }
}
