package g5;

import java.lang.reflect.Method;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0992a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f12534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f12535b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        AbstractC1209k.c(methods);
        int length = methods.length;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            method = null;
            if (i8 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i8];
            if (AbstractC1209k.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC1209k.e(parameterTypes, "getParameterTypes(...)");
                if (AbstractC1209k.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i8++;
        }
        f12534a = method2;
        int length2 = methods.length;
        while (true) {
            if (i7 >= length2) {
                break;
            }
            Method method3 = methods[i7];
            if (AbstractC1209k.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i7++;
        }
        f12535b = method;
    }
}
