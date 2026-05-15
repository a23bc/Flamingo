package Y1;

import A2.W;
import java.lang.reflect.InvocationTargetException;
import t.T;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f8613b = new T(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f8614a;

    public n(q qVar) {
        this.f8614a = qVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        T t7 = f8613b;
        T t8 = (T) t7.get(classLoader);
        if (t8 == null) {
            t8 = new T(0);
            t7.put(classLoader, t8);
        }
        Class cls = (Class) t8.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        t8.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new W(Z1.l.q("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e8) {
            throw new W(Z1.l.q("Unable to instantiate fragment ", str, ": make sure class name exists"), e8);
        }
    }

    public final void a(String str) {
        try {
            if (c(this.f8614a.f8639r.f8597o.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e7) {
            throw new W(Z1.l.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e8) {
            throw new W(Z1.l.q("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (NoSuchMethodException e9) {
            throw new W(Z1.l.q("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e9);
        } catch (InvocationTargetException e10) {
            throw new W(Z1.l.q("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
        }
    }
}
