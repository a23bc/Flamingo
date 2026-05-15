package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class X extends Y {
    @Override // androidx.glance.appwidget.protobuf.Y
    public final boolean c(long j3, Object obj) {
        return this.f9601a.getBoolean(obj, j3);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final double d(long j3, Object obj) {
        return this.f9601a.getDouble(obj, j3);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final float e(long j3, Object obj) {
        return this.f9601a.getFloat(obj, j3);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void j(Object obj, long j3, boolean z6) {
        this.f9601a.putBoolean(obj, j3, z6);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void k(Object obj, long j3, byte b7) {
        this.f9601a.putByte(obj, j3, b7);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void l(Object obj, long j3, double d4) {
        this.f9601a.putDouble(obj, j3, d4);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final void m(Object obj, long j3, float f7) {
        this.f9601a.putFloat(obj, j3, f7);
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f9601a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Z.a(th);
            return false;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.Y
    public final boolean r() {
        Unsafe unsafe = this.f9601a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (Z.g() != null) {
                    try {
                        Class<?> cls3 = this.f9601a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        Z.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                Z.a(th2);
            }
        }
        return false;
    }
}
