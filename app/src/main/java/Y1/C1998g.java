package y1;

import C1.l;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import k.AbstractC1113a;
import t.T;

/* JADX INFO: renamed from: y1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1998g extends AbstractC1113a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f20285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f20286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f20287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f20288e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f20286c = constructor;
        f20285b = cls;
        f20287d = method2;
        f20288e = method;
    }

    public static boolean P(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z6) {
        try {
            return ((Boolean) f20287d.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface Q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f20285b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f20288e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // k.AbstractC1113a
    public final Typeface A(Context context, l[] lVarArr, int i7) {
        Object objNewInstance;
        int i8 = 0;
        try {
            objNewInstance = f20286c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            T t7 = new T(0);
            int length = lVarArr.length;
            while (true) {
                if (i8 >= length) {
                    Typeface typefaceQ = Q(objNewInstance);
                    if (typefaceQ != null) {
                        return Typeface.create(typefaceQ, i7);
                    }
                } else {
                    l lVar = lVarArr[i8];
                    Uri uri = lVar.f961a;
                    ByteBuffer byteBufferY = (ByteBuffer) t7.get(uri);
                    if (byteBufferY == null) {
                        byteBufferY = i6.g.y(context, uri);
                        t7.put(uri, byteBufferY);
                    }
                    if (byteBufferY == null) {
                        break;
                    }
                    if (!P(objNewInstance, byteBufferY, lVar.f962b, lVar.f963c, lVar.f964d)) {
                        break;
                    }
                    i8++;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068 A[SYNTHETIC] */
    @Override // k.AbstractC1113a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface z(android.content.Context r17, x1.e r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor r2 = y1.C1998g.f20286c     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            goto L68
        Lf:
            r3 = r18
            x1.f[] r3 = r3.f19895a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f19901f
            java.io.File r7 = i6.g.x(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L59
        L25:
            r8 = r19
            boolean r0 = i6.g.q(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            goto L68
        L5c:
            int r7 = r6.f19897b
            boolean r9 = r6.f19898c
            int r6 = r6.f19900e
            boolean r0 = P(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
        L68:
            return r1
        L69:
            int r5 = r5 + 1
            goto L15
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = Q(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C1998g.z(android.content.Context, x1.e, android.content.res.Resources, int):android.graphics.Typeface");
    }
}
