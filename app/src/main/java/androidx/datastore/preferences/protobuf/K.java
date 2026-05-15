package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f9398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f9399b;

    static {
        J j3;
        try {
            j3 = (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            j3 = null;
        }
        f9398a = j3;
        f9399b = new J();
    }
}
