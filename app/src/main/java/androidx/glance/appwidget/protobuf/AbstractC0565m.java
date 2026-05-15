package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0565m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0564l f9645a = new C0564l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0564l f9646b;

    static {
        C0564l c0564l;
        M m7 = M.f9581c;
        try {
            c0564l = (C0564l) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c0564l = null;
        }
        f9646b = c0564l;
    }
}
