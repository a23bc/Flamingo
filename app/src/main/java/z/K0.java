package z;

import x.C1864m0;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements InterfaceC2058q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0 f20672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f20673b;

    public K0(P0 p02, M0 m02) {
        this.f20672a = p02;
        this.f20673b = m02;
    }

    @Override // z.InterfaceC2058q0
    public final float a(float f7) {
        P0 p02 = this.f20672a;
        boolean zBooleanValue = ((Boolean) p02.h.a()).booleanValue();
        if (Math.abs(f7) != 0.0f && !zBooleanValue) {
            throw new C1864m0("The fling animation was cancelled", 0);
        }
        return p02.d(p02.g(this.f20673b.a(p02.e(p02.h(f7)), 2)));
    }
}
