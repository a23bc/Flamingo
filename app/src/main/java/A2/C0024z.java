package A2;

import t2.C1485n;

/* JADX INFO: renamed from: A2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0024z implements w2.h, w2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f476p;

    public /* synthetic */ C0024z(N n7, int i7) {
        this.f475o = i7;
        this.f476p = n7;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f475o) {
            case 1:
                v3.q(this.f476p.f103O);
                break;
            default:
                v3.d(this.f476p.f101M);
                break;
        }
    }

    @Override // w2.h
    public void d(Object obj, C1485n c1485n) {
        N n7 = this.f476p;
        n7.getClass();
        ((t2.V) obj).t(n7.f122g, new t2.U(c1485n));
    }
}
