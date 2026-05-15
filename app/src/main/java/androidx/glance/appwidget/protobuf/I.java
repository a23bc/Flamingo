package androidx.glance.appwidget.protobuf;

import androidx.datastore.preferences.protobuf.C0535h;

/* JADX INFO: loaded from: classes.dex */
public final class I implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f9577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0564l f9578c;

    public I(U u7, C0564l c0564l, r rVar) {
        this.f9577b = u7;
        c0564l.getClass();
        this.f9578c = c0564l;
        this.f9576a = rVar;
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final void a(Object obj) {
        this.f9577b.getClass();
        T t7 = ((r) obj).unknownFields;
        if (t7.f9599e) {
            t7.f9599e = false;
        }
        this.f9578c.getClass();
        A0.e.G(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final boolean b(Object obj) {
        this.f9578c.getClass();
        A0.e.G(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final r c() {
        r rVar = this.f9576a;
        return rVar instanceof r ? rVar.h() : ((AbstractC0568p) rVar.b(5)).b();
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final int d(r rVar) {
        this.f9577b.getClass();
        T t7 = rVar.unknownFields;
        int i7 = t7.f9598d;
        if (i7 != -1) {
            return i7;
        }
        int iG0 = 0;
        for (int i8 = 0; i8 < t7.f9595a; i8++) {
            int i9 = t7.f9596b[i8] >>> 3;
            iG0 += C0561i.g0(3, (C0558f) t7.f9597c[i8]) + C0561i.j0(i9) + C0561i.i0(2) + (C0561i.i0(1) * 2);
        }
        t7.f9598d = iG0;
        return iG0;
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final void e(Object obj, Object obj2) {
        Q.k(this.f9577b, obj, obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final void f(Object obj, C0535h c0535h, C0563k c0563k) {
        this.f9577b.getClass();
        U.a(obj);
        this.f9578c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final void g(Object obj, B b7) {
        this.f9578c.getClass();
        A0.e.G(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final int h(r rVar) {
        this.f9577b.getClass();
        return rVar.unknownFields.hashCode();
    }

    @Override // androidx.glance.appwidget.protobuf.P
    public final boolean i(r rVar, r rVar2) {
        this.f9577b.getClass();
        return rVar.unknownFields.equals(rVar2.unknownFields);
    }
}
