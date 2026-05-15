package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0577z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0576y f9670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0576y f9671b;

    static {
        C0576y c0576y;
        M m7 = M.f9581c;
        try {
            c0576y = (C0576y) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c0576y = null;
        }
        f9670a = c0576y;
        f9671b = new C0576y();
    }
}
