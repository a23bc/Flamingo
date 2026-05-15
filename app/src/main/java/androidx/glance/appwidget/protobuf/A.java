package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class A implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F[] f9555a;

    @Override // androidx.glance.appwidget.protobuf.F
    public final O a(Class cls) {
        for (F f7 : this.f9555a) {
            if (f7.b(cls)) {
                return f7.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.glance.appwidget.protobuf.F
    public final boolean b(Class cls) {
        for (F f7 : this.f9555a) {
            if (f7.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
