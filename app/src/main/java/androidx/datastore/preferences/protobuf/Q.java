package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f9419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f9420b;

    static {
        P p7;
        try {
            p7 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            p7 = null;
        }
        f9419a = p7;
        f9420b = new P();
    }
}
