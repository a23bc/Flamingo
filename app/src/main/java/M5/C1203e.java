package m5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1181b;
import l5.InterfaceC1182c;
import l5.InterfaceC1183d;
import n0.InterfaceC1227b;
import s5.InterfaceC1437b;
import u5.AbstractC1545g;

/* JADX INFO: renamed from: m5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1203e implements InterfaceC1437b, InterfaceC1202d {

    /* JADX INFO: renamed from: b */
    public static final Map f14425b;

    /* JADX INFO: renamed from: c */
    public static final HashMap f14426c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f14427d;

    /* JADX INFO: renamed from: a */
    public final Class f14428a;

    static {
        int i7 = 0;
        List listE0 = Z4.o.e0(InterfaceC1180a.class, InterfaceC1182c.class, l5.e.class, l5.f.class, l5.g.class, l5.h.class, l5.i.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1181b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1227b.class, InterfaceC1183d.class);
        ArrayList arrayList = new ArrayList(Z4.p.j0(listE0));
        for (Object obj : listE0) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                Z4.o.i0();
                throw null;
            }
            arrayList.add(new Y4.h((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f14425b = Z4.y.o0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC1209k.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC1209k.c(str);
            sb.append(AbstractC1545g.p0(str, '.', str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f14425b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f14426c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z4.y.k0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC1545g.p0(str2, '.', str2));
        }
        f14427d = linkedHashMap;
    }

    public C1203e(Class cls) {
        this.f14428a = cls;
    }

    @Override // m5.InterfaceC1202d
    public final Class a() {
        return this.f14428a;
    }

    public final String b() {
        String str;
        Class cls = this.f14428a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f14427d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC1545g.o0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC1545g.o0(simpleName, enclosingConstructor.getName() + '$');
        }
        int iW = AbstractC1545g.W(simpleName, '$', 0, 6);
        if (iW == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iW + 1, simpleName.length());
        AbstractC1209k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1203e) && AbstractC1113a.H(this).equals(AbstractC1113a.H((InterfaceC1437b) obj));
    }

    public final int hashCode() {
        return AbstractC1113a.H(this).hashCode();
    }

    public final String toString() {
        return this.f14428a.toString() + " (Kotlin reflection is not available)";
    }
}
