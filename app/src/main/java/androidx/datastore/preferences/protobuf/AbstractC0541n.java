package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0541n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0540m f9496a = new C0540m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0540m f9497b;

    static {
        C0540m c0540m;
        try {
            c0540m = (C0540m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c0540m = null;
        }
        f9497b = c0540m;
    }
}
