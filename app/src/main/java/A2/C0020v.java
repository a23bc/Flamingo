package A2;

import w3.r1;

/* JADX INFO: renamed from: A2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0020v implements w2.g, w2.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t2.J f457p;

    public /* synthetic */ C0020v(t2.J j3, int i7) {
        this.f456o = i7;
        this.f457p = j3;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f456o) {
            case 0:
                v3.R(this.f457p);
                break;
            default:
                v3.q(this.f457p);
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        ((r1) obj).f0(this.f457p);
    }
}
