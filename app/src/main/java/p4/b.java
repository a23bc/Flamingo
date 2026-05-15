package P4;

import a.AbstractC0509a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0509a {

    /* JADX INFO: renamed from: u */
    public final Method f5759u = Class.class.getMethod("isRecord", new Class[0]);

    /* JADX INFO: renamed from: v */
    public final Method f5760v;

    /* JADX INFO: renamed from: w */
    public final Method f5761w;

    /* JADX INFO: renamed from: x */
    public final Method f5762x;

    public b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f5760v = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f5761w = componentType.getMethod("getName", new Class[0]);
        this.f5762x = componentType.getMethod("getType", new Class[0]);
    }

    @Override // a.AbstractC0509a
    public final String[] G(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f5760v.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                strArr[i7] = (String) this.f5761w.invoke(objArr[i7], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // a.AbstractC0509a
    public final boolean K(Class cls) {
        try {
            return ((Boolean) this.f5759u.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // a.AbstractC0509a
    public final Method v(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // a.AbstractC0509a
    public final Constructor y(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f5760v.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                clsArr[i7] = (Class) this.f5762x.invoke(objArr[i7], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }
}
