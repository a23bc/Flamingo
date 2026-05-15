package y1;

import C1.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.AbstractC1113a;

/* JADX INFO: renamed from: y1.f */
/* JADX INFO: loaded from: classes.dex */
public class C1997f extends AbstractC1113a {

    /* JADX INFO: renamed from: b */
    public static Class f20280b = null;

    /* JADX INFO: renamed from: c */
    public static Constructor f20281c = null;

    /* JADX INFO: renamed from: d */
    public static Method f20282d = null;

    /* JADX INFO: renamed from: e */
    public static Method f20283e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f20284f = false;

    public static boolean P(Object obj, String str, int i7, boolean z6) {
        Q();
        try {
        } catch (IllegalAccessException | InvocationTargetException e7) {
            e = e7;
        }
        try {
            return ((Boolean) f20282d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z6))).booleanValue();
        } catch (InvocationTargetException e8) {
            e = e8;
            throw new RuntimeException(e);
        }
    }

    public static void Q() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f20284f) {
            return;
        }
        f20284f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f20281c = constructor;
        f20280b = cls;
        f20282d = method2;
        f20283e = method;
    }

    @Override // k.AbstractC1113a
    public Typeface A(Context context, l[] lVarArr, int i7) {
        String str;
        if (lVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(F(lVarArr, i7).f961a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } catch (ErrnoException unused) {
                        }
                        File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            Typeface typefaceC = C(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceC;
                        } finally {
                        }
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }

    @Override // k.AbstractC1113a
    public Typeface z(Context context, x1.e eVar, Resources resources, int i7) {
        Q();
        try {
            Object objNewInstance = f20281c.newInstance(new Object[0]);
            for (x1.f fVar : eVar.f19895a) {
                File fileX = i6.g.x(context);
                if (fileX == null) {
                    return null;
                }
                try {
                    if (!i6.g.q(fileX, resources, fVar.f19901f)) {
                        return null;
                    }
                    if (!P(objNewInstance, fileX.getPath(), fVar.f19897b, fVar.f19898c)) {
                        return null;
                    }
                    fileX.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileX.delete();
                }
            }
            Q();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f20280b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f20283e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
