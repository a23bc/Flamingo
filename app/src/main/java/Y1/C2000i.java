package y1;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: y1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2000i extends C1999h {
    @Override // y1.C1999h
    public final Typeface T(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20289g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20293m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // y1.C1999h
    public final Method X(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
