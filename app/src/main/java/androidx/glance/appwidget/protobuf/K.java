package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f9579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f9580b;

    static {
        J j3;
        M m7 = M.f9581c;
        try {
            j3 = (J) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            j3 = null;
        }
        f9579a = j3;
        f9580b = new J();
    }
}
