package m5;

/* JADX INFO: renamed from: m5.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1221w {

    /* JADX INFO: renamed from: a */
    public static final C1222x f14440a;

    static {
        C1222x c1222x = null;
        try {
            c1222x = (C1222x) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1222x == null) {
            c1222x = new C1222x();
        }
        f14440a = c1222x;
    }

    public static C1203e a(Class cls) {
        f14440a.getClass();
        return new C1203e(cls);
    }

    public static void b(C1211m c1211m) {
        f14440a.getClass();
    }
}
