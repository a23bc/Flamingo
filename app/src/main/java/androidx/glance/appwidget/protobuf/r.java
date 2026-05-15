package androidx.glance.appwidget.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC0553a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, r> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected T unknownFields;

    public r() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = T.f9594f;
    }

    public static r c(Class cls) {
        r rVar = defaultInstanceMap.get(cls);
        if (rVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = (r) ((r) Z.d(cls)).b(6);
        if (rVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, rVar2);
        return rVar2;
    }

    public static Object d(Method method, AbstractC0553a abstractC0553a, Object... objArr) {
        try {
            return method.invoke(abstractC0553a, objArr);
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

    public static final boolean e(r rVar, boolean z6) {
        byte bByteValue = ((Byte) rVar.b(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        M m7 = M.f9581c;
        m7.getClass();
        boolean zB = m7.a(rVar.getClass()).b(rVar);
        if (z6) {
            rVar.b(2);
        }
        return zB;
    }

    public static void i(Class cls, r rVar) {
        rVar.g();
        defaultInstanceMap.put(cls, rVar);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0553a
    public final int a(P p7) {
        int iD;
        int iD2;
        if (f()) {
            if (p7 == null) {
                M m7 = M.f9581c;
                m7.getClass();
                iD2 = m7.a(getClass()).d(this);
            } else {
                iD2 = p7.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            throw new IllegalStateException(n1.c.s(iD2, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i7 & Integer.MAX_VALUE;
        }
        if (p7 == null) {
            M m8 = M.f9581c;
            m8.getClass();
            iD = m8.a(getClass()).d(this);
        } else {
            iD = p7.d(this);
        }
        j(iD);
        return iD;
    }

    public abstract Object b(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        M m7 = M.f9581c;
        m7.getClass();
        return m7.a(getClass()).i(this, (r) obj);
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final r h() {
        return (r) b(4);
    }

    public final int hashCode() {
        if (f()) {
            M m7 = M.f9581c;
            m7.getClass();
            return m7.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            M m8 = M.f9581c;
            m8.getClass();
            this.memoizedHashCode = m8.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final void j(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(n1.c.s(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = G.f9562a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        G.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
