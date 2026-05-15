package androidx.lifecycle;

import Z4.C0508b;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f9714a = Z4.o.e0(Application.class, I.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f9715b = I0.c.G(I.class);

    public static final Constructor a(Class cls, List list) {
        AbstractC1209k.f(list, "signature");
        C0508b c0508bJ = AbstractC1209k.j(cls.getConstructors());
        while (c0508bJ.hasNext()) {
            Constructor constructor = (Constructor) c0508bJ.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC1209k.e(parameterTypes, "getParameterTypes(...)");
            List listP0 = Z4.l.p0(parameterTypes);
            if (list.equals(listP0)) {
                return constructor;
            }
            if (list.size() == listP0.size() && listP0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final Q b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (Q) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
