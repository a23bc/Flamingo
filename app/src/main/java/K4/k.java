package K4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f4052a;

    @Override // K4.x
    public final Object a(R4.a aVar) {
        x xVar = this.f4052a;
        if (xVar != null) {
            return xVar.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) {
        x xVar = this.f4052a;
        if (xVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        xVar.b(bVar, obj);
    }
}
