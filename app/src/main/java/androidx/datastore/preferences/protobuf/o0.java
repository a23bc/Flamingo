package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f9502a = Logger.getLogger(o0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f9503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f9504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f9505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f9506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f9507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f9508g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:69:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026a  */
    static {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f9503b.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int b(Class cls) {
        if (f9507f) {
            return f9505d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f9507f) {
            f9505d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0530c.a()) {
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
    public static boolean e(Class cls) {
        if (!AbstractC0530c.a()) {
            return false;
        }
        try {
            Class cls2 = f9504c;
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

    public static byte f(long j3, byte[] bArr) {
        return f9505d.d(f9508g + j3, bArr);
    }

    public static byte g(long j3, Object obj) {
        return (byte) ((f9505d.g((-4) & j3, obj) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    public static byte h(long j3, Object obj) {
        return (byte) ((f9505d.g((-4) & j3, obj) >>> ((int) ((j3 & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new k0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j3, byte b7) {
        f9505d.l(bArr, f9508g + j3, b7);
    }

    public static void k(Object obj, long j3, byte b7) {
        long j7 = (-4) & j3;
        int iG = f9505d.g(j7, obj);
        int i7 = ((~((int) j3)) & 3) << 3;
        m(((255 & b7) << i7) | (iG & (~(255 << i7))), j7, obj);
    }

    public static void l(Object obj, long j3, byte b7) {
        long j7 = (-4) & j3;
        int i7 = (((int) j3) & 3) << 3;
        m(((255 & b7) << i7) | (f9505d.g(j7, obj) & (~(255 << i7))), j7, obj);
    }

    public static void m(int i7, long j3, Object obj) {
        f9505d.o(i7, j3, obj);
    }

    public static void n(Object obj, long j3, long j7) {
        f9505d.p(obj, j3, j7);
    }

    public static void o(Object obj, long j3, Object obj2) {
        f9505d.q(obj, j3, obj2);
    }
}
