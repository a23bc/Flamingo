package y1;

import C1.l;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: y1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1999h extends C1997f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f20289g;
    public final Constructor h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f20290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f20291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f20292k;
    public final Method l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f20293m;

    public C1999h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodW;
        Method method2;
        Method method3;
        Method methodX;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodW = W(cls);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodX = X(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            methodW = null;
            method2 = null;
            method3 = null;
            methodX = null;
        }
        this.f20289g = cls;
        this.h = constructor;
        this.f20290i = methodW;
        this.f20291j = method2;
        this.f20292k = method3;
        this.l = method;
        this.f20293m = methodX;
    }

    public static Method W(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // y1.C1997f, k.AbstractC1113a
    public final Typeface A(Context context, l[] lVarArr, int i7) {
        Typeface typefaceT;
        boolean zBooleanValue;
        if (lVarArr.length >= 1) {
            if (this.f20290i != null) {
                HashMap map = new HashMap();
                for (l lVar : lVarArr) {
                    if (lVar.f965e == 0) {
                        Uri uri = lVar.f961a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, i6.g.y(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objV = V();
                if (objV != null) {
                    int length = lVarArr.length;
                    int i8 = 0;
                    boolean z6 = false;
                    while (i8 < length) {
                        l lVar2 = lVarArr[i8];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lVar2.f961a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f20291j.invoke(objV, byteBuffer, Integer.valueOf(lVar2.f962b), null, Integer.valueOf(lVar2.f963c), Integer.valueOf(lVar2.f964d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                R(objV);
                                return null;
                            }
                            z6 = true;
                        }
                        i8++;
                        z6 = z6;
                    }
                    if (!z6) {
                        R(objV);
                        return null;
                    }
                    if (U(objV) && (typefaceT = T(objV)) != null) {
                        return Typeface.create(typefaceT, i7);
                    }
                }
            } else {
                l lVarF = F(lVarArr, i7);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lVarF.f961a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lVarF.f963c).setItalic(lVarF.f964d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
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
        }
        return null;
    }

    @Override // k.AbstractC1113a
    public final Typeface D(Context context, Resources resources, int i7, String str, int i8) {
        if (this.f20290i == null) {
            return super.D(context, resources, i7, str, i8);
        }
        Object objV = V();
        if (objV != null) {
            if (!S(context, objV, str, 0, -1, -1, null)) {
                R(objV);
                return null;
            }
            if (U(objV)) {
                return T(objV);
            }
        }
        return null;
    }

    public final void R(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean S(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f20290i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface T(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20289g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20293m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean U(Object obj) {
        try {
            return ((Boolean) this.f20292k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object V() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method X(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // y1.C1997f, k.AbstractC1113a
    public final Typeface z(Context context, x1.e eVar, Resources resources, int i7) {
        if (this.f20290i == null) {
            return super.z(context, eVar, resources, i7);
        }
        Object objV = V();
        if (objV != null) {
            x1.f[] fVarArr = eVar.f19895a;
            int length = fVarArr.length;
            int i8 = 0;
            while (i8 < length) {
                x1.f fVar = fVarArr[i8];
                String str = fVar.f19896a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fVar.f19899d);
                Context context2 = context;
                if (!S(context2, objV, str, fVar.f19900e, fVar.f19897b, fVar.f19898c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    R(objV);
                    return null;
                }
                i8++;
                context = context2;
            }
            if (U(objV)) {
                return T(objV);
            }
        }
        return null;
    }
}
