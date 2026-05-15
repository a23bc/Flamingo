package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class O implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0546t f9416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f9417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0540m f9418c;

    public O(g0 g0Var, C0540m c0540m, AbstractC0546t abstractC0546t) {
        this.f9417b = g0Var;
        c0540m.getClass();
        this.f9418c = c0540m;
        this.f9416a = abstractC0546t;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void a(Object obj) {
        this.f9417b.getClass();
        ((AbstractC0546t) obj).unknownFields.f9468e = false;
        this.f9418c.getClass();
        A0.e.G(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean b(Object obj) {
        this.f9418c.getClass();
        A0.e.G(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final Object c() {
        return ((r) this.f9416a.d(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void d(Object obj, F f7) {
        this.f9418c.getClass();
        A0.e.G(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final int e(AbstractC0546t abstractC0546t) {
        this.f9417b.getClass();
        return abstractC0546t.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final int f(AbstractC0528a abstractC0528a) {
        this.f9417b.getClass();
        f0 f0Var = ((AbstractC0546t) abstractC0528a).unknownFields;
        int i7 = f0Var.f9467d;
        if (i7 != -1) {
            return i7;
        }
        int iR = 0;
        for (int i8 = 0; i8 < f0Var.f9464a; i8++) {
            int i9 = f0Var.f9465b[i8] >>> 3;
            iR += C0537j.r(3, (C0533f) f0Var.f9466c[i8]) + C0537j.z(i9) + C0537j.y(2) + (C0537j.y(1) * 2);
        }
        f0Var.f9467d = iR;
        return iR;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean g(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2) {
        this.f9417b.getClass();
        return abstractC0546t.unknownFields.equals(abstractC0546t2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void h(Object obj, C0535h c0535h, C0539l c0539l) {
        this.f9417b.getClass();
        AbstractC0546t abstractC0546t = (AbstractC0546t) obj;
        if (abstractC0546t.unknownFields == f0.f9463f) {
            abstractC0546t.unknownFields = f0.b();
        }
        this.f9418c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void i(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2) {
        Y.x(this.f9417b, abstractC0546t, abstractC0546t2);
    }
}
