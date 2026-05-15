package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f9498a;

    public n0(Unsafe unsafe) {
        this.f9498a = unsafe;
    }

    public final int a(Class cls) {
        return this.f9498a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f9498a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j3, Object obj);

    public abstract byte d(long j3, Object obj);

    public abstract double e(long j3, Object obj);

    public abstract float f(long j3, Object obj);

    public final int g(long j3, Object obj) {
        return this.f9498a.getInt(obj, j3);
    }

    public final long h(long j3, Object obj) {
        return this.f9498a.getLong(obj, j3);
    }

    public final Object i(long j3, Object obj) {
        return this.f9498a.getObject(obj, j3);
    }

    public final long j(Field field) {
        return this.f9498a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j3, boolean z6);

    public abstract void l(Object obj, long j3, byte b7);

    public abstract void m(Object obj, long j3, double d4);

    public abstract void n(Object obj, long j3, float f7);

    public final void o(int i7, long j3, Object obj) {
        this.f9498a.putInt(obj, j3, i7);
    }

    public final void p(Object obj, long j3, long j7) {
        this.f9498a.putLong(obj, j3, j7);
    }

    public final void q(Object obj, long j3, Object obj2) {
        this.f9498a.putObject(obj, j3, obj2);
    }
}
