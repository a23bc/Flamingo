package X;

import x0.C1892b;

/* JADX INFO: renamed from: X.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0485k0 implements l5.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0495p0 f8096o;

    @Override // l5.i
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        O0.C c7 = (O0.C) obj2;
        long j3 = ((C1892b) obj3).f19867a;
        C0495p0 c0495p0 = this.f8096o;
        long jB = c0495p0.b(c7, j3);
        long jB2 = c0495p0.b(c7, ((C1892b) obj4).f19867a);
        c0495p0.l(zBooleanValue);
        return Boolean.valueOf(c0495p0.o(jB, jB2, ((Boolean) obj5).booleanValue(), (F) obj6));
    }
}
