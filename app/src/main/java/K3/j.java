package k3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends z2.g implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f14041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14042u;

    @Override // k3.d
    public final int D() {
        d dVar = this.f14041t;
        dVar.getClass();
        return dVar.D();
    }

    @Override // k3.d
    public final int d(long j3) {
        d dVar = this.f14041t;
        dVar.getClass();
        return dVar.d(j3 - this.f14042u);
    }

    @Override // z2.g
    public final void f() {
        super.f();
        this.f14041t = null;
    }

    @Override // k3.d
    public final long j(int i7) {
        d dVar = this.f14041t;
        dVar.getClass();
        return dVar.j(i7) + this.f14042u;
    }

    @Override // k3.d
    public final List s(long j3) {
        d dVar = this.f14041t;
        dVar.getClass();
        return dVar.s(j3 - this.f14042u);
    }
}
