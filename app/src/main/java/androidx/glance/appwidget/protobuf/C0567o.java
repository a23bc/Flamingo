package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0567o implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0567o f9652b = new C0567o(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9653a;

    public /* synthetic */ C0567o(int i7) {
        this.f9653a = i7;
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final O a(Class cls) {
        switch (this.f9653a) {
            case 0:
                if (!r.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (O) r.c(cls.asSubclass(r.class)).b(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final boolean b(Class cls) {
        switch (this.f9653a) {
            case 0:
                return r.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
