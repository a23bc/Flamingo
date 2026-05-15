package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0546t extends AbstractC0528a {
    private static Map<Object, AbstractC0546t> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected f0 unknownFields;

    public AbstractC0546t() {
        this.memoizedHashCode = 0;
        this.unknownFields = f0.f9463f;
        this.memoizedSerializedSize = -1;
    }

    public static AbstractC0546t e(Class cls) {
        AbstractC0546t abstractC0546t = defaultInstanceMap.get(cls);
        if (abstractC0546t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0546t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0546t != null) {
            return abstractC0546t;
        }
        AbstractC0546t abstractC0546t2 = (AbstractC0546t) ((AbstractC0546t) o0.a(cls)).d(6);
        if (abstractC0546t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0546t2);
        return abstractC0546t2;
    }

    public static Object f(Method method, AbstractC0528a abstractC0528a, Object... objArr) {
        try {
            return method.invoke(abstractC0528a, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void h(Class cls, AbstractC0546t abstractC0546t) {
        defaultInstanceMap.put(cls, abstractC0546t);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0528a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            U u7 = U.f9421c;
            u7.getClass();
            this.memoizedSerializedSize = u7.a(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0528a
    public final void c(C0537j c0537j) {
        U u7 = U.f9421c;
        u7.getClass();
        X xA = u7.a(getClass());
        F f7 = c0537j.f9486c;
        if (f7 == null) {
            f7 = new F(c0537j);
        }
        xA.d(this, f7);
    }

    public abstract Object d(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0546t) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        U u7 = U.f9421c;
        u7.getClass();
        return u7.a(getClass()).g(this, (AbstractC0546t) obj);
    }

    public final boolean g() {
        byte bByteValue = ((Byte) d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        U u7 = U.f9421c;
        u7.getClass();
        boolean zB = u7.a(getClass()).b(this);
        d(2);
        return zB;
    }

    public final int hashCode() {
        int i7 = this.memoizedHashCode;
        if (i7 != 0) {
            return i7;
        }
        U u7 = U.f9421c;
        u7.getClass();
        int iE = u7.a(getClass()).e(this);
        this.memoizedHashCode = iE;
        return iE;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        M.k(this, sb, 0);
        return sb.toString();
    }
}
