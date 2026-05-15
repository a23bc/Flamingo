package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class E implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L[] f9389a;

    @Override // androidx.datastore.preferences.protobuf.L
    public final W a(Class cls) {
        for (L l : this.f9389a) {
            if (l.b(cls)) {
                return l.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(Class cls) {
        for (L l : this.f9389a) {
            if (l.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
