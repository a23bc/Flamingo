package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0544q implements L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0544q f9515b = new C0544q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9516a;

    public /* synthetic */ C0544q(int i7) {
        this.f9516a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final W a(Class cls) {
        switch (this.f9516a) {
            case 0:
                if (!AbstractC0546t.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (W) AbstractC0546t.e(cls.asSubclass(AbstractC0546t.class)).d(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(Class cls) {
        switch (this.f9516a) {
            case 0:
                return AbstractC0546t.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
