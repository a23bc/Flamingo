package I;

import H.b0;
import H.e0;
import d5.EnumC0830a;
import z.EnumC2048l0;

/* JADX INFO: renamed from: I.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0217i implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0211c f3359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3360b;

    public C0217i(C0211c c0211c, boolean z6) {
        this.f3359a = c0211c;
        this.f3360b = z6;
    }

    @Override // H.b0
    public final int a() {
        C0211c c0211c = this.f3359a;
        return (int) (c0211c.l().f3412e == EnumC2048l0.f20894o ? c0211c.l().g() & 4294967295L : c0211c.l().g() >> 32);
    }

    @Override // H.b0
    public final float b() {
        return android.support.v4.media.session.b.n(this.f3359a);
    }

    @Override // H.b0
    public final Y0.b c() {
        boolean z6 = this.f3360b;
        C0211c c0211c = this.f3359a;
        return z6 ? new Y0.b(c0211c.m(), 1) : new Y0.b(1, c0211c.m());
    }

    @Override // H.b0
    public final Object d(int i7, e0 e0Var) {
        Object objT = K.t(this.f3359a, i7, e0Var);
        return objT == EnumC0830a.f11264o ? objT : Y4.o.f8736a;
    }

    @Override // H.b0
    public final int e() {
        C0211c c0211c = this.f3359a;
        return (-c0211c.l().f3413f) + c0211c.l().f3411d;
    }

    @Override // H.b0
    public final float f() {
        C0211c c0211c = this.f3359a;
        return O.a(c0211c.l(), c0211c.m());
    }
}
