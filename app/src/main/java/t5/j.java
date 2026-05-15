package t5;

import Z4.v;
import j5.AbstractC1109c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r1.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends k {
    public static InterfaceC1524h G(Iterator it) {
        AbstractC1209k.f(it, "<this>");
        return new C1517a(new Z4.m(2, it));
    }

    public static InterfaceC1524h H(Object obj, InterfaceC1182c interfaceC1182c) {
        return obj == null ? C1520d.f17093a : new C1523g(new x(1, obj), interfaceC1182c);
    }

    public static String I(InterfaceC1524h interfaceC1524h, String str) {
        AbstractC1209k.f(interfaceC1524h, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i7 = 0;
        for (Object obj : interfaceC1524h) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC1109c.m(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static List J(InterfaceC1524h interfaceC1524h) {
        Iterator it = interfaceC1524h.iterator();
        if (!it.hasNext()) {
            return v.f8818o;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return I0.c.G(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
