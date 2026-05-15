package H;

import f0.C0879c;
import f0.C0912t;
import j5.AbstractC1110d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.d f2879p;

    public /* synthetic */ h0(n0.d dVar, int i7, int i8) {
        this.f2878o = i8;
        this.f2879p = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f2878o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                E.e(this.f2879p, c0912t, C0879c.B(7));
                break;
            case 1:
                j0.k.j(this.f2879p, c0912t, C0879c.B(7));
                break;
            default:
                AbstractC1110d.n(this.f2879p, c0912t, C0879c.B(7));
                break;
        }
        return Y4.o.f8736a;
    }
}
