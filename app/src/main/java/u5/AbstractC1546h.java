package u5;

import Z4.o;
import Z4.p;
import j5.AbstractC1109c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: u5.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1546h extends AbstractC1109c {
    public static String C(String str) {
        int length;
        Comparable comparable;
        AbstractC1209k.f(str, "<this>");
        List listJ = t5.j.J(AbstractC1545g.c0(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!AbstractC1545g.Z((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.j0(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!j0.k.y(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listJ.size();
        int iD0 = o.d0(listJ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listJ) {
            int i7 = length + 1;
            if (length < 0) {
                o.i0();
                throw null;
            }
            String str3 = (String) obj2;
            String strP = ((length == 0 || length == iD0) && AbstractC1545g.Z(str3)) ? null : AbstractC1545g.P(iIntValue, str3);
            if (strP != null) {
                arrayList3.add(strP);
            }
            length = i7;
        }
        StringBuilder sb = new StringBuilder(length3);
        Z4.n.v0(arrayList3, sb, null, 124);
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static String D(String str) {
        AbstractC1209k.f(str, "<this>");
        if (AbstractC1545g.Z("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listJ = t5.j.J(AbstractC1545g.c0(str));
        int length = str.length();
        listJ.size();
        int iD0 = o.d0(listJ);
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ.iterator();
        int i7 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                Z4.n.v0(arrayList, sb, null, 124);
                String string = sb.toString();
                AbstractC1209k.e(string, "toString(...)");
                return string;
            }
            Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                o.i0();
                throw null;
            }
            String str2 = (String) next;
            if ((i7 != 0 && i7 != iD0) || !AbstractC1545g.Z(str2)) {
                int length2 = str2.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!j0.k.y(str2.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
                if (i9 != -1 && AbstractC1552n.J(str2, "|", i9, false)) {
                    strSubstring = str2.substring("|".length() + i9);
                    AbstractC1209k.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i7 = i8;
        }
    }
}
