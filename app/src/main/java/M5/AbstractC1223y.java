package m5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import n0.InterfaceC1227b;
import n5.InterfaceC1237a;
import n5.InterfaceC1238b;
import n5.InterfaceC1241e;

/* JADX INFO: renamed from: m5.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1223y {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof InterfaceC1237a) || (abstractCollection instanceof InterfaceC1238b)) {
            return abstractCollection;
        }
        e(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map b(Object obj) {
        if ((obj instanceof InterfaceC1237a) && !(obj instanceof InterfaceC1241e)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e7) {
            AbstractC1209k.k(e7, AbstractC1223y.class.getName());
            throw e7;
        }
    }

    public static void c(int i7, Object obj) {
        if (obj == null || d(i7, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i7);
        throw null;
    }

    public static boolean d(int i7, Object obj) {
        int arity;
        if (obj instanceof Y4.c) {
            if (obj instanceof InterfaceC1206h) {
                arity = ((InterfaceC1206h) obj).getArity();
            } else if (obj instanceof InterfaceC1180a) {
                arity = 0;
            } else if (obj instanceof InterfaceC1182c) {
                arity = 1;
            } else if (obj instanceof l5.e) {
                arity = 2;
            } else if (obj instanceof l5.f) {
                arity = 3;
            } else if (obj instanceof l5.g) {
                arity = 4;
            } else if (obj instanceof l5.h) {
                arity = 5;
            } else if (obj instanceof l5.i) {
                arity = 6;
            } else {
                boolean z6 = obj instanceof InterfaceC1227b;
                arity = z6 ? 7 : z6 ? 8 : z6 ? 9 : z6 ? 10 : z6 ? 11 : z6 ? 13 : z6 ? 14 : z6 ? 15 : z6 ? 16 : z6 ? 17 : z6 ? 18 : z6 ? 19 : z6 ? 20 : z6 ? 21 : -1;
            }
            if (arity == i7) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC1209k.k(classCastException, AbstractC1223y.class.getName());
        throw classCastException;
    }
}
