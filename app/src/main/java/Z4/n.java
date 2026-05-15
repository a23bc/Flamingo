package Z4;

import D.h0;
import R0.C0409u;
import j5.AbstractC1109c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import p5.AbstractC1298a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends t {
    public static ArrayList A0(List list, Object obj) {
        AbstractC1209k.f(list, "<this>");
        ArrayList arrayList = new ArrayList(p.j0(list));
        boolean z6 = false;
        for (Object obj2 : list) {
            boolean z7 = true;
            if (!z6 && AbstractC1209k.a(obj2, obj)) {
                z6 = true;
                z7 = false;
            }
            if (z7) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList B0(Collection collection, Iterable iterable) {
        AbstractC1209k.f(collection, "<this>");
        AbstractC1209k.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            t.l0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList C0(Collection collection, Object obj) {
        AbstractC1209k.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object D0(Collection collection) {
        AbstractC1298a abstractC1298a = p5.d.f15102o;
        AbstractC1209k.f(collection, "<this>");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Collection collection2 = collection;
        int iC = p5.d.f15102o.c(collection.size());
        boolean z6 = collection2 instanceof List;
        if (z6) {
            return ((List) collection2).get(iC);
        }
        C0409u c0409u = new C0409u(iC, 2);
        if (z6) {
            List list = (List) collection2;
            if (iC >= 0 && iC < list.size()) {
                return list.get(iC);
            }
            c0409u.b(Integer.valueOf(iC));
            throw null;
        }
        if (iC < 0) {
            c0409u.b(Integer.valueOf(iC));
            throw null;
        }
        int i7 = 0;
        for (Object obj : collection2) {
            int i8 = i7 + 1;
            if (iC == i7) {
                return obj;
            }
            i7 = i8;
        }
        c0409u.b(Integer.valueOf(iC));
        throw null;
    }

    public static List E0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return K0(iterable);
        }
        List listM0 = M0(iterable);
        Collections.reverse(listM0);
        return listM0;
    }

    public static Object F0(List list) {
        AbstractC1209k.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List G0(List list, Comparator comparator) {
        AbstractC1209k.f(list, "<this>");
        if (list.size() <= 1) {
            return K0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        AbstractC1209k.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return l.S(array);
    }

    public static List H0(int i7, List list) {
        AbstractC1209k.f(list, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(Z1.l.o(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return v.f8818o;
        }
        if (i7 >= list.size()) {
            return K0(list);
        }
        if (i7 == 1) {
            return I0.c.G(p0(list));
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i7) {
                break;
            }
        }
        return o.g0(arrayList);
    }

    public static final void I0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC1209k.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] J0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List K0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return o.g0(M0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return v.f8818o;
        }
        if (size != 1) {
            return L0(collection);
        }
        return I0.c.G(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList L0(Collection collection) {
        AbstractC1209k.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List M0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return L0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        I0(iterable, arrayList);
        return arrayList;
    }

    public static Set N0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        I0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set O0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        boolean z6 = iterable instanceof Collection;
        x xVar = x.f8820o;
        if (z6) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(y.k0(collection.size()));
                    I0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                AbstractC1209k.e(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            I0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                AbstractC1209k.e(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return xVar;
    }

    public static m m0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        return new m(1, iterable);
    }

    public static boolean n0(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC1209k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i7 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i7 < 0) {
                    o.i0();
                    throw null;
                }
                if (AbstractC1209k.a(obj, next)) {
                    iIndexOf = i7;
                    break;
                }
                i7++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List o0(List list) {
        AbstractC1209k.f(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return v.f8818o;
        }
        if (size == 1) {
            return I0.c.G(x0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i7 = 1; i7 < size2; i7++) {
                arrayList.add(list.get(i7));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object p0(Iterable iterable) {
        AbstractC1209k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object q0(List list) {
        AbstractC1209k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object r0(List list) {
        AbstractC1209k.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object s0(int i7, List list) {
        AbstractC1209k.f(list, "<this>");
        if (i7 < 0 || i7 >= list.size()) {
            return null;
        }
        return list.get(i7);
    }

    public static Set t0(List list, Iterable iterable) {
        AbstractC1209k.f(list, "<this>");
        AbstractC1209k.f(iterable, "other");
        Set setN0 = N0(list);
        setN0.retainAll(iterable instanceof Collection ? (Collection) iterable : K0(iterable));
        return setN0;
    }

    public static final void u0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC1182c interfaceC1182c) {
        AbstractC1209k.f(iterable, "<this>");
        sb.append(charSequence2);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                sb.append(charSequence);
            }
            AbstractC1109c.m(sb, obj, interfaceC1182c);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void v0(List list, StringBuilder sb, h0 h0Var, int i7) {
        if ((i7 & 64) != 0) {
            h0Var = null;
        }
        u0(list, sb, "\n", "", "", "...", h0Var);
    }

    public static String w0(Iterable iterable, String str, String str2, String str3, InterfaceC1182c interfaceC1182c, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 2) != 0 ? "" : str2;
        String str6 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            interfaceC1182c = null;
        }
        AbstractC1209k.f(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        u0(iterable, sb, str4, str5, str6, "...", interfaceC1182c);
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static Object x0(List list) {
        AbstractC1209k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(o.d0(list));
    }

    public static Object y0(List list) {
        AbstractC1209k.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable z0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
