package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0581d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0581d f9735c = new C0581d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9736a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9737b = new HashMap();

    public static void b(HashMap map, C0580c c0580c, EnumC0592o enumC0592o, Class cls) {
        EnumC0592o enumC0592o2 = (EnumC0592o) map.get(c0580c);
        if (enumC0592o2 == null || enumC0592o == enumC0592o2) {
            if (enumC0592o2 == null) {
                map.put(c0580c, enumC0592o);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0580c.f9734b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0592o2 + ", new value " + enumC0592o);
    }

    public final C0579b a(Class cls, Method[] methodArr) {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f9736a;
        if (superclass != null) {
            C0579b c0579bA = (C0579b) map2.get(superclass);
            if (c0579bA == null) {
                c0579bA = a(superclass, null);
            }
            map.putAll(c0579bA.f9732b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0579b c0579bA2 = (C0579b) map2.get(cls2);
            if (c0579bA2 == null) {
                c0579bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0579bA2.f9732b.entrySet()) {
                b(map, (C0580c) entry.getKey(), (EnumC0592o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            B b7 = (B) method.getAnnotation(B.class);
            if (b7 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC0597u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                EnumC0592o enumC0592oValue = b7.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0592o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0592oValue != EnumC0592o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0580c(i7, method), enumC0592oValue, cls);
                z6 = true;
            }
        }
        C0579b c0579b = new C0579b(map);
        map2.put(cls, c0579b);
        this.f9737b.put(cls, Boolean.valueOf(z6));
        return c0579b;
    }
}
