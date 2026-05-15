package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0555c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f9611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f9612b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9611a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f9612b = cls2 != null;
    }

    public static boolean a() {
        return (f9611a == null || f9612b) ? false : true;
    }
}
