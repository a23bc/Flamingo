package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f9602a;

    /* JADX INFO: renamed from: b */
    public static final Class f9603b;

    /* JADX INFO: renamed from: c */
    public static final Y f9604c;

    /* JADX INFO: renamed from: d */
    public static final boolean f9605d;

    /* JADX INFO: renamed from: e */
    public static final boolean f9606e;

    /* JADX INFO: renamed from: f */
    public static final long f9607f;

    /* JADX INFO: renamed from: g */
    public static final boolean f9608g;

    static {
        Unsafe unsafeI = i();
        f9602a = unsafeI;
        f9603b = AbstractC0555c.f9611a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        Y x6 = null;
        if (unsafeI != null) {
            if (!AbstractC0555c.a()) {
                x6 = new X(unsafeI);
            } else if (zH) {
                x6 = new W(unsafeI, 1);
            } else if (zH2) {
                x6 = new W(unsafeI, 0);
            }
        }
        f9604c = x6;
        f9605d = x6 == null ? false : x6.r();
        f9606e = x6 == null ? false : x6.q();
        f9607f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && x6 != null) {
            x6.i(fieldG);
        }
        f9608g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(Z.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j3, Object obj) {
        return ((byte) ((f9604c.f((-4) & j3, obj) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j3, Object obj) {
        return ((byte) ((f9604c.f((-4) & j3, obj) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f9602a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int e(Class cls) {
        if (f9606e) {
            return f9604c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f9606e) {
            f9604c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0555c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Class cls) {
        if (!AbstractC0555c.a()) {
            return false;
        }
        try {
            Class cls2 = f9603b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new V());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j3, byte b7) {
        f9604c.k(bArr, f9607f + j3, b7);
    }

    public static void k(Object obj, long j3, byte b7) {
        long j7 = (-4) & j3;
        int iF = f9604c.f(j7, obj);
        int i7 = ((~((int) j3)) & 3) << 3;
        m(((255 & b7) << i7) | (iF & (~(255 << i7))), j7, obj);
    }

    public static void l(Object obj, long j3, byte b7) {
        long j7 = (-4) & j3;
        int i7 = (((int) j3) & 3) << 3;
        m(((255 & b7) << i7) | (f9604c.f(j7, obj) & (~(255 << i7))), j7, obj);
    }

    public static void m(int i7, long j3, Object obj) {
        f9604c.n(i7, j3, obj);
    }

    public static void n(Object obj, long j3, long j7) {
        f9604c.o(obj, j3, j7);
    }

    public static void o(Object obj, long j3, Object obj2) {
        f9604c.p(obj, j3, obj2);
    }
}
