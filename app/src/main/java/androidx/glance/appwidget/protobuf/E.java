package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f9560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f9561b;

    static {
        D d4;
        M m7 = M.f9581c;
        try {
            d4 = (D) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d4 = null;
        }
        f9560a = d4;
        f9561b = new D();
    }
}
