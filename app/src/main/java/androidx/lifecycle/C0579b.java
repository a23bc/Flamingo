package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0579b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9731a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9732b;

    public C0579b(HashMap map) {
        this.f9732b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0592o enumC0592o = (EnumC0592o) entry.getValue();
            List arrayList = (List) this.f9731a.get(enumC0592o);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f9731a.put(enumC0592o, arrayList);
            }
            arrayList.add((C0580c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o, InterfaceC0596t interfaceC0596t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0580c c0580c = (C0580c) list.get(size);
                c0580c.getClass();
                try {
                    int i7 = c0580c.f9733a;
                    Method method = c0580c.f9734b;
                    if (i7 == 0) {
                        method.invoke(interfaceC0596t, new Object[0]);
                    } else if (i7 == 1) {
                        method.invoke(interfaceC0596t, interfaceC0597u);
                    } else if (i7 == 2) {
                        method.invoke(interfaceC0596t, interfaceC0597u, enumC0592o);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
